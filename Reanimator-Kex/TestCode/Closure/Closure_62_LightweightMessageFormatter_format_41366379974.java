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

public class LightweightMessageFormatter_format_41366379974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45084;
     Object term45418;

    public LightweightMessageFormatter_format_41366379974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46890 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term46889 = ((Class) term46890).getDeclaredField((String) "REGION");
        ((Field) term46889).setAccessible(true);
        Object enum64 = ((Field) term46889).get((Object) null);
        term45084 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term45164 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term45084, term45084.getClass(), "source", term45164);
        setField(term45084, term45084.getClass(), "excerpt", enum64);
        term45418 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term45418, term45418.getClass(), "sourceName", null);
        setIntField(term45418, term45418.getClass(), "lineNumber", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term45418;
        args[1] = false;
        try {
            callMethod(klass, "format", argTypes, term45084, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


