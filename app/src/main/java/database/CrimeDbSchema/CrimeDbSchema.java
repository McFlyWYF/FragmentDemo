package database.CrimeDbSchema;

/**
 * Created by 王宇飞 on 2017/10/26/026.
 */

public class CrimeDbSchema {
    public static final class CrimeTable{
        public static final String NAME = "criems";

        public static final class Cols{
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
        }
    }
}
