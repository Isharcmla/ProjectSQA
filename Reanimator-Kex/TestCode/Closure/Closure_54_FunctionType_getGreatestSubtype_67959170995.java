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

public class FunctionType_getGreatestSubtype_67959170995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11372;

    public FunctionType_getGreatestSubtype_67959170995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term44038 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term44037 = ((Class) term44038).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term44037).setAccessible(true);
        Object enum112 = ((Field) term44037).get((Object) null);
        term11372 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term11373 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term11374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11397 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term11403 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setIntField(term11374, term11374.getClass(), "type", -358526505);
        setIntField(term11376, term11376.getClass(), "type", 278355793);
        setIntField(term11378, term11378.getClass(), "type", 0);
        setField(term11378, term11378.getClass(), "next", null);
        setField(term11378, term11378.getClass(), "first", null);
        setField(term11378, term11378.getClass(), "last", null);
        setField(term11378, term11378.getClass(), "propListHead", null);
        setIntField(term11378, term11378.getClass(), "sourcePosition", 0);
        setField(term11378, term11378.getClass(), "jsType", null);
        setField(term11378, term11378.getClass(), "parent", null);
        setField(term11376, term11376.getClass(), "next", term11378);
        setIntField(term11381, term11381.getClass(), "type", 0);
        setField(term11381, term11381.getClass(), "next", null);
        setField(term11381, term11381.getClass(), "first", null);
        setField(term11381, term11381.getClass(), "last", null);
        setField(term11381, term11381.getClass(), "propListHead", null);
        setIntField(term11381, term11381.getClass(), "sourcePosition", 0);
        setField(term11381, term11381.getClass(), "jsType", null);
        setField(term11381, term11381.getClass(), "parent", null);
        setField(term11376, term11376.getClass(), "first", term11381);
        setIntField(term11384, term11384.getClass(), "type", 0);
        setField(term11384, term11384.getClass(), "next", null);
        setField(term11384, term11384.getClass(), "first", null);
        setField(term11384, term11384.getClass(), "last", null);
        setField(term11384, term11384.getClass(), "propListHead", null);
        setIntField(term11384, term11384.getClass(), "sourcePosition", 0);
        setField(term11384, term11384.getClass(), "jsType", null);
        setField(term11384, term11384.getClass(), "parent", null);
        setField(term11376, term11376.getClass(), "last", term11384);
        setField(term11376, term11376.getClass(), "propListHead", null);
        setIntField(term11376, term11376.getClass(), "sourcePosition", 0);
        setField(term11376, term11376.getClass(), "jsType", null);
        setField(term11376, term11376.getClass(), "parent", null);
        setField(term11374, term11374.getClass(), "next", term11376);
        setIntField(term11388, term11388.getClass(), "type", 0);
        setField(term11388, term11388.getClass(), "next", null);
        setField(term11388, term11388.getClass(), "first", null);
        setField(term11388, term11388.getClass(), "last", null);
        setField(term11388, term11388.getClass(), "propListHead", null);
        setIntField(term11388, term11388.getClass(), "sourcePosition", 0);
        setField(term11388, term11388.getClass(), "jsType", null);
        setField(term11388, term11388.getClass(), "parent", null);
        setField(term11374, term11374.getClass(), "first", term11388);
        setIntField(term11391, term11391.getClass(), "type", 0);
        setField(term11391, term11391.getClass(), "next", null);
        setField(term11391, term11391.getClass(), "first", null);
        setField(term11391, term11391.getClass(), "last", null);
        setField(term11391, term11391.getClass(), "propListHead", null);
        setIntField(term11391, term11391.getClass(), "sourcePosition", 0);
        setField(term11391, term11391.getClass(), "jsType", null);
        setField(term11391, term11391.getClass(), "parent", null);
        setField(term11374, term11374.getClass(), "last", term11391);
        setField(term11374, term11374.getClass(), "propListHead", null);
        setIntField(term11374, term11374.getClass(), "sourcePosition", 0);
        setField(term11374, term11374.getClass(), "jsType", null);
        setField(term11374, term11374.getClass(), "parent", null);
        setField(term11373, term11373.getClass(), "parameters", term11374);
        setField(term11373, term11373.getClass(), "returnType", null);
        setBooleanField(term11373, term11373.getClass(), "returnTypeInferred", false);
        setBooleanField(term11373, term11373.getClass(), "resolved", false);
        setField(term11373, term11373.getClass(), "resolveResult", null);
        setField(term11373, term11373.getClass(), "registry", null);
        setField(term11372, term11372.getClass(), "call", term11373);
        setField(term11397, term11397.getClass(), "className", null);
        setField(term11397, term11397.getClass(), "properties", null);
        setBooleanField(term11397, term11397.getClass(), "nativeType", false);
        setField(term11397, term11397.getClass(), "implicitPrototypeFallback", null);
        setField(term11397, term11397.getClass(), "ownerFunction", null);
        setBooleanField(term11397, term11397.getClass(), "prettyPrint", false);
        setBooleanField(term11397, term11397.getClass(), "visited", false);
        setField(term11397, term11397.getClass(), "docInfo", null);
        setBooleanField(term11397, term11397.getClass(), "unknown", false);
        setBooleanField(term11397, term11397.getClass(), "resolved", false);
        setField(term11397, term11397.getClass(), "resolveResult", null);
        setField(term11397, term11397.getClass(), "registry", null);
        setField(term11372, term11372.getClass(), "prototype", term11397);
        setField(term11403, term11403.getClass(), "name", null);
        setField(term11403, term11403.getClass(), "type", null);
        setBooleanField(term11403, term11403.getClass(), "inferred", false);
        setField(term11372, term11372.getClass(), "prototypeSlot", term11403);
        setField(term11372, term11372.getClass(), "kind", enum112);
        setField(term11372, term11372.getClass(), "typeOfThis", null);
        setField(term11372, term11372.getClass(), "source", null);
        setField(term11372, term11372.getClass(), "implementedInterfaces", null);
        setField(term11372, term11372.getClass(), "extendedInterfaces", null);
        setField(term11372, term11372.getClass(), "subTypes", null);
        setField(term11372, term11372.getClass(), "templateTypeName", null);
        setField(term11372, term11372.getClass(), "className", null);
        setField(term11372, term11372.getClass(), "properties", null);
        setBooleanField(term11372, term11372.getClass(), "nativeType", false);
        setField(term11372, term11372.getClass(), "implicitPrototypeFallback", null);
        setField(term11372, term11372.getClass(), "ownerFunction", null);
        setBooleanField(term11372, term11372.getClass(), "prettyPrint", false);
        setBooleanField(term11372, term11372.getClass(), "visited", false);
        setField(term11372, term11372.getClass(), "docInfo", null);
        setBooleanField(term11372, term11372.getClass(), "unknown", false);
        setBooleanField(term11372, term11372.getClass(), "resolved", false);
        setField(term11372, term11372.getClass(), "resolveResult", null);
        setField(term11372, term11372.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term11372, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


