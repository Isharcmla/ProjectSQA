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

public class LightweightMessageFormatter_formatWarning_2030513493136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99403;
     Object term99737;

    public LightweightMessageFormatter_formatWarning_2030513493136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term101209 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term101208 = ((Class) term101209).getDeclaredField((String) "REGION");
        ((Field) term101208).setAccessible(true);
        Object enum112 = ((Field) term101208).get((Object) null);
        term99403 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term99483 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term99403, term99403.getClass(), "source", term99483);
        setField(term99403, term99403.getClass(), "excerpt", enum112);
        term99737 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term99737, term99737.getClass(), "sourceName", null);
        setIntField(term99737, term99737.getClass(), "lineNumber", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term99737;
        try {
            callMethod(klass, "formatWarning", argTypes, term99403, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


