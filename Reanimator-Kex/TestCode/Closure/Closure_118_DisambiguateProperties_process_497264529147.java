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
import java.util.ArrayList;

public class DisambiguateProperties_process_497264529147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51177;

    public DisambiguateProperties_process_497264529147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term52334 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term52333 = ((Class) term52334).getDeclaredField((String) "NORMALIZED");
        ((Field) term52333).setAccessible(true);
        Object enum24 = ((Field) term52333).get((Object) null);
        Object term51679 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        ArrayList term51563 = new ArrayList();
        ((ArrayList) term51563).add(term51679);
        ((ArrayList) term51563).add((Object)null);
        ((ArrayList) term51563).add((Object)null);
        ((ArrayList) term51563).add((Object)null);
        ((ArrayList) term51563).add((Object)null);
        ((ArrayList) term51563).add((Object)null);
        ((ArrayList) term51563).add((Object)null);
        ((ArrayList) term51563).add((Object)null);
        ((ArrayList) term51563).add((Object)null);
        ((ArrayList) term51563).add((Object)null);
        ((ArrayList) term51563).add((Object)null);
        ((ArrayList) term51563).add((Object)null);
        ((ArrayList) term51563).add((Object)null);
        ((ArrayList) term51563).add((Object)null);
        ((ArrayList) term51563).add((Object)null);
        ((ArrayList) term51563).add((Object)null);
        term51177 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term51257 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term51511 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term51257, term51257.getClass(), "stage", enum24);
        setField(term51511, term51511.getClass(), "mismatches", term51563);
        setField(term51257, term51257.getClass(), "typeValidator", term51511);
        setField(term51177, term51177.getClass(), "compiler", term51257);
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
            callMethod(klass, "process", argTypes, term51177, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


