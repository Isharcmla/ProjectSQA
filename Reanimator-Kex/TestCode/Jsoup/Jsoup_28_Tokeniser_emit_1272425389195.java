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

public class Tokeniser_emit_1272425389195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169570;
     Object term169634;

    public Tokeniser_emit_1272425389195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169570 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term169570, term169570.getClass(), "isEmitPending", false);
        setField(term169570, term169570.getClass(), "emitPending", null);
        Class<? extends Object> term170275 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term170274 = ((Class) term170275).getDeclaredField((String) "EndTag");
        ((Field) term170274).setAccessible(true);
        Object enum343 = ((Field) term170274).get((Object) null);
        term169634 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term169800 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term169634, term169634.getClass(), "type", enum343);
        setField(term169634, term169634.getClass(), "attributes", term169800);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term169634;
        try {
            callMethod(klass, "emit", argTypes, term169570, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


