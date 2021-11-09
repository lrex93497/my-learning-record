#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("Hello world!\n");

    sayHi ("Hi", 999);

    sayHi ("Hi2", 9992);
    sayHi ("Hi3", 9993);    // each call one time, 3 times 

    return 0;

}


void sayHi(char abcd[], int num)
{
    printf("%s %d \n", abcd, num);
}
