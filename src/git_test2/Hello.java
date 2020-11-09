package git_test2;

public class Hello {
<<<<<<< HEAD
    
        String message = "¾È³çÇÏ¼¼¿ä";

    public String say() {
        return message;
    }

=======
    String message;

    public Hello() {
        this("¾È³çÇÏ¼¼¿ä");
    }

    public Hello(String message) {
        this.message = message;
    }
>>>>>>> 267e0463f1fe6909483cbe35e7a9d79a7ce5f0dc

    }


}
