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

public class DisambiguateProperties_process_497264529203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87940;

    public DisambiguateProperties_process_497264529203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term89366 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term89365 = ((Class) term89366).getDeclaredField((String) "NORMALIZED");
        ((Field) term89365).setAccessible(true);
        Object enum49 = ((Field) term89365).get((Object) null);
        Object term88442 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        Object term88534 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term88442, term88442.getClass(), "typeA", term88534);
        setField(term88442, term88442.getClass(), "src", null);
        ArrayList term88326 = new ArrayList();
        ((ArrayList) term88326).add(term88442);
        term87940 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term88020 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term88274 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term88668 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem"));
        setField(term88020, term88020.getClass(), "stage", enum49);
        setField(term88274, term88274.getClass(), "mismatches", term88326);
        setField(term88020, term88020.getClass(), "typeValidator", term88274);
        setField(term87940, term87940.getClass(), "compiler", term88020);
        setField(term87940, term87940.getClass(), "typeSystem", term88668);
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
            callMethod(klass, "process", argTypes, term87940, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


