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

public class RenamePrototypes_process_531819914165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195210;
     Object term195546;
     Object term195638;

    public RenamePrototypes_process_531819914165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term196961 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term196960 = ((Class) term196961).getDeclaredField((String) "NORMALIZED");
        ((Field) term196960).setAccessible(true);
        Object enum203 = ((Field) term196960).get((Object) null);
        term195210 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term195290 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term195290, term195290.getClass(), "stage", enum203);
        setField(term195210, term195210.getClass(), "compiler", term195290);
        term195546 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term195546, term195546.getClass(), "type", 0);
        setField(term195546, term195546.getClass(), "first", null);
        term195638 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term195638, term195638.getClass(), "type", 33);
        setField(term195638, term195638.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term195546;
        args[1] = term195638;
        try {
            callMethod(klass, "process", argTypes, term195210, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


