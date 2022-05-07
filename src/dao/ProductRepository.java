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
		a.setDescription("'RTX 3070 / 8nm / 부스트클럭: 1845MHz / 5888개 / PCIe4.0x16 /\r\n" + 
				"					GDDR6(DDR6) / 출력단자: HDMI2.1, DP1.4 / 부가기능: 제로팬(0-dB기술), 8K 해상도 지원,\r\n" + 
				"					4K 해상도 지원, HDR 지원, Dual BIOS, HDCP 2.3 / 정격파워 750W 이상 / 전원 포트: 8핀\r\n" + 
				"					x2개 / 2개 팬 / 가로(길이): 275mm / 백플레이트 / LED 라이트 / AURA'");
		a.setCategory("gcard");
		a.setManufacturer("Galaxy");
		a.setFilename("rtx1.jpg");

		Product b = new Product("p0009", "RTX 3060 Ti", 514000);
		b.setDescription("RTX 3060 Ti / 8nm / 부스트클럭: 1695MHz / 4864개 / PCIe4.0x16 /\r\n" + 
				"					GDDR6(DDR6) / 출력단자: HDMI2.1, DP1.4 / 부가기능: 제로팬(0-dB기술), 8K 해상도 지원,\r\n" + 
				"					4K 해상도 지원, HDR 지원, HDCP 2.3 / 사용전력: 최대 200W / 정격파워 550W 이상 / 전원 포트:\r\n" + 
				"					8핀 x1개 / 전원부: 6페이즈 / 2개 팬 / 가로(길이): 247mm /");
		b.setCategory("gcard");
		b.setManufacturer("Zotac");
		b.setFilename("rtx3.jpg");

		Product c = new Product("p0008", "AMD 라이젠5-3세대 3600", 203500);
		c.setDescription("AMD(소켓AM4) / 3세대 (Zen 2) / 7nm / 헥사(6)코어 / 12쓰레드 / 기본 클럭: 3.6GHz / 최대 클럭: 4.2GHz / L3 캐시: 32MB / TDP: 65W / PCIe4.0 / 메모리 규격: DDR4 / 3200MHz / 내장그래픽: 미탑재 / 기술 지원: SenseMI, StoreMI / 쿨러: Wraith Stealth 포함 / 출시가: 199달러(VAT별도)\r\n" + 
				"");
		c.setCategory("cpu");
		c.setManufacturer("AMD");
		c.setFilename("cpu1.jpg");

		Product d = new Product("p0004", "\r\n" + 
				"인텔 코어i5-10세대 10400", 180500);
		d.setDescription("인텔(소켓1200) / 14nm / 헥사(6)코어 / 12쓰레드 / 기본 클럭: 2.9GHz / 최대 클럭: 4.3GHz / L3 캐시: 12MB / TDP: 65W / PCIe3.0 / 메모리 규격: DDR4 / 2666MHz / 내장그래픽: 탑재 / 인텔 UHD 630 / 기술 지원: 하이퍼스레딩, 옵테인 / 쿨러: 인텔 기본쿨러 포함 / 출시가: 182달러(VAT별도)\r\n" + 
				"");
		d.setCategory("cpu");
		d.setManufacturer("Intel");
		d.setFilename("cpui5.jpg");
		
		Product e = new Product("p0005", "인텔 코어i3-10세대 10300", 900000);
		e.setDescription("212.8*125.6*6.6mm,  Super AMOLED display, Octa-Core processor");
		e.setCategory("Tablet");
		e.setManufacturer("Samsung");
		e.setFilename("P1236.png");
		
		Product f = new Product("p0006", "AMD 라이젠3-3세대 3300X", 151000);
		f.setDescription("AMD(소켓AM4) / 3세대 (Zen 2) / 7nm / 쿼드(4)코어 / 8쓰레드 / 기본 클럭: 3.8GHz / 최대 클럭: 4.3GHz / L3 캐시: 16MB / TDP: 65W / PCIe4.0 / 메모리 규격: DDR4 / 3200MHz / 내장그래픽: 미탑재 / 기술 지원: SenseMI, StoreMI / 쿨러: Wraith Stealth 포함 / 출시가: 120달러(VAT별도)\r\n" + 
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
