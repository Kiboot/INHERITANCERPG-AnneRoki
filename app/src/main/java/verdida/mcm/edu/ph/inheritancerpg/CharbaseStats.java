package verdida.mcm.edu.ph.inheritancerpg;

public class CharbaseStats {
    private double bhp,bmp,bpatk,bmatk,bpdef,bmdef;
    private int id;
    private boolean vulnerability=true;
    public CharbaseStats(int id,double bhp,double bmp,double bpatk,double bmatk,double bpdef,double bmdef){
        this.id=id;
        this.bhp=bhp;
        this.bmp=bmp;
        this.bpatk=bpatk;
        this.bpdef=bpdef;
        this.bmatk=bmatk;
        this.bmdef=bmdef;
    }
    public CharbaseStats(){}
    public void setId(int id){
        this.id=id;
    }
    public void setBhp(double bhp){
        this.bhp=bhp;
    }
    public void setBmp(double bmp){
        this.bmp=bmp;
    }
    public void setBpatk(double bpatk){
        this.bpatk=bpatk;
    }
    public void setBmatk(double bmatk){
        this.bmatk=bmatk;
    }
    public void setBpdef(double bpdef){
        this.bpdef=bpdef;
    }
    public void setBmdef(double bmdef){
        this.bmdef=bmdef;
    }
    public void setVulnerability(boolean vulnerability){
        this.vulnerability=vulnerability;
    }

    public int getId(){
        return id;
    }
    public double getBhp(){
        return bhp;
    }
    public double getBmp(){
        return bmp;
    }
    public double getBpatk(){
        return bpatk;
    }
    public double getBmatk(){
        return bmatk;
    }
    public double getBpdef(){
        return bpdef;
    }
    public double getBmdef(){
        return bmdef;
    }
    public boolean getVulnerability(){
        return vulnerability;
    }



    }

