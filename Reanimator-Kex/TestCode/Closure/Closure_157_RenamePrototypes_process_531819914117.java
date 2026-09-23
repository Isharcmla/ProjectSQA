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

public class RenamePrototypes_process_531819914117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126364;
     Object term126694;

    public RenamePrototypes_process_531819914117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term128113 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term128112 = ((Class) term128113).getDeclaredField((String) "NORMALIZED_OBFUSCATED");
        ((Field) term128112).setAccessible(true);
        Object enum131 = ((Field) term128112).get((Object) null);
        term126364 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term126444 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term126444, term126444.getClass(), "stage", enum131);
        setField(term126364, term126364.getClass(), "compiler", term126444);
        term126694 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term126694;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term126364, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


