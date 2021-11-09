#include <stdio.h>
#include <stdlib.h>

int main()
{
    char grade = 'A';

    switch(grade){
        case 'A'  :
        printf("why not S? \n");
        break;

        case 'B'  :
        printf("why not A? \n");
        break;

        case 'C'  :
        printf("why not B? \n");
        break;

        case 'D'  :
        printf("why not C? \n");
        break;

        case 'F'  :
        printf("it is bad \n");
        break;

        default :
        printf("no such grade");

    }
    return 0;
}
