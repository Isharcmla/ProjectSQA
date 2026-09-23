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

public class TypeValidator_getReadableJSTypeName_850599436262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75068;
     Object term75138;
     Object term75499;
     Object term75500;

    public TypeValidator_getReadableJSTypeName_850599436262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75068 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term75138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75242 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term75346 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term75138, term75138.getClass(), "type", 0);
        setField(term75242, term75242.getClass(), "ownerFunction", term75346);
        setField(term75138, term75138.getClass(), "jsType", term75242);
        term75499 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term75499, term75499.getClass(), "compiler", null);
        setField(term75499, term75499.getClass(), "typeRegistry", null);
        setField(term75499, term75499.getClass(), "allValueTypes", null);
        setBooleanField(term75499, term75499.getClass(), "shouldReport", false);
        setField(term75499, term75499.getClass(), "nullOrUndefined", null);
        setField(term75499, term75499.getClass(), "mismatches", null);
        term75500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75501 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term75502 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term75500, term75500.getClass(), "type", 0);
        setField(term75500, term75500.getClass(), "next", null);
        setField(term75500, term75500.getClass(), "first", null);
        setField(term75500, term75500.getClass(), "last", null);
        setField(term75500, term75500.getClass(), "propListHead", null);
        setIntField(term75500, term75500.getClass(), "sourcePosition", 0);
        setField(term75501, term75501.getClass(), "call", null);
        setField(term75501, term75501.getClass(), "prototypeSlot", null);
        setField(term75501, term75501.getClass(), "kind", null);
        setField(term75501, term75501.getClass(), "propAccess", null);
        setField(term75501, term75501.getClass(), "typeOfThis", null);
        setField(term75501, term75501.getClass(), "source", null);
        setField(term75501, term75501.getClass(), "implementedInterfaces", null);
        setField(term75501, term75501.getClass(), "extendedInterfaces", null);
        setField(term75501, term75501.getClass(), "subTypes", null);
        setField(term75501, term75501.getClass(), "className", null);
        setField(term75501, term75501.getClass(), "properties", null);
        setBooleanField(term75501, term75501.getClass(), "nativeType", false);
        setField(term75501, term75501.getClass(), "implicitPrototypeFallback", null);
        setField(term75502, term75502.getClass(), "call", null);
        setField(term75502, term75502.getClass(), "prototypeSlot", null);
        setField(term75502, term75502.getClass(), "kind", null);
        setField(term75502, term75502.getClass(), "propAccess", null);
        setField(term75502, term75502.getClass(), "typeOfThis", null);
        setField(term75502, term75502.getClass(), "source", null);
        setField(term75502, term75502.getClass(), "implementedInterfaces", null);
        setField(term75502, term75502.getClass(), "extendedInterfaces", null);
        setField(term75502, term75502.getClass(), "subTypes", null);
        setField(term75502, term75502.getClass(), "className", null);
        setField(term75502, term75502.getClass(), "properties", null);
        setBooleanField(term75502, term75502.getClass(), "nativeType", false);
        setField(term75502, term75502.getClass(), "implicitPrototypeFallback", null);
        setField(term75502, term75502.getClass(), "ownerFunction", null);
        setBooleanField(term75502, term75502.getClass(), "prettyPrint", false);
        setBooleanField(term75502, term75502.getClass(), "visited", false);
        setField(term75502, term75502.getClass(), "docInfo", null);
        setBooleanField(term75502, term75502.getClass(), "unknown", false);
        setBooleanField(term75502, term75502.getClass(), "resolved", false);
        setField(term75502, term75502.getClass(), "resolveResult", null);
        setField(term75502, term75502.getClass(), "templateKeys", null);
        setField(term75502, term75502.getClass(), "templatizedTypes", null);
        setBooleanField(term75502, term75502.getClass(), "inTemplatedCheckVisit", false);
        setField(term75502, term75502.getClass(), "registry", null);
        setField(term75501, term75501.getClass(), "ownerFunction", term75502);
        setBooleanField(term75501, term75501.getClass(), "prettyPrint", false);
        setBooleanField(term75501, term75501.getClass(), "visited", false);
        setField(term75501, term75501.getClass(), "docInfo", null);
        setBooleanField(term75501, term75501.getClass(), "unknown", false);
        setBooleanField(term75501, term75501.getClass(), "resolved", false);
        setField(term75501, term75501.getClass(), "resolveResult", null);
        setField(term75501, term75501.getClass(), "templateKeys", null);
        setField(term75501, term75501.getClass(), "templatizedTypes", null);
        setBooleanField(term75501, term75501.getClass(), "inTemplatedCheckVisit", false);
        setField(term75501, term75501.getClass(), "registry", null);
        setField(term75500, term75500.getClass(), "jsType", term75501);
        setField(term75500, term75500.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term75138;
        args[1] = false;
        Object retValue = callMethod(klass, "getReadableJSTypeName", argTypes, term75068, args);
        assertTrue(recursiveEquals(term75068, term75499));
        assertTrue(recursiveEquals(term75138, term75500));
        assertTrue(recursiveEquals(retValue, "NoResolvedType"));
    }

};


