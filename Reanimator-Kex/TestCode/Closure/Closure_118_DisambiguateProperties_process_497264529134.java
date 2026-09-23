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
import java.lang.ClassCastException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class DisambiguateProperties_process_497264529134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44972;

    public DisambiguateProperties_process_497264529134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term47119 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term47118 = ((Class) term47119).getDeclaredField((String) "NORMALIZED");
        ((Field) term47118).setAccessible(true);
        Object enum22 = ((Field) term47118).get((Object) null);
        Object term45438 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        ArrayList term45358 = new ArrayList();
        ((ArrayList) term45358).add(term45438);
        ((ArrayList) term45358).add((Object)null);
        ((ArrayList) term45358).add((Object)null);
        ((ArrayList) term45358).add((Object)null);
        ((ArrayList) term45358).add((Object)null);
        ((ArrayList) term45358).add((Object)null);
        ((ArrayList) term45358).add((Object)null);
        ((ArrayList) term45358).add((Object)null);
        ((ArrayList) term45358).add((Object)null);
        ((ArrayList) term45358).add((Object)null);
        term44972 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term45052 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term45306 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term45052, term45052.getClass(), "stage", enum22);
        setField(term45306, term45306.getClass(), "mismatches", term45358);
        setField(term45052, term45052.getClass(), "typeValidator", term45306);
        setField(term44972, term44972.getClass(), "compiler", term45052);
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
            callMethod(klass, "process", argTypes, term44972, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


