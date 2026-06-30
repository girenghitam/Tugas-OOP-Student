package nilaimahasiswa.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

public class UITheme {

    public static final Color SIDEBAR = new Color(45, 65, 52);        // hijau hutan tua
    public static final Color SIDEBAR_HOVER = new Color(62, 88, 70);  // sedikit lebih terang
    public static final Color PRIMARY = new Color(88, 120, 95);       // hijau sage
    public static final Color PRIMARY_DARK = new Color(65, 92, 72);   // sage lebih gelap
    public static final Color BACKGROUND = new Color(245, 246, 242);  // putih kekuningan natural
    public static final Color CARD = new Color(255, 255, 253);
    public static final Color TEXT_DARK = new Color(30, 35, 28);
    public static final Color TEXT_MUTED = new Color(110, 120, 105);
    public static final Color DANGER = new Color(180, 70, 65);
    public static final Color SUCCESS = new Color(75, 130, 85);

    public static final Font FONT_TITLE = new Font("Segoe UI", Font.BOLD, 22);
    public static final Font FONT_SUBTITLE = new Font("Segoe UI", Font.PLAIN, 13);
    public static final Font FONT_LABEL = new Font("Segoe UI", Font.PLAIN, 13);
    public static final Font FONT_BUTTON = new Font("Segoe UI", Font.BOLD, 13);
    public static final Font FONT_NAV = new Font("Segoe UI", Font.PLAIN, 14);

    public static void styleButtonPrimer(JButton btn) {
        btn.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        btn.setBackground(PRIMARY);
        btn.setForeground(Color.WHITE);
        btn.setFont(FONT_BUTTON);
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setContentAreaFilled(true);
        btn.setOpaque(true);
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    public static void styleButtonOutline(JButton btn, Color warna) {
        btn.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        btn.setBackground(Color.WHITE);
        btn.setForeground(warna);
        btn.setFont(FONT_BUTTON);
        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createLineBorder(warna, 1, true));
        btn.setContentAreaFilled(true);
        btn.setOpaque(true);
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    public static void styleTable(JTable table) {
        table.setRowHeight(28);
        table.setFont(FONT_LABEL);
        table.setSelectionBackground(new Color(200, 215, 195));
        table.setSelectionForeground(TEXT_DARK);
        table.setGridColor(new Color(220, 225, 215));

        JTableHeader header = table.getTableHeader();
        header.setFont(FONT_BUTTON);
        header.setBackground(SIDEBAR);
        header.setForeground(Color.WHITE);
        header.setPreferredSize(new Dimension(0, 32));
    }

    public static void styleTable(JTable table, int... bobotKolom) {
        styleTable(table);
        javax.swing.table.TableColumnModel cm = table.getColumnModel();
        int total = 0;
        for (int b : bobotKolom) total += b;
        if (total <= 0 || cm.getColumnCount() != bobotKolom.length) return;
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        for (int i = 0; i < bobotKolom.length; i++) {
            int width = Math.round(600f * bobotKolom[i] / total);
            cm.getColumn(i).setPreferredWidth(width);
        }
    }
}
