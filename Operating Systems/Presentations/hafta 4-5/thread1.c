#include <sys/types.h>
#include <unistd.h>
#include <stdio.h>
#include <pthread.h>
#include <time.h>
int toplam=0;
void *iplik(void *I, void *n){
	int i;
	int *N=(int*)n;
	int *x=(int*)I;
	for(i=*x;i<*N;i++)
		toplam+=i;
	
}
int main(){
	int i;
	pthread_t  tid[4];
	int x,y;
	for(i=0;i<4;i++){
		x=i*10;
		y=i*10+10;
		pthread_create(&tid[i],NULL,&iplik,&x);
		
	}
	
	for(i=0;i<4;i++){
		pthread_join(&tid[i],NULL);
	}
	
	for(i=0;i<4;i++){
		pthread_exit(&tid[i]);
	}
	printf("Toplam=%f\n",toplam);
	return 0;

}
