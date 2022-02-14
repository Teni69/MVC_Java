package uni.eszterhazy.keretrendszer.exceptions;

public class KevesOldalSzam extends Throwable {
    public KevesOldalSzam(int oldalSzam) {
        super(String.valueOf(oldalSzam));
    }
}
