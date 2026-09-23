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

public class Tokeniser_emit_1272425389221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211764;
     Object term211828;

    public Tokeniser_emit_1272425389221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211764 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term211764, term211764.getClass(), "isEmitPending", false);
        setField(term211764, term211764.getClass(), "emitPending", null);
        Class<? extends Object> term212469 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term212468 = ((Class) term212469).getDeclaredField((String) "EndTag");
        ((Field) term212468).setAccessible(true);
        Object enum477 = ((Field) term212468).get((Object) null);
        term211828 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term211994 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term211828, term211828.getClass(), "type", enum477);
        setField(term211828, term211828.getClass(), "attributes", term211994);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term211828;
        try {
            callMethod(klass, "emit", argTypes, term211764, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


