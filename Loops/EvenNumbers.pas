Program EvenNumbers;
var
    i : Integer;
    k : Integer;
    
begin
    writeln('Вкажіть значення k');
    read(k);
   

    for i:= 1 to k div 2 do
        writeln(i*2);
end.
