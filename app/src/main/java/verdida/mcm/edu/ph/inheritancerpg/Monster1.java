package verdida.mcm.edu.ph.inheritancerpg;

public class Monster1 extends CharbaseStats {
    private String desc;
    public Monster1(int id,double bhp,
                    double bmp,double bpatk,
                    double bmatk,double bpdef,
                    double bmdef,String desc){

        super(id, bhp, bmp,bpatk,bmatk, bpdef, bmdef);
        this.desc=desc;
    }
    public void setId(int id) {
        super.setId(id);
    }
    public void setBhp(double bhp) {
        super.setBhp(bhp);
    }
    public void setBmp(double bmp) {
        super.setBmp(bmp);
    }
    public void setBmatk(double bmatk) {
        super.setBmatk(bmatk);
    }
    public void setBpatk(double bpatk) {
        super.setBpatk(bpatk);
    }
    public void setBmdef(double bmdef) {
        super.setBmdef(bmdef);
    }
    public void setBpdef(double bpdef) {
        super.setBpdef(bpdef);
    }

    public int getId() {
        return super.getId();
    }
    public double getBhp() {
        return super.getBhp();
    }
    public double getBmp() {
        return super.getBmp();
    }
    public double getBmatk() {
        return super.getBmatk();
    }
    public double getBpatk() {
        return super.getBpatk();
    }
    public double getBmdef() {
        return super.getBmdef();
    }
    public double getBpdef() {
        return super.getBpdef();
    }
}
