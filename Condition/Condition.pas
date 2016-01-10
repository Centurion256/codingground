Program Condition;
var
a,b: integer;
begin
    Writeln('Введіть 1e число');
    read(a);
    Writeln('Введіть 2e число');
    read(b);
    
    if a>b then writeln(a)
    else
        if a<b then writeln(b)
        else writeln('Числа рівні')
    
end.