package edu.ithaca.Group6;

import static java.lang.Character.isLetter;

public class UIImpl implements UI{
    @Override
    public void main() {

    }

    @Override
    public boolean checkYesOrNo(String userInput) {
        //Shorten the string
        if(userInput.length() < 1){
            return false;
        }
        else{
            String shortUserInput = userInput.substring(0, 1);
            //Lowercase the string
            shortUserInput = shortUserInput.toLowerCase();
            //Compare if yes or no
            if (shortUserInput.equals("y") || shortUserInput.equals("n")) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public boolean checkValidDouble(String userInput) {
        if(userInput.length() < 1){ //quick false for empty string
            return false;
        }
        else if(isLetter(userInput.charAt(userInput.length()-1))){ //fixes error with parseDouble
            return false;
        }
        else{
            try {   //tries to parse as a double, throws exception if not double
                Double.parseDouble(userInput);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }

    @Override
    public boolean checkValidInt(String userInput) {
       if(userInput.length() < 1){  //quick false for empty string
           return false;
       }
       else{
           try
           {
               Integer.parseInt(userInput);
               return true;
           } catch (NumberFormatException e)
           {
               return false;
           }
       }
    }

    @Override
    public String displayMaterialsByArea(){
        Brick brick = new Brick();
        ClayBrick clayBrick = new ClayBrick();
        ConcreteBrick concreteBrick = new ConcreteBrick();
        TwoByFour twoByFour = new TwoByFour();
        TwoByThree twoByThree = new TwoByThree();
        Wood wood = new Wood();
        String display = "Building Materials:";
        display = display + "\n" + brick.toString();
        display = display + "\n" + clayBrick.toString();
        display = display + "\n" + concreteBrick.toString();
        display = display + "\n" + twoByFour.toString();
        display = display + "\n" + twoByThree.toString();
        display = display + "\n" + wood.toString();
        return display;
    }

    @Override
    public String displayDoors(){
        Door door = new Door();
        GarageDoor garageDoor = new GarageDoor();
        InteriorDoor interiorDoor = new InteriorDoor();
        ScreenDoor screenDoor = new ScreenDoor();
        SlidingDoor slidingDoor = new SlidingDoor();
        StormDoor stormDoor = new StormDoor();
        String display = "Doors:";
        display = display + "\n" + door.toString();
        display = display + "\n" + garageDoor.toString();
        display = display + "\n" + interiorDoor.toString();
        display = display + "\n" + screenDoor.toString();
        display = display + "\n" + slidingDoor.toString();
        display = display + "\n" + stormDoor.toString();
        return display;
    }

    @Override
    public String displayWindows(){
        BayWindow bayWindow = new BayWindow();
        DoubleHungWindow doubleHungWindow = new DoubleHungWindow();
        PictureWindow pictureWindow = new PictureWindow();
        SingleHungWindow singleHungWindow = new SingleHungWindow();
        SlidingWindow slidingWindow = new SlidingWindow();
        String display = "Windows:";
        display = display + "\n" + bayWindow.toString();
        display = display + "\n" + doubleHungWindow.toString();
        display = display + "\n" + pictureWindow.toString();
        display = display + "\n" + singleHungWindow.toString();
        display = display + "\n" + slidingWindow.toString();
        return display;
    }
}