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

public class HtmlTreeBuilder_process_277508545308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term676512;
     Object term676570;
     Object enum1902;

    public HtmlTreeBuilder_process_277508545308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term676512 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term676512, term676512.getClass(), "currentToken", null);
        term676570 = newInstance(Class.forName("org.jsoup.parser.Token$EOF"));
        Class<? extends Object> term677408 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term677407 = ((Class) term677408).getDeclaredField((String) "InSelect");
        ((Field) term677407).setAccessible(true);
        enum1902 = ((Field) term677407).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Object[] args = new Object[2];
        args[0] = term676570;
        args[1] = enum1902;
        try {
            callMethod(klass, "process", argTypes, term676512, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


