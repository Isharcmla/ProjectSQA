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

public class DisambiguateProperties_process_497264529169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62985;

    public DisambiguateProperties_process_497264529169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term64411 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term64410 = ((Class) term64411).getDeclaredField((String) "NORMALIZED");
        ((Field) term64410).setAccessible(true);
        Object enum31 = ((Field) term64410).get((Object) null);
        Object term63487 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        Object term63585 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term63487, term63487.getClass(), "typeA", term63585);
        setField(term63487, term63487.getClass(), "src", null);
        ArrayList term63371 = new ArrayList();
        ((ArrayList) term63371).add(term63487);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        ((ArrayList) term63371).add((Object)null);
        term62985 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term63065 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term63319 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term63719 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem"));
        setField(term63065, term63065.getClass(), "stage", enum31);
        setField(term63319, term63319.getClass(), "mismatches", term63371);
        setField(term63065, term63065.getClass(), "typeValidator", term63319);
        setField(term62985, term62985.getClass(), "compiler", term63065);
        setField(term62985, term62985.getClass(), "typeSystem", term63719);
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
            callMethod(klass, "process", argTypes, term62985, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


