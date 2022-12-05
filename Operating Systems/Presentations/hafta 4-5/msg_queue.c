#include<string.h>
#include<time.h>
#include<sys/ipc.h>
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

  msgqid = msgget(key, MSGPERM|IPC_CREAT|IPC_EXCL);
  printf("message queue %d created\n",msgqid);
	printf("System IPC's\n");
	system("ipcs");
  msg.mtype = 1; 
//	msg.text="Deneme";
  sprintf (msg.mtext, "%s\n", "Deneme mesaji....."); 
  rc = msgsnd(msgqid, &msg, sizeof(msg.mtext), 0); 

  return 0;
}
