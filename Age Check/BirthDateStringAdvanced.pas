Program BirthDateStringAdvanced;
var
    y,m,d: Integer;
    S: String;
begin
    writeln('Вкажіть ваш рік народження');
    read(y);
    S:=(IntToStr(y));
    writeln('Вкажіть ваш місяць народження');
    read(m);
    S:=(IntToStr(m));
    writeln('Вкажіть ваш день народження');
    read(d);
    S:=(Str(d));
    case m of
        1  : S:=S+ ' січня ';
        2  : S:=S+ ' лютого ';
        3  : S:=S+ ' березня ';
        4  : S:=S+ ' квітня ';
        5  : S:=S+ ' травня ';
        6  : S:=S+ ' червня ';
        7  : S:=S+ ' липня ';
        8  : S:=S+ ' серпня ';
        9  : S:=S+ ' вересня ';
        10 : S:=S+ ' жовтня ';
        11 : S:=S+ ' листопада ';
        12 : S:=S+ ' грудня ';
    else writeln('Error');
    end;
    writeln(d, ' ', S, ' ', y);
end.    