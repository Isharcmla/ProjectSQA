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

public class HtmlTreeBuilder_process_277508545391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361426;
     Object term361496;
     Object enum618;

    public HtmlTreeBuilder_process_277508545391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term361426 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term361426, term361426.getClass(), "currentToken", null);
        term361496 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        Class<? extends Object> term362088 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term362087 = ((Class) term362088).getDeclaredField((String) "InSelect");
        ((Field) term362087).setAccessible(true);
        enum618 = ((Field) term362087).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Object[] args = new Object[2];
        args[0] = term361496;
        args[1] = enum618;
        try {
            callMethod(klass, "process", argTypes, term361426, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


