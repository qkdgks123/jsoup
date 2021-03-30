package sadf;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class project {

	public static void main(String[] args) {
		
		String url ="https://news.yahoo.co.jp/pickup/6389246";
		
	
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Elements element =doc.select("section.yjnSub_section");
		String title=element.select("h2").text().substring(0,18);
			
		System.out.println(title);
	
		for(Element el :element.select("li")) {
			System.out.println(el.text());
		}
	}
}