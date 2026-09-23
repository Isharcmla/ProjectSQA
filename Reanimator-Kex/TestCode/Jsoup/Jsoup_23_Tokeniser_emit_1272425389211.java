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
import java.util.LinkedHashMap;

public class Tokeniser_emit_1272425389211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173151;
     Object term173215;

    public Tokeniser_emit_1272425389211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173151 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term173151, term173151.getClass(), "isEmitPending", false);
        setField(term173151, term173151.getClass(), "emitPending", null);
        Class<? extends Object> term174032 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term174031 = ((Class) term174032).getDeclaredField((String) "EndTag");
        ((Field) term174031).setAccessible(true);
        Object enum353 = ((Field) term174031).get((Object) null);
        LinkedHashMap term173441 = new LinkedHashMap();
        ((LinkedHashMap) term173441).put((Object)null, (Object)null);
        term173215 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term173381 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term173215, term173215.getClass(), "type", enum353);
        setField(term173381, term173381.getClass(), "attributes", term173441);
        setField(term173215, term173215.getClass(), "attributes", term173381);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term173215;
        try {
            callMethod(klass, "emit", argTypes, term173151, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


