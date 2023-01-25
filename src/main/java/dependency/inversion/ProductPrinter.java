package dependency.inversion;

public class ProductPrinter implements IPrinter{

    @Override
    public void print(String text){
        System.out.println(text);
    }
}
