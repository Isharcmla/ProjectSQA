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

public class FunctionType_isSubtype_2101002158106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15612;

    public FunctionType_isSubtype_2101002158106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term51889 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term51888 = ((Class) term51889).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term51888).setAccessible(true);
        Object enum130 = ((Field) term51888).get((Object) null);
        term15612 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term15613 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term15614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15637 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term15643 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setIntField(term15614, term15614.getClass(), "type", -1631697577);
        setIntField(term15616, term15616.getClass(), "type", -1284825282);
        setIntField(term15618, term15618.getClass(), "type", 0);
        setField(term15618, term15618.getClass(), "next", null);
        setField(term15618, term15618.getClass(), "first", null);
        setField(term15618, term15618.getClass(), "last", null);
        setField(term15618, term15618.getClass(), "propListHead", null);
        setIntField(term15618, term15618.getClass(), "sourcePosition", 0);
        setField(term15618, term15618.getClass(), "jsType", null);
        setField(term15618, term15618.getClass(), "parent", null);
        setField(term15616, term15616.getClass(), "next", term15618);
        setIntField(term15621, term15621.getClass(), "type", 0);
        setField(term15621, term15621.getClass(), "next", null);
        setField(term15621, term15621.getClass(), "first", null);
        setField(term15621, term15621.getClass(), "last", null);
        setField(term15621, term15621.getClass(), "propListHead", null);
        setIntField(term15621, term15621.getClass(), "sourcePosition", 0);
        setField(term15621, term15621.getClass(), "jsType", null);
        setField(term15621, term15621.getClass(), "parent", null);
        setField(term15616, term15616.getClass(), "first", term15621);
        setIntField(term15624, term15624.getClass(), "type", 0);
        setField(term15624, term15624.getClass(), "next", null);
        setField(term15624, term15624.getClass(), "first", null);
        setField(term15624, term15624.getClass(), "last", null);
        setField(term15624, term15624.getClass(), "propListHead", null);
        setIntField(term15624, term15624.getClass(), "sourcePosition", 0);
        setField(term15624, term15624.getClass(), "jsType", null);
        setField(term15624, term15624.getClass(), "parent", null);
        setField(term15616, term15616.getClass(), "last", term15624);
        setField(term15616, term15616.getClass(), "propListHead", null);
        setIntField(term15616, term15616.getClass(), "sourcePosition", 0);
        setField(term15616, term15616.getClass(), "jsType", null);
        setField(term15616, term15616.getClass(), "parent", null);
        setField(term15614, term15614.getClass(), "next", term15616);
        setIntField(term15628, term15628.getClass(), "type", 0);
        setField(term15628, term15628.getClass(), "next", null);
        setField(term15628, term15628.getClass(), "first", null);
        setField(term15628, term15628.getClass(), "last", null);
        setField(term15628, term15628.getClass(), "propListHead", null);
        setIntField(term15628, term15628.getClass(), "sourcePosition", 0);
        setField(term15628, term15628.getClass(), "jsType", null);
        setField(term15628, term15628.getClass(), "parent", null);
        setField(term15614, term15614.getClass(), "first", term15628);
        setIntField(term15631, term15631.getClass(), "type", 0);
        setField(term15631, term15631.getClass(), "next", null);
        setField(term15631, term15631.getClass(), "first", null);
        setField(term15631, term15631.getClass(), "last", null);
        setField(term15631, term15631.getClass(), "propListHead", null);
        setIntField(term15631, term15631.getClass(), "sourcePosition", 0);
        setField(term15631, term15631.getClass(), "jsType", null);
        setField(term15631, term15631.getClass(), "parent", null);
        setField(term15614, term15614.getClass(), "last", term15631);
        setField(term15614, term15614.getClass(), "propListHead", null);
        setIntField(term15614, term15614.getClass(), "sourcePosition", 0);
        setField(term15614, term15614.getClass(), "jsType", null);
        setField(term15614, term15614.getClass(), "parent", null);
        setField(term15613, term15613.getClass(), "parameters", term15614);
        setField(term15613, term15613.getClass(), "returnType", null);
        setBooleanField(term15613, term15613.getClass(), "returnTypeInferred", false);
        setBooleanField(term15613, term15613.getClass(), "resolved", false);
        setField(term15613, term15613.getClass(), "resolveResult", null);
        setField(term15613, term15613.getClass(), "registry", null);
        setField(term15612, term15612.getClass(), "call", term15613);
        setField(term15637, term15637.getClass(), "className", null);
        setField(term15637, term15637.getClass(), "properties", null);
        setBooleanField(term15637, term15637.getClass(), "nativeType", false);
        setField(term15637, term15637.getClass(), "implicitPrototypeFallback", null);
        setField(term15637, term15637.getClass(), "ownerFunction", null);
        setBooleanField(term15637, term15637.getClass(), "prettyPrint", false);
        setBooleanField(term15637, term15637.getClass(), "visited", false);
        setField(term15637, term15637.getClass(), "docInfo", null);
        setBooleanField(term15637, term15637.getClass(), "unknown", false);
        setBooleanField(term15637, term15637.getClass(), "resolved", false);
        setField(term15637, term15637.getClass(), "resolveResult", null);
        setField(term15637, term15637.getClass(), "registry", null);
        setField(term15612, term15612.getClass(), "prototype", term15637);
        setField(term15643, term15643.getClass(), "name", null);
        setField(term15643, term15643.getClass(), "type", null);
        setBooleanField(term15643, term15643.getClass(), "inferred", false);
        setField(term15612, term15612.getClass(), "prototypeSlot", term15643);
        setField(term15612, term15612.getClass(), "kind", enum130);
        setField(term15612, term15612.getClass(), "typeOfThis", null);
        setField(term15612, term15612.getClass(), "source", null);
        setField(term15612, term15612.getClass(), "implementedInterfaces", null);
        setField(term15612, term15612.getClass(), "extendedInterfaces", null);
        setField(term15612, term15612.getClass(), "subTypes", null);
        setField(term15612, term15612.getClass(), "templateTypeName", null);
        setField(term15612, term15612.getClass(), "className", null);
        setField(term15612, term15612.getClass(), "properties", null);
        setBooleanField(term15612, term15612.getClass(), "nativeType", false);
        setField(term15612, term15612.getClass(), "implicitPrototypeFallback", null);
        setField(term15612, term15612.getClass(), "ownerFunction", null);
        setBooleanField(term15612, term15612.getClass(), "prettyPrint", false);
        setBooleanField(term15612, term15612.getClass(), "visited", false);
        setField(term15612, term15612.getClass(), "docInfo", null);
        setBooleanField(term15612, term15612.getClass(), "unknown", false);
        setBooleanField(term15612, term15612.getClass(), "resolved", false);
        setField(term15612, term15612.getClass(), "resolveResult", null);
        setField(term15612, term15612.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "isSubtype", argTypes, term15612, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


