#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>
#include <pthread.h>

void *iplik(int *n){
	printf("Thread_ID=%d \t Process_ID:%d\n",n,getpid());	
}
int main(){
	int i;
	pthread_t  tid[8];
	for(i=0;i<8;i++){
		pthread_create(&tid[i],NULL,iplik,(void*)i);
		//sleep(5);
	}
//	for(i=0;i<8;i++){
//		pthread_join(tid[i],NULL);
//	}
	return 0;

}



