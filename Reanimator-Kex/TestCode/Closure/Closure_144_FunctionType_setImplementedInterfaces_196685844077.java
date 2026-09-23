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
import java.util.LinkedList;

public class FunctionType_setImplementedInterfaces_196685844077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9532;
     Object term9589;

    public FunctionType_setImplementedInterfaces_196685844077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38595 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term38594 = ((Class) term38595).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term38594).setAccessible(true);
        Object enum102 = ((Field) term38594).get((Object) null);
        term9532 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term9533 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term9534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9547 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9557 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9563 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term9534, term9534.getClass(), "type", -282881827);
        setIntField(term9536, term9536.getClass(), "type", -1497710478);
        setIntField(term9538, term9538.getClass(), "type", 0);
        setField(term9538, term9538.getClass(), "next", null);
        setField(term9538, term9538.getClass(), "first", null);
        setField(term9538, term9538.getClass(), "last", null);
        setField(term9538, term9538.getClass(), "propListHead", null);
        setIntField(term9538, term9538.getClass(), "sourcePosition", 0);
        setField(term9538, term9538.getClass(), "jsType", null);
        setField(term9538, term9538.getClass(), "parent", null);
        setField(term9536, term9536.getClass(), "next", term9538);
        setIntField(term9541, term9541.getClass(), "type", 0);
        setField(term9541, term9541.getClass(), "next", null);
        setField(term9541, term9541.getClass(), "first", null);
        setField(term9541, term9541.getClass(), "last", null);
        setField(term9541, term9541.getClass(), "propListHead", null);
        setIntField(term9541, term9541.getClass(), "sourcePosition", 0);
        setField(term9541, term9541.getClass(), "jsType", null);
        setField(term9541, term9541.getClass(), "parent", null);
        setField(term9536, term9536.getClass(), "first", term9541);
        setIntField(term9544, term9544.getClass(), "type", 0);
        setField(term9544, term9544.getClass(), "next", null);
        setField(term9544, term9544.getClass(), "first", null);
        setField(term9544, term9544.getClass(), "last", null);
        setField(term9544, term9544.getClass(), "propListHead", null);
        setIntField(term9544, term9544.getClass(), "sourcePosition", 0);
        setField(term9544, term9544.getClass(), "jsType", null);
        setField(term9544, term9544.getClass(), "parent", null);
        setField(term9536, term9536.getClass(), "last", term9544);
        setField(term9547, term9547.getClass(), "next", null);
        setIntField(term9547, term9547.getClass(), "type", 0);
        setIntField(term9547, term9547.getClass(), "intValue", 0);
        setField(term9547, term9547.getClass(), "objectValue", null);
        setField(term9536, term9536.getClass(), "propListHead", term9547);
        setIntField(term9536, term9536.getClass(), "sourcePosition", 49950830);
        setField(term9536, term9536.getClass(), "jsType", null);
        setField(term9536, term9536.getClass(), "parent", null);
        setField(term9534, term9534.getClass(), "next", term9536);
        setIntField(term9551, term9551.getClass(), "type", 0);
        setField(term9551, term9551.getClass(), "next", null);
        setField(term9551, term9551.getClass(), "first", null);
        setField(term9551, term9551.getClass(), "last", null);
        setField(term9551, term9551.getClass(), "propListHead", null);
        setIntField(term9551, term9551.getClass(), "sourcePosition", 0);
        setField(term9551, term9551.getClass(), "jsType", null);
        setField(term9551, term9551.getClass(), "parent", null);
        setField(term9534, term9534.getClass(), "first", term9551);
        setIntField(term9554, term9554.getClass(), "type", 0);
        setField(term9554, term9554.getClass(), "next", null);
        setField(term9554, term9554.getClass(), "first", null);
        setField(term9554, term9554.getClass(), "last", null);
        setField(term9554, term9554.getClass(), "propListHead", null);
        setIntField(term9554, term9554.getClass(), "sourcePosition", 0);
        setField(term9554, term9554.getClass(), "jsType", null);
        setField(term9554, term9554.getClass(), "parent", null);
        setField(term9534, term9534.getClass(), "last", term9554);
        setField(term9557, term9557.getClass(), "next", null);
        setIntField(term9557, term9557.getClass(), "type", 0);
        setIntField(term9557, term9557.getClass(), "intValue", 0);
        setField(term9557, term9557.getClass(), "objectValue", null);
        setField(term9534, term9534.getClass(), "propListHead", term9557);
        setIntField(term9534, term9534.getClass(), "sourcePosition", -525257914);
        setField(term9534, term9534.getClass(), "jsType", null);
        setField(term9534, term9534.getClass(), "parent", null);
        setField(term9533, term9533.getClass(), "parameters", term9534);
        setField(term9533, term9533.getClass(), "returnType", null);
        setBooleanField(term9533, term9533.getClass(), "returnTypeInferred", false);
        setBooleanField(term9533, term9533.getClass(), "resolved", false);
        setField(term9533, term9533.getClass(), "resolveResult", null);
        setField(term9533, term9533.getClass(), "registry", null);
        setField(term9532, term9532.getClass(), "call", term9533);
        setField(term9563, term9563.getClass(), "ownerFunction", null);
        setField(term9563, term9563.getClass(), "className", null);
        setField(term9563, term9563.getClass(), "properties", null);
        setField(term9563, term9563.getClass(), "implicitPrototype", null);
        setBooleanField(term9563, term9563.getClass(), "nativeType", false);
        setBooleanField(term9563, term9563.getClass(), "prettyPrint", false);
        setBooleanField(term9563, term9563.getClass(), "visited", false);
        setField(term9563, term9563.getClass(), "docInfo", null);
        setBooleanField(term9563, term9563.getClass(), "unknown", false);
        setBooleanField(term9563, term9563.getClass(), "resolved", false);
        setField(term9563, term9563.getClass(), "resolveResult", null);
        setField(term9563, term9563.getClass(), "registry", null);
        setField(term9532, term9532.getClass(), "prototype", term9563);
        setField(term9532, term9532.getClass(), "kind", enum102);
        setField(term9532, term9532.getClass(), "typeOfThis", null);
        setField(term9532, term9532.getClass(), "source", null);
        setField(term9532, term9532.getClass(), "implementedInterfaces", null);
        setField(term9532, term9532.getClass(), "subTypes", null);
        setField(term9532, term9532.getClass(), "templateTypeName", null);
        setField(term9532, term9532.getClass(), "className", null);
        setField(term9532, term9532.getClass(), "properties", null);
        setField(term9532, term9532.getClass(), "implicitPrototype", null);
        setBooleanField(term9532, term9532.getClass(), "nativeType", false);
        setBooleanField(term9532, term9532.getClass(), "prettyPrint", false);
        setBooleanField(term9532, term9532.getClass(), "visited", false);
        setField(term9532, term9532.getClass(), "docInfo", null);
        setBooleanField(term9532, term9532.getClass(), "unknown", false);
        setBooleanField(term9532, term9532.getClass(), "resolved", false);
        setField(term9532, term9532.getClass(), "resolveResult", null);
        setField(term9532, term9532.getClass(), "registry", null);
        term9589 = new LinkedList();
        ((LinkedList) term9589).add((Object)null);
        ((LinkedList) term9589).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term9589;
        try {
            callMethod(klass, "setImplementedInterfaces", argTypes, term9532, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


