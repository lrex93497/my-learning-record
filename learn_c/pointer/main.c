#include <stdio.h>
#include <stdlib.h>

int main()
{
    int age = 30;
    int *page = &age;
   /* double gpa = 3.4;
    double *pgpa = &gpa;
    char grade = 'A';
    char *pgrade = &gpa; */
    printf("%p \n", &age); //hex
    printf("%d", &age); //dec

    return 0;
}
