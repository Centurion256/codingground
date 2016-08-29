Program ArrayMaxProcedures;
const n=20;
type
intarray = array [1..n] of integer;
var
i,max: integer;
A:array [1..n] of integer;

Procedure Forming(var AR:intarray);
var i: integer;
begin
randomize;
    //forming
    for i:= 1 to n do
    begin
        AR[i]:= round(random()*1000);
    end;
end;

Procedure SearchForMax(AR:intarray; var maxx: integer);
var i: integer;
begin
//search for max
    maxx:=AR[1];
    for
    i:= 1 to n do
    begin
        if  
        AR[i] > maxx then
        maxx:= AR[i]
    end;
end;

Function ArrayMax(AR:intarray): integer;
var i,maxx: integer;
begin
//search for max
    maxx:=AR[1];
    for
    i:= 1 to n do
    begin
        if  
        AR[i] > maxx then
        maxx:= AR[i]
    end;
    ArrayMax:= maxx;
end;

Procedure Output(AR:intarray);
var i: integer;
begin
     //output
    for
    i:= 1 to n do
    begin
        writeln (A[i] : 5);
    end;
    
end;

Begin


Forming(A);

//SearchForMax(A,max);
max:=ArrayMax(A);

Output(A);

writeln ('max = ', max);

End.


