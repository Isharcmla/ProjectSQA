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

public class ArrowType_hashCode_152993979031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4103;
     Object term5470;

    public ArrowType_hashCode_152993979031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4103 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term4173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4337 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term4103, term4103.getClass(), "returnType", null);
        setBooleanField(term4103, term4103.getClass(), "returnTypeInferred", false);
        setField(term4243, term4243.getClass(), "jsType", term4337);
        setField(term4173, term4173.getClass(), "first", term4243);
        setField(term4103, term4103.getClass(), "parameters", term4173);
        term5470 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term5471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5473 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setIntField(term5471, term5471.getClass(), "type", 0);
        setField(term5471, term5471.getClass(), "next", null);
        setIntField(term5472, term5472.getClass(), "type", 0);
        setField(term5472, term5472.getClass(), "next", null);
        setField(term5472, term5472.getClass(), "first", null);
        setField(term5472, term5472.getClass(), "last", null);
        setField(term5472, term5472.getClass(), "propListHead", null);
        setIntField(term5472, term5472.getClass(), "sourcePosition", 0);
        setField(term5473, term5473.getClass(), "parameters", null);
        setField(term5473, term5473.getClass(), "returnType", null);
        setBooleanField(term5473, term5473.getClass(), "returnTypeInferred", false);
        setBooleanField(term5473, term5473.getClass(), "resolved", false);
        setField(term5473, term5473.getClass(), "resolveResult", null);
        setField(term5473, term5473.getClass(), "registry", null);
        setField(term5472, term5472.getClass(), "jsType", term5473);
        setField(term5472, term5472.getClass(), "parent", null);
        setField(term5471, term5471.getClass(), "first", term5472);
        setField(term5471, term5471.getClass(), "last", null);
        setField(term5471, term5471.getClass(), "propListHead", null);
        setIntField(term5471, term5471.getClass(), "sourcePosition", 0);
        setField(term5471, term5471.getClass(), "jsType", null);
        setField(term5471, term5471.getClass(), "parent", null);
        setField(term5470, term5470.getClass(), "parameters", term5471);
        setField(term5470, term5470.getClass(), "returnType", null);
        setBooleanField(term5470, term5470.getClass(), "returnTypeInferred", false);
        setBooleanField(term5470, term5470.getClass(), "resolved", false);
        setField(term5470, term5470.getClass(), "resolveResult", null);
        setField(term5470, term5470.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term4103, args);
        assertTrue(recursiveEquals(term4103, term5470));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


