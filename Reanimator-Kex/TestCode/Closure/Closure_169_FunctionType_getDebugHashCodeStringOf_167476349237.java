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

public class FunctionType_getDebugHashCodeStringOf_167476349237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240260;
     Object term240273;
     Object term240274;

    public FunctionType_getDebugHashCodeStringOf_167476349237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240260 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term240273 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term240273, term240273.getClass(), "call", null);
        setField(term240273, term240273.getClass(), "prototypeSlot", null);
        setField(term240273, term240273.getClass(), "kind", null);
        setField(term240273, term240273.getClass(), "propAccess", null);
        setField(term240273, term240273.getClass(), "typeOfThis", null);
        setField(term240273, term240273.getClass(), "source", null);
        setField(term240273, term240273.getClass(), "implementedInterfaces", null);
        setField(term240273, term240273.getClass(), "extendedInterfaces", null);
        setField(term240273, term240273.getClass(), "subTypes", null);
        setField(term240273, term240273.getClass(), "templateTypeNames", null);
        setField(term240273, term240273.getClass(), "className", null);
        setField(term240273, term240273.getClass(), "properties", null);
        setBooleanField(term240273, term240273.getClass(), "nativeType", false);
        setField(term240273, term240273.getClass(), "implicitPrototypeFallback", null);
        setField(term240273, term240273.getClass(), "ownerFunction", null);
        setBooleanField(term240273, term240273.getClass(), "prettyPrint", false);
        setBooleanField(term240273, term240273.getClass(), "visited", false);
        setField(term240273, term240273.getClass(), "docInfo", null);
        setBooleanField(term240273, term240273.getClass(), "unknown", false);
        setBooleanField(term240273, term240273.getClass(), "resolved", false);
        setField(term240273, term240273.getClass(), "resolveResult", null);
        setBooleanField(term240273, term240273.getClass(), "inTemplatedCheckVisit", false);
        setField(term240273, term240273.getClass(), "registry", null);
        term240274 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term240274, term240274.getClass(), "call", null);
        setField(term240274, term240274.getClass(), "prototypeSlot", null);
        setField(term240274, term240274.getClass(), "kind", null);
        setField(term240274, term240274.getClass(), "propAccess", null);
        setField(term240274, term240274.getClass(), "typeOfThis", null);
        setField(term240274, term240274.getClass(), "source", null);
        setField(term240274, term240274.getClass(), "implementedInterfaces", null);
        setField(term240274, term240274.getClass(), "extendedInterfaces", null);
        setField(term240274, term240274.getClass(), "subTypes", null);
        setField(term240274, term240274.getClass(), "templateTypeNames", null);
        setField(term240274, term240274.getClass(), "className", null);
        setField(term240274, term240274.getClass(), "properties", null);
        setBooleanField(term240274, term240274.getClass(), "nativeType", false);
        setField(term240274, term240274.getClass(), "implicitPrototypeFallback", null);
        setField(term240274, term240274.getClass(), "ownerFunction", null);
        setBooleanField(term240274, term240274.getClass(), "prettyPrint", false);
        setBooleanField(term240274, term240274.getClass(), "visited", false);
        setField(term240274, term240274.getClass(), "docInfo", null);
        setBooleanField(term240274, term240274.getClass(), "unknown", false);
        setBooleanField(term240274, term240274.getClass(), "resolved", false);
        setField(term240274, term240274.getClass(), "resolveResult", null);
        setBooleanField(term240274, term240274.getClass(), "inTemplatedCheckVisit", false);
        setField(term240274, term240274.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term240260;
        Object retValue = callMethod(klass, "getDebugHashCodeStringOf", argTypes, term240260, args);
        assertTrue(recursiveEquals(term240260, term240273));
        assertTrue(recursiveEquals(term240260, term240274));
        assertTrue(recursiveEquals(retValue, "me"));
    }

};


