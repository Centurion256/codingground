Program ArrayMax;
const n=20;
var
i,max: integer;
A:array [1..n] of integer;

begin
    randomize;
    //forming
    for i:= 1 to n do
    begin
        A[i]:= round(random()*1000);
    end;
    //search for max
    max:=A[1];
    for
    i:= 1 to n do
    begin
        if  
        A[i] > max then
        max:= A[i]
    end;
    //output
    for
    i:= 1 to n do
    begin
        writeln (A[i] : 5);
    end;
    writeln ('max = ', max);
end.

