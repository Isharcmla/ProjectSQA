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

public class Tokeniser_emit_1272425389115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149844;
     Object term149966;

    public Tokeniser_emit_1272425389115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149844 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term149908 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setBooleanField(term149844, term149844.getClass(), "isEmitPending", false);
        setField(term149844, term149844.getClass(), "emitPending", term149908);
        Class<? extends Object> term151054 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term151053 = ((Class) term151054).getDeclaredField((String) "StartTag");
        ((Field) term151053).setAccessible(true);
        Object enum431 = ((Field) term151053).get((Object) null);
        term149966 = newInstance(Class.forName("org.jsoup.parser.Token$EOF"));
        setField(term149966, term149966.getClass(), "type", enum431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term149966;
        try {
            callMethod(klass, "emit", argTypes, term149844, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


