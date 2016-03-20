package com.pershing.cst.util;

public class CstQueries {
	public static String  histQuery="SELECT to_char(Open_DT,'YYYY') as yearCol, to_char(Open_DT,'MM') as MonthCol,
       (CASE WHEN status = 'open' then 1 end) as openCnt,
       count(CASE WHEN status = 'closed' then 1 end) as closeCnt
FROM YourTable
WHERE Open_DT >= add_months(sysdate,-13) 
GROUP BY to_char(Open_DT,'YYYY'),to_char(Open_DT,'MM')";
}


public static String  sqlQuery="SELECT year(Open_DT) as yearCol, month(Open_DT) as MonthCol,
       count(CASE WHEN status = 'open' then 1 end) as openCnt,
       count(CASE WHEN status = 'closed' then 1 end) as closeCnt
FROM YourTable
WHERE Open_DT > DATEADD(month,-13,getdate())
GROUP BY year(Open_DT),month(Open_DT)";


public String chartQuery="select region, count (*) as total from chart where STATUS='open' group by region";