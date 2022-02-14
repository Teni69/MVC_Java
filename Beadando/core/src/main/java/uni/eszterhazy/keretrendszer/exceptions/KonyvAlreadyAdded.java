package uni.eszterhazy.keretrendszer.exceptions;

public class KonyvAlreadyAdded extends Throwable{
    public KonyvAlreadyAdded(String id) {
        super(id);
    }
}