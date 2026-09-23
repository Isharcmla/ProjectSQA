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

public class XmlTreeBuilder_process_14292257583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211813;
     Object term211879;

    public XmlTreeBuilder_process_14292257583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211813 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term212674 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term212673 = ((Class) term212674).getDeclaredField((String) "Doctype");
        ((Field) term212673).setAccessible(true);
        Object enum290 = ((Field) term212673).get((Object) null);
        term211879 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term211879, term211879.getClass(), "type", enum290);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term211879;
        try {
            callMethod(klass, "process", argTypes, term211813, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


