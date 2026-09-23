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

public class XmlTreeBuilder_process_142922575398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360205;
     Object term360271;

    public XmlTreeBuilder_process_142922575398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term360205 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term361539 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term361538 = ((Class) term361539).getDeclaredField((String) "Doctype");
        ((Field) term361538).setAccessible(true);
        Object enum317 = ((Field) term361538).get((Object) null);
        term360271 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term360271, term360271.getClass(), "type", enum317);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term360271;
        try {
            callMethod(klass, "process", argTypes, term360205, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


