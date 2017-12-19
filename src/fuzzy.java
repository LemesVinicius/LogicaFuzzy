
import java.io.BufferedReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;


public class fuzzy extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public fuzzy() {
        super();
      
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcessRequest(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcessRequest(request, response);
	}
	protected void doProcessRequest(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
			
		
		StringBuilder sb = new StringBuilder();
		
        try {
        	
            BufferedReader br = request.getReader();
            String str = null;
            while ((str = br.readLine()) != null) {
                sb.append(str);
            }
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
		
		Gson gson = new Gson();
		
		
		Pessoa p = new Pessoa();
		
		
		p = gson.fromJson(sb.toString(), Pessoa.class);
		
		
		DefinirAltura defalt = new DefinirAltura();
		
		defalt.definiralturabinaria(p);
		defalt.difiniralturafuzzy(p);
		
		String json = gson.toJson(p);
		
		response.setContentType("application/json");
        response.getWriter().write(json);		
		
		
	}

}
