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

public class FunctionType_getMinArguments_929645872217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110117;
     Object term230900;

    public FunctionType_getMinArguments_929645872217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110117 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term110211 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term110211, term110211.getClass(), "parameters", null);
        setField(term110117, term110117.getClass(), "call", term110211);
        term230900 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term230901 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term230901, term230901.getClass(), "parameters", null);
        setField(term230901, term230901.getClass(), "returnType", null);
        setBooleanField(term230901, term230901.getClass(), "returnTypeInferred", false);
        setBooleanField(term230901, term230901.getClass(), "resolved", false);
        setField(term230901, term230901.getClass(), "resolveResult", null);
        setBooleanField(term230901, term230901.getClass(), "inTemplatedCheckVisit", false);
        setField(term230901, term230901.getClass(), "registry", null);
        setField(term230900, term230900.getClass(), "call", term230901);
        setField(term230900, term230900.getClass(), "prototypeSlot", null);
        setField(term230900, term230900.getClass(), "kind", null);
        setField(term230900, term230900.getClass(), "propAccess", null);
        setField(term230900, term230900.getClass(), "typeOfThis", null);
        setField(term230900, term230900.getClass(), "source", null);
        setField(term230900, term230900.getClass(), "implementedInterfaces", null);
        setField(term230900, term230900.getClass(), "extendedInterfaces", null);
        setField(term230900, term230900.getClass(), "subTypes", null);
        setField(term230900, term230900.getClass(), "templateTypeNames", null);
        setField(term230900, term230900.getClass(), "className", null);
        setField(term230900, term230900.getClass(), "properties", null);
        setBooleanField(term230900, term230900.getClass(), "nativeType", false);
        setField(term230900, term230900.getClass(), "implicitPrototypeFallback", null);
        setField(term230900, term230900.getClass(), "ownerFunction", null);
        setBooleanField(term230900, term230900.getClass(), "prettyPrint", false);
        setBooleanField(term230900, term230900.getClass(), "visited", false);
        setField(term230900, term230900.getClass(), "docInfo", null);
        setBooleanField(term230900, term230900.getClass(), "unknown", false);
        setBooleanField(term230900, term230900.getClass(), "resolved", false);
        setField(term230900, term230900.getClass(), "resolveResult", null);
        setBooleanField(term230900, term230900.getClass(), "inTemplatedCheckVisit", false);
        setField(term230900, term230900.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMinArguments", argTypes, term110117, args);
        assertTrue(recursiveEquals(term110117, term230900));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


