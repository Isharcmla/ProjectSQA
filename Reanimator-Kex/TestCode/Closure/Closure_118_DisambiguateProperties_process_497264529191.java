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

public class DisambiguateProperties_process_497264529191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79097;

    public DisambiguateProperties_process_497264529191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term80658 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term80657 = ((Class) term80658).getDeclaredField((String) "NORMALIZED");
        ((Field) term80657).setAccessible(true);
        Object enum43 = ((Field) term80657).get((Object) null);
        Object term79599 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        Object term79697 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term79599, term79599.getClass(), "typeA", term79697);
        setField(term79599, term79599.getClass(), "src", null);
        ArrayList term79483 = new ArrayList();
        ((ArrayList) term79483).add(term79599);
        HashSet term79891 = new HashSet();
        term79097 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term79177 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term79431 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term79843 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem"));
        setField(term79177, term79177.getClass(), "stage", enum43);
        setField(term79431, term79431.getClass(), "mismatches", term79483);
        setField(term79177, term79177.getClass(), "typeValidator", term79431);
        setField(term79097, term79097.getClass(), "compiler", term79177);
        setField(term79843, term79843.getClass(), "invalidatingTypes", term79891);
        setField(term79097, term79097.getClass(), "typeSystem", term79843);
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
            callMethod(klass, "process", argTypes, term79097, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


