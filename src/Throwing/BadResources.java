package Throwing;

import java.util.EmptyStackException;

public class BadResources implements AutoCloseable {
    public void accessResource(){
        throw new RuntimeException("Runtime exception in access");
    }

    @Override
    public void close() throws Exception {
        throw new NullPointerException("Im exception.Hey!");
    }
}
