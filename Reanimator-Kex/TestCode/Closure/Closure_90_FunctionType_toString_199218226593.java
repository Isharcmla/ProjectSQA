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

public class FunctionType_toString_199218226593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15316;

    public FunctionType_toString_199218226593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term49680 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term49679 = ((Class) term49680).getDeclaredField((String) "ORDINARY");
        ((Field) term49679).setAccessible(true);
        Object enum125 = ((Field) term49679).get((Object) null);
        term15316 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term15317 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term15318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15331 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15341 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15347 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term15318, term15318.getClass(), "type", -266625190);
        setIntField(term15320, term15320.getClass(), "type", -941356098);
        setIntField(term15322, term15322.getClass(), "type", 0);
        setField(term15322, term15322.getClass(), "next", null);
        setField(term15322, term15322.getClass(), "first", null);
        setField(term15322, term15322.getClass(), "last", null);
        setField(term15322, term15322.getClass(), "propListHead", null);
        setIntField(term15322, term15322.getClass(), "sourcePosition", 0);
        setField(term15322, term15322.getClass(), "jsType", null);
        setField(term15322, term15322.getClass(), "parent", null);
        setField(term15320, term15320.getClass(), "next", term15322);
        setIntField(term15325, term15325.getClass(), "type", 0);
        setField(term15325, term15325.getClass(), "next", null);
        setField(term15325, term15325.getClass(), "first", null);
        setField(term15325, term15325.getClass(), "last", null);
        setField(term15325, term15325.getClass(), "propListHead", null);
        setIntField(term15325, term15325.getClass(), "sourcePosition", 0);
        setField(term15325, term15325.getClass(), "jsType", null);
        setField(term15325, term15325.getClass(), "parent", null);
        setField(term15320, term15320.getClass(), "first", term15325);
        setIntField(term15328, term15328.getClass(), "type", 0);
        setField(term15328, term15328.getClass(), "next", null);
        setField(term15328, term15328.getClass(), "first", null);
        setField(term15328, term15328.getClass(), "last", null);
        setField(term15328, term15328.getClass(), "propListHead", null);
        setIntField(term15328, term15328.getClass(), "sourcePosition", 0);
        setField(term15328, term15328.getClass(), "jsType", null);
        setField(term15328, term15328.getClass(), "parent", null);
        setField(term15320, term15320.getClass(), "last", term15328);
        setField(term15331, term15331.getClass(), "next", null);
        setIntField(term15331, term15331.getClass(), "type", 0);
        setIntField(term15331, term15331.getClass(), "intValue", 0);
        setField(term15331, term15331.getClass(), "objectValue", null);
        setField(term15320, term15320.getClass(), "propListHead", term15331);
        setIntField(term15320, term15320.getClass(), "sourcePosition", -201517446);
        setField(term15320, term15320.getClass(), "jsType", null);
        setField(term15320, term15320.getClass(), "parent", null);
        setField(term15318, term15318.getClass(), "next", term15320);
        setIntField(term15335, term15335.getClass(), "type", 0);
        setField(term15335, term15335.getClass(), "next", null);
        setField(term15335, term15335.getClass(), "first", null);
        setField(term15335, term15335.getClass(), "last", null);
        setField(term15335, term15335.getClass(), "propListHead", null);
        setIntField(term15335, term15335.getClass(), "sourcePosition", 0);
        setField(term15335, term15335.getClass(), "jsType", null);
        setField(term15335, term15335.getClass(), "parent", null);
        setField(term15318, term15318.getClass(), "first", term15335);
        setIntField(term15338, term15338.getClass(), "type", 0);
        setField(term15338, term15338.getClass(), "next", null);
        setField(term15338, term15338.getClass(), "first", null);
        setField(term15338, term15338.getClass(), "last", null);
        setField(term15338, term15338.getClass(), "propListHead", null);
        setIntField(term15338, term15338.getClass(), "sourcePosition", 0);
        setField(term15338, term15338.getClass(), "jsType", null);
        setField(term15338, term15338.getClass(), "parent", null);
        setField(term15318, term15318.getClass(), "last", term15338);
        setField(term15341, term15341.getClass(), "next", null);
        setIntField(term15341, term15341.getClass(), "type", 0);
        setIntField(term15341, term15341.getClass(), "intValue", 0);
        setField(term15341, term15341.getClass(), "objectValue", null);
        setField(term15318, term15318.getClass(), "propListHead", term15341);
        setIntField(term15318, term15318.getClass(), "sourcePosition", -97742366);
        setField(term15318, term15318.getClass(), "jsType", null);
        setField(term15318, term15318.getClass(), "parent", null);
        setField(term15317, term15317.getClass(), "parameters", term15318);
        setField(term15317, term15317.getClass(), "returnType", null);
        setBooleanField(term15317, term15317.getClass(), "returnTypeInferred", false);
        setBooleanField(term15317, term15317.getClass(), "resolved", false);
        setField(term15317, term15317.getClass(), "resolveResult", null);
        setField(term15317, term15317.getClass(), "registry", null);
        setField(term15316, term15316.getClass(), "call", term15317);
        setField(term15347, term15347.getClass(), "ownerFunction", null);
        setField(term15347, term15347.getClass(), "className", null);
        setField(term15347, term15347.getClass(), "properties", null);
        setBooleanField(term15347, term15347.getClass(), "nativeType", false);
        setField(term15347, term15347.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term15347, term15347.getClass(), "prettyPrint", false);
        setBooleanField(term15347, term15347.getClass(), "visited", false);
        setField(term15347, term15347.getClass(), "docInfo", null);
        setBooleanField(term15347, term15347.getClass(), "unknown", false);
        setBooleanField(term15347, term15347.getClass(), "resolved", false);
        setField(term15347, term15347.getClass(), "resolveResult", null);
        setField(term15347, term15347.getClass(), "registry", null);
        setField(term15316, term15316.getClass(), "prototype", term15347);
        setField(term15316, term15316.getClass(), "kind", enum125);
        setField(term15316, term15316.getClass(), "typeOfThis", null);
        setField(term15316, term15316.getClass(), "source", null);
        setField(term15316, term15316.getClass(), "implementedInterfaces", null);
        setField(term15316, term15316.getClass(), "subTypes", null);
        setField(term15316, term15316.getClass(), "templateTypeName", null);
        setField(term15316, term15316.getClass(), "className", null);
        setField(term15316, term15316.getClass(), "properties", null);
        setBooleanField(term15316, term15316.getClass(), "nativeType", false);
        setField(term15316, term15316.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term15316, term15316.getClass(), "prettyPrint", false);
        setBooleanField(term15316, term15316.getClass(), "visited", false);
        setField(term15316, term15316.getClass(), "docInfo", null);
        setBooleanField(term15316, term15316.getClass(), "unknown", false);
        setBooleanField(term15316, term15316.getClass(), "resolved", false);
        setField(term15316, term15316.getClass(), "resolveResult", null);
        setField(term15316, term15316.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term15316, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


