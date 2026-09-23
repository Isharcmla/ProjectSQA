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

public class RenamePrototypes_process_531819914113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120142;
     Object term120478;

    public RenamePrototypes_process_531819914113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term121776 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term121775 = ((Class) term121776).getDeclaredField((String) "NORMALIZED");
        ((Field) term121775).setAccessible(true);
        Object enum125 = ((Field) term121775).get((Object) null);
        term120142 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term120222 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term120222, term120222.getClass(), "stage", enum125);
        setField(term120142, term120142.getClass(), "compiler", term120222);
        term120478 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term120478, term120478.getClass(), "type", 132);
        setField(term120478, term120478.getClass(), "propListHead", null);
        setField(term120478, term120478.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term120478;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term120142, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


