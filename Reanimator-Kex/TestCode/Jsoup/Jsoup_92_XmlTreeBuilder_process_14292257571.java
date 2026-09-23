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

public class XmlTreeBuilder_process_14292257571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204207;
     Object term204273;

    public XmlTreeBuilder_process_14292257571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204207 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term205068 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term205067 = ((Class) term205068).getDeclaredField((String) "Doctype");
        ((Field) term205067).setAccessible(true);
        Object enum281 = ((Field) term205067).get((Object) null);
        term204273 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term204273, term204273.getClass(), "type", enum281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term204273;
        try {
            callMethod(klass, "process", argTypes, term204207, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


