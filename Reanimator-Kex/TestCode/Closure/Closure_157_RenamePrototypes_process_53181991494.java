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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class RenamePrototypes_process_53181991494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92026;
     Object term92488;
     Object term92580;

    public RenamePrototypes_process_53181991494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term93905 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term93904 = ((Class) term93905).getDeclaredField((String) "NORMALIZED");
        ((Field) term93904).setAccessible(true);
        Object enum97 = ((Field) term93904).get((Object) null);
        term92026 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term92106 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term92310 = newInstance(Class.forName("java.util.TreeMap"));
        Object term92396 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        setField(term92106, term92106.getClass(), "stage", enum97);
        setField(term92026, term92026.getClass(), "compiler", term92106);
        setField(term92026, term92026.getClass(), "properties", term92310);
        setField(term92026, term92026.getClass(), "prevUsedRenameMap", term92396);
        term92488 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term92488, term92488.getClass(), "type", 0);
        setField(term92488, term92488.getClass(), "first", null);
        term92580 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term92580, term92580.getClass(), "type", 0);
        setField(term92580, term92580.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term92488;
        args[1] = term92580;
        try {
            callMethod(klass, "process", argTypes, term92026, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


