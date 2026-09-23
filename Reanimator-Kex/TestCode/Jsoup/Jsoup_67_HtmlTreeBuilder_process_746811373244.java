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

public class HtmlTreeBuilder_process_746811373244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211754;
     Object term211948;

    public HtmlTreeBuilder_process_746811373244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term212957 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term212956 = ((Class) term212957).getDeclaredField((String) "Initial");
        ((Field) term212956).setAccessible(true);
        Object enum568 = ((Field) term212956).get((Object) null);
        term211754 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term211754, term211754.getClass(), "currentToken", null);
        setField(term211754, term211754.getClass(), "state", enum568);
        term211948 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term211948;
        try {
            callMethod(klass, "process", argTypes, term211754, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


