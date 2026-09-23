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

public class FunctionType_getAllImplementedInterfaces_57268353369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8090;

    public FunctionType_getAllImplementedInterfaces_57268353369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33833 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term33832 = ((Class) term33833).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term33832).setAccessible(true);
        Object enum85 = ((Field) term33832).get((Object) null);
        term8090 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8091 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term8092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8105 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8115 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8120 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term8092, term8092.getClass(), "type", 199287428);
        setIntField(term8094, term8094.getClass(), "type", 1745276158);
        setIntField(term8096, term8096.getClass(), "type", 0);
        setField(term8096, term8096.getClass(), "next", null);
        setField(term8096, term8096.getClass(), "first", null);
        setField(term8096, term8096.getClass(), "last", null);
        setField(term8096, term8096.getClass(), "propListHead", null);
        setIntField(term8096, term8096.getClass(), "sourcePosition", 0);
        setField(term8096, term8096.getClass(), "jsType", null);
        setField(term8096, term8096.getClass(), "parent", null);
        setField(term8094, term8094.getClass(), "next", term8096);
        setIntField(term8099, term8099.getClass(), "type", 0);
        setField(term8099, term8099.getClass(), "next", null);
        setField(term8099, term8099.getClass(), "first", null);
        setField(term8099, term8099.getClass(), "last", null);
        setField(term8099, term8099.getClass(), "propListHead", null);
        setIntField(term8099, term8099.getClass(), "sourcePosition", 0);
        setField(term8099, term8099.getClass(), "jsType", null);
        setField(term8099, term8099.getClass(), "parent", null);
        setField(term8094, term8094.getClass(), "first", term8099);
        setIntField(term8102, term8102.getClass(), "type", 0);
        setField(term8102, term8102.getClass(), "next", null);
        setField(term8102, term8102.getClass(), "first", null);
        setField(term8102, term8102.getClass(), "last", null);
        setField(term8102, term8102.getClass(), "propListHead", null);
        setIntField(term8102, term8102.getClass(), "sourcePosition", 0);
        setField(term8102, term8102.getClass(), "jsType", null);
        setField(term8102, term8102.getClass(), "parent", null);
        setField(term8094, term8094.getClass(), "last", term8102);
        setField(term8105, term8105.getClass(), "next", null);
        setIntField(term8105, term8105.getClass(), "type", 0);
        setIntField(term8105, term8105.getClass(), "intValue", 0);
        setField(term8105, term8105.getClass(), "objectValue", null);
        setField(term8094, term8094.getClass(), "propListHead", term8105);
        setIntField(term8094, term8094.getClass(), "sourcePosition", 2009020256);
        setField(term8094, term8094.getClass(), "jsType", null);
        setField(term8094, term8094.getClass(), "parent", null);
        setField(term8092, term8092.getClass(), "next", term8094);
        setIntField(term8109, term8109.getClass(), "type", 0);
        setField(term8109, term8109.getClass(), "next", null);
        setField(term8109, term8109.getClass(), "first", null);
        setField(term8109, term8109.getClass(), "last", null);
        setField(term8109, term8109.getClass(), "propListHead", null);
        setIntField(term8109, term8109.getClass(), "sourcePosition", 0);
        setField(term8109, term8109.getClass(), "jsType", null);
        setField(term8109, term8109.getClass(), "parent", null);
        setField(term8092, term8092.getClass(), "first", term8109);
        setIntField(term8112, term8112.getClass(), "type", 0);
        setField(term8112, term8112.getClass(), "next", null);
        setField(term8112, term8112.getClass(), "first", null);
        setField(term8112, term8112.getClass(), "last", null);
        setField(term8112, term8112.getClass(), "propListHead", null);
        setIntField(term8112, term8112.getClass(), "sourcePosition", 0);
        setField(term8112, term8112.getClass(), "jsType", null);
        setField(term8112, term8112.getClass(), "parent", null);
        setField(term8092, term8092.getClass(), "last", term8112);
        setField(term8115, term8115.getClass(), "next", null);
        setIntField(term8115, term8115.getClass(), "type", 0);
        setIntField(term8115, term8115.getClass(), "intValue", 0);
        setField(term8115, term8115.getClass(), "objectValue", null);
        setField(term8092, term8092.getClass(), "propListHead", term8115);
        setIntField(term8092, term8092.getClass(), "sourcePosition", 2049577015);
        setField(term8092, term8092.getClass(), "jsType", null);
        setField(term8092, term8092.getClass(), "parent", null);
        setField(term8091, term8091.getClass(), "parameters", term8092);
        setField(term8091, term8091.getClass(), "returnType", null);
        setBooleanField(term8091, term8091.getClass(), "resolved", false);
        setField(term8091, term8091.getClass(), "resolveResult", null);
        setField(term8091, term8091.getClass(), "registry", null);
        setField(term8090, term8090.getClass(), "call", term8091);
        setField(term8120, term8120.getClass(), "ownerFunction", null);
        setField(term8120, term8120.getClass(), "className", null);
        setField(term8120, term8120.getClass(), "properties", null);
        setField(term8120, term8120.getClass(), "implicitPrototype", null);
        setBooleanField(term8120, term8120.getClass(), "nativeType", false);
        setBooleanField(term8120, term8120.getClass(), "visited", false);
        setField(term8120, term8120.getClass(), "docInfo", null);
        setBooleanField(term8120, term8120.getClass(), "unknown", false);
        setBooleanField(term8120, term8120.getClass(), "resolved", false);
        setField(term8120, term8120.getClass(), "resolveResult", null);
        setField(term8120, term8120.getClass(), "registry", null);
        setField(term8090, term8090.getClass(), "prototype", term8120);
        setField(term8090, term8090.getClass(), "kind", enum85);
        setField(term8090, term8090.getClass(), "typeOfThis", null);
        setField(term8090, term8090.getClass(), "source", null);
        setField(term8090, term8090.getClass(), "implementedInterfaces", null);
        setField(term8090, term8090.getClass(), "subTypes", null);
        setField(term8090, term8090.getClass(), "templateTypeName", null);
        setField(term8090, term8090.getClass(), "className", null);
        setField(term8090, term8090.getClass(), "properties", null);
        setField(term8090, term8090.getClass(), "implicitPrototype", null);
        setBooleanField(term8090, term8090.getClass(), "nativeType", false);
        setBooleanField(term8090, term8090.getClass(), "visited", false);
        setField(term8090, term8090.getClass(), "docInfo", null);
        setBooleanField(term8090, term8090.getClass(), "unknown", false);
        setBooleanField(term8090, term8090.getClass(), "resolved", false);
        setField(term8090, term8090.getClass(), "resolveResult", null);
        setField(term8090, term8090.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term8090, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


