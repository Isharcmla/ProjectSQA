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

public class FunctionType_getParameters_1663846364124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63364;
     Object term64086;
     Object term64085;

    public FunctionType_getParameters_1663846364124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63364 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term63458 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term63458, term63458.getClass(), "parameters", null);
        setField(term63364, term63364.getClass(), "call", term63458);
        term64086 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term64087 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term64087, term64087.getClass(), "parameters", null);
        setField(term64087, term64087.getClass(), "returnType", null);
        setBooleanField(term64087, term64087.getClass(), "returnTypeInferred", false);
        setBooleanField(term64087, term64087.getClass(), "resolved", false);
        setField(term64087, term64087.getClass(), "resolveResult", null);
        setField(term64087, term64087.getClass(), "registry", null);
        setField(term64086, term64086.getClass(), "call", term64087);
        setField(term64086, term64086.getClass(), "prototype", null);
        setField(term64086, term64086.getClass(), "prototypeSlot", null);
        setField(term64086, term64086.getClass(), "kind", null);
        setField(term64086, term64086.getClass(), "typeOfThis", null);
        setField(term64086, term64086.getClass(), "source", null);
        setField(term64086, term64086.getClass(), "implementedInterfaces", null);
        setField(term64086, term64086.getClass(), "extendedInterfaces", null);
        setField(term64086, term64086.getClass(), "subTypes", null);
        setField(term64086, term64086.getClass(), "templateTypeName", null);
        setField(term64086, term64086.getClass(), "className", null);
        setField(term64086, term64086.getClass(), "properties", null);
        setBooleanField(term64086, term64086.getClass(), "nativeType", false);
        setField(term64086, term64086.getClass(), "implicitPrototypeFallback", null);
        setField(term64086, term64086.getClass(), "ownerFunction", null);
        setBooleanField(term64086, term64086.getClass(), "prettyPrint", false);
        setBooleanField(term64086, term64086.getClass(), "visited", false);
        setField(term64086, term64086.getClass(), "docInfo", null);
        setBooleanField(term64086, term64086.getClass(), "unknown", false);
        setBooleanField(term64086, term64086.getClass(), "resolved", false);
        setField(term64086, term64086.getClass(), "resolveResult", null);
        setField(term64086, term64086.getClass(), "registry", null);
        term64085 = newInstance(Class.forName("java.util.Collections$EmptySet"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getParameters", argTypes, term63364, args);
        assertTrue(recursiveEquals(term63364, term64086));
        assertTrue(recursiveEquals(retValue, term64085));
    }

};


