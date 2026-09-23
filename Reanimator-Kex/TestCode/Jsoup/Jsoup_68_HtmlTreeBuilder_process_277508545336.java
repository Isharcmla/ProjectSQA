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

public class HtmlTreeBuilder_process_277508545336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289237;
     Object term289307;
     Object enum582;

    public HtmlTreeBuilder_process_277508545336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289237 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term289237, term289237.getClass(), "currentToken", null);
        term289307 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        Class<? extends Object> term289899 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term289898 = ((Class) term289899).getDeclaredField((String) "InSelect");
        ((Field) term289898).setAccessible(true);
        enum582 = ((Field) term289898).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Object[] args = new Object[2];
        args[0] = term289307;
        args[1] = enum582;
        try {
            callMethod(klass, "process", argTypes, term289237, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


