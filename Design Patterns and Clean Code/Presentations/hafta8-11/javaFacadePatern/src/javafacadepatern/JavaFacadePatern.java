/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javafacadepatern;
import static java.lang.constant.ConstantDescs.NULL;
import java.util.*;
/**
 *
 * @author Onder Eyecioglu
 */
class Customer {
    public String firstName;
    public String lastName;
    public cradiCard crd;
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
class cradiCard{
    public String cardOvner; 
    public int limit;
    public int cardNo;
    cradiCard(String str, int lmt, int no){
        this.limit=lmt;
        this.cardNo=no;
    }
 }
//Kredi kartı ile ilgili işlemlerin yapıldığı sınıf
class CreditCardManager {
    public void createCreditCart(Customer customer) {
        // Parametre olarak gelen kullanıcıya ait kredi kartı oluşturma işleminin yapıldığı yer
        cradiCard cc1=new cradiCard(customer.firstName,1000,123);
        customer.crd=cc1;
    }
}
class BlackListService {
    public Boolean checkEmployeeIsTheBlackList(Customer customer,List<Customer> bL )
    {
        Boolean x=true;
        // Müşterinin kara listede olup olmadığının kontrolünün yapıldığı yer.
        // Kara listede ise false, değilse true dönmekte olduğunu var sayalım.        
       for(int i=0;i<bL.size();i++){
           if(customer.equals(bL.get(i))){ 
               x= true ;
           }else{
               x= false;
            }           
        }
       return x;
    }
}
// Banka müşterimizi temsili oluşturan sınıf.
class CreditCardFacade {
    public Customer c;
    public CreditCardFacade(Customer customer){
        this.c=customer;
    }
    public void createCreditCart(List<Customer> bL) {
        CreditCardManager creditCardManager = new CreditCardManager();
        BlackListService blackListService = new BlackListService();
        if (!blackListService.checkEmployeeIsTheBlackList(c, bL)) {
            creditCardManager.createCreditCart(c);
        }
    }
    public void setLimit(int Limit){
        c.crd.limit=Limit;
    }
}
// Kara liste ile ilgili işlemlerin yapıldığı sınıf

public class JavaFacadePatern {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer c1 = new Customer("Duygu", "Kaya");
        Customer c2 = new Customer("Ali", "Kaya");
        CreditCardManager cm=new CreditCardManager();
        cm.createCreditCart(c1);
        System.out.println("card no:"+c1.crd.cardNo);
        List<Customer> blackList=new ArrayList<Customer>();
        blackList.add(c2);
        /* Boolean kontrol=true;
        for(int i=0;i<blackList.size();i++) 
           if(!c1.equals(blackList.get(i)))
                kontrol=false;
                
        System.out.println(kontrol);
        if(kontrol) cm.createCreditCart(c1);
         System.out.println(c1.crd.limit); */
        
        
        CreditCardFacade creditCardFacade = new CreditCardFacade(c1);
        creditCardFacade.createCreditCart(blackList);
        System.out.println(c1.crd.limit);
        creditCardFacade.setLimit(2000);
        System.out.println(c1.crd.limit);
        if(c2.crd==NULL) {
            System.out.println(c2.firstName+" in BLACK LIST");
        }else{
            //System.out.println("Credit Card:"+c2.crd.cardNo);
        }
    }
    
}
