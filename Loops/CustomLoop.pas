Program CustomLoop;
var
    i,k,S : Integer;
    
begin
    writeln('Вкажіть значення k');
    read(k);
    S:=0;
    
    for i:= 1 to k do
        S:= S+i;
        writeln(S);
end.
