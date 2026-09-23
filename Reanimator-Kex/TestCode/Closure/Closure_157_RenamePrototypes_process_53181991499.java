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

public class RenamePrototypes_process_53181991499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100446;
     Object term100822;
     Object term100914;

    public RenamePrototypes_process_53181991499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term102208 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term102207 = ((Class) term102208).getDeclaredField((String) "NORMALIZED");
        ((Field) term102207).setAccessible(true);
        Object enum104 = ((Field) term102207).get((Object) null);
        term100446 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term100526 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term100730 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term100526, term100526.getClass(), "stage", enum104);
        setField(term100446, term100446.getClass(), "compiler", term100526);
        setField(term100446, term100446.getClass(), "properties", term100730);
        setField(term100446, term100446.getClass(), "prevUsedRenameMap", null);
        setField(term100446, term100446.getClass(), "reservedNames", null);
        setField(term100446, term100446.getClass(), "reservedCharacters", null);
        term100822 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term100822, term100822.getClass(), "type", 0);
        setField(term100822, term100822.getClass(), "first", null);
        term100914 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term100914, term100914.getClass(), "type", 0);
        setField(term100914, term100914.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term100822;
        args[1] = term100914;
        try {
            callMethod(klass, "process", argTypes, term100446, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


