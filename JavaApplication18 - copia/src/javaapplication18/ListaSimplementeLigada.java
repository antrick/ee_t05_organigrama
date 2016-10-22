/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

/**
 *
 * @author andy
 */
public class ListaSimplementeLigada<T extends Comparable<T>> {
     private Nodo <T> inicio=null;
     private Nodo <T> lista;
     private int cont=0;
    public ListaSimplementeLigada() {
        estaVacia();
    }

    public boolean estaVacia (){
        return inicio==null;
    }
    
    public void setInicio (Nodo<T> inicio){
        this.inicio=inicio;
    }
    
    public Nodo <T> getInicio(){
        return inicio;
    }
    
    public void setLista (Nodo<T> lista){
        this.lista=lista;
    }
    
    public Nodo <T> getLista(){
        return lista;
    }
    
    public String toString(){
        Nodo <T> temporal=inicio;
        String res=" ";
        while (temporal!=null){
            res+=temporal.getDato()+" ";
            temporal=temporal.getSiguiente();
        }
        return res;
    }
    
     /********************** I n s e r t a r **********************/
    public void InsertaInicio(T dato){
        
     Nodo nodo= new Nodo(dato);
     nodo.setSiguiente(inicio);
     inicio=nodo;
    }
        public void InsertaFinal(T dato){
     Nodo aux;
     if(inicio!=null){
        aux=inicio;
        while(aux.getSiguiente()!=null){
         aux=aux.getSiguiente();
        }
        
        aux.setSiguiente(new Nodo(dato));
        }else{
         InsertaInicio(dato);
        }
     }
    public void agregarAntesDe(T dato, T referencia) {
        boolean band=true;
        Nodo<T> temporal, encontrado;
        temporal=inicio;
        encontrado=temporal;
                     
           while( (temporal.getDato()!= referencia)&&band) {
               if(temporal.getSiguiente()!=null){
                   encontrado=temporal;
                   temporal=temporal.getSiguiente();
                }else{
                    band=false;
                }  
           }          
           if(band){
               if(temporal==inicio){
                   InsertaInicio(dato);
                }else{
                     
                    Nodo<T> nuevo=new Nodo (dato);
                    nuevo.setSiguiente(temporal);
                    encontrado.setSiguiente(nuevo);
                    System.out.println ("Ha sido agregado antes de: "+referencia);
                }
            }
    }
    public void InsertaOrdenado(T m){
        Nodo<T>temporal,nodoencontrado=null,nuevo; 
        boolean band=true;
        temporal=inicio;
        if(inicio==null){
            InsertaInicio(m);
        }else{
            while(m.compareTo(temporal.getDato())==1&& band){
                if(temporal.getSiguiente()!=null){
                    nodoencontrado=temporal;
                    temporal=temporal.getSiguiente();
                }else{
                    band=false;
                }
            }
            if(band){
                if(temporal==inicio){
                    InsertaInicio(m);
                }else{
                    
                    nuevo=new Nodo(m);
                    nuevo.setSiguiente(temporal);
                    nodoencontrado.setSiguiente(nuevo);
                }

            }else{
                InsertaFinal(m);
            }
        }
    }	 
    public void agregarDespuesDe(T dato, T referencia) {
       boolean band=true;
       Nodo<T> temporal = inicio;
       
       Nodo aux;
         while( temporal.getDato()!=referencia && band) {
           if(temporal.getSiguiente()!=null)
                  temporal = temporal.getSiguiente();
                else{
                    band=false;
                }
             }
          if(band){
               if(temporal==inicio){
                   Nodo<T> n = new Nodo<T>(dato);
                   aux=temporal.getSiguiente();
                   temporal.setSiguiente(n);
                   n.setSiguiente(aux);
                   //InsertaInicio(dato);
                }else{
                    Nodo<T> nuevo=new Nodo<T> (dato);
                    nuevo.setSiguiente(temporal.getSiguiente());
                    temporal.setSiguiente(nuevo);
                    System.out.println ("Ha sido agregado después de: "+referencia);
                }
            }
       
    }
    
