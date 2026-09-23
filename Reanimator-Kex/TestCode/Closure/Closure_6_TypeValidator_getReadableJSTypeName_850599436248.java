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

public class TypeValidator_getReadableJSTypeName_850599436248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70445;
     Object term70515;
     Object term70912;
     Object term70913;

    public TypeValidator_getReadableJSTypeName_850599436248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70445 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term70515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70623 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term70731 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setIntField(term70515, term70515.getClass(), "type", 0);
        setField(term70623, term70623.getClass(), "ownerFunction", term70731);
        setField(term70515, term70515.getClass(), "jsType", term70623);
        term70912 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term70912, term70912.getClass(), "compiler", null);
        setField(term70912, term70912.getClass(), "typeRegistry", null);
        setField(term70912, term70912.getClass(), "allValueTypes", null);
        setBooleanField(term70912, term70912.getClass(), "shouldReport", false);
        setField(term70912, term70912.getClass(), "nullOrUndefined", null);
        setField(term70912, term70912.getClass(), "mismatches", null);
        term70913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70914 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term70915 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setIntField(term70913, term70913.getClass(), "type", 0);
        setField(term70913, term70913.getClass(), "next", null);
        setField(term70913, term70913.getClass(), "first", null);
        setField(term70913, term70913.getClass(), "last", null);
        setField(term70913, term70913.getClass(), "propListHead", null);
        setIntField(term70913, term70913.getClass(), "sourcePosition", 0);
        setField(term70914, term70914.getClass(), "this$0", null);
        setField(term70914, term70914.getClass(), "call", null);
        setField(term70914, term70914.getClass(), "prototypeSlot", null);
        setField(term70914, term70914.getClass(), "kind", null);
        setField(term70914, term70914.getClass(), "propAccess", null);
        setField(term70914, term70914.getClass(), "typeOfThis", null);
        setField(term70914, term70914.getClass(), "source", null);
        setField(term70914, term70914.getClass(), "implementedInterfaces", null);
        setField(term70914, term70914.getClass(), "extendedInterfaces", null);
        setField(term70914, term70914.getClass(), "subTypes", null);
        setField(term70914, term70914.getClass(), "className", null);
        setField(term70914, term70914.getClass(), "properties", null);
        setBooleanField(term70914, term70914.getClass(), "nativeType", false);
        setField(term70914, term70914.getClass(), "implicitPrototypeFallback", null);
        setField(term70915, term70915.getClass(), "this$0", null);
        setField(term70915, term70915.getClass(), "call", null);
        setField(term70915, term70915.getClass(), "prototypeSlot", null);
        setField(term70915, term70915.getClass(), "kind", null);
        setField(term70915, term70915.getClass(), "propAccess", null);
        setField(term70915, term70915.getClass(), "typeOfThis", null);
        setField(term70915, term70915.getClass(), "source", null);
        setField(term70915, term70915.getClass(), "implementedInterfaces", null);
        setField(term70915, term70915.getClass(), "extendedInterfaces", null);
        setField(term70915, term70915.getClass(), "subTypes", null);
        setField(term70915, term70915.getClass(), "className", null);
        setField(term70915, term70915.getClass(), "properties", null);
        setBooleanField(term70915, term70915.getClass(), "nativeType", false);
        setField(term70915, term70915.getClass(), "implicitPrototypeFallback", null);
        setField(term70915, term70915.getClass(), "ownerFunction", null);
        setBooleanField(term70915, term70915.getClass(), "prettyPrint", false);
        setBooleanField(term70915, term70915.getClass(), "visited", false);
        setField(term70915, term70915.getClass(), "docInfo", null);
        setBooleanField(term70915, term70915.getClass(), "unknown", false);
        setBooleanField(term70915, term70915.getClass(), "resolved", false);
        setField(term70915, term70915.getClass(), "resolveResult", null);
        setField(term70915, term70915.getClass(), "templateKeys", null);
        setField(term70915, term70915.getClass(), "templatizedTypes", null);
        setBooleanField(term70915, term70915.getClass(), "inTemplatedCheckVisit", false);
        setField(term70915, term70915.getClass(), "registry", null);
        setField(term70914, term70914.getClass(), "ownerFunction", term70915);
        setBooleanField(term70914, term70914.getClass(), "prettyPrint", false);
        setBooleanField(term70914, term70914.getClass(), "visited", false);
        setField(term70914, term70914.getClass(), "docInfo", null);
        setBooleanField(term70914, term70914.getClass(), "unknown", false);
        setBooleanField(term70914, term70914.getClass(), "resolved", false);
        setField(term70914, term70914.getClass(), "resolveResult", null);
        setField(term70914, term70914.getClass(), "templateKeys", null);
        setField(term70914, term70914.getClass(), "templatizedTypes", null);
        setBooleanField(term70914, term70914.getClass(), "inTemplatedCheckVisit", false);
        setField(term70914, term70914.getClass(), "registry", null);
        setField(term70913, term70913.getClass(), "jsType", term70914);
        setField(term70913, term70913.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term70515;
        args[1] = true;
        Object retValue = callMethod(klass, "getReadableJSTypeName", argTypes, term70445, args);
        assertTrue(recursiveEquals(term70445, term70912));
        assertTrue(recursiveEquals(term70515, term70913));
        assertTrue(recursiveEquals(retValue, "Function"));
    }

};


