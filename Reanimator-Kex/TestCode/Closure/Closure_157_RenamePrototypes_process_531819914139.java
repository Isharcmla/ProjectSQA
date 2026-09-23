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

public class RenamePrototypes_process_531819914139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157586;
     Object term157900;

    public RenamePrototypes_process_531819914139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term159301 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term159300 = ((Class) term159301).getDeclaredField((String) "NORMALIZED");
        ((Field) term159300).setAccessible(true);
        Object enum164 = ((Field) term159300).get((Object) null);
        term157586 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term157666 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term157666, term157666.getClass(), "stage", enum164);
        setField(term157586, term157586.getClass(), "compiler", term157666);
        term157900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term157970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term157900, term157900.getClass(), "type", 0);
        setField(term157970, term157970.getClass(), "next", null);
        setIntField(term157970, term157970.getClass(), "type", 0);
        setField(term157970, term157970.getClass(), "first", null);
        setField(term157900, term157900.getClass(), "first", term157970);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term157900;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term157586, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


