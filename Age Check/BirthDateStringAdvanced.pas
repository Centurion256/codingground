Program BirthDateStringAdvanced;
var
    y,m,d: Integer;
    Sy, Sm, Sd, result: String;
begin
    writeln('Вкажіть ваш рік народження');
    read(y);
    
    writeln('Вкажіть ваш місяць народження');
    read(m);
    
    writeln('Вкажіть ваш день народження');
    read(d);
    
    case m of
        1  : Sm:= ' січня ';
        2  : Sm:= ' лютого ';
        3  : Sm:= ' березня ';
        4  : Sm:= ' квітня ';
        5  : Sm:= ' травня ';
        6  : Sm:= ' червня ';
        7  : Sm:= ' липня ';
        8  : Sm:= ' серпня ';
        9  : Sm:= ' вересня ';
        10 : Sm:= ' жовтня ';
        11 : Sm:= ' листопада ';
        12 : Sm:= ' грудня ';
    else writeln('Error');
    end;
    
    Str(d, Sd);
    Str(y, Sy);
    result:=(Sd+Sm+Sy);
    writeln(result);
end.    
