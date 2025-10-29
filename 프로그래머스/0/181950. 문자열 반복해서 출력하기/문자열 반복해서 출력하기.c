#include <stdio.h>
#define LEN_INPUT 11

int main(void) {
    char s1[LEN_INPUT];
    int a;
    scanf("%s %d", s1, &a);
    int s1_lne = strlen(s1);
    for (int i = 0; i < a; i++)
    {    
        for(int j = 0; j < s1_lne; j++)
            putchar(s1[j]);
    }    
    return 0;
}