Program PreWhile;
var
    i : Integer;
    k : Integer;
    S : Integer;
    
begin
    i:= 2;
    S:= 0;
    writeln('Вкажіть значення k');
    read(k);
    
    while i<=k do
        begin
            S:= S + i;
            i:= i + 2
        end;
    writeln(S);
end.
