/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author personal
 */
public class Loan implements SimpleInplement{
    private int ID;
    public String Name,Price,Type,yearOfInvent;
    
    public int getID(){
    return ID;
    }
    
    public void setID(int ID){
    this.ID= ID;
    }
    
    public String getName(){
    return Name;
    }
    
    public void setName(String Name){
    this.Name= Name;
    }
    
    public String getPrice(){
    return Price;
    }
    
    public void setPrice(String Price){
    this.Price= Price;
    }
    
    public String getType(){
    return Type;
    }
    
    public void setType(String Type){
    this.Type= Type;
    }
    
    public String getYearOfInvent(){
    return yearOfInvent;
    }
    
    public void setYearOfInvent(String yearOfInvent){
    this.yearOfInvent= yearOfInvent;
    }
    
    @Override
    public void editNasabah(){
    throw new 
        UnsupportedOperationException("not supported yet"); //To change body of generated methods, choose Tools | Templates.
            }
    
    @Override
    public void editBank(){
    throw new 
        UnsupportedOperationException("not supported yet"); //To change body of generated methods, choose Tools | Templates.
            }
}
