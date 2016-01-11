Program ConditionAdvanced;
var
a,b,c: integer;
begin
  writeln('Введіть 1ше число');
  read(a);
  writeln('Введіть 2ге число');
  read(b);
  writeln('Введіть 3тє число');
  read(c);
  
  if a>b then 
    if a>c then writeln(a)
    else writeln(c)
  else
    if b>c then writeln(b)
    else writeln(c)
end.
