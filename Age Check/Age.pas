Program HelloWorld(output);
var
Age: Integer;
begin
  writeln('Вкажіть ваш вік');
  read(Age);
  
if Age<1 
  then writeln('число відємне або нуль')
  else      
    if Age<7
      then writeln('дошкільнятко')
  else
    if Age<17
      then writeln('школяр')
  else
    if Age<22
      then writeln('студент')
  else
    if Age<60
      then writeln('працівник')
  else
    if Age>59
      then writeln('пенсіонер')
end.
