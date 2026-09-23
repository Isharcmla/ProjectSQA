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

public class RenamePrototypes_process_531819914171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205312;
     Object term205626;

    public RenamePrototypes_process_531819914171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term209035 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term209034 = ((Class) term209035).getDeclaredField((String) "NORMALIZED");
        ((Field) term209034).setAccessible(true);
        Object enum212 = ((Field) term209034).get((Object) null);
        term205312 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term205392 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term205392, term205392.getClass(), "stage", enum212);
        setField(term205312, term205312.getClass(), "compiler", term205392);
        term205626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term205696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term205626, term205626.getClass(), "type", 0);
        setField(term205696, term205696.getClass(), "next", null);
        setIntField(term205696, term205696.getClass(), "type", 0);
        setField(term205696, term205696.getClass(), "first", null);
        setField(term205626, term205626.getClass(), "first", term205696);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term205626;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term205312, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


