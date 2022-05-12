package Mapping;



public class MapDir {

    int maxX;
    int maxY;
    String[] map;

    MapDir(int maxX){
        this.maxX = maxX;
        System.out.println(this.maxX);
        maxY = maxX * 2;
        map = new String[maxY];
    }

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
        map[1]  = "      33     ";
        map[2]  = "      33     ";
        map[3]  = "     3113    ";
        map[4]  = "     3113    ";
        map[5]  = "    311113   ";
        map[6]  = "    311113   ";
        map[7]  = "   31111113  ";
        map[8]  = "   31111113  ";
        map[9]  = "  3111111113 ";
        map[10] = "   11111111  ";
        map[11] = "   11111111  ";
        map[12] = "   11111111  ";
        map[13] = "   11411511  ";
        map[14] = "   11411511  ";
        map[15] = "   11411111  ";
        map[16] = "   11611111  ";
        map[17] = "2222222222222";
        map[18] = "2222222222222";
        map[19] = "2222222222222";
        map[20] = "2222222222222";
        map[21] = "2222222222222";
        map[22] = "2222222222222";
        map[23] = "             ";
        map[24] = "             ";
        map[25] = "             ";

        /*
        for (int j = 0; j < maxY; j++){
            map[j] = "             ";   // I don't understand what he is planning...
        }
         */

        return map[i];
    }
}
