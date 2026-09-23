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

public class JSType_getGreatestSubtype_1951394506203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27898;
     Object term27909;
     Object term27910;
     Object term27902;

    public JSType_getGreatestSubtype_1951394506203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27898 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        term27909 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term27909, term27909.getClass(), "elementsType", null);
        setField(term27909, term27909.getClass(), "elements", null);
        setField(term27909, term27909.getClass(), "className", null);
        setField(term27909, term27909.getClass(), "properties", null);
        setBooleanField(term27909, term27909.getClass(), "nativeType", false);
        setField(term27909, term27909.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term27909, term27909.getClass(), "prettyPrint", false);
        setBooleanField(term27909, term27909.getClass(), "visited", false);
        setField(term27909, term27909.getClass(), "docInfo", null);
        setBooleanField(term27909, term27909.getClass(), "unknown", false);
        setBooleanField(term27909, term27909.getClass(), "resolved", false);
        setField(term27909, term27909.getClass(), "resolveResult", null);
        setField(term27909, term27909.getClass(), "registry", null);
        term27910 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term27910, term27910.getClass(), "elementsType", null);
        setField(term27910, term27910.getClass(), "elements", null);
        setField(term27910, term27910.getClass(), "className", null);
        setField(term27910, term27910.getClass(), "properties", null);
        setBooleanField(term27910, term27910.getClass(), "nativeType", false);
        setField(term27910, term27910.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term27910, term27910.getClass(), "prettyPrint", false);
        setBooleanField(term27910, term27910.getClass(), "visited", false);
        setField(term27910, term27910.getClass(), "docInfo", null);
        setBooleanField(term27910, term27910.getClass(), "unknown", false);
        setBooleanField(term27910, term27910.getClass(), "resolved", false);
        setField(term27910, term27910.getClass(), "resolveResult", null);
        setField(term27910, term27910.getClass(), "registry", null);
        term27902 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term27902, term27902.getClass(), "elementsType", null);
        setField(term27902, term27902.getClass(), "elements", null);
        setField(term27902, term27902.getClass(), "className", null);
        setField(term27902, term27902.getClass(), "properties", null);
        setBooleanField(term27902, term27902.getClass(), "nativeType", false);
        setField(term27902, term27902.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term27902, term27902.getClass(), "prettyPrint", false);
        setBooleanField(term27902, term27902.getClass(), "visited", false);
        setField(term27902, term27902.getClass(), "docInfo", null);
        setBooleanField(term27902, term27902.getClass(), "unknown", false);
        setBooleanField(term27902, term27902.getClass(), "resolved", false);
        setField(term27902, term27902.getClass(), "resolveResult", null);
        setField(term27902, term27902.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term27898;
        args[1] = term27898;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term27898, term27909));
        assertTrue(recursiveEquals(term27898, term27910));
        assertTrue(recursiveEquals(retValue, term27902));
    }

};


