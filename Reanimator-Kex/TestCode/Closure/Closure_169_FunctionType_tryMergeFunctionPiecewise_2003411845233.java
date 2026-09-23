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

public class FunctionType_tryMergeFunctionPiecewise_2003411845233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238128;
     Object term238462;
     Object term238691;
     Object term238695;

    public FunctionType_tryMergeFunctionPiecewise_2003411845233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238128 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term238222 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term238292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term238362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term238292, term238292.getClass(), "first", term238362);
        setField(term238222, term238222.getClass(), "parameters", term238292);
        setField(term238128, term238128.getClass(), "call", term238222);
        term238462 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term238556 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term238626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term238626, term238626.getClass(), "first", null);
        setField(term238556, term238556.getClass(), "parameters", term238626);
        setField(term238462, term238462.getClass(), "call", term238556);
        term238691 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term238692 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term238693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term238694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term238693, term238693.getClass(), "type", 0);
        setField(term238693, term238693.getClass(), "next", null);
        setIntField(term238694, term238694.getClass(), "type", 0);
        setField(term238694, term238694.getClass(), "next", null);
        setField(term238694, term238694.getClass(), "first", null);
        setField(term238694, term238694.getClass(), "last", null);
        setField(term238694, term238694.getClass(), "propListHead", null);
        setIntField(term238694, term238694.getClass(), "sourcePosition", 0);
        setField(term238694, term238694.getClass(), "jsType", null);
        setField(term238694, term238694.getClass(), "parent", null);
        setField(term238693, term238693.getClass(), "first", term238694);
        setField(term238693, term238693.getClass(), "last", null);
        setField(term238693, term238693.getClass(), "propListHead", null);
        setIntField(term238693, term238693.getClass(), "sourcePosition", 0);
        setField(term238693, term238693.getClass(), "jsType", null);
        setField(term238693, term238693.getClass(), "parent", null);
        setField(term238692, term238692.getClass(), "parameters", term238693);
        setField(term238692, term238692.getClass(), "returnType", null);
        setBooleanField(term238692, term238692.getClass(), "returnTypeInferred", false);
        setBooleanField(term238692, term238692.getClass(), "resolved", false);
        setField(term238692, term238692.getClass(), "resolveResult", null);
        setBooleanField(term238692, term238692.getClass(), "inTemplatedCheckVisit", false);
        setField(term238692, term238692.getClass(), "registry", null);
        setField(term238691, term238691.getClass(), "call", term238692);
        setField(term238691, term238691.getClass(), "prototypeSlot", null);
        setField(term238691, term238691.getClass(), "kind", null);
        setField(term238691, term238691.getClass(), "propAccess", null);
        setField(term238691, term238691.getClass(), "typeOfThis", null);
        setField(term238691, term238691.getClass(), "source", null);
        setField(term238691, term238691.getClass(), "implementedInterfaces", null);
        setField(term238691, term238691.getClass(), "extendedInterfaces", null);
        setField(term238691, term238691.getClass(), "subTypes", null);
        setField(term238691, term238691.getClass(), "templateTypeNames", null);
        setField(term238691, term238691.getClass(), "className", null);
        setField(term238691, term238691.getClass(), "properties", null);
        setBooleanField(term238691, term238691.getClass(), "nativeType", false);
        setField(term238691, term238691.getClass(), "implicitPrototypeFallback", null);
        setField(term238691, term238691.getClass(), "ownerFunction", null);
        setBooleanField(term238691, term238691.getClass(), "prettyPrint", false);
        setBooleanField(term238691, term238691.getClass(), "visited", false);
        setField(term238691, term238691.getClass(), "docInfo", null);
        setBooleanField(term238691, term238691.getClass(), "unknown", false);
        setBooleanField(term238691, term238691.getClass(), "resolved", false);
        setField(term238691, term238691.getClass(), "resolveResult", null);
        setBooleanField(term238691, term238691.getClass(), "inTemplatedCheckVisit", false);
        setField(term238691, term238691.getClass(), "registry", null);
        term238695 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term238696 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term238697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term238697, term238697.getClass(), "type", 0);
        setField(term238697, term238697.getClass(), "next", null);
        setField(term238697, term238697.getClass(), "first", null);
        setField(term238697, term238697.getClass(), "last", null);
        setField(term238697, term238697.getClass(), "propListHead", null);
        setIntField(term238697, term238697.getClass(), "sourcePosition", 0);
        setField(term238697, term238697.getClass(), "jsType", null);
        setField(term238697, term238697.getClass(), "parent", null);
        setField(term238696, term238696.getClass(), "parameters", term238697);
        setField(term238696, term238696.getClass(), "returnType", null);
        setBooleanField(term238696, term238696.getClass(), "returnTypeInferred", false);
        setBooleanField(term238696, term238696.getClass(), "resolved", false);
        setField(term238696, term238696.getClass(), "resolveResult", null);
        setBooleanField(term238696, term238696.getClass(), "inTemplatedCheckVisit", false);
        setField(term238696, term238696.getClass(), "registry", null);
        setField(term238695, term238695.getClass(), "call", term238696);
        setField(term238695, term238695.getClass(), "prototypeSlot", null);
        setField(term238695, term238695.getClass(), "kind", null);
        setField(term238695, term238695.getClass(), "propAccess", null);
        setField(term238695, term238695.getClass(), "typeOfThis", null);
        setField(term238695, term238695.getClass(), "source", null);
        setField(term238695, term238695.getClass(), "implementedInterfaces", null);
        setField(term238695, term238695.getClass(), "extendedInterfaces", null);
        setField(term238695, term238695.getClass(), "subTypes", null);
        setField(term238695, term238695.getClass(), "templateTypeNames", null);
        setField(term238695, term238695.getClass(), "className", null);
        setField(term238695, term238695.getClass(), "properties", null);
        setBooleanField(term238695, term238695.getClass(), "nativeType", false);
        setField(term238695, term238695.getClass(), "implicitPrototypeFallback", null);
        setField(term238695, term238695.getClass(), "ownerFunction", null);
        setBooleanField(term238695, term238695.getClass(), "prettyPrint", false);
        setBooleanField(term238695, term238695.getClass(), "visited", false);
        setField(term238695, term238695.getClass(), "docInfo", null);
        setBooleanField(term238695, term238695.getClass(), "unknown", false);
        setBooleanField(term238695, term238695.getClass(), "resolved", false);
        setField(term238695, term238695.getClass(), "resolveResult", null);
        setBooleanField(term238695, term238695.getClass(), "inTemplatedCheckVisit", false);
        setField(term238695, term238695.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term238462;
        args[1] = false;
        Object retValue = callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term238128, args);
        assertTrue(recursiveEquals(term238128, term238691));
        assertTrue(recursiveEquals(term238462, term238695));
        assertTrue(recursiveEquals(retValue, null));
    }

};


