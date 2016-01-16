Program BirthDateString;
var
    y,m,d: Integer;
    S: String;
begin
    writeln('Вкажіть ваш рік народження');
    read(y);
    writeln('Вкажіть ваш місяць народження');
    read(m);
    writeln('Вкажіть ваш день народження');
    read(d);
    
    case m of
        1  : S:= ' січня ';
        2  : S:= ' лютого ';
        3  : S:= ' березня ';
        4  : S:= ' квітня ';
        5  : S:= ' травня ';
        6  : S:= ' червня ';
        7  : S:= ' липня ';
        8  : S:= ' серпня ';
        9  : S:= ' вересня ';
        10 : S:= ' жовтня ';
        11 : S:= ' листопада ';
        12 : S:= ' грудня ';
    else writeln('Error');
    end;
    writeln(d, S, y);
end.    