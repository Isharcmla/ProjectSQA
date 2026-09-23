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

public class RenamePrototypes_process_531819914131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144479;
     Object term144941;
     Object term145033;

    public RenamePrototypes_process_531819914131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term147926 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term147925 = ((Class) term147926).getDeclaredField((String) "NORMALIZED");
        ((Field) term147925).setAccessible(true);
        Object enum152 = ((Field) term147925).get((Object) null);
        term144479 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term144559 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term144763 = newInstance(Class.forName("java.util.TreeMap"));
        Object term144849 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        setField(term144559, term144559.getClass(), "stage", enum152);
        setField(term144479, term144479.getClass(), "compiler", term144559);
        setField(term144479, term144479.getClass(), "properties", term144763);
        setField(term144479, term144479.getClass(), "prevUsedRenameMap", term144849);
        setField(term144479, term144479.getClass(), "reservedNames", null);
        setField(term144479, term144479.getClass(), "reservedCharacters", null);
        term144941 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term144941, term144941.getClass(), "type", 0);
        setField(term144941, term144941.getClass(), "first", null);
        term145033 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term145033, term145033.getClass(), "type", 0);
        setField(term145033, term145033.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term144941;
        args[1] = term145033;
        try {
            callMethod(klass, "process", argTypes, term144479, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


