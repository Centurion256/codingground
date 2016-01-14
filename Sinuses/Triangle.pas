Program Sinuses;
var
x,Alpha,a,b,S: real;
begin
  writeln('Вкажіть значення числа Альфа');
  read(Alpha);
  writeln('Вкажіть значення сторони a');
  read(a);
  writeln('Вкажіть значення сторони b');
  read(b);
  x:=(Alpha*Pi())/180;
  writeln('Sin(Alpha)=',sin(x):0:3);
  S:=(a*b*sin(x))/2;
  writeln('SΔ=',S :0:3);
end.
