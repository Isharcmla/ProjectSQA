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

public class RenamePrototypes_process_531819914153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178398;
     Object term178712;

    public RenamePrototypes_process_531819914153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term180121 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term180120 = ((Class) term180121).getDeclaredField((String) "NORMALIZED_OBFUSCATED");
        ((Field) term180120).setAccessible(true);
        Object enum185 = ((Field) term180120).get((Object) null);
        term178398 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term178478 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term178478, term178478.getClass(), "stage", enum185);
        setField(term178398, term178398.getClass(), "compiler", term178478);
        term178712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term178712, term178712.getClass(), "type", 132);
        setField(term178712, term178712.getClass(), "propListHead", null);
        setField(term178712, term178712.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term178712;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term178398, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


