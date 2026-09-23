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

public class FunctionType_getMaxArguments_1586561922149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71994;
     Object term72099;

    public FunctionType_getMaxArguments_1586561922149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71994 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term72088 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term72088, term72088.getClass(), "parameters", null);
        setField(term71994, term71994.getClass(), "call", term72088);
        term72099 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term72100 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term72100, term72100.getClass(), "parameters", null);
        setField(term72100, term72100.getClass(), "returnType", null);
        setBooleanField(term72100, term72100.getClass(), "resolved", false);
        setField(term72100, term72100.getClass(), "resolveResult", null);
        setField(term72100, term72100.getClass(), "registry", null);
        setField(term72099, term72099.getClass(), "call", term72100);
        setField(term72099, term72099.getClass(), "prototype", null);
        setField(term72099, term72099.getClass(), "kind", null);
        setField(term72099, term72099.getClass(), "typeOfThis", null);
        setField(term72099, term72099.getClass(), "source", null);
        setField(term72099, term72099.getClass(), "implementedInterfaces", null);
        setField(term72099, term72099.getClass(), "subTypes", null);
        setField(term72099, term72099.getClass(), "templateTypeName", null);
        setField(term72099, term72099.getClass(), "className", null);
        setField(term72099, term72099.getClass(), "properties", null);
        setField(term72099, term72099.getClass(), "implicitPrototype", null);
        setBooleanField(term72099, term72099.getClass(), "nativeType", false);
        setBooleanField(term72099, term72099.getClass(), "visited", false);
        setField(term72099, term72099.getClass(), "docInfo", null);
        setBooleanField(term72099, term72099.getClass(), "unknown", false);
        setBooleanField(term72099, term72099.getClass(), "resolved", false);
        setField(term72099, term72099.getClass(), "resolveResult", null);
        setField(term72099, term72099.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaxArguments", argTypes, term71994, args);
        assertTrue(recursiveEquals(term71994, term72099));
        assertTrue(recursiveEquals(retValue, 2147483647));
    }

};


