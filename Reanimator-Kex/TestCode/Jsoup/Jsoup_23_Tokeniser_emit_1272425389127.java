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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Tokeniser_emit_1272425389127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112408;
     Object term112472;

    public Tokeniser_emit_1272425389127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112408 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term112408, term112408.getClass(), "isEmitPending", false);
        setField(term112408, term112408.getClass(), "emitPending", null);
        Class<? extends Object> term113054 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term113053 = ((Class) term113054).getDeclaredField((String) "EndTag");
        ((Field) term113053).setAccessible(true);
        Object enum301 = ((Field) term113053).get((Object) null);
        term112472 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term112472, term112472.getClass(), "type", enum301);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term112472;
        try {
            callMethod(klass, "emit", argTypes, term112408, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


