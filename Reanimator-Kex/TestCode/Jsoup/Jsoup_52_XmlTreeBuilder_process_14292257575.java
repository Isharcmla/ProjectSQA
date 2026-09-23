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

public class XmlTreeBuilder_process_14292257575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90932;
     Object term90998;

    public XmlTreeBuilder_process_14292257575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90932 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term91793 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term91792 = ((Class) term91793).getDeclaredField((String) "Doctype");
        ((Field) term91792).setAccessible(true);
        Object enum182 = ((Field) term91792).get((Object) null);
        term90998 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term90998, term90998.getClass(), "type", enum182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term90998;
        try {
            callMethod(klass, "process", argTypes, term90932, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


