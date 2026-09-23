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

public class RenamePrototypes_process_531819914145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166392;
     Object term166722;

    public RenamePrototypes_process_531819914145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term168147 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term168146 = ((Class) term168147).getDeclaredField((String) "NORMALIZED_OBFUSCATED");
        ((Field) term168146).setAccessible(true);
        Object enum173 = ((Field) term168146).get((Object) null);
        term166392 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term166472 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term166472, term166472.getClass(), "stage", enum173);
        setField(term166392, term166392.getClass(), "compiler", term166472);
        term166722 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term166722, term166722.getClass(), "type", 132);
        setField(term166722, term166722.getClass(), "propListHead", null);
        setField(term166722, term166722.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term166722;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term166392, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


