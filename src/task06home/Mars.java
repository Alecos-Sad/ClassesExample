package task06home;

public class Mars extends Planet{


        private static final int DIAMETER = 12742;
        public static final double MASS = 5.9742E24;

        public Mars() {
            super("Mars", DIAMETER, MASS, false);

        }

        public static int getDIAMETER() {
            return DIAMETER;
        }

        public static double getMASS() {
            return MASS;
        }



}
