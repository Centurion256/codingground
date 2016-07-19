Program HelloWorld(output);
const n=10;
var
i,max,j,minmax,k: integer;
A:array [1..n,1..n] of integer; 
B:array [1..n] of integer;

begin
    randomize;

 { writeln('Hello, world!');}
    //forming
    for i:= 1 to n do
    begin
        for j:= 1 to n do
        begin
            A[i,j]:= round(random()*1000);
        end;
    end;
    
    //output
    for i:= 1 to n do
    begin
        for j:= 1 to n do
        begin
            write(A[i,j] : 5);
        end;    
        writeln
    end;
    
    //search for max
    max:=A[1,1];
    for i:=1 to n do
    begin
     for k:= 1 to n do
     max:=A[1,1];
     B[k]:=max;
        for j:= 1 to n do
        begin
             if  
             A[i,j] > max then
             max:= A[i,j]
        end;
    
        //output-2    
        writeln('max value of ',i,' column = ',max);
    end;
    
    //Forming-2/Search for minmax
    minmax:=1000;
    for k:= 1 to n do
    begin
        if
        B[k] < minmax then
        minmax:= B[k]
    end;
    
    //output-3
    writeln('minimal maximum value = ',minmax);
end.