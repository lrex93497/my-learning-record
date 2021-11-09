#include <stdio.h>
#include <stdlib.h>

struct sdata{
    char name[50];
    char major[50];
    int age;
    double gpa;

};


int main()
{  struct sdata s1;
    s1.age = 11;
    s1.gpa = 0.32;
    strcpy( s1.name, "XEI");
    strcpy( s1.major, "none");


    struct sdata s2;
    s2.age = 13;
    s2.gpa = 0.22;
    strcpy( s2.name, "XEI2");
    strcpy( s2.major, "none2");

    printf("%s", s2.name);


    return 0;
}
