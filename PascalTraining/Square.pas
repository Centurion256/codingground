Program Square;
var
a,b,c,p,S: real;
begin

  writeln('Введіть 1шу сторону');
  read(a);
  writeln('Введіть 2гу сторону');
  read(b);
  writeln('Введіть 3тю сторону');
  read(c);
  
  p:=(a*b*c)/2;
  S:=(sqrt(p*(p-a)*(p-b)*(p-c)));
  writeln('Площа дорівнює ', S:0:2)
end.