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

public class FunctionType_isSubtype_210100215895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16360;

    public FunctionType_isSubtype_210100215895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50954 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term50953 = ((Class) term50954).getDeclaredField((String) "ORDINARY");
        ((Field) term50953).setAccessible(true);
        Object enum129 = ((Field) term50953).get((Object) null);
        term16360 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term16361 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term16362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16375 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term16379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16385 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term16391 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term16362, term16362.getClass(), "type", -525570815);
        setIntField(term16364, term16364.getClass(), "type", 1168633950);
        setIntField(term16366, term16366.getClass(), "type", 0);
        setField(term16366, term16366.getClass(), "next", null);
        setField(term16366, term16366.getClass(), "first", null);
        setField(term16366, term16366.getClass(), "last", null);
        setField(term16366, term16366.getClass(), "propListHead", null);
        setIntField(term16366, term16366.getClass(), "sourcePosition", 0);
        setField(term16366, term16366.getClass(), "jsType", null);
        setField(term16366, term16366.getClass(), "parent", null);
        setField(term16364, term16364.getClass(), "next", term16366);
        setIntField(term16369, term16369.getClass(), "type", 0);
        setField(term16369, term16369.getClass(), "next", null);
        setField(term16369, term16369.getClass(), "first", null);
        setField(term16369, term16369.getClass(), "last", null);
        setField(term16369, term16369.getClass(), "propListHead", null);
        setIntField(term16369, term16369.getClass(), "sourcePosition", 0);
        setField(term16369, term16369.getClass(), "jsType", null);
        setField(term16369, term16369.getClass(), "parent", null);
        setField(term16364, term16364.getClass(), "first", term16369);
        setIntField(term16372, term16372.getClass(), "type", 0);
        setField(term16372, term16372.getClass(), "next", null);
        setField(term16372, term16372.getClass(), "first", null);
        setField(term16372, term16372.getClass(), "last", null);
        setField(term16372, term16372.getClass(), "propListHead", null);
        setIntField(term16372, term16372.getClass(), "sourcePosition", 0);
        setField(term16372, term16372.getClass(), "jsType", null);
        setField(term16372, term16372.getClass(), "parent", null);
        setField(term16364, term16364.getClass(), "last", term16372);
        setField(term16375, term16375.getClass(), "next", null);
        setIntField(term16375, term16375.getClass(), "type", 0);
        setIntField(term16375, term16375.getClass(), "intValue", 0);
        setField(term16375, term16375.getClass(), "objectValue", null);
        setField(term16364, term16364.getClass(), "propListHead", term16375);
        setIntField(term16364, term16364.getClass(), "sourcePosition", 1607082164);
        setField(term16364, term16364.getClass(), "jsType", null);
        setField(term16364, term16364.getClass(), "parent", null);
        setField(term16362, term16362.getClass(), "next", term16364);
        setIntField(term16379, term16379.getClass(), "type", 0);
        setField(term16379, term16379.getClass(), "next", null);
        setField(term16379, term16379.getClass(), "first", null);
        setField(term16379, term16379.getClass(), "last", null);
        setField(term16379, term16379.getClass(), "propListHead", null);
        setIntField(term16379, term16379.getClass(), "sourcePosition", 0);
        setField(term16379, term16379.getClass(), "jsType", null);
        setField(term16379, term16379.getClass(), "parent", null);
        setField(term16362, term16362.getClass(), "first", term16379);
        setIntField(term16382, term16382.getClass(), "type", 0);
        setField(term16382, term16382.getClass(), "next", null);
        setField(term16382, term16382.getClass(), "first", null);
        setField(term16382, term16382.getClass(), "last", null);
        setField(term16382, term16382.getClass(), "propListHead", null);
        setIntField(term16382, term16382.getClass(), "sourcePosition", 0);
        setField(term16382, term16382.getClass(), "jsType", null);
        setField(term16382, term16382.getClass(), "parent", null);
        setField(term16362, term16362.getClass(), "last", term16382);
        setField(term16385, term16385.getClass(), "next", null);
        setIntField(term16385, term16385.getClass(), "type", 0);
        setIntField(term16385, term16385.getClass(), "intValue", 0);
        setField(term16385, term16385.getClass(), "objectValue", null);
        setField(term16362, term16362.getClass(), "propListHead", term16385);
        setIntField(term16362, term16362.getClass(), "sourcePosition", 1890399366);
        setField(term16362, term16362.getClass(), "jsType", null);
        setField(term16362, term16362.getClass(), "parent", null);
        setField(term16361, term16361.getClass(), "parameters", term16362);
        setField(term16361, term16361.getClass(), "returnType", null);
        setBooleanField(term16361, term16361.getClass(), "returnTypeInferred", false);
        setBooleanField(term16361, term16361.getClass(), "resolved", false);
        setField(term16361, term16361.getClass(), "resolveResult", null);
        setField(term16361, term16361.getClass(), "registry", null);
        setField(term16360, term16360.getClass(), "call", term16361);
        setField(term16391, term16391.getClass(), "ownerFunction", null);
        setField(term16391, term16391.getClass(), "className", null);
        setField(term16391, term16391.getClass(), "properties", null);
        setField(term16391, term16391.getClass(), "implicitPrototype", null);
        setBooleanField(term16391, term16391.getClass(), "nativeType", false);
        setBooleanField(term16391, term16391.getClass(), "prettyPrint", false);
        setBooleanField(term16391, term16391.getClass(), "visited", false);
        setField(term16391, term16391.getClass(), "docInfo", null);
        setBooleanField(term16391, term16391.getClass(), "unknown", false);
        setBooleanField(term16391, term16391.getClass(), "resolved", false);
        setField(term16391, term16391.getClass(), "resolveResult", null);
        setField(term16391, term16391.getClass(), "registry", null);
        setField(term16360, term16360.getClass(), "prototype", term16391);
        setField(term16360, term16360.getClass(), "kind", enum129);
        setField(term16360, term16360.getClass(), "typeOfThis", null);
        setField(term16360, term16360.getClass(), "source", null);
        setField(term16360, term16360.getClass(), "implementedInterfaces", null);
        setField(term16360, term16360.getClass(), "subTypes", null);
        setField(term16360, term16360.getClass(), "templateTypeName", null);
        setField(term16360, term16360.getClass(), "className", null);
        setField(term16360, term16360.getClass(), "properties", null);
        setField(term16360, term16360.getClass(), "implicitPrototype", null);
        setBooleanField(term16360, term16360.getClass(), "nativeType", false);
        setBooleanField(term16360, term16360.getClass(), "prettyPrint", false);
        setBooleanField(term16360, term16360.getClass(), "visited", false);
        setField(term16360, term16360.getClass(), "docInfo", null);
        setBooleanField(term16360, term16360.getClass(), "unknown", false);
        setBooleanField(term16360, term16360.getClass(), "resolved", false);
        setField(term16360, term16360.getClass(), "resolveResult", null);
        setField(term16360, term16360.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "isSubtype", argTypes, term16360, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


