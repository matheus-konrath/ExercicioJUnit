package EntitiesTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Entitie.Financing;

public class FinancingTests {

    @Test
    void constructorShouldCreateObjectWhenDataIsValidated(){

        //act
        Financing fin = new Financing(100000.0, 2000.0, 80);
        
        //Assert
        Assertions.assertEquals(100000.0, fin.getTotalAmount());
        Assertions.assertTrue(fin.getIncome() == 2000.0);
        Assertions.assertEquals(80, fin.getMonths());
    }

    @Test
    void constructorShouldThrowExceptionWhenDataDoesntValidated(){

        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Financing(100000.0, 2000.0, 20);
        });
    }

    @Test
    void setTotalAmountshouldUpdateValueWhenDataIsValidated(){
        //arrange
        Financing f1 = new Financing(100000.0, 2000.0, 80);

        //act
        f1.setTotalAmount(50000.0);

        //Assertion
        Assertions.assertEquals(50000, f1.getTotalAmount());
        Assertions.assertTrue(f1.getTotalAmount() == 50000 );
    }

    @Test
    void setTotalAmountShouldThrowExceptionWhenDataDoesntValidated(){

        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            Financing f1 = new Financing(800000.0, 2000.0, 20);
            f1.setTotalAmount(110000.0);
        });
    }

    @Test
    void setIncomeShouldUpdateWhenDataIsValidated(){

        Financing fin = new Financing(100000.0, 2000.0, 80);

        fin.setIncome(2300.0);

        Assertions.assertEquals(2300, fin.getIncome());
        Assertions.assertTrue(fin.getIncome() == 2300);
        Assertions.assertFalse(fin.getIncome() == 1600);
    }

    @Test
    void setIncomeShouldThrowExceptionWhenDataDoesntValidated(){

        Assertions.assertThrows(IllegalArgumentException.class, () ->{
           Financing fin = new Financing(100000.0, 1500.0, 30);
           fin.setIncome(1600.0);
        });
    }

    @Test
    void setMonthsShouldUpdateWhenDataIsValidated(){
        Financing fin = new Financing(100000.0, 2000.0, 80);

        fin.setMonths(100);

        Assertions.assertEquals(100, fin.getMonths());
        Assertions.assertTrue(fin.getMonths() == 100);
    }

    @Test
    void setMonthsShouldThrowExceptionWhenDataDoesntValidated(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
           Financing f1 = new Financing(100000.0, 2000.0, 30);
           f1.setMonths(10);
        });
    }

    @Test
    void entryShouldCalculateEntryValue(){

        Financing fin = new Financing(100000.0, 2000.0, 80);
        
        Assertions.assertEquals(20000, fin.entry());
        Assertions.assertTrue(fin.entry() == 20000);
    }

    @Test
    void quotaShouldCalculateQuotaValue(){

        Financing fin = new Financing(100000.0, 2000.0, 80);

        Assertions.assertEquals(1000, fin.quota());
        Assertions.assertTrue(fin.quota() == 1000);
    }

    
    
    
}
