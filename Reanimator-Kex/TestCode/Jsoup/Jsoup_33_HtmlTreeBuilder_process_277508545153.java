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

public class HtmlTreeBuilder_process_277508545153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term396842;
     Object term396900;
     Object enum1293;

    public HtmlTreeBuilder_process_277508545153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term396842 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term396842, term396842.getClass(), "currentToken", null);
        term396900 = newInstance(Class.forName("org.jsoup.parser.Token$EOF"));
        Class<? extends Object> term399272 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term399271 = ((Class) term399272).getDeclaredField((String) "InSelect");
        ((Field) term399271).setAccessible(true);
        enum1293 = ((Field) term399271).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Object[] args = new Object[2];
        args[0] = term396900;
        args[1] = enum1293;
        try {
            callMethod(klass, "process", argTypes, term396842, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


