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

public class RenamePrototypes_process_53181991454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36963;
     Object term37293;

    public RenamePrototypes_process_53181991454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39647 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term39646 = ((Class) term39647).getDeclaredField((String) "NORMALIZED_OBFUSCATED");
        ((Field) term39646).setAccessible(true);
        Object enum37 = ((Field) term39646).get((Object) null);
        term36963 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term37043 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term37043, term37043.getClass(), "stage", enum37);
        setField(term36963, term36963.getClass(), "compiler", term37043);
        term37293 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term37293;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term36963, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


