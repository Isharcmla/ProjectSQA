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

public class Tokeniser_emit_1272425389231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215019;
     Object term215151;

    public Tokeniser_emit_1272425389231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215019 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term215087 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term215019, term215019.getClass(), "isEmitPending", false);
        setField(term215019, term215019.getClass(), "emitPending", null);
        setIntField(term215087, term215087.getClass(), "maxSize", 2147483647);
        setField(term215019, term215019.getClass(), "errors", term215087);
        Class<? extends Object> term215799 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term215798 = ((Class) term215799).getDeclaredField((String) "EndTag");
        ((Field) term215798).setAccessible(true);
        Object enum373 = ((Field) term215798).get((Object) null);
        term215151 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term215317 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term215151, term215151.getClass(), "type", enum373);
        setField(term215151, term215151.getClass(), "attributes", term215317);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term215151;
        try {
            callMethod(klass, "emit", argTypes, term215019, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


