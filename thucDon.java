package do_an_dau_tien;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class thucDon {
	public static ArrayList<sanPham> thucdon = new ArrayList<sanPham>();

	public thucDon() {
	}

	public static void setDonGiatuFile(String path) {
		File file = new File(path);
		try (Scanner scan = new Scanner(file)) {
//			System.out.println("hehe");
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				String[] parts = line.split("#");

				String id = parts[0].trim();
				String ten = parts[1].trim();
				
				sanPham.maxLength = ten.length() > sanPham.maxLength ? ten.length() : sanPham.maxLength;
				
				sanPham sp = null;

				if (path == "trasua.txt") {
					sp = new traSua(id, ten);
				} else if (path == "caphe.txt") {
					sp = new caPhe(id, ten);
				} else {
					System.out.println("Duong dan ko hop le!");
					return;
				}

				int tmp[] = new int[sanPham.validSize];
				for (int i = 0; i < sanPham.validSize; ++i) {
					tmp[i] = Integer.parseInt(parts[i + 2]);
				}

				sp.setGiaTien(tmp);

				thucdon.add(sp);

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void xuatMenu() {
		System.out.println("--------------------- Tra sua ---------------------");
		int cntTab = sanPham.maxLength / 8;
		for (int i = 0; i <= cntTab; ++i) {
			System.out.print("\t");
		}
		for (int i = 0; i < sanPham.validSize; ++i) {
			System.out.print(sanPham.size[i] + "\t");
		}
		System.out.println();
		int index = 1;
		for (sanPham sp : thucdon) {
			if (sp instanceof traSua) {
				System.out.print((index++) + ". " + sp.getTen());
				
				int lengthTS = (sp.getTen().length() + 2 + (String.valueOf(index-1).length())) / 8;

				traSua ts = (traSua) sp;
				// tab ra cho dep
				for (int j = lengthTS; j <= cntTab; ++j) {
					System.out.print("\t");
				}
				
				
				int banggia[] = ts.getGiaTien();
				for (int j = 0; j < sanPham.validSize; ++j) {
					System.out.print(banggia[j] + "\t");
				}
				System.out.println();
			}
		}
		System.out.println();

		System.out.println("--------------------- Ca phe ---------------------");
		cntTab = sanPham.maxLength / 8;
		for (int i = 0; i <= cntTab; ++i) {
			System.out.print("\t");
		}
		for (int i = 0; i < sanPham.validSize; ++i) {
			System.out.print(sanPham.size[i] + "\t");
		}
		System.out.println();
		index = 1;
		for (sanPham sp : thucdon) {
			if (sp instanceof caPhe) {
				System.out.print((index++) + ". " + sp.getTen());

				caPhe cf = (caPhe) sp;
				// tab ra cho dep
				int lengthTS = (sp.getTen().length() + 3) / 8;
				for (int j = lengthTS; j <= cntTab; ++j) {
					System.out.print("\t");
				}

				int banggia[] = cf.getGiaTien();
				for (int j = 0; j < sanPham.validSize; ++j) {
					System.out.print(banggia[j] + "\t");
				}
				System.out.println();
			}
		}
	}

}
