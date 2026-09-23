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

public class FunctionType_getMaxArguments_1586561922119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61204;
     Object term61213;

    public FunctionType_getMaxArguments_1586561922119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61204 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term61213 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term61213, term61213.getClass(), "call", null);
        setField(term61213, term61213.getClass(), "prototype", null);
        setField(term61213, term61213.getClass(), "kind", null);
        setField(term61213, term61213.getClass(), "typeOfThis", null);
        setField(term61213, term61213.getClass(), "source", null);
        setField(term61213, term61213.getClass(), "implementedInterfaces", null);
        setField(term61213, term61213.getClass(), "subTypes", null);
        setField(term61213, term61213.getClass(), "templateTypeName", null);
        setField(term61213, term61213.getClass(), "className", null);
        setField(term61213, term61213.getClass(), "properties", null);
        setField(term61213, term61213.getClass(), "implicitPrototype", null);
        setBooleanField(term61213, term61213.getClass(), "nativeType", false);
        setBooleanField(term61213, term61213.getClass(), "visited", false);
        setField(term61213, term61213.getClass(), "docInfo", null);
        setBooleanField(term61213, term61213.getClass(), "unknown", false);
        setBooleanField(term61213, term61213.getClass(), "resolved", false);
        setField(term61213, term61213.getClass(), "resolveResult", null);
        setField(term61213, term61213.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaxArguments", argTypes, term61204, args);
        assertTrue(recursiveEquals(term61204, term61213));
        assertTrue(recursiveEquals(retValue, 2147483647));
    }

};


