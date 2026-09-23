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

public class HtmlTreeBuilder_process_746811373339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242475;
     Object term242665;

    public HtmlTreeBuilder_process_746811373339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term254900 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term254899 = ((Class) term254900).getDeclaredField((String) "Initial");
        ((Field) term254899).setAccessible(true);
        Object enum617 = ((Field) term254899).get((Object) null);
        term242475 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term242475, term242475.getClass(), "currentToken", null);
        setField(term242475, term242475.getClass(), "state", enum617);
        term242665 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term242665;
        try {
            callMethod(klass, "process", argTypes, term242475, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


