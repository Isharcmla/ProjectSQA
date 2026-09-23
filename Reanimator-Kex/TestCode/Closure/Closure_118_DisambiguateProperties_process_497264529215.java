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
import java.util.HashSet;

public class DisambiguateProperties_process_497264529215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95946;

    public DisambiguateProperties_process_497264529215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term97488 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term97487 = ((Class) term97488).getDeclaredField((String) "NORMALIZED");
        ((Field) term97487).setAccessible(true);
        Object enum55 = ((Field) term97487).get((Object) null);
        Object term96448 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        Object term96540 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term96448, term96448.getClass(), "typeA", term96540);
        setField(term96448, term96448.getClass(), "src", null);
        ArrayList term96332 = new ArrayList();
        ((ArrayList) term96332).add(term96448);
        HashSet term96722 = new HashSet();
        term95946 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term96026 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term96280 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term96674 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem"));
        setField(term96026, term96026.getClass(), "stage", enum55);
        setField(term96280, term96280.getClass(), "mismatches", term96332);
        setField(term96026, term96026.getClass(), "typeValidator", term96280);
        setField(term95946, term95946.getClass(), "compiler", term96026);
        setField(term96674, term96674.getClass(), "invalidatingTypes", term96722);
        setField(term95946, term95946.getClass(), "typeSystem", term96674);
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
            callMethod(klass, "process", argTypes, term95946, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


