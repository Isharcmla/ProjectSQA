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

public class RenamePrototypes_process_531819914149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172683;
     Object term173059;
     Object term173151;

    public RenamePrototypes_process_531819914149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term174445 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term174444 = ((Class) term174445).getDeclaredField((String) "NORMALIZED");
        ((Field) term174444).setAccessible(true);
        Object enum179 = ((Field) term174444).get((Object) null);
        term172683 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term172763 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term172967 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term172763, term172763.getClass(), "stage", enum179);
        setField(term172683, term172683.getClass(), "compiler", term172763);
        setField(term172683, term172683.getClass(), "properties", term172967);
        term173059 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term173059, term173059.getClass(), "type", 0);
        setField(term173059, term173059.getClass(), "first", null);
        term173151 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term173151, term173151.getClass(), "type", 0);
        setField(term173151, term173151.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term173059;
        args[1] = term173151;
        try {
            callMethod(klass, "process", argTypes, term172683, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


