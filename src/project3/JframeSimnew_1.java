/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ravih
 */
public class JframeSimnew_1 extends javax.swing.JFrame {

    /**
     * Creates new form JframeSim
     */
    String ScktTypes,Prcsrs,Mobos,Rams,Hdds,Ssds,Cases,Vgas,Psus,Kybrds,Mouses,Mntrs,Ccoolers,CoolerFs,Optcls,Spkrs,Hdsts,Sftwrs,JScktType,JPrcsr,JMobo,JRam,JHdd,JSsd,
            JCase,JVga,JPsu,JKybrd,JMouse,JMntr,JCcooler,JCoolerF,JOptcl,JSpkr,JHdst,JSftwr,TScktType,TPrcsr,TMobo,TRam,THdd,TSsd,TCase,TVga,TPsu,TKybrd,
            TMouse,TMntr,TCcooler,TCoolerF,TOptcl,TSpkr,THdst,TSftwr;
    int harga;
    
    private static ArrayList<String> Sockettype = new ArrayList<>(); 
    private static ArrayList<String> Processor = new ArrayList<>();
    private static ArrayList<String> Motherboard = new ArrayList<>();
    private static ArrayList<String> RAM = new ArrayList<>();
    private static ArrayList<String> HDD = new ArrayList<>();
    private static ArrayList<String> SSD = new ArrayList<>();
    private static ArrayList<String> Casing = new ArrayList<>();
    private static ArrayList<String> VGA = new ArrayList<>();
    private static ArrayList<String> PSU = new ArrayList<>();
    private static ArrayList<String> Keyboard = new ArrayList<>();
    private static ArrayList<String> MOUSE = new ArrayList<>();
    private static ArrayList<String> Monitor = new ArrayList<>();
    private static ArrayList<String> CPUCOOLER = new ArrayList<>();
    private static ArrayList<String> CoolerFan = new ArrayList<>();
    private static ArrayList<String> Optical = new ArrayList<>();
    private static ArrayList<String> Speaker = new ArrayList<>();
    private static ArrayList<String> Headset = new ArrayList<>();
    private static ArrayList<String> Software = new ArrayList<>();
    
    
    String CBsckttype[] = {"AM1(for AMD)", "AM3(for AMD)","AM3+(for AMD)","LGA 1150(for Intel)","LGA 1151(for Intel)","LGA 1155(for Intel)"};
    int Hrgsckttyp[] ={0,0,0,0,0,0};
    
    String CBprcsr [] = {"AMD Carrizzo A8-7680 3.5 Ghz 65W(Rp 698.000)","AMD Codafari A6-7480 3.7 Ghz 65W(Rp 480.000)","AMD Ryzen Threadripper 3970X 280W(Rp 36.999.000)",
        "Intel Core i7-4790 3.6Ghz(Rp 1.995.000)","Intel Core i5-4460 3,2Ghz(Rp 860.000)","Intel Core i7-7700K 4.2Ghz(Rp 5.200.000)","-(0)"};
    int Hrgprcsr[] = {698000, 480000, 36999000, 1995000, 860000, 5200000, 0}; //Checked
    
    String CBmobo [] = {"Colorful Battle axe v14 (Rp 750.000)","ASRock FM2A68M-DG+(Rp654.000)","Gigabyte X399 Aorus Pro (Rp 3.960.000)","Intel E-Series Server Board S2600CW2R (Rp 4.695.000)",
    "Team Elite Plus DDR3 PC12800 (1x8GB) (Rp 595.000)","Asus Workstation C621E (Rp 10.900.000)","-(0)"};
    int HrgMobo[] = {750000, 654000, 3960000, 4695000, 8330000, 10900000,0}; //checked
    
    String CBRam [] = {"Avexir DDR3 Core Red PC12800 (1x8GB) (Rp 540.000)","Avexir DDR4 Raiden Series PC24000(2x8GB) (Rp 1.400.000)","Corsair DDR4 Vengeance LPX PC21000 (2x8GB) (Rp 1.415.000)",
    "Team Elite Plus DDR3 PC 12800 (1x8GB) (Rp 595.000)","-(0)"};
    int HrgRam [] ={540000,1400000,1415000,595000,0}; //checked
    
    String CBHdd [] = {"WDC 1TB SATA3 64MB WD10EZEX (Rp 615.000)","WDC Purple 4TB WD40PURZ (Rp 1.415.000)", "Toshiba 2TB SATA3 7200RPM p300 (Rp 822.000)","Seagate 8TB for NAS ironWolf series (Rp 3.625.000)",
    "Seagate 500GB SATA3 Barracuda Series (Rp 590.000),-(0)"};
    int HrgHdd [] = {615000, 1415000, 822000, 3625000, 590000, 0}; //checked
    
    String CBSsd[] = {"LaCie 500GB SSD Rugged T (Rp 5.799.000)", "Galax 120GB SSD Gamer L (Rp 325.000)","Adata 512GB SATA3 SSD (Rp 1.167.000)","Corsair 960GB CSSD-F960GBMP300 (Rp 2.435.000)",
    "Biostar SSD S-100 240GB (Rp 637.000)","-(0)"};
    int HrgSsd[] = {5799000, 325000, 1167000, 2435000, 637000, 0}; //checked
    
    String CBCase[] = {"Cube Gaming Weis V2 12CM Rainbow Fan (RP 420.000)","Rajintek Nestor Black 3x12CM fan (Rp 550.000)","Segotep Gaming Case Warship Eva (Rp 450.000)","be quiet! Gaming Case 601 (Rp 2.300.000)",
    "Bitfenix Shinobi XL window white (Rp 2.100.000)","-(0)"};
    int HrgCase [] = {420000, 550000, 450000, 2300000, 2100000, 0 }; //checked
    
    String CBVga [] = {"Galax Geforce GTX 1070 3GB (Rp 2.800.000)","FirePro S7150CG 8GB (Rp 17.025.000)","Manli Geforce GTX 1070Ti 8GB (Rp 4.610.000)","Asus Geforce 1050Ti 4GB (Rp 2.920.000)","Leadtek Quadro Pascal P2000 5GB (Rp 7.725.000)","-(0)"};
    int HrgVga [] = {2800000, 17025000, 4610000, 2920000,7725000, 0}; //checked
    
        String CBPsu [] = {"1stPlayer Gaming PSU 600W PS-600AX (Rp800.000)","Cougar Gaming 550W GX-S550 (Rp 1.021.000)","Super Flower SF550F 14MT (Rp 1.010.000)","Antec VP Series 500W(Rp 530.000)","Corsair CXM Series 7 750W (Rp 1.530.000)","-(0)"};
    int HrgPsu [] = {800000, 1021000,1010000, 530000, 1530000, 0}; //checked
    
    String CBKyb [] ={"Cougar Mechanical Gaming Keyboard X3 MX(Rp 1.292.000)","Aula Gaming Keyboard SI-882 (Rp 450.000)","Logitech Classic Keyboard K120(Rp 105.000)","Roccat RYOS MK Pro(Rp 1.775.000)","Digital Alliance Meca RGB (Rp 500.000)","Power Logic Airpad 1 (Rp 225.000)","-(0)"};   
    int HrgKyb [] = {1292000, 450000, 105000, 1775000,500000, 225000, 0}; //checked
    
    String CBMou [] = {"Cougar Gaming Mouse 450M(Rp 530.000)","Logitech G102 Prodigy gaming mouse (Rp 245.000)","Gamdias GMS500 Dameter(Rp 114.000)","Roccat Tyon (Rp 1.200.000)","Gamdias ZEUS-M1 (Rp 349.000)","-(0)"};
    int HrgMou [] = {530000,245000,114000,1200000,349000,0}; //checked
    
