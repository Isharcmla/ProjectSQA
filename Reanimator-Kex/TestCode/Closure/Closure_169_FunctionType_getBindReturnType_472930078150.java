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
import java.lang.StackOverflowError;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class FunctionType_getBindReturnType_472930078150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24402;
     Object term24458;

    public FunctionType_getBindReturnType_472930078150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term170508 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term170507 = ((Class) term170508).getDeclaredField((String) "ORDINARY");
        ((Field) term170507).setAccessible(true);
        Object enum283 = ((Field) term170507).get((Object) null);
        Class<? extends Object> term170799 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term170798 = ((Class) term170799).getDeclaredField((String) "ANY");
        ((Field) term170798).setAccessible(true);
        Object enum284 = ((Field) term170798).get((Object) null);
        term24402 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term24403 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term24404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24431 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term24404, term24404.getClass(), "type", 1146601902);
        setIntField(term24406, term24406.getClass(), "type", -1938881385);
        setIntField(term24408, term24408.getClass(), "type", -1629418973);
        setField(term24408, term24408.getClass(), "next", null);
        setField(term24408, term24408.getClass(), "first", null);
        setField(term24408, term24408.getClass(), "last", null);
        setField(term24408, term24408.getClass(), "propListHead", null);
        setIntField(term24408, term24408.getClass(), "sourcePosition", 0);
        setField(term24408, term24408.getClass(), "jsType", null);
        setField(term24408, term24408.getClass(), "parent", null);
        setField(term24406, term24406.getClass(), "next", term24408);
        setIntField(term24411, term24411.getClass(), "type", 0);
        setField(term24411, term24411.getClass(), "next", null);
        setField(term24411, term24411.getClass(), "first", null);
        setField(term24411, term24411.getClass(), "last", null);
        setField(term24411, term24411.getClass(), "propListHead", null);
        setIntField(term24411, term24411.getClass(), "sourcePosition", 0);
        setField(term24411, term24411.getClass(), "jsType", null);
        setField(term24411, term24411.getClass(), "parent", null);
        setField(term24406, term24406.getClass(), "first", term24411);
        setIntField(term24414, term24414.getClass(), "type", -233024044);
        setField(term24414, term24414.getClass(), "next", null);
        setField(term24414, term24414.getClass(), "first", term24411);
        setField(term24414, term24414.getClass(), "last", term24414);
        setField(term24414, term24414.getClass(), "propListHead", null);
        setIntField(term24414, term24414.getClass(), "sourcePosition", 0);
        setField(term24414, term24414.getClass(), "jsType", null);
        setField(term24414, term24414.getClass(), "parent", null);
        setField(term24406, term24406.getClass(), "last", term24414);
        setField(term24406, term24406.getClass(), "propListHead", null);
        setIntField(term24406, term24406.getClass(), "sourcePosition", 0);
        setField(term24406, term24406.getClass(), "jsType", null);
        setField(term24406, term24406.getClass(), "parent", null);
        setField(term24404, term24404.getClass(), "next", term24406);
        setIntField(term24418, term24418.getClass(), "type", -350454594);
        setIntField(term24420, term24420.getClass(), "type", -1148142995);
        setField(term24420, term24420.getClass(), "next", term24414);
        setField(term24420, term24420.getClass(), "first", null);
        setField(term24420, term24420.getClass(), "last", term24404);
        setField(term24420, term24420.getClass(), "propListHead", null);
        setIntField(term24420, term24420.getClass(), "sourcePosition", 0);
        setField(term24420, term24420.getClass(), "jsType", null);
        setField(term24420, term24420.getClass(), "parent", null);
        setField(term24418, term24418.getClass(), "next", term24420);
        setField(term24418, term24418.getClass(), "first", term24418);
        setIntField(term24423, term24423.getClass(), "type", -100825168);
        setField(term24423, term24423.getClass(), "next", null);
        setField(term24423, term24423.getClass(), "first", term24411);
        setField(term24423, term24423.getClass(), "last", term24414);
        setField(term24423, term24423.getClass(), "propListHead", null);
        setIntField(term24423, term24423.getClass(), "sourcePosition", 0);
        setField(term24423, term24423.getClass(), "jsType", null);
        setField(term24423, term24423.getClass(), "parent", null);
        setField(term24418, term24418.getClass(), "last", term24423);
        setField(term24418, term24418.getClass(), "propListHead", null);
        setIntField(term24418, term24418.getClass(), "sourcePosition", 0);
        setField(term24418, term24418.getClass(), "jsType", null);
        setField(term24418, term24418.getClass(), "parent", null);
        setField(term24404, term24404.getClass(), "first", term24418);
        setField(term24404, term24404.getClass(), "last", term24408);
        setField(term24404, term24404.getClass(), "propListHead", null);
        setIntField(term24404, term24404.getClass(), "sourcePosition", 0);
        setField(term24404, term24404.getClass(), "jsType", null);
        setField(term24404, term24404.getClass(), "parent", null);
        setField(term24403, term24403.getClass(), "parameters", term24404);
        setField(term24403, term24403.getClass(), "returnType", null);
        setBooleanField(term24403, term24403.getClass(), "returnTypeInferred", false);
        setBooleanField(term24403, term24403.getClass(), "resolved", false);
        setField(term24403, term24403.getClass(), "resolveResult", null);
        setBooleanField(term24403, term24403.getClass(), "inTemplatedCheckVisit", false);
        setField(term24403, term24403.getClass(), "registry", null);
        setField(term24402, term24402.getClass(), "call", term24403);
        setField(term24431, term24431.getClass(), "name", null);
        setField(term24431, term24431.getClass(), "type", null);
        setBooleanField(term24431, term24431.getClass(), "inferred", false);
        setField(term24431, term24431.getClass(), "propertyNode", null);
        setField(term24431, term24431.getClass(), "docInfo", null);
        setField(term24402, term24402.getClass(), "prototypeSlot", term24431);
        setField(term24402, term24402.getClass(), "kind", enum283);
        setField(term24402, term24402.getClass(), "propAccess", enum284);
        setField(term24402, term24402.getClass(), "typeOfThis", null);
        setField(term24402, term24402.getClass(), "source", null);
        setField(term24402, term24402.getClass(), "implementedInterfaces", null);
        setField(term24402, term24402.getClass(), "extendedInterfaces", null);
        setField(term24402, term24402.getClass(), "subTypes", null);
        setField(term24402, term24402.getClass(), "templateTypeNames", null);
        setField(term24402, term24402.getClass(), "className", null);
        setField(term24402, term24402.getClass(), "properties", null);
        setBooleanField(term24402, term24402.getClass(), "nativeType", false);
        setField(term24402, term24402.getClass(), "implicitPrototypeFallback", null);
        setField(term24402, term24402.getClass(), "ownerFunction", null);
        setBooleanField(term24402, term24402.getClass(), "prettyPrint", false);
        setBooleanField(term24402, term24402.getClass(), "visited", false);
        setField(term24402, term24402.getClass(), "docInfo", null);
        setBooleanField(term24402, term24402.getClass(), "unknown", false);
        setBooleanField(term24402, term24402.getClass(), "resolved", false);
        setField(term24402, term24402.getClass(), "resolveResult", null);
        setBooleanField(term24402, term24402.getClass(), "inTemplatedCheckVisit", false);
        setField(term24402, term24402.getClass(), "registry", null);
        term24458 = new Integer(1820784228);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term24458;
        try {
            callMethod(klass, "getBindReturnType", argTypes, term24402, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


