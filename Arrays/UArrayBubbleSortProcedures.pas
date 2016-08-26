Program ArrayMax;
uses ArrayTools;
const n=20;
type
  intarray = array [1..n] of integer;
var
i,k,max,temp: integer;
A: intarray;

Begin
    
    Forming(A);

    Output(A);
    
    BubbleSort(A);
       
    Output(A);
    
End.
