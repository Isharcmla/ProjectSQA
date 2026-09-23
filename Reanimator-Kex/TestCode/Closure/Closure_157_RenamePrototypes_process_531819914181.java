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

public class RenamePrototypes_process_531819914181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222073;
     Object term222409;

    public RenamePrototypes_process_531819914181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term223838 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term223837 = ((Class) term223838).getDeclaredField((String) "NORMALIZED");
        ((Field) term223837).setAccessible(true);
        Object enum227 = ((Field) term223837).get((Object) null);
        term222073 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term222153 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term222153, term222153.getClass(), "stage", enum227);
        setField(term222073, term222073.getClass(), "compiler", term222153);
        term222409 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term222501 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term222409, term222409.getClass(), "type", 132);
        setField(term222409, term222409.getClass(), "propListHead", null);
        setField(term222501, term222501.getClass(), "next", null);
        setIntField(term222501, term222501.getClass(), "type", 0);
        setField(term222501, term222501.getClass(), "first", null);
        setField(term222409, term222409.getClass(), "first", term222501);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term222409;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term222073, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


