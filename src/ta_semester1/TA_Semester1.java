package ta_semester1;

import javax.swing.*;

public class TA_Semester1 {

    static String[] nama_t = new String[20];
    static String[] alamat = new String[20];
    static String[] nama_p = new String[20];
    static String[] jenis = new String[20];
    static String[] penjualan = new String[20];
    static String[] pembeli = new String[20];
    static String[] cabang = new String[20];
    static String[] web = new String[20];
    static String[] email = new String[20];
    static String[] telp = new String[20];
    static String[] status = new String[20];
    static int[] modal = new int[20];
    static int pilihan, ar, no, gh, ju, y1, hal;
    static String sumber, hari, bulan, tahun;
    static boolean ulang;
 
    static void kosong() {
        JOptionPane.showMessageDialog(null,
                "***********************************************               \n"
                + "                        DATA KOSONG                         \n"
                + "***********************************************             \n"
                + "                  SILAKAN INPUT DATA                        \n");
    }

    static void tambahan() {
        do {
            do {
                JOptionPane.showMessageDialog(null, "Silakan Input Lokasi Pengambilan Data          \n");
                sumber = JOptionPane.showInputDialog("Lokasi Pengambilan Data ", "JALAN VETERAN KRATON");
                if ("".equals(sumber)) {
                    ulang = true;
                } else {
                    ulang = false;
                }
            } while (ulang);
            do {
                JOptionPane.showMessageDialog(null, "Silakan Input Tanggal \n");
                hari = JOptionPane.showInputDialog("Input Hari", " JUM'AT  ");
                if ("".equals(hari)) {
                    ulang = true;
                } else {
                    ulang = false;
                }
            } while (ulang);
            do {
                bulan = JOptionPane.showInputDialog("Input Bulan", "DESEMBER\n");
                if ("".equals(bulan)) {
                    ulang = true;
                } else {
                    ulang = false;
                }
            } while (ulang);
            do {
                tahun = JOptionPane.showInputDialog("Input Tahun", "2018\n");
                if ("".equals(tahun)) {
                    ulang = true;
                } else {
                    ulang = false;
                }
            } while (ulang);
        } while (ulang);
    }

