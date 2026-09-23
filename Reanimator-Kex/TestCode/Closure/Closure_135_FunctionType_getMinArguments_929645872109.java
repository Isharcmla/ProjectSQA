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

public class FunctionType_getMinArguments_929645872109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60465;
     Object term60476;

    public FunctionType_getMinArguments_929645872109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60465 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term60465, term60465.getClass(), "call", null);
        term60476 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term60476, term60476.getClass(), "call", null);
        setField(term60476, term60476.getClass(), "prototype", null);
        setField(term60476, term60476.getClass(), "kind", null);
        setField(term60476, term60476.getClass(), "typeOfThis", null);
        setField(term60476, term60476.getClass(), "source", null);
        setField(term60476, term60476.getClass(), "implementedInterfaces", null);
        setField(term60476, term60476.getClass(), "subTypes", null);
        setField(term60476, term60476.getClass(), "templateTypeName", null);
        setField(term60476, term60476.getClass(), "className", null);
        setField(term60476, term60476.getClass(), "properties", null);
        setField(term60476, term60476.getClass(), "implicitPrototype", null);
        setBooleanField(term60476, term60476.getClass(), "nativeType", false);
        setBooleanField(term60476, term60476.getClass(), "visited", false);
        setField(term60476, term60476.getClass(), "docInfo", null);
        setBooleanField(term60476, term60476.getClass(), "unknown", false);
        setBooleanField(term60476, term60476.getClass(), "resolved", false);
        setField(term60476, term60476.getClass(), "resolveResult", null);
        setField(term60476, term60476.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMinArguments", argTypes, term60465, args);
        assertTrue(recursiveEquals(term60465, term60476));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


