package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;

public class JSType_getGreatestSubtype_1951394506341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60350;
     Object term60361;
     Object term60362;
     Object term60351;

    public JSType_getGreatestSubtype_1951394506341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60350 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        term60361 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setBooleanField(term60361, term60361.getClass(), "resolved", false);
        setField(term60361, term60361.getClass(), "resolveResult", null);
        setBooleanField(term60361, term60361.getClass(), "inTemplatedCheckVisit", false);
        setField(term60361, term60361.getClass(), "registry", null);
        term60362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setBooleanField(term60362, term60362.getClass(), "resolved", false);
        setField(term60362, term60362.getClass(), "resolveResult", null);
        setBooleanField(term60362, term60362.getClass(), "inTemplatedCheckVisit", false);
        setField(term60362, term60362.getClass(), "registry", null);
        term60351 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setBooleanField(term60351, term60351.getClass(), "resolved", false);
        setField(term60351, term60351.getClass(), "resolveResult", null);
        setBooleanField(term60351, term60351.getClass(), "inTemplatedCheckVisit", false);
        setField(term60351, term60351.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term60350;
        args[1] = term60350;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term60350, term60361));
        assertTrue(recursiveEquals(term60350, term60362));
        assertTrue(recursiveEquals(retValue, term60351));
    }

};


