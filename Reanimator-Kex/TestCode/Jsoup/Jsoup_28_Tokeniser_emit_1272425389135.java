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
import java.lang.String;
import java.lang.Object;

public class Tokeniser_emit_1272425389135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122714;
     Object term122780;

    public Tokeniser_emit_1272425389135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122714 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term122714, term122714.getClass(), "isEmitPending", false);
        setField(term122714, term122714.getClass(), "emitPending", null);
        Class<? extends Object> term123607 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term123606 = ((Class) term123607).getDeclaredField((String) "EndTag");
        ((Field) term123606).setAccessible(true);
        Object enum304 = ((Field) term123606).get((Object) null);
        term122780 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term122780, term122780.getClass(), "type", enum304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term122780;
        try {
            callMethod(klass, "emit", argTypes, term122714, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


