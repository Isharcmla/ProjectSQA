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
import java.lang.String;
import java.lang.Object;

public class XmlTreeBuilder_process_14292257575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207178;
     Object term207244;

    public XmlTreeBuilder_process_14292257575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207178 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term207809 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term207808 = ((Class) term207809).getDeclaredField((String) "Doctype");
        ((Field) term207808).setAccessible(true);
        Object enum285 = ((Field) term207808).get((Object) null);
        term207244 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term207244, term207244.getClass(), "type", enum285);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term207244;
        try {
            callMethod(klass, "process", argTypes, term207178, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


