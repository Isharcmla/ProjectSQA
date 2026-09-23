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

public class RenamePrototypes_process_53181991431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11853;

    public RenamePrototypes_process_53181991431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13250 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term13249 = ((Class) term13250).getDeclaredField((String) "NORMALIZED");
        ((Field) term13249).setAccessible(true);
        Object enum9 = ((Field) term13249).get((Object) null);
        term11853 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term11933 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term11933, term11933.getClass(), "stage", enum9);
        setField(term11853, term11853.getClass(), "compiler", term11933);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term11853, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


