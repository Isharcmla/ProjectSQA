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

public class TypeValidator_getReadableJSTypeName_850599436146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35802;
     Object term35872;
     Object term36072;
     Object term36073;

    public TypeValidator_getReadableJSTypeName_850599436146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35802 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term35872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35976 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term35872, term35872.getClass(), "type", -34);
        setField(term35872, term35872.getClass(), "jsType", term35976);
        term36072 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term36072, term36072.getClass(), "compiler", null);
        setField(term36072, term36072.getClass(), "typeRegistry", null);
        setField(term36072, term36072.getClass(), "allValueTypes", null);
        setBooleanField(term36072, term36072.getClass(), "shouldReport", false);
        setField(term36072, term36072.getClass(), "nullOrUndefined", null);
        setField(term36072, term36072.getClass(), "mismatches", null);
        term36073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term36073, term36073.getClass(), "type", -34);
        setField(term36073, term36073.getClass(), "next", null);
        setField(term36073, term36073.getClass(), "first", null);
        setField(term36073, term36073.getClass(), "last", null);
        setField(term36073, term36073.getClass(), "propListHead", null);
        setIntField(term36073, term36073.getClass(), "sourcePosition", 0);
        setField(term36074, term36074.getClass(), "call", null);
        setField(term36074, term36074.getClass(), "prototype", null);
        setField(term36074, term36074.getClass(), "kind", null);
        setField(term36074, term36074.getClass(), "typeOfThis", null);
        setField(term36074, term36074.getClass(), "source", null);
        setField(term36074, term36074.getClass(), "implementedInterfaces", null);
        setField(term36074, term36074.getClass(), "subTypes", null);
        setField(term36074, term36074.getClass(), "templateTypeName", null);
        setField(term36074, term36074.getClass(), "className", null);
        setField(term36074, term36074.getClass(), "properties", null);
        setBooleanField(term36074, term36074.getClass(), "nativeType", false);
        setField(term36074, term36074.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term36074, term36074.getClass(), "prettyPrint", false);
        setBooleanField(term36074, term36074.getClass(), "visited", false);
        setField(term36074, term36074.getClass(), "docInfo", null);
        setBooleanField(term36074, term36074.getClass(), "unknown", false);
        setBooleanField(term36074, term36074.getClass(), "resolved", false);
        setField(term36074, term36074.getClass(), "resolveResult", null);
        setField(term36074, term36074.getClass(), "registry", null);
        setField(term36073, term36073.getClass(), "jsType", term36074);
        setField(term36073, term36073.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term35872;
        args[1] = true;
        Object retValue = callMethod(klass, "getReadableJSTypeName", argTypes, term35802, args);
        assertTrue(recursiveEquals(term35802, term36072));
        assertTrue(recursiveEquals(term35872, term36073));
        assertTrue(recursiveEquals(retValue, "function"));
    }

};


