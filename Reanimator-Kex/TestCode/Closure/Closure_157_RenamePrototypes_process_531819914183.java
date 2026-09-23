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

public class RenamePrototypes_process_531819914183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224871;
     Object term225201;

    public RenamePrototypes_process_531819914183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term226672 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term226671 = ((Class) term226672).getDeclaredField((String) "NORMALIZED");
        ((Field) term226671).setAccessible(true);
        Object enum230 = ((Field) term226671).get((Object) null);
        term224871 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term224951 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term224951, term224951.getClass(), "stage", enum230);
        setField(term224871, term224871.getClass(), "compiler", term224951);
        term225201 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term225287 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term225201, term225201.getClass(), "type", 132);
        setField(term225201, term225201.getClass(), "propListHead", null);
        setField(term225201, term225201.getClass(), "first", term225287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term225201;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term224871, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


