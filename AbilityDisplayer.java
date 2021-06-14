import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List; 

public class AbilityDisplayer extends Actor
{
    Character playerCharacter;
    
    AbilitySelectionIcon selectionIcon1 = new AbilitySelectionIcon(); 
    AbilitySelectionIcon selectionIcon2 = new AbilitySelectionIcon(); 
    AbilitySelectionIcon selectionIcon3 = new AbilitySelectionIcon(); 
    AbilitySelectionIcon selectionIcon4 = new AbilitySelectionIcon();
    
    AbilitySelectionIcon descriptionIcon1 = new AbilitySelectionIcon("Icon - AbilityDescription - Precise Cut.png"); 
    AbilitySelectionIcon descriptionIcon2 = new AbilitySelectionIcon("Icon - AbilityDescription - Cast Spell.png"); 
    AbilitySelectionIcon descriptionIcon3 = new AbilitySelectionIcon("Icon - AbilityDescription - Magic Dagger.png"); 
    AbilitySelectionIcon descriptionIcon4 = new AbilitySelectionIcon("Icon - AbilityDescription - Thorn Shield.png");
    AbilitySelectionIcon descriptionIcon5 = new AbilitySelectionIcon("Icon - AbilityDescriptionBackground.png");
    
    AbilityIcon abilityIcon1 = new AbilityIcon("Icon - MeleeAttack.jpg",1);
    AbilityIcon abilityIcon2 = new AbilityIcon("Icon - RangedAttack.jpg",2);
    AbilityIcon abilityIcon3 = new AbilityIcon("Icon - OffensiveBuff.jpg",3);
    AbilityIcon abilityIcon4 = new AbilityIcon("Icon - DefensiveBuff.jpg",4);
    
    public class AbilityIcon extends Actor{
        private int iD;
        
        public AbilityIcon(String iconName,int iD){
           setImage(new GreenfootImage(iconName));
           this.iD = iD;
        }
        
        public int getID(){
            return iD;
        }
    }
    
    public class AbilitySelectionIcon extends Actor{
        int selectionStatus = 0;
        int displayStatus = 0;
        
        String redIcon = "Icon - Unselected.jpg";
        String blueIcon = "Icon - Selected.jpg";
        
        public AbilitySelectionIcon(){
            setImage(new GreenfootImage(redIcon));
        }
        
        public AbilitySelectionIcon(String image){
            setImage(new GreenfootImage(image));
        }
        
        public void changeSelectionStatus(int selectionStatus){
            this.selectionStatus = selectionStatus;
            
            if(this.selectionStatus == 0){
               setImage(new GreenfootImage(redIcon));
            }  else if(this.selectionStatus == 1){
                setImage(new GreenfootImage(blueIcon));
            }
        }
        
        public void changeDisplayStatus(int displayStatus){
            this.displayStatus = displayStatus;
            
            if(this.displayStatus == 0){
               getImage().setTransparency(0);
            }  else if(this.displayStatus == 1){
               getImage().setTransparency(255);
            }
        }
        
    }
    
    public AbilityDisplayer(Character playerCharacter){
        this.playerCharacter = playerCharacter;
        getImage().setTransparency(0);
    }
    
    public void displayAbilities(){
        this.getWorld().addObject(abilityIcon1,30,291);
        this.getWorld().addObject(abilityIcon2,90,291);
        this.getWorld().addObject(abilityIcon3,150,291);
        this.getWorld().addObject(abilityIcon4,210,291);
        
        this.getWorld().addObject(selectionIcon1,30,323);
        this.getWorld().addObject(selectionIcon2,90,323);
        this.getWorld().addObject(selectionIcon3,150,323);
        this.getWorld().addObject(selectionIcon4,210,323);
        
        this.getWorld().addObject(descriptionIcon1,120,375);
        this.getWorld().addObject(descriptionIcon2,120,375);
        this.getWorld().addObject(descriptionIcon3,120,375);
        this.getWorld().addObject(descriptionIcon4,120,375);
        this.getWorld().addObject(descriptionIcon5,120,375);
        
        this.getWorld().addObject(new AbilitySelectionIcon("Icon - HUD bar.jpg"),250,393);
    }
    
    public void detectCollisionWithAbilityIcon(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        if(mouse != null){
            selectionIcon1.changeSelectionStatus(0);
            selectionIcon2.changeSelectionStatus(0);
            selectionIcon3.changeSelectionStatus(0);
            selectionIcon4.changeSelectionStatus(0);
            

            descriptionIcon1.changeDisplayStatus(0);
            descriptionIcon2.changeDisplayStatus(0);
            descriptionIcon3.changeDisplayStatus(0);
            descriptionIcon4.changeDisplayStatus(0);
            descriptionIcon5.changeDisplayStatus(1);
            
            List<AbilityIcon> objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), AbilityIcon.class);
            
            for (AbilityIcon object : objects)
            {
                if (object != null)
                {
                    switch(object.getID()){
                        case 1:
                            selectionIcon1.changeSelectionStatus(1);
                            descriptionIcon1.changeDisplayStatus(1);
                            descriptionIcon5.changeDisplayStatus(0);
                        break;
                        case 2:
                            selectionIcon2.changeSelectionStatus(1);
                            descriptionIcon2.changeDisplayStatus(1);
                            descriptionIcon5.changeDisplayStatus(0);
                        break;
                        case 3:
                            selectionIcon3.changeSelectionStatus(1);
                            descriptionIcon3.changeDisplayStatus(1);
                            descriptionIcon5.changeDisplayStatus(0);
                        break;
                        case 4:
                            selectionIcon4.changeSelectionStatus(1);
                            descriptionIcon4.changeDisplayStatus(1);
                            descriptionIcon5.changeDisplayStatus(0);
                        break;
                        
                    }
                }
            }
        }
    }

    
    public void displayAbilityDescription(){
        
    }
    
    public void act() 
    {
        displayAbilities();
        detectCollisionWithAbilityIcon();
    }    
}
