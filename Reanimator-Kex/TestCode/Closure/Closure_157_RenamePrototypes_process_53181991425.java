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

public class RenamePrototypes_process_53181991425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5596;

    public RenamePrototypes_process_53181991425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8206 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term8205 = ((Class) term8206).getDeclaredField((String) "NORMALIZED");
        ((Field) term8205).setAccessible(true);
        Object enum4 = ((Field) term8205).get((Object) null);
        term5596 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term5676 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term5676, term5676.getClass(), "stage", enum4);
        setField(term5596, term5596.getClass(), "compiler", term5676);
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
            callMethod(klass, "process", argTypes, term5596, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