    /********************** R e c o r r e r **********************/
    public void RecorreIterativa (){
        Nodo<T> temporal=inicio;
        if(inicio==null)
           System.out.println ("No vacío");
           else {
               System.out.println ("Los elementos de la lista son:");
               while (temporal!=null){
                   System.out.print("["+temporal.getDato ()+"]-> ");
                   temporal=temporal.getSiguiente();
                }
                System.out.println ("\n");
            }
    }
    
    public Nodo<T> obten_ultimo (){
        Nodo<T> temporal=inicio;
        if(inicio==null)
           System.out.println ("No vacío");
           else {
                 while (temporal.getSiguiente()!=null){
                    temporal=temporal.getSiguiente();
                }
            }
        return temporal;
    }
    /********************** E l i mi n a r **********************/
    public void eliminarInicio() {
        Nodo<T> temporal=inicio;
       if(estaVacia()) 
          System.out.println ("La lista esta vacía, no se puede eliminar");
       
       if (temporal.getSiguiente()!=null){
           inicio=temporal.getSiguiente();
           System.out.println ("Ha sido eliminado el inicio");
        }else{
          inicio=null;
          System.out.println ("Ha sido eliminado el inicio");
        }
    }
        
    public void eliminarFinal() {
       if(estaVacia()) 
          System.out.println ("La lista esta vacía, no se puede eliminar");
       
          Nodo<T> temporal, anterior;
          temporal=inicio;
          anterior=temporal;
       if (inicio.getSiguiente()==null){
          inicio=null;
          System.out.println ("Ha sido eliminado el final");
        } else{
           while(temporal.getSiguiente()!=null){
               anterior=temporal;
               temporal=temporal.getSiguiente();
            }
            anterior.setSiguiente(null);
            System.out.println ("Ha sido eliminado el final");
        }
    }
    
    public Nodo<T> buscar(T m) {
       Nodo<T> temporal = inicio;
       boolean band=true;
         while(temporal.getDato().compareTo(m)!=0 && band){
              if (temporal.getSiguiente()!=null){
                  temporal=temporal.getSiguiente();
                }else{
                    band=false;
                }
            }
          if (band){
                return temporal;
            } else{
                return null;
            }
     }
    
    public void RecorreRecursivo(Nodo a){
    if(a!=null){
        System.out.print("["+a.getDato()+"]-> ");
        RecorreRecursivo(a.getSiguiente());
     }
    }
    
    public void BuscaRecursivo(Nodo a,T dato){
    if(a!=null){
     if(a.getDato()==dato){
      System.out.println("El dato Buscado es: "+a.getDato());
     }else{
         BuscaRecursivo(a.getSiguiente(),dato);
       }
      }else{
        System.out.println("El dato no existe en la lista!");
        }
    }
   
    public void BorraDespues(T dato){
        Nodo temp=inicio;
        boolean band=true;
        while(temp.getDato()!=dato&& band){
            if(temp.getSiguiente()!=null){
                temp=temp.getSiguiente();
            }else{
                band=false;
            }
        }
        if(band){
            if(temp==inicio){
                eliminarInicio();
            }else{
                temp.setSiguiente(temp.getSiguiente().getSiguiente());
                temp.getSiguiente().setSiguiente(null);
            }
        }
    }
    public void BorraAntes(T dato){
        Nodo temp=inicio;
        Nodo aux=null,aux2=null;
        boolean band=true;
        while(temp.getDato()!=dato&& band){
            if(temp.getSiguiente()!=null){
                aux2=aux;
                aux=temp;
                temp=temp.getSiguiente();
            }else{
                band=false;
            }
        }
        if(band){
            if(temp==inicio){
                eliminarInicio();
            }else{
                aux2.setSiguiente(temp);
            }
        }
    }
}

