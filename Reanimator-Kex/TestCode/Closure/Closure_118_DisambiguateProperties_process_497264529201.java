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

public class DisambiguateProperties_process_497264529201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85919;

    public DisambiguateProperties_process_497264529201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term87357 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term87356 = ((Class) term87357).getDeclaredField((String) "NORMALIZED");
        ((Field) term87356).setAccessible(true);
        Object enum47 = ((Field) term87356).get((Object) null);
        Object term86421 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        Object term86525 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term86421, term86421.getClass(), "typeA", term86525);
        setField(term86421, term86421.getClass(), "src", null);
        ArrayList term86305 = new ArrayList();
        ((ArrayList) term86305).add(term86421);
        term85919 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term85999 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term86253 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term86659 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem"));
        setField(term85999, term85999.getClass(), "stage", enum47);
        setField(term86253, term86253.getClass(), "mismatches", term86305);
        setField(term85999, term85999.getClass(), "typeValidator", term86253);
        setField(term85919, term85919.getClass(), "compiler", term85999);
        setField(term85919, term85919.getClass(), "typeSystem", term86659);
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
            callMethod(klass, "process", argTypes, term85919, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


