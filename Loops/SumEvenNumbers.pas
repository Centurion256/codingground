Program SumEvenNumbers;
var
    i : Integer;
    k : Integer;
    S : Integer;
    
begin
    S:= 0;
    writeln('Вкажіть значення k');
    read(k);
    
    for i:= 1 to k div 2 do
        S:= S + i*2;
    writeln(S);
end.
