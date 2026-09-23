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

public class RenamePrototypes_process_53181991483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76679;
     Object term77015;
     Object term77107;

    public RenamePrototypes_process_53181991483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term78002 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term78001 = ((Class) term78002).getDeclaredField((String) "NORMALIZED");
        ((Field) term78001).setAccessible(true);
        Object enum81 = ((Field) term78001).get((Object) null);
        term76679 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term76759 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term76759, term76759.getClass(), "stage", enum81);
        setField(term76679, term76679.getClass(), "compiler", term76759);
        term77015 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term77015, term77015.getClass(), "type", 0);
        setField(term77015, term77015.getClass(), "first", null);
        term77107 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term77015;
        args[1] = term77107;
        try {
            callMethod(klass, "process", argTypes, term76679, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


