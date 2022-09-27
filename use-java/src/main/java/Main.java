import useRepresentation.UseRepresentation;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String path = Main.class.getClassLoader().getResource("universal-model/").getPath().replaceFirst("/", "");
        var model = new UseRepresentation(path);
        float[][] embed = model.embed(List.of("strawbery",
                "jahoda",
                "jahodovy jogurt",
                "horka cokolada",
                "neco jahodoveho").toArray(String[]::new));

        System.out.println("strawbery= " + Arrays.toString(embed[0]));
        System.out.println("jahoda= " + Arrays.toString(embed[1]));
        System.out.println("jahodovy jogurt= " + Arrays.toString(embed[2]));
        System.out.println("horka cokolada= " + Arrays.toString(embed[3]));
        System.out.println("neco jahodoveho= " + Arrays.toString(embed[4]));
    }
}
