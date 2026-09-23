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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class XmlTreeBuilder_process_14292257527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33556;
     Object term33614;
     Object term33909;
     Object term33910;

    public XmlTreeBuilder_process_14292257527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33556 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term33916 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term33915 = ((Class) term33916).getDeclaredField((String) "EOF");
        ((Field) term33915).setAccessible(true);
        Object enum97 = ((Field) term33915).get((Object) null);
        term33614 = newInstance(Class.forName("org.jsoup.parser.Token$EOF"));
        setField(term33614, term33614.getClass(), "type", enum97);
        term33909 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term33909, term33909.getClass(), "reader", null);
        setField(term33909, term33909.getClass(), "tokeniser", null);
        setField(term33909, term33909.getClass(), "doc", null);
        setField(term33909, term33909.getClass(), "stack", null);
        setField(term33909, term33909.getClass(), "baseUri", null);
        setField(term33909, term33909.getClass(), "currentToken", null);
        setField(term33909, term33909.getClass(), "errors", null);
        Class<? extends Object> term34092 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term34091 = ((Class) term34092).getDeclaredField((String) "EOF");
        ((Field) term34091).setAccessible(true);
        Object enum98 = ((Field) term34091).get((Object) null);
        term33910 = newInstance(Class.forName("org.jsoup.parser.Token$EOF"));
        setField(term33910, term33910.getClass(), "type", enum98);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term33614;
        Object retValue = callMethod(klass, "process", argTypes, term33556, args);
        assertTrue(recursiveEquals(term33556, term33909));
        assertTrue(recursiveEquals(term33614, term33910));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


