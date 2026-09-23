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

public class FunctionType_getGreatestSubtype_67959170978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11330;

    public FunctionType_getGreatestSubtype_67959170978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39759 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term39758 = ((Class) term39759).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term39758).setAccessible(true);
        Object enum98 = ((Field) term39758).get((Object) null);
        term11330 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term11331 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term11332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11345 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11355 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11360 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term11332, term11332.getClass(), "type", 719656595);
        setIntField(term11334, term11334.getClass(), "type", 1116576792);
        setIntField(term11336, term11336.getClass(), "type", 0);
        setField(term11336, term11336.getClass(), "next", null);
        setField(term11336, term11336.getClass(), "first", null);
        setField(term11336, term11336.getClass(), "last", null);
        setField(term11336, term11336.getClass(), "propListHead", null);
        setIntField(term11336, term11336.getClass(), "sourcePosition", 0);
        setField(term11336, term11336.getClass(), "jsType", null);
        setField(term11336, term11336.getClass(), "parent", null);
        setField(term11334, term11334.getClass(), "next", term11336);
        setIntField(term11339, term11339.getClass(), "type", 0);
        setField(term11339, term11339.getClass(), "next", null);
        setField(term11339, term11339.getClass(), "first", null);
        setField(term11339, term11339.getClass(), "last", null);
        setField(term11339, term11339.getClass(), "propListHead", null);
        setIntField(term11339, term11339.getClass(), "sourcePosition", 0);
        setField(term11339, term11339.getClass(), "jsType", null);
        setField(term11339, term11339.getClass(), "parent", null);
        setField(term11334, term11334.getClass(), "first", term11339);
        setIntField(term11342, term11342.getClass(), "type", 0);
        setField(term11342, term11342.getClass(), "next", null);
        setField(term11342, term11342.getClass(), "first", null);
        setField(term11342, term11342.getClass(), "last", null);
        setField(term11342, term11342.getClass(), "propListHead", null);
        setIntField(term11342, term11342.getClass(), "sourcePosition", 0);
        setField(term11342, term11342.getClass(), "jsType", null);
        setField(term11342, term11342.getClass(), "parent", null);
        setField(term11334, term11334.getClass(), "last", term11342);
        setField(term11345, term11345.getClass(), "next", null);
        setIntField(term11345, term11345.getClass(), "type", 0);
        setIntField(term11345, term11345.getClass(), "intValue", 0);
        setField(term11345, term11345.getClass(), "objectValue", null);
        setField(term11334, term11334.getClass(), "propListHead", term11345);
        setIntField(term11334, term11334.getClass(), "sourcePosition", -942194446);
        setField(term11334, term11334.getClass(), "jsType", null);
        setField(term11334, term11334.getClass(), "parent", null);
        setField(term11332, term11332.getClass(), "next", term11334);
        setIntField(term11349, term11349.getClass(), "type", 0);
        setField(term11349, term11349.getClass(), "next", null);
        setField(term11349, term11349.getClass(), "first", null);
        setField(term11349, term11349.getClass(), "last", null);
        setField(term11349, term11349.getClass(), "propListHead", null);
        setIntField(term11349, term11349.getClass(), "sourcePosition", 0);
        setField(term11349, term11349.getClass(), "jsType", null);
        setField(term11349, term11349.getClass(), "parent", null);
        setField(term11332, term11332.getClass(), "first", term11349);
        setIntField(term11352, term11352.getClass(), "type", 0);
        setField(term11352, term11352.getClass(), "next", null);
        setField(term11352, term11352.getClass(), "first", null);
        setField(term11352, term11352.getClass(), "last", null);
        setField(term11352, term11352.getClass(), "propListHead", null);
        setIntField(term11352, term11352.getClass(), "sourcePosition", 0);
        setField(term11352, term11352.getClass(), "jsType", null);
        setField(term11352, term11352.getClass(), "parent", null);
        setField(term11332, term11332.getClass(), "last", term11352);
        setField(term11355, term11355.getClass(), "next", null);
        setIntField(term11355, term11355.getClass(), "type", 0);
        setIntField(term11355, term11355.getClass(), "intValue", 0);
        setField(term11355, term11355.getClass(), "objectValue", null);
        setField(term11332, term11332.getClass(), "propListHead", term11355);
        setIntField(term11332, term11332.getClass(), "sourcePosition", -938508470);
        setField(term11332, term11332.getClass(), "jsType", null);
        setField(term11332, term11332.getClass(), "parent", null);
        setField(term11331, term11331.getClass(), "parameters", term11332);
        setField(term11331, term11331.getClass(), "returnType", null);
        setBooleanField(term11331, term11331.getClass(), "resolved", false);
        setField(term11331, term11331.getClass(), "resolveResult", null);
        setField(term11331, term11331.getClass(), "registry", null);
        setField(term11330, term11330.getClass(), "call", term11331);
        setField(term11360, term11360.getClass(), "ownerFunction", null);
        setField(term11360, term11360.getClass(), "className", null);
        setField(term11360, term11360.getClass(), "properties", null);
        setField(term11360, term11360.getClass(), "implicitPrototype", null);
        setBooleanField(term11360, term11360.getClass(), "nativeType", false);
        setBooleanField(term11360, term11360.getClass(), "visited", false);
        setField(term11360, term11360.getClass(), "docInfo", null);
        setBooleanField(term11360, term11360.getClass(), "unknown", false);
        setBooleanField(term11360, term11360.getClass(), "resolved", false);
        setField(term11360, term11360.getClass(), "resolveResult", null);
        setField(term11360, term11360.getClass(), "registry", null);
        setField(term11330, term11330.getClass(), "prototype", term11360);
        setField(term11330, term11330.getClass(), "kind", enum98);
        setField(term11330, term11330.getClass(), "typeOfThis", null);
        setField(term11330, term11330.getClass(), "source", null);
        setField(term11330, term11330.getClass(), "implementedInterfaces", null);
        setField(term11330, term11330.getClass(), "subTypes", null);
        setField(term11330, term11330.getClass(), "templateTypeName", null);
        setField(term11330, term11330.getClass(), "className", null);
        setField(term11330, term11330.getClass(), "properties", null);
        setField(term11330, term11330.getClass(), "implicitPrototype", null);
        setBooleanField(term11330, term11330.getClass(), "nativeType", false);
        setBooleanField(term11330, term11330.getClass(), "visited", false);
        setField(term11330, term11330.getClass(), "docInfo", null);
        setBooleanField(term11330, term11330.getClass(), "unknown", false);
        setBooleanField(term11330, term11330.getClass(), "resolved", false);
        setField(term11330, term11330.getClass(), "resolveResult", null);
        setField(term11330, term11330.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term11330, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


