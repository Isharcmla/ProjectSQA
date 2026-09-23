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

public class RenamePrototypes_process_53181991469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58164;
     Object term58494;

    public RenamePrototypes_process_53181991469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term59919 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term59918 = ((Class) term59919).getDeclaredField((String) "NORMALIZED_OBFUSCATED");
        ((Field) term59918).setAccessible(true);
        Object enum60 = ((Field) term59918).get((Object) null);
        term58164 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term58244 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term58244, term58244.getClass(), "stage", enum60);
        setField(term58164, term58164.getClass(), "compiler", term58244);
        term58494 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term58494, term58494.getClass(), "type", 132);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term58494;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term58164, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


