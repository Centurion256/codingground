Program AgeSwitch;
var
    Age: Integer;
begin
    writeln('Вкажіть ваш вік');
    read(Age);

    case Age of
        1..6   : writeln('дошкільнятко');
        7..16  : writeln('школяр');
        17..21 : writeln('студент');
        22..59 : writeln('працівник');
        60..150: writeln('пенсіонер'); 
    else writeln('помилка')
    end;
    
end.
