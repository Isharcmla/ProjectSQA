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

public class XmlTreeBuilder_process_14292257537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40631;
     Object term40701;

    public XmlTreeBuilder_process_14292257537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40631 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term41500 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term41499 = ((Class) term41500).getDeclaredField((String) "Doctype");
        ((Field) term41499).setAccessible(true);
        Object enum108 = ((Field) term41499).get((Object) null);
        term40701 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term40701, term40701.getClass(), "type", enum108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term40701;
        try {
            callMethod(klass, "process", argTypes, term40631, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


