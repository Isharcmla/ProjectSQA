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

public class RenamePrototypes_process_53181991459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44916;
     Object term45252;

    public RenamePrototypes_process_53181991459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46563 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term46562 = ((Class) term46563).getDeclaredField((String) "NORMALIZED");
        ((Field) term46562).setAccessible(true);
        Object enum45 = ((Field) term46562).get((Object) null);
        term44916 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term44996 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term44996, term44996.getClass(), "stage", enum45);
        setField(term44916, term44916.getClass(), "compiler", term44996);
        term45252 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term45252;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term44916, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


