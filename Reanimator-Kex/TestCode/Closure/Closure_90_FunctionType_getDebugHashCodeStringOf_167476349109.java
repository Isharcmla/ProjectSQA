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

public class FunctionType_getDebugHashCodeStringOf_167476349109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21348;

    public FunctionType_getDebugHashCodeStringOf_167476349109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term60849 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term60848 = ((Class) term60849).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term60848).setAccessible(true);
        Object enum154 = ((Field) term60848).get((Object) null);
        term21348 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term21349 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term21350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21363 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term21367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21373 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term21379 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term21350, term21350.getClass(), "type", 1213549815);
        setIntField(term21352, term21352.getClass(), "type", -752870423);
        setIntField(term21354, term21354.getClass(), "type", 0);
        setField(term21354, term21354.getClass(), "next", null);
        setField(term21354, term21354.getClass(), "first", null);
        setField(term21354, term21354.getClass(), "last", null);
        setField(term21354, term21354.getClass(), "propListHead", null);
        setIntField(term21354, term21354.getClass(), "sourcePosition", 0);
        setField(term21354, term21354.getClass(), "jsType", null);
        setField(term21354, term21354.getClass(), "parent", null);
        setField(term21352, term21352.getClass(), "next", term21354);
        setIntField(term21357, term21357.getClass(), "type", 0);
        setField(term21357, term21357.getClass(), "next", null);
        setField(term21357, term21357.getClass(), "first", null);
        setField(term21357, term21357.getClass(), "last", null);
        setField(term21357, term21357.getClass(), "propListHead", null);
        setIntField(term21357, term21357.getClass(), "sourcePosition", 0);
        setField(term21357, term21357.getClass(), "jsType", null);
        setField(term21357, term21357.getClass(), "parent", null);
        setField(term21352, term21352.getClass(), "first", term21357);
        setIntField(term21360, term21360.getClass(), "type", 0);
        setField(term21360, term21360.getClass(), "next", null);
        setField(term21360, term21360.getClass(), "first", null);
        setField(term21360, term21360.getClass(), "last", null);
        setField(term21360, term21360.getClass(), "propListHead", null);
        setIntField(term21360, term21360.getClass(), "sourcePosition", 0);
        setField(term21360, term21360.getClass(), "jsType", null);
        setField(term21360, term21360.getClass(), "parent", null);
        setField(term21352, term21352.getClass(), "last", term21360);
        setField(term21363, term21363.getClass(), "next", null);
        setIntField(term21363, term21363.getClass(), "type", 0);
        setIntField(term21363, term21363.getClass(), "intValue", 0);
        setField(term21363, term21363.getClass(), "objectValue", null);
        setField(term21352, term21352.getClass(), "propListHead", term21363);
        setIntField(term21352, term21352.getClass(), "sourcePosition", -1698809299);
        setField(term21352, term21352.getClass(), "jsType", null);
        setField(term21352, term21352.getClass(), "parent", null);
        setField(term21350, term21350.getClass(), "next", term21352);
        setIntField(term21367, term21367.getClass(), "type", 0);
        setField(term21367, term21367.getClass(), "next", null);
        setField(term21367, term21367.getClass(), "first", null);
        setField(term21367, term21367.getClass(), "last", null);
        setField(term21367, term21367.getClass(), "propListHead", null);
        setIntField(term21367, term21367.getClass(), "sourcePosition", 0);
        setField(term21367, term21367.getClass(), "jsType", null);
        setField(term21367, term21367.getClass(), "parent", null);
        setField(term21350, term21350.getClass(), "first", term21367);
        setIntField(term21370, term21370.getClass(), "type", 0);
        setField(term21370, term21370.getClass(), "next", null);
        setField(term21370, term21370.getClass(), "first", null);
        setField(term21370, term21370.getClass(), "last", null);
        setField(term21370, term21370.getClass(), "propListHead", null);
        setIntField(term21370, term21370.getClass(), "sourcePosition", 0);
        setField(term21370, term21370.getClass(), "jsType", null);
        setField(term21370, term21370.getClass(), "parent", null);
        setField(term21350, term21350.getClass(), "last", term21370);
        setField(term21373, term21373.getClass(), "next", null);
        setIntField(term21373, term21373.getClass(), "type", 0);
        setIntField(term21373, term21373.getClass(), "intValue", 0);
        setField(term21373, term21373.getClass(), "objectValue", null);
        setField(term21350, term21350.getClass(), "propListHead", term21373);
        setIntField(term21350, term21350.getClass(), "sourcePosition", 401512128);
        setField(term21350, term21350.getClass(), "jsType", null);
        setField(term21350, term21350.getClass(), "parent", null);
        setField(term21349, term21349.getClass(), "parameters", term21350);
        setField(term21349, term21349.getClass(), "returnType", null);
        setBooleanField(term21349, term21349.getClass(), "returnTypeInferred", false);
        setBooleanField(term21349, term21349.getClass(), "resolved", false);
        setField(term21349, term21349.getClass(), "resolveResult", null);
        setField(term21349, term21349.getClass(), "registry", null);
        setField(term21348, term21348.getClass(), "call", term21349);
        setField(term21379, term21379.getClass(), "ownerFunction", null);
        setField(term21379, term21379.getClass(), "className", null);
        setField(term21379, term21379.getClass(), "properties", null);
        setBooleanField(term21379, term21379.getClass(), "nativeType", false);
        setField(term21379, term21379.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term21379, term21379.getClass(), "prettyPrint", false);
        setBooleanField(term21379, term21379.getClass(), "visited", false);
        setField(term21379, term21379.getClass(), "docInfo", null);
        setBooleanField(term21379, term21379.getClass(), "unknown", false);
        setBooleanField(term21379, term21379.getClass(), "resolved", false);
        setField(term21379, term21379.getClass(), "resolveResult", null);
        setField(term21379, term21379.getClass(), "registry", null);
        setField(term21348, term21348.getClass(), "prototype", term21379);
        setField(term21348, term21348.getClass(), "kind", enum154);
        setField(term21348, term21348.getClass(), "typeOfThis", null);
        setField(term21348, term21348.getClass(), "source", null);
        setField(term21348, term21348.getClass(), "implementedInterfaces", null);
        setField(term21348, term21348.getClass(), "subTypes", null);
        setField(term21348, term21348.getClass(), "templateTypeName", null);
        setField(term21348, term21348.getClass(), "className", null);
        setField(term21348, term21348.getClass(), "properties", null);
        setBooleanField(term21348, term21348.getClass(), "nativeType", false);
        setField(term21348, term21348.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term21348, term21348.getClass(), "prettyPrint", false);
        setBooleanField(term21348, term21348.getClass(), "visited", false);
        setField(term21348, term21348.getClass(), "docInfo", null);
        setBooleanField(term21348, term21348.getClass(), "unknown", false);
        setBooleanField(term21348, term21348.getClass(), "resolved", false);
        setField(term21348, term21348.getClass(), "resolveResult", null);
        setField(term21348, term21348.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getDebugHashCodeStringOf", argTypes, term21348, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


