package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {

	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository instance = new ProductRepository();

	public static ProductRepository getInstance(){
		return instance;
	} 

	public ProductRepository() {
		Product a = new Product("p0007", "iPhone 6s", 800000);
		a.setDescription("'RTX 3070 / 8nm / �ν�ƮŬ��: 1845MHz / 5888�� / PCIe4.0x16 /\r\n" + 
				"					GDDR6(DDR6) / ��´���: HDMI2.1, DP1.4 / �ΰ����: ������(0-dB���), 8K �ػ� ����,\r\n" + 
				"					4K �ػ� ����, HDR ����, Dual BIOS, HDCP 2.3 / �����Ŀ� 750W �̻� / ���� ��Ʈ: 8��\r\n" + 
				"					x2�� / 2�� �� / ����(����): 275mm / ���÷���Ʈ / LED ����Ʈ / AURA'");
		a.setCategory("gcard");
		a.setManufacturer("Galaxy");
		a.setFilename("rtx1.jpg");

		Product b = new Product("p0009", "RTX 3060 Ti", 514000);
		b.setDescription("RTX 3060 Ti / 8nm / �ν�ƮŬ��: 1695MHz / 4864�� / PCIe4.0x16 /\r\n" + 
				"					GDDR6(DDR6) / ��´���: HDMI2.1, DP1.4 / �ΰ����: ������(0-dB���), 8K �ػ� ����,\r\n" + 
				"					4K �ػ� ����, HDR ����, HDCP 2.3 / �������: �ִ� 200W / �����Ŀ� 550W �̻� / ���� ��Ʈ:\r\n" + 
				"					8�� x1�� / ������: 6������ / 2�� �� / ����(����): 247mm /");
		b.setCategory("gcard");
		b.setManufacturer("Zotac");
		b.setFilename("rtx3.jpg");

		Product c = new Product("p0008", "AMD ������5-3���� 3600", 203500);
		c.setDescription("AMD(����AM4) / 3���� (Zen 2) / 7nm / ���(6)�ھ� / 12������ / �⺻ Ŭ��: 3.6GHz / �ִ� Ŭ��: 4.2GHz / L3 ĳ��: 32MB / TDP: 65W / PCIe4.0 / �޸� �԰�: DDR4 / 3200MHz / ����׷���: ��ž�� / ��� ����: SenseMI, StoreMI / ��: Wraith Stealth ���� / ��ð�: 199�޷�(VAT����)\r\n" + 
				"");
		c.setCategory("cpu");
		c.setManufacturer("AMD");
		c.setFilename("cpu1.jpg");

		Product d = new Product("p0004", "\r\n" + 
				"���� �ھ�i5-10���� 10400", 180500);
		d.setDescription("����(����1200) / 14nm / ���(6)�ھ� / 12������ / �⺻ Ŭ��: 2.9GHz / �ִ� Ŭ��: 4.3GHz / L3 ĳ��: 12MB / TDP: 65W / PCIe3.0 / �޸� �԰�: DDR4 / 2666MHz / ����׷���: ž�� / ���� UHD 630 / ��� ����: �����۽�����, ������ / ��: ���� �⺻�� ���� / ��ð�: 182�޷�(VAT����)\r\n" + 
				"");
		d.setCategory("cpu");
		d.setManufacturer("Intel");
		d.setFilename("cpui5.jpg");
		
		Product e = new Product("p0005", "���� �ھ�i3-10���� 10300", 900000);
		e.setDescription("212.8*125.6*6.6mm,  Super AMOLED display, Octa-Core processor");
		e.setCategory("Tablet");
		e.setManufacturer("Samsung");
		e.setFilename("P1236.png");
		
		Product f = new Product("p0006", "AMD ������3-3���� 3300X", 151000);
		f.setDescription("AMD(����AM4) / 3���� (Zen 2) / 7nm / ����(4)�ھ� / 8������ / �⺻ Ŭ��: 3.8GHz / �ִ� Ŭ��: 4.3GHz / L3 ĳ��: 16MB / TDP: 65W / PCIe4.0 / �޸� �԰�: DDR4 / 3200MHz / ����׷���: ��ž�� / ��� ����: SenseMI, StoreMI / ��: Wraith Stealth ���� / ��ð�: 120�޷�(VAT����)\r\n" + 
				"");
		f.setCategory("cpu");
		f.setManufacturer("Samsung");
		f.setFilename("cpu3.jpg");
		listOfProducts.add(a);
		listOfProducts.add(b);
		listOfProducts.add(c);
		listOfProducts.add(d);
		listOfProducts.add(e);
		listOfProducts.add(f);
	}
	
	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}
	
	public Product getProductById(String id) {
		Product productById = null;

		for (int i = 0; i < listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if (product != null && product.getid() != null && product.getid().equals(id)) {
				productById = product;
				break;
			}
		}
		return productById;
	}
	
	public void addProduct(Product product) {
		listOfProducts.add(product);
	}
}
