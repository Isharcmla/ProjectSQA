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

public class RenamePrototypes_process_53181991481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73991;
     Object term74321;

    public RenamePrototypes_process_53181991481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term75629 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term75628 = ((Class) term75629).getDeclaredField((String) "NORMALIZED");
        ((Field) term75628).setAccessible(true);
        Object enum78 = ((Field) term75628).get((Object) null);
        term73991 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term74071 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term74071, term74071.getClass(), "stage", enum78);
        setField(term73991, term73991.getClass(), "compiler", term74071);
        term74321 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term74321, term74321.getClass(), "type", 0);
        setField(term74321, term74321.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term74321;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term73991, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


