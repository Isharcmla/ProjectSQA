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

public class RenamePrototypes_process_53181991477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68924;
     Object term69260;

    public RenamePrototypes_process_53181991477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term70558 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term70557 = ((Class) term70558).getDeclaredField((String) "NORMALIZED");
        ((Field) term70557).setAccessible(true);
        Object enum72 = ((Field) term70557).get((Object) null);
        term68924 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term69004 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term69004, term69004.getClass(), "stage", enum72);
        setField(term68924, term68924.getClass(), "compiler", term69004);
        term69260 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term69260, term69260.getClass(), "type", 132);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term69260;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term68924, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


