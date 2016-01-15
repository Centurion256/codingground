Program BirthDate;
var
    y,m,d: Integer;
begin
    writeln('Вкажіть ваш рік народження');
    read(y);
    writeln('Вкажіть ваш місяць народження');
    read(m);
    writeln('Вкажіть ваш день народження');
    read(d);
    
    case m of
        1  : writeln(d , '/січня/' , y);
        2  : writeln(d , '/лютого/' , y);
        3  : writeln(d , '/березня/' , y);
        4  : writeln(d , '/квітня/' , y);
        5  : writeln(d , '/травня/' , y);
        6  : writeln(d , '/червня/' , y);
        7  : writeln(d , '/липня/' , y);
        8  : writeln(d , '/серпня/' , y);
        9  : writeln(d , '/вересня/' , y);
        10  : writeln(d , '/жовтня/' , y);
        11  : writeln(d , '/листопада/' , y);
        12  : writeln(d , '/грудня/' , y);
    else writeln('Error');
    end;
end.    