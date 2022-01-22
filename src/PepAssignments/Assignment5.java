package PepAssignments;

//ImageArrayAssignment
public class Assignment5 {
    static int[] pixel1 = {12, 45, 47};
    static int[] pixel2 = {18, 37, 89};
    static int[] pixel3 = {28, 84, 47};

    static int[] pixel4 = {87, 25, 75};
    static int[] pixel5 = {19, 65, 77};
    static int[] pixel6 = {72, 65, 72};

    static int[] pixel7 = {32, 95, 47};
    static int[] pixel8 = {92, 45, 67};
    static int[] pixel9 = {22, 85, 57};


    public static void main(String[] args) {
        rotate90Degree(); //Assignment 1 -> Rotate image to 90 degrees right
        System.out.println();
        rotate180Degree(); //Assignment 2 -> Rotate image to 180 degrees right
        System.out.println();
        grayScaleImage();

    }

    private static void grayScaleImage() {
        int sum = 0, grayScale=0;
        int[][][] image={
                {pixel1, pixel2, pixel3},
                {pixel4, pixel5, pixel6},
                {pixel7, pixel8, pixel9}
        };


        System.out.println("Image after grayscale sum");
        for (int i = 0; i < image.length; i++) {
            System.out.print("[");
            for (int j = 0; j < image.length; j++) {
                System.out.print("[");
                for (int k = 0; k < 3; k++) {
                    sum = 0;
                    sum += image[i][j][k];
                }
                grayScale = sum / 3;
                for (int k = 0; k < image.length; k++) {
                    image[i][j][k] = grayScale;
                    System.out.print(image[i][j][k] + ",");
                }
                System.out.print("]");
            }
            System.out.println("],");
        }
    }

    private static void rotate180Degree() {
        int[][][] image={
                {pixel1, pixel2, pixel3},
                {pixel4, pixel5, pixel6},
                {pixel7, pixel8, pixel9}
        };

        System.out.println("Image before rotated 180 degree to left");
        for (int i = 0; i< image.length; i++) {
            for (int j =0; j< image.length; j++) {
                System.out.print("[");
                for (int k = 0; k < image.length; k++) {
                    System.out.print(image[i][j][k]+",");
                }
                System.out.print("]");
            }
            System.out.println("]");
        }

        System.out.println();
        System.out.println("Image after rotated 180 degree to left");
        for (int i=image.length-1; i>=0; i--){
            System.out.print("[");
            for (int j=image.length-1; j>=0; j--){
                System.out.print("[");
                for (int k=image.length-1; k>=0; k--){
                    System.out.print(image[i][j][k]+",");
                }
                System.out.print("]");
            }

            System.out.println("]");
        }
    }

    private static void rotate90Degree() {

        int[][][] image={
                {pixel1, pixel2, pixel3},
                {pixel4, pixel5, pixel6},
                {pixel7, pixel8, pixel9}
        };

        System.out.println();
        System.out.println("Before Rotation of 90 Degrees");
        for (int i = 0; i< image.length; i++) {
            System.out.print("[");
            for (int j =0; j<image.length; j++) {
                System.out.print("[");
                for (int k = 0; k < image.length; k++) {
                    System.out.print(image[i][j][k]+",");
                }
                System.out.print("]");
            }
            System.out.println("],");
        }


        System.out.println();
        System.out.println("After Rotation of 90 Degrees");

        for (int i = 0; i<image.length; i++) {
            System.out.print("[");
            for (int j = image.length-1; j>=0; j--) {
                System.out.print("[");
                for (int k = image.length-1; k>=0; k--) {
                    System.out.print(image[j][i][k]+",");
                }

                System.out.print("]");
            }
            System.out.println("],");
        }
    }
}
