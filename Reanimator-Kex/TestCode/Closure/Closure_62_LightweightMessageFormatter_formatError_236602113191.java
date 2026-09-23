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

public class LightweightMessageFormatter_formatError_236602113191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157020;
     Object term157354;

    public LightweightMessageFormatter_formatError_236602113191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term158965 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term158964 = ((Class) term158965).getDeclaredField((String) "REGION");
        ((Field) term158964).setAccessible(true);
        Object enum183 = ((Field) term158964).get((Object) null);
        term157020 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term157100 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term157020, term157020.getClass(), "source", term157100);
        setField(term157020, term157020.getClass(), "excerpt", enum183);
        term157354 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term157354, term157354.getClass(), "sourceName", null);
        setIntField(term157354, term157354.getClass(), "lineNumber", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term157354;
        try {
            callMethod(klass, "formatError", argTypes, term157020, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


