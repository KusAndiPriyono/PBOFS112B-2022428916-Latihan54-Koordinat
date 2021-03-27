package pbofs112b.pkg2022428916.latihan54.koordinat;

/**
 *
 * @author 
 * Nama     : Kus Andi Priyono
 * Kelas    : FS112B
 * NIM      : 2022428916
 */
public class PBOFS112B2022428916Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarnaKoordinat wk = new WarnaKoordinat(10, 4, "Jingga");
        Koordinat k = new Koordinat(10, 4);
        System.out.println("Warna Koordinat : " + wk.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + k.x + ", " + " y : " + k.y);
    }
}
