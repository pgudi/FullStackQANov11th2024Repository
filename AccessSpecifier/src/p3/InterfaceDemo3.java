package p3;
interface Reporting
{
    void excelReporting();
    static void pdfReporting()
    {
        System.out.println("It is a static Method to handle PDF Reporting");
    }
}

class Incentives implements Reporting
{
    public void excelReporting()
    {
        System.out.println("It handles Excel Reporting !!1");
    }
}
public class InterfaceDemo1 {
    public static void main(String[] args) {
        Incentives o=new Incentives();
        o.excelReporting();

        Reporting.pdfReporting();
    }
}
