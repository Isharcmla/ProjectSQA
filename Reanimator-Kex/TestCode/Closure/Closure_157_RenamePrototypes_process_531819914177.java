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

public class RenamePrototypes_process_531819914177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216230;
     Object term216544;
     Object term216614;

    public RenamePrototypes_process_531819914177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term217936 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term217935 = ((Class) term217936).getDeclaredField((String) "NORMALIZED");
        ((Field) term217935).setAccessible(true);
        Object enum221 = ((Field) term217935).get((Object) null);
        term216230 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term216310 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term216310, term216310.getClass(), "stage", enum221);
        setField(term216230, term216230.getClass(), "compiler", term216310);
        term216544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term216544, term216544.getClass(), "type", 0);
        setField(term216544, term216544.getClass(), "first", null);
        term216614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term216614, term216614.getClass(), "type", 105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term216544;
        args[1] = term216614;
        try {
            callMethod(klass, "process", argTypes, term216230, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


