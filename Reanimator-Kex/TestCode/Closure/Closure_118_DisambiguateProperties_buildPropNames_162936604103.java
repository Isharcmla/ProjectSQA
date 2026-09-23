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

public class DisambiguateProperties_buildPropNames_162936604103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28798;
     Object term28908;
     Object term35191;
     Object term35192;
     Object term35185;

    public DisambiguateProperties_buildPropNames_162936604103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28798 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        HashMap term28956 = new HashMap();
        term28908 = newInstance(Class.forName("com.google.javascript.jscomp.graph.StandardUnionFind"));
        setField(term28908, term28908.getClass(), "elmap", term28956);
        term35191 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term35191, term35191.getClass(), "compiler", null);
        setField(term35191, term35191.getClass(), "typeSystem", null);
        setField(term35191, term35191.getClass(), "invalidationMap", null);
        setField(term35191, term35191.getClass(), "propertiesToErrorFor", null);
        setField(term35191, term35191.getClass(), "properties", null);
        HashMap term35193 = new HashMap();
        term35192 = newInstance(Class.forName("com.google.javascript.jscomp.graph.StandardUnionFind"));
        setField(term35192, term35192.getClass(), "elmap", term35193);
        term35185 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.graph.UnionFind");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term28908;
        args[1] = null;
        Object retValue = callMethod(klass, "buildPropNames", argTypes, term28798, args);
        assertTrue(recursiveEquals(term28798, term35191));
        assertTrue(recursiveEquals(term28908, term35192));
        assertTrue(recursiveEquals(retValue, term35185));
    }

};


