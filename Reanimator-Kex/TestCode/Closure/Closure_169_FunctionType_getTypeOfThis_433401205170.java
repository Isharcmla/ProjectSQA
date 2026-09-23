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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FunctionType_getTypeOfThis_433401205170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39925;

    public FunctionType_getTypeOfThis_433401205170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term197689 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term197688 = ((Class) term197689).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term197688).setAccessible(true);
        Object enum355 = ((Field) term197688).get((Object) null);
        Class<? extends Object> term197989 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term197988 = ((Class) term197989).getDeclaredField((String) "STRUCT");
        ((Field) term197988).setAccessible(true);
        Object enum356 = ((Field) term197988).get((Object) null);
        term39925 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term39926 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term39927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39946 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39954 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term39927, term39927.getClass(), "type", -1912429941);
        setIntField(term39929, term39929.getClass(), "type", 1801052257);
        setIntField(term39931, term39931.getClass(), "type", -2110556060);
        setField(term39931, term39931.getClass(), "next", null);
        setField(term39931, term39931.getClass(), "first", null);
        setField(term39931, term39931.getClass(), "last", null);
        setField(term39931, term39931.getClass(), "propListHead", null);
        setIntField(term39931, term39931.getClass(), "sourcePosition", 0);
        setField(term39931, term39931.getClass(), "jsType", null);
        setField(term39931, term39931.getClass(), "parent", null);
        setField(term39929, term39929.getClass(), "next", term39931);
        setIntField(term39934, term39934.getClass(), "type", 0);
        setField(term39934, term39934.getClass(), "next", null);
        setField(term39934, term39934.getClass(), "first", null);
        setField(term39934, term39934.getClass(), "last", null);
        setField(term39934, term39934.getClass(), "propListHead", null);
        setIntField(term39934, term39934.getClass(), "sourcePosition", 0);
        setField(term39934, term39934.getClass(), "jsType", null);
        setField(term39934, term39934.getClass(), "parent", null);
        setField(term39929, term39929.getClass(), "first", term39934);
        setIntField(term39937, term39937.getClass(), "type", 340719678);
        setField(term39937, term39937.getClass(), "next", null);
        setField(term39937, term39937.getClass(), "first", term39934);
        setField(term39937, term39937.getClass(), "last", term39937);
        setField(term39937, term39937.getClass(), "propListHead", null);
        setIntField(term39937, term39937.getClass(), "sourcePosition", 0);
        setField(term39937, term39937.getClass(), "jsType", null);
        setField(term39937, term39937.getClass(), "parent", null);
        setField(term39929, term39929.getClass(), "last", term39937);
        setField(term39929, term39929.getClass(), "propListHead", null);
        setIntField(term39929, term39929.getClass(), "sourcePosition", 0);
        setField(term39929, term39929.getClass(), "jsType", null);
        setField(term39929, term39929.getClass(), "parent", null);
        setField(term39927, term39927.getClass(), "next", term39929);
        setIntField(term39941, term39941.getClass(), "type", -1674430871);
        setIntField(term39943, term39943.getClass(), "type", 794352120);
        setField(term39943, term39943.getClass(), "next", term39937);
        setField(term39943, term39943.getClass(), "first", null);
        setField(term39943, term39943.getClass(), "last", term39927);
        setField(term39943, term39943.getClass(), "propListHead", null);
        setIntField(term39943, term39943.getClass(), "sourcePosition", 0);
        setField(term39943, term39943.getClass(), "jsType", null);
        setField(term39943, term39943.getClass(), "parent", null);
        setField(term39941, term39941.getClass(), "next", term39943);
        setField(term39941, term39941.getClass(), "first", term39941);
        setIntField(term39946, term39946.getClass(), "type", 313459791);
        setField(term39946, term39946.getClass(), "next", null);
        setField(term39946, term39946.getClass(), "first", term39934);
        setField(term39946, term39946.getClass(), "last", term39937);
        setField(term39946, term39946.getClass(), "propListHead", null);
        setIntField(term39946, term39946.getClass(), "sourcePosition", 0);
        setField(term39946, term39946.getClass(), "jsType", null);
        setField(term39946, term39946.getClass(), "parent", null);
        setField(term39941, term39941.getClass(), "last", term39946);
        setField(term39941, term39941.getClass(), "propListHead", null);
        setIntField(term39941, term39941.getClass(), "sourcePosition", 0);
        setField(term39941, term39941.getClass(), "jsType", null);
        setField(term39941, term39941.getClass(), "parent", null);
        setField(term39927, term39927.getClass(), "first", term39941);
        setField(term39927, term39927.getClass(), "last", term39931);
        setField(term39927, term39927.getClass(), "propListHead", null);
        setIntField(term39927, term39927.getClass(), "sourcePosition", 0);
        setField(term39927, term39927.getClass(), "jsType", null);
        setField(term39927, term39927.getClass(), "parent", null);
        setField(term39926, term39926.getClass(), "parameters", term39927);
        setField(term39926, term39926.getClass(), "returnType", null);
        setBooleanField(term39926, term39926.getClass(), "returnTypeInferred", false);
        setBooleanField(term39926, term39926.getClass(), "resolved", false);
        setField(term39926, term39926.getClass(), "resolveResult", null);
        setBooleanField(term39926, term39926.getClass(), "inTemplatedCheckVisit", false);
        setField(term39926, term39926.getClass(), "registry", null);
        setField(term39925, term39925.getClass(), "call", term39926);
        setField(term39954, term39954.getClass(), "name", null);
        setField(term39954, term39954.getClass(), "type", null);
        setBooleanField(term39954, term39954.getClass(), "inferred", false);
        setField(term39954, term39954.getClass(), "propertyNode", null);
        setField(term39954, term39954.getClass(), "docInfo", null);
        setField(term39925, term39925.getClass(), "prototypeSlot", term39954);
        setField(term39925, term39925.getClass(), "kind", enum355);
        setField(term39925, term39925.getClass(), "propAccess", enum356);
        setField(term39925, term39925.getClass(), "typeOfThis", null);
        setField(term39925, term39925.getClass(), "source", null);
        setField(term39925, term39925.getClass(), "implementedInterfaces", null);
        setField(term39925, term39925.getClass(), "extendedInterfaces", null);
        setField(term39925, term39925.getClass(), "subTypes", null);
        setField(term39925, term39925.getClass(), "templateTypeNames", null);
        setField(term39925, term39925.getClass(), "className", null);
        setField(term39925, term39925.getClass(), "properties", null);
        setBooleanField(term39925, term39925.getClass(), "nativeType", false);
        setField(term39925, term39925.getClass(), "implicitPrototypeFallback", null);
        setField(term39925, term39925.getClass(), "ownerFunction", null);
        setBooleanField(term39925, term39925.getClass(), "prettyPrint", false);
        setBooleanField(term39925, term39925.getClass(), "visited", false);
        setField(term39925, term39925.getClass(), "docInfo", null);
        setBooleanField(term39925, term39925.getClass(), "unknown", false);
        setBooleanField(term39925, term39925.getClass(), "resolved", false);
        setField(term39925, term39925.getClass(), "resolveResult", null);
        setBooleanField(term39925, term39925.getClass(), "inTemplatedCheckVisit", false);
        setField(term39925, term39925.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getTypeOfThis", argTypes, term39925, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


