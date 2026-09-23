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

public class XmlTreeBuilder_process_142922575281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term439901;
     Object term439967;

    public XmlTreeBuilder_process_142922575281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term439901 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term440534 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term440533 = ((Class) term440534).getDeclaredField((String) "Doctype");
        ((Field) term440533).setAccessible(true);
        Object enum261 = ((Field) term440533).get((Object) null);
        term439967 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term439967, term439967.getClass(), "type", enum261);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term439967;
        try {
            callMethod(klass, "process", argTypes, term439901, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


