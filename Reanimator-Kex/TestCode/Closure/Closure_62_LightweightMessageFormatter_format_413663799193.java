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

public class LightweightMessageFormatter_format_413663799193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159908;
     Object term160432;

    public LightweightMessageFormatter_format_413663799193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term160036 = new HashMap();
        ((HashMap) term160036).put("", "");
        Class<? extends Object> term161375 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term161374 = ((Class) term161375).getDeclaredField((String) "REGION");
        ((Field) term161374).setAccessible(true);
        Object enum186 = ((Field) term161374).get((Object) null);
        term159908 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term159988 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term159988, term159988.getClass(), "inputsByName", term160036);
        setField(term159908, term159908.getClass(), "source", term159988);
        setField(term159908, term159908.getClass(), "excerpt", enum186);
        term160432 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term160432, term160432.getClass(), "sourceName", "");
        setIntField(term160432, term160432.getClass(), "lineNumber", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term160432;
        args[1] = false;
        try {
            callMethod(klass, "format", argTypes, term159908, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


