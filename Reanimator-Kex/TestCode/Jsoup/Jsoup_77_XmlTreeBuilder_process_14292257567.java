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

public class XmlTreeBuilder_process_14292257567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206039;
     Object term206109;

    public XmlTreeBuilder_process_14292257567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206039 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term206907 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term206906 = ((Class) term206907).getDeclaredField((String) "Doctype");
        ((Field) term206906).setAccessible(true);
        Object enum238 = ((Field) term206906).get((Object) null);
        term206109 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term206109, term206109.getClass(), "type", enum238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term206109;
        try {
            callMethod(klass, "process", argTypes, term206039, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


