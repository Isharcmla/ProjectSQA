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

public class HtmlTreeBuilder_process_277508545188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206487;
     Object term206553;
     Object enum614;

    public HtmlTreeBuilder_process_277508545188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206487 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term206487, term206487.getClass(), "currentToken", null);
        term206553 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Class<? extends Object> term207367 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term207366 = ((Class) term207367).getDeclaredField((String) "Initial");
        ((Field) term207366).setAccessible(true);
        enum614 = ((Field) term207366).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Object[] args = new Object[2];
        args[0] = term206553;
        args[1] = enum614;
        try {
            callMethod(klass, "process", argTypes, term206487, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


