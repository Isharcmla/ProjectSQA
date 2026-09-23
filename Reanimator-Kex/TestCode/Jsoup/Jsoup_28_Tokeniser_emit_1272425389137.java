package org.jsoup.parser;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.ClassCastException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Tokeniser_emit_1272425389137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124238;
     Object term124374;

    public Tokeniser_emit_1272425389137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124238 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term124304 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setBooleanField(term124238, term124238.getClass(), "isEmitPending", false);
        setField(term124238, term124238.getClass(), "emitPending", term124304);
        Class<? extends Object> term125214 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term125213 = ((Class) term125214).getDeclaredField((String) "StartTag");
        ((Field) term125213).setAccessible(true);
        Object enum306 = ((Field) term125213).get((Object) null);
        term124374 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term124374, term124374.getClass(), "type", enum306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term124374;
        try {
            callMethod(klass, "emit", argTypes, term124238, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


