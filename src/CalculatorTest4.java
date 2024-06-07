public class CalculatorTest4 {
    public static void main(String[] args) {
        
        Calculator4 calc = new Calculator4();
        
        //Name your friends
        calc.findTotal(10, null);
        calc.findTotal(12, null);
        calc.findTotal(9,  null);
        calc.findTotal(8,  null);
        calc.findTotal(7,  null);
        calc.findTotal(15, "Alex");
        calc.findTotal(11, null);
        calc.findTotal(30, "Forgetful"); //quanto cada um vai paga incluindo taxas e gorjetas
        
       double resultado = calc.Mesas(calc.findTotal(10, null) + 
               calc.findTotal(12, null) + 
               calc.findTotal(9,  null) +
               calc.findTotal(8,  null) +
               calc.findTotal(7,  null) +
               calc.findTotal(15, "Alex") +
               calc.findTotal(11, null) +
                calc.findTotal(30, "Forgetful"));
        System.out.println("Total: " + resultado); //total da mesa
        
        //Find and print the entire table's total, including tax and tip
        
      double pagar = resultado / 7;
        System.out.println("Cada um pagará: " + pagar); // quanto cada um paga sem contar quem esqueceu a carteira
    } 
}
