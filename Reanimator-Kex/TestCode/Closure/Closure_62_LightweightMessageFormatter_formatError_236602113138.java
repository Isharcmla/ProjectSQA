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

public class LightweightMessageFormatter_formatError_236602113138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100253;
     Object term100587;

    public LightweightMessageFormatter_formatError_236602113138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term103066 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term103065 = ((Class) term103066).getDeclaredField((String) "REGION");
        ((Field) term103065).setAccessible(true);
        Object enum114 = ((Field) term103065).get((Object) null);
        term100253 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term100333 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term100253, term100253.getClass(), "source", term100333);
        setField(term100253, term100253.getClass(), "excerpt", enum114);
        term100587 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term100587, term100587.getClass(), "sourceName", null);
        setIntField(term100587, term100587.getClass(), "lineNumber", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term100587;
        try {
            callMethod(klass, "formatError", argTypes, term100253, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


