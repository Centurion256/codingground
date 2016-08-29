Unit ArrayTools;
interface
const n=20;
type
  intarray = array [1..n] of integer;

Function ArrayMax(AR:intarray): integer;

Procedure SearchForMax(AR:intarray; var maxx: integer);

Procedure Swap(var a,b:integer);

Procedure Forming(var AR:intarray);

Procedure Output(AR:intarray);

Procedure BubbleSort(var AR:intarray);


implementation

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


Procedure Swap(var a,b:integer);
var temp:integer;
begin
  temp:= a;
  a:= b;
  b:= temp;

end;

Procedure Forming(var AR:intarray);
var i:integer;
begin
    randomize;
    //forming
    for i:= 1 to n do
    begin
        AR[i]:= round(random()*1000);
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
            if AR[i]>AR[i+1] then
            begin
                Swap(AR[i],AR[i+1]);
            end;
        end;    
    end;
end;

end.
