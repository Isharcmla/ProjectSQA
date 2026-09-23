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

public class RenamePrototypes_process_531819914161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189487;
     Object term189823;

    public RenamePrototypes_process_531819914161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term191230 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term191229 = ((Class) term191230).getDeclaredField((String) "NORMALIZED");
        ((Field) term191229).setAccessible(true);
        Object enum197 = ((Field) term191229).get((Object) null);
        term189487 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term189567 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term189567, term189567.getClass(), "stage", enum197);
        setField(term189487, term189487.getClass(), "compiler", term189567);
        term189823 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term189893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term189823, term189823.getClass(), "type", 132);
        setField(term189823, term189823.getClass(), "propListHead", null);
        setField(term189823, term189823.getClass(), "first", term189893);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term189823;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term189487, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


