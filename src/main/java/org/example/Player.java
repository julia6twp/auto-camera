package org.example;

public class Player {

    //    coordinates of player
    int x;
    int y;

    //    status of player
    public boolean status;

    //    player's health
    public int health;

//    player's aim
//    Crosshair crosshair;

    // constructor
    Player(int x, int y){
        this.x=x;
        this.y=y;

        this.status=true;
        this.health=100;
    }


    //change of status by conditions
    public void check_ability_to_change_status(){
        if(this.health <= 0){
            status = false;
        }
    }


    // setters and getters

        //coordinates
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

        //status
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

        //health
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
