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

public class FunctionType_hasCachedValues_625426612201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100330;
     Object term100343;

    public FunctionType_hasCachedValues_625426612201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100330 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term100330, term100330.getClass(), "prototype", null);
        term100343 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term100343, term100343.getClass(), "call", null);
        setField(term100343, term100343.getClass(), "prototype", null);
        setField(term100343, term100343.getClass(), "kind", null);
        setField(term100343, term100343.getClass(), "typeOfThis", null);
        setField(term100343, term100343.getClass(), "source", null);
        setField(term100343, term100343.getClass(), "implementedInterfaces", null);
        setField(term100343, term100343.getClass(), "subTypes", null);
        setField(term100343, term100343.getClass(), "templateTypeName", null);
        setField(term100343, term100343.getClass(), "className", null);
        setField(term100343, term100343.getClass(), "properties", null);
        setBooleanField(term100343, term100343.getClass(), "nativeType", false);
        setField(term100343, term100343.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term100343, term100343.getClass(), "prettyPrint", false);
        setBooleanField(term100343, term100343.getClass(), "visited", false);
        setField(term100343, term100343.getClass(), "docInfo", null);
        setBooleanField(term100343, term100343.getClass(), "unknown", false);
        setBooleanField(term100343, term100343.getClass(), "resolved", false);
        setField(term100343, term100343.getClass(), "resolveResult", null);
        setField(term100343, term100343.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasCachedValues", argTypes, term100330, args);
        assertTrue(recursiveEquals(term100330, term100343));
        assertTrue(recursiveEquals(retValue, true));
    }

};


