
package DAO;
public class CustomerController {

	CustomerDataContext dt= new CustomerDataContext();
    @RequestMapping("Customer/liste")
    public ModelAndView liste(){  
        return new ModelAndView("liste","liste",dt.select());
    }
    @RequestMapping(value = "Customer/add",method =RequestMethod.GET )
    public ModelAndView add(){
        return new ModelAndView("add");
    }
    @RequestMapping(value = "Customer/add",method =RequestMethod.POST )
    public String add(@ModelAttribute("formProduit") Customer p){
    	 Customer c = new Customer(p.getCustomerName(), getContactLastName(), p.getContactLastName(), p.getPhone(), p.getAddressLine1(),p.getAddressLine2(),p.getCity(), p.getState(), p.getPostalCode(),p.getCreditLimit());
        dt.insert(c);
        return  "redirect:/Product/liste";
    }
@RequestMapping("Customer/delete/{productID}")
    public String delete(@PathVariable int customerNumber){
        dt.delete(customerNumber);
        return "redirect:/Customer/liste";
    }
@RequestMapping(value="Customer/update/{num}", method=RequestMethod.GET)
    public ModelAndView update(@PathVariable("num") int customerNumber){
        // rechercher le produit qui correspond au numéro recu en paramètre
		Customer p=dt.selectByID(customerNumber);
        // afficher le produit dans un formulaire pour la modification
        return new ModelAndView("update","produit", produit);
    }
    @RequestMapping(value = "Customer/update",method =RequestMethod.POST )
    public String update(@ModelAttribute("formProduit") Customer p){
        // appel de la méthode update du datacontext
        dt.update(p);
        return  "redirect:/Product/liste";
    }
    
    @RequestMapping("Product/rechercher")
    public ModelAndView rechercher(HttpServletRequest request){ 
        // récupération de la catégorie de recherche
        String categ=request.getParameter("categorie"); 
        // afficher la vue liste
        
        try
        {
            return new ModelAndView("liste","liste",dt.selectByCategorie(categ));
        }
        catch(Exception ex)
        {
            return new ModelAndView("erreur", "exception", ex);
        }
        
    }

}
