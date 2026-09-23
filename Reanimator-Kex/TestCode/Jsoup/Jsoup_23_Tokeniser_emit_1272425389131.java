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

public class Tokeniser_emit_1272425389131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113931;
     Object term114061;

    public Tokeniser_emit_1272425389131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113931 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term113995 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setBooleanField(term113931, term113931.getClass(), "isEmitPending", false);
        setField(term113931, term113931.getClass(), "emitPending", term113995);
        Class<? extends Object> term114896 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term114895 = ((Class) term114896).getDeclaredField((String) "StartTag");
        ((Field) term114895).setAccessible(true);
        Object enum303 = ((Field) term114895).get((Object) null);
        term114061 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term114061, term114061.getClass(), "type", enum303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term114061;
        try {
            callMethod(klass, "emit", argTypes, term113931, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


