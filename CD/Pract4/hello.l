%{
    #include <stdio.h>
%}
%%
"hi" {
    printf("Bye");
    }
.* {
    printf ("Wrong Input");
    }
%%
main()
{
    printf("Enter Input");
    yylex();
}
yywrap()
{

}