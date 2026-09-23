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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FunctionType_addRelatedInterfaces_78495442884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7478;
     Object term7531;

    public FunctionType_addRelatedInterfaces_78495442884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36538 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term36537 = ((Class) term36538).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term36537).setAccessible(true);
        Object enum95 = ((Field) term36537).get((Object) null);
        term7478 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term7479 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term7480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term7509 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setIntField(term7480, term7480.getClass(), "type", 282916351);
        setIntField(term7482, term7482.getClass(), "type", -159494544);
        setIntField(term7484, term7484.getClass(), "type", 0);
        setField(term7484, term7484.getClass(), "next", null);
        setField(term7484, term7484.getClass(), "first", null);
        setField(term7484, term7484.getClass(), "last", null);
        setField(term7484, term7484.getClass(), "propListHead", null);
        setIntField(term7484, term7484.getClass(), "sourcePosition", 0);
        setField(term7484, term7484.getClass(), "jsType", null);
        setField(term7484, term7484.getClass(), "parent", null);
        setField(term7482, term7482.getClass(), "next", term7484);
        setIntField(term7487, term7487.getClass(), "type", 0);
        setField(term7487, term7487.getClass(), "next", null);
        setField(term7487, term7487.getClass(), "first", null);
        setField(term7487, term7487.getClass(), "last", null);
        setField(term7487, term7487.getClass(), "propListHead", null);
        setIntField(term7487, term7487.getClass(), "sourcePosition", 0);
        setField(term7487, term7487.getClass(), "jsType", null);
        setField(term7487, term7487.getClass(), "parent", null);
        setField(term7482, term7482.getClass(), "first", term7487);
        setIntField(term7490, term7490.getClass(), "type", 0);
        setField(term7490, term7490.getClass(), "next", null);
        setField(term7490, term7490.getClass(), "first", null);
        setField(term7490, term7490.getClass(), "last", null);
        setField(term7490, term7490.getClass(), "propListHead", null);
        setIntField(term7490, term7490.getClass(), "sourcePosition", 0);
        setField(term7490, term7490.getClass(), "jsType", null);
        setField(term7490, term7490.getClass(), "parent", null);
        setField(term7482, term7482.getClass(), "last", term7490);
        setField(term7482, term7482.getClass(), "propListHead", null);
        setIntField(term7482, term7482.getClass(), "sourcePosition", 0);
        setField(term7482, term7482.getClass(), "jsType", null);
        setField(term7482, term7482.getClass(), "parent", null);
        setField(term7480, term7480.getClass(), "next", term7482);
        setIntField(term7494, term7494.getClass(), "type", 0);
        setField(term7494, term7494.getClass(), "next", null);
        setField(term7494, term7494.getClass(), "first", null);
        setField(term7494, term7494.getClass(), "last", null);
        setField(term7494, term7494.getClass(), "propListHead", null);
        setIntField(term7494, term7494.getClass(), "sourcePosition", 0);
        setField(term7494, term7494.getClass(), "jsType", null);
        setField(term7494, term7494.getClass(), "parent", null);
        setField(term7480, term7480.getClass(), "first", term7494);
        setIntField(term7497, term7497.getClass(), "type", 0);
        setField(term7497, term7497.getClass(), "next", null);
        setField(term7497, term7497.getClass(), "first", null);
        setField(term7497, term7497.getClass(), "last", null);
        setField(term7497, term7497.getClass(), "propListHead", null);
        setIntField(term7497, term7497.getClass(), "sourcePosition", 0);
        setField(term7497, term7497.getClass(), "jsType", null);
        setField(term7497, term7497.getClass(), "parent", null);
        setField(term7480, term7480.getClass(), "last", term7497);
        setField(term7480, term7480.getClass(), "propListHead", null);
        setIntField(term7480, term7480.getClass(), "sourcePosition", 0);
        setField(term7480, term7480.getClass(), "jsType", null);
        setField(term7480, term7480.getClass(), "parent", null);
        setField(term7479, term7479.getClass(), "parameters", term7480);
        setField(term7479, term7479.getClass(), "returnType", null);
        setBooleanField(term7479, term7479.getClass(), "returnTypeInferred", false);
        setBooleanField(term7479, term7479.getClass(), "resolved", false);
        setField(term7479, term7479.getClass(), "resolveResult", null);
        setField(term7479, term7479.getClass(), "registry", null);
        setField(term7478, term7478.getClass(), "call", term7479);
        setField(term7503, term7503.getClass(), "className", null);
        setField(term7503, term7503.getClass(), "properties", null);
        setBooleanField(term7503, term7503.getClass(), "nativeType", false);
        setField(term7503, term7503.getClass(), "implicitPrototypeFallback", null);
        setField(term7503, term7503.getClass(), "ownerFunction", null);
        setBooleanField(term7503, term7503.getClass(), "prettyPrint", false);
        setBooleanField(term7503, term7503.getClass(), "visited", false);
        setField(term7503, term7503.getClass(), "docInfo", null);
        setBooleanField(term7503, term7503.getClass(), "unknown", false);
        setBooleanField(term7503, term7503.getClass(), "resolved", false);
        setField(term7503, term7503.getClass(), "resolveResult", null);
        setField(term7503, term7503.getClass(), "registry", null);
        setField(term7478, term7478.getClass(), "prototype", term7503);
        setField(term7509, term7509.getClass(), "name", null);
        setField(term7509, term7509.getClass(), "type", null);
        setBooleanField(term7509, term7509.getClass(), "inferred", false);
        setField(term7478, term7478.getClass(), "prototypeSlot", term7509);
        setField(term7478, term7478.getClass(), "kind", enum95);
        setField(term7478, term7478.getClass(), "typeOfThis", null);
        setField(term7478, term7478.getClass(), "source", null);
        setField(term7478, term7478.getClass(), "implementedInterfaces", null);
        setField(term7478, term7478.getClass(), "extendedInterfaces", null);
        setField(term7478, term7478.getClass(), "subTypes", null);
        setField(term7478, term7478.getClass(), "templateTypeName", null);
        setField(term7478, term7478.getClass(), "className", null);
        setField(term7478, term7478.getClass(), "properties", null);
        setBooleanField(term7478, term7478.getClass(), "nativeType", false);
        setField(term7478, term7478.getClass(), "implicitPrototypeFallback", null);
        setField(term7478, term7478.getClass(), "ownerFunction", null);
        setBooleanField(term7478, term7478.getClass(), "prettyPrint", false);
        setBooleanField(term7478, term7478.getClass(), "visited", false);
        setField(term7478, term7478.getClass(), "docInfo", null);
        setBooleanField(term7478, term7478.getClass(), "unknown", false);
        setBooleanField(term7478, term7478.getClass(), "resolved", false);
        setField(term7478, term7478.getClass(), "resolveResult", null);
        setField(term7478, term7478.getClass(), "registry", null);
        HashMap term7532 = new HashMap();
        Set<Object> term36837 =  ((Map) term7532).keySet();
        term7531 = new HashSet((Collection<? extends Object>) term36837);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term7531;
        try {
            callMethod(klass, "addRelatedInterfaces", argTypes, term7478, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


