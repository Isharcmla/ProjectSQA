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

public class TypeValidator_getReadableJSTypeName_850599436280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80850;
     Object term80920;
     Object term81326;
     Object term81327;

    public TypeValidator_getReadableJSTypeName_850599436280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80850 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term80920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81024 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term81128 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term80920, term80920.getClass(), "type", 0);
        setField(term81024, term81024.getClass(), "ownerFunction", term81128);
        setField(term80920, term80920.getClass(), "jsType", term81024);
        term81326 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term81326, term81326.getClass(), "compiler", null);
        setField(term81326, term81326.getClass(), "typeRegistry", null);
        setField(term81326, term81326.getClass(), "allValueTypes", null);
        setBooleanField(term81326, term81326.getClass(), "shouldReport", false);
        setField(term81326, term81326.getClass(), "nullOrUndefined", null);
        setField(term81326, term81326.getClass(), "mismatches", null);
        term81327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term81329 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term81327, term81327.getClass(), "type", 0);
        setField(term81327, term81327.getClass(), "next", null);
        setField(term81327, term81327.getClass(), "first", null);
        setField(term81327, term81327.getClass(), "last", null);
        setField(term81327, term81327.getClass(), "propListHead", null);
        setIntField(term81327, term81327.getClass(), "sourcePosition", 0);
        setField(term81328, term81328.getClass(), "call", null);
        setField(term81328, term81328.getClass(), "prototypeSlot", null);
        setField(term81328, term81328.getClass(), "kind", null);
        setField(term81328, term81328.getClass(), "propAccess", null);
        setField(term81328, term81328.getClass(), "typeOfThis", null);
        setField(term81328, term81328.getClass(), "source", null);
        setField(term81328, term81328.getClass(), "implementedInterfaces", null);
        setField(term81328, term81328.getClass(), "extendedInterfaces", null);
        setField(term81328, term81328.getClass(), "subTypes", null);
        setField(term81328, term81328.getClass(), "className", null);
        setField(term81328, term81328.getClass(), "properties", null);
        setBooleanField(term81328, term81328.getClass(), "nativeType", false);
        setField(term81328, term81328.getClass(), "implicitPrototypeFallback", null);
        setField(term81329, term81329.getClass(), "call", null);
        setField(term81329, term81329.getClass(), "prototypeSlot", null);
        setField(term81329, term81329.getClass(), "kind", null);
        setField(term81329, term81329.getClass(), "propAccess", null);
        setField(term81329, term81329.getClass(), "typeOfThis", null);
        setField(term81329, term81329.getClass(), "source", null);
        setField(term81329, term81329.getClass(), "implementedInterfaces", null);
        setField(term81329, term81329.getClass(), "extendedInterfaces", null);
        setField(term81329, term81329.getClass(), "subTypes", null);
        setField(term81329, term81329.getClass(), "className", null);
        setField(term81329, term81329.getClass(), "properties", null);
        setBooleanField(term81329, term81329.getClass(), "nativeType", false);
        setField(term81329, term81329.getClass(), "implicitPrototypeFallback", null);
        setField(term81329, term81329.getClass(), "ownerFunction", null);
        setBooleanField(term81329, term81329.getClass(), "prettyPrint", false);
        setBooleanField(term81329, term81329.getClass(), "visited", false);
        setField(term81329, term81329.getClass(), "docInfo", null);
        setBooleanField(term81329, term81329.getClass(), "unknown", false);
        setBooleanField(term81329, term81329.getClass(), "resolved", false);
        setField(term81329, term81329.getClass(), "resolveResult", null);
        setField(term81329, term81329.getClass(), "templateKeys", null);
        setField(term81329, term81329.getClass(), "templatizedTypes", null);
        setBooleanField(term81329, term81329.getClass(), "inTemplatedCheckVisit", false);
        setField(term81329, term81329.getClass(), "registry", null);
        setField(term81328, term81328.getClass(), "ownerFunction", term81329);
        setBooleanField(term81328, term81328.getClass(), "prettyPrint", false);
        setBooleanField(term81328, term81328.getClass(), "visited", false);
        setField(term81328, term81328.getClass(), "docInfo", null);
        setBooleanField(term81328, term81328.getClass(), "unknown", false);
        setBooleanField(term81328, term81328.getClass(), "resolved", false);
        setField(term81328, term81328.getClass(), "resolveResult", null);
        setField(term81328, term81328.getClass(), "templateKeys", null);
        setField(term81328, term81328.getClass(), "templatizedTypes", null);
        setBooleanField(term81328, term81328.getClass(), "inTemplatedCheckVisit", false);
        setField(term81328, term81328.getClass(), "registry", null);
        setField(term81327, term81327.getClass(), "jsType", term81328);
        setField(term81327, term81327.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term80920;
        args[1] = true;
        Object retValue = callMethod(klass, "getReadableJSTypeName", argTypes, term80850, args);
        assertTrue(recursiveEquals(term80850, term81326));
        assertTrue(recursiveEquals(term80920, term81327));
        assertTrue(recursiveEquals(retValue, "NoResolvedType"));
    }

};


