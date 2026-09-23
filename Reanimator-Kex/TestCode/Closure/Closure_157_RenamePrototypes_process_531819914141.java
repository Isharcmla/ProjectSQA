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

public class RenamePrototypes_process_531819914141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160776;
     Object term161198;

    public RenamePrototypes_process_531819914141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term162492 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term162491 = ((Class) term162492).getDeclaredField((String) "NORMALIZED");
        ((Field) term162491).setAccessible(true);
        Object enum167 = ((Field) term162491).get((Object) null);
        term160776 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term160856 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term161060 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term160856, term160856.getClass(), "stage", enum167);
        setField(term160776, term160776.getClass(), "compiler", term160856);
        setField(term160776, term160776.getClass(), "properties", term161060);
        setField(term160776, term160776.getClass(), "prevUsedRenameMap", null);
        setField(term160776, term160776.getClass(), "reservedNames", null);
        setField(term160776, term160776.getClass(), "reservedCharacters", null);
        term161198 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term161198, term161198.getClass(), "type", 0);
        setField(term161198, term161198.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term161198;
        args[1] = term161198;
        try {
            callMethod(klass, "process", argTypes, term160776, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


