Program Square_Equation;
{a*x^2+b*x+c=0}
var
a,b,c,D,x1,x2: real;
begin
  writeln('Введіть 1ше число');
  read(a);
  writeln('Введіть 2ге число');
  read(b);
  writeln('Введіть 3тє число');
  read(c);
  
  D:=(sqr(b))-4*a*c;
  
  if D>0 then
         begin
           x1:=-(b-(sqrt(D)))/2*a;
           x2:=-(B+(sqrt(D)))/2*a;
           writeln(x1 :0:3);
           writeln(x2 :0:3);
         end
  else
      if D=0 then
             begin
               x1:=-(b-0)/2*a;
               writeln(x1 :0:3);
             end
  else writeln('Ø')             
end.
