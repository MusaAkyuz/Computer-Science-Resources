#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <sys/types.h>
#include <unistd.h>
#include <semaphore.h>

pthread_mutex_t anahtar;
sem_t *sem;
sem_init(sem);
int a=10;
void *arttir(void *n){
	//sem_wait(sem);
	pthread_mutex_lock(&anahtar);
	a=a+1; //kritik bölge
	printf("Th1:a=%d\n",a);
	pthread_mutex_unlock(&anahtar);
	//sem_post(sem);
}
void *azalt(void *n){
	//sem_wait(sem);
	pthread_mutex_lock(&anahtar);
	a=a-1;
	printf("Th2:a=%d\n",a);
	pthread_mutex_unlock(&anahtar);
	//sem_post(sem);
}
int main(){
        int i;
        pthread_t  tid1[5],tid2[5];
        for(i=0;i<5;i++){
                pthread_create(&tid1[i],NULL,arttir,NULL);
		pthread_create(&tid2[i],NULL,azalt,NULL);
		//sleep(2);
        }
        for(i=0;i<5;i++){
                pthread_join(tid1[i],NULL);
		pthread_join(tid2[i],NULL);
        }
        return 0;

}

