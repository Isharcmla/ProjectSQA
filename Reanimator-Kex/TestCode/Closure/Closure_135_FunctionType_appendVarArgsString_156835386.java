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

public class FunctionType_appendVarArgsString_156835386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14475;
     Object term14529;

    public FunctionType_appendVarArgsString_156835386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46674 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term46673 = ((Class) term46674).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term46673).setAccessible(true);
        Object enum115 = ((Field) term46673).get((Object) null);
        term14475 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term14476 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term14477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14490 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term14494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14500 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term14505 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term14477, term14477.getClass(), "type", 1607082164);
        setIntField(term14479, term14479.getClass(), "type", 91958879);
        setIntField(term14481, term14481.getClass(), "type", 0);
        setField(term14481, term14481.getClass(), "next", null);
        setField(term14481, term14481.getClass(), "first", null);
        setField(term14481, term14481.getClass(), "last", null);
        setField(term14481, term14481.getClass(), "propListHead", null);
        setIntField(term14481, term14481.getClass(), "sourcePosition", 0);
        setField(term14481, term14481.getClass(), "jsType", null);
        setField(term14481, term14481.getClass(), "parent", null);
        setField(term14479, term14479.getClass(), "next", term14481);
        setIntField(term14484, term14484.getClass(), "type", 0);
        setField(term14484, term14484.getClass(), "next", null);
        setField(term14484, term14484.getClass(), "first", null);
        setField(term14484, term14484.getClass(), "last", null);
        setField(term14484, term14484.getClass(), "propListHead", null);
        setIntField(term14484, term14484.getClass(), "sourcePosition", 0);
        setField(term14484, term14484.getClass(), "jsType", null);
        setField(term14484, term14484.getClass(), "parent", null);
        setField(term14479, term14479.getClass(), "first", term14484);
        setIntField(term14487, term14487.getClass(), "type", 0);
        setField(term14487, term14487.getClass(), "next", null);
        setField(term14487, term14487.getClass(), "first", null);
        setField(term14487, term14487.getClass(), "last", null);
        setField(term14487, term14487.getClass(), "propListHead", null);
        setIntField(term14487, term14487.getClass(), "sourcePosition", 0);
        setField(term14487, term14487.getClass(), "jsType", null);
        setField(term14487, term14487.getClass(), "parent", null);
        setField(term14479, term14479.getClass(), "last", term14487);
        setField(term14490, term14490.getClass(), "next", null);
        setIntField(term14490, term14490.getClass(), "type", 0);
        setIntField(term14490, term14490.getClass(), "intValue", 0);
        setField(term14490, term14490.getClass(), "objectValue", null);
        setField(term14479, term14479.getClass(), "propListHead", term14490);
        setIntField(term14479, term14479.getClass(), "sourcePosition", -645429025);
        setField(term14479, term14479.getClass(), "jsType", null);
        setField(term14479, term14479.getClass(), "parent", null);
        setField(term14477, term14477.getClass(), "next", term14479);
        setIntField(term14494, term14494.getClass(), "type", 0);
        setField(term14494, term14494.getClass(), "next", null);
        setField(term14494, term14494.getClass(), "first", null);
        setField(term14494, term14494.getClass(), "last", null);
        setField(term14494, term14494.getClass(), "propListHead", null);
        setIntField(term14494, term14494.getClass(), "sourcePosition", 0);
        setField(term14494, term14494.getClass(), "jsType", null);
        setField(term14494, term14494.getClass(), "parent", null);
        setField(term14477, term14477.getClass(), "first", term14494);
        setIntField(term14497, term14497.getClass(), "type", 0);
        setField(term14497, term14497.getClass(), "next", null);
        setField(term14497, term14497.getClass(), "first", null);
        setField(term14497, term14497.getClass(), "last", null);
        setField(term14497, term14497.getClass(), "propListHead", null);
        setIntField(term14497, term14497.getClass(), "sourcePosition", 0);
        setField(term14497, term14497.getClass(), "jsType", null);
        setField(term14497, term14497.getClass(), "parent", null);
        setField(term14477, term14477.getClass(), "last", term14497);
        setField(term14500, term14500.getClass(), "next", null);
        setIntField(term14500, term14500.getClass(), "type", 0);
        setIntField(term14500, term14500.getClass(), "intValue", 0);
        setField(term14500, term14500.getClass(), "objectValue", null);
        setField(term14477, term14477.getClass(), "propListHead", term14500);
        setIntField(term14477, term14477.getClass(), "sourcePosition", -688213483);
        setField(term14477, term14477.getClass(), "jsType", null);
        setField(term14477, term14477.getClass(), "parent", null);
        setField(term14476, term14476.getClass(), "parameters", term14477);
        setField(term14476, term14476.getClass(), "returnType", null);
        setBooleanField(term14476, term14476.getClass(), "resolved", false);
        setField(term14476, term14476.getClass(), "resolveResult", null);
        setField(term14476, term14476.getClass(), "registry", null);
        setField(term14475, term14475.getClass(), "call", term14476);
        setField(term14505, term14505.getClass(), "ownerFunction", null);
        setField(term14505, term14505.getClass(), "className", null);
        setField(term14505, term14505.getClass(), "properties", null);
        setField(term14505, term14505.getClass(), "implicitPrototype", null);
        setBooleanField(term14505, term14505.getClass(), "nativeType", false);
        setBooleanField(term14505, term14505.getClass(), "visited", false);
        setField(term14505, term14505.getClass(), "docInfo", null);
        setBooleanField(term14505, term14505.getClass(), "unknown", false);
        setBooleanField(term14505, term14505.getClass(), "resolved", false);
        setField(term14505, term14505.getClass(), "resolveResult", null);
        setField(term14505, term14505.getClass(), "registry", null);
        setField(term14475, term14475.getClass(), "prototype", term14505);
        setField(term14475, term14475.getClass(), "kind", enum115);
        setField(term14475, term14475.getClass(), "typeOfThis", null);
        setField(term14475, term14475.getClass(), "source", null);
        setField(term14475, term14475.getClass(), "implementedInterfaces", null);
        setField(term14475, term14475.getClass(), "subTypes", null);
        setField(term14475, term14475.getClass(), "templateTypeName", null);
        setField(term14475, term14475.getClass(), "className", null);
        setField(term14475, term14475.getClass(), "properties", null);
        setField(term14475, term14475.getClass(), "implicitPrototype", null);
        setBooleanField(term14475, term14475.getClass(), "nativeType", false);
        setBooleanField(term14475, term14475.getClass(), "visited", false);
        setField(term14475, term14475.getClass(), "docInfo", null);
        setBooleanField(term14475, term14475.getClass(), "unknown", false);
        setBooleanField(term14475, term14475.getClass(), "resolved", false);
        setField(term14475, term14475.getClass(), "resolveResult", null);
        setField(term14475, term14475.getClass(), "registry", null);
        term14529 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term14530 = (byte[]) newByteArray(16);
        setField(term14529, term14529.getClass(), "value", term14530);
        setByteField(term14529, term14529.getClass(), "coder", (byte) 47);
        setIntField(term14529, term14529.getClass(), "count", 644154104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term14529;
        args[1] = null;
        try {
            callMethod(klass, "appendVarArgsString", argTypes, term14475, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


