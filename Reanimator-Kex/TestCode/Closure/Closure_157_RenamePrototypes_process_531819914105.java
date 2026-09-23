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

public class RenamePrototypes_process_531819914105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109037;
     Object term109373;

    public RenamePrototypes_process_531819914105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term110673 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term110672 = ((Class) term110673).getDeclaredField((String) "NORMALIZED");
        ((Field) term110672).setAccessible(true);
        Object enum113 = ((Field) term110672).get((Object) null);
        term109037 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term109117 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term109117, term109117.getClass(), "stage", enum113);
        setField(term109037, term109037.getClass(), "compiler", term109117);
        term109373 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term109373, term109373.getClass(), "type", 132);
        setField(term109373, term109373.getClass(), "propListHead", null);
        setField(term109373, term109373.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term109373;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term109037, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


