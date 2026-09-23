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

public class RenamePrototypes_process_531819914115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123593;
     Object term124009;
     Object term124101;

    public RenamePrototypes_process_531819914115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term125406 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term125405 = ((Class) term125406).getDeclaredField((String) "NORMALIZED");
        ((Field) term125405).setAccessible(true);
        Object enum128 = ((Field) term125405).get((Object) null);
        term123593 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term123673 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term123877 = newInstance(Class.forName("java.util.TreeMap"));
        Object term123917 = newInstance(Class.forName("java.util.TreeSet"));
        setField(term123673, term123673.getClass(), "stage", enum128);
        setField(term123593, term123593.getClass(), "compiler", term123673);
        setField(term123593, term123593.getClass(), "properties", term123877);
        setField(term123593, term123593.getClass(), "prevUsedRenameMap", null);
        setField(term123593, term123593.getClass(), "reservedNames", term123917);
        setField(term123593, term123593.getClass(), "reservedCharacters", null);
        term124009 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term124009, term124009.getClass(), "type", 0);
        setField(term124009, term124009.getClass(), "first", null);
        term124101 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term124101, term124101.getClass(), "type", 0);
        setField(term124101, term124101.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term124009;
        args[1] = term124101;
        try {
            callMethod(klass, "process", argTypes, term123593, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


