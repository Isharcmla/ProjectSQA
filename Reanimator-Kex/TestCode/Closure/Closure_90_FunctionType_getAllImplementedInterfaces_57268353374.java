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

public class FunctionType_getAllImplementedInterfaces_57268353374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8423;

    public FunctionType_getAllImplementedInterfaces_57268353374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36223 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term36222 = ((Class) term36223).getDeclaredField((String) "ORDINARY");
        ((Field) term36222).setAccessible(true);
        Object enum96 = ((Field) term36222).get((Object) null);
        term8423 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8424 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term8425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8438 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8448 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8454 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term8425, term8425.getClass(), "type", -1618206977);
        setIntField(term8427, term8427.getClass(), "type", -1476644457);
        setIntField(term8429, term8429.getClass(), "type", 0);
        setField(term8429, term8429.getClass(), "next", null);
        setField(term8429, term8429.getClass(), "first", null);
        setField(term8429, term8429.getClass(), "last", null);
        setField(term8429, term8429.getClass(), "propListHead", null);
        setIntField(term8429, term8429.getClass(), "sourcePosition", 0);
        setField(term8429, term8429.getClass(), "jsType", null);
        setField(term8429, term8429.getClass(), "parent", null);
        setField(term8427, term8427.getClass(), "next", term8429);
        setIntField(term8432, term8432.getClass(), "type", 0);
        setField(term8432, term8432.getClass(), "next", null);
        setField(term8432, term8432.getClass(), "first", null);
        setField(term8432, term8432.getClass(), "last", null);
        setField(term8432, term8432.getClass(), "propListHead", null);
        setIntField(term8432, term8432.getClass(), "sourcePosition", 0);
        setField(term8432, term8432.getClass(), "jsType", null);
        setField(term8432, term8432.getClass(), "parent", null);
        setField(term8427, term8427.getClass(), "first", term8432);
        setIntField(term8435, term8435.getClass(), "type", 0);
        setField(term8435, term8435.getClass(), "next", null);
        setField(term8435, term8435.getClass(), "first", null);
        setField(term8435, term8435.getClass(), "last", null);
        setField(term8435, term8435.getClass(), "propListHead", null);
        setIntField(term8435, term8435.getClass(), "sourcePosition", 0);
        setField(term8435, term8435.getClass(), "jsType", null);
        setField(term8435, term8435.getClass(), "parent", null);
        setField(term8427, term8427.getClass(), "last", term8435);
        setField(term8438, term8438.getClass(), "next", null);
        setIntField(term8438, term8438.getClass(), "type", 0);
        setIntField(term8438, term8438.getClass(), "intValue", 0);
        setField(term8438, term8438.getClass(), "objectValue", null);
        setField(term8427, term8427.getClass(), "propListHead", term8438);
        setIntField(term8427, term8427.getClass(), "sourcePosition", 1270666529);
        setField(term8427, term8427.getClass(), "jsType", null);
        setField(term8427, term8427.getClass(), "parent", null);
        setField(term8425, term8425.getClass(), "next", term8427);
        setIntField(term8442, term8442.getClass(), "type", 0);
        setField(term8442, term8442.getClass(), "next", null);
        setField(term8442, term8442.getClass(), "first", null);
        setField(term8442, term8442.getClass(), "last", null);
        setField(term8442, term8442.getClass(), "propListHead", null);
        setIntField(term8442, term8442.getClass(), "sourcePosition", 0);
        setField(term8442, term8442.getClass(), "jsType", null);
        setField(term8442, term8442.getClass(), "parent", null);
        setField(term8425, term8425.getClass(), "first", term8442);
        setIntField(term8445, term8445.getClass(), "type", 0);
        setField(term8445, term8445.getClass(), "next", null);
        setField(term8445, term8445.getClass(), "first", null);
        setField(term8445, term8445.getClass(), "last", null);
        setField(term8445, term8445.getClass(), "propListHead", null);
        setIntField(term8445, term8445.getClass(), "sourcePosition", 0);
        setField(term8445, term8445.getClass(), "jsType", null);
        setField(term8445, term8445.getClass(), "parent", null);
        setField(term8425, term8425.getClass(), "last", term8445);
        setField(term8448, term8448.getClass(), "next", null);
        setIntField(term8448, term8448.getClass(), "type", 0);
        setIntField(term8448, term8448.getClass(), "intValue", 0);
        setField(term8448, term8448.getClass(), "objectValue", null);
        setField(term8425, term8425.getClass(), "propListHead", term8448);
        setIntField(term8425, term8425.getClass(), "sourcePosition", -1146679443);
        setField(term8425, term8425.getClass(), "jsType", null);
        setField(term8425, term8425.getClass(), "parent", null);
        setField(term8424, term8424.getClass(), "parameters", term8425);
        setField(term8424, term8424.getClass(), "returnType", null);
        setBooleanField(term8424, term8424.getClass(), "returnTypeInferred", false);
        setBooleanField(term8424, term8424.getClass(), "resolved", false);
        setField(term8424, term8424.getClass(), "resolveResult", null);
        setField(term8424, term8424.getClass(), "registry", null);
        setField(term8423, term8423.getClass(), "call", term8424);
        setField(term8454, term8454.getClass(), "ownerFunction", null);
        setField(term8454, term8454.getClass(), "className", null);
        setField(term8454, term8454.getClass(), "properties", null);
        setBooleanField(term8454, term8454.getClass(), "nativeType", false);
        setField(term8454, term8454.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term8454, term8454.getClass(), "prettyPrint", false);
        setBooleanField(term8454, term8454.getClass(), "visited", false);
        setField(term8454, term8454.getClass(), "docInfo", null);
        setBooleanField(term8454, term8454.getClass(), "unknown", false);
        setBooleanField(term8454, term8454.getClass(), "resolved", false);
        setField(term8454, term8454.getClass(), "resolveResult", null);
        setField(term8454, term8454.getClass(), "registry", null);
        setField(term8423, term8423.getClass(), "prototype", term8454);
        setField(term8423, term8423.getClass(), "kind", enum96);
        setField(term8423, term8423.getClass(), "typeOfThis", null);
        setField(term8423, term8423.getClass(), "source", null);
        setField(term8423, term8423.getClass(), "implementedInterfaces", null);
        setField(term8423, term8423.getClass(), "subTypes", null);
        setField(term8423, term8423.getClass(), "templateTypeName", null);
        setField(term8423, term8423.getClass(), "className", null);
        setField(term8423, term8423.getClass(), "properties", null);
        setBooleanField(term8423, term8423.getClass(), "nativeType", false);
        setField(term8423, term8423.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term8423, term8423.getClass(), "prettyPrint", false);
        setBooleanField(term8423, term8423.getClass(), "visited", false);
        setField(term8423, term8423.getClass(), "docInfo", null);
        setBooleanField(term8423, term8423.getClass(), "unknown", false);
        setBooleanField(term8423, term8423.getClass(), "resolved", false);
        setField(term8423, term8423.getClass(), "resolveResult", null);
        setField(term8423, term8423.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term8423, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


