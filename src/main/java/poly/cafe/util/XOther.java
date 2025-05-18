package poly.cafe.util;

import javax.swing.text.JTextComponent;

public class XOther {
    public static boolean hasTextFiled(JTextComponent ... fields) {
        for (JTextComponent field : fields) {
            if (field.getText().isEmpty())
                return true;
        }
        return false;
    }

    public static void setEmptyField (JTextComponent ... fields) {
        for (JTextComponent field : fields)
            field.setText("");
    }
}
