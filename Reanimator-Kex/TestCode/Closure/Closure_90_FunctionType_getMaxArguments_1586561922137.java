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

public class FunctionType_getMaxArguments_1586561922137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73425;
     Object term73801;

    public FunctionType_getMaxArguments_1586561922137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73425 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term73519 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term73519, term73519.getClass(), "parameters", null);
        setField(term73425, term73425.getClass(), "call", term73519);
        term73801 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term73802 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term73802, term73802.getClass(), "parameters", null);
        setField(term73802, term73802.getClass(), "returnType", null);
        setBooleanField(term73802, term73802.getClass(), "returnTypeInferred", false);
        setBooleanField(term73802, term73802.getClass(), "resolved", false);
        setField(term73802, term73802.getClass(), "resolveResult", null);
        setField(term73802, term73802.getClass(), "registry", null);
        setField(term73801, term73801.getClass(), "call", term73802);
        setField(term73801, term73801.getClass(), "prototype", null);
        setField(term73801, term73801.getClass(), "kind", null);
        setField(term73801, term73801.getClass(), "typeOfThis", null);
        setField(term73801, term73801.getClass(), "source", null);
        setField(term73801, term73801.getClass(), "implementedInterfaces", null);
        setField(term73801, term73801.getClass(), "subTypes", null);
        setField(term73801, term73801.getClass(), "templateTypeName", null);
        setField(term73801, term73801.getClass(), "className", null);
        setField(term73801, term73801.getClass(), "properties", null);
        setBooleanField(term73801, term73801.getClass(), "nativeType", false);
        setField(term73801, term73801.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term73801, term73801.getClass(), "prettyPrint", false);
        setBooleanField(term73801, term73801.getClass(), "visited", false);
        setField(term73801, term73801.getClass(), "docInfo", null);
        setBooleanField(term73801, term73801.getClass(), "unknown", false);
        setBooleanField(term73801, term73801.getClass(), "resolved", false);
        setField(term73801, term73801.getClass(), "resolveResult", null);
        setField(term73801, term73801.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaxArguments", argTypes, term73425, args);
        assertTrue(recursiveEquals(term73425, term73801));
        assertTrue(recursiveEquals(retValue, 2147483647));
    }

};


