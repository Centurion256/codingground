Program UArrayBubbleSortProcedures;
uses ArrayTools;
//const n=20;
//type
 // intarray = array [1..n] of integer;
var
max: integer;
A: intarray;

Begin
    
    Forming(A);

    Output(A);
    
    SearchForMax(A,max);
    
    //max:=ArrayMax(A);
    
    BubbleSort(A);
       
    Output(A);
    
    writeln ('max = ', max);
    
End.
