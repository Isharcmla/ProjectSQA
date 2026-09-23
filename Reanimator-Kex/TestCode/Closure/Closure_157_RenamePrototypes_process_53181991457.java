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

public class RenamePrototypes_process_53181991457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42335;
     Object term42665;

    public RenamePrototypes_process_53181991457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43973 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term43972 = ((Class) term43973).getDeclaredField((String) "NORMALIZED");
        ((Field) term43972).setAccessible(true);
        Object enum42 = ((Field) term43972).get((Object) null);
        term42335 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term42415 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term42415, term42415.getClass(), "stage", enum42);
        setField(term42335, term42335.getClass(), "compiler", term42415);
        term42665 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term42665;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term42335, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


