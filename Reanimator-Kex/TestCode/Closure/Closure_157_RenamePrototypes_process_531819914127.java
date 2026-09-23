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

public class RenamePrototypes_process_531819914127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140458;
     Object term140794;

    public RenamePrototypes_process_531819914127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term142092 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term142091 = ((Class) term142092).getDeclaredField((String) "NORMALIZED");
        ((Field) term142091).setAccessible(true);
        Object enum146 = ((Field) term142091).get((Object) null);
        term140458 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term140538 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term140538, term140538.getClass(), "stage", enum146);
        setField(term140458, term140458.getClass(), "compiler", term140538);
        term140794 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term140794, term140794.getClass(), "type", 132);
        setField(term140794, term140794.getClass(), "propListHead", null);
        setField(term140794, term140794.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term140794;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term140458, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