    String CBMon [] = {"ACER 19.5 Inch K202HQL LED Wide Screen(Rp 935.000)","AOC 23.6 Inch E2470SWH (Rp 1.560.000)","ASUS MB169b+ 15.6 Inch Portable LED(Rp 3.420.000)","BenQ ZOWIE 24 Inch XL2411P(Rp 3.465.000)","LG 22 Inch LED 22MK430H(Rp 1.253.000)","-(0)"};
    int HrgMon [] = {935000, 1560000, 3420000, 3465000, 1253000, 0}; //checked
    
    String CBCco [] = {"Antec A30 92mm(Rp 280.000)","CRYORIG H5 universal XT140(Rp 700.000)"," bequiet! pure rock cooling(Rp 550.000)","1stPlayer steampunk DC245ST(Rp 880.000)","Rajintek Aidos CPU cooler(Rp 320.000)","SEGOTEP Frost Castle (Rp 60.000)","-(0)"};
    int HrgCco [] = {280000,700000,550000,880000,320000,60000,0}; //checked
    
    String CBCoo [] = {"CRYORIG 14CM PWM FAN(Rp 230.000)","Antec TrueQuiet UFO RING LED(Rp. 185.000)","SEGOTEP fan cooling green LED(Rp 60.000)", "Corsair HD120 RGB(Rp 605.000)","Deepcool XFAN 12cm(Rp 50.000)","-(0)"};
    int HrgCoo [] = {230000,185000,60000,605000,50000,0}; //checked
    
    String CBOpt [] = {"Asus External DVD RW SDRW-08D2S (Rp 296.000)","LG DVDRW External Slim (Rp 280.000)","Lite-On DVDRW 24X SATA (OEM) (Rp 165.000)","Asus BlueRay Writer SBW-06D5H (Rp 1.645.000)","-(0)"};
    int HrgOpt [] = {296000,280000,165000,1645000,0}; //checked
    
    String CBSpe [] = {"AvarMedia Ballista Trinity (Rp 1.480.000)","Bose Companion 20 (Rp 6.000.000)","Dazumba Diva 38 (Rp 625.000)","Edifier C2 XD (Rp 1.590.000)","JBL Voyager (Rp 2.900.000)","Logitech Z313 (Rp 400.000)","-(0)"};
    int HrgSpe [] = {1480000,6000000,625000,1590000,2900000,400000,0}; //checked
    
    String CBHea [] = {"AKG K374 (Rp 1.210.000)","Biostar IDEQ N20 (Rp 99.000)","BOSE Soundlink On Ear (Rp 4.500.000)","AX 180 Gaming Headset UK version (Rp 1.150.000)","Edifier Headphone Series M815 (Rp 400.000)","-(0)"}; 
    int HrgHea [] = {1210000,99000,4500000,1150000,400000,0}; //checked
    
