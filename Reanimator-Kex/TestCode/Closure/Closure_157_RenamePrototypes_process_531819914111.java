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

public class RenamePrototypes_process_531819914111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117428;
     Object term117758;

    public RenamePrototypes_process_531819914111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term119072 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term119071 = ((Class) term119072).getDeclaredField((String) "NORMALIZED");
        ((Field) term119071).setAccessible(true);
        Object enum122 = ((Field) term119071).get((Object) null);
        term117428 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term117508 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term117508, term117508.getClass(), "stage", enum122);
        setField(term117428, term117428.getClass(), "compiler", term117508);
        term117758 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term117758, term117758.getClass(), "type", 132);
        setField(term117758, term117758.getClass(), "propListHead", null);
        setField(term117758, term117758.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term117758;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term117428, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


