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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class HtmlTreeBuilder_process_746811373238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210231;
     Object term210421;

    public HtmlTreeBuilder_process_746811373238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term211814 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term211813 = ((Class) term211814).getDeclaredField((String) "Initial");
        ((Field) term211813).setAccessible(true);
        Object enum568 = ((Field) term211813).get((Object) null);
        term210231 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term210231, term210231.getClass(), "currentToken", null);
        setField(term210231, term210231.getClass(), "state", enum568);
        term210421 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term210421;
        try {
            callMethod(klass, "process", argTypes, term210231, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


