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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Normalize_extractForInitializer_142113984840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5043;
     Object term5113;
     Object term5253;

    public Normalize_extractForInitializer_142113984840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5043 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        term5113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term5113, term5113.getClass(), "first", term5113);
        setField(term5113, term5113.getClass(), "next", term5183);
        setIntField(term5113, term5113.getClass(), "type", 126);
        term5253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term5113;
        args[1] = term5253;
        args[2] = null;
        try {
            callMethod(klass, "extractForInitializer", argTypes, term5043, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


