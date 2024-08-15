public class Bnode {
    //atributos
    private int x;
    private Bnode esq, dir;

    //construtor
    public Bnode (int valor){
        x = valor;
        esq = null;
        dir = null;
    }

    public void add (int valor){
        if(valor > x){
            if(dir!=null) dir.add(valor);
            else dir = new Bnode(valor);
        }else{
            if(esq!=null) esq.add(valor);
            else esq = new Bnode(valor);  
        }
    }

    public void show(){
        System.out.println(x);
        if(esq!=null) esq.show();
        if(dir!=null) dir.show();
    }

    public int size(){
        int e = 0, d = 0;
        if(esq!=null) e = esq.size();
        if(dir!=null) d = dir.size();
        return 1 + e + d;
    }

    public int soma(){
        int e = 0, d = 0;
        if(esq!=null) e = esq.soma();
        if(dir!=null) d = dir.soma();
        return x + e + d;
    }
}
