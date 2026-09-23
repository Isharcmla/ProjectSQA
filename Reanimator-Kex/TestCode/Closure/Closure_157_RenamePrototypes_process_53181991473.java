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

public class RenamePrototypes_process_53181991473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61950;
     Object term62264;

    public RenamePrototypes_process_53181991473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term65280 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term65279 = ((Class) term65280).getDeclaredField((String) "NORMALIZED_OBFUSCATED");
        ((Field) term65279).setAccessible(true);
        Object enum66 = ((Field) term65279).get((Object) null);
        term61950 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term62030 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term62030, term62030.getClass(), "stage", enum66);
        setField(term61950, term61950.getClass(), "compiler", term62030);
        term62264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62264, term62264.getClass(), "type", 105);
        setField(term62264, term62264.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term62264;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term61950, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


