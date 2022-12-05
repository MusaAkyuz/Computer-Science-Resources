#include <stdio.h>   
#include <stdlib.h>
#include <pthread.h>
#include <semaphore.h>  
#include <unistd.h>
 void *reader() ;  //okuyucu gorev
 void *writer () ; //yazıcı görev  
 sem_t wsem,mutex ; // semaforlar  
 int readcount=0 ;
 int KB=0;  //kritik bölge
 int main(int argc, char** argv)  
 {  
  	int a=0,b=0;  
  	system("clear");  
  	sem_init(&wsem,0,1) ;  
  	sem_init(&mutex,0,1) ;  
  	pthread_t r,w,r1,w1 ;  
	for(a=0;a<10;a++){
  		pthread_create(&r,NULL,reader,NULL);  
     	  	pthread_create(&w,NULL,writer,NULL);  
    	}
  	for(a=0;a<10;a++){
		pthread_join(r,NULL);  
  		pthread_join(w,NULL);  
	}
	return 0;  
 }  
 void *reader()  
 {    
     	sleep(1);  
   	sem_wait(&wsem) ;  
	readcount++ ;
 	/*Critcal Section */  
  	printf("\n\nReader okuyor\n ");  
  	sleep(1) ;  
	printf("\n%d - Reader: -->%d\n", readcount, KB); 	
	KB=0; 	/* critical section completd */  
	 readcount-- ;
        sem_post(&wsem) ;  

 }  
 void * writer()  
 {  	  
 	sleep(1);  
  	sem_wait(&wsem) ;  
  	printf("\nWriter yazıyor\n") ;  
  	sleep(1);  
	++KB;
  	printf("\nWriter:-->KB D:%d \n",KB);  
  	sem_post(&wsem) ;  
 }
