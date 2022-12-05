#include <sys/types.h>
#include <sys/ipc.h>
#include <sys/shm.h>
#include <sys/stat.h>
#include <sys/sem.h>
#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>
#include <stdio.h>
#include <stdlib.h>
#define SHM_SIZE 1024
int main(int argc, char **argv) {
        key_t key;
        pid_t pid;
        int shmid, mode, i;
        char *veri;
        if((key=ftok(".",'R'))==-1){
                perror("ftok");
                exit(1);
        }
        if((shmid=shmget(key,SHM_SIZE, 0644|IPC_CREAT))==-1){
                perror("shmget");
                exit(1);
        }
        printf("PID=%d\n --shmid=%d\n\n",getpid(),shmid);
	veri=shmat(shmid,(void*)0,0);
	printf("Semgment içeriği:%s\n",veri);
        return 0;
}

