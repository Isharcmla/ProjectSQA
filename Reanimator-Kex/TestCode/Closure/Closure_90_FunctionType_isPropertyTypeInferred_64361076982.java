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

public class FunctionType_isPropertyTypeInferred_64361076982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11337;

    public FunctionType_isPropertyTypeInferred_64361076982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41066 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term41065 = ((Class) term41066).getDeclaredField((String) "ORDINARY");
        ((Field) term41065).setAccessible(true);
        Object enum106 = ((Field) term41065).get((Object) null);
        term11337 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term11338 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term11339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11352 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11362 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11368 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term11339, term11339.getClass(), "type", 339372704);
        setIntField(term11341, term11341.getClass(), "type", -2003192918);
        setIntField(term11343, term11343.getClass(), "type", 0);
        setField(term11343, term11343.getClass(), "next", null);
        setField(term11343, term11343.getClass(), "first", null);
        setField(term11343, term11343.getClass(), "last", null);
        setField(term11343, term11343.getClass(), "propListHead", null);
        setIntField(term11343, term11343.getClass(), "sourcePosition", 0);
        setField(term11343, term11343.getClass(), "jsType", null);
        setField(term11343, term11343.getClass(), "parent", null);
        setField(term11341, term11341.getClass(), "next", term11343);
        setIntField(term11346, term11346.getClass(), "type", 0);
        setField(term11346, term11346.getClass(), "next", null);
        setField(term11346, term11346.getClass(), "first", null);
        setField(term11346, term11346.getClass(), "last", null);
        setField(term11346, term11346.getClass(), "propListHead", null);
        setIntField(term11346, term11346.getClass(), "sourcePosition", 0);
        setField(term11346, term11346.getClass(), "jsType", null);
        setField(term11346, term11346.getClass(), "parent", null);
        setField(term11341, term11341.getClass(), "first", term11346);
        setIntField(term11349, term11349.getClass(), "type", 0);
        setField(term11349, term11349.getClass(), "next", null);
        setField(term11349, term11349.getClass(), "first", null);
        setField(term11349, term11349.getClass(), "last", null);
        setField(term11349, term11349.getClass(), "propListHead", null);
        setIntField(term11349, term11349.getClass(), "sourcePosition", 0);
        setField(term11349, term11349.getClass(), "jsType", null);
        setField(term11349, term11349.getClass(), "parent", null);
        setField(term11341, term11341.getClass(), "last", term11349);
        setField(term11352, term11352.getClass(), "next", null);
        setIntField(term11352, term11352.getClass(), "type", 0);
        setIntField(term11352, term11352.getClass(), "intValue", 0);
        setField(term11352, term11352.getClass(), "objectValue", null);
        setField(term11341, term11341.getClass(), "propListHead", term11352);
        setIntField(term11341, term11341.getClass(), "sourcePosition", -1362856620);
        setField(term11341, term11341.getClass(), "jsType", null);
        setField(term11341, term11341.getClass(), "parent", null);
        setField(term11339, term11339.getClass(), "next", term11341);
        setIntField(term11356, term11356.getClass(), "type", 0);
        setField(term11356, term11356.getClass(), "next", null);
        setField(term11356, term11356.getClass(), "first", null);
        setField(term11356, term11356.getClass(), "last", null);
        setField(term11356, term11356.getClass(), "propListHead", null);
        setIntField(term11356, term11356.getClass(), "sourcePosition", 0);
        setField(term11356, term11356.getClass(), "jsType", null);
        setField(term11356, term11356.getClass(), "parent", null);
        setField(term11339, term11339.getClass(), "first", term11356);
        setIntField(term11359, term11359.getClass(), "type", 0);
        setField(term11359, term11359.getClass(), "next", null);
        setField(term11359, term11359.getClass(), "first", null);
        setField(term11359, term11359.getClass(), "last", null);
        setField(term11359, term11359.getClass(), "propListHead", null);
        setIntField(term11359, term11359.getClass(), "sourcePosition", 0);
        setField(term11359, term11359.getClass(), "jsType", null);
        setField(term11359, term11359.getClass(), "parent", null);
        setField(term11339, term11339.getClass(), "last", term11359);
        setField(term11362, term11362.getClass(), "next", null);
        setIntField(term11362, term11362.getClass(), "type", 0);
        setIntField(term11362, term11362.getClass(), "intValue", 0);
        setField(term11362, term11362.getClass(), "objectValue", null);
        setField(term11339, term11339.getClass(), "propListHead", term11362);
        setIntField(term11339, term11339.getClass(), "sourcePosition", -1835839814);
        setField(term11339, term11339.getClass(), "jsType", null);
        setField(term11339, term11339.getClass(), "parent", null);
        setField(term11338, term11338.getClass(), "parameters", term11339);
        setField(term11338, term11338.getClass(), "returnType", null);
        setBooleanField(term11338, term11338.getClass(), "returnTypeInferred", false);
        setBooleanField(term11338, term11338.getClass(), "resolved", false);
        setField(term11338, term11338.getClass(), "resolveResult", null);
        setField(term11338, term11338.getClass(), "registry", null);
        setField(term11337, term11337.getClass(), "call", term11338);
        setField(term11368, term11368.getClass(), "ownerFunction", null);
        setField(term11368, term11368.getClass(), "className", null);
        setField(term11368, term11368.getClass(), "properties", null);
        setBooleanField(term11368, term11368.getClass(), "nativeType", false);
        setField(term11368, term11368.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term11368, term11368.getClass(), "prettyPrint", false);
        setBooleanField(term11368, term11368.getClass(), "visited", false);
        setField(term11368, term11368.getClass(), "docInfo", null);
        setBooleanField(term11368, term11368.getClass(), "unknown", false);
        setBooleanField(term11368, term11368.getClass(), "resolved", false);
        setField(term11368, term11368.getClass(), "resolveResult", null);
        setField(term11368, term11368.getClass(), "registry", null);
        setField(term11337, term11337.getClass(), "prototype", term11368);
        setField(term11337, term11337.getClass(), "kind", enum106);
        setField(term11337, term11337.getClass(), "typeOfThis", null);
        setField(term11337, term11337.getClass(), "source", null);
        setField(term11337, term11337.getClass(), "implementedInterfaces", null);
        setField(term11337, term11337.getClass(), "subTypes", null);
        setField(term11337, term11337.getClass(), "templateTypeName", null);
        setField(term11337, term11337.getClass(), "className", null);
        setField(term11337, term11337.getClass(), "properties", null);
        setBooleanField(term11337, term11337.getClass(), "nativeType", false);
        setField(term11337, term11337.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term11337, term11337.getClass(), "prettyPrint", false);
        setBooleanField(term11337, term11337.getClass(), "visited", false);
        setField(term11337, term11337.getClass(), "docInfo", null);
        setBooleanField(term11337, term11337.getClass(), "unknown", false);
        setBooleanField(term11337, term11337.getClass(), "resolved", false);
        setField(term11337, term11337.getClass(), "resolveResult", null);
        setField(term11337, term11337.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RYdKCNNMBR";
        try {
            callMethod(klass, "isPropertyTypeInferred", argTypes, term11337, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


