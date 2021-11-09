#include <stdio.h>
#include <stdlib.h>

int main()
{
  int ind = 1;
  do {
        printf("%d\n", ind);

        ind = ind + 1; //or ind++

  }while(ind <= 5);

  return 0;

}
