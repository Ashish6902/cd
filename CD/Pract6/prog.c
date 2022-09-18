#include <stdio.h>
#include <string.h>
void E();
void T();
void F();
void Tds();
void Eds();
char input[100];
int i, error = 0;

void main() {
  printf("Please Enter the Input: \n");
  scanf("%s", input);
  E();
  if (i == strlen(input) && error == 0) {
    printf("\nString is Accepted");
  } else {
    printf("\nRejected");
  }
}
void E() {
  T();
  Eds();
}
void T() {
  F();
  Tds();
}
void Eds() {
  if (input[i] == '+') {
    i++;
    T();
    Eds();
  }
}
void Tds() {
  if (input[i] == '*') {
    i++;
    F();
    Tds();
  }
}
void F() {
  if (input[i] == 'a') {
    i++;
  } else if (input[i] == '(') {
    i++;
    E();
    if (input[i] == ')') {
      i++;
    } else {
      error = 1;
    }
  } else {
    error = 1;
  }
}