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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.LinkedList;

public class FunctionType_setExtendedInterfaces_796243139109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23047;
     Object term23103;

    public FunctionType_setExtendedInterfaces_796243139109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term92258 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term92257 = ((Class) term92258).getDeclaredField((String) "ORDINARY");
        ((Field) term92257).setAccessible(true);
        Object enum262 = ((Field) term92257).get((Object) null);
        Class<? extends Object> term92549 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term92548 = ((Class) term92549).getDeclaredField((String) "ANY");
        ((Field) term92548).setAccessible(true);
        Object enum263 = ((Field) term92548).get((Object) null);
        term23047 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term23048 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term23049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23076 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term23049, term23049.getClass(), "type", -1813280137);
        setIntField(term23051, term23051.getClass(), "type", 719656595);
        setIntField(term23053, term23053.getClass(), "type", -1516995753);
        setField(term23053, term23053.getClass(), "next", null);
        setField(term23053, term23053.getClass(), "first", null);
        setField(term23053, term23053.getClass(), "last", null);
        setField(term23053, term23053.getClass(), "propListHead", null);
        setIntField(term23053, term23053.getClass(), "sourcePosition", 0);
        setField(term23053, term23053.getClass(), "jsType", null);
        setField(term23053, term23053.getClass(), "parent", null);
        setField(term23051, term23051.getClass(), "next", term23053);
        setIntField(term23056, term23056.getClass(), "type", 0);
        setField(term23056, term23056.getClass(), "next", null);
        setField(term23056, term23056.getClass(), "first", null);
        setField(term23056, term23056.getClass(), "last", null);
        setField(term23056, term23056.getClass(), "propListHead", null);
        setIntField(term23056, term23056.getClass(), "sourcePosition", 0);
        setField(term23056, term23056.getClass(), "jsType", null);
        setField(term23056, term23056.getClass(), "parent", null);
        setField(term23051, term23051.getClass(), "first", term23056);
        setIntField(term23059, term23059.getClass(), "type", -938508470);
        setField(term23059, term23059.getClass(), "next", null);
        setField(term23059, term23059.getClass(), "first", term23056);
        setField(term23059, term23059.getClass(), "last", term23059);
        setField(term23059, term23059.getClass(), "propListHead", null);
        setIntField(term23059, term23059.getClass(), "sourcePosition", 0);
        setField(term23059, term23059.getClass(), "jsType", null);
        setField(term23059, term23059.getClass(), "parent", null);
        setField(term23051, term23051.getClass(), "last", term23059);
        setField(term23051, term23051.getClass(), "propListHead", null);
        setIntField(term23051, term23051.getClass(), "sourcePosition", 0);
        setField(term23051, term23051.getClass(), "jsType", null);
        setField(term23051, term23051.getClass(), "parent", null);
        setField(term23049, term23049.getClass(), "next", term23051);
        setIntField(term23063, term23063.getClass(), "type", 1116576792);
        setIntField(term23065, term23065.getClass(), "type", -942194446);
        setField(term23065, term23065.getClass(), "next", term23059);
        setField(term23065, term23065.getClass(), "first", null);
        setField(term23065, term23065.getClass(), "last", term23049);
        setField(term23065, term23065.getClass(), "propListHead", null);
        setIntField(term23065, term23065.getClass(), "sourcePosition", 0);
        setField(term23065, term23065.getClass(), "jsType", null);
        setField(term23065, term23065.getClass(), "parent", null);
        setField(term23063, term23063.getClass(), "next", term23065);
        setField(term23063, term23063.getClass(), "first", term23063);
        setIntField(term23068, term23068.getClass(), "type", -390501023);
        setField(term23068, term23068.getClass(), "next", null);
        setField(term23068, term23068.getClass(), "first", term23056);
        setField(term23068, term23068.getClass(), "last", term23059);
        setField(term23068, term23068.getClass(), "propListHead", null);
        setIntField(term23068, term23068.getClass(), "sourcePosition", 0);
        setField(term23068, term23068.getClass(), "jsType", null);
        setField(term23068, term23068.getClass(), "parent", null);
        setField(term23063, term23063.getClass(), "last", term23068);
        setField(term23063, term23063.getClass(), "propListHead", null);
        setIntField(term23063, term23063.getClass(), "sourcePosition", 0);
        setField(term23063, term23063.getClass(), "jsType", null);
        setField(term23063, term23063.getClass(), "parent", null);
        setField(term23049, term23049.getClass(), "first", term23063);
        setField(term23049, term23049.getClass(), "last", term23053);
        setField(term23049, term23049.getClass(), "propListHead", null);
        setIntField(term23049, term23049.getClass(), "sourcePosition", 0);
        setField(term23049, term23049.getClass(), "jsType", null);
        setField(term23049, term23049.getClass(), "parent", null);
        setField(term23048, term23048.getClass(), "parameters", term23049);
        setField(term23048, term23048.getClass(), "returnType", null);
        setBooleanField(term23048, term23048.getClass(), "returnTypeInferred", false);
        setBooleanField(term23048, term23048.getClass(), "resolved", false);
        setField(term23048, term23048.getClass(), "resolveResult", null);
        setBooleanField(term23048, term23048.getClass(), "inTemplatedCheckVisit", false);
        setField(term23048, term23048.getClass(), "registry", null);
        setField(term23047, term23047.getClass(), "call", term23048);
        setField(term23076, term23076.getClass(), "name", null);
        setField(term23076, term23076.getClass(), "type", null);
        setBooleanField(term23076, term23076.getClass(), "inferred", false);
        setField(term23076, term23076.getClass(), "propertyNode", null);
        setField(term23076, term23076.getClass(), "docInfo", null);
        setField(term23047, term23047.getClass(), "prototypeSlot", term23076);
        setField(term23047, term23047.getClass(), "kind", enum262);
        setField(term23047, term23047.getClass(), "propAccess", enum263);
        setField(term23047, term23047.getClass(), "typeOfThis", null);
        setField(term23047, term23047.getClass(), "source", null);
        setField(term23047, term23047.getClass(), "implementedInterfaces", null);
        setField(term23047, term23047.getClass(), "extendedInterfaces", null);
        setField(term23047, term23047.getClass(), "subTypes", null);
        setField(term23047, term23047.getClass(), "templateTypeNames", null);
        setField(term23047, term23047.getClass(), "className", null);
        setField(term23047, term23047.getClass(), "properties", null);
        setBooleanField(term23047, term23047.getClass(), "nativeType", false);
        setField(term23047, term23047.getClass(), "implicitPrototypeFallback", null);
        setField(term23047, term23047.getClass(), "ownerFunction", null);
        setBooleanField(term23047, term23047.getClass(), "prettyPrint", false);
        setBooleanField(term23047, term23047.getClass(), "visited", false);
        setField(term23047, term23047.getClass(), "docInfo", null);
        setBooleanField(term23047, term23047.getClass(), "unknown", false);
        setBooleanField(term23047, term23047.getClass(), "resolved", false);
        setField(term23047, term23047.getClass(), "resolveResult", null);
        setBooleanField(term23047, term23047.getClass(), "inTemplatedCheckVisit", false);
        setField(term23047, term23047.getClass(), "registry", null);
        term23103 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term23103;
        try {
            callMethod(klass, "setExtendedInterfaces", argTypes, term23047, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


