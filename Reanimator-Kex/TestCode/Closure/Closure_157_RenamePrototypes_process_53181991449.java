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

public class RenamePrototypes_process_53181991449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31541;
     Object term31855;

    public RenamePrototypes_process_53181991449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33114 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term33113 = ((Class) term33114).getDeclaredField((String) "NORMALIZED_OBFUSCATED");
        ((Field) term33113).setAccessible(true);
        Object enum30 = ((Field) term33113).get((Object) null);
        term31541 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term31621 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term31621, term31621.getClass(), "stage", enum30);
        setField(term31541, term31541.getClass(), "compiler", term31621);
        term31855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31855, term31855.getClass(), "type", 35);
        setField(term31855, term31855.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term31855;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term31541, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


