#include <stdio.h>
#include <stdlib.h>

int main()
{
    int TheStuffTheyType;

    double b;


    int const abcd = 5; //int const, this number cannot be change then.
    printf("type something INT \n");
    scanf("%d", &TheStuffTheyType);
    printf("you typed %d\n", TheStuffTheyType);

    printf("type something double \n");
    scanf("%lf", &b);
    printf("you typed %f \n", b);

    char d[20];

    printf("type something character \n");
    scanf("%s", &d);
    printf("you typed %s \n", d);

    return 0;
}
