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

public class XmlTreeBuilder_process_14292257533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69555;
     Object term69619;

    public XmlTreeBuilder_process_14292257533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69555 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term70412 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term70411 = ((Class) term70412).getDeclaredField((String) "Doctype");
        ((Field) term70411).setAccessible(true);
        Object enum193 = ((Field) term70411).get((Object) null);
        term69619 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term69619, term69619.getClass(), "type", enum193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term69619;
        try {
            callMethod(klass, "process", argTypes, term69555, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


