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

public class RenamePrototypes_process_531819914107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111750;
     Object term112080;

    public RenamePrototypes_process_531819914107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term113518 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term113517 = ((Class) term113518).getDeclaredField((String) "NORMALIZED_OBFUSCATED");
        ((Field) term113517).setAccessible(true);
        Object enum116 = ((Field) term113517).get((Object) null);
        term111750 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term111830 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term111830, term111830.getClass(), "stage", enum116);
        setField(term111750, term111750.getClass(), "compiler", term111830);
        term112080 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term112080, term112080.getClass(), "type", 132);
        setField(term112080, term112080.getClass(), "propListHead", null);
        setField(term112080, term112080.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term112080;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term111750, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


