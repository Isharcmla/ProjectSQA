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

public class FunctionType_isInstanceType_89498548764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term436;

    public FunctionType_isInstanceType_89498548764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22913 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term22912 = ((Class) term22913).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term22912).setAccessible(true);
        Object enum60 = ((Field) term22912).get((Object) null);
        term436 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term437 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term461 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term467 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setIntField(term438, term438.getClass(), "type", 454281060);
        setIntField(term440, term440.getClass(), "type", 292681826);
        setIntField(term442, term442.getClass(), "type", 0);
        setField(term442, term442.getClass(), "next", null);
        setField(term442, term442.getClass(), "first", null);
        setField(term442, term442.getClass(), "last", null);
        setField(term442, term442.getClass(), "propListHead", null);
        setIntField(term442, term442.getClass(), "sourcePosition", 0);
        setField(term442, term442.getClass(), "jsType", null);
        setField(term442, term442.getClass(), "parent", null);
        setField(term440, term440.getClass(), "next", term442);
        setIntField(term445, term445.getClass(), "type", 0);
        setField(term445, term445.getClass(), "next", null);
        setField(term445, term445.getClass(), "first", null);
        setField(term445, term445.getClass(), "last", null);
        setField(term445, term445.getClass(), "propListHead", null);
        setIntField(term445, term445.getClass(), "sourcePosition", 0);
        setField(term445, term445.getClass(), "jsType", null);
        setField(term445, term445.getClass(), "parent", null);
        setField(term440, term440.getClass(), "first", term445);
        setIntField(term448, term448.getClass(), "type", 0);
        setField(term448, term448.getClass(), "next", null);
        setField(term448, term448.getClass(), "first", null);
        setField(term448, term448.getClass(), "last", null);
        setField(term448, term448.getClass(), "propListHead", null);
        setIntField(term448, term448.getClass(), "sourcePosition", 0);
        setField(term448, term448.getClass(), "jsType", null);
        setField(term448, term448.getClass(), "parent", null);
        setField(term440, term440.getClass(), "last", term448);
        setField(term440, term440.getClass(), "propListHead", null);
        setIntField(term440, term440.getClass(), "sourcePosition", 0);
        setField(term440, term440.getClass(), "jsType", null);
        setField(term440, term440.getClass(), "parent", null);
        setField(term438, term438.getClass(), "next", term440);
        setIntField(term452, term452.getClass(), "type", 0);
        setField(term452, term452.getClass(), "next", null);
        setField(term452, term452.getClass(), "first", null);
        setField(term452, term452.getClass(), "last", null);
        setField(term452, term452.getClass(), "propListHead", null);
        setIntField(term452, term452.getClass(), "sourcePosition", 0);
        setField(term452, term452.getClass(), "jsType", null);
        setField(term452, term452.getClass(), "parent", null);
        setField(term438, term438.getClass(), "first", term452);
        setIntField(term455, term455.getClass(), "type", 0);
        setField(term455, term455.getClass(), "next", null);
        setField(term455, term455.getClass(), "first", null);
        setField(term455, term455.getClass(), "last", null);
        setField(term455, term455.getClass(), "propListHead", null);
        setIntField(term455, term455.getClass(), "sourcePosition", 0);
        setField(term455, term455.getClass(), "jsType", null);
        setField(term455, term455.getClass(), "parent", null);
        setField(term438, term438.getClass(), "last", term455);
        setField(term438, term438.getClass(), "propListHead", null);
        setIntField(term438, term438.getClass(), "sourcePosition", 0);
        setField(term438, term438.getClass(), "jsType", null);
        setField(term438, term438.getClass(), "parent", null);
        setField(term437, term437.getClass(), "parameters", term438);
        setField(term437, term437.getClass(), "returnType", null);
        setBooleanField(term437, term437.getClass(), "returnTypeInferred", false);
        setBooleanField(term437, term437.getClass(), "resolved", false);
        setField(term437, term437.getClass(), "resolveResult", null);
        setField(term437, term437.getClass(), "registry", null);
        setField(term436, term436.getClass(), "call", term437);
        setField(term461, term461.getClass(), "className", null);
        setField(term461, term461.getClass(), "properties", null);
        setBooleanField(term461, term461.getClass(), "nativeType", false);
        setField(term461, term461.getClass(), "implicitPrototypeFallback", null);
        setField(term461, term461.getClass(), "ownerFunction", null);
        setBooleanField(term461, term461.getClass(), "prettyPrint", false);
        setBooleanField(term461, term461.getClass(), "visited", false);
        setField(term461, term461.getClass(), "docInfo", null);
        setBooleanField(term461, term461.getClass(), "unknown", false);
        setBooleanField(term461, term461.getClass(), "resolved", false);
        setField(term461, term461.getClass(), "resolveResult", null);
        setField(term461, term461.getClass(), "registry", null);
        setField(term436, term436.getClass(), "prototype", term461);
        setField(term467, term467.getClass(), "name", null);
        setField(term467, term467.getClass(), "type", null);
        setBooleanField(term467, term467.getClass(), "inferred", false);
        setField(term436, term436.getClass(), "prototypeSlot", term467);
        setField(term436, term436.getClass(), "kind", enum60);
        setField(term436, term436.getClass(), "typeOfThis", null);
        setField(term436, term436.getClass(), "source", null);
        setField(term436, term436.getClass(), "implementedInterfaces", null);
        setField(term436, term436.getClass(), "extendedInterfaces", null);
        setField(term436, term436.getClass(), "subTypes", null);
        setField(term436, term436.getClass(), "templateTypeName", null);
        setField(term436, term436.getClass(), "className", null);
        setField(term436, term436.getClass(), "properties", null);
        setBooleanField(term436, term436.getClass(), "nativeType", false);
        setField(term436, term436.getClass(), "implicitPrototypeFallback", null);
        setField(term436, term436.getClass(), "ownerFunction", null);
        setBooleanField(term436, term436.getClass(), "prettyPrint", false);
        setBooleanField(term436, term436.getClass(), "visited", false);
        setField(term436, term436.getClass(), "docInfo", null);
        setBooleanField(term436, term436.getClass(), "unknown", false);
        setBooleanField(term436, term436.getClass(), "resolved", false);
        setField(term436, term436.getClass(), "resolveResult", null);
        setField(term436, term436.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isInstanceType", argTypes, term436, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


