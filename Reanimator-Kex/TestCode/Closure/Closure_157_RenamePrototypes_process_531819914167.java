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

public class RenamePrototypes_process_531819914167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198010;
     Object term198340;

    public RenamePrototypes_process_531819914167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term199630 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term199629 = ((Class) term199630).getDeclaredField((String) "NORMALIZED_OBFUSCATED");
        ((Field) term199629).setAccessible(true);
        Object enum206 = ((Field) term199629).get((Object) null);
        term198010 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term198090 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term198090, term198090.getClass(), "stage", enum206);
        setField(term198010, term198010.getClass(), "compiler", term198090);
        term198340 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term198340, term198340.getClass(), "type", 105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term198340;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term198010, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


