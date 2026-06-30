package nilaimahasiswa.view;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 * Tombol hijau custom yang tidak bisa di-override Windows.
 * @author Yogi Apriana
 */
public class GreenButton extends JButton {

    private final Color bgColor;
    private final Color hoverColor;

    public GreenButton(String text, Color bg, Color hover) {
        super(text);
        this.bgColor = bg;
        this.hoverColor = hover;
        setUI(new BasicButtonUI());
        setOpaque(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setForeground(Color.WHITE);
        setFont(new Font("Segoe UI", Font.BOLD, 13));
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (getModel().isRollover()) {
            g2.setColor(hoverColor);
        } else {
            g2.setColor(bgColor);
        }
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 6, 6);
        g2.dispose();
        super.paintComponent(g);
    }
}
