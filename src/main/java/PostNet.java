/**
 * Created by GUANSA on 7/20/2017.
 */
public class PostNet {
    public static final String Frame = "|";
    final private String[] BAR_MAP = {
            "||:::",
            ":::||",
            "::|:|",
            "::||:",
            ":|::|",
            ":|:|:",
            ":||::",
            "|:::|",
            "|::|:",
            "|:|::"
    };

    public String change2bar(String postcode) {
        String preCode = preProcess(postcode);
        String codeWithCD = generateCD(preCode);
        String bar = generateBar(codeWithCD);
        return bar;
    }

    private String generateBar(String codeWithCD) {
        return Frame + toBar(codeWithCD) + Frame;
    }

    private String toBar(String codeWithCD) {
        StringBuffer result = new StringBuffer();
        char codes[] = codeWithCD.toCharArray();
        for (char ch : codes) {
            result.append(BAR_MAP[ch - 48]);
        }
        return result.toString();
    }

    private String generateCD(String preCode) {
        return preCode + calcCD(preCode);
    }

    private int calcCD(String preCode) {
        int cd;
        int sum = 0;
        char codes[] = preCode.toCharArray();
        for (char ch : codes) {
            sum += ch - 48;
        }
        cd = 10 - sum % 10;
        cd = cd == 10 ? 0 : cd;
        return cd;
    }

    private String preProcess(String postcode) {
        return postcode.replaceAll("-", "");
    }
}
