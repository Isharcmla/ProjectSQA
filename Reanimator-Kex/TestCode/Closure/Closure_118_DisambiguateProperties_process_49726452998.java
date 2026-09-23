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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class DisambiguateProperties_process_49726452998 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25810;

    public DisambiguateProperties_process_49726452998() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32401 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term32400 = ((Class) term32401).getDeclaredField((String) "NORMALIZED");
        ((Field) term32400).setAccessible(true);
        Object enum16 = ((Field) term32400).get((Object) null);
        term25810 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term25890 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term26158 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term25890, term25890.getClass(), "stage", enum16);
        setField(term25890, term25890.getClass(), "typeValidator", null);
        setField(term25890, term25890.getClass(), "typeRegistry", term26158);
        setField(term25810, term25810.getClass(), "compiler", term25890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term25810, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


