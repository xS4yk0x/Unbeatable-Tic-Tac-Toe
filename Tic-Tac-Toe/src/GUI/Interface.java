/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Classes.Board;
import Classes.Person;
import Classes.Player;
import java.awt.Color;

/**
 *
 * @author Eslam M.Ashour
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public static char currentPlayer = '-';
    Player player;
    Player player2;
    public static boolean gameOver = false;
    public Interface() {
        initComponents();
        
    }
/*        player = new Person('x',0,"Eslam");
        player2 = new Person('o',0,"Ahmed");
        currentPlayer = 'x';
        oButton.setEnabled(false);*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        winText = new javax.swing.JLabel();
        placesPlane = new javax.swing.JPanel();
        placeOnePlane = new javax.swing.JPanel();
        placeOne = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        placeTwoPlane = new javax.swing.JPanel();
        placeTwo = new javax.swing.JLabel();
        placeThreePlane = new javax.swing.JPanel();
        placeThree = new javax.swing.JLabel();
        placeFourPlane = new javax.swing.JPanel();
        placeFour = new javax.swing.JLabel();
        placeFivePlane = new javax.swing.JPanel();
        placeFive = new javax.swing.JLabel();
        placeSixPlane = new javax.swing.JPanel();
        placeSix = new javax.swing.JLabel();
        placeEightPlane = new javax.swing.JPanel();
        placeEight = new javax.swing.JLabel();
        placeNinePlane = new javax.swing.JPanel();
        placeNine = new javax.swing.JLabel();
        placeSevenPlane = new javax.swing.JPanel();
        placeSeven = new javax.swing.JLabel();
        xoButtons = new javax.swing.JPanel();
        xPlane = new javax.swing.JPanel();
        xLabel = new javax.swing.JLabel();
        oPlane = new javax.swing.JPanel();
        oLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        winText.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        winText.setForeground(new java.awt.Color(255, 0, 0));

        placeOnePlane.setBackground(new java.awt.Color(102, 204, 0));
        placeOnePlane.setPreferredSize(new java.awt.Dimension(80, 80));
        placeOnePlane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                placeOnePlaneMousePressed(evt);
            }
        });

        placeOne.setForeground(new java.awt.Color(255, 255, 255));
        placeOne.setText("1");

        javax.swing.GroupLayout placeOnePlaneLayout = new javax.swing.GroupLayout(placeOnePlane);
        placeOnePlane.setLayout(placeOnePlaneLayout);
        placeOnePlaneLayout.setHorizontalGroup(
            placeOnePlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(placeOnePlaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(placeOnePlaneLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(placeOne)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        placeOnePlaneLayout.setVerticalGroup(
            placeOnePlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(placeOnePlaneLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(placeOne)
                .addGap(81, 81, 81)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        placeTwoPlane.setBackground(new java.awt.Color(102, 204, 0));
        placeTwoPlane.setPreferredSize(new java.awt.Dimension(80, 80));
        placeTwoPlane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                placeTwoPlaneMousePressed(evt);
            }
        });

        placeTwo.setForeground(new java.awt.Color(255, 255, 255));
        placeTwo.setText("2");

        javax.swing.GroupLayout placeTwoPlaneLayout = new javax.swing.GroupLayout(placeTwoPlane);
        placeTwoPlane.setLayout(placeTwoPlaneLayout);
        placeTwoPlaneLayout.setHorizontalGroup(
            placeTwoPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(placeTwoPlaneLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(placeTwo)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        placeTwoPlaneLayout.setVerticalGroup(
            placeTwoPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(placeTwoPlaneLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(placeTwo)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        placeThreePlane.setBackground(new java.awt.Color(102, 204, 0));
        placeThreePlane.setPreferredSize(new java.awt.Dimension(80, 80));
        placeThreePlane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                placeThreePlaneMousePressed(evt);
            }
        });

        placeThree.setForeground(new java.awt.Color(255, 255, 255));
        placeThree.setText("3");

        javax.swing.GroupLayout placeThreePlaneLayout = new javax.swing.GroupLayout(placeThreePlane);
        placeThreePlane.setLayout(placeThreePlaneLayout);
        placeThreePlaneLayout.setHorizontalGroup(
            placeThreePlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(placeThreePlaneLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(placeThree)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        placeThreePlaneLayout.setVerticalGroup(
            placeThreePlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, placeThreePlaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(placeThree)
                .addGap(31, 31, 31))
        );

        placeFourPlane.setBackground(new java.awt.Color(102, 204, 0));
        placeFourPlane.setPreferredSize(new java.awt.Dimension(80, 80));
        placeFourPlane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                placeFourPlaneMousePressed(evt);
            }
        });

        placeFour.setForeground(new java.awt.Color(255, 255, 255));
        placeFour.setText("4");

        javax.swing.GroupLayout placeFourPlaneLayout = new javax.swing.GroupLayout(placeFourPlane);
        placeFourPlane.setLayout(placeFourPlaneLayout);
        placeFourPlaneLayout.setHorizontalGroup(
            placeFourPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(placeFourPlaneLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(placeFour)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        placeFourPlaneLayout.setVerticalGroup(
            placeFourPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, placeFourPlaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(placeFour)
                .addGap(29, 29, 29))
        );

        placeFivePlane.setBackground(new java.awt.Color(102, 204, 0));
        placeFivePlane.setPreferredSize(new java.awt.Dimension(80, 80));
        placeFivePlane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                placeFivePlaneMousePressed(evt);
            }
        });

        placeFive.setForeground(new java.awt.Color(255, 255, 255));
        placeFive.setText("5");

        javax.swing.GroupLayout placeFivePlaneLayout = new javax.swing.GroupLayout(placeFivePlane);
        placeFivePlane.setLayout(placeFivePlaneLayout);
        placeFivePlaneLayout.setHorizontalGroup(
            placeFivePlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(placeFivePlaneLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(placeFive)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        placeFivePlaneLayout.setVerticalGroup(
            placeFivePlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, placeFivePlaneLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(placeFive)
                .addGap(30, 30, 30))
        );

        placeSixPlane.setBackground(new java.awt.Color(102, 204, 0));
        placeSixPlane.setPreferredSize(new java.awt.Dimension(80, 80));
        placeSixPlane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                placeSixPlaneMousePressed(evt);
            }
        });

        placeSix.setForeground(new java.awt.Color(255, 255, 255));
        placeSix.setText("6");

        javax.swing.GroupLayout placeSixPlaneLayout = new javax.swing.GroupLayout(placeSixPlane);
        placeSixPlane.setLayout(placeSixPlaneLayout);
        placeSixPlaneLayout.setHorizontalGroup(
            placeSixPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(placeSixPlaneLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(placeSix)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        placeSixPlaneLayout.setVerticalGroup(
            placeSixPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, placeSixPlaneLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(placeSix)
                .addGap(30, 30, 30))
        );

        placeEightPlane.setBackground(new java.awt.Color(102, 204, 0));
        placeEightPlane.setPreferredSize(new java.awt.Dimension(80, 80));
        placeEightPlane.setRequestFocusEnabled(false);
        placeEightPlane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                placeEightPlaneMousePressed(evt);
            }
        });

        placeEight.setForeground(new java.awt.Color(255, 255, 255));
        placeEight.setText("8");
        placeEight.setAlignmentY(0.0F);

        javax.swing.GroupLayout placeEightPlaneLayout = new javax.swing.GroupLayout(placeEightPlane);
        placeEightPlane.setLayout(placeEightPlaneLayout);
        placeEightPlaneLayout.setHorizontalGroup(
            placeEightPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(placeEightPlaneLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(placeEight)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        placeEightPlaneLayout.setVerticalGroup(
            placeEightPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, placeEightPlaneLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(placeEight)
                .addGap(31, 31, 31))
        );

        placeNinePlane.setBackground(new java.awt.Color(102, 204, 0));
        placeNinePlane.setPreferredSize(new java.awt.Dimension(80, 80));
        placeNinePlane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                placeNinePlaneMousePressed(evt);
            }
        });

        placeNine.setForeground(new java.awt.Color(255, 255, 255));
        placeNine.setText("9");

        javax.swing.GroupLayout placeNinePlaneLayout = new javax.swing.GroupLayout(placeNinePlane);
        placeNinePlane.setLayout(placeNinePlaneLayout);
        placeNinePlaneLayout.setHorizontalGroup(
            placeNinePlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(placeNinePlaneLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(placeNine)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        placeNinePlaneLayout.setVerticalGroup(
            placeNinePlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(placeNinePlaneLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(placeNine)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        placeSevenPlane.setBackground(new java.awt.Color(102, 204, 0));
        placeSevenPlane.setPreferredSize(new java.awt.Dimension(80, 80));
        placeSevenPlane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                placeSevenPlaneMousePressed(evt);
            }
        });

        placeSeven.setForeground(new java.awt.Color(255, 255, 255));
        placeSeven.setText("7");

        javax.swing.GroupLayout placeSevenPlaneLayout = new javax.swing.GroupLayout(placeSevenPlane);
        placeSevenPlane.setLayout(placeSevenPlaneLayout);
        placeSevenPlaneLayout.setHorizontalGroup(
            placeSevenPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(placeSevenPlaneLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(placeSeven)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        placeSevenPlaneLayout.setVerticalGroup(
            placeSevenPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, placeSevenPlaneLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(placeSeven)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout placesPlaneLayout = new javax.swing.GroupLayout(placesPlane);
        placesPlane.setLayout(placesPlaneLayout);
        placesPlaneLayout.setHorizontalGroup(
            placesPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(placesPlaneLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(placesPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(placeFourPlane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placeSevenPlane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placeOnePlane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(placesPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(placesPlaneLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(placesPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(placeFivePlane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(placeTwoPlane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(placesPlaneLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(placeEightPlane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(placesPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, placesPlaneLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(placeThreePlane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0))
                    .addGroup(placesPlaneLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(placesPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(placeSixPlane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(placeNinePlane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 158, Short.MAX_VALUE))
        );
        placesPlaneLayout.setVerticalGroup(
            placesPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(placesPlaneLayout.createSequentialGroup()
                .addGroup(placesPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(placeTwoPlane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(placeThreePlane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(placeOnePlane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(placesPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(placesPlaneLayout.createSequentialGroup()
                        .addGroup(placesPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(placeFourPlane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(placeSixPlane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, placesPlaneLayout.createSequentialGroup()
                        .addComponent(placeFivePlane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(placesPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(placeNinePlane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placeEightPlane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placeSevenPlane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        xoButtons.setLayout(new java.awt.GridLayout());

        xPlane.setBackground(new java.awt.Color(255, 0, 0));
        xPlane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                xPlaneMousePressed(evt);
            }
        });

        xLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        xLabel.setText("x");

        javax.swing.GroupLayout xPlaneLayout = new javax.swing.GroupLayout(xPlane);
        xPlane.setLayout(xPlaneLayout);
        xPlaneLayout.setHorizontalGroup(
            xPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xPlaneLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(xLabel)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        xPlaneLayout.setVerticalGroup(
            xPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, xPlaneLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(xLabel)
                .addContainerGap())
        );

        xoButtons.add(xPlane);

        oPlane.setBackground(new java.awt.Color(102, 204, 0));
        oPlane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                oPlaneMousePressed(evt);
            }
        });

        oLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        oLabel.setText("O");

        javax.swing.GroupLayout oPlaneLayout = new javax.swing.GroupLayout(oPlane);
        oPlane.setLayout(oPlaneLayout);
        oPlaneLayout.setHorizontalGroup(
            oPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oPlaneLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(oLabel)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        oPlaneLayout.setVerticalGroup(
            oPlaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oPlaneLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(oLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        xoButtons.add(oPlane);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(winText, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(xoButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(placesPlane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(66, 66, 66))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(placesPlane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xoButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(winText, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );

        jPanel1.add(jPanel2, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void placeOnePlaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeOnePlaneMousePressed
        if(Board.legalPlay(0)&&currentPlayer!='-'&&!gameOver)
        {
            placeOne.setText(Character.toString(currentPlayer));
            Board.assignPlay(currentPlayer,0);
            if(Board.checkWin(currentPlayer)) 
            {
                if(player.letter == currentPlayer)  winText.setText(player.name+" has won");
                else winText.setText(player2.name+" has won");
                gameOver=true;
            }
            placeOnePlane.setEnabled(false);
            placeOnePlane.setBackground(Color.red);
            if(currentPlayer=='x') currentPlayer='o';
            else currentPlayer='x';
        }    
        
    }//GEN-LAST:event_placeOnePlaneMousePressed

    private void placeNinePlaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeNinePlaneMousePressed
                if(Board.legalPlay(8)&&currentPlayer!='-'&&!gameOver)
        {
            placeNine.setText(Character.toString(currentPlayer));
            Board.assignPlay(currentPlayer,8);
                                    if(Board.checkWin(currentPlayer)) 
            {
                if(player.letter == currentPlayer)  winText.setText(player.name+" has won");
                else winText.setText(player2.name+" has won");
                gameOver=true;
            }
            placeNinePlane.setEnabled(false);
            placeNinePlane.setBackground(Color.red);
            if(currentPlayer=='x') currentPlayer='o';
            else currentPlayer='x';
        }    
        
    }//GEN-LAST:event_placeNinePlaneMousePressed

    private void placeTwoPlaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeTwoPlaneMousePressed
                if(Board.legalPlay(1)&&currentPlayer!='-'&&!gameOver)
        {
            placeTwo.setText(Character.toString(currentPlayer));
            Board.assignPlay(currentPlayer,1);
                                    if(Board.checkWin(currentPlayer)) 
            {
                if(player.letter == currentPlayer)  winText.setText(player.name+" has won");
                else winText.setText(player2.name+" has won");
                gameOver=true;
            }
            placeTwoPlane.setEnabled(false);
            placeTwoPlane.setBackground(Color.red);
            if(currentPlayer=='x') currentPlayer='o';
            else currentPlayer='x';
        }    
        
    }//GEN-LAST:event_placeTwoPlaneMousePressed

    private void placeThreePlaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeThreePlaneMousePressed
                if(Board.legalPlay(2)&&currentPlayer!='-'&&!gameOver)
        {
            placeThree.setText(Character.toString(currentPlayer));
            Board.assignPlay(currentPlayer,2);
                                    if(Board.checkWin(currentPlayer)) 
            {
                if(player.letter == currentPlayer)  winText.setText(player.name+" has won");
                else winText.setText(player2.name+" has won");
                gameOver=true;
            }
            placeThreePlane.setEnabled(false);
            placeThreePlane.setBackground(Color.red);
            if(currentPlayer=='x') currentPlayer='o';
            else currentPlayer='x';
        }    
        
    }//GEN-LAST:event_placeThreePlaneMousePressed

    private void placeFourPlaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeFourPlaneMousePressed
                if(Board.legalPlay(3)&&currentPlayer!='-'&&!gameOver)
        {
            placeFour.setText(Character.toString(currentPlayer));
            Board.assignPlay(currentPlayer,3);
                                    if(Board.checkWin(currentPlayer)) 
            {
                if(player.letter == currentPlayer)  winText.setText(player.name+" has won");
                else winText.setText(player2.name+" has won");
                gameOver=true;
            }
            placeFourPlane.setEnabled(false);
            placeFourPlane.setBackground(Color.red);
            if(currentPlayer=='x') currentPlayer='o';
            else currentPlayer='x';
        }    
        
    }//GEN-LAST:event_placeFourPlaneMousePressed

    private void placeFivePlaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeFivePlaneMousePressed
                if(Board.legalPlay(4)&&currentPlayer!='-'&&!gameOver)
        {
            placeFive.setText(Character.toString(currentPlayer));
            Board.assignPlay(currentPlayer,4);
                                    if(Board.checkWin(currentPlayer)) 
            {
                if(player.letter == currentPlayer)  winText.setText(player.name+" has won");
                else winText.setText(player2.name+" has won");
                gameOver=true;
            }
            placeFivePlane.setEnabled(false);
            placeFivePlane.setBackground(Color.red);
            if(currentPlayer=='x') currentPlayer='o';
            else currentPlayer='x';
        }    
        
    }//GEN-LAST:event_placeFivePlaneMousePressed

    private void placeSixPlaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeSixPlaneMousePressed
                if(Board.legalPlay(5)&&currentPlayer!='-'&&!gameOver)
        {
            placeSix.setText(Character.toString(currentPlayer));
            Board.assignPlay(currentPlayer,5);
                                    if(Board.checkWin(currentPlayer)) 
            {
                if(player.letter == currentPlayer)  winText.setText(player.name+" has won");
                else winText.setText(player2.name+" has won");
                gameOver=true;
            }
            placeSixPlane.setEnabled(false);
            placeSixPlane.setBackground(Color.red);
            if(currentPlayer=='x') currentPlayer='o';
            else currentPlayer='x';
        }    
        
    }//GEN-LAST:event_placeSixPlaneMousePressed

    private void placeSevenPlaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeSevenPlaneMousePressed
                if(Board.legalPlay(6)&&currentPlayer!='-'&&!gameOver)
        {
            placeSeven.setText(Character.toString(currentPlayer));
            Board.assignPlay(currentPlayer,6);
                                    if(Board.checkWin(currentPlayer)) 
            {
                if(player.letter == currentPlayer)  winText.setText(player.name+" has won");
                else winText.setText(player2.name+" has won");
                gameOver=true;
            }
            placeSevenPlane.setEnabled(false);
            placeSevenPlane.setBackground(Color.red);
            if(currentPlayer=='x') currentPlayer='o';
            else currentPlayer='x';
        }    
        
    }//GEN-LAST:event_placeSevenPlaneMousePressed

    private void placeEightPlaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeEightPlaneMousePressed
                if(Board.legalPlay(7)&&currentPlayer!='-'&&!gameOver)
        {
            placeEight.setText(Character.toString(currentPlayer));
            Board.assignPlay(currentPlayer,7);
            if(Board.checkWin(currentPlayer)) 
            {
                if(player.letter == currentPlayer)  winText.setText(player.name+" has won");
                else winText.setText(player2.name+" has won");
                gameOver=true;
            }
            placeEightPlane.setEnabled(false);
            placeEightPlane.setBackground(Color.red);
            if(currentPlayer=='x') currentPlayer='o';
            else currentPlayer='x';

        }    
        
    }//GEN-LAST:event_placeEightPlaneMousePressed

    private void xPlaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xPlaneMousePressed
        player = new Person('x',0,"Eslam");
        player2 = new Person('o',0,"Ahmed");
        currentPlayer = 'x';
    }//GEN-LAST:event_xPlaneMousePressed

    private void oPlaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oPlaneMousePressed
        player = new Person('o',0,"Eslam");
        player2 = new Person('x',0,"Ahmed");
        currentPlayer = 'o';
    }//GEN-LAST:event_oPlaneMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel oLabel;
    private javax.swing.JPanel oPlane;
    private javax.swing.JLabel placeEight;
    private javax.swing.JPanel placeEightPlane;
    private javax.swing.JLabel placeFive;
    private javax.swing.JPanel placeFivePlane;
    private javax.swing.JLabel placeFour;
    private javax.swing.JPanel placeFourPlane;
    private javax.swing.JLabel placeNine;
    private javax.swing.JPanel placeNinePlane;
    private javax.swing.JLabel placeOne;
    private javax.swing.JPanel placeOnePlane;
    private javax.swing.JLabel placeSeven;
    private javax.swing.JPanel placeSevenPlane;
    private javax.swing.JLabel placeSix;
    private javax.swing.JPanel placeSixPlane;
    private javax.swing.JLabel placeThree;
    private javax.swing.JPanel placeThreePlane;
    private javax.swing.JLabel placeTwo;
    private javax.swing.JPanel placeTwoPlane;
    private javax.swing.JPanel placesPlane;
    private javax.swing.JLabel winText;
    private javax.swing.JLabel xLabel;
    private javax.swing.JPanel xPlane;
    private javax.swing.JPanel xoButtons;
    // End of variables declaration//GEN-END:variables
}