class Hexagon
{
   private char hexCode;  
   private int previousPosition; 
   private int trayPosition;
   private int bagPosition;
   private char number1;
   private char number2;
   private char number3;
   private char number4;
   private char number5;
   private char number6;
   
//-------------------------------

   Hexagon(int bagPosition, char hexCode, char number1, char number2, char number3, char number4, char number5, char number6)
   {
      this.bagPosition = bagPosition;
      this.hexCode = hexCode;
      this.number1 = number1;
      this.number2 = number2;
      this.number3 = number3;
      this.number4 = number4;
      this.number5 = number5;
      this.number6 = number6;      
      trayPosition = 0;      
      previousPosition = 0;
   
   }// End constructor   
  
//----------------------------------------

   public void rotateClockWise()
   {   
      char tempA;
      char tempB;
            
      tempB = number2;    
      number2 = number1;
      
      tempA = number3;      
      number3 = tempB;
      
      tempB = number4;
      number4 = tempA;
      
      tempA = number5;
      number5 = tempB;
      
      tempB = number6;
      number6 = tempA;
      
      number1 = tempB;   
   
   }// End method
   
//----------------------------------------

   public void rotateCounterClockWise()
   {   
      char tempA;
      char tempB;      
      
      tempB = number6;    
      number6 = number1;
      
      tempA = number5;      
      number5 = tempB;
      
      tempB = number4;
      number4 = tempA;
      
      tempA = number3;
      number3 = tempB;
      
      tempB = number2;
      number2 = tempA;
      
      number1 = tempB;   
   
   }// End method
   
//-------------------------------------

   public char getNumber(int number)
   {
      char temp = 'Z';
      
      switch(number)
      {
         case 0:
         {
            temp = number1;
            break;
         }// End Case
         
         case 1:
         {
            temp = number2;
            break;
         }// End Case
         
         case 2:
         {
            temp = number3;
            break;
         }// End Case         
         
         case 4:
         {
            temp = number4;
            break;
         }// End Case
         
         case 5:
         {
            temp = number5;
            break;
         }// End Case
         
         case 6:
         {
            temp = number6;
            break;
         }// End Case                  
         
      }// End switch   
         
      return temp;
      
      
   }// End method
   
//-------------------------------------

   public void setTrayPosition(int position)
   {
      trayPosition = position;
   }// End method
   
//-------------------------------------

   public int getTrayPosition()
   {
      return trayPosition;
   }// End method

//-------------------------------------

  public void setPreviousPosition(int position)
   {
      previousPosition = position;
   }// End method
   
//-------------------------------------

   public int getPreviousPosition()
   {
      return previousPosition;
   }// End method

//-------------------------------------

   public char getHexCode()
   {
      return hexCode;
   }// End method

//-------------------------------------

   public int getBagPosition()
   {
      return bagPosition;
   }// End method      
   
//-------------------------------------

   public int getNumber1()
   {
      return number1;
   }// End method   

//-------------------------------------

   public int getNumber2()
   {
      return number2;
   }// End method

//-------------------------------------

   public int getNumber3()
   {
      return number3;
   }// End method

//-------------------------------------

   public int getNumber4()
   {
      return number4;
   }// End method

//-------------------------------------

   public int getNumber5()
   {
      return number5;
   }// End method
   
//-------------------------------------

   public int getNumber6()
   {
      return number6;
   }// End method



}// End class
