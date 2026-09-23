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
import java.util.LinkedHashMap;
import java.util.HashMap;

public class DisambiguateProperties_init_90568078013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154;
     Object term2348;
     Object term2351;

    public DisambiguateProperties_init_90568078013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154 = new LinkedHashMap();
        LinkedHashMap term2349 = new LinkedHashMap();
        HashMap term2350 = new HashMap();
        term2348 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term2348, term2348.getClass(), "compiler", null);
        setField(term2348, term2348.getClass(), "typeSystem", null);
        setField(term2348, term2348.getClass(), "invalidationMap", null);
        setField(term2348, term2348.getClass(), "propertiesToErrorFor", term2349);
        setField(term2348, term2348.getClass(), "properties", term2350);
        term2351 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.DisambiguateProperties$TypeSystem");
        argTypes[2] = Class.forName("java.util.Map");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term154;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2348));
        assertTrue(recursiveEquals(term154, term2351));
    }

};


