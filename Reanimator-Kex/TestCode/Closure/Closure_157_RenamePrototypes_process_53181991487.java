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

public class RenamePrototypes_process_53181991487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82009;
     Object term82339;

    public RenamePrototypes_process_53181991487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term83758 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term83757 = ((Class) term83758).getDeclaredField((String) "NORMALIZED_OBFUSCATED");
        ((Field) term83757).setAccessible(true);
        Object enum87 = ((Field) term83757).get((Object) null);
        term82009 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term82089 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term82089, term82089.getClass(), "stage", enum87);
        setField(term82009, term82009.getClass(), "compiler", term82089);
        term82339 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term82339, term82339.getClass(), "type", 0);
        setField(term82339, term82339.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term82339;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term82009, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


