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

public class FunctionType_getExtendedInterfacesCount_385757604108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22370;

    public FunctionType_getExtendedInterfacesCount_385757604108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term91065 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term91064 = ((Class) term91065).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term91064).setAccessible(true);
        Object enum260 = ((Field) term91064).get((Object) null);
        Class<? extends Object> term91365 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term91364 = ((Class) term91365).getDeclaredField((String) "STRUCT");
        ((Field) term91364).setAccessible(true);
        Object enum261 = ((Field) term91364).get((Object) null);
        term22370 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term22371 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term22372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22399 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term22372, term22372.getClass(), "type", 1774507971);
        setIntField(term22374, term22374.getClass(), "type", -1420269858);
        setIntField(term22376, term22376.getClass(), "type", -2119545015);
        setField(term22376, term22376.getClass(), "next", null);
        setField(term22376, term22376.getClass(), "first", null);
        setField(term22376, term22376.getClass(), "last", null);
        setField(term22376, term22376.getClass(), "propListHead", null);
        setIntField(term22376, term22376.getClass(), "sourcePosition", 0);
        setField(term22376, term22376.getClass(), "jsType", null);
        setField(term22376, term22376.getClass(), "parent", null);
        setField(term22374, term22374.getClass(), "next", term22376);
        setIntField(term22379, term22379.getClass(), "type", 0);
        setField(term22379, term22379.getClass(), "next", null);
        setField(term22379, term22379.getClass(), "first", null);
        setField(term22379, term22379.getClass(), "last", null);
        setField(term22379, term22379.getClass(), "propListHead", null);
        setIntField(term22379, term22379.getClass(), "sourcePosition", 0);
        setField(term22379, term22379.getClass(), "jsType", null);
        setField(term22379, term22379.getClass(), "parent", null);
        setField(term22374, term22374.getClass(), "first", term22379);
        setIntField(term22382, term22382.getClass(), "type", -18216811);
        setField(term22382, term22382.getClass(), "next", null);
        setField(term22382, term22382.getClass(), "first", term22379);
        setField(term22382, term22382.getClass(), "last", term22382);
        setField(term22382, term22382.getClass(), "propListHead", null);
        setIntField(term22382, term22382.getClass(), "sourcePosition", 0);
        setField(term22382, term22382.getClass(), "jsType", null);
        setField(term22382, term22382.getClass(), "parent", null);
        setField(term22374, term22374.getClass(), "last", term22382);
        setField(term22374, term22374.getClass(), "propListHead", null);
        setIntField(term22374, term22374.getClass(), "sourcePosition", 0);
        setField(term22374, term22374.getClass(), "jsType", null);
        setField(term22374, term22374.getClass(), "parent", null);
        setField(term22372, term22372.getClass(), "next", term22374);
        setIntField(term22386, term22386.getClass(), "type", 1094107751);
        setIntField(term22388, term22388.getClass(), "type", 844222656);
        setField(term22388, term22388.getClass(), "next", term22382);
        setField(term22388, term22388.getClass(), "first", null);
        setField(term22388, term22388.getClass(), "last", term22372);
        setField(term22388, term22388.getClass(), "propListHead", null);
        setIntField(term22388, term22388.getClass(), "sourcePosition", 0);
        setField(term22388, term22388.getClass(), "jsType", null);
        setField(term22388, term22388.getClass(), "parent", null);
        setField(term22386, term22386.getClass(), "next", term22388);
        setField(term22386, term22386.getClass(), "first", term22386);
        setIntField(term22391, term22391.getClass(), "type", 1272542218);
        setField(term22391, term22391.getClass(), "next", null);
        setField(term22391, term22391.getClass(), "first", term22379);
        setField(term22391, term22391.getClass(), "last", term22382);
        setField(term22391, term22391.getClass(), "propListHead", null);
        setIntField(term22391, term22391.getClass(), "sourcePosition", 0);
        setField(term22391, term22391.getClass(), "jsType", null);
        setField(term22391, term22391.getClass(), "parent", null);
        setField(term22386, term22386.getClass(), "last", term22391);
        setField(term22386, term22386.getClass(), "propListHead", null);
        setIntField(term22386, term22386.getClass(), "sourcePosition", 0);
        setField(term22386, term22386.getClass(), "jsType", null);
        setField(term22386, term22386.getClass(), "parent", null);
        setField(term22372, term22372.getClass(), "first", term22386);
        setField(term22372, term22372.getClass(), "last", term22376);
        setField(term22372, term22372.getClass(), "propListHead", null);
        setIntField(term22372, term22372.getClass(), "sourcePosition", 0);
        setField(term22372, term22372.getClass(), "jsType", null);
        setField(term22372, term22372.getClass(), "parent", null);
        setField(term22371, term22371.getClass(), "parameters", term22372);
        setField(term22371, term22371.getClass(), "returnType", null);
        setBooleanField(term22371, term22371.getClass(), "returnTypeInferred", false);
        setBooleanField(term22371, term22371.getClass(), "resolved", false);
        setField(term22371, term22371.getClass(), "resolveResult", null);
        setBooleanField(term22371, term22371.getClass(), "inTemplatedCheckVisit", false);
        setField(term22371, term22371.getClass(), "registry", null);
        setField(term22370, term22370.getClass(), "call", term22371);
        setField(term22399, term22399.getClass(), "name", null);
        setField(term22399, term22399.getClass(), "type", null);
        setBooleanField(term22399, term22399.getClass(), "inferred", false);
        setField(term22399, term22399.getClass(), "propertyNode", null);
        setField(term22399, term22399.getClass(), "docInfo", null);
        setField(term22370, term22370.getClass(), "prototypeSlot", term22399);
        setField(term22370, term22370.getClass(), "kind", enum260);
        setField(term22370, term22370.getClass(), "propAccess", enum261);
        setField(term22370, term22370.getClass(), "typeOfThis", null);
        setField(term22370, term22370.getClass(), "source", null);
        setField(term22370, term22370.getClass(), "implementedInterfaces", null);
        setField(term22370, term22370.getClass(), "extendedInterfaces", null);
        setField(term22370, term22370.getClass(), "subTypes", null);
        setField(term22370, term22370.getClass(), "templateTypeNames", null);
        setField(term22370, term22370.getClass(), "className", null);
        setField(term22370, term22370.getClass(), "properties", null);
        setBooleanField(term22370, term22370.getClass(), "nativeType", false);
        setField(term22370, term22370.getClass(), "implicitPrototypeFallback", null);
        setField(term22370, term22370.getClass(), "ownerFunction", null);
        setBooleanField(term22370, term22370.getClass(), "prettyPrint", false);
        setBooleanField(term22370, term22370.getClass(), "visited", false);
        setField(term22370, term22370.getClass(), "docInfo", null);
        setBooleanField(term22370, term22370.getClass(), "unknown", false);
        setBooleanField(term22370, term22370.getClass(), "resolved", false);
        setField(term22370, term22370.getClass(), "resolveResult", null);
        setBooleanField(term22370, term22370.getClass(), "inTemplatedCheckVisit", false);
        setField(term22370, term22370.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getExtendedInterfacesCount", argTypes, term22370, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


