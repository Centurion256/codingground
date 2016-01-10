Program Volume;
var
  a,b,h,V: integer;
begin

  writeln('Введіть довжину');
  read(a);
  writeln('Введіть ширину');
  read(b);
  writeln('Введіть висоту');
  read(h);
  
  V:=a*b*h;
  
  writeln('Площа кімнати складає ', V);

end.
