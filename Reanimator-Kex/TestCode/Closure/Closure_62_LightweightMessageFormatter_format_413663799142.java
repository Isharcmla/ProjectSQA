package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class LightweightMessageFormatter_format_413663799142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104151;
     Object term104485;

    public LightweightMessageFormatter_format_413663799142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term105956 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term105955 = ((Class) term105956).getDeclaredField((String) "REGION");
        ((Field) term105955).setAccessible(true);
        Object enum118 = ((Field) term105955).get((Object) null);
        term104151 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term104231 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term104151, term104151.getClass(), "source", term104231);
        setField(term104151, term104151.getClass(), "excerpt", enum118);
        term104485 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term104485, term104485.getClass(), "sourceName", null);
        setIntField(term104485, term104485.getClass(), "lineNumber", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term104485;
        args[1] = false;
        try {
            callMethod(klass, "format", argTypes, term104151, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


