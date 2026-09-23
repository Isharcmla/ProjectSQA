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

public class FunctionType_tryMergeFunctionPiecewise_2003411845319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207513;
     Object term207917;
     Object term208375;
     Object term208380;

    public FunctionType_tryMergeFunctionPiecewise_2003411845319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207513 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term207607 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term207677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term208256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term207747, term207747.getClass(), "jsType", null);
        setField(term208256, term208256.getClass(), "jsType", null);
        setField(term208256, term208256.getClass(), "next", null);
        setField(term207747, term207747.getClass(), "next", term208256);
        setField(term207677, term207677.getClass(), "first", term207747);
        setField(term207607, term207607.getClass(), "parameters", term207677);
        setField(term207513, term207513.getClass(), "call", term207607);
        term207917 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term208011 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term208081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term208151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term208221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term208151, term208151.getClass(), "jsType", null);
        setField(term208221, term208221.getClass(), "jsType", null);
        setField(term208221, term208221.getClass(), "next", term208256);
        setField(term208151, term208151.getClass(), "next", term208221);
        setField(term208081, term208081.getClass(), "first", term208151);
        setField(term208011, term208011.getClass(), "parameters", term208081);
        setField(term207917, term207917.getClass(), "call", term208011);
        term208375 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term208376 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term208377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term208378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term208379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term208377, term208377.getClass(), "type", 0);
        setField(term208377, term208377.getClass(), "next", null);
        setIntField(term208378, term208378.getClass(), "type", 0);
        setIntField(term208379, term208379.getClass(), "type", 0);
        setField(term208379, term208379.getClass(), "next", null);
        setField(term208379, term208379.getClass(), "first", null);
        setField(term208379, term208379.getClass(), "last", null);
        setField(term208379, term208379.getClass(), "propListHead", null);
        setIntField(term208379, term208379.getClass(), "sourcePosition", 0);
        setField(term208379, term208379.getClass(), "jsType", null);
        setField(term208379, term208379.getClass(), "parent", null);
        setField(term208378, term208378.getClass(), "next", term208379);
        setField(term208378, term208378.getClass(), "first", null);
        setField(term208378, term208378.getClass(), "last", null);
        setField(term208378, term208378.getClass(), "propListHead", null);
        setIntField(term208378, term208378.getClass(), "sourcePosition", 0);
        setField(term208378, term208378.getClass(), "jsType", null);
        setField(term208378, term208378.getClass(), "parent", null);
        setField(term208377, term208377.getClass(), "first", term208378);
        setField(term208377, term208377.getClass(), "last", null);
        setField(term208377, term208377.getClass(), "propListHead", null);
        setIntField(term208377, term208377.getClass(), "sourcePosition", 0);
        setField(term208377, term208377.getClass(), "jsType", null);
        setField(term208377, term208377.getClass(), "parent", null);
        setField(term208376, term208376.getClass(), "parameters", term208377);
        setField(term208376, term208376.getClass(), "returnType", null);
        setBooleanField(term208376, term208376.getClass(), "returnTypeInferred", false);
        setBooleanField(term208376, term208376.getClass(), "resolved", false);
        setField(term208376, term208376.getClass(), "resolveResult", null);
        setField(term208376, term208376.getClass(), "registry", null);
        setField(term208375, term208375.getClass(), "call", term208376);
        setField(term208375, term208375.getClass(), "prototype", null);
        setField(term208375, term208375.getClass(), "kind", null);
        setField(term208375, term208375.getClass(), "typeOfThis", null);
        setField(term208375, term208375.getClass(), "source", null);
        setField(term208375, term208375.getClass(), "implementedInterfaces", null);
        setField(term208375, term208375.getClass(), "subTypes", null);
        setField(term208375, term208375.getClass(), "templateTypeName", null);
        setField(term208375, term208375.getClass(), "className", null);
        setField(term208375, term208375.getClass(), "properties", null);
        setBooleanField(term208375, term208375.getClass(), "nativeType", false);
        setField(term208375, term208375.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term208375, term208375.getClass(), "prettyPrint", false);
        setBooleanField(term208375, term208375.getClass(), "visited", false);
        setField(term208375, term208375.getClass(), "docInfo", null);
        setBooleanField(term208375, term208375.getClass(), "unknown", false);
        setBooleanField(term208375, term208375.getClass(), "resolved", false);
        setField(term208375, term208375.getClass(), "resolveResult", null);
        setField(term208375, term208375.getClass(), "registry", null);
        term208380 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term208381 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term208382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term208383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term208384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term208385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term208382, term208382.getClass(), "type", 0);
        setField(term208382, term208382.getClass(), "next", null);
        setIntField(term208383, term208383.getClass(), "type", 0);
        setIntField(term208384, term208384.getClass(), "type", 0);
        setIntField(term208385, term208385.getClass(), "type", 0);
        setField(term208385, term208385.getClass(), "next", null);
        setField(term208385, term208385.getClass(), "first", null);
        setField(term208385, term208385.getClass(), "last", null);
        setField(term208385, term208385.getClass(), "propListHead", null);
        setIntField(term208385, term208385.getClass(), "sourcePosition", 0);
        setField(term208385, term208385.getClass(), "jsType", null);
        setField(term208385, term208385.getClass(), "parent", null);
        setField(term208384, term208384.getClass(), "next", term208385);
        setField(term208384, term208384.getClass(), "first", null);
        setField(term208384, term208384.getClass(), "last", null);
        setField(term208384, term208384.getClass(), "propListHead", null);
        setIntField(term208384, term208384.getClass(), "sourcePosition", 0);
        setField(term208384, term208384.getClass(), "jsType", null);
        setField(term208384, term208384.getClass(), "parent", null);
        setField(term208383, term208383.getClass(), "next", term208384);
        setField(term208383, term208383.getClass(), "first", null);
        setField(term208383, term208383.getClass(), "last", null);
        setField(term208383, term208383.getClass(), "propListHead", null);
        setIntField(term208383, term208383.getClass(), "sourcePosition", 0);
        setField(term208383, term208383.getClass(), "jsType", null);
        setField(term208383, term208383.getClass(), "parent", null);
        setField(term208382, term208382.getClass(), "first", term208383);
        setField(term208382, term208382.getClass(), "last", null);
        setField(term208382, term208382.getClass(), "propListHead", null);
        setIntField(term208382, term208382.getClass(), "sourcePosition", 0);
        setField(term208382, term208382.getClass(), "jsType", null);
        setField(term208382, term208382.getClass(), "parent", null);
        setField(term208381, term208381.getClass(), "parameters", term208382);
        setField(term208381, term208381.getClass(), "returnType", null);
        setBooleanField(term208381, term208381.getClass(), "returnTypeInferred", false);
        setBooleanField(term208381, term208381.getClass(), "resolved", false);
        setField(term208381, term208381.getClass(), "resolveResult", null);
        setField(term208381, term208381.getClass(), "registry", null);
        setField(term208380, term208380.getClass(), "call", term208381);
        setField(term208380, term208380.getClass(), "prototype", null);
        setField(term208380, term208380.getClass(), "kind", null);
        setField(term208380, term208380.getClass(), "typeOfThis", null);
        setField(term208380, term208380.getClass(), "source", null);
        setField(term208380, term208380.getClass(), "implementedInterfaces", null);
        setField(term208380, term208380.getClass(), "subTypes", null);
        setField(term208380, term208380.getClass(), "templateTypeName", null);
        setField(term208380, term208380.getClass(), "className", null);
        setField(term208380, term208380.getClass(), "properties", null);
        setBooleanField(term208380, term208380.getClass(), "nativeType", false);
        setField(term208380, term208380.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term208380, term208380.getClass(), "prettyPrint", false);
        setBooleanField(term208380, term208380.getClass(), "visited", false);
        setField(term208380, term208380.getClass(), "docInfo", null);
        setBooleanField(term208380, term208380.getClass(), "unknown", false);
        setBooleanField(term208380, term208380.getClass(), "resolved", false);
        setField(term208380, term208380.getClass(), "resolveResult", null);
        setField(term208380, term208380.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term207917;
        args[1] = false;
        Object retValue = callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term207513, args);
        assertTrue(recursiveEquals(term207513, term208375));
        assertTrue(recursiveEquals(term207917, term208380));
        assertTrue(recursiveEquals(retValue, null));
    }

};


