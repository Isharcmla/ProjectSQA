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

public class TypeValidator_getReadableJSTypeName_850599436227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64445;
     Object term64537;
     Object term65094;
     Object term65095;

    public TypeValidator_getReadableJSTypeName_850599436227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64445 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term64537 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term64651 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setIntField(term64537, term64537.getClass(), "type", -34);
        setField(term64537, term64537.getClass(), "jsType", term64651);
        term65094 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term65094, term65094.getClass(), "compiler", null);
        setField(term65094, term65094.getClass(), "typeRegistry", null);
        setField(term65094, term65094.getClass(), "allValueTypes", null);
        setBooleanField(term65094, term65094.getClass(), "shouldReport", false);
        setField(term65094, term65094.getClass(), "nullOrUndefined", null);
        setField(term65094, term65094.getClass(), "mismatches", null);
        term65095 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term65096 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term65095, term65095.getClass(), "str", null);
        setIntField(term65095, term65095.getClass(), "type", -34);
        setField(term65095, term65095.getClass(), "next", null);
        setField(term65095, term65095.getClass(), "first", null);
        setField(term65095, term65095.getClass(), "last", null);
        setField(term65095, term65095.getClass(), "propListHead", null);
        setIntField(term65095, term65095.getClass(), "sourcePosition", 0);
        setField(term65096, term65096.getClass(), "className", null);
        setField(term65096, term65096.getClass(), "properties", null);
        setBooleanField(term65096, term65096.getClass(), "nativeType", false);
        setField(term65096, term65096.getClass(), "implicitPrototypeFallback", null);
        setField(term65096, term65096.getClass(), "ownerFunction", null);
        setBooleanField(term65096, term65096.getClass(), "prettyPrint", false);
        setBooleanField(term65096, term65096.getClass(), "visited", false);
        setField(term65096, term65096.getClass(), "docInfo", null);
        setBooleanField(term65096, term65096.getClass(), "unknown", false);
        setBooleanField(term65096, term65096.getClass(), "resolved", false);
        setField(term65096, term65096.getClass(), "resolveResult", null);
        setField(term65096, term65096.getClass(), "templateKeys", null);
        setField(term65096, term65096.getClass(), "templatizedTypes", null);
        setBooleanField(term65096, term65096.getClass(), "inTemplatedCheckVisit", false);
        setField(term65096, term65096.getClass(), "registry", null);
        setField(term65095, term65095.getClass(), "jsType", term65096);
        setField(term65095, term65095.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term64537;
        args[1] = true;
        Object retValue = callMethod(klass, "getReadableJSTypeName", argTypes, term64445, args);
        assertTrue(recursiveEquals(term64445, term65094));
        assertTrue(recursiveEquals(term64537, term65095));
        assertTrue(recursiveEquals(retValue, "{...}"));
    }

};


