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

public class RenamePrototypes_process_531819914159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186660;
     Object term187168;

    public RenamePrototypes_process_531819914159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term188493 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term188492 = ((Class) term188493).getDeclaredField((String) "NORMALIZED");
        ((Field) term188492).setAccessible(true);
        Object enum194 = ((Field) term188492).get((Object) null);
        term186660 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term186740 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term186944 = newInstance(Class.forName("java.util.TreeMap"));
        Object term187030 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        setField(term186740, term186740.getClass(), "stage", enum194);
        setField(term186660, term186660.getClass(), "compiler", term186740);
        setField(term186660, term186660.getClass(), "properties", term186944);
        setField(term186660, term186660.getClass(), "prevUsedRenameMap", term187030);
        term187168 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term187168, term187168.getClass(), "type", 0);
        setField(term187168, term187168.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term187168;
        args[1] = term187168;
        try {
            callMethod(klass, "process", argTypes, term186660, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


