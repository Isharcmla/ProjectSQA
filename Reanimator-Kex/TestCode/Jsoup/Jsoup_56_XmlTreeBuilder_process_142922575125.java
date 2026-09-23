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

public class XmlTreeBuilder_process_142922575125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141387;
     Object term141453;

    public XmlTreeBuilder_process_142922575125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141387 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term142018 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term142017 = ((Class) term142018).getDeclaredField((String) "Doctype");
        ((Field) term142017).setAccessible(true);
        Object enum212 = ((Field) term142017).get((Object) null);
        term141453 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term141453, term141453.getClass(), "type", enum212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term141453;
        try {
            callMethod(klass, "process", argTypes, term141387, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


