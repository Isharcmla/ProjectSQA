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
import java.lang.Object;

public class JSType_isEquivalent_1737835225281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51096;
     Object term51051;
     Object term51115;
     Object term51116;

    public JSType_isEquivalent_1737835225281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51096 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term51051 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term51051, term51051.getClass(), "referencedType", term51096);
        term51115 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term51115, term51115.getClass(), "resolved", false);
        setField(term51115, term51115.getClass(), "resolveResult", null);
        setField(term51115, term51115.getClass(), "registry", null);
        term51116 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term51117 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setField(term51116, term51116.getClass(), "indexType", null);
        setBooleanField(term51117, term51117.getClass(), "resolved", false);
        setField(term51117, term51117.getClass(), "resolveResult", null);
        setField(term51117, term51117.getClass(), "registry", null);
        setField(term51116, term51116.getClass(), "referencedType", term51117);
        setField(term51116, term51116.getClass(), "referencedObjType", null);
        setBooleanField(term51116, term51116.getClass(), "visited", false);
        setField(term51116, term51116.getClass(), "docInfo", null);
        setBooleanField(term51116, term51116.getClass(), "unknown", false);
        setBooleanField(term51116, term51116.getClass(), "resolved", false);
        setField(term51116, term51116.getClass(), "resolveResult", null);
        setField(term51116, term51116.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term51096;
        args[1] = term51051;
        Object retValue = callMethod(klass, "isEquivalent", argTypes, null, args);
        assertTrue(recursiveEquals(term51096, term51115));
        assertTrue(recursiveEquals(term51051, term51116));
        assertTrue(recursiveEquals(retValue, true));
    }

};


