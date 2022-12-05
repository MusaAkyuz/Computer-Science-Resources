#include <sys/sem.h>
#include <errno.h>
#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/ipc.h>
#include <sys/shm.h>
#include <sys/msg.h>
int main(int argc, char *argv[])
{
    key_t myKey;
    int msqID,shmID,semID ;

    myKey = ftok("/home/mus/.bashrc", 51);
    if(myKey == -1) {
      printf("ftok failed with errno = %d\n", errno);
      return -1;
    }
	printf("IPC_key:%x\n",myKey);
	msqID=msgget(myKey, 0744 | IPC_CREAT);
	shmID=shmget(myKey, 25,0444 | IPC_CREAT);
    	semID = semget(myKey, 1, 0766 | IPC_CREAT);
	printf("msqID : %d, shmID : %d, semId : %d", msqID, shmID, semID);
        if(semID == -1) {
           printf("semget failed with errno = %d\n", errno);
           return -1;
        }

return 0;
}
