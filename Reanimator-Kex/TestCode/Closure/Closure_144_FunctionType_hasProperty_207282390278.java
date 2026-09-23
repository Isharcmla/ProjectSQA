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

public class FunctionType_hasProperty_207282390278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9894;

    public FunctionType_hasProperty_207282390278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39401 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term39400 = ((Class) term39401).getDeclaredField((String) "ORDINARY");
        ((Field) term39400).setAccessible(true);
        Object enum103 = ((Field) term39400).get((Object) null);
        term9894 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term9895 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term9896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9909 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9919 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9925 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term9896, term9896.getClass(), "type", 1743683601);
        setIntField(term9898, term9898.getClass(), "type", -936895502);
        setIntField(term9900, term9900.getClass(), "type", 0);
        setField(term9900, term9900.getClass(), "next", null);
        setField(term9900, term9900.getClass(), "first", null);
        setField(term9900, term9900.getClass(), "last", null);
        setField(term9900, term9900.getClass(), "propListHead", null);
        setIntField(term9900, term9900.getClass(), "sourcePosition", 0);
        setField(term9900, term9900.getClass(), "jsType", null);
        setField(term9900, term9900.getClass(), "parent", null);
        setField(term9898, term9898.getClass(), "next", term9900);
        setIntField(term9903, term9903.getClass(), "type", 0);
        setField(term9903, term9903.getClass(), "next", null);
        setField(term9903, term9903.getClass(), "first", null);
        setField(term9903, term9903.getClass(), "last", null);
        setField(term9903, term9903.getClass(), "propListHead", null);
        setIntField(term9903, term9903.getClass(), "sourcePosition", 0);
        setField(term9903, term9903.getClass(), "jsType", null);
        setField(term9903, term9903.getClass(), "parent", null);
        setField(term9898, term9898.getClass(), "first", term9903);
        setIntField(term9906, term9906.getClass(), "type", 0);
        setField(term9906, term9906.getClass(), "next", null);
        setField(term9906, term9906.getClass(), "first", null);
        setField(term9906, term9906.getClass(), "last", null);
        setField(term9906, term9906.getClass(), "propListHead", null);
        setIntField(term9906, term9906.getClass(), "sourcePosition", 0);
        setField(term9906, term9906.getClass(), "jsType", null);
        setField(term9906, term9906.getClass(), "parent", null);
        setField(term9898, term9898.getClass(), "last", term9906);
        setField(term9909, term9909.getClass(), "next", null);
        setIntField(term9909, term9909.getClass(), "type", 0);
        setIntField(term9909, term9909.getClass(), "intValue", 0);
        setField(term9909, term9909.getClass(), "objectValue", null);
        setField(term9898, term9898.getClass(), "propListHead", term9909);
        setIntField(term9898, term9898.getClass(), "sourcePosition", -129547140);
        setField(term9898, term9898.getClass(), "jsType", null);
        setField(term9898, term9898.getClass(), "parent", null);
        setField(term9896, term9896.getClass(), "next", term9898);
        setIntField(term9913, term9913.getClass(), "type", 0);
        setField(term9913, term9913.getClass(), "next", null);
        setField(term9913, term9913.getClass(), "first", null);
        setField(term9913, term9913.getClass(), "last", null);
        setField(term9913, term9913.getClass(), "propListHead", null);
        setIntField(term9913, term9913.getClass(), "sourcePosition", 0);
        setField(term9913, term9913.getClass(), "jsType", null);
        setField(term9913, term9913.getClass(), "parent", null);
        setField(term9896, term9896.getClass(), "first", term9913);
        setIntField(term9916, term9916.getClass(), "type", 0);
        setField(term9916, term9916.getClass(), "next", null);
        setField(term9916, term9916.getClass(), "first", null);
        setField(term9916, term9916.getClass(), "last", null);
        setField(term9916, term9916.getClass(), "propListHead", null);
        setIntField(term9916, term9916.getClass(), "sourcePosition", 0);
        setField(term9916, term9916.getClass(), "jsType", null);
        setField(term9916, term9916.getClass(), "parent", null);
        setField(term9896, term9896.getClass(), "last", term9916);
        setField(term9919, term9919.getClass(), "next", null);
        setIntField(term9919, term9919.getClass(), "type", 0);
        setIntField(term9919, term9919.getClass(), "intValue", 0);
        setField(term9919, term9919.getClass(), "objectValue", null);
        setField(term9896, term9896.getClass(), "propListHead", term9919);
        setIntField(term9896, term9896.getClass(), "sourcePosition", 199287428);
        setField(term9896, term9896.getClass(), "jsType", null);
        setField(term9896, term9896.getClass(), "parent", null);
        setField(term9895, term9895.getClass(), "parameters", term9896);
        setField(term9895, term9895.getClass(), "returnType", null);
        setBooleanField(term9895, term9895.getClass(), "returnTypeInferred", false);
        setBooleanField(term9895, term9895.getClass(), "resolved", false);
        setField(term9895, term9895.getClass(), "resolveResult", null);
        setField(term9895, term9895.getClass(), "registry", null);
        setField(term9894, term9894.getClass(), "call", term9895);
        setField(term9925, term9925.getClass(), "ownerFunction", null);
        setField(term9925, term9925.getClass(), "className", null);
        setField(term9925, term9925.getClass(), "properties", null);
        setField(term9925, term9925.getClass(), "implicitPrototype", null);
        setBooleanField(term9925, term9925.getClass(), "nativeType", false);
        setBooleanField(term9925, term9925.getClass(), "prettyPrint", false);
        setBooleanField(term9925, term9925.getClass(), "visited", false);
        setField(term9925, term9925.getClass(), "docInfo", null);
        setBooleanField(term9925, term9925.getClass(), "unknown", false);
        setBooleanField(term9925, term9925.getClass(), "resolved", false);
        setField(term9925, term9925.getClass(), "resolveResult", null);
        setField(term9925, term9925.getClass(), "registry", null);
        setField(term9894, term9894.getClass(), "prototype", term9925);
        setField(term9894, term9894.getClass(), "kind", enum103);
        setField(term9894, term9894.getClass(), "typeOfThis", null);
        setField(term9894, term9894.getClass(), "source", null);
        setField(term9894, term9894.getClass(), "implementedInterfaces", null);
        setField(term9894, term9894.getClass(), "subTypes", null);
        setField(term9894, term9894.getClass(), "templateTypeName", null);
        setField(term9894, term9894.getClass(), "className", null);
        setField(term9894, term9894.getClass(), "properties", null);
        setField(term9894, term9894.getClass(), "implicitPrototype", null);
        setBooleanField(term9894, term9894.getClass(), "nativeType", false);
        setBooleanField(term9894, term9894.getClass(), "prettyPrint", false);
        setBooleanField(term9894, term9894.getClass(), "visited", false);
        setField(term9894, term9894.getClass(), "docInfo", null);
        setBooleanField(term9894, term9894.getClass(), "unknown", false);
        setBooleanField(term9894, term9894.getClass(), "resolved", false);
        setField(term9894, term9894.getClass(), "resolveResult", null);
        setField(term9894, term9894.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FPvxVzzSvD";
        try {
            callMethod(klass, "hasProperty", argTypes, term9894, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


