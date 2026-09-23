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

public class RenamePrototypes_process_53181991455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37937;
     Object term38273;

    public RenamePrototypes_process_53181991455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41343 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term41342 = ((Class) term41343).getDeclaredField((String) "NORMALIZED");
        ((Field) term41342).setAccessible(true);
        Object enum39 = ((Field) term41342).get((Object) null);
        term37937 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term38017 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term38017, term38017.getClass(), "stage", enum39);
        setField(term37937, term37937.getClass(), "compiler", term38017);
        term38273 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term38273;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term37937, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


