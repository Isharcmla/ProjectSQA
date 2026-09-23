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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class RenamePrototypes_process_53181991451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34254;
     Object term34568;

    public RenamePrototypes_process_53181991451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35972 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term35971 = ((Class) term35972).getDeclaredField((String) "NORMALIZED_OBFUSCATED");
        ((Field) term35971).setAccessible(true);
        Object enum33 = ((Field) term35971).get((Object) null);
        term34254 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term34334 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term34334, term34334.getClass(), "stage", enum33);
        setField(term34254, term34254.getClass(), "compiler", term34334);
        term34568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34568, term34568.getClass(), "type", 0);
        setField(term34568, term34568.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term34568;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term34254, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


