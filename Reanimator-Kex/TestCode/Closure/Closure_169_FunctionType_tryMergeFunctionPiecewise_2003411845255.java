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
import java.lang.Object;

public class FunctionType_tryMergeFunctionPiecewise_2003411845255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251565;
     Object term251969;
     Object term252299;
     Object term252304;

    public FunctionType_tryMergeFunctionPiecewise_2003411845255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251565 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term251659 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term251729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term251799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term251869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term251799, term251799.getClass(), "jsType", null);
        setField(term251799, term251799.getClass(), "next", term251869);
        setField(term251729, term251729.getClass(), "first", term251799);
        setField(term251659, term251659.getClass(), "parameters", term251729);
        setField(term251565, term251565.getClass(), "call", term251659);
        term251969 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term252063 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term252133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term252203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term252203, term252203.getClass(), "jsType", null);
        setField(term252203, term252203.getClass(), "next", null);
        setField(term252133, term252133.getClass(), "first", term252203);
        setField(term252063, term252063.getClass(), "parameters", term252133);
        setField(term251969, term251969.getClass(), "call", term252063);
        term252299 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term252300 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term252301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term252302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term252303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term252301, term252301.getClass(), "type", 0);
        setField(term252301, term252301.getClass(), "next", null);
        setIntField(term252302, term252302.getClass(), "type", 0);
        setIntField(term252303, term252303.getClass(), "type", 0);
        setField(term252303, term252303.getClass(), "next", null);
        setField(term252303, term252303.getClass(), "first", null);
        setField(term252303, term252303.getClass(), "last", null);
        setField(term252303, term252303.getClass(), "propListHead", null);
        setIntField(term252303, term252303.getClass(), "sourcePosition", 0);
        setField(term252303, term252303.getClass(), "jsType", null);
        setField(term252303, term252303.getClass(), "parent", null);
        setField(term252302, term252302.getClass(), "next", term252303);
        setField(term252302, term252302.getClass(), "first", null);
        setField(term252302, term252302.getClass(), "last", null);
        setField(term252302, term252302.getClass(), "propListHead", null);
        setIntField(term252302, term252302.getClass(), "sourcePosition", 0);
        setField(term252302, term252302.getClass(), "jsType", null);
        setField(term252302, term252302.getClass(), "parent", null);
        setField(term252301, term252301.getClass(), "first", term252302);
        setField(term252301, term252301.getClass(), "last", null);
        setField(term252301, term252301.getClass(), "propListHead", null);
        setIntField(term252301, term252301.getClass(), "sourcePosition", 0);
        setField(term252301, term252301.getClass(), "jsType", null);
        setField(term252301, term252301.getClass(), "parent", null);
        setField(term252300, term252300.getClass(), "parameters", term252301);
        setField(term252300, term252300.getClass(), "returnType", null);
        setBooleanField(term252300, term252300.getClass(), "returnTypeInferred", false);
        setBooleanField(term252300, term252300.getClass(), "resolved", false);
        setField(term252300, term252300.getClass(), "resolveResult", null);
        setBooleanField(term252300, term252300.getClass(), "inTemplatedCheckVisit", false);
        setField(term252300, term252300.getClass(), "registry", null);
        setField(term252299, term252299.getClass(), "call", term252300);
        setField(term252299, term252299.getClass(), "prototypeSlot", null);
        setField(term252299, term252299.getClass(), "kind", null);
        setField(term252299, term252299.getClass(), "propAccess", null);
        setField(term252299, term252299.getClass(), "typeOfThis", null);
        setField(term252299, term252299.getClass(), "source", null);
        setField(term252299, term252299.getClass(), "implementedInterfaces", null);
        setField(term252299, term252299.getClass(), "extendedInterfaces", null);
        setField(term252299, term252299.getClass(), "subTypes", null);
        setField(term252299, term252299.getClass(), "templateTypeNames", null);
        setField(term252299, term252299.getClass(), "className", null);
        setField(term252299, term252299.getClass(), "properties", null);
        setBooleanField(term252299, term252299.getClass(), "nativeType", false);
        setField(term252299, term252299.getClass(), "implicitPrototypeFallback", null);
        setField(term252299, term252299.getClass(), "ownerFunction", null);
        setBooleanField(term252299, term252299.getClass(), "prettyPrint", false);
        setBooleanField(term252299, term252299.getClass(), "visited", false);
        setField(term252299, term252299.getClass(), "docInfo", null);
        setBooleanField(term252299, term252299.getClass(), "unknown", false);
        setBooleanField(term252299, term252299.getClass(), "resolved", false);
        setField(term252299, term252299.getClass(), "resolveResult", null);
        setBooleanField(term252299, term252299.getClass(), "inTemplatedCheckVisit", false);
        setField(term252299, term252299.getClass(), "registry", null);
        term252304 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term252305 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term252306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term252307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term252306, term252306.getClass(), "type", 0);
        setField(term252306, term252306.getClass(), "next", null);
        setIntField(term252307, term252307.getClass(), "type", 0);
        setField(term252307, term252307.getClass(), "next", null);
        setField(term252307, term252307.getClass(), "first", null);
        setField(term252307, term252307.getClass(), "last", null);
        setField(term252307, term252307.getClass(), "propListHead", null);
        setIntField(term252307, term252307.getClass(), "sourcePosition", 0);
        setField(term252307, term252307.getClass(), "jsType", null);
        setField(term252307, term252307.getClass(), "parent", null);
        setField(term252306, term252306.getClass(), "first", term252307);
        setField(term252306, term252306.getClass(), "last", null);
        setField(term252306, term252306.getClass(), "propListHead", null);
        setIntField(term252306, term252306.getClass(), "sourcePosition", 0);
        setField(term252306, term252306.getClass(), "jsType", null);
        setField(term252306, term252306.getClass(), "parent", null);
        setField(term252305, term252305.getClass(), "parameters", term252306);
        setField(term252305, term252305.getClass(), "returnType", null);
        setBooleanField(term252305, term252305.getClass(), "returnTypeInferred", false);
        setBooleanField(term252305, term252305.getClass(), "resolved", false);
        setField(term252305, term252305.getClass(), "resolveResult", null);
        setBooleanField(term252305, term252305.getClass(), "inTemplatedCheckVisit", false);
        setField(term252305, term252305.getClass(), "registry", null);
        setField(term252304, term252304.getClass(), "call", term252305);
        setField(term252304, term252304.getClass(), "prototypeSlot", null);
        setField(term252304, term252304.getClass(), "kind", null);
        setField(term252304, term252304.getClass(), "propAccess", null);
        setField(term252304, term252304.getClass(), "typeOfThis", null);
        setField(term252304, term252304.getClass(), "source", null);
        setField(term252304, term252304.getClass(), "implementedInterfaces", null);
        setField(term252304, term252304.getClass(), "extendedInterfaces", null);
        setField(term252304, term252304.getClass(), "subTypes", null);
        setField(term252304, term252304.getClass(), "templateTypeNames", null);
        setField(term252304, term252304.getClass(), "className", null);
        setField(term252304, term252304.getClass(), "properties", null);
        setBooleanField(term252304, term252304.getClass(), "nativeType", false);
        setField(term252304, term252304.getClass(), "implicitPrototypeFallback", null);
        setField(term252304, term252304.getClass(), "ownerFunction", null);
        setBooleanField(term252304, term252304.getClass(), "prettyPrint", false);
        setBooleanField(term252304, term252304.getClass(), "visited", false);
        setField(term252304, term252304.getClass(), "docInfo", null);
        setBooleanField(term252304, term252304.getClass(), "unknown", false);
        setBooleanField(term252304, term252304.getClass(), "resolved", false);
        setField(term252304, term252304.getClass(), "resolveResult", null);
        setBooleanField(term252304, term252304.getClass(), "inTemplatedCheckVisit", false);
        setField(term252304, term252304.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term251969;
        args[1] = false;
        Object retValue = callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term251565, args);
        assertTrue(recursiveEquals(term251565, term252299));
        assertTrue(recursiveEquals(term251969, term252304));
        assertTrue(recursiveEquals(retValue, null));
    }

};


