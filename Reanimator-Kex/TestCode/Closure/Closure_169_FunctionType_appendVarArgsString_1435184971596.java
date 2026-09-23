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

public class FunctionType_appendVarArgsString_1435184971596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term570986;
     Object term571046;
     Object term571146;
     Object term571204;
     Object term571205;
     Object term571206;

    public FunctionType_appendVarArgsString_1435184971596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term570986 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term571046 = new StringBuilder();
        term571146 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term571204 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term571204, term571204.getClass(), "call", null);
        setField(term571204, term571204.getClass(), "prototypeSlot", null);
        setField(term571204, term571204.getClass(), "kind", null);
        setField(term571204, term571204.getClass(), "propAccess", null);
        setField(term571204, term571204.getClass(), "typeOfThis", null);
        setField(term571204, term571204.getClass(), "source", null);
        setField(term571204, term571204.getClass(), "implementedInterfaces", null);
        setField(term571204, term571204.getClass(), "extendedInterfaces", null);
        setField(term571204, term571204.getClass(), "subTypes", null);
        setField(term571204, term571204.getClass(), "templateTypeNames", null);
        setField(term571204, term571204.getClass(), "className", null);
        setField(term571204, term571204.getClass(), "properties", null);
        setBooleanField(term571204, term571204.getClass(), "nativeType", false);
        setField(term571204, term571204.getClass(), "implicitPrototypeFallback", null);
        setField(term571204, term571204.getClass(), "ownerFunction", null);
        setBooleanField(term571204, term571204.getClass(), "prettyPrint", false);
        setBooleanField(term571204, term571204.getClass(), "visited", false);
        setField(term571204, term571204.getClass(), "docInfo", null);
        setBooleanField(term571204, term571204.getClass(), "unknown", false);
        setBooleanField(term571204, term571204.getClass(), "resolved", false);
        setField(term571204, term571204.getClass(), "resolveResult", null);
        setBooleanField(term571204, term571204.getClass(), "inTemplatedCheckVisit", false);
        setField(term571204, term571204.getClass(), "registry", null);
        term571205 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term571205, term571205.getClass(), "call", null);
        setField(term571205, term571205.getClass(), "prototypeSlot", null);
        setField(term571205, term571205.getClass(), "kind", null);
        setField(term571205, term571205.getClass(), "propAccess", null);
        setField(term571205, term571205.getClass(), "typeOfThis", null);
        setField(term571205, term571205.getClass(), "source", null);
        setField(term571205, term571205.getClass(), "implementedInterfaces", null);
        setField(term571205, term571205.getClass(), "extendedInterfaces", null);
        setField(term571205, term571205.getClass(), "subTypes", null);
        setField(term571205, term571205.getClass(), "templateTypeNames", null);
        setField(term571205, term571205.getClass(), "className", null);
        setField(term571205, term571205.getClass(), "properties", null);
        setBooleanField(term571205, term571205.getClass(), "nativeType", false);
        setField(term571205, term571205.getClass(), "implicitPrototypeFallback", null);
        setField(term571205, term571205.getClass(), "ownerFunction", null);
        setBooleanField(term571205, term571205.getClass(), "prettyPrint", false);
        setBooleanField(term571205, term571205.getClass(), "visited", false);
        setField(term571205, term571205.getClass(), "docInfo", null);
        setBooleanField(term571205, term571205.getClass(), "unknown", false);
        setBooleanField(term571205, term571205.getClass(), "resolved", false);
        setField(term571205, term571205.getClass(), "resolveResult", null);
        setBooleanField(term571205, term571205.getClass(), "inTemplatedCheckVisit", false);
        setField(term571205, term571205.getClass(), "registry", null);
        term571206 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term571207 = (byte[]) newByteArray(16);
        setByteElement(term571207, 0, (byte) 46);
        setByteElement(term571207, 1, (byte) 46);
        setByteElement(term571207, 2, (byte) 46);
        setByteElement(term571207, 3, (byte) 91);
        setByteElement(term571207, 4, (byte) 70);
        setByteElement(term571207, 5, (byte) 117);
        setByteElement(term571207, 6, (byte) 110);
        setByteElement(term571207, 7, (byte) 99);
        setByteElement(term571207, 8, (byte) 116);
        setByteElement(term571207, 9, (byte) 105);
        setByteElement(term571207, 10, (byte) 111);
        setByteElement(term571207, 11, (byte) 110);
        setByteElement(term571207, 12, (byte) 93);
        setField(term571206, term571206.getClass(), "value", term571207);
        setByteField(term571206, term571206.getClass(), "coder", (byte) 0);
        setIntField(term571206, term571206.getClass(), "count", 13);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term571046;
        args[1] = term571146;
        args[2] = false;
        callMethod(klass, "appendVarArgsString", argTypes, term570986, args);
        assertTrue(recursiveEquals(term570986, term571204));
        assertTrue(recursiveEquals(term571046, term571205));
        assertTrue(recursiveEquals(term571146, false));
    }

};


