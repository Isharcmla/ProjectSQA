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

public class FunctionType_getMaxArguments_1586561922121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61326;
     Object term61335;

    public FunctionType_getMaxArguments_1586561922121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61326 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term61326, term61326.getClass(), "call", null);
        term61335 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term61335, term61335.getClass(), "call", null);
        setField(term61335, term61335.getClass(), "prototype", null);
        setField(term61335, term61335.getClass(), "kind", null);
        setField(term61335, term61335.getClass(), "typeOfThis", null);
        setField(term61335, term61335.getClass(), "source", null);
        setField(term61335, term61335.getClass(), "implementedInterfaces", null);
        setField(term61335, term61335.getClass(), "subTypes", null);
        setField(term61335, term61335.getClass(), "templateTypeName", null);
        setField(term61335, term61335.getClass(), "className", null);
        setField(term61335, term61335.getClass(), "properties", null);
        setField(term61335, term61335.getClass(), "implicitPrototype", null);
        setBooleanField(term61335, term61335.getClass(), "nativeType", false);
        setBooleanField(term61335, term61335.getClass(), "visited", false);
        setField(term61335, term61335.getClass(), "docInfo", null);
        setBooleanField(term61335, term61335.getClass(), "unknown", false);
        setBooleanField(term61335, term61335.getClass(), "resolved", false);
        setField(term61335, term61335.getClass(), "resolveResult", null);
        setField(term61335, term61335.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaxArguments", argTypes, term61326, args);
        assertTrue(recursiveEquals(term61326, term61335));
        assertTrue(recursiveEquals(retValue, 2147483647));
    }

};


