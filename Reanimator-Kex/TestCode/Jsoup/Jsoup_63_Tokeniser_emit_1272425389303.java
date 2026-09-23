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
import java.lang.Object;
import java.lang.String;

public class Tokeniser_emit_1272425389303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265941;
     Object term266073;

    public Tokeniser_emit_1272425389303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265941 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term266009 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term265941, term265941.getClass(), "isEmitPending", false);
        setField(term265941, term265941.getClass(), "emitPending", null);
        setIntField(term266009, term266009.getClass(), "maxSize", 2147483647);
        setField(term265941, term265941.getClass(), "errors", term266009);
        Class<? extends Object> term266721 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term266720 = ((Class) term266721).getDeclaredField((String) "EndTag");
        ((Field) term266720).setAccessible(true);
        Object enum519 = ((Field) term266720).get((Object) null);
        term266073 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term266239 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term266073, term266073.getClass(), "type", enum519);
        setField(term266073, term266073.getClass(), "attributes", term266239);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term266073;
        try {
            callMethod(klass, "emit", argTypes, term265941, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