    static void menu() {
        String menu1 = "";
        do {
            pilihan = 0;
            menu1 = "";
            try {
                menu1 += "*******************************************\n";
                menu1 += "               MENU SISTEM PEDAGANG \n";
                menu1 += "                    KOTA PEKALONGAN \n";
                menu1 += "*******************************************\n";
                menu1 += "  1. INPUT DATA PEDAGANG \n";
                menu1 += "  2. EDIT DATA PEDAGANG \n";
                menu1 += "  3. HAPUS DATA PEDAGANG \n";
                menu1 += "  4. LAPORAN DATA PEDAGANG \n";
                menu1 += "  5. LAPORAN STATISTIK \n";
                menu1 += "  6. LAPORAN ALAMAT USAHA \n";
                menu1 += "  7. LAPORAN ALAMAT DAN STATUS \n";
                menu1 += "  8. EXIT \n";
                menu1 += "*******************************************\n";
                menu1 += "PILIH [1-8] =  \n";
                String pil = JOptionPane.showInputDialog(null, menu1, "MENU", JOptionPane.INFORMATION_MESSAGE);
                pilihan = Integer.parseInt(pil);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "*******************************************************              \n"
                        + "                           ANDA SALAH INPUT \n"
                        + "*******************************************************\n"
                        + "  Petunjuk :  MASUKAN ANGKA 1 - 8 SESUAI MENU \n");
            }
        } while (!(pilihan >= 1 & pilihan <= 8));
    }

    static void InputPedagang() {
        boolean ulang = true;

        JOptionPane.showMessageDialog(null, "^^ Silakan Melakuan Penginputan Data ^^");
        String pem, pen, cab, sta, je;
        int ju;
        String data1 = "";
        String usaha = "";
        String jual = "";
        String beli = "";
        String cabang2 = "";
        String status2 = "";
        String lagi = "Y";
        int modal2 = 0;
        int pe = ar;
        int pa = 0;
        int sa = 0;
        int ma = 0;
        int se = 0;
        int el = 0;
        int bb = 0;
        int ll = 0;
        int bp = 0;
        while (!(("T".equals(lagi) | ("t".equals(lagi))))) {
            pe++;
            if (pe < 15) {
                ar++;
//Nama Toko Input
                String nt = JOptionPane.showInputDialog("1.NAMA TOKO");
                nama_t[ar] = nt;
                //Alamat Input
                String al = JOptionPane.showInputDialog("2.ALAMAT");
                alamat[ar] = al;
//Nama Pemilik Input
                String np = JOptionPane.showInputDialog("3.NAMA PEMILIK");
                nama_p[ar] = np;
//Jenis Usaha Input        
                do {
                    je = JOptionPane.showInputDialog("1. PAKAIAN \n"
                            + "2. SARUNG \n"
                            + "3. MAKANAN \n"
                            + "4. SEPATU/TAS \n"
                            + "5. ELEKTRONIK \n"
                            + "6. BARANG BEKAS \n"
                            + "7. LAIN - LAIN \n"
                            + "===============================\n"
                            + "                4.JENIS USAHA (1-7) \n"
                            + "===============================\n");
                } while (!("1".equals(je) | ("2".equals(je) | ("3".equals(je)
                        | ("4".equals(je) | ("5".equals(je) | ("6".equals(je) | ("7".equals(je)))))))));

                ju = Integer.parseInt(je);

                if (ju == 1) {
                    usaha = "PAKAIAN";
                    pa++;
                } else if (ju == 2) {
                    usaha = "SARUNG";
                    sa++;

                } else if (ju == 3) {
                    usaha = "MAKANAN";
                    ma++;

                } else if (ju == 4) {
                    usaha = "SEPATU/TAS";
                    se++;

                } else if (ju == 5) {
                    usaha = "ELEKTRONIK";
                    el++;

                } else if (ju == 6) {
                    usaha = "BARANG BEKAS";
                    bb++;

                } else if (ju == 7) {
                    usaha = "LAIN - LAIN";
                    ll++;

                }
                jenis[ar] = usaha;
//Modal Input

                ulang = true;
                do {
                    try {
                        String mo = JOptionPane.showInputDialog("5.MODAL");
                        modal2 = Integer.parseInt(mo);
                        modal[ar] = modal2;
                        ulang = false;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,
                                "*******************************************************\n"
                                + "                           ANDA SALAH INPUT \n"
                                + "*******************************************************\n"
                                + "                     Petunjuk : Input Angka \n");

                    }
                } while (ulang);
//Penjualan Input
                do {
                    pen = JOptionPane.showInputDialog("6.PENJUALAN [D]=DALAM NEGRI / [L] = LUAR NEGERI / [S] = Keduanya)");
                } while (!("D".equals(pen) | ("d".equals(pen) | ("L".equals(pen)
                        | ("l".equals(pen) | ("S".equals(pen) | ("s".equals(pen))))))));

                if ("D".equals(pen) | ("d".equals(pen))) {
                    jual = "DALAM NEGERI";
                } else if ("L".equals(pen) | ("l".equals(pen))) {
                    jual = "LUAR NEGERI";
                } else if ("S".equals(pen) | ("s".equals(pen))) {
                    jual = "DALAM DAN LUAR NEGERI";
                }
                penjualan[ar] = jual;
//Pembelian Input
                do {
                    pem = JOptionPane.showInputDialog("7.PEMBELI([D]OMESTIK / [L]LUAR / [C]AMPURAN");
                } while (!("D".equals(pem) | ("d".equals(pem) | ("L".equals(pem)
                        | ("l".equals(pem) | ("C".equals(pem) | ("c".equals(pem))))))));
                if ("D".equals(pem) | ("d".equals(pem))) {
                    beli = "DOMESTIK";
                } else if ("L".equals(pem) | ("l".equals(pem))) {
                    beli = "LUAR";
                } else if ("C".equals(pem) | ("c".equals(pem))) {
                    beli = "CAMPURAN";
                }
                pembeli[ar] = beli;
//Cabang Input
                do {
                    cab = JOptionPane.showInputDialog("8.CABANG [T]IDAK ADA /[A]DA");
                } while (!("T".equals(cab) | ("t".equals(cab) | ("A".equals(cab)
                        | ("a".equals(cab))))));
                if ("T".equals(cab) | ("t".equals(cab))) {
                    cabang2 = "TIDAK ADA";
                } else if ("A".equals(cab) | ("a".equals(cab))) {
                    cabang2 = "ADA";
                }
//Web Input
                cabang[ar] = cabang2;
                String aweb = JOptionPane.showInputDialog("9.ALAMAT WEB");
                web[ar] = aweb;
//Email Input
                String aemail = JOptionPane.showInputDialog("10.ALAMAT EMAIL");
                email[ar] = aemail;
//Nomor Input
                String notelp = JOptionPane.showInputDialog("11.NO TELP TOKO");
                telp[ar] = notelp;

//Status Input         
                do {
                    sta = JOptionPane.showInputDialog("12.STATUS [N]IKAH / [B]ELUM ");
                } while (!("N".equals(sta) | ("n".equals(sta) | ("B".equals(sta)
                        | ("b".equals(sta))))));
                if ("N".equals(sta) | ("n".equals(sta))) {
                    status2 = "NIKAH";
                } else if ("B".equals(sta) | ("b".equals(sta))) {
                    status2 = "BELUM NIKAH";
                }
                status[ar] = status2;
//Laporan Input
                no++;
                data1 += "                   INPUT DATA PEDAGANG \n";
                data1 += "1. NAMA TOKO                :   " + nt + " \n";
                data1 += "2. ALAMAT                        :   " + al + " \n";
                data1 += "3. NAMA PEMILIK            :   " + np + "\n";
                data1 += "4. JENIS USAHA              :   " + usaha + " \n";
                data1 += "5. MODAL                         :   Rp. " + modal2 + " \n";
                data1 += "6. PENJUALAN                :   " + jual + " \n";
                data1 += "7. PEMBELI                       :   " + beli + " \n";
                data1 += "8. CABANG                        :   " + cabang2 + " \n";
                data1 += "9. ALAMAT WEB              :   " + aweb + " \n";
                data1 += "10. ALAMAT EMAIL         :   " + aemail + " \n";
                data1 += "11. NO TELP TOKO         :   " + notelp + " \n";
                data1 += "12. STATUS                      :   " + status2 + " \n";
                JOptionPane.showMessageDialog(null, data1, "DATA = " + no, JOptionPane.INFORMATION_MESSAGE);
                data1 = "";
            } else {
                JOptionPane.showMessageDialog(null, "Data Penuh");
                return;
            }
            lagi = JOptionPane.showInputDialog("INPUT LAGI DATA PEDAGANG [Y/T]");
        }
        return;
    }

    static void EditPedagang() {
        if (ar == -1) {
            kosong();
            return;
        }
        JOptionPane.showMessageDialog(null, "^^ Silakan Melakuan Edit Data ^^");
        String edit;
        int noru, no;
        String pem, pen, cab, sta, je;
        int ju;
        int D = 1;
        String mo = "";
        String dataE = "";
        String usaha = "";
        String jual = "";
        String beli = "";
        String cabang2 = "";
        String status2 = "";
        String lagi = "Y";
        int modal2 = 0;
        boolean ulang = true;
        int pa = 0;
        int sa = 0;
        int ma = 0;
        int se = 0;
        int el = 0;
        int bb = 0;
        int ll = 0;
        int bp = 0;
        {
            do {
                edit = JOptionPane.showInputDialog("INGIN EDIT[Y/T]");
                if ("Y".equals(edit) | "y".equals(edit)) {
                    try {
                        do {
                            String dt = JOptionPane.showInputDialog(null, "Nomer Ruang [0-" + ar + "]", "DATA NOMER RUANG", JOptionPane.INFORMATION_MESSAGE);
                            noru = Integer.parseInt(dt);

                        } while (!(noru <= ar));

                        //Nama Toko Input
                        String nt = JOptionPane.showInputDialog(null, "1.NAMA TOKO", "EDIT NAMA TOKO", JOptionPane.INFORMATION_MESSAGE);
                        nama_t[noru] = nt;
//Alamat Edit
                        String al = JOptionPane.showInputDialog(null, "2.ALAMAT", "EDIT ALAMAT", JOptionPane.INFORMATION_MESSAGE);
                        alamat[noru] = al;
//Nama Pemilik Edit
                        String np = JOptionPane.showInputDialog(null, "3.NAMA PEMILIK", "EDIT NAMA PEMILIK", JOptionPane.INFORMATION_MESSAGE);
                        nama_p[noru] = np;
//Jenis Usaha Edit      
                        do {
                            je = JOptionPane.showInputDialog(null, "1. PAKAIAN \n"
                                    + "2. SARUNG \n"
                                    + "3. MAKANAN \n"
                                    + "4. SEPATU/TAS \n"
                                    + "5. ELEKTRONIK \n"
                                    + "6. BARANG BEKAS \n"
                                    + "7. LAIN - LAIN \n"
                                    + "===============================\n"
                                    + "                4.JENIS USAHA (1-7) \n"
                                    + "===============================\n","EDIT JENIS USAHA", JOptionPane.INFORMATION_MESSAGE);
                        } while (!("1".equals(je) | ("2".equals(je) | ("3".equals(je)
                                | ("4".equals(je) | ("5".equals(je) | ("6".equals(je) | ("7".equals(je)))))))));

                        ju = Integer.parseInt(je);

                        if (ju == 1) {
                            usaha = "PAKAIAN";
                            pa++;
                        } else if (ju == 2) {
                            usaha = "SARUNG";
                            sa++;
                        } else if (ju == 3) {
                            usaha = "MAKANAN";
                            ma++;
                        } else if (ju == 4) {
                            usaha = "SEPATU/TAS";
                            se++;
                        } else if (ju == 5) {
                            usaha = "ELEKTRONIK";
                            el++;
                        } else if (ju == 6) {
                            usaha = "BARANG BEKAS";
                            bb++;
                        } else if (ju == 7) {
                            usaha = "LAIN - LAIN";
                            ll++;
                        }
                        jenis[noru] = usaha;
//Modal Edit
                        do {

                            try {
                                mo = JOptionPane.showInputDialog(null, "5.MODAL", "EDIT MODAL", JOptionPane.INFORMATION_MESSAGE);
                                modal2 = Integer.parseInt(mo);
                                modal[noru] = modal2;
                                ulang = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null,
                                        "*******************************************************\n"
                                        + "                           ANDA SALAH INPUT \n"
                                        + "*******************************************************\n"
                                        + "                     Petunjuk : Input Angka \n");

                            }
                        } while (ulang);
//Penjualan Edit
                        do {
                            pen = JOptionPane.showInputDialog(null, "6.PENJUALAN [D]=DALAM NEGRI / [L] = LUAR NEGERI / [S] = Keduanya)", "EDIT PENJUALAN", JOptionPane.INFORMATION_MESSAGE);
                        } while (!("D".equals(pen) | ("d".equals(pen) | ("L".equals(pen)
                                | ("l".equals(pen) | ("S".equals(pen) | ("s".equals(pen))))))));

                        if ("D".equals(pen) | ("d".equals(pen))) {
                            jual = "DALAM NEGERI";
                        } else if ("L".equals(pen) | ("l".equals(pen))) {
                            jual = "LUAR NEGERI";
                        } else if ("S".equals(pen) | ("s".equals(pen))) {
                            jual = "DALAM DAN LUAR NEGERI";
                        }
                        penjualan[noru] = jual;
//Pembelian Edit
                        do {
                            pem = JOptionPane.showInputDialog(null, "7.PEMBELI([D]OMESTIK / [L]LUAR / [C]AMPURAN", "EDIT PEMBELI", JOptionPane.INFORMATION_MESSAGE);
                        } while (!("D".equals(pem) | ("d".equals(pem) | ("L".equals(pem)
                                | ("l".equals(pem) | ("C".equals(pem) | ("c".equals(pem))))))));
                        if ("D".equals(pem) | ("d".equals(pem))) {
                            beli = "DOMESTIK";
                        } else if ("L".equals(pem) | ("l".equals(pem))) {
                            beli = "LUAR";
                        } else if ("C".equals(pem) | ("c".equals(pem))) {
                            beli = "CAMPURAN";
                        }
                        pembeli[noru] = beli;
//Cabang Edit
                        do {
                            cab = JOptionPane.showInputDialog(null, "8.CABANG [T]IDAK ADA /[A]DA", "EDIT CABANG", JOptionPane.INFORMATION_MESSAGE);
                        } while (!("T".equals(cab) | ("t".equals(cab) | ("A".equals(cab)
                                | ("a".equals(cab))))));
                        if ("T".equals(cab) | ("t".equals(cab))) {
                            cabang2 = "TIDAK ADA";
                        } else if ("A".equals(cab) | ("a".equals(cab))) {
                            cabang2 = "ADA";
                        }
//Web Edit
                        cabang[noru] = cabang2;
                        String aweb = JOptionPane.showInputDialog(null, "9.ALAMAT WEB", "EDIT WEB", JOptionPane.INFORMATION_MESSAGE);
                        web[noru] = aweb;
//Email Edit
                        String aemail = JOptionPane.showInputDialog(null, "10.ALAMAT EMAIL", "EDIT EMAIL", JOptionPane.INFORMATION_MESSAGE);
                        email[noru] = aemail;
//Nomor Edit
                        String notelp = JOptionPane.showInputDialog(null, "11.NO TELP TOKO", "EDIT NO TELP", JOptionPane.INFORMATION_MESSAGE);
                        telp[noru] = notelp;
//Status Edit         
                        do {
                            sta = JOptionPane.showInputDialog(null, "12.STATUS [N]IKAH / [B]ELUM ", "EDIT STATUS", JOptionPane.INFORMATION_MESSAGE);
                        } while (!("N".equals(sta) | ("n".equals(sta) | ("B".equals(sta)
                                | ("b".equals(sta))))));
                        if ("N".equals(sta) | ("n".equals(sta))) {
                            status2 = "NIKAH";
                        } else if ("B".equals(sta) | ("b".equals(sta))) {
                            status2 = "BELUM";
                        }
                        status[noru] = status2;
                        dataE += "EDIT DATA PEDAGANG \n";
                        dataE += "1.NAMA TOKO     : " + nt + " \n";
                        dataE += "2.ALAMAT        : " + al + " \n";
                        dataE += "3.NAMA PEMILIK  : " + np + "\n";
                        dataE += "4.JENIS USAHA   : " + usaha + " \n";
                        dataE += "5.MODAL         : Rp. " + modal2 + " \n";
                        dataE += "6.PENJUALAN     : " + jual + " \n";
                        dataE += "7.PEMBELI       : " + beli + " \n";
                        dataE += "8.CABANG        : " + cabang2 + " \n";
                        dataE += "9.ALAMAT WEB    : " + aweb + " \n";
                        dataE += "10.ALAMAT EMAIL : " + aemail + " \n";
                        dataE += "11.NO TELP TOKO : " + notelp + " \n";
                        dataE += "12.STATUS [N]IKAH/[B]ELUM : " + status2 + " \n";
                        JOptionPane.showMessageDialog(null, dataE, "HASIL EDIT DATA ", JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Anda Salah Input Nomor Ruang");
                    }
                }

            } while ("Y".equals(edit) | ("y".equals(edit)));

        }
        return;
    }

    static void HapusPedagang() {

        if (ar == -1) {
            kosong();
            return;
        }
        int gno;
        JOptionPane.showMessageDialog(null, "^^ Silakan Melakuan Hapus Data ^^");
        int n;
        String hd, data2, data1;
        int hapus, nomor;
            hd = JOptionPane.showInputDialog(null, "INGIN HAPUS DATA [Y/T]", "HAPUS DATA", JOptionPane.INFORMATION_MESSAGE);
            if ("Y".equals(hd) | ("y".equals(hd))) {
                try {
                    do {

                        String nd = JOptionPane.showInputDialog(null,
                                "MASUKKAN NOMOR RUANG [0-" + ar + "]\n", "NOMOR DATA YANG DIHAPUS", JOptionPane.INFORMATION_MESSAGE);
                        hapus = Integer.parseInt(nd);
                        data1 = "";
                        data1 += "INPUT DATA PEDAGANG \n";
                        data1 += "NAMA TOKO     : d" + nama_t[hapus] + " \n";

                        JOptionPane.showMessageDialog(null, data1, "DATA Di Hapus ", JOptionPane.INFORMATION_MESSAGE);
                    } while (!(hapus <= ar));

                    if (!(hapus == ar));
                    {
                        ar = ar - 1;
                        no = no + (-1);
                    }

                    for (int tp = hapus; tp <= ar; tp++) {
                        nama_t[tp] = nama_t[tp + 1];
                        alamat[tp] = alamat[tp + 1];
                        nama_p[tp] = nama_p[tp + 1];
                        jenis[tp] = jenis[tp + 1];
                        modal[tp] = modal[tp + 1];
                        penjualan[tp] = penjualan[tp + 1];
                        pembeli[tp] = pembeli[tp + 1];
                        cabang[tp] = cabang[tp + 1];
                        web[tp] = web[tp + 1];
                        email[tp] = email[tp + 1];
                        telp[tp] = telp[tp + 1];
                        status[tp] = status[tp + 1];
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Anda Salah Input nomor Ruang");
                }
            }
            n = 0;
            gno = 0;
            data2 = "";
            data2 += "TANGGAL : " + hari + " / " + bulan + " / " + tahun + "\n";
            data2 += "---------------------------------------------\n";
            data2 += " NO     NAMA TOKO \n";
            data2 += "---------------------------------------------\n";
            for (int r = 0; r <= ar; r++) {
                n++;
                data2 += "  " + n + "       " + nama_t[r] + "\n";
                gno++;
            }
            data2 += "---------------------------------------------\n";
            data2 += " Jumlah Data Yang Tersisa = " + gno;
            JOptionPane.showMessageDialog(null, data2, "Laporan Data Hapus", JOptionPane.INFORMATION_MESSAGE);
            data2 = "";

            if (no == 0) {
                JOptionPane.showMessageDialog(null,
                        "DATA SUDAH HABIS \n"+"Silakan Input Data Lagi ");
                hd = "T";
            }

        
        return;
    }

    static void LaporanPedagang() {
        if (ar == -1) {
            kosong();
            return;

        }
        JOptionPane.showMessageDialog(null, "^^ SELAMAT DATANG di LAPORAN PEDAGANG ^^");
        int no1, no2, y1;

        int pa, sa, ma, se, el, bb, ll, bp;
        int gpa, gsa, gma, gse, gel, gbb, gll, gbp;
        String data2 = "";
        String rekap = "";
        hal = no % 4;
        if (hal == 0) {
            hal = no / 4;
        } else {
            hal = (no / 4) + 1;
        }
        if (hal == 1) {
            no1 = 1;
            no2 = no;
        } else {
            no1 = 1;
            no2 = 4;
        }
        y1 = -1;
        gpa = 0;
        gsa = 0;
        gma = 0;
        gse = 0;
        gel = 0;
        gbb = 0;
        gll = 0;
        gbp = 0;
        for (int h = 1; h <= hal; h++) {

            if (h == hal) {
                no2 = no;
            }
            pa = 0;
            sa = 0;
            ma = 0;
            se = 0;
            el = 0;
            bb = 0;
            ll = 0;
            bp = 0;

            data2 = "";
            data2 += "\n";
            data2 += "TANGGAL : " + hari + " / " + bulan + " / " + tahun + "    Hal : " + h + "\n";
            gh = h;
            data2 += "_______________________________________________________________________\n";
            data2 += " NO | NAMA TOKO | ALAMAT | NAMA PEMILIK | JENIS USAHA \n";
            data2 += "_______________________________________________________________________\n";
            for (int z = no1; z <= no2; z++) {
                y1 = y1 + 1;
                if ("PAKAIAN".equals(jenis[y1])) {
                    pa++;
                    gpa++;
                } else if ("SARUNG".equals(jenis[y1])) {
                    sa++;
                    gsa++;
                } else if ("MAKANAN".equals(jenis[y1])) {
                    ma++;
                    gma++;
                } else if ("SEPATU/TAS".equals(jenis[y1])) {
                    se++;
                    gse++;
                } else if ("ELEKTRONIK".equals(jenis[y1])) {
                    el++;
                    gel++;
                } else if ("BARANG BEKAS".equals(jenis[y1])) {
                    bb++;
                    gbb++;
                } else if ("LAIN - LAIN".equals(jenis[y1])) {
                    ll++;
                    gll++;
                }
                data2 += "" + z + "      " + nama_t[y1] + "       " + alamat[y1] + "          " + nama_p[y1] + "         " + jenis[y1] + "\n";
            }
            data2 += "_______________________________________________________________________\n";
            data2 += "PAKAIAN               :  " + pa + "        SEPATU/TAS      : " + se + "\n";
            data2 += "SARUNG                :  " + sa + "        BAHAN POKOK  : " + bp + "\n";
            data2 += "MAKANAN             :  " + ma + "       ELEKTRONIK       : " + el + "\n";
            data2 += "BARANG BEKAS   :  " + bb + "         LAIN LAIN          : " + ll + "\n";
            JOptionPane.showMessageDialog(null, data2, "       LAPORAN DATA PEDAGANG", JOptionPane.INFORMATION_MESSAGE);
            no1 = no1 + 4;
            no2 = no2 + 4;
            data2 = "";
            gh = h + 1;
        }
        rekap += "TANGGAL : " + hari + "  " + bulan + "  " + tahun + "    Hal : " + gh + "\n";
        rekap += "__________________________________________________________________________\n";
        rekap += "PAKAIAN                 :  " + gpa + "     SEPATU/TAS          :  " + gse + "\n";
        rekap += "SARUNG                  :  " + gsa + "     BAHAN POKOK     :  " + gbp + "\n";
        rekap += "MAKANAN              :  " + gma + "     ELEKTRONIK          :  " + gel + "\n";
        rekap += "BARANG BEKAS    :  " + gbb + "    LAIN LAIN                :  " + gll + "\n";
        rekap += "__________________________________________________________________________\n";
        JOptionPane.showMessageDialog(null, rekap, "       LAPORAN REKAP DATA PEDAGANG", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    static void LaporanStatistik() {
        if (ar == -1) {
            kosong();
            return;
        }
        JOptionPane.showMessageDialog(null, "^^ SELAMAT DATANG di LAPORAN STATISTIK ^^");
        int no1, no2, y1, dom, lu, cam, ln, dln, ck, td, ad;
        if (ar == -1) {
            kosong();
            return;
        }
        float zx,rmodal;
        int gdom, glu, gcam, gln, gdln, gck, gtd, gad, gmodal, gmodal1;
        String data2 = "";
        rmodal = 0;
        zx=0;
        String rekap = "";
        hal = no % 4;
        if (hal == 0) {
            hal = no / 4;
        } else {
            hal = (no / 4) + 1;
        }
        if (hal == 1) {
            no1 = 1;
            no2 = no;
        } else {
            no1 = 1;
            no2 = 4;
        }
        zx=0;
        y1 = -1;
        gdom = 0;
        gdom = 0;
        glu = 0;
        gcam = 0;
        gdln = 0;
        gln = 0;
        gck = 0;
        gtd = 0;
        gad = 0;
        gmodal1 = 0;
        for (int h = 1; h <= hal; h++) {

            if (h == hal) {
                no2 = no % 4;
                if (no2 == 0) {
                    no2 = 4;
                }
            }
            dom = 0;
            lu = 0;
            cam = 0;
            dln = 0;
            ln = 0;
            ck = 0;
            td = 0;
            ad = 0;
            gmodal = 0;
            data2 = "";
            data2 += "\n";
            data2 += "TANGGAL : " + hari + "  " + bulan + "  " + tahun + "    Hal : " + h + "\n";

            data2 += "_______________________________________________________\n";
            data2 += " NO | TOKO | MODAL | PENJUALAN | PEMBELI | CABANG \n";
            data2 += "_______________________________________________________\n";
            for (int z = no1; z <= no2; z++) {
                y1 = y1 + 1;
                if ("DOMESTIK".equals(pembeli[y1])) {
                    dom++;
                    gdom++;
                } else if ("LUAR".equals(pembeli[y1])) {
                    lu++;
                    glu++;
                } else if ("CAMPURAN".equals(pembeli[y1])) {
                    cam++;
                    gcam++;
                }
                if ("DALAM NEGERI".equals(penjualan[y1])) {
                    dln++;
                    gdln++;
                } else if ("LUAR NEGERI".equals(penjualan[y1])) {
                    ln++;
                    gln++;
                } else if ("CAMPURAN".equals(penjualan[y1])) {
                    ck++;
                    gck++;
                }
                if ("TIDAK ADA".equals(cabang[y1])) {
                    td++;
                    gtd++;
                } else if ("ADA".equals(cabang[y1])) {
                    ad++;
                    gad++;
                }
                zx++;
                data2 += "" + z + "      " + nama_t[y1] + "       " + modal[y1] + "          " + penjualan[y1] + "         " + pembeli[y1] + "         " + cabang[y1] + "\n";
                gmodal = gmodal + modal[y1];
                gmodal1 = gmodal1 + modal[y1];
                
            }
            data2 += "_______________________________________________________\n";
            data2 += "PEMBELI         :   D = " + dom + "   C = " + cam + "   L = " + lu + "\n";
            data2 += "PENJUALAN    :  D = " + dln + "  L = " + ln + "  S = " + ck + "\n";
            data2 += "CABANG          :   T = " + td + "     A = " + ad + "\n";
            data2 += "TOTAL MODAL : " + gmodal + "\n";
            JOptionPane.showMessageDialog(null, data2, "       LAPORAN STATISTIK PEDAGANG", JOptionPane.INFORMATION_MESSAGE);
            data2 = "";
rmodal = gmodal1 / zx;
            gh = h + 1;
        }

        rekap += "TANGGAL : " + hari + " / " + bulan + " / " + tahun + "    Hal : " + gh + "\n";
        rekap += "_______________________________________________________\n";
        rekap += "PEMBELI      : " + " D : " + gdom + "\n";
        rekap += "                         C : " + gcam + "\n";
        rekap += "                         L : " + glu + "\n";
        rekap += "PENJUALAN   : " + " D : " + gdln + "\n";
        rekap += "                         L : " + gln + "\n";
        rekap += "                         S : " + gck + "\n";
        rekap += "CABANG       : " + " T : " + gtd + "\n";
        rekap += "                         A : " + gad + "\n";
        rekap += "RATA RATA MODAL : " + rmodal + "\n";
        rekap += "_______________________________________________________\n";
        JOptionPane.showMessageDialog(null, rekap, "       LAPORAN REKAP STATISTIL PEDAGANG", JOptionPane.INFORMATION_MESSAGE);

        return;
        
    }

    static void LaporanAlamatUsaha() {
        if (ar == -1) {
            kosong();
            return;
        }
        JOptionPane.showMessageDialog(null, "^^ SELAMAT DATANG di LAPORAN ALAMAT USAHA ^^");
        int no1, no2, y1;
        if (ar == -1) {
            kosong();
            return;
        }
        int gtelp1, gweb1, gemail1, gtelp, gweb, gemail;
        String data2 = "";
        String rekap = "";
        hal = no % 5;
        if (hal == 0) {
            hal = no / 5;
        } else {
            hal = (no / 5) + 1;
        }
        if (hal == 1) {
            no1 = 1;
            no2 = no;
        } else {
            no1 = 1;
            no2 = 5;
        }
        y1 = -1;
        gweb1 = 0;
        gemail1 = 0;
        gtelp1 = 0;
        for (int h = 1; h <= hal; h++) {

            if (h == hal) {
                no2 = no % 5;
                if (no2 == 0) {
                    no2 = 5;
                }
            }
            gweb = 0;
            gemail = 0;
            gtelp = 0;
            data2 = "";
            data2 += "\n";
            data2 += " Hal : " + h + "TANGGAL : " + hari + " / " + bulan + " / " + tahun + "   \n";

            data2 += "_______________________________________________________\n";
            data2 += " NO | NAMA TOKO | ALAMAT WEB | EMAIL| TELPON/HP  \n";
            data2 += "_______________________________________________________\n";
            for (int z = no1; z <= no2; z++) {
                y1 = y1 + 1;
                if ("".equals(web[y1]) | ("Data Kosong".equals(web[y1]))) {
                    web[y1] = "Data Kosong";
                } else {
                    gweb++;
                    gweb1++;
                }
                if ("".equals(email[y1]) | ("Data Kosong".equals(email[y1]))) {
                    email[y1] = "Data Kosong";
                } else {
                    gemail++;
                    gemail1++;
                }
                if ("".equals(telp[y1]) | ("Data Kosong".equals(telp[y1]))) {
                    telp[y1] = "Data Kosong";
                } else {
                    gtelp++;
                    gtelp1++;
                }
                data2 += "" + z + "      " + nama_t[y1] + "       " + web[y1] + "          " + email[y1] + "         " + telp[y1] + "\n";
            }
            data2 += "_______________________________________________________\n";
            data2 += "JUMLAH TOKO YANG MEMILIKI WEB      : " + gweb + "\n";
            data2 += "JUMLAH TOKO YANG MEMILIKI EMAIL    : " + gemail + "\n";
            data2 += "JUMLAH YANG MEMILIKI TELPON           : " + gtelp + "\n";
            JOptionPane.showMessageDialog(null, data2, "       LAPORAN ALAMAT USAHA", JOptionPane.INFORMATION_MESSAGE);
            data2 = "";
            gh = h + 1;
        }
        rekap += "Hal : " + gh + "TANGGAL : " + hari + " / " + bulan + " / " + tahun + "  \n";
        rekap += "_______________________________________________________\n";
        rekap += "TOTAL KESELURUHAN WEB = " + gweb1 + "   EMAIL = " + gemail1 + "   TELPON = " + gtelp1 + "\n";
        rekap += "_______________________________________________________\n";
        JOptionPane.showMessageDialog(null, rekap, "       LAPORAN REKAP DATA PEDAGANG", JOptionPane.INFORMATION_MESSAGE);

        return;
    }

    static void LaporanStatus() {
        if (ar == -1) {
            kosong();
            return;
        }
        JOptionPane.showMessageDialog(null, "^^ SELAMAT DATANG di LAPORAN ALAMAT DAN STATUS PEDAGANG ^^");
        int no1, no2, y1, ni, be;
        if (ar == -1) {
            kosong();
            return;
        }
        int gh = 1;
        int gmodal;
        int gmodal1 = 0;
        int gni = 0;
        int gbe = 0;
        String data2 = "";
        String rekap = "";
        hal = no % 5;
        if (hal == 0) {
            hal = no / 5;
        } else {
            hal = (no / 5) + 1;
        }
        if (hal == 1) {
            no1 = 1;
            no2 = no;
        } else {
            no1 = 1;
            no2 = 5;
        }
        y1 = -1;
        gmodal1 = 0;
        for (int h = 1; h <= hal; h++) {

            if (h == hal) {
                no2 = no % 5;
                if (no2 == 0) {
                    no2 = 5;
                }
            }
            ni = 0;
            be = 0;
            gmodal = 0;
            data2 = "";
            data2 += "LAPORAN ALAMAT PEDAGANG di " + sumber + "\n";
            data2 += "PEKALONGAN BULAN " + bulan + " TAHUN " + tahun + "\n";
            data2 += "\n";
            data2 += "Hal : " + h + "\n";
            data2 += "______________________________________________________________________________________\n";
            data2 += " NO |       NAMA TOKO         |     ALAMAT      |    NAMA PEMILIK        | STATUS \n";
            data2 += "______________________________________________________________________________________\n";
            for (int z = no1; z <= no2; z++) {
                y1 = y1 + 1;
                if ("NIKAH".equals(status[y1])) {
                    ni++;
                    gni++;
                } else if ("BELUM NIKAH".equals(status[y1])) {
                    be++;
                    gbe++;
                }
                data2 += "" + z + "      " + nama_t[y1] + "       " + alamat[y1] + "          " + nama_p[y1] + "         " + status[y1] + "\n";
                gmodal = gmodal + modal[y1];
                gmodal1 = gmodal1 + modal[y1];
            }
            data2 += "_______________________________________________________\n";

            data2 += "NIKAH = : " + ni + "    BELUM NIKAH = " + be + "\n";
            data2 += "TOTAL KESELURUHAN MODAL = " + gmodal + "\n";
            JOptionPane.showMessageDialog(null, data2, "       LAPORAN DATA PEDAGANG", JOptionPane.INFORMATION_MESSAGE);
            data2 = "";
            gh = h + 1;
        }

        rekap += "TANGGAL : " + hari + "  " + bulan + "  " + tahun + "    Hal : " + gh + "\n";
        rekap += "_______________________________________________________\n";
        rekap += "TOTAL NIKAH =  " + gni + "    TOTAL BELUM NIKAH  = " + gbe + "\n";
        rekap += "TOTAL KESELURUHAN MODAL SELURUH DATA = " + gmodal1 + "\n";
        rekap += "_______________________________________________________\n";
        JOptionPane.showMessageDialog(null, rekap, "       LAPORAN REKAP DATA PEDAGANG", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    public static void main(String[] args) {
        tambahan();
        ulang = true;
        ar = -1;
        no = 0;
        gh = 1;
        hal = 0;
        String salam = "";
        salam += "                SEMESTER SATU TAHUN 2018/2019  \n";
        salam += "                                       DOSEN :  \n";
        salam += "                           MOSSES AIDJILI, M.Kom \n";
        salam += "*********************************************************\n";
        salam += "                              REKAP LAPORAN \n";
        salam += "*********************************************************\n";
        salam += "                       NAMA KETUA KELOMPOK \n";
        salam += "-----------------------------------------------------------------------\n";
        salam += "                          NIM               NAMA \n";
        salam += "                  18.240.0010    Moch. Syukran Raid \n";
        salam += "-----------------------------------------------------------------------\n";
        salam += "                             KELAS  1P42 \n";
        salam += "                           KELOMPOK 10 \n";
        salam += "=========================================\n";
        salam += "                          NIM                NAMA  \n";
        salam += "                  18.240.0043     Moch Syukron Raid \n";
        salam += "                  18.240.0056     Fahmi Imam S. \n";
        salam += "                  18.240.0010     M. Aura Al Fataa  \n";
        salam += "=========================================\n";
        salam += "      SUMBER DATA DI " + sumber + " \n";
        salam += "=========================================\n";
        JOptionPane.showMessageDialog(null, salam, "TUGAS ALGORITMA PEMROGRAMAN (JAVA) ", JOptionPane.INFORMATION_MESSAGE);
        do {

            menu();
            switch (pilihan) {
                case 1: {
                    InputPedagang();
                    break;
                }

                case 2: {

                    EditPedagang();
                    break;
                }
                case 3: {
                    HapusPedagang();
                    break;
                }
                case 4: {
                    LaporanPedagang();
                    break;
                }
                case 5: {
                    LaporanStatistik();
                    break;
                }
                case 6: {
                    LaporanAlamatUsaha();
                    break;
                }
                case 7: {
                    LaporanStatus();
                    break;
                }
                case 8: {
                    ulang = false;
                    JOptionPane.showMessageDialog(null,
                            "*****************************************"
                            + "            \n"
                            + "<<<<          TERIMA KASIH          >>>>\n"
                            + "*****************************************\n");
                    System.exit(0);
                    break;
                }

            }
        } while (ulang);

    }
}
 