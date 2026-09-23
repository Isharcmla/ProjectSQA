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
import java.util.LinkedHashMap;

public class Tokeniser_emit_1272425389247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213086;
     Object term213284;

    public Tokeniser_emit_1272425389247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213086 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term213152 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term213220 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term213086, term213086.getClass(), "isEmitPending", false);
        setField(term213086, term213086.getClass(), "emitPending", term213152);
        setIntField(term213220, term213220.getClass(), "maxSize", 2147483647);
        setField(term213086, term213086.getClass(), "errors", term213220);
        Class<? extends Object> term214147 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term214146 = ((Class) term214147).getDeclaredField((String) "EndTag");
        ((Field) term214146).setAccessible(true);
        Object enum381 = ((Field) term214146).get((Object) null);
        Object term213600 = newInstance(Class.forName("java.lang.Object"));
        LinkedHashMap term213510 = new LinkedHashMap();
        ((LinkedHashMap) term213510).put(term213600, term213600);
        term213284 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term213450 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term213284, term213284.getClass(), "type", enum381);
        setField(term213450, term213450.getClass(), "attributes", term213510);
        setField(term213284, term213284.getClass(), "attributes", term213450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term213284;
        try {
            callMethod(klass, "emit", argTypes, term213086, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


