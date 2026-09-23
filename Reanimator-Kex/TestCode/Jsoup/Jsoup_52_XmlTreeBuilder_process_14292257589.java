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

public class XmlTreeBuilder_process_14292257589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99480;
     Object term99538;

    public XmlTreeBuilder_process_14292257589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99480 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term100325 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term100324 = ((Class) term100325).getDeclaredField((String) "Doctype");
        ((Field) term100324).setAccessible(true);
        Object enum188 = ((Field) term100324).get((Object) null);
        term99538 = newInstance(Class.forName("org.jsoup.parser.Token$EOF"));
        setField(term99538, term99538.getClass(), "type", enum188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term99538;
        try {
            callMethod(klass, "process", argTypes, term99480, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


