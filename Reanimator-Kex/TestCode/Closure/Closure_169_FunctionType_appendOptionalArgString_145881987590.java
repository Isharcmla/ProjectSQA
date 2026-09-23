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

public class FunctionType_appendOptionalArgString_145881987590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term565211;
     Object term565271;
     Object term565367;
     Object term565421;
     Object term565422;
     Object term565423;

    public FunctionType_appendOptionalArgString_145881987590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term565211 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term565271 = new StringBuilder();
        term565367 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        term565421 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term565421, term565421.getClass(), "call", null);
        setField(term565421, term565421.getClass(), "prototypeSlot", null);
        setField(term565421, term565421.getClass(), "kind", null);
        setField(term565421, term565421.getClass(), "propAccess", null);
        setField(term565421, term565421.getClass(), "typeOfThis", null);
        setField(term565421, term565421.getClass(), "source", null);
        setField(term565421, term565421.getClass(), "implementedInterfaces", null);
        setField(term565421, term565421.getClass(), "extendedInterfaces", null);
        setField(term565421, term565421.getClass(), "subTypes", null);
        setField(term565421, term565421.getClass(), "templateTypeNames", null);
        setField(term565421, term565421.getClass(), "className", null);
        setField(term565421, term565421.getClass(), "properties", null);
        setBooleanField(term565421, term565421.getClass(), "nativeType", false);
        setField(term565421, term565421.getClass(), "implicitPrototypeFallback", null);
        setField(term565421, term565421.getClass(), "ownerFunction", null);
        setBooleanField(term565421, term565421.getClass(), "prettyPrint", false);
        setBooleanField(term565421, term565421.getClass(), "visited", false);
        setField(term565421, term565421.getClass(), "docInfo", null);
        setBooleanField(term565421, term565421.getClass(), "unknown", false);
        setBooleanField(term565421, term565421.getClass(), "resolved", false);
        setField(term565421, term565421.getClass(), "resolveResult", null);
        setBooleanField(term565421, term565421.getClass(), "inTemplatedCheckVisit", false);
        setField(term565421, term565421.getClass(), "registry", null);
        term565422 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setBooleanField(term565422, term565422.getClass(), "resolved", false);
        setField(term565422, term565422.getClass(), "resolveResult", null);
        setBooleanField(term565422, term565422.getClass(), "inTemplatedCheckVisit", false);
        setField(term565422, term565422.getClass(), "registry", null);
        term565423 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term565424 = (byte[]) newByteArray(16);
        setByteElement(term565424, 0, (byte) 110);
        setByteElement(term565424, 1, (byte) 117);
        setByteElement(term565424, 2, (byte) 109);
        setByteElement(term565424, 3, (byte) 98);
        setByteElement(term565424, 4, (byte) 101);
        setByteElement(term565424, 5, (byte) 114);
        setByteElement(term565424, 6, (byte) 61);
        setField(term565423, term565423.getClass(), "value", term565424);
        setByteField(term565423, term565423.getClass(), "coder", (byte) 0);
        setIntField(term565423, term565423.getClass(), "count", 7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term565271;
        args[1] = term565367;
        args[2] = false;
        callMethod(klass, "appendOptionalArgString", argTypes, term565211, args);
        assertTrue(recursiveEquals(term565211, term565421));
        assertTrue(recursiveEquals(term565271, term565422));
        assertTrue(recursiveEquals(term565367, false));
    }

};


