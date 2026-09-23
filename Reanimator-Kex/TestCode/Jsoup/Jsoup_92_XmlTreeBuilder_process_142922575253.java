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

public class XmlTreeBuilder_process_142922575253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293338;
     Object term293400;

    public XmlTreeBuilder_process_142922575253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293338 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Class<? extends Object> term294191 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term294190 = ((Class) term294191).getDeclaredField((String) "Doctype");
        ((Field) term294190).setAccessible(true);
        Object enum305 = ((Field) term294190).get((Object) null);
        term293400 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term293400, term293400.getClass(), "type", enum305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term293400;
        try {
            callMethod(klass, "process", argTypes, term293338, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


