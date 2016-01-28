Program AfterWhile;
var
    i : Integer;
    k : Integer;
    S : Integer;
    
begin
    i:= 2;
    S:= 0;
    writeln('Вкажіть значення k');
    read(k);
    
    repeat
        begin
            S:= S + i;
            i:= i + 2;
        end;
    until i > k;
    writeln(S);
end.
