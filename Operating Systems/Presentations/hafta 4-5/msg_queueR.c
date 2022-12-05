#include<sys/msg.h>
#include<sys/wait.h>
#include<sys/errno.h>
#include <stdio.h>
#include <stdlib.h>
extern int errno;       // error NO.
#define MSGPERM 0666    // msg queue permission
#define MSGTXTLEN 128   // msg text length
int msgqid, rc;
int done;
struct msg_buf {
  long mtype;
  char mtext[MSGTXTLEN];
} msg;
int main(int argc,char **argv)
{
  key_t key;
  key=ftok("msg_queue.c", 42);

  msgqid = msgget(key, MSGPERM|IPC_CREAT);
  printf("message queue %d created\n",msgqid);
	printf("System IPC's\n");
	system("ipcs");
  msg.mtype = 1; 
  rc = msgrcv(msgqid, &msg, sizeof(msg.mtext), 0, 0); 
    printf("received msg: %s\n", msg.mtext);
 // rc=msgctl(msgqid,IPC_RMID,NULL);
    printf("message queue %d is gone\n",msgqid);

  return 0;
}
