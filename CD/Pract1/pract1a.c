#include<stdio.h>
#include<string.h>
int main(){
    char keyword[]="Hello World";
    int c_count=0;
    int word_count=1;
    for(int i=0;i<strlen(keyword);i++){
        if(keyword[i]!=' '){
            c_count++;
        }
        else{
        word_count++;
    }
    }
    
    printf("Total Number of character in String: %d \n",c_count);
    printf("Total Number of word in String: %d \n",word_count);
} 