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

public class LightweightMessageFormatter_formatWarning_2030513493222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191810;
     Object term192334;

    public LightweightMessageFormatter_formatWarning_2030513493222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term191938 = new HashMap();
        ((HashMap) term191938).put("", "");
        Class<? extends Object> term194369 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term194368 = ((Class) term194369).getDeclaredField((String) "REGION");
        ((Field) term194368).setAccessible(true);
        Object enum229 = ((Field) term194368).get((Object) null);
        term191810 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term191890 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term191890, term191890.getClass(), "inputsByName", term191938);
        setField(term191810, term191810.getClass(), "source", term191890);
        setField(term191810, term191810.getClass(), "excerpt", enum229);
        term192334 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term192334, term192334.getClass(), "sourceName", "");
        setIntField(term192334, term192334.getClass(), "lineNumber", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term192334;
        try {
            callMethod(klass, "formatWarning", argTypes, term191810, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


