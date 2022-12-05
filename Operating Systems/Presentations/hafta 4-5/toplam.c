#include <sys/types.h>
#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <time.h>
struct data{
	int ilk,son;
};
int sum=0;
void *toplam(void* x){
	int i;
	struct data *d=x;
	int ilk;
	ilk=d->ilk;
	int son;
	son=d->son;
	//printf("%d, %d", ilk, son);
	for(i=ilk;i<son;i++){
		sum+=i;
	}
}
int main(int argc, char** argv){
	int i,rc;
	pthread_t *tid;
	int n=atoi(argv[1]);
	tid=(pthread_t*)malloc(sizeof(pthread_t)*n);
	int N=atoi(argv[2]);
	struct data D;
	if(argc!=3){
		printf("Hatali kullanim: ./topla arg1 arg2\n");
		exit(1);
	}
	for(i=0;i<n;i++){
		D.ilk=i*(N/n);
		D.son=(i+1)*(N/n);
		//printf("%d, %d", D.ilk, D.son);
		rc=pthread_create(&tid[i],NULL,toplam,&D);
		if(rc){
			printf("Haata..:%d\n",rc);
		} 
	}
		
	for(i=0;i<n;i++){
		pthread_join(tid[i],NULL);
	}
	printf("Toplam=%d \n",sum);
	
}


