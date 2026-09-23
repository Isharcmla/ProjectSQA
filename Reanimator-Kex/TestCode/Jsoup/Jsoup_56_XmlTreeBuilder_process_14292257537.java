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
     Object term72481;
     Object term72551;

    public XmlTreeBuilder_process_14292257537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72481 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term73350 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term73349 = ((Class) term73350).getDeclaredField((String) "Doctype");
        ((Field) term73349).setAccessible(true);
        Object enum198 = ((Field) term73349).get((Object) null);
        term72551 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term72551, term72551.getClass(), "type", enum198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term72551;
        try {
            callMethod(klass, "process", argTypes, term72481, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


