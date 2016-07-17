Program HelloWorld(output);
const n=20;
var
i,max: integer;
A:array [1..n] of integer;

begin
    randomize;
    
    for
    i:= 1 to n do
    begin
        A[i]:= round(random()*1000);
        if  
        A[i] > max then
        max:= A[i]
    end;
    
    for
    i:= 1 to n do
    begin
        write (A[i] : 5);
    writeln; 
        write (max);
    end;
end.
