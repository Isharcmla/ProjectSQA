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

public class DisambiguateProperties_process_497264529193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81284;

    public DisambiguateProperties_process_497264529193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term82722 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term82721 = ((Class) term82722).getDeclaredField((String) "NORMALIZED");
        ((Field) term82721).setAccessible(true);
        Object enum45 = ((Field) term82721).get((Object) null);
        Object term81786 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        Object term81878 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term81786, term81786.getClass(), "typeA", term81878);
        setField(term81786, term81786.getClass(), "src", null);
        ArrayList term81670 = new ArrayList();
        ((ArrayList) term81670).add(term81786);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        ((ArrayList) term81670).add((Object)null);
        term81284 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term81364 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term81618 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term82024 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem"));
        setField(term81364, term81364.getClass(), "stage", enum45);
        setField(term81618, term81618.getClass(), "mismatches", term81670);
        setField(term81364, term81364.getClass(), "typeValidator", term81618);
        setField(term81284, term81284.getClass(), "compiler", term81364);
        setField(term81284, term81284.getClass(), "typeSystem", term82024);
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
            callMethod(klass, "process", argTypes, term81284, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


