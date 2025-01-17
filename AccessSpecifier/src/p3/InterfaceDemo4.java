package p3;
interface ExcelReporting
{
    default void reporting()
    {
        System.out.println("It provides the display of Excel Reports in the Dashboard");
    }
}

interface PdfReporting
{
    default void reporting()
    {
        System.out.println("It provides the display of PDF Reports in the Dashboard");
    }
}

class IncentiveReports implements ExcelReporting, PdfReporting
{
    public void reporting()
    {
        System.out.println("It provides the display of Reports in the Dashboard");
    }
}
public class InterfaceDemo2 {
    public static void main(String[] args) {
        IncentiveReports o=new IncentiveReports();
        o.reporting();
    }
}
