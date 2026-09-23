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

public class FunctionType_getSuperClassConstructor_1927670470155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29088;

    public FunctionType_getSuperClassConstructor_1927670470155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term179100 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term179099 = ((Class) term179100).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term179099).setAccessible(true);
        Object enum305 = ((Field) term179099).get((Object) null);
        Class<? extends Object> term179400 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term179399 = ((Class) term179400).getDeclaredField((String) "STRUCT");
        ((Field) term179399).setAccessible(true);
        Object enum306 = ((Field) term179399).get((Object) null);
        term29088 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term29089 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term29090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29117 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term29090, term29090.getClass(), "type", 1374790203);
        setIntField(term29092, term29092.getClass(), "type", 1160010161);
        setIntField(term29094, term29094.getClass(), "type", -423900705);
        setField(term29094, term29094.getClass(), "next", null);
        setField(term29094, term29094.getClass(), "first", null);
        setField(term29094, term29094.getClass(), "last", null);
        setField(term29094, term29094.getClass(), "propListHead", null);
        setIntField(term29094, term29094.getClass(), "sourcePosition", 0);
        setField(term29094, term29094.getClass(), "jsType", null);
        setField(term29094, term29094.getClass(), "parent", null);
        setField(term29092, term29092.getClass(), "next", term29094);
        setIntField(term29097, term29097.getClass(), "type", 0);
        setField(term29097, term29097.getClass(), "next", null);
        setField(term29097, term29097.getClass(), "first", null);
        setField(term29097, term29097.getClass(), "last", null);
        setField(term29097, term29097.getClass(), "propListHead", null);
        setIntField(term29097, term29097.getClass(), "sourcePosition", 0);
        setField(term29097, term29097.getClass(), "jsType", null);
        setField(term29097, term29097.getClass(), "parent", null);
        setField(term29092, term29092.getClass(), "first", term29097);
        setIntField(term29100, term29100.getClass(), "type", 1168633950);
        setField(term29100, term29100.getClass(), "next", null);
        setField(term29100, term29100.getClass(), "first", term29097);
        setField(term29100, term29100.getClass(), "last", term29100);
        setField(term29100, term29100.getClass(), "propListHead", null);
        setIntField(term29100, term29100.getClass(), "sourcePosition", 0);
        setField(term29100, term29100.getClass(), "jsType", null);
        setField(term29100, term29100.getClass(), "parent", null);
        setField(term29092, term29092.getClass(), "last", term29100);
        setField(term29092, term29092.getClass(), "propListHead", null);
        setIntField(term29092, term29092.getClass(), "sourcePosition", 0);
        setField(term29092, term29092.getClass(), "jsType", null);
        setField(term29092, term29092.getClass(), "parent", null);
        setField(term29090, term29090.getClass(), "next", term29092);
        setIntField(term29104, term29104.getClass(), "type", -19246901);
        setIntField(term29106, term29106.getClass(), "type", -370828664);
        setField(term29106, term29106.getClass(), "next", term29100);
        setField(term29106, term29106.getClass(), "first", null);
        setField(term29106, term29106.getClass(), "last", term29090);
        setField(term29106, term29106.getClass(), "propListHead", null);
        setIntField(term29106, term29106.getClass(), "sourcePosition", 0);
        setField(term29106, term29106.getClass(), "jsType", null);
        setField(term29106, term29106.getClass(), "parent", null);
        setField(term29104, term29104.getClass(), "next", term29106);
        setField(term29104, term29104.getClass(), "first", term29104);
        setIntField(term29109, term29109.getClass(), "type", -525570815);
        setField(term29109, term29109.getClass(), "next", null);
        setField(term29109, term29109.getClass(), "first", term29097);
        setField(term29109, term29109.getClass(), "last", term29100);
        setField(term29109, term29109.getClass(), "propListHead", null);
        setIntField(term29109, term29109.getClass(), "sourcePosition", 0);
        setField(term29109, term29109.getClass(), "jsType", null);
        setField(term29109, term29109.getClass(), "parent", null);
        setField(term29104, term29104.getClass(), "last", term29109);
        setField(term29104, term29104.getClass(), "propListHead", null);
        setIntField(term29104, term29104.getClass(), "sourcePosition", 0);
        setField(term29104, term29104.getClass(), "jsType", null);
        setField(term29104, term29104.getClass(), "parent", null);
        setField(term29090, term29090.getClass(), "first", term29104);
        setField(term29090, term29090.getClass(), "last", term29094);
        setField(term29090, term29090.getClass(), "propListHead", null);
        setIntField(term29090, term29090.getClass(), "sourcePosition", 0);
        setField(term29090, term29090.getClass(), "jsType", null);
        setField(term29090, term29090.getClass(), "parent", null);
        setField(term29089, term29089.getClass(), "parameters", term29090);
        setField(term29089, term29089.getClass(), "returnType", null);
        setBooleanField(term29089, term29089.getClass(), "returnTypeInferred", false);
        setBooleanField(term29089, term29089.getClass(), "resolved", false);
        setField(term29089, term29089.getClass(), "resolveResult", null);
        setBooleanField(term29089, term29089.getClass(), "inTemplatedCheckVisit", false);
        setField(term29089, term29089.getClass(), "registry", null);
        setField(term29088, term29088.getClass(), "call", term29089);
        setField(term29117, term29117.getClass(), "name", null);
        setField(term29117, term29117.getClass(), "type", null);
        setBooleanField(term29117, term29117.getClass(), "inferred", false);
        setField(term29117, term29117.getClass(), "propertyNode", null);
        setField(term29117, term29117.getClass(), "docInfo", null);
        setField(term29088, term29088.getClass(), "prototypeSlot", term29117);
        setField(term29088, term29088.getClass(), "kind", enum305);
        setField(term29088, term29088.getClass(), "propAccess", enum306);
        setField(term29088, term29088.getClass(), "typeOfThis", null);
        setField(term29088, term29088.getClass(), "source", null);
        setField(term29088, term29088.getClass(), "implementedInterfaces", null);
        setField(term29088, term29088.getClass(), "extendedInterfaces", null);
        setField(term29088, term29088.getClass(), "subTypes", null);
        setField(term29088, term29088.getClass(), "templateTypeNames", null);
        setField(term29088, term29088.getClass(), "className", null);
        setField(term29088, term29088.getClass(), "properties", null);
        setBooleanField(term29088, term29088.getClass(), "nativeType", false);
        setField(term29088, term29088.getClass(), "implicitPrototypeFallback", null);
        setField(term29088, term29088.getClass(), "ownerFunction", null);
        setBooleanField(term29088, term29088.getClass(), "prettyPrint", false);
        setBooleanField(term29088, term29088.getClass(), "visited", false);
        setField(term29088, term29088.getClass(), "docInfo", null);
        setBooleanField(term29088, term29088.getClass(), "unknown", false);
        setBooleanField(term29088, term29088.getClass(), "resolved", false);
        setField(term29088, term29088.getClass(), "resolveResult", null);
        setBooleanField(term29088, term29088.getClass(), "inTemplatedCheckVisit", false);
        setField(term29088, term29088.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getSuperClassConstructor", argTypes, term29088, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


