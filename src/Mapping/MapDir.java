package Mapping;



public class MapDir {

    int maxX = 13;
    int maxY = maxX * 2;

    String[] map = new String[maxY];



    MapDir(){


    }

    String map_Smiley(int i){

        map[0]  = "             "; // topmost left corner always gets drawn for some reason, even though its value is 0
        map[1]  = "             ";
        map[2]  = "             ";
        map[3]  = "             ";
        map[4]  = "             ";
        map[5]  = "             ";
        map[6]  = "    1   1    ";
        map[7]  = "   1 1 1 1   ";
        map[8]  = "   1 1 1 1   ";
        map[9]  = "    1   1    ";
        map[10] = "             ";
        map[11] = "      1      ";
        map[12] = "             ";
        map[13] = "    1   1    "; // This is cancer.
        map[14] = "     111     ";
        map[15] = "             ";
        map[16] = "             ";
        map[17] = "             "; // TODO: Save maps as individual classes, such as to "easily" change them.
        map[18] = "             ";
        map[19] = "             ";
        map[20] = "             ";
        map[21] = "             ";
        map[22] = "             ";
        map[23] = "             ";
        map[24] = "             ";
        map[25] = "            1";

        return map[i];
    }

    String map_House(int i){

        map[0]  = "             "; // topmost left corner always gets drawn for some reason, even though its value is 0
        map[1]  = "      11     ";
        map[2]  = "      11     ";
        map[3]  = "     1  1    ";
        map[4]  = "     1  1    ";
        map[5]  = "    1    1   ";
        map[6]  = "    1    1   ";
        map[7]  = "   1      1  ";
        map[8]  = "   11111111  ";
        map[9]  = "  1111111111 ";
        map[10] = "   1      1  ";
        map[11] = "   1      1  ";
        map[12] = "   1      1  ";
        map[13] = "   1 1  1 1  "; // This is cancer.
        map[14] = "   1 1  1 1  ";
        map[15] = "   1 1    1  ";
        map[16] = "   11111111  ";
        map[17] = "             "; // TODO: Save maps as individual classes, such as to "easily" change them.
        map[18] = "             ";
        map[19] = "             ";
        map[20] = "             ";
        map[21] = "             ";
        map[22] = "             ";
        map[23] = "             ";
        map[24] = "             ";
        map[25] = "             ";

        return map[i];
    }
}
