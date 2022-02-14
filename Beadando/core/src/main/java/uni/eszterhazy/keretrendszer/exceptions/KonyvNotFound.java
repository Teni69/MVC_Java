package uni.eszterhazy.keretrendszer.exceptions;

public class KonyvNotFound extends Throwable {
    public KonyvNotFound(String id) {
        super(id);
    }
}