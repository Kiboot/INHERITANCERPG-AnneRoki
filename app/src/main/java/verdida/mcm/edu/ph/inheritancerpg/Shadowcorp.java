package verdida.mcm.edu.ph.inheritancerpg;

public class Shadowcorp extends CharbaseStats {
    private double bstr,bint,bagi,bvit;
    private double gstr,gint,gagi,gvit;
    private String cLass;
    private double lvl;
    private int id;
    //borrowed
    public Shadowcorp(int id, double bhp, double bmp,
                      double bpatk, double bmatk, double bpdef,
                      double bmdef){
        super(id, bhp, bmp, bpatk, bmatk, bpdef, bmdef);
    }
    //local
    public Shadowcorp(String cLass,
                   double bstr,double bint,double bagi,double bvit,
                   double lvl,
                   double gstr,double gint,double gagi,double gvit){
        this.bstr=bstr;
        this.bint=bint; this.bagi=bagi;
        this.bvit=bvit; this.gstr=gstr;
        this.gagi=gagi; this.gint=gint;
        this.gvit=gvit; this.cLass=cLass;
        this.lvl=lvl;
    }
    //borrowed
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

    //local
    public void setBstr(double bstr){
        this.bstr=bstr;
    }
    public void setBint(double bint){
        this.bint=bint;
    }
    public void setBagi(double bagi) {
        this.bagi = bagi;
    }
    public void setBvit(double bvit) {
        this.bvit = bvit;
    }
    public void setcLass(String cLass) {
        this.cLass = cLass;
    }
    public void setGagi(double gagi) {
        this.gagi = gagi;
    }
    public void setGint(double gint) {
        this.gint = gint;
    }
    public void setGstr(double gstr) {
        this.gstr = gstr;
    }
    public void setGvit(double gvit) {
        this.gvit = gvit;
    }
    public void setLvl(double lvl) {
        this.lvl = lvl;
    }

    public double getBagi() {
        return bagi;
    }
    public double getBint() {
        return bint;
    }
    public double getBstr() {
        return bstr;
    }
    public double getBvit() {
        return bvit;
    }
    public double getGagi() {
        return gagi;
    }
    public double getGint() {
        return gint;
    }
    public double getGstr() {
        return gstr;
    }
    public double getGvit() {
        return gvit;
    }
    public double getLvl() {
        return lvl;
    }
    public String getcLass() {
        return cLass;
    }

    //formula
    public double strinc(){
        return bstr + (gstr*lvl);
    }
    public double agiinc(){
        return bagi + (gagi+lvl);
    }
    public double vitinc(){
        return bvit + (gvit*lvl);
    }
    public double intinc(){
        return bint + (gint*lvl);
    }
    public double hpinc(){
        return super.getBhp() + (30*vitinc());
    }
    public double mpinc(){
        return super.getBmp() + (25*intinc());
    }
    public double patkinc(){
        return super.getBpatk() + (1.5+agiinc());
    }
    public double matkinc(){
        return super.getBmatk() + intinc();
    }
    public double mdefinc(){
        return super.getBmdef() + (2*getBmdef());
    }
}
