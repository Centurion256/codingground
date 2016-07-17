Program ArrayMax;
const n=20;
var
i,k,max,temp: integer;
A:array [1..n] of integer;

begin
    randomize;
    //forming
    for i:= 1 to n do
    begin
        A[i]:= round(random()*1000);
    end;
    //output
    for
    i:= 1 to n do
    begin
        write (A[i] : 5);
    end;
    writeln;
    
    //bubble Sort
    for k:= 1 to n-1 do
    begin
        for i:= 1 to n-k do
        begin
            if A[i]>A[i+1] then
            begin
                temp:=A[i];
                A[i]:=A[i+1];
                A[i+1]:=temp;
            end;
        end;    
    end;
    
    //output-2
    for
    i:= 1 to n do
    begin
        write (A[i] : 5);
    end;
    writeln;
end.
