package cc.cc1234.app.vo;

public class SwitchableTextFieldDatum {
   
    private final String formatted;
    
    private final String raw;
    
    private boolean showRaw = true;
    
    public static final SwitchableTextFieldDatum BLANK = new SwitchableTextFieldDatum("", "");
    
    public SwitchableTextFieldDatum(String raw, String formatted) {
        this.formatted = formatted;
        this.raw = raw;
    }
    
    public synchronized String exchange() {
        showRaw = !showRaw;
        return showRaw ? raw : formatted;
    }
}