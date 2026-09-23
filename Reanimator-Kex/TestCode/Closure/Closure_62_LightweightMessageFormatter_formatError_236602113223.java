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
import java.lang.ClassCastException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;

public class LightweightMessageFormatter_formatError_236602113223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192902;
     Object term193426;

    public LightweightMessageFormatter_formatError_236602113223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term193030 = new HashMap();
        ((HashMap) term193030).put("", "");
        Class<? extends Object> term195654 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term195653 = ((Class) term195654).getDeclaredField((String) "REGION");
        ((Field) term195653).setAccessible(true);
        Object enum231 = ((Field) term195653).get((Object) null);
        term192902 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term192982 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term192982, term192982.getClass(), "inputsByName", term193030);
        setField(term192902, term192902.getClass(), "source", term192982);
        setField(term192902, term192902.getClass(), "excerpt", enum231);
        term193426 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term193426, term193426.getClass(), "sourceName", "");
        setIntField(term193426, term193426.getClass(), "lineNumber", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term193426;
        try {
            callMethod(klass, "formatError", argTypes, term192902, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


