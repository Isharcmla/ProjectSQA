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

public class FunctionType_appendOptionalArgString_145881987558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term534611;
     Object term534671;
     Object term534771;
     Object term534829;
     Object term534830;
     Object term534831;

    public FunctionType_appendOptionalArgString_145881987558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term534611 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term534671 = new StringBuilder();
        term534771 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term534771, term534771.getClass(), "prettyPrint", false);
        term534829 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term534829, term534829.getClass(), "call", null);
        setField(term534829, term534829.getClass(), "prototypeSlot", null);
        setField(term534829, term534829.getClass(), "kind", null);
        setField(term534829, term534829.getClass(), "propAccess", null);
        setField(term534829, term534829.getClass(), "typeOfThis", null);
        setField(term534829, term534829.getClass(), "source", null);
        setField(term534829, term534829.getClass(), "implementedInterfaces", null);
        setField(term534829, term534829.getClass(), "extendedInterfaces", null);
        setField(term534829, term534829.getClass(), "subTypes", null);
        setField(term534829, term534829.getClass(), "templateTypeNames", null);
        setField(term534829, term534829.getClass(), "className", null);
        setField(term534829, term534829.getClass(), "properties", null);
        setBooleanField(term534829, term534829.getClass(), "nativeType", false);
        setField(term534829, term534829.getClass(), "implicitPrototypeFallback", null);
        setField(term534829, term534829.getClass(), "ownerFunction", null);
        setBooleanField(term534829, term534829.getClass(), "prettyPrint", false);
        setBooleanField(term534829, term534829.getClass(), "visited", false);
        setField(term534829, term534829.getClass(), "docInfo", null);
        setBooleanField(term534829, term534829.getClass(), "unknown", false);
        setBooleanField(term534829, term534829.getClass(), "resolved", false);
        setField(term534829, term534829.getClass(), "resolveResult", null);
        setBooleanField(term534829, term534829.getClass(), "inTemplatedCheckVisit", false);
        setField(term534829, term534829.getClass(), "registry", null);
        term534830 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term534830, term534830.getClass(), "call", null);
        setField(term534830, term534830.getClass(), "prototypeSlot", null);
        setField(term534830, term534830.getClass(), "kind", null);
        setField(term534830, term534830.getClass(), "propAccess", null);
        setField(term534830, term534830.getClass(), "typeOfThis", null);
        setField(term534830, term534830.getClass(), "source", null);
        setField(term534830, term534830.getClass(), "implementedInterfaces", null);
        setField(term534830, term534830.getClass(), "extendedInterfaces", null);
        setField(term534830, term534830.getClass(), "subTypes", null);
        setField(term534830, term534830.getClass(), "templateTypeNames", null);
        setField(term534830, term534830.getClass(), "className", null);
        setField(term534830, term534830.getClass(), "properties", null);
        setBooleanField(term534830, term534830.getClass(), "nativeType", false);
        setField(term534830, term534830.getClass(), "implicitPrototypeFallback", null);
        setField(term534830, term534830.getClass(), "ownerFunction", null);
        setBooleanField(term534830, term534830.getClass(), "prettyPrint", false);
        setBooleanField(term534830, term534830.getClass(), "visited", false);
        setField(term534830, term534830.getClass(), "docInfo", null);
        setBooleanField(term534830, term534830.getClass(), "unknown", false);
        setBooleanField(term534830, term534830.getClass(), "resolved", false);
        setField(term534830, term534830.getClass(), "resolveResult", null);
        setBooleanField(term534830, term534830.getClass(), "inTemplatedCheckVisit", false);
        setField(term534830, term534830.getClass(), "registry", null);
        term534831 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term534832 = (byte[]) newByteArray(16);
        setByteElement(term534832, 0, (byte) 70);
        setByteElement(term534832, 1, (byte) 117);
        setByteElement(term534832, 2, (byte) 110);
        setByteElement(term534832, 3, (byte) 99);
        setByteElement(term534832, 4, (byte) 116);
        setByteElement(term534832, 5, (byte) 105);
        setByteElement(term534832, 6, (byte) 111);
        setByteElement(term534832, 7, (byte) 110);
        setByteElement(term534832, 8, (byte) 61);
        setField(term534831, term534831.getClass(), "value", term534832);
        setByteField(term534831, term534831.getClass(), "coder", (byte) 0);
        setIntField(term534831, term534831.getClass(), "count", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term534671;
        args[1] = term534771;
        args[2] = false;
        callMethod(klass, "appendOptionalArgString", argTypes, term534611, args);
        assertTrue(recursiveEquals(term534611, term534829));
        assertTrue(recursiveEquals(term534671, term534830));
        assertTrue(recursiveEquals(term534771, false));
    }

};


