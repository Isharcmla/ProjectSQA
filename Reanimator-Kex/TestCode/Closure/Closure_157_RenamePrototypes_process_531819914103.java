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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class RenamePrototypes_process_531819914103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106052;
     Object term106514;
     Object term106606;

    public RenamePrototypes_process_531819914103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term107931 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term107930 = ((Class) term107931).getDeclaredField((String) "NORMALIZED");
        ((Field) term107930).setAccessible(true);
        Object enum110 = ((Field) term107930).get((Object) null);
        term106052 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term106132 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term106336 = newInstance(Class.forName("java.util.TreeMap"));
        Object term106422 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        setField(term106132, term106132.getClass(), "stage", enum110);
        setField(term106052, term106052.getClass(), "compiler", term106132);
        setField(term106052, term106052.getClass(), "properties", term106336);
        setField(term106052, term106052.getClass(), "prevUsedRenameMap", term106422);
        term106514 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term106514, term106514.getClass(), "type", 0);
        setField(term106514, term106514.getClass(), "first", null);
        term106606 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term106606, term106606.getClass(), "type", 0);
        setField(term106606, term106606.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term106514;
        args[1] = term106606;
        try {
            callMethod(klass, "process", argTypes, term106052, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


