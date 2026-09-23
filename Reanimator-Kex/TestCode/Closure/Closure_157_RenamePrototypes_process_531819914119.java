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

public class RenamePrototypes_process_531819914119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129242;
     Object term129578;
     Object term129670;

    public RenamePrototypes_process_531819914119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term130993 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term130992 = ((Class) term130993).getDeclaredField((String) "NORMALIZED");
        ((Field) term130992).setAccessible(true);
        Object enum134 = ((Field) term130992).get((Object) null);
        term129242 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term129322 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term129322, term129322.getClass(), "stage", enum134);
        setField(term129242, term129242.getClass(), "compiler", term129322);
        term129578 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term129578, term129578.getClass(), "type", 0);
        setField(term129578, term129578.getClass(), "first", null);
        term129670 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term129670, term129670.getClass(), "type", 33);
        setField(term129670, term129670.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term129578;
        args[1] = term129670;
        try {
            callMethod(klass, "process", argTypes, term129242, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


