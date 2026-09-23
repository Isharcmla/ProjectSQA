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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.StringBuilder;
import java.lang.Object;

public class FunctionType_appendArgString_62535866511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term476834;
     Object term476894;
     Object term476964;
     Object term477153;
     Object term477154;
     Object term477156;

    public FunctionType_appendArgString_62535866511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term476834 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term476894 = new StringBuilder();
        term476964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term477064 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term476964, term476964.getClass(), "propListHead", null);
        setBooleanField(term477064, term477064.getClass(), "prettyPrint", false);
        setField(term476964, term476964.getClass(), "jsType", term477064);
        term477153 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term477153, term477153.getClass(), "call", null);
        setField(term477153, term477153.getClass(), "prototypeSlot", null);
        setField(term477153, term477153.getClass(), "kind", null);
        setField(term477153, term477153.getClass(), "propAccess", null);
        setField(term477153, term477153.getClass(), "typeOfThis", null);
        setField(term477153, term477153.getClass(), "source", null);
        setField(term477153, term477153.getClass(), "implementedInterfaces", null);
        setField(term477153, term477153.getClass(), "extendedInterfaces", null);
        setField(term477153, term477153.getClass(), "subTypes", null);
        setField(term477153, term477153.getClass(), "templateTypeNames", null);
        setField(term477153, term477153.getClass(), "className", null);
        setField(term477153, term477153.getClass(), "properties", null);
        setBooleanField(term477153, term477153.getClass(), "nativeType", false);
        setField(term477153, term477153.getClass(), "implicitPrototypeFallback", null);
        setField(term477153, term477153.getClass(), "ownerFunction", null);
        setBooleanField(term477153, term477153.getClass(), "prettyPrint", false);
        setBooleanField(term477153, term477153.getClass(), "visited", false);
        setField(term477153, term477153.getClass(), "docInfo", null);
        setBooleanField(term477153, term477153.getClass(), "unknown", false);
        setBooleanField(term477153, term477153.getClass(), "resolved", false);
        setField(term477153, term477153.getClass(), "resolveResult", null);
        setBooleanField(term477153, term477153.getClass(), "inTemplatedCheckVisit", false);
        setField(term477153, term477153.getClass(), "registry", null);
        term477154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term477155 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setIntField(term477154, term477154.getClass(), "type", 0);
        setField(term477154, term477154.getClass(), "next", null);
        setField(term477154, term477154.getClass(), "first", null);
        setField(term477154, term477154.getClass(), "last", null);
        setField(term477154, term477154.getClass(), "propListHead", null);
        setIntField(term477154, term477154.getClass(), "sourcePosition", 0);
        setField(term477155, term477155.getClass(), "call", null);
        setField(term477155, term477155.getClass(), "prototypeSlot", null);
        setField(term477155, term477155.getClass(), "kind", null);
        setField(term477155, term477155.getClass(), "propAccess", null);
        setField(term477155, term477155.getClass(), "typeOfThis", null);
        setField(term477155, term477155.getClass(), "source", null);
        setField(term477155, term477155.getClass(), "implementedInterfaces", null);
        setField(term477155, term477155.getClass(), "extendedInterfaces", null);
        setField(term477155, term477155.getClass(), "subTypes", null);
        setField(term477155, term477155.getClass(), "templateTypeNames", null);
        setField(term477155, term477155.getClass(), "className", null);
        setField(term477155, term477155.getClass(), "properties", null);
        setBooleanField(term477155, term477155.getClass(), "nativeType", false);
        setField(term477155, term477155.getClass(), "implicitPrototypeFallback", null);
        setField(term477155, term477155.getClass(), "ownerFunction", null);
        setBooleanField(term477155, term477155.getClass(), "prettyPrint", false);
        setBooleanField(term477155, term477155.getClass(), "visited", false);
        setField(term477155, term477155.getClass(), "docInfo", null);
        setBooleanField(term477155, term477155.getClass(), "unknown", false);
        setBooleanField(term477155, term477155.getClass(), "resolved", false);
        setField(term477155, term477155.getClass(), "resolveResult", null);
        setBooleanField(term477155, term477155.getClass(), "inTemplatedCheckVisit", false);
        setField(term477155, term477155.getClass(), "registry", null);
        setField(term477154, term477154.getClass(), "jsType", term477155);
        setField(term477154, term477154.getClass(), "parent", null);
        term477156 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term477157 = (byte[]) newByteArray(16);
        setByteElement(term477157, 0, (byte) 70);
        setByteElement(term477157, 1, (byte) 117);
        setByteElement(term477157, 2, (byte) 110);
        setByteElement(term477157, 3, (byte) 99);
        setByteElement(term477157, 4, (byte) 116);
        setByteElement(term477157, 5, (byte) 105);
        setByteElement(term477157, 6, (byte) 111);
        setByteElement(term477157, 7, (byte) 110);
        setField(term477156, term477156.getClass(), "value", term477157);
        setByteField(term477156, term477156.getClass(), "coder", (byte) 0);
        setIntField(term477156, term477156.getClass(), "count", 8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term476894;
        args[1] = term476964;
        args[2] = false;
        callMethod(klass, "appendArgString", argTypes, term476834, args);
        assertTrue(recursiveEquals(term476834, term477153));
        assertTrue(recursiveEquals(term476894, term477154));
        assertTrue(recursiveEquals(term476964, false));
    }

};


