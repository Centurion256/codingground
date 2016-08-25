Program ArrayMax;
const n=20;
type
  intarray = array [1..n] of integer;
var
i,k,max,temp: integer;
A: intarray;

Procedure Swap(var a,b:integer);
var temp:integer;
begin
  temp:= a;
  a:= b;
  b:= temp;

end;

Procedure Forming(AR:intarray);
var i:integer;
begin
    randomize;
    //forming
    for i:= 1 to n do
    begin
        A[i]:= round(random()*1000);
    end;
end;

Procedure Output(AR:intarray);
var i:integer;
begin
    //output
    for i:= 1 to n do
    begin
        write (AR[i] : 5);
    end;
    writeln;
end;

Procedure BubbleSort(var AR:intarray);
var i,k,temp:integer;
begin
     //bubble Sort
    for k:= 1 to n-1 do
    begin
        for i:= 1 to n-k do
        begin
            if A[i]>A[i+1] then
            begin
                Swap(AR[i],AR[i+1]);
            end;
        end;    
    end;
end;




Begin
    
    Forming(A);

    Output(A);
    
    BubbleSort(A);
       
    Output(A);
    
End.
