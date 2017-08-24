#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

int main(int argc, char *argv[]){
  int i, pid = 1;

  for(i = 1; i <= 3; i++)
    if(pid != 0)
      pid = fork();
  
  for(i = 1; i <= 3; i++)
    wait(0);

  printf("pid = %d\n", pid);
  return 0;
}