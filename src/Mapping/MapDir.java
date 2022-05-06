package Mapping;



public class MapDir {

    int maxX = 13;
    int maxY = maxX * 2;

    String[] map = new String[maxY];



    MapDir(){


    }

    String map_Smiley(int i){

        map[0]  = "0000000000000"; // topmost left corner always gets drawn for some reason, even though its value is 0
        map[1]  = "0000000000000";
        map[2]  = "0000000000000";
        map[3]  = "0000000000000";
        map[4]  = "0000000000000";
        map[5]  = "0000000000000";
        map[6]  = "0000100010000";
        map[7]  = "0001010101000";
        map[8]  = "0001010101000";
        map[9]  = "0000100010000";
        map[10] = "0000000000000";
        map[11] = "0000001000000";
        map[12] = "0000000000000";
        map[13] = "0000100010000"; // This is cancer.
        map[14] = "0000011100000";
        map[15] = "0000000000000";
        map[16] = "0000000000000";
        map[17] = "0000000000000"; // TODO: Save maps as individual classes, such as to "easily" change them.
        map[18] = "0000000000000";
        map[19] = "0000000000000";
        map[20] = "0000000000000";
        map[21] = "0000000000000";
        map[22] = "0000000000000";
        map[23] = "0000000000000";
        map[24] = "0000000000000";
        map[25] = "0000000000001";

        return map[i];
    }
}
