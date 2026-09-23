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
import java.lang.StringBuilder;

public class RenamePrototypes_process_531819914170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204061;
     Object term204497;
     Object term204589;

    public RenamePrototypes_process_531819914170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term207353 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term207352 = ((Class) term207353).getDeclaredField((String) "NORMALIZED");
        ((Field) term207352).setAccessible(true);
        Object enum210 = ((Field) term207352).get((Object) null);
        StringBuilder term204365 = new StringBuilder();
        term204061 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term204141 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term204405 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term204141, term204141.getClass(), "stage", enum210);
        setField(term204141, term204141.getClass(), "debugLog", term204365);
        setField(term204061, term204061.getClass(), "compiler", term204141);
        setField(term204061, term204061.getClass(), "properties", term204405);
        setField(term204061, term204061.getClass(), "prevUsedRenameMap", null);
        setField(term204061, term204061.getClass(), "reservedNames", null);
        setField(term204061, term204061.getClass(), "reservedCharacters", null);
        term204497 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term204497, term204497.getClass(), "type", 0);
        setField(term204497, term204497.getClass(), "first", null);
        term204589 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term204589, term204589.getClass(), "type", 0);
        setField(term204589, term204589.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term204497;
        args[1] = term204589;
        try {
            callMethod(klass, "process", argTypes, term204061, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


