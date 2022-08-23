#include <stdio.h>
void bubble_sort(int[],int);
int main(){
    int a[30],n,i;
    printf("\nEnter no of elements: ");
    scanf("%d",&n);
    printf("\nEnter array Elements: ");
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    bubble_sort(a,n);
    printf("\nSorted Array is: ");
    for ( i = 0; i < n; i++)
    {
        printf("%d",a[i]);
        putchar(' ');
    }
}
void bubble_sort(int a[],int n){
    int i,j,temp,flag;
    flag=1;
    for ( i = 1; i < n && flag==1; i++)
    {
        flag=0;
    for(j=0; j<n-i;j++){
        if(a[j]>a[j+1]){
            flag=1;
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
}}}}