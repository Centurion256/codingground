Program ArrayMax;
const n=20;
type
intarray = array [1..n] of integer;
var
i,max: integer;
A:array [1..n] of integer;

Procedure Forming(AR:intarray);
var i: integer;
begin
randomize;
    //forming
    for i:= 1 to n do
    begin
        A[i]:= round(random()*1000);
    end;
end;

Procedure Search(AR:intarray);
var i,max: integer;
begin
//search for max
    max:=A[1];
    for
    i:= 1 to n do
    begin
        if  
        A[i] > max then
        max:= A[i]
    end;
end;

Procedure Output(AR:intarray);
var i,max: integer;
begin
     //output
    for
    i:= 1 to n do
    begin
        writeln (A[i] : 5);
    end;
    writeln ('max = ', max);
end;

Begin


Forming(A);

Search(A);

Output(A);

End.

