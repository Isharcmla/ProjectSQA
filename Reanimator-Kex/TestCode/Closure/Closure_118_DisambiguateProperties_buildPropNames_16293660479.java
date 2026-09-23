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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.util.HashMap;

public class DisambiguateProperties_buildPropNames_16293660479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21389;
     Object term21499;
     Object term22822;
     Object term22823;
     Object term22816;

    public DisambiguateProperties_buildPropNames_16293660479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21389 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        HashMap term21547 = new HashMap();
        term21499 = newInstance(Class.forName("com.google.javascript.jscomp.graph.StandardUnionFind"));
        setField(term21499, term21499.getClass(), "elmap", term21547);
        term22822 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term22822, term22822.getClass(), "compiler", null);
        setField(term22822, term22822.getClass(), "typeSystem", null);
        setField(term22822, term22822.getClass(), "invalidationMap", null);
        setField(term22822, term22822.getClass(), "propertiesToErrorFor", null);
        setField(term22822, term22822.getClass(), "properties", null);
        HashMap term22824 = new HashMap();
        term22823 = newInstance(Class.forName("com.google.javascript.jscomp.graph.StandardUnionFind"));
        setField(term22823, term22823.getClass(), "elmap", term22824);
        term22816 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.graph.UnionFind");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term21499;
        args[1] = null;
        Object retValue = callMethod(klass, "buildPropNames", argTypes, term21389, args);
        assertTrue(recursiveEquals(term21389, term22822));
        assertTrue(recursiveEquals(term21499, term22823));
        assertTrue(recursiveEquals(retValue, term22816));
    }

};


