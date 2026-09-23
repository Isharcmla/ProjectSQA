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

public class FunctionType_getMinArguments_929645872163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77298;
     Object term77315;

    public FunctionType_getMinArguments_929645872163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77298 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        term77315 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term77315, term77315.getClass(), "leastSupertypeVisitor", null);
        setField(term77315, term77315.getClass(), "greatestSubtypeVisitor", null);
        setField(term77315, term77315.getClass(), "call", null);
        setField(term77315, term77315.getClass(), "prototype", null);
        setField(term77315, term77315.getClass(), "kind", null);
        setField(term77315, term77315.getClass(), "typeOfThis", null);
        setField(term77315, term77315.getClass(), "source", null);
        setField(term77315, term77315.getClass(), "implementedInterfaces", null);
        setField(term77315, term77315.getClass(), "subTypes", null);
        setField(term77315, term77315.getClass(), "templateTypeName", null);
        setField(term77315, term77315.getClass(), "className", null);
        setField(term77315, term77315.getClass(), "properties", null);
        setField(term77315, term77315.getClass(), "implicitPrototype", null);
        setBooleanField(term77315, term77315.getClass(), "nativeType", false);
        setBooleanField(term77315, term77315.getClass(), "visited", false);
        setField(term77315, term77315.getClass(), "docInfo", null);
        setBooleanField(term77315, term77315.getClass(), "unknown", false);
        setBooleanField(term77315, term77315.getClass(), "resolved", false);
        setField(term77315, term77315.getClass(), "resolveResult", null);
        setField(term77315, term77315.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMinArguments", argTypes, term77298, args);
        assertTrue(recursiveEquals(term77298, term77315));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


