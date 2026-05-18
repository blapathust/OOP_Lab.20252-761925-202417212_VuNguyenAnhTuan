package hust.soict.ict.aims.screen.manager;

import hust.soict.ict.aims.media.Book;
import hust.soict.ict.aims.media.CD;
import hust.soict.ict.aims.media.DVD;
import hust.soict.ict.aims.media.Media;
import hust.soict.ict.aims.screen.MediaStore;
import hust.soict.ict.aims.store.Store;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StoreManagerScreen extends JFrame {

    private Store store;

    public StoreManagerScreen() {
        this.store = new Store();

        store.addMedia(new DVD("The Matrix", "Action", "Wachowski", 136, 19.99f));
        store.addMedia(new DVD("Inception", "Sci-Fi", "Christopher Nolan", 148, 24.99f));
        store.addMedia(new DVD("Interstellar", "Sci-Fi", "Christopher Nolan", 169, 29.99f));
        store.addMedia(new CD("Thriller", "Music", "Michael Jackson", 9, 9.99f));
        store.addMedia(new CD("The Dark Side of the Moon", "Music", "Pink Floyd", 10, 12.99f));
        store.addMedia(new CD("Abbey Road", "Music", "The Beatles", 17, 14.99f));
        store.addMedia(new Book("Effective Java", "Joshua Bloch", 45.99f));
        store.addMedia(new Book("Clean Code", "Robert C. Martin", 39.99f));
        store.addMedia(new Book("Design Patterns", "Gang of Four", 54.99f));

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setTitle("Store");
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options");

        JMenuItem viewStore = new JMenuItem("View Store");
        viewStore.addActionListener((java.awt.event.ActionEvent evt) -> {
            System.out.println("View Store clicked");
        });
        menu.add(viewStore);
        JMenu smUpdateStore = new JMenu("Update Store");
        JMenuItem addBook = new JMenuItem("Add Book");

        JTextField titleField = new JTextField();
        JTextField costField = new JTextField();
        JTextField categoryField = new JTextField();

        addBook.addActionListener((ActionEvent evt) -> {
            System.out.println("Add Book clicked");

            titleField.setText("");
            categoryField.setText("");
            costField.setText("");

            JTextField authorField = new JTextField();

            JPanel panel = new JPanel(new GridLayout(3, 2));
            panel.add(new JLabel("Title:"));
            panel.add(titleField);
            panel.add(new JLabel("Category:"));
            panel.add(categoryField);
            panel.add(new JLabel("Cost:"));
            panel.add(costField);

            int result = JOptionPane.showConfirmDialog(this, panel, "Add Book", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION)
                store.addMedia(new Book(titleField.getText(), authorField.getText(), Float.parseFloat(costField.getText())));

            System.gc();
        });
        JMenuItem addCD = new JMenuItem("Add CD");
        addCD.addActionListener((ActionEvent evt) -> {
            System.out.println("Add CD clicked");

            titleField.setText("");
            categoryField.setText("");
            costField.setText("");

            JTextField artistField = new JTextField();
            JTextField lengthField = new JTextField();

            JPanel panel = new JPanel(new GridLayout(6, 2));
            panel.add(new JLabel("Title:"));
            panel.add(titleField);
            panel.add(new JLabel("Category:"));
            panel.add(categoryField);
            panel.add(new JLabel("Artist:"));
            panel.add(artistField);
            panel.add(new JLabel("Cost:"));
            panel.add(costField);
            panel.add(new JLabel("Length:"));
            panel.add(lengthField);

            int result = JOptionPane.showConfirmDialog(this, panel, "Add CD", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION)
                store.addMedia(new CD(titleField.getText(), categoryField.getText(), artistField.getText(), Integer.parseInt(lengthField.getText()), Float.parseFloat(costField.getText())));

            System.gc();
        });
        JMenuItem addDVD = new JMenuItem("Add DVD");
        addDVD.addActionListener((ActionEvent evt) -> {
            System.out.println("Add DVD clicked");

            titleField.setText("");
            categoryField.setText("");
            costField.setText("");

            JTextField directorField = new JTextField();
            JTextField lengthField = new JTextField();

            JPanel panel = new JPanel(new GridLayout(6, 2));
            panel.add(new JLabel("Title:"));
            panel.add(titleField);
            panel.add(new JLabel("Category:"));
            panel.add(categoryField);
            panel.add(new JLabel("Director:"));
            panel.add(directorField);
            panel.add(new JLabel("Cost:"));
            panel.add(costField);
            panel.add(new JLabel("Length:"));
            panel.add(lengthField);

            int result = JOptionPane.showConfirmDialog(this, panel, "Add DVD", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION)
                store.addMedia(new DVD(titleField.getText(), categoryField.getText(), directorField.getText(), Integer.parseInt(lengthField.getText()), Float.parseFloat(costField.getText())));
        });
        smUpdateStore.add(addBook);
        smUpdateStore.add(addCD);
        smUpdateStore.add(addDVD);
        menu.add(smUpdateStore);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }

    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }

    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3, 2, 2));

        ArrayList<Media> mediaInStore = store.getItemsInStore();

        list9Items(mediaInStore, center);

        return center;
    }

    private void list9Items(ArrayList<Media> mediaInStore, JPanel center) {
        for (int i = 0; i < 9 && i < mediaInStore.size(); i++) {
            Media media = mediaInStore.get(i);
            center.add(new MediaStore(media));
        }
    }

}
