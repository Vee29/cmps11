// --------------------------------
// Ben Sherriff
// bsherrif
// lab 8
// GCD program written in c
// --------------------------------

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<ctype.h>

int main(){
    int i, n;
    int x[2];
    char str[100];

    for(i=0; i<2; i++){
        if(i == 0){printf("Enter a positive integer: ");}
      if(i == 1){printf("Enter another positive integer: ");}
      n = scanf(" %s", str);
        while(1){
            while(!isInteger(str)){
                printf("Please enter a positive integer: ");
                n = scanf(" %s", str);
            }
            sscanf(str, "%d", &x[i]);
            if( x[i]>0 ){
                break;
            }
            printf("Please enter a positive integer: ");
            n = scanf(" %s", str);
        }
    }
    printf("The GCD of %d and %d is %d\n", x[0], x[1], calcGCD(x[0], x[1]));
    return 0;
}

int calcGCD(int num1, int num2){
  int q, r, a = num1, b = num2;
  if(b > a){
    int temp;
    temp = a;
    a = b;
    b = temp;
  }
  do{
      q = a / b;
    r  = a % b;
    a = b;
    b = r;
  }while(r > 0);
  return a;
}

int isInteger(char s[]){
    int i, n;
    if(s==NULL)
        return 0;
    n = strlen(s);
    if(n==0)
        return 0;
    if(s[0]!='-' && s[0]!='+' && !isdigit(s[0]))
        return 0;
    for(i=1; i<n; i++){
        if(!isdigit(s[i]))
            return 0;
    }
    return 1;
}
