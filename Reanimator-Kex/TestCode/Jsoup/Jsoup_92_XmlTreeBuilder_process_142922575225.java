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

public class XmlTreeBuilder_process_142922575225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282821;
     Object term282891;

    public XmlTreeBuilder_process_142922575225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282821 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term283695 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term283694 = ((Class) term283695).getDeclaredField((String) "StartTag");
        ((Field) term283694).setAccessible(true);
        Object enum300 = ((Field) term283694).get((Object) null);
        term282891 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term282891, term282891.getClass(), "type", enum300);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term282891;
        try {
            callMethod(klass, "process", argTypes, term282821, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


