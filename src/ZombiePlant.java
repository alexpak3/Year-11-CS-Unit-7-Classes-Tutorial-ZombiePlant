public class ZombiePlant {
    private int potency;
    private int treatmentNeeded;
    private boolean danger;
    public ZombiePlant(int potency, int treatmentNeeded){
        this.treatmentNeeded = treatmentNeeded;
        this.potency = potency;
        if(treatmentNeeded > 0){
            this.danger = true;
        }
        else{
            this.danger = false;
        }

    }
    public int getPotency(){
    return potency;
    }
    public int treatmentsNeeded(){
        return treatmentNeeded;
    }
    public boolean isDangerous(){
        return danger;
    }

    public String treat(int x) {
        if (x <= potency && x > 0 && treatmentNeeded > 0) {
            this.treatmentNeeded--;
            if (treatmentNeeded == 0) {
                danger = false;
            }
            return "The treatment's potency is < = " + potency + ", therefore the treatment worked.";
        }
        if (x >= potency) {
            treatmentNeeded++;
        }
        return null;
    }


}