    String CBSof [] = {"Windows 10 Home (Rp 1.584.000)","Windows 10 Proffesional 64Bit (Rp 2.029.000)","Office 365 Personal (Rp 525.000)","ESET Antivirus NOD32 (Rp 210.000)","Office 2019 Home & Business (Rp 3.089.000)","-(0)"};
    int HrgSof [] = {1584000,2029000,525000,210000,3089000,0}; //checked
    
    
    public JframeSimnew_1() {
        initComponents();
    }
  
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Scktyp = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        Prcsr = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        Mobo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        Ram = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        Hdd = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        Ssd = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        Case = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        Vga = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        Psu = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        Kybrd = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        Mouse = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        Mntr = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        Ccooler = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        CoolerF = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        Optcl = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        Spkr = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        Hdst = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        Sftwr = new javax.swing.JComboBox();
        TtlPrcsr = new javax.swing.JFormattedTextField();
        TtlMobo = new javax.swing.JFormattedTextField();
        TtlRam = new javax.swing.JFormattedTextField();
        TtlHDD = new javax.swing.JFormattedTextField();
        TtlSSD = new javax.swing.JFormattedTextField();
        TtlCase = new javax.swing.JFormattedTextField();
        TtlVGA = new javax.swing.JFormattedTextField();
        TtlPSU = new javax.swing.JFormattedTextField();
        TtlKybrd = new javax.swing.JFormattedTextField();
        TtlMouse = new javax.swing.JFormattedTextField();
        TtlMntr = new javax.swing.JFormattedTextField();
        TtlCcooler = new javax.swing.JFormattedTextField();
        TotalCoolerF = new javax.swing.JFormattedTextField();
        TtlOptcl = new javax.swing.JFormattedTextField();
        TtlSpeaker = new javax.swing.JFormattedTextField();
        TtlHeadset = new javax.swing.JFormattedTextField();
        TtlSftwr = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        Total_ALL = new javax.swing.JFormattedTextField();
        Jmlprcsr = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        JmlMobo = new javax.swing.JTextField();
        JmlRam = new javax.swing.JTextField();
        JmlHDD = new javax.swing.JTextField();
        JmlSSD = new javax.swing.JTextField();
        JmlCase = new javax.swing.JTextField();
        JmlVGA = new javax.swing.JTextField();
        JmlPSU = new javax.swing.JTextField();
        JmlKybrd = new javax.swing.JTextField();
        JmlMouse = new javax.swing.JTextField();
        JmlMntr = new javax.swing.JTextField();
        JmlCcooler = new javax.swing.JTextField();
        JumlahCoolerF = new javax.swing.JTextField();
        JmlOptcl = new javax.swing.JTextField();
        JmlSpeaker = new javax.swing.JTextField();
        JmlHeadset = new javax.swing.JTextField();
        JmlSftwr = new javax.swing.JTextField();
        Btm_jf = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setForeground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Gadugi", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SIMULASI RAKIT PC");

        jLabel21.setFont(new java.awt.Font("Gadugi", 2, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("MEMBERI KEBEBASAN DAN MENCEGAH KERAGUAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(674, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addContainerGap())
        );

        jLabel2.setText("CHOOSE SOCKET TYPE");

        Scktyp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AM1\t(for AMD)", "AM3\t(for AMD)", "AM3+\t(for AMD)", "LGA1150\t(for Intel)", "LGA1151\t(for Intel)", "LGA1155\t(for Intel)" }));
        Scktyp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ScktypMouseReleased(evt);
            }
        });
        Scktyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScktypActionPerformed(evt);
            }
        });

        jLabel3.setText("CHOOSE PROCESSOR");

        Prcsr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AMD Carrizzo A8-7680 3.5 Ghz 65W(Rp 698.000)", "AMD Codafari A6-7480 3.7 Ghz 65W(Rp 480.000)", "AMD Ryzen Threadripper 3970X 280W(Rp 36.999.000)", "Intel Core i7-4790 3.6Ghz (Rp 1.995.000)", "Intel Core i5-4460 3,2Ghz(Rp 860.000)", "Intel Core i7-7700K 4.2Ghz(Rp 5.200.000)", "-(0)" }));

        jLabel4.setText("CHOOSE MOTHERBOARD");

        Mobo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Colorful Battle axe v14 (Rp 750.000)", "ASRock FM2A68M-DG+(Rp 654.000)", "Gigabyte X399 Aorus Pro (Rp 3.960.000)", "Intel E-Series Server Board S2600CW2R (Rp 4.695.000)", "Gigabyte C621-SD8 (Rp 8.330.000)", "Asus Workstation C621E (Rp 10.900.000)", "-(0)" }));

        jLabel5.setText("CHOOSE RAM");

        Ram.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Avexir DDR3 Core Red PC12800 (1x8GB) (Rp 540.000)", "Avexir DDR4 Raiden Series PC24000(2x8GB) (Rp 1.400.000)", "Corsair DDR4 Vengeance LPX PC21000 (2x8GB) (Rp 1.415.000)", "Team Elite Plus DDR3 PC12800 (1x8GB) (Rp 595.000)", "-(0)" }));

        jLabel6.setText("CHOOSE HARD DISK");

        Hdd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "WDC 1TB SATA3 64MB WD10EZEX (Rp 615.000)", "WDC Purple 4TB WD40PURZ (Rp 1.415.000)", "Toshiba 2TB SATA3 7200RPM p300 (Rp 822.000)", "Seagate 8TB for NAS ironWolf series (Rp 3.625.000)", "Seagate 500GB SATA3 Barracuda Series (Rp 590.000)", "-(0)" }));

        jLabel7.setText("CHOOSE SSD");

        Ssd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "LaCie 500GB SSD Rugged T (Rp 5.799.000)", "Galax 120GB SSD Gamer L (Rp 325.000)", "Adata 512GB SATA3 SSD (Rp 1.167.000)", "Corsair 960GB CSSD-F960GBMP300 (Rp 2.435.000)", "Biostar SSD S-100 240GB (Rp 637.000)", "-(0)" }));

        jLabel8.setText("CHOOSE CASING");

        Case.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cube Gaming Weis V2 12CM Rainbow Fan (RP 420.000)", "Rajintek Nestor Black 3x12CM fan (Rp 550.000)", "Segotep Gaming Case Warship Eva (Rp 450.000)", "be quiet! Gaming Case 601 (Rp 2.300.000)", "Bitfenix Shinobi XL window white (Rp 2.100.000)", "-(0)" }));

        jLabel9.setText("CHOOSE VGA");

        Vga.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Galax Geforce GTX 1070 3GB (Rp 2.800.000)", "FirePro S7150CG 8GB (Rp 17.025.000)", "Manli Geforce GTX 1070Ti 8GB (Rp 4.610.000)", "Asus Geforce 1050Ti 4GB (Rp 2.920.000)", "Leadtek Quadro Pascal P2000 5GB (Rp 7.725.000)", "-(0)" }));

        jLabel10.setText("CHOOSE PSU");

        Psu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1stPlayer Gaming PSU 600W PS-600AX (Rp800.000)", "Cougar Gaming 550W GX-S550 (Rp 1.021.000)", "Super Flower SF550F14MT (Rp 1.010.000)", "Antec VP Series 500W (Rp 530.000)", "Corsair CXM Series 7 750W (Rp 1.530.000)", "-(0)" }));

        jLabel11.setText("CHOOSE KEYBOARD");

        Kybrd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cougar Mechanical Gaming Keyboard X3 MX (Rp 1.292.000)", "Aula Gaming Keyboard SI-882 (Rp 450.000)", "Logitech Classic Keyboard K120 (Rp 105.000)", "Roccat RYOS MK Pro (Rp 1.775.000)", "Digital Alliance Meca RGB (Rp 500.000)", "Powerlogic Airpad 1 (Rp 225.000)", "-(0)" }));

        jLabel12.setText("CHOOSE MOUSE");

        Mouse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cougar Gaming Mouse 450M (Rp 530.000)", "Logitech G102 Prodigy gaming mouse (Rp 245.000)", "Gamdias GMS500 Dameter (Rp 114.000)", "Roccat Tyon (Rp 1.200.000)", "Gamdias ZEUS-M1 (Rp 349.000)", "-(0)" }));

        jLabel13.setText("CHOOSE MONITOR");

        Mntr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ACER 19.5\" K202HQL LED Wide Screen (Rp 935.000)", "AOC 23.6\" E2470SWH (Rp 1.560.000)", "ASUS MB169B+ 15.6\" Portable LED (Rp. 3.420.000)", "BenQ ZOWIE 24\" XL2411P (Rp 3.465.000)", "LG 22\" LED 22MK430H (Rp 1.253.000)", "-(0)" }));

        jLabel14.setText("CHOOSE CPU COOLER");

        Ccooler.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Antec A30 92mm (Rp 280.000)", "CRYORIG H5 universal XT140 (Rp 700.000)", "bequiet! pure rock cooling (Rp 550.000)", "1stPlayer steampunk DC2425ST (Rp 880.000)", "Rajintek Aidos CPU cooler (Rp 320.000)", "SEGOTEP Frost Castle (Rp 60.000)", "-(0)", " " }));

        jLabel15.setText("CHOOSE COOLER FAN");

        CoolerF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CRYORIG 14CM PWM FAN (Rp 230.000)", "Antec TrueQuiet UFO RING LED (Rp. 185.000)", "SEGOTEP fan cooling green LED (Rp 60.000)", "Corsair HD120 RGB (Rp 605.000)", "Deepcool XFAN 12cm (Rp 50.000)", "-(0)" }));

        jLabel16.setText("CHOOSE OPTICAL");

        Optcl.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Asus External DVD RW SDRW-08D2S (Rp 296.000)", "LG DVDRW External Slim (Rp 280.000)", "Lite-On DVDRW 24X SATA (OEM) (Rp 165.000)", "Asus BlueRay Writer SBW-06D5H (Rp 1.645.000)", "-(0)" }));

        jLabel17.setText("CHOOSE SPEAKER");

        Spkr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AvarMedia Ballista Trinity (Rp 1.480.000)", "Bose Companion 20 (Rp 6.000.000)", "Dazumba Diva 38 (Rp 625.000)", "Edifier C2 XD (Rp 1.590.000)", "JBL Voyager (Rp 2.900.000)", "Logitech Z313 (Rp 400.000)", "-(0)" }));

        jLabel18.setText("CHOOSE HEADSET");

        Hdst.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AKG K374 (Rp 1.210.000)", "Biostar IDEQ N20 (Rp 99.000)", "BOSE Soundlink On Ear (Rp 4.500.000)", "AX 180 Gaming Headset UK version (Rp 1.150.000)", "Edifier Headphone Series M815 (Rp 400.000)", "-(0)" }));

        jLabel19.setText("CHOOSE SOFTWARE");

        Sftwr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Windows 10 Home (Rp 1.584.000)", "Windows 10 Proffesional 64Bit (Rp 2.029.000)", "Office 365 Personal (Rp 525.000)", "ESET Antivirus NOD32 (Rp 210.000)", "Office 2019 Home & Business (Rp 3.089.000)", "-(0)" }));

        TtlPrcsr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TtlPrcsrMouseClicked(evt);
            }
        });
        TtlPrcsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TtlPrcsrActionPerformed(evt);
            }
        });

        TtlMobo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TtlMoboMouseClicked(evt);
            }
        });
        TtlMobo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TtlMoboActionPerformed(evt);
            }
        });

        TtlRam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TtlRamMouseClicked(evt);
            }
        });
        TtlRam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TtlRamActionPerformed(evt);
            }
        });

        TtlHDD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TtlHDDMouseClicked(evt);
            }
        });
        TtlHDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TtlHDDActionPerformed(evt);
            }
        });

        TtlSSD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TtlSSDMouseClicked(evt);
            }
        });

        TtlCase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TtlCaseMouseClicked(evt);
            }
        });
        TtlCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TtlCaseActionPerformed(evt);
            }
        });

        TtlVGA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TtlVGAMouseClicked(evt);
            }
        });
        TtlVGA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TtlVGAActionPerformed(evt);
            }
        });

        TtlPSU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TtlPSUMouseClicked(evt);
            }
        });
        TtlPSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TtlPSUActionPerformed(evt);
            }
        });

        TtlKybrd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TtlKybrdMouseClicked(evt);
            }
        });
        TtlKybrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TtlKybrdActionPerformed(evt);
            }
        });

        TtlMouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TtlMouseMouseClicked(evt);
            }
        });

        TtlMntr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TtlMntrMouseClicked(evt);
            }
        });
        TtlMntr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TtlMntrActionPerformed(evt);
            }
        });

        TtlCcooler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TtlCcoolerMouseClicked(evt);
            }
        });
        TtlCcooler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TtlCcoolerActionPerformed(evt);
            }
        });

        TotalCoolerF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TotalCoolerFMouseClicked(evt);
            }
        });
        TotalCoolerF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalCoolerFActionPerformed(evt);
            }
        });

        TtlOptcl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TtlOptclMouseClicked(evt);
            }
        });
        TtlOptcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TtlOptclActionPerformed(evt);
            }
        });

        TtlSpeaker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TtlSpeakerMouseClicked(evt);
            }
        });
        TtlSpeaker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TtlSpeakerActionPerformed(evt);
            }
        });

        TtlHeadset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TtlHeadsetMouseClicked(evt);
            }
        });
        TtlHeadset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TtlHeadsetActionPerformed(evt);
            }
        });

        TtlSftwr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TtlSftwrMouseClicked(evt);
            }
        });
        TtlSftwr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TtlSftwrActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel20.setText("GRAND TOTAL");

        Total_ALL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Total_ALLMouseClicked(evt);
            }
        });

        Btm_jf.setText("BACK TO MENU");
        Btm_jf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btm_jfActionPerformed(evt);
            }
        });

        jLabel24.setText("*Choose -(0) if you not buy in combo box ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19))
                                .addGap(83, 83, 83)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Scktyp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Prcsr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Mobo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Ram, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Hdd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Ssd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Case, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Vga, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Psu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Kybrd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Mouse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Mntr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Ccooler, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CoolerF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Optcl, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Spkr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Hdst, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Sftwr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(JmlOptcl, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JmlSpeaker, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(JumlahCoolerF, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(JmlMouse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                        .addComponent(JmlKybrd)
                                        .addComponent(JmlCcooler, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JmlMntr)
                                        .addComponent(JmlCase)
                                        .addComponent(JmlVGA)
                                        .addComponent(JmlPSU)
                                        .addComponent(jTextField1)
                                        .addComponent(JmlSSD)
                                        .addComponent(JmlMobo, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JmlRam, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JmlHDD, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Jmlprcsr))
                                    .addComponent(JmlHeadset, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JmlSftwr, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel20))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TtlRam, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TtlPrcsr, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TtlMobo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TtlHeadset, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TtlSpeaker, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TtlCase, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TtlVGA, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TtlPSU, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TtlMouse, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TtlMntr, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TtlCcooler, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TotalCoolerF, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TtlOptcl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TtlKybrd, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TtlSftwr, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TtlSSD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(TtlHDD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(Total_ALL, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(Btm_jf))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel24)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Scktyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Prcsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Jmlprcsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TtlPrcsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Mobo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JmlMobo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TtlMobo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JmlRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TtlRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Hdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JmlHDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TtlHDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Ssd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JmlSSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TtlSSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Case, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JmlCase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TtlCase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Vga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JmlVGA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TtlVGA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Psu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JmlPSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TtlPSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Kybrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JmlKybrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TtlKybrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Mouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JmlMouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Mntr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JmlMntr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TtlMntr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Ccooler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JmlCcooler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TtlCcooler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CoolerF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JumlahCoolerF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TotalCoolerF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Optcl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JmlOptcl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TtlOptcl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Spkr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JmlSpeaker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TtlSpeaker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Hdst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JmlHeadset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TtlHeadset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Sftwr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JmlSftwr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TtlSftwr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(TtlMouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(Total_ALL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Btm_jf)
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel2);

        jLabel22.setText("Quantity");

        jLabel23.setText("Total Price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(65, 65, 65)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(330, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TtlPrcsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TtlPrcsrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TtlPrcsrActionPerformed

    private void TtlMoboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TtlMoboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TtlMoboActionPerformed

    private void TtlRamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TtlRamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TtlRamActionPerformed

    private void TtlHDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TtlHDDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TtlHDDActionPerformed

    private void TtlCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TtlCaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TtlCaseActionPerformed

    private void TtlVGAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TtlVGAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TtlVGAActionPerformed

    private void TtlPSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TtlPSUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TtlPSUActionPerformed

    private void TtlKybrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TtlKybrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TtlKybrdActionPerformed

    private void TtlMntrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TtlMntrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TtlMntrActionPerformed

    private void TtlCcoolerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TtlCcoolerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TtlCcoolerActionPerformed

    private void TotalCoolerFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalCoolerFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalCoolerFActionPerformed

    private void TtlOptclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TtlOptclActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TtlOptclActionPerformed

    private void TtlSpeakerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TtlSpeakerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TtlSpeakerActionPerformed

    private void TtlHeadsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TtlHeadsetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TtlHeadsetActionPerformed

    private void TtlSftwrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TtlSftwrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TtlSftwrActionPerformed

    private void ScktypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScktypActionPerformed
        // TODO add your handling code here:
      //  if(Scktyp.getSelected().equals("")) Scktyp.setText("-");
    }//GEN-LAST:event_ScktypActionPerformed

    private void TtlPrcsrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TtlPrcsrMouseClicked
// TODO add your handling code here:
       String  CBprcsr =(String) Prcsr.getSelectedItem();
       if("AMD Carrizzo A8-7680 3.5 Ghz 65W(Rp 698.000)".equals(CBprcsr))
       {
           int hargatot = Integer.parseInt(Jmlprcsr.getText())*Hrgprcsr[0];
           TtlPrcsr.setText(Integer.toString(hargatot));
       }
       else if("AMD Codafari A6-7480 3.7 Ghz 65W(Rp 480.000)".equals(CBprcsr))
       {
           int hargatot = Integer.parseInt(Jmlprcsr.getText())*Hrgprcsr[1];
           TtlPrcsr.setText(Integer.toString(hargatot));
       }
       else if("AMD Ryzen Threadripper 3970X 280W(Rp 36.999.000)".equals(CBprcsr))
       {
           int hargatot = Integer.parseInt(Jmlprcsr.getText())*Hrgprcsr[2];
           TtlPrcsr.setText(Integer.toString(hargatot));
       }
       else if("Intel Core i7-4790 3.6Ghz (Rp 1.995.000)".equals(CBprcsr))
       {
           int hargatot = Integer.parseInt(Jmlprcsr.getText())*Hrgprcsr[3];
           TtlPrcsr.setText(Integer.toString(hargatot));
       }
       else if("Intel Core i5-4460 3,2Ghz(Rp 860.000)".equals(CBprcsr))
       {
           int hargatot = Integer.parseInt(Jmlprcsr.getText())*Hrgprcsr[4];
           TtlPrcsr.setText(Integer.toString(hargatot));
       }
        else if("Intel Core i7-7700K 4.2Ghz(Rp 5.200.000)".equals(CBprcsr))
       {
           int hargatot = Integer.parseInt(Jmlprcsr.getText())*Hrgprcsr[5];
           TtlPrcsr.setText(Integer.toString(hargatot));
       }
        else 
       {
           int hargatot = Hrgprcsr[6];
           TtlPrcsr.setText(Integer.toString(hargatot));;
       }//checked
        
        
        
    }//GEN-LAST:event_TtlPrcsrMouseClicked

    private void TtlMoboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TtlMoboMouseClicked
        // TODO add your handling code here:
        String CBMobo = (String) Mobo.getSelectedItem();
        if("Colorful Battle axe v14 (Rp 750.000)".equals(CBMobo))
       {
           int hargatotal = Integer.parseInt(JmlMobo.getText())*HrgMobo[0];
           TtlMobo.setText(Integer.toString(hargatotal));
       }
        else if("ASRock FM2A68M-DG+(Rp 654.000)".equals(CBMobo))
       {
           int hargatotal = Integer.parseInt(JmlMobo.getText())*HrgMobo[1];
           TtlMobo.setText(Integer.toString(hargatotal));
       }
        else if("Gigabyte X399 Aorus Pro (Rp 3.960.000)".equals(CBMobo))
       {
           int hargatotal = Integer.parseInt(JmlMobo.getText())*HrgMobo[2];
           TtlMobo.setText(Integer.toString(hargatotal));
       }
          else if("Intel E-Series Server Board S2600CW2R (Rp 4.695.000)".equals(CBMobo))
       {
           int hargatotal = Integer.parseInt(JmlMobo.getText())*HrgMobo[3];
           TtlMobo.setText(Integer.toString(hargatotal));
       }
          else  if("Gigabyte C621-SD8 (Rp 8.330.000)".equals(CBMobo))
       {
           int hargatotal = Integer.parseInt(JmlMobo.getText())*HrgMobo[4];
           TtlMobo.setText(Integer.toString(hargatotal));
       }
            else if("Asus Workstation C621E (Rp 10.900.000)".equals(CBMobo))
       {
           int hargatotal = Integer.parseInt(JmlMobo.getText())*HrgMobo[5];
           TtlMobo.setText(Integer.toString(hargatotal));
       }
             else 
       {
           int hargatotal = HrgMobo[6];
           TtlMobo.setText(Integer.toString(hargatotal));
       } //checked
           
    }//GEN-LAST:event_TtlMoboMouseClicked

    private void TtlRamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TtlRamMouseClicked
        // TODO add your handling code here:
        String CBRam = (String) Ram.getSelectedItem();
        if("Avexir DDR3 Core Red PC12800 (1x8GB) (Rp 540.000)".equals(CBRam))
       {
           int hargatotal1 = Integer.parseInt(JmlRam.getText())*HrgRam[0];
           TtlRam.setText(Integer.toString(hargatotal1));
       }
        else if("Avexir DDR4 Raiden Series PC24000(2x8GB) (Rp 1.400.000)".equals(CBRam))
       {
           int hargatotal1 = Integer.parseInt(JmlRam.getText())*HrgRam[1];
           TtlRam.setText(Integer.toString(hargatotal1));
       }
        else if("Corsair DDR4 Vengeance LPX PC21000 (2x8GB) (Rp 1.415.000)".equals(CBRam))
       {
           int hargatotal1 = Integer.parseInt(JmlRam.getText())*HrgRam[2];
           TtlRam.setText(Integer.toString(hargatotal1));
       }
        else if("Team Elite Plus DDR3 PC12800 (1x8GB) (Rp 595.000)".equals(CBRam))
       {
           int hargatotal1 = Integer.parseInt(JmlRam.getText())*HrgRam[3];
           TtlRam.setText(Integer.toString(hargatotal1));
       }
        else 
       {
           int hargatotal1 = HrgRam[4];
           TtlRam.setText(Integer.toString(hargatotal1));
       } //checked
        
    }//GEN-LAST:event_TtlRamMouseClicked

    private void TtlHDDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TtlHDDMouseClicked
        // TODO add your handling code here:
         String CBHdd = (String) Hdd.getSelectedItem();
          if("WDC 1TB SATA3 64MB WD10EZEX (Rp 615.000)".equals(CBHdd))
       {
           int hargatotal12 = Integer.parseInt(JmlHDD.getText())*HrgHdd[0];
           TtlHDD.setText(Integer.toString(hargatotal12));
       }
         else if("WDC Purple 4TB WD40PURZ (Rp 1.415.000)".equals(CBHdd))
       {
           int hargatotal12 = Integer.parseInt(JmlHDD.getText())*HrgHdd[1];
           TtlHDD.setText(Integer.toString(hargatotal12));
       }
         else if("Toshiba 2TB SATA3 7200RPM p300 (Rp 822.000)".equals(CBHdd))
       {
           int hargatotal12 = Integer.parseInt(JmlHDD.getText())*HrgHdd[2];
           TtlHDD.setText(Integer.toString(hargatotal12));
       }
         else if("Seagate 8TB for NAS ironWolf series (Rp 3.625.000)".equals(CBHdd))
       {
           int hargatotal12 = Integer.parseInt(JmlHDD.getText())*HrgHdd[3];
           TtlHDD.setText(Integer.toString(hargatotal12));
       }
         else if("Seagate 500GB SATA3 Barracuda Series (Rp 590.000)".equals(CBHdd))
       {
           int hargatotal12 = Integer.parseInt(JmlHDD.getText())*HrgHdd[4];
           TtlHDD.setText(Integer.toString(hargatotal12));
       }
          else 
       {
           int hargatotal12 = HrgHdd[5];
           TtlHDD.setText(Integer.toString(hargatotal12));
       } // checked
    }//GEN-LAST:event_TtlHDDMouseClicked

    private void TtlSSDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TtlSSDMouseClicked
        // TODO add your handling code here:
        String CBSsd = (String) Ssd.getSelectedItem();
            if("LaCie 500GB SSD Rugged T (Rp 5.799.000)".equals(CBSsd))
          {
              int hargatotal11 = Integer.parseInt(JmlSSD.getText())*HrgSsd[0];
              TtlSSD.setText(Integer.toString(hargatotal11));
          }
            else if("Galax 120GB SSD Gamer L (Rp 325.000)".equals(CBSsd))
          {
              int hargatotal11 = Integer.parseInt(JmlSSD.getText())*HrgSsd[1];
              TtlSSD.setText(Integer.toString(hargatotal11));
          }
             else if("Adata 512GB SATA3 SSD (Rp 1.167.000)".equals(CBSsd))
          {
              int hargatotal11 = Integer.parseInt(JmlSSD.getText())*HrgSsd[2];
              TtlSSD.setText(Integer.toString(hargatotal11));
          }
             else if("Corsair 960GB CSSD-F960GBMP300 (Rp 2.435.000)".equals(CBSsd))
          {
              int hargatotal11 = Integer.parseInt(JmlSSD.getText())*HrgSsd[3];
              TtlSSD.setText(Integer.toString(hargatotal11));
          }
             else if("Biostar SSD S-100 240GB (Rp 637.000)".equals(CBSsd))
          {
              int hargatotal11 = Integer.parseInt(JmlSSD.getText())*HrgSsd[4];
              TtlSSD.setText(Integer.toString(hargatotal11));
          }
             else 
          {
              int hargatotal11 = HrgSsd[5];
              TtlSSD.setText(Integer.toString(hargatotal11));
          }
           //checked
    }//GEN-LAST:event_TtlSSDMouseClicked

    private void TtlCaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TtlCaseMouseClicked
        // TODO add your handling code here:
        String CBCase = (String) Case.getSelectedItem();
        if("Cube Gaming Weis V2 12CM Rainbow Fan (RP 420.000)".equals(CBCase))
          {
              int hargatotal13 = Integer.parseInt(JmlCase.getText())*HrgCase[0];
              TtlCase.setText(Integer.toString(hargatotal13));
          }
        else if("Rajintek Nestor Black 3x12CM fan (Rp 550.000)".equals(CBCase))
          {
              int hargatotal13 = Integer.parseInt(JmlCase.getText())*HrgCase[1];
              TtlCase.setText(Integer.toString(hargatotal13));
          }
        else if("Segotep Gaming Case Warship Eva (Rp 450.000)".equals(CBCase))
          {
              int hargatotal13 = Integer.parseInt(JmlCase.getText())*HrgCase[2];
              TtlCase.setText(Integer.toString(hargatotal13));
          }
        else if("be quiet! Gaming Case 601 (Rp 2.300.000)".equals(CBCase))
          {
              int hargatotal13 = Integer.parseInt(JmlCase.getText())*HrgCase[3];
              TtlCase.setText(Integer.toString(hargatotal13));
          }
        else if("Bitfenix Shinobi XL window white (Rp 2.100.000)".equals(CBCase))
          {
              int hargatotal13 = Integer.parseInt(JmlCase.getText())*HrgCase[4];
              TtlCase.setText(Integer.toString(hargatotal13));
          }
        else 
          {
              int hargatotal13 = HrgCase[5];
              TtlCase.setText(Integer.toString(hargatotal13));
          }
        //checked
        
    }//GEN-LAST:event_TtlCaseMouseClicked

    private void TtlVGAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TtlVGAMouseClicked
        // TODO add your handling code here:
        String CBVga = (String) Vga.getSelectedItem();
        if("Galax Geforce GTX 1070 3GB (Rp 2.800.000)".equals(CBVga))
          {
              int hargatotal2 = Integer.parseInt(JmlVGA.getText())*HrgVga[0];
              TtlVGA.setText(Integer.toString(hargatotal2));
          }
       else if("FirePro S7150CG 8GB (Rp 17.025.000)".equals(CBVga))
          {
              int hargatotal2 = Integer.parseInt(JmlVGA.getText())*HrgVga[1];
              TtlVGA.setText(Integer.toString(hargatotal2));
          }
        else if("Manli Geforce GTX 1070Ti 8GB (Rp 4.610.000)".equals(CBVga))
          {
              int hargatotal2 = Integer.parseInt(JmlVGA.getText())*HrgVga[2];
              TtlVGA.setText(Integer.toString(hargatotal2));
          }
        else if("Asus Geforce 1050Ti 4GB (Rp 2.920.000)".equals(CBVga))
          {
              int hargatotal2 = Integer.parseInt(JmlVGA.getText())*HrgVga[3];
              TtlVGA.setText(Integer.toString(hargatotal2));
          }
        else if("Leadtek Quadro Pascal P2000 5GB (Rp 7.725.000)".equals(CBVga))
          {
              int hargatotal2 = Integer.parseInt(JmlVGA.getText())*HrgVga[4];
              TtlVGA.setText(Integer.toString(hargatotal2));
          }
        else 
          {
              int hargatotal2 = HrgVga[5];
              TtlVGA.setText(Integer.toString(hargatotal2));
          } //checked
        
    }//GEN-LAST:event_TtlVGAMouseClicked

    private void TtlPSUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TtlPSUMouseClicked
        // TODO add your handling code here:
        String CBPsu = (String) Psu.getSelectedItem();
        if("1stPlayer Gaming PSU 600W PS-600AX (Rp800.000)".equals(CBPsu))
          {
              int hargatotal11 = Integer.parseInt(JmlPSU.getText())*HrgPsu[0];
              TtlPSU.setText(Integer.toString(hargatotal11));
          }
        else if("Cougar Gaming 550W GX-S550 (Rp 1.021.000)".equals(CBPsu))
          {
              int hargatotal11 = Integer.parseInt(JmlPSU.getText())*HrgPsu[1];
              TtlPSU.setText(Integer.toString(hargatotal11));
          }
          else if("Super Flower SF550F14MT (Rp 1.010.000)".equals(CBPsu))
          {
              int hargatotal11 = Integer.parseInt(JmlPSU.getText())*HrgPsu[2];
              TtlPSU.setText(Integer.toString(hargatotal11));
          }
          else if("Antec VP Series 500W (Rp 530.000)".equals(CBPsu))
          {
              int hargatotal11 = Integer.parseInt(JmlPSU.getText())*HrgPsu[3];
              TtlPSU.setText(Integer.toString(hargatotal11));
          }
          else if("Corsair CXM Series 7 750W (Rp 1.530.000)".equals(CBPsu))
          {
              int hargatotal11 = Integer.parseInt(JmlPSU.getText())*HrgPsu[4];
              TtlPSU.setText(Integer.toString(hargatotal11));
          }
          else 
          {
              int hargatotal11 = HrgPsu[5];
              TtlPSU.setText(Integer.toString(hargatotal11));
          } //checked
    }//GEN-LAST:event_TtlPSUMouseClicked

    private void TtlKybrdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TtlKybrdMouseClicked
        // TODO add your handling code here:
        String CBKyb = (String) Kybrd.getSelectedItem();
        if("Cougar Mechanical Gaming Keyboard X3 MX (Rp 1.292.000)".equals(CBKyb))
          {
              int hargatotal3 = Integer.parseInt(JmlKybrd.getText())*HrgKyb[0];
              TtlKybrd.setText(Integer.toString(hargatotal3));
          }
       else if("Aula Gaming Keyboard SI-882 (Rp 450.000)".equals(CBKyb))
          {
              int hargatotal3 = Integer.parseInt(JmlKybrd.getText())*HrgKyb[1];
              TtlKybrd.setText(Integer.toString(hargatotal3));
          }
        else if("Logitech Classic Keyboard K120 (Rp 105.000)".equals(CBKyb))
          {
              int hargatotal3 = Integer.parseInt(JmlKybrd.getText())*HrgKyb[2];
              TtlKybrd.setText(Integer.toString(hargatotal3));
          }
        else if("Roccat RYOS MK Pro (Rp 1.775.000)".equals(CBKyb))
          {
              int hargatotal3 = Integer.parseInt(JmlKybrd.getText())*HrgKyb[3];
              TtlKybrd.setText(Integer.toString(hargatotal3));
          }
        else if("Digital Alliance Meca RGB (Rp 500.000)".equals(CBKyb))
          {
              int hargatotal3 = Integer.parseInt(JmlKybrd.getText())*HrgKyb[4];
              TtlKybrd.setText(Integer.toString(hargatotal3));
          }
        else if("Powerlogic Airpad 1 (Rp 225.000)".equals(CBKyb))
          {
              int hargatotal3 = Integer.parseInt(JmlKybrd.getText())*HrgKyb[5];
              TtlKybrd.setText(Integer.toString(hargatotal3));
          }
        else 
          {
              int hargatotal3 = HrgKyb[6];
              TtlKybrd.setText(Integer.toString(hargatotal3));
          } //checked
    }//GEN-LAST:event_TtlKybrdMouseClicked

    private void TtlMouseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TtlMouseMouseClicked
        // TODO add your handling code here:
        String CBMou = (String) Mouse.getSelectedItem();
        if("Cougar Gaming Mouse 450M (Rp 530.000)".equals(CBMou))
          {
              int hargatotal4 = Integer.parseInt(JmlMouse.getText())*HrgMou[0];
              TtlMouse.setText(Integer.toString(hargatotal4));
          }
       else if("Logitech G102 Prodigy gaming mouse (Rp 245.000)".equals(CBMou))
          {
              int hargatotal4 = Integer.parseInt(JmlMouse.getText())*HrgMou[1];
              TtlMouse.setText(Integer.toString(hargatotal4));
          }
        else if("Gamdias GMS500 Dameter(Rp 114.000)".equals(CBMou))
          {
              int hargatotal4 = Integer.parseInt(JmlMouse.getText())*HrgMou[2];
              TtlMouse.setText(Integer.toString(hargatotal4));
          }
        else if("Roccat Tyon (Rp 1.200.000)".equals(CBMou))
          {
              int hargatotal4 = Integer.parseInt(JmlMouse.getText())*HrgMou[3];
              TtlMouse.setText(Integer.toString(hargatotal4));
          }
        else if("Gamdias ZEUS-M1 (Rp 349.000)".equals(CBMou))
          {
              int hargatotal4 = Integer.parseInt(JmlMouse.getText())*HrgMou[4];
              TtlMouse.setText(Integer.toString(hargatotal4));
          }
        else 
          {
              int hargatotal4 = HrgMou[5];
              TtlMouse.setText(Integer.toString(hargatotal4));
          } //checked
    }//GEN-LAST:event_TtlMouseMouseClicked

    private void TtlMntrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TtlMntrMouseClicked
        // TODO add your handling code here:
        String CBMon = (String) Mntr.getSelectedItem();
        if("ACER 19.5\" K202HQL LED Wide Screen (Rp 935.000)".equals(CBMon))
          {
              int hargatotal18 = Integer.parseInt(JmlMntr.getText())*HrgMon[0];
              TtlMntr.setText(Integer.toString(hargatotal18));
          }
        else if("AOC 23.6\" E2470SWH (Rp 1.560.000)".equals(CBMon))
          {
              int hargatotal18 = Integer.parseInt(JmlMntr.getText())*HrgMon[1];
              TtlMntr.setText(Integer.toString(hargatotal18));
          }
        else if("ASUS MB169B+ 15.6\" Portable LED (Rp. 3.420.000)".equals(CBMon))
          {
              int hargatotal18 = Integer.parseInt(JmlMntr.getText())*HrgMon[2];
              TtlMntr.setText(Integer.toString(hargatotal18));
          }
        else if("BenQ ZOWIE 24\" XL2411P (Rp 3.465.000)".equals(CBMon))
          {
              int hargatotal18 = Integer.parseInt(JmlMntr.getText())*HrgMon[3];
              TtlMntr.setText(Integer.toString(hargatotal18));
          }
        else if("LG 22\" LED 22MK430H (Rp 1.253.000)".equals(CBMon))
          {
              int hargatotal18 = Integer.parseInt(JmlMntr.getText())*HrgMon[4];
              TtlMntr.setText(Integer.toString(hargatotal18));
          }
        else 
          {
              int hargatotal18 = HrgMon[5];
              TtlMntr.setText(Integer.toString(hargatotal18));
          }
        
    }//GEN-LAST:event_TtlMntrMouseClicked

    private void TtlCcoolerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TtlCcoolerMouseClicked
        // TODO add your handling code here:
        String CBCco = (String) Ccooler.getSelectedItem();
        if("Antec A30 92mm (Rp 280.000)".equals(CBCco))
          {
              int hargatotal33 = Integer.parseInt(JmlCcooler.getText())*HrgCco[0];
              TtlCcooler.setText(Integer.toString(hargatotal33));
          }
       else if("CRYORIG H5 universal XT140 (Rp 700.000)".equals(CBCco))
          {
              int hargatotal33 = Integer.parseInt(JmlCcooler.getText())*HrgCco[1];
              TtlCcooler.setText(Integer.toString(hargatotal33));
          }
        else if("bequiet! pure rock cooling (Rp 550.000)".equals(CBCco))
          {
              int hargatotal33 = Integer.parseInt(JmlCcooler.getText())*HrgCco[2];
              TtlCcooler.setText(Integer.toString(hargatotal33));
          }
        else if("1stPlayer steampunk DC2425ST (Rp 880.000)".equals(CBCco))
          {
              int hargatotal33 = Integer.parseInt(JmlCcooler.getText())*HrgCco[3];
              TtlCcooler.setText(Integer.toString(hargatotal33));
          }
        else if("Rajintek Aidos CPU cooler (Rp 320.000)".equals(CBCco))
          {
              int hargatotal33 = Integer.parseInt(JmlCcooler.getText())*HrgCco[4];
              TtlCcooler.setText(Integer.toString(hargatotal33));
          }
        else if("SEGOTEP Frost Castle (Rp 60.000)".equals(CBCco))
          {
              int hargatotal33 = Integer.parseInt(JmlCcooler.getText())*HrgCco[5];
              TtlCcooler.setText(Integer.toString(hargatotal33));
          }
        else 
          {
              int hargatotal33 = HrgCco[6];
              TtlCcooler.setText(Integer.toString(hargatotal33));
          }
    }//GEN-LAST:event_TtlCcoolerMouseClicked

    private void TotalCoolerFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TotalCoolerFMouseClicked
        // TODO add your handling code here:
        String CBCoo = (String) CoolerF.getSelectedItem();
            if("CRYORIG 14CM PWM FAN (Rp 230.000)".equals(CBCoo))
          {
              int hargatotal22 = Integer.parseInt(JumlahCoolerF.getText())*HrgCoo[0];
              TotalCoolerF.setText(Integer.toString(hargatotal22));
          }
            else if("Antec TrueQuiet UFO RING LED (Rp. 185.000)".equals(CBCoo))
          {
              int hargatotal22 = Integer.parseInt(JumlahCoolerF.getText())*HrgCoo[1];
              TotalCoolerF.setText(Integer.toString(hargatotal22));
          }
            else if("SEGOTEP fan cooling green LED (Rp 60.000)".equals(CBCoo))
          {
              int hargatotal22 = Integer.parseInt(JumlahCoolerF.getText())*HrgCoo[2];
              TotalCoolerF.setText(Integer.toString(hargatotal22));
          }
            else if("Corsair HD120 RGB (Rp 605.000)".equals(CBCoo))
          {
              int hargatotal22 = Integer.parseInt(JumlahCoolerF.getText())*HrgCoo[3];
              TotalCoolerF.setText(Integer.toString(hargatotal22));
          }
            else if("Deepcool XFAN 12cm (Rp 50.000)".equals(CBCoo))
          {
              int hargatotal22 = Integer.parseInt(JumlahCoolerF.getText())*HrgCoo[4];
              TotalCoolerF.setText(Integer.toString(hargatotal22));
          }
            else 
          {
              int hargatotal22 = HrgCoo[5];
              TotalCoolerF.setText(Integer.toString(hargatotal22));
          }
    }//GEN-LAST:event_TotalCoolerFMouseClicked

    private void TtlOptclMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TtlOptclMouseClicked
        // TODO add your handling code here:
        String CBOpt = (String) Optcl.getSelectedItem();
        if("Asus External DVD RW SDRW-08D2S (Rp 296.000)".equals(CBOpt))
          {
              int hargatotal11 = Integer.parseInt(JmlOptcl.getText())*HrgOpt[0];
              TtlOptcl.setText(Integer.toString(hargatotal11));
          }
        else if("LG DVDRW External Slim (Rp 280.000)".equals(CBOpt))
          {
              int hargatotal11 = Integer.parseInt(JmlOptcl.getText())*HrgOpt[1];
              TtlOptcl.setText(Integer.toString(hargatotal11));
          }
         else if("Lite-On DVDRW 24X SATA (OEM) (Rp 165.000)".equals(CBOpt))
          {
              int hargatotal11 = Integer.parseInt(JmlOptcl.getText())*HrgOpt[2];
              TtlOptcl.setText(Integer.toString(hargatotal11));
          }
         else if("Asus BlueRay Writer SBW-06D5H (Rp 1.645.000)".equals(CBOpt))
          {
              int hargatotal11 = Integer.parseInt(JmlOptcl.getText())*HrgOpt[3];
              TtlOptcl.setText(Integer.toString(hargatotal11));
          }
         else 
          {
              int hargatotal11 = HrgOpt[4];
              TtlOptcl.setText(Integer.toString(hargatotal11));
          }
    }//GEN-LAST:event_TtlOptclMouseClicked

    private void TtlSpeakerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TtlSpeakerMouseClicked
        // TODO add your handling code here:
        String CBSpe = (String) Spkr.getSelectedItem();
        if("AvarMedia Ballista Trinity (Rp 1.480.000)".equals(CBSpe))
          {
              int hargatotal18 = Integer.parseInt(JmlSpeaker.getText())*HrgSpe[0];
              TtlSpeaker.setText(Integer.toString(hargatotal18));
          }
        else if("Bose Companion 20 (Rp 6.000.000)".equals(CBSpe))
          {
              int hargatotal18 = Integer.parseInt(JmlSpeaker.getText())*HrgSpe[1];
              TtlSpeaker.setText(Integer.toString(hargatotal18));
          }
        else if("Dazumba Diva 38 (Rp 625.000)".equals(CBSpe))
          {
              int hargatotal18 = Integer.parseInt(JmlSpeaker.getText())*HrgSpe[2];
              TtlSpeaker.setText(Integer.toString(hargatotal18));
          }
        else if("Edifier C2 XD (Rp 1.590.000)".equals(CBSpe))
          {
              int hargatotal18 = Integer.parseInt(JmlSpeaker.getText())*HrgSpe[3];
              TtlSpeaker.setText(Integer.toString(hargatotal18));
          }
        else if("JBL Voyager (Rp 2.900.000)".equals(CBSpe))
          {
              int hargatotal18 = Integer.parseInt(JmlSpeaker.getText())*HrgSpe[4];
              TtlSpeaker.setText(Integer.toString(hargatotal18));
          }
        else if("Logitech Z313 (Rp 400.000)".equals(CBSpe))
          {
              int hargatotal18 = Integer.parseInt(JmlSpeaker.getText())*HrgSpe[5];
              TtlSpeaker.setText(Integer.toString(hargatotal18));
          }
        else 
          {
              int hargatotal18 = HrgSpe[6];
              TtlSpeaker.setText(Integer.toString(hargatotal18));
          }
    }//GEN-LAST:event_TtlSpeakerMouseClicked

    private void TtlHeadsetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TtlHeadsetMouseClicked
        // TODO add your handling code here:
        String CBHea = (String) Hdst.getSelectedItem();
        if("AKG K374 (Rp 1.210.000)".equals(CBHea))
          {
              int hargatotal111 = Integer.parseInt(JmlHeadset.getText())*HrgHea[0];
              TtlHeadset.setText(Integer.toString(hargatotal111));
          }
        else if("Biostar IDEQ N20 (Rp 99.000)".equals(CBHea))
          {
              int hargatotal111 = Integer.parseInt(JmlHeadset.getText())*HrgHea[1];
              TtlHeadset.setText(Integer.toString(hargatotal111));
          }
        else if("BOSE Soundlink On Ear (Rp 4.500.000)".equals(CBHea))
          {
              int hargatotal111 = Integer.parseInt(JmlHeadset.getText())*HrgHea[2];
              TtlHeadset.setText(Integer.toString(hargatotal111));
          }
        else if("AX 180 Gaming Headset UK version (Rp 1.150.000)".equals(CBHea))
          {
              int hargatotal111 = Integer.parseInt(JmlHeadset.getText())*HrgHea[3];
              TtlHeadset.setText(Integer.toString(hargatotal111));
          }
        else if("Edifier Headphone Series M815 (Rp 400.000)".equals(CBHea))
          {
              int hargatotal111 = Integer.parseInt(JmlHeadset.getText())*HrgHea[4];
              TtlHeadset.setText(Integer.toString(hargatotal111));
          }
        else if("-(0)".equals(CBHea))
          {
              int hargatotal111 = HrgHea[5];
              TtlHeadset.setText(Integer.toString(hargatotal111));
          }
        
    }//GEN-LAST:event_TtlHeadsetMouseClicked

    private void TtlSftwrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TtlSftwrMouseClicked
        // TODO add your handling code here:
        String CBSof = (String) Sftwr.getSelectedItem();
        if("Windows 10 Home (Rp 1.584.000)".equals(CBSof))
          {
              int hargatotal32 = Integer.parseInt(JmlSftwr.getText())*HrgSof[0];
              TtlSftwr.setText(Integer.toString(hargatotal32));
          }
        else if("Windows 10 Proffesional 64Bit (Rp 2.029.000)".equals(CBSof))
          {
              int hargatotal32 = Integer.parseInt(JmlSftwr.getText())*HrgSof[1];
              TtlSftwr.setText(Integer.toString(hargatotal32));
          }
        else if("Office 365 Personal (Rp 525.000)".equals(CBSof))
          {
              int hargatotal32 = Integer.parseInt(JmlSftwr.getText())*HrgSof[2];
              TtlSftwr.setText(Integer.toString(hargatotal32));
          }
        else if("ESET Antivirus NOD32 (Rp 210.000)".equals(CBSof))
          {
              int hargatotal32 = Integer.parseInt(JmlSftwr.getText())*HrgSof[3];
              TtlSftwr.setText(Integer.toString(hargatotal32));
          }
        else if("Office 2019 Home & Business (Rp 3.089.000)".equals(CBSof))
          {
              int hargatotal32 = Integer.parseInt(JmlSftwr.getText())*HrgSof[4];
              TtlSftwr.setText(Integer.toString(hargatotal32));
          }
        else 
          {
              int hargatotal32 = HrgSof[5];
              TtlSftwr.setText(Integer.toString(hargatotal32));
          }
    }//GEN-LAST:event_TtlSftwrMouseClicked

    private void Total_ALLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Total_ALLMouseClicked
        // TODO add your handling code here:
        int totalall = Integer.parseInt(TtlPrcsr.getText()) + Integer.parseInt(TtlMobo.getText()) + Integer.parseInt(TtlRam.getText()) + Integer.parseInt(TtlHDD.getText()) + 
                Integer.parseInt(TtlSSD.getText()) + Integer.parseInt(TtlCase.getText()) + Integer.parseInt(TtlVGA.getText()) + Integer.parseInt(TtlPSU.getText())
               + Integer.parseInt(TtlKybrd.getText()) + Integer.parseInt(TtlMouse.getText()) + Integer.parseInt(TtlMntr.getText()) + Integer.parseInt(TtlCcooler.getText()) + 
                Integer.parseInt(TotalCoolerF.getText()) + Integer.parseInt(TtlOptcl.getText()) + Integer.parseInt(TtlSpeaker.getText()) + Integer.parseInt(TtlHeadset.getText()) 
                + Integer.parseInt(TtlSftwr.getText()) ;
        Total_ALL.setText(Integer.toString(totalall));
    }//GEN-LAST:event_Total_ALLMouseClicked

    private void Btm_jfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btm_jfActionPerformed
        // TODO add your handling code here:
        new JFrameMenu().setVisible(true);
        hide();
    }//GEN-LAST:event_Btm_jfActionPerformed

    private void ScktypMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScktypMouseReleased
        // TODO add your handling code here:
     
        
    }//GEN-LAST:event_ScktypMouseReleased

     
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
            java.util.logging.Logger.getLogger(JframeSimnew_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JframeSimnew_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JframeSimnew_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JframeSimnew_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JframeSimnew_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btm_jf;
    private javax.swing.JComboBox Case;
    private javax.swing.JComboBox Ccooler;
    private javax.swing.JComboBox CoolerF;
    private javax.swing.JComboBox Hdd;
    private javax.swing.JComboBox Hdst;
    private javax.swing.JTextField JmlCase;
    private javax.swing.JTextField JmlCcooler;
    private javax.swing.JTextField JmlHDD;
    private javax.swing.JTextField JmlHeadset;
    private javax.swing.JTextField JmlKybrd;
    private javax.swing.JTextField JmlMntr;
    private javax.swing.JTextField JmlMobo;
    private javax.swing.JTextField JmlMouse;
    private javax.swing.JTextField JmlOptcl;
    private javax.swing.JTextField JmlPSU;
    private javax.swing.JTextField JmlRam;
    private javax.swing.JTextField JmlSSD;
    private javax.swing.JTextField JmlSftwr;
    private javax.swing.JTextField JmlSpeaker;
    private javax.swing.JTextField JmlVGA;
    private javax.swing.JTextField Jmlprcsr;
    private javax.swing.JTextField JumlahCoolerF;
    private javax.swing.JComboBox Kybrd;
    private javax.swing.JComboBox Mntr;
    private javax.swing.JComboBox Mobo;
    private javax.swing.JComboBox Mouse;
    private javax.swing.JComboBox Optcl;
    private javax.swing.JComboBox Prcsr;
    private javax.swing.JComboBox Psu;
    private javax.swing.JComboBox Ram;
    private javax.swing.JComboBox Scktyp;
    private javax.swing.JComboBox Sftwr;
    private javax.swing.JComboBox Spkr;
    private javax.swing.JComboBox Ssd;
    private javax.swing.JFormattedTextField TotalCoolerF;
    private javax.swing.JFormattedTextField Total_ALL;
    private javax.swing.JFormattedTextField TtlCase;
    private javax.swing.JFormattedTextField TtlCcooler;
    private javax.swing.JFormattedTextField TtlHDD;
    private javax.swing.JFormattedTextField TtlHeadset;
    private javax.swing.JFormattedTextField TtlKybrd;
    private javax.swing.JFormattedTextField TtlMntr;
    private javax.swing.JFormattedTextField TtlMobo;
    private javax.swing.JFormattedTextField TtlMouse;
    private javax.swing.JFormattedTextField TtlOptcl;
    private javax.swing.JFormattedTextField TtlPSU;
    private javax.swing.JFormattedTextField TtlPrcsr;
    private javax.swing.JFormattedTextField TtlRam;
    private javax.swing.JFormattedTextField TtlSSD;
    private javax.swing.JFormattedTextField TtlSftwr;
    private javax.swing.JFormattedTextField TtlSpeaker;
    private javax.swing.JFormattedTextField TtlVGA;
    private javax.swing.JComboBox Vga;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
