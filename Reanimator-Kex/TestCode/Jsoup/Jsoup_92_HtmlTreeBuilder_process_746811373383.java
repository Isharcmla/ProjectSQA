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

public class HtmlTreeBuilder_process_746811373383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355694;
     Object term355882;

    public HtmlTreeBuilder_process_746811373383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term356963 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term356962 = ((Class) term356963).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term356962).setAccessible(true);
        Object enum609 = ((Field) term356962).get((Object) null);
        term355694 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term355694, term355694.getClass(), "currentToken", null);
        setField(term355694, term355694.getClass(), "state", enum609);
        Class<? extends Object> term357209 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term357208 = ((Class) term357209).getDeclaredField((String) "StartTag");
        ((Field) term357208).setAccessible(true);
        Object enum610 = ((Field) term357208).get((Object) null);
        term355882 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term355882, term355882.getClass(), "type", enum610);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term355882;
        try {
            callMethod(klass, "process", argTypes, term355694, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


