import database.Tbanimal;
import database.Tbtipo;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logicaDeNegocio.TbanimalFacade;
import logicaDeNegocio.TbtipoFacade;
/*
 * @author sergio13v
 */
//@WebServlet(urlPatterns = {"/animalesServlet"})
@WebServlet(urlPatterns = {"/animalesServlet"})
public class animalesServlet extends HttpServlet {

    @EJB
    private TbtipoFacade tbtipoFacade;

    @EJB
    private TbanimalFacade tbanimalFacade;

    @PersistenceContext(unitName = "AnimalesPU")
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;
    
    protected void processTipoRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            List<Tbtipo> listaTipos = tbtipoFacade.findAll();
            request.setAttribute("listaTipos", listaTipos);
    
            RequestDispatcher requestDispatcher; 
            requestDispatcher = request.getRequestDispatcher("/tipos.jsp");
            requestDispatcher.forward(request, response);
    
    }
    protected void processAnimalesRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
            RequestDispatcher requestDispatcher; 
            requestDispatcher = request.getRequestDispatcher("/animales.jsp");
            requestDispatcher.forward(request, response);
    
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
        String tipo = request.getParameter("tipo");
        
        
        if (tipo==null) {
            processTipoRequest(request, response);
            
            
        }
        else {
            
            processAnimalesRequest(request, response);
            
        }
        
        //Tbanimal a1 = tbanimalFacade.find(6);
        //request.setAttribute("a1", a1);
        //request.setAttribute("resultados", tipo);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public void persist(Object object) {
        try {
            utx.begin();
            em.persist(object);
            utx.commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
    }  
}