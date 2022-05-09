package Mapping;



public class MapDir {

    int maxX = 13;
    int maxY = maxX * 2;

    String[] map = new String[maxY]; // Using a constructor to assign the value of maxX somehow causes the string to always register it as a zero,
                                    // even though it gets picked up properly everywhere else. Solve one problem, ten more pop up. That's my curse.
                                    // TODO: Fix constructor and String related issue.
    String map_Smiley(int i){

        map[0]  = "             ";
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
        map[14] = "     111     "; // I really wish there would be a better way to save maps.
        map[15] = "             "; // TODO: Figure out a way to save maps more efficiently.
        map[16] = "             ";
        map[17] = "             ";
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

    String map_House(int i){

        map[0]  = "             ";
        map[1]  = "      11     ";
        map[2]  = "      11     ";
        map[3]  = "     1111    ";
        map[4]  = "     1111    ";
        map[5]  = "    111111   ";
        map[6]  = "    111111   ";
        map[7]  = "   11111111  ";
        map[8]  = "   11111111  ";
        map[9]  = "  1111111111 ";
        map[10] = "   1      1  ";
        map[11] = "   1      1  ";
        map[12] = "   1      1  ";
        map[13] = "   1 1  1 1  ";
        map[14] = "   1 1  1 1  ";
        map[15] = "   1 1    1  ";
        map[16] = "   11111111  ";
        map[17] = "ggggggggggggg"; // TODO: Possibly different textures, such as grass, sky, or wood?
        map[18] = "             "; // "g" for placing grass perhaps?
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
