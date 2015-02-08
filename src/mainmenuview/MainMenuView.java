/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmenuview;

import java.util.Scanner;

/**
 *
 * @author DilexsaTech
 */
public class MainMenuView {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MainMenuView mainMenu = new MainMenuView();
       mainMenu.getInput();
          
    }
    private static final String [][] menuItems = {
        {"P", "PLAY"},
        {"V", "VIEW BEST TIME"},
        {"H", "HELP"},
        {"E", "EXIT"},
    };
    
    MainMenuControl mainMenuControl = new MainMenuControl();
    
    public MainMenuView(){
        
    }
    
    public void getInput(){
        
    String command;
    Scanner inFile = new Scanner(System.in);
    
    do{
        this.display(); //This will diplay the menu
        
        
        command = inFile.nextLine();
        command = command.trim().toUpperCase();
        
        switch (command){
            
            case "P":
                    mainMenuControl.startGame();
                    break;
                case "V":
                    mainMenuControl.viewBestTimes();
                    break;
                case "H":
                    mainMenuControl.displayHelpMenu();            
                    break;
                case "X":
                    break;
                default: 
                    System.out.println("Invalid command. Please enter a valid command.");
                    continue;        
        }
          } while (!command.equals("X"));

        return;
    }
    
        
      public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tMain Menu");
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }   
    
}
