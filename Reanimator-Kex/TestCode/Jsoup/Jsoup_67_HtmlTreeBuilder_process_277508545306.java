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

public class HtmlTreeBuilder_process_277508545306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226391;
     Object term226461;
     Object enum571;

    public HtmlTreeBuilder_process_277508545306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226391 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term226391, term226391.getClass(), "currentToken", null);
        term226461 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        Class<? extends Object> term227051 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term227050 = ((Class) term227051).getDeclaredField((String) "InSelect");
        ((Field) term227050).setAccessible(true);
        enum571 = ((Field) term227050).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Object[] args = new Object[2];
        args[0] = term226461;
        args[1] = enum571;
        try {
            callMethod(klass, "process", argTypes, term226391, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


