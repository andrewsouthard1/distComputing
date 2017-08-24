#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

int main(int argc, char *argv[]){
  int pid;

  // fork another process
  pid = fork();
  //parent will wait for child
  wait(0);
  if(pid != 0)
    printf("I am the parent\n");
  else
    printf("I am the child\n");
  return 0;
}
