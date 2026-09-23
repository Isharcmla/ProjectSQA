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

public class RenamePrototypes_process_531819914133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149053;
     Object term149389;

    public RenamePrototypes_process_531819914133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term150807 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term150806 = ((Class) term150807).getDeclaredField((String) "NORMALIZED_OBFUSCATED");
        ((Field) term150806).setAccessible(true);
        Object enum155 = ((Field) term150806).get((Object) null);
        term149053 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term149133 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term149133, term149133.getClass(), "stage", enum155);
        setField(term149053, term149053.getClass(), "compiler", term149133);
        term149389 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term149389;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term149053, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


