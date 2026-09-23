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

public class XmlTreeBuilder_process_142922575181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264461;
     Object term264527;

    public XmlTreeBuilder_process_142922575181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264461 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term265092 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term265091 = ((Class) term265092).getDeclaredField((String) "Doctype");
        ((Field) term265091).setAccessible(true);
        Object enum247 = ((Field) term265091).get((Object) null);
        term264527 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term264527, term264527.getClass(), "type", enum247);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term264527;
        try {
            callMethod(klass, "process", argTypes, term264461, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


