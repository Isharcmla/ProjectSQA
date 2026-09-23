package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class TypeValidator_getReadableJSTypeName_850599436328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119215;
     Object term119285;
     Object term119464;
     Object term119465;

    public TypeValidator_getReadableJSTypeName_850599436328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119215 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term119285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119395 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setIntField(term119285, term119285.getClass(), "type", 42);
        setField(term119285, term119285.getClass(), "jsType", term119395);
        term119464 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term119464, term119464.getClass(), "compiler", null);
        setField(term119464, term119464.getClass(), "typeRegistry", null);
        setField(term119464, term119464.getClass(), "allValueTypes", null);
        setBooleanField(term119464, term119464.getClass(), "shouldReport", false);
        setField(term119464, term119464.getClass(), "nullOrUndefined", null);
        setField(term119464, term119464.getClass(), "mismatches", null);
        term119465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119466 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setIntField(term119465, term119465.getClass(), "type", 42);
        setField(term119465, term119465.getClass(), "next", null);
        setField(term119465, term119465.getClass(), "first", null);
        setField(term119465, term119465.getClass(), "last", null);
        setField(term119465, term119465.getClass(), "propListHead", null);
        setIntField(term119465, term119465.getClass(), "sourcePosition", 0);
        setField(term119466, term119466.getClass(), "call", null);
        setField(term119466, term119466.getClass(), "prototype", null);
        setField(term119466, term119466.getClass(), "kind", null);
        setField(term119466, term119466.getClass(), "typeOfThis", null);
        setField(term119466, term119466.getClass(), "source", null);
        setField(term119466, term119466.getClass(), "implementedInterfaces", null);
        setField(term119466, term119466.getClass(), "subTypes", null);
        setField(term119466, term119466.getClass(), "templateTypeName", null);
        setField(term119466, term119466.getClass(), "className", null);
        setField(term119466, term119466.getClass(), "properties", null);
        setBooleanField(term119466, term119466.getClass(), "nativeType", false);
        setField(term119466, term119466.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term119466, term119466.getClass(), "prettyPrint", false);
        setBooleanField(term119466, term119466.getClass(), "visited", false);
        setField(term119466, term119466.getClass(), "docInfo", null);
        setBooleanField(term119466, term119466.getClass(), "unknown", false);
        setBooleanField(term119466, term119466.getClass(), "resolved", false);
        setField(term119466, term119466.getClass(), "resolveResult", null);
        setField(term119466, term119466.getClass(), "registry", null);
        setField(term119465, term119465.getClass(), "jsType", term119466);
        setField(term119465, term119465.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term119285;
        args[1] = false;
        Object retValue = callMethod(klass, "getReadableJSTypeName", argTypes, term119215, args);
        assertTrue(recursiveEquals(term119215, term119464));
        assertTrue(recursiveEquals(term119285, term119465));
        assertTrue(recursiveEquals(retValue, "this"));
    }

};


