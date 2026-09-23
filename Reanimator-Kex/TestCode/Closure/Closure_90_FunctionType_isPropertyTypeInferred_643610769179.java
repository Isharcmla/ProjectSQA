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

public class FunctionType_isPropertyTypeInferred_643610769179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95137;
     Object term95528;

    public FunctionType_isPropertyTypeInferred_643610769179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95137 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term95528 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term95528, term95528.getClass(), "call", null);
        setField(term95528, term95528.getClass(), "prototype", null);
        setField(term95528, term95528.getClass(), "kind", null);
        setField(term95528, term95528.getClass(), "typeOfThis", null);
        setField(term95528, term95528.getClass(), "source", null);
        setField(term95528, term95528.getClass(), "implementedInterfaces", null);
        setField(term95528, term95528.getClass(), "subTypes", null);
        setField(term95528, term95528.getClass(), "templateTypeName", null);
        setField(term95528, term95528.getClass(), "className", null);
        setField(term95528, term95528.getClass(), "properties", null);
        setBooleanField(term95528, term95528.getClass(), "nativeType", false);
        setField(term95528, term95528.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term95528, term95528.getClass(), "prettyPrint", false);
        setBooleanField(term95528, term95528.getClass(), "visited", false);
        setField(term95528, term95528.getClass(), "docInfo", null);
        setBooleanField(term95528, term95528.getClass(), "unknown", false);
        setBooleanField(term95528, term95528.getClass(), "resolved", false);
        setField(term95528, term95528.getClass(), "resolveResult", null);
        setField(term95528, term95528.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "prototype";
        Object retValue = callMethod(klass, "isPropertyTypeInferred", argTypes, term95137, args);
        assertTrue(recursiveEquals(term95137, term95528));
        assertTrue(recursiveEquals(retValue, true));
    }

};


