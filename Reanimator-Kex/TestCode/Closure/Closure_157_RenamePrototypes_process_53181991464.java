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

public class RenamePrototypes_process_53181991464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50369;
     Object term50683;

    public RenamePrototypes_process_53181991464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term52936 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term52935 = ((Class) term52936).getDeclaredField((String) "NORMALIZED");
        ((Field) term52935).setAccessible(true);
        Object enum52 = ((Field) term52935).get((Object) null);
        term50369 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term50449 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term50449, term50449.getClass(), "stage", enum52);
        setField(term50369, term50369.getClass(), "compiler", term50449);
        term50683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50683, term50683.getClass(), "type", 0);
        setField(term50683, term50683.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term50683;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term50369, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


