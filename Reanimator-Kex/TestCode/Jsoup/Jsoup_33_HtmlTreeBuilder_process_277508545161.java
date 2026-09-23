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

public class HtmlTreeBuilder_process_277508545161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403196;
     Object term403262;
     Object enum1301;

    public HtmlTreeBuilder_process_277508545161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403196 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term403196, term403196.getClass(), "currentToken", null);
        term403262 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Class<? extends Object> term404330 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term404329 = ((Class) term404330).getDeclaredField((String) "InSelect");
        ((Field) term404329).setAccessible(true);
        enum1301 = ((Field) term404329).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Object[] args = new Object[2];
        args[0] = term403262;
        args[1] = enum1301;
        try {
            callMethod(klass, "process", argTypes, term403196, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


