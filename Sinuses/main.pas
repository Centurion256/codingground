Program Sinuses;
var
x,Alpha: real;
begin
  writeln('Вкажіть значення числа Альфа');
  read(Alpha);
  x:=(Alpha*Pi())/180;
  writeln('Sin(Alpha)=',sin(x):0:3);
end.
