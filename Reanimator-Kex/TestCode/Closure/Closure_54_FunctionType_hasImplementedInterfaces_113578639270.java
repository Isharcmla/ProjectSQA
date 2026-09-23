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

public class FunctionType_hasImplementedInterfaces_113578639270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2566;

    public FunctionType_hasImplementedInterfaces_113578639270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26758 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term26757 = ((Class) term26758).getDeclaredField((String) "INTERFACE");
        ((Field) term26757).setAccessible(true);
        Object enum71 = ((Field) term26757).get((Object) null);
        term2566 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2567 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term2568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2591 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2597 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setIntField(term2568, term2568.getClass(), "type", 304775596);
        setIntField(term2570, term2570.getClass(), "type", 1596213415);
        setIntField(term2572, term2572.getClass(), "type", 0);
        setField(term2572, term2572.getClass(), "next", null);
        setField(term2572, term2572.getClass(), "first", null);
        setField(term2572, term2572.getClass(), "last", null);
        setField(term2572, term2572.getClass(), "propListHead", null);
        setIntField(term2572, term2572.getClass(), "sourcePosition", 0);
        setField(term2572, term2572.getClass(), "jsType", null);
        setField(term2572, term2572.getClass(), "parent", null);
        setField(term2570, term2570.getClass(), "next", term2572);
        setIntField(term2575, term2575.getClass(), "type", 0);
        setField(term2575, term2575.getClass(), "next", null);
        setField(term2575, term2575.getClass(), "first", null);
        setField(term2575, term2575.getClass(), "last", null);
        setField(term2575, term2575.getClass(), "propListHead", null);
        setIntField(term2575, term2575.getClass(), "sourcePosition", 0);
        setField(term2575, term2575.getClass(), "jsType", null);
        setField(term2575, term2575.getClass(), "parent", null);
        setField(term2570, term2570.getClass(), "first", term2575);
        setIntField(term2578, term2578.getClass(), "type", 0);
        setField(term2578, term2578.getClass(), "next", null);
        setField(term2578, term2578.getClass(), "first", null);
        setField(term2578, term2578.getClass(), "last", null);
        setField(term2578, term2578.getClass(), "propListHead", null);
        setIntField(term2578, term2578.getClass(), "sourcePosition", 0);
        setField(term2578, term2578.getClass(), "jsType", null);
        setField(term2578, term2578.getClass(), "parent", null);
        setField(term2570, term2570.getClass(), "last", term2578);
        setField(term2570, term2570.getClass(), "propListHead", null);
        setIntField(term2570, term2570.getClass(), "sourcePosition", 0);
        setField(term2570, term2570.getClass(), "jsType", null);
        setField(term2570, term2570.getClass(), "parent", null);
        setField(term2568, term2568.getClass(), "next", term2570);
        setIntField(term2582, term2582.getClass(), "type", 0);
        setField(term2582, term2582.getClass(), "next", null);
        setField(term2582, term2582.getClass(), "first", null);
        setField(term2582, term2582.getClass(), "last", null);
        setField(term2582, term2582.getClass(), "propListHead", null);
        setIntField(term2582, term2582.getClass(), "sourcePosition", 0);
        setField(term2582, term2582.getClass(), "jsType", null);
        setField(term2582, term2582.getClass(), "parent", null);
        setField(term2568, term2568.getClass(), "first", term2582);
        setIntField(term2585, term2585.getClass(), "type", 0);
        setField(term2585, term2585.getClass(), "next", null);
        setField(term2585, term2585.getClass(), "first", null);
        setField(term2585, term2585.getClass(), "last", null);
        setField(term2585, term2585.getClass(), "propListHead", null);
        setIntField(term2585, term2585.getClass(), "sourcePosition", 0);
        setField(term2585, term2585.getClass(), "jsType", null);
        setField(term2585, term2585.getClass(), "parent", null);
        setField(term2568, term2568.getClass(), "last", term2585);
        setField(term2568, term2568.getClass(), "propListHead", null);
        setIntField(term2568, term2568.getClass(), "sourcePosition", 0);
        setField(term2568, term2568.getClass(), "jsType", null);
        setField(term2568, term2568.getClass(), "parent", null);
        setField(term2567, term2567.getClass(), "parameters", term2568);
        setField(term2567, term2567.getClass(), "returnType", null);
        setBooleanField(term2567, term2567.getClass(), "returnTypeInferred", false);
        setBooleanField(term2567, term2567.getClass(), "resolved", false);
        setField(term2567, term2567.getClass(), "resolveResult", null);
        setField(term2567, term2567.getClass(), "registry", null);
        setField(term2566, term2566.getClass(), "call", term2567);
        setField(term2591, term2591.getClass(), "className", null);
        setField(term2591, term2591.getClass(), "properties", null);
        setBooleanField(term2591, term2591.getClass(), "nativeType", false);
        setField(term2591, term2591.getClass(), "implicitPrototypeFallback", null);
        setField(term2591, term2591.getClass(), "ownerFunction", null);
        setBooleanField(term2591, term2591.getClass(), "prettyPrint", false);
        setBooleanField(term2591, term2591.getClass(), "visited", false);
        setField(term2591, term2591.getClass(), "docInfo", null);
        setBooleanField(term2591, term2591.getClass(), "unknown", false);
        setBooleanField(term2591, term2591.getClass(), "resolved", false);
        setField(term2591, term2591.getClass(), "resolveResult", null);
        setField(term2591, term2591.getClass(), "registry", null);
        setField(term2566, term2566.getClass(), "prototype", term2591);
        setField(term2597, term2597.getClass(), "name", null);
        setField(term2597, term2597.getClass(), "type", null);
        setBooleanField(term2597, term2597.getClass(), "inferred", false);
        setField(term2566, term2566.getClass(), "prototypeSlot", term2597);
        setField(term2566, term2566.getClass(), "kind", enum71);
        setField(term2566, term2566.getClass(), "typeOfThis", null);
        setField(term2566, term2566.getClass(), "source", null);
        setField(term2566, term2566.getClass(), "implementedInterfaces", null);
        setField(term2566, term2566.getClass(), "extendedInterfaces", null);
        setField(term2566, term2566.getClass(), "subTypes", null);
        setField(term2566, term2566.getClass(), "templateTypeName", null);
        setField(term2566, term2566.getClass(), "className", null);
        setField(term2566, term2566.getClass(), "properties", null);
        setBooleanField(term2566, term2566.getClass(), "nativeType", false);
        setField(term2566, term2566.getClass(), "implicitPrototypeFallback", null);
        setField(term2566, term2566.getClass(), "ownerFunction", null);
        setBooleanField(term2566, term2566.getClass(), "prettyPrint", false);
        setBooleanField(term2566, term2566.getClass(), "visited", false);
        setField(term2566, term2566.getClass(), "docInfo", null);
        setBooleanField(term2566, term2566.getClass(), "unknown", false);
        setBooleanField(term2566, term2566.getClass(), "resolved", false);
        setField(term2566, term2566.getClass(), "resolveResult", null);
        setField(term2566, term2566.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hasImplementedInterfaces", argTypes, term2566, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


