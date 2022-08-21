#include<stdio.h>
#include<string.h>
#include<conio.h>
int main()
{
    char keyword[20];
    printf("Enter comments: ");
    scanf("%c",&keyword);
    int len=strlen(keyword);
    if(keyword[0]=='/'){
        if(keyword[1]=='/'){
        }
    printf("Given String is single line comment type");
    }
    for(int i=0; i<strlen(keyword);i++){
        if(keyword[0]=='/' && keyword[1]=='*' && keyword[3]=='*' && keyword[4]=='/')
        {
            printf("It is a multiline comment type");        
        }
    }    
    return 0;
}