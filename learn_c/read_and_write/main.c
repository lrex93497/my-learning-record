#include <stdio.h>
#include <stdlib.h>
int main()
{
    char c;
    FILE *in_file  = fopen("test.txt", "r");  // read
    FILE *out_file = fopen("test.txt", "w");  // write

    if (out_file == NULL || in_file == NULL){

        printf("No file\n");
        exit(-1);
    }

    fprintf(out_file, "test \n%d", 123);
    fclose(out_file);

    if (in_file) {
        while ((c = getc(in_file)) != EOF)  //EOF is negative number
            putchar(c);
        fclose(in_file);

    }
}
