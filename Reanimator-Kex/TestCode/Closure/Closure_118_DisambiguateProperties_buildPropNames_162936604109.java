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

public class DisambiguateProperties_buildPropNames_162936604109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36745;
     Object term36855;
     Object term37050;
     Object term37051;
     Object term37044;

    public DisambiguateProperties_buildPropNames_162936604109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36745 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        HashMap term36903 = new HashMap();
        term36855 = newInstance(Class.forName("com.google.javascript.jscomp.graph.StandardUnionFind"));
        setField(term36855, term36855.getClass(), "elmap", term36903);
        term37050 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term37050, term37050.getClass(), "compiler", null);
        setField(term37050, term37050.getClass(), "typeSystem", null);
        setField(term37050, term37050.getClass(), "invalidationMap", null);
        setField(term37050, term37050.getClass(), "propertiesToErrorFor", null);
        setField(term37050, term37050.getClass(), "properties", null);
        HashMap term37052 = new HashMap();
        term37051 = newInstance(Class.forName("com.google.javascript.jscomp.graph.StandardUnionFind"));
        setField(term37051, term37051.getClass(), "elmap", term37052);
        term37044 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.graph.UnionFind");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term36855;
        args[1] = null;
        Object retValue = callMethod(klass, "buildPropNames", argTypes, term36745, args);
        assertTrue(recursiveEquals(term36745, term37050));
        assertTrue(recursiveEquals(term36855, term37051));
        assertTrue(recursiveEquals(retValue, term37044));
    }

};


