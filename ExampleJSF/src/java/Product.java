
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean (name="obj")
@SessionScoped 
public class Product 
{
    private String Name;
    private int Qty;
    private double price;

    public Product() 
    {
        
    }

    public String getName() {
        return Name;
    }

    public int getQty() {
        return Qty;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public String addData()
    {
        if(Name == null)
        {
            return "Fail";
        }
        else if(Qty>10)
        {
            return "Fail";
        }
        else
        {
        System.out.println("Data inserted successfully");
        return "Success";
        }
    }
}
