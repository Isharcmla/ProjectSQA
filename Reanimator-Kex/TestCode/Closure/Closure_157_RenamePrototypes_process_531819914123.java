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

public class RenamePrototypes_process_531819914123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135105;
     Object term135419;

    public RenamePrototypes_process_531819914123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term136820 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term136819 = ((Class) term136820).getDeclaredField((String) "NORMALIZED");
        ((Field) term136819).setAccessible(true);
        Object enum140 = ((Field) term136819).get((Object) null);
        term135105 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        Object term135185 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term135185, term135185.getClass(), "stage", enum140);
        setField(term135105, term135105.getClass(), "compiler", term135185);
        term135419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term135489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term135419, term135419.getClass(), "type", 0);
        setField(term135419, term135419.getClass(), "first", term135489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term135419;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term135105, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


