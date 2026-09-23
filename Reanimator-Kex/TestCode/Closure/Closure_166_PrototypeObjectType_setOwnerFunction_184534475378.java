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
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class PrototypeObjectType_setOwnerFunction_184534475378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2763;
     Object term2803;

    public PrototypeObjectType_setOwnerFunction_184534475378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2776 = new HashMap();
        term2763 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2788 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2797 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2763, term2763.getClass(), "className", "mfCpTPPQQm");
        setField(term2763, term2763.getClass(), "properties", term2776);
        setBooleanField(term2763, term2763.getClass(), "nativeType", true);
        setField(term2763, term2763.getClass(), "implicitPrototypeFallback", null);
        setField(term2788, term2788.getClass(), "call", null);
        setField(term2788, term2788.getClass(), "prototypeSlot", null);
        setField(term2788, term2788.getClass(), "kind", null);
        setField(term2788, term2788.getClass(), "typeOfThis", null);
        setField(term2788, term2788.getClass(), "source", null);
        setField(term2788, term2788.getClass(), "implementedInterfaces", null);
        setField(term2788, term2788.getClass(), "extendedInterfaces", null);
        setField(term2788, term2788.getClass(), "subTypes", null);
        setField(term2788, term2788.getClass(), "templateTypeNames", null);
        setField(term2788, term2788.getClass(), "className", null);
        setField(term2788, term2788.getClass(), "properties", null);
        setBooleanField(term2788, term2788.getClass(), "nativeType", false);
        setField(term2788, term2788.getClass(), "implicitPrototypeFallback", null);
        setField(term2788, term2788.getClass(), "ownerFunction", null);
        setBooleanField(term2788, term2788.getClass(), "prettyPrint", false);
        setBooleanField(term2788, term2788.getClass(), "visited", false);
        setField(term2788, term2788.getClass(), "docInfo", null);
        setBooleanField(term2788, term2788.getClass(), "unknown", false);
        setBooleanField(term2788, term2788.getClass(), "resolved", false);
        setField(term2788, term2788.getClass(), "resolveResult", null);
        setBooleanField(term2788, term2788.getClass(), "inTemplatedCheckVisit", false);
        setField(term2788, term2788.getClass(), "registry", null);
        setField(term2763, term2763.getClass(), "ownerFunction", term2788);
        setBooleanField(term2763, term2763.getClass(), "prettyPrint", true);
        setBooleanField(term2763, term2763.getClass(), "visited", true);
        setField(term2797, term2797.getClass(), "info", null);
        setField(term2797, term2797.getClass(), "documentation", null);
        setField(term2797, term2797.getClass(), "associatedNode", null);
        setField(term2797, term2797.getClass(), "visibility", null);
        setIntField(term2797, term2797.getClass(), "bitset", 0);
        setField(term2797, term2797.getClass(), "type", null);
        setField(term2797, term2797.getClass(), "thisType", null);
        setBooleanField(term2797, term2797.getClass(), "includeDocumentation", false);
        setField(term2763, term2763.getClass(), "docInfo", term2797);
        setBooleanField(term2763, term2763.getClass(), "unknown", true);
        setBooleanField(term2763, term2763.getClass(), "resolved", false);
        setField(term2763, term2763.getClass(), "resolveResult", null);
        setBooleanField(term2763, term2763.getClass(), "inTemplatedCheckVisit", false);
        setField(term2763, term2763.getClass(), "registry", null);
        Class<? extends Object> term9556 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term9555 = ((Class) term9556).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term9555).setAccessible(true);
        Object enum2 = ((Field) term9555).get((Object) null);
        term2803 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2804 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term2805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2832 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term2805, term2805.getClass(), "type", -936895502);
        setIntField(term2807, term2807.getClass(), "type", -129547140);
        setIntField(term2809, term2809.getClass(), "type", 199287428);
        setField(term2809, term2809.getClass(), "next", null);
        setField(term2809, term2809.getClass(), "first", null);
        setField(term2809, term2809.getClass(), "last", null);
        setField(term2809, term2809.getClass(), "propListHead", null);
        setIntField(term2809, term2809.getClass(), "sourcePosition", 0);
        setField(term2809, term2809.getClass(), "jsType", null);
        setField(term2809, term2809.getClass(), "parent", null);
        setField(term2807, term2807.getClass(), "next", term2809);
        setIntField(term2812, term2812.getClass(), "type", 0);
        setField(term2812, term2812.getClass(), "next", null);
        setField(term2812, term2812.getClass(), "first", null);
        setField(term2812, term2812.getClass(), "last", null);
        setField(term2812, term2812.getClass(), "propListHead", null);
        setIntField(term2812, term2812.getClass(), "sourcePosition", 0);
        setField(term2812, term2812.getClass(), "jsType", null);
        setField(term2812, term2812.getClass(), "parent", null);
        setField(term2807, term2807.getClass(), "first", term2812);
        setIntField(term2815, term2815.getClass(), "type", 2009020256);
        setField(term2815, term2815.getClass(), "next", null);
        setField(term2815, term2815.getClass(), "first", term2812);
        setField(term2815, term2815.getClass(), "last", term2815);
        setField(term2815, term2815.getClass(), "propListHead", null);
        setIntField(term2815, term2815.getClass(), "sourcePosition", 0);
        setField(term2815, term2815.getClass(), "jsType", null);
        setField(term2815, term2815.getClass(), "parent", null);
        setField(term2807, term2807.getClass(), "last", term2815);
        setField(term2807, term2807.getClass(), "propListHead", null);
        setIntField(term2807, term2807.getClass(), "sourcePosition", 0);
        setField(term2807, term2807.getClass(), "jsType", null);
        setField(term2807, term2807.getClass(), "parent", null);
        setField(term2805, term2805.getClass(), "next", term2807);
        setIntField(term2819, term2819.getClass(), "type", 306847454);
        setIntField(term2821, term2821.getClass(), "type", 1745276158);
        setField(term2821, term2821.getClass(), "next", term2815);
        setField(term2821, term2821.getClass(), "first", null);
        setField(term2821, term2821.getClass(), "last", term2805);
        setField(term2821, term2821.getClass(), "propListHead", null);
        setIntField(term2821, term2821.getClass(), "sourcePosition", 0);
        setField(term2821, term2821.getClass(), "jsType", null);
        setField(term2821, term2821.getClass(), "parent", null);
        setField(term2819, term2819.getClass(), "next", term2821);
        setField(term2819, term2819.getClass(), "first", term2819);
        setIntField(term2824, term2824.getClass(), "type", -1195339592);
        setField(term2824, term2824.getClass(), "next", null);
        setField(term2824, term2824.getClass(), "first", term2812);
        setField(term2824, term2824.getClass(), "last", term2815);
        setField(term2824, term2824.getClass(), "propListHead", null);
        setIntField(term2824, term2824.getClass(), "sourcePosition", 0);
        setField(term2824, term2824.getClass(), "jsType", null);
        setField(term2824, term2824.getClass(), "parent", null);
        setField(term2819, term2819.getClass(), "last", term2824);
        setField(term2819, term2819.getClass(), "propListHead", null);
        setIntField(term2819, term2819.getClass(), "sourcePosition", 0);
        setField(term2819, term2819.getClass(), "jsType", null);
        setField(term2819, term2819.getClass(), "parent", null);
        setField(term2805, term2805.getClass(), "first", term2819);
        setField(term2805, term2805.getClass(), "last", term2809);
        setField(term2805, term2805.getClass(), "propListHead", null);
        setIntField(term2805, term2805.getClass(), "sourcePosition", 0);
        setField(term2805, term2805.getClass(), "jsType", null);
        setField(term2805, term2805.getClass(), "parent", null);
        setField(term2804, term2804.getClass(), "parameters", term2805);
        setField(term2804, term2804.getClass(), "returnType", null);
        setBooleanField(term2804, term2804.getClass(), "returnTypeInferred", false);
        setBooleanField(term2804, term2804.getClass(), "resolved", false);
        setField(term2804, term2804.getClass(), "resolveResult", null);
        setBooleanField(term2804, term2804.getClass(), "inTemplatedCheckVisit", false);
        setField(term2804, term2804.getClass(), "registry", null);
        setField(term2803, term2803.getClass(), "call", term2804);
        setField(term2832, term2832.getClass(), "name", null);
        setField(term2832, term2832.getClass(), "type", null);
        setBooleanField(term2832, term2832.getClass(), "inferred", false);
        setField(term2832, term2832.getClass(), "propertyNode", null);
        setField(term2832, term2832.getClass(), "docInfo", null);
        setField(term2803, term2803.getClass(), "prototypeSlot", term2832);
        setField(term2803, term2803.getClass(), "kind", enum2);
        setField(term2803, term2803.getClass(), "typeOfThis", null);
        setField(term2803, term2803.getClass(), "source", null);
        setField(term2803, term2803.getClass(), "implementedInterfaces", null);
        setField(term2803, term2803.getClass(), "extendedInterfaces", null);
        setField(term2803, term2803.getClass(), "subTypes", null);
        setField(term2803, term2803.getClass(), "templateTypeNames", null);
        setField(term2803, term2803.getClass(), "className", null);
        setField(term2803, term2803.getClass(), "properties", null);
        setBooleanField(term2803, term2803.getClass(), "nativeType", false);
        setField(term2803, term2803.getClass(), "implicitPrototypeFallback", null);
        setField(term2803, term2803.getClass(), "ownerFunction", null);
        setBooleanField(term2803, term2803.getClass(), "prettyPrint", false);
        setBooleanField(term2803, term2803.getClass(), "visited", false);
        setField(term2803, term2803.getClass(), "docInfo", null);
        setBooleanField(term2803, term2803.getClass(), "unknown", false);
        setBooleanField(term2803, term2803.getClass(), "resolved", false);
        setField(term2803, term2803.getClass(), "resolveResult", null);
        setBooleanField(term2803, term2803.getClass(), "inTemplatedCheckVisit", false);
        setField(term2803, term2803.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term2803;
        try {
            callMethod(klass, "setOwnerFunction", argTypes, term2763, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


