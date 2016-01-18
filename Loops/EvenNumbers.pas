Program EvenNumbers;
var
    i,k,S : Integer;
    
begin
    writeln('Вкажіть значення k');
    read(k);
    S:=0;
    
    for i:= 1 to k/2 do
        {S:= S+i;
        i:= i*2;}
        writeln('Hello World ',i*2);
end.
