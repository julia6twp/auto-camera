package org.example.maps;

import java.util.List;

public class Maps {

    String name;

    //Top left coordinates
    Coordinates top_left;
    //Bottom left coordinates
    Coordinates bottom_left;

//    Top right coordinates
    Coordinates top_right;
//    Bottom right coordinates
    Coordinates bottom_right;

    Maps(List<Coordinates> coordinates){
        this.name = "Test map";
//        0,1,2,3 - ruch zegara
        this.top_left = coordinates.get(0);
        this.top_right = coordinates.get(1);
        this.bottom_right = coordinates.get(2);
        this.bottom_left = coordinates.get(3);
    }

}
