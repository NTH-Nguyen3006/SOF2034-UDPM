package poly.cafe.manager.Controller;

import poly.cafe.manager.*;
import poly.cafe.ui.*;
import poly.cafe.util.XDialog;

import javax.swing.*;

public interface PolyCafeController {
    void init();

    default void exit(){
        if(XDialog.confirm("Bạn muốn kết thúc?")){
            System.exit(0);
        }
    }
    default void showJDialog(JDialog dialog){
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

    default void showWelcomeJDialog(JFrame frame){
        this.showJDialog(new WelcomeJDialog(frame, true));
    }

    default void showLoginJDialog(JFrame frame){
        this.showJDialog(new LoginJDialog(frame, true));
    }

    default void showChangePasswordJDialog(JFrame frame){
        this.showJDialog(new ChangePasswordJDialog(frame, true));
    }

    default void showSalesJDialog(JFrame frame){
        this.showJDialog(new SalesJDialog(frame, true));
    }

    default void showHistoryJDialog(JFrame frame){
        this.showJDialog(new HistoryJDialog(frame, true));
    }

    default void showDrinkManagerJDialog(JFrame frame) {
        this.showJDialog(new DrinkManagerJDialog(frame, true));
    }

    default void showCategoryManagerJDialog(JFrame frame){
        this.showJDialog(new CategoryManagerJDialog(frame, true));
    }

    default void showCardManagerJDialog(JFrame frame){
        this.showJDialog(new CardManagerJDialog(frame, true));
    }

    default void showBillManagerJDialog(JFrame frame){
        this.showJDialog(new BillManagerJDialog(frame, true));
    }

    default void showUserManagerJDialog(JFrame frame){
        this.showJDialog(new UserManagerJDialog(frame, true));
    }

    default void showRevenueManagerJDialog(JFrame frame){
        this.showJDialog(new RevenueManagerJDialog(frame, true));
    }
}
