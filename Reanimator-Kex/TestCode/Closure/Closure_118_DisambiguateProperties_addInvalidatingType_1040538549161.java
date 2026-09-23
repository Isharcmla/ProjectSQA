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
import java.lang.Object;
import java.util.HashSet;

public class DisambiguateProperties_addInvalidatingType_1040538549161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60043;
     Object term60331;
     Object term60382;
     Object term60383;

    public DisambiguateProperties_addInvalidatingType_1040538549161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term60237 = new HashSet();
        term60043 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term60189 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem"));
        setField(term60189, term60189.getClass(), "invalidatingTypes", term60237);
        setField(term60043, term60043.getClass(), "typeSystem", term60189);
        term60331 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        term60382 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term60382, term60382.getClass(), "parameters", null);
        setField(term60382, term60382.getClass(), "returnType", null);
        setBooleanField(term60382, term60382.getClass(), "returnTypeInferred", false);
        setBooleanField(term60382, term60382.getClass(), "resolved", false);
        setField(term60382, term60382.getClass(), "resolveResult", null);
        setField(term60382, term60382.getClass(), "templateTypeMap", null);
        setBooleanField(term60382, term60382.getClass(), "inTemplatedCheckVisit", false);
        setField(term60382, term60382.getClass(), "registry", null);
        term60383 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term60383, term60383.getClass(), "parameters", null);
        setField(term60383, term60383.getClass(), "returnType", null);
        setBooleanField(term60383, term60383.getClass(), "returnTypeInferred", false);
        setBooleanField(term60383, term60383.getClass(), "resolved", false);
        setField(term60383, term60383.getClass(), "resolveResult", null);
        setField(term60383, term60383.getClass(), "templateTypeMap", null);
        setBooleanField(term60383, term60383.getClass(), "inTemplatedCheckVisit", false);
        setField(term60383, term60383.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[2];
        args[0] = term60331;
        args[1] = null;
        callMethod(klass, "addInvalidatingType", argTypes, term60043, args);
        assertTrue(recursiveEquals(term60043, term60382));
        assertTrue(recursiveEquals(term60331, term60383));
    }

};


