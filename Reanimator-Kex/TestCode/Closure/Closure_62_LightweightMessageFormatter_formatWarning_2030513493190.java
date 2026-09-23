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

public class LightweightMessageFormatter_formatWarning_2030513493190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155325;
     Object term155659;

    public LightweightMessageFormatter_formatWarning_2030513493190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term157978 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term157977 = ((Class) term157978).getDeclaredField((String) "REGION");
        ((Field) term157977).setAccessible(true);
        Object enum181 = ((Field) term157977).get((Object) null);
        term155325 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term155405 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term155325, term155325.getClass(), "source", term155405);
        setField(term155325, term155325.getClass(), "excerpt", enum181);
        term155659 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term155659, term155659.getClass(), "sourceName", null);
        setIntField(term155659, term155659.getClass(), "lineNumber", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term155659;
        try {
            callMethod(klass, "formatWarning", argTypes, term155325, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


