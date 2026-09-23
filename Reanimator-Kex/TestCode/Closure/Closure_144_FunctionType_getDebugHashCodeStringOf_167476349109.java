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
     Object term21662;

    public FunctionType_getDebugHashCodeStringOf_167476349109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term61324 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term61323 = ((Class) term61324).getDeclaredField((String) "INTERFACE");
        ((Field) term61323).setAccessible(true);
        Object enum157 = ((Field) term61323).get((Object) null);
        term21662 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term21663 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term21664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21677 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term21681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21687 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term21693 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term21664, term21664.getClass(), "type", -255317272);
        setIntField(term21666, term21666.getClass(), "type", -1617383807);
        setIntField(term21668, term21668.getClass(), "type", 0);
        setField(term21668, term21668.getClass(), "next", null);
        setField(term21668, term21668.getClass(), "first", null);
        setField(term21668, term21668.getClass(), "last", null);
        setField(term21668, term21668.getClass(), "propListHead", null);
        setIntField(term21668, term21668.getClass(), "sourcePosition", 0);
        setField(term21668, term21668.getClass(), "jsType", null);
        setField(term21668, term21668.getClass(), "parent", null);
        setField(term21666, term21666.getClass(), "next", term21668);
        setIntField(term21671, term21671.getClass(), "type", 0);
        setField(term21671, term21671.getClass(), "next", null);
        setField(term21671, term21671.getClass(), "first", null);
        setField(term21671, term21671.getClass(), "last", null);
        setField(term21671, term21671.getClass(), "propListHead", null);
        setIntField(term21671, term21671.getClass(), "sourcePosition", 0);
        setField(term21671, term21671.getClass(), "jsType", null);
        setField(term21671, term21671.getClass(), "parent", null);
        setField(term21666, term21666.getClass(), "first", term21671);
        setIntField(term21674, term21674.getClass(), "type", 0);
        setField(term21674, term21674.getClass(), "next", null);
        setField(term21674, term21674.getClass(), "first", null);
        setField(term21674, term21674.getClass(), "last", null);
        setField(term21674, term21674.getClass(), "propListHead", null);
        setIntField(term21674, term21674.getClass(), "sourcePosition", 0);
        setField(term21674, term21674.getClass(), "jsType", null);
        setField(term21674, term21674.getClass(), "parent", null);
        setField(term21666, term21666.getClass(), "last", term21674);
        setField(term21677, term21677.getClass(), "next", null);
        setIntField(term21677, term21677.getClass(), "type", 0);
        setIntField(term21677, term21677.getClass(), "intValue", 0);
        setField(term21677, term21677.getClass(), "objectValue", null);
        setField(term21666, term21666.getClass(), "propListHead", term21677);
        setIntField(term21666, term21666.getClass(), "sourcePosition", -1244386281);
        setField(term21666, term21666.getClass(), "jsType", null);
        setField(term21666, term21666.getClass(), "parent", null);
        setField(term21664, term21664.getClass(), "next", term21666);
        setIntField(term21681, term21681.getClass(), "type", 0);
        setField(term21681, term21681.getClass(), "next", null);
        setField(term21681, term21681.getClass(), "first", null);
        setField(term21681, term21681.getClass(), "last", null);
        setField(term21681, term21681.getClass(), "propListHead", null);
        setIntField(term21681, term21681.getClass(), "sourcePosition", 0);
        setField(term21681, term21681.getClass(), "jsType", null);
        setField(term21681, term21681.getClass(), "parent", null);
        setField(term21664, term21664.getClass(), "first", term21681);
        setIntField(term21684, term21684.getClass(), "type", 0);
        setField(term21684, term21684.getClass(), "next", null);
        setField(term21684, term21684.getClass(), "first", null);
        setField(term21684, term21684.getClass(), "last", null);
        setField(term21684, term21684.getClass(), "propListHead", null);
        setIntField(term21684, term21684.getClass(), "sourcePosition", 0);
        setField(term21684, term21684.getClass(), "jsType", null);
        setField(term21684, term21684.getClass(), "parent", null);
        setField(term21664, term21664.getClass(), "last", term21684);
        setField(term21687, term21687.getClass(), "next", null);
        setIntField(term21687, term21687.getClass(), "type", 0);
        setIntField(term21687, term21687.getClass(), "intValue", 0);
        setField(term21687, term21687.getClass(), "objectValue", null);
        setField(term21664, term21664.getClass(), "propListHead", term21687);
        setIntField(term21664, term21664.getClass(), "sourcePosition", -885788574);
        setField(term21664, term21664.getClass(), "jsType", null);
        setField(term21664, term21664.getClass(), "parent", null);
        setField(term21663, term21663.getClass(), "parameters", term21664);
        setField(term21663, term21663.getClass(), "returnType", null);
        setBooleanField(term21663, term21663.getClass(), "returnTypeInferred", false);
        setBooleanField(term21663, term21663.getClass(), "resolved", false);
        setField(term21663, term21663.getClass(), "resolveResult", null);
        setField(term21663, term21663.getClass(), "registry", null);
        setField(term21662, term21662.getClass(), "call", term21663);
        setField(term21693, term21693.getClass(), "ownerFunction", null);
        setField(term21693, term21693.getClass(), "className", null);
        setField(term21693, term21693.getClass(), "properties", null);
        setField(term21693, term21693.getClass(), "implicitPrototype", null);
        setBooleanField(term21693, term21693.getClass(), "nativeType", false);
        setBooleanField(term21693, term21693.getClass(), "prettyPrint", false);
        setBooleanField(term21693, term21693.getClass(), "visited", false);
        setField(term21693, term21693.getClass(), "docInfo", null);
        setBooleanField(term21693, term21693.getClass(), "unknown", false);
        setBooleanField(term21693, term21693.getClass(), "resolved", false);
        setField(term21693, term21693.getClass(), "resolveResult", null);
        setField(term21693, term21693.getClass(), "registry", null);
        setField(term21662, term21662.getClass(), "prototype", term21693);
        setField(term21662, term21662.getClass(), "kind", enum157);
        setField(term21662, term21662.getClass(), "typeOfThis", null);
        setField(term21662, term21662.getClass(), "source", null);
        setField(term21662, term21662.getClass(), "implementedInterfaces", null);
        setField(term21662, term21662.getClass(), "subTypes", null);
        setField(term21662, term21662.getClass(), "templateTypeName", null);
        setField(term21662, term21662.getClass(), "className", null);
        setField(term21662, term21662.getClass(), "properties", null);
        setField(term21662, term21662.getClass(), "implicitPrototype", null);
        setBooleanField(term21662, term21662.getClass(), "nativeType", false);
        setBooleanField(term21662, term21662.getClass(), "prettyPrint", false);
        setBooleanField(term21662, term21662.getClass(), "visited", false);
        setField(term21662, term21662.getClass(), "docInfo", null);
        setBooleanField(term21662, term21662.getClass(), "unknown", false);
        setBooleanField(term21662, term21662.getClass(), "resolved", false);
        setField(term21662, term21662.getClass(), "resolveResult", null);
        setField(term21662, term21662.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getDebugHashCodeStringOf", argTypes, term21662, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


