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

public class FunctionType_getAllExtendedInterfaces_1030455110105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20372;

    public FunctionType_getAllExtendedInterfaces_1030455110105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term87480 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term87479 = ((Class) term87480).getDeclaredField((String) "INTERFACE");
        ((Field) term87479).setAccessible(true);
        Object enum250 = ((Field) term87479).get((Object) null);
        Class<? extends Object> term87774 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term87773 = ((Class) term87774).getDeclaredField((String) "DICT");
        ((Field) term87773).setAccessible(true);
        Object enum251 = ((Field) term87773).get((Object) null);
        term20372 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term20373 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term20374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20401 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term20374, term20374.getClass(), "type", 1295839803);
        setIntField(term20376, term20376.getClass(), "type", -1891015523);
        setIntField(term20378, term20378.getClass(), "type", -1560631747);
        setField(term20378, term20378.getClass(), "next", null);
        setField(term20378, term20378.getClass(), "first", null);
        setField(term20378, term20378.getClass(), "last", null);
        setField(term20378, term20378.getClass(), "propListHead", null);
        setIntField(term20378, term20378.getClass(), "sourcePosition", 0);
        setField(term20378, term20378.getClass(), "jsType", null);
        setField(term20378, term20378.getClass(), "parent", null);
        setField(term20376, term20376.getClass(), "next", term20378);
        setIntField(term20381, term20381.getClass(), "type", 0);
        setField(term20381, term20381.getClass(), "next", null);
        setField(term20381, term20381.getClass(), "first", null);
        setField(term20381, term20381.getClass(), "last", null);
        setField(term20381, term20381.getClass(), "propListHead", null);
        setIntField(term20381, term20381.getClass(), "sourcePosition", 0);
        setField(term20381, term20381.getClass(), "jsType", null);
        setField(term20381, term20381.getClass(), "parent", null);
        setField(term20376, term20376.getClass(), "first", term20381);
        setIntField(term20384, term20384.getClass(), "type", -220791533);
        setField(term20384, term20384.getClass(), "next", null);
        setField(term20384, term20384.getClass(), "first", term20381);
        setField(term20384, term20384.getClass(), "last", term20384);
        setField(term20384, term20384.getClass(), "propListHead", null);
        setIntField(term20384, term20384.getClass(), "sourcePosition", 0);
        setField(term20384, term20384.getClass(), "jsType", null);
        setField(term20384, term20384.getClass(), "parent", null);
        setField(term20376, term20376.getClass(), "last", term20384);
        setField(term20376, term20376.getClass(), "propListHead", null);
        setIntField(term20376, term20376.getClass(), "sourcePosition", 0);
        setField(term20376, term20376.getClass(), "jsType", null);
        setField(term20376, term20376.getClass(), "parent", null);
        setField(term20374, term20374.getClass(), "next", term20376);
        setIntField(term20388, term20388.getClass(), "type", -1972436591);
        setIntField(term20390, term20390.getClass(), "type", 68922753);
        setField(term20390, term20390.getClass(), "next", term20384);
        setField(term20390, term20390.getClass(), "first", null);
        setField(term20390, term20390.getClass(), "last", term20374);
        setField(term20390, term20390.getClass(), "propListHead", null);
        setIntField(term20390, term20390.getClass(), "sourcePosition", 0);
        setField(term20390, term20390.getClass(), "jsType", null);
        setField(term20390, term20390.getClass(), "parent", null);
        setField(term20388, term20388.getClass(), "next", term20390);
        setField(term20388, term20388.getClass(), "first", term20388);
        setIntField(term20393, term20393.getClass(), "type", 1215150180);
        setField(term20393, term20393.getClass(), "next", null);
        setField(term20393, term20393.getClass(), "first", term20381);
        setField(term20393, term20393.getClass(), "last", term20384);
        setField(term20393, term20393.getClass(), "propListHead", null);
        setIntField(term20393, term20393.getClass(), "sourcePosition", 0);
        setField(term20393, term20393.getClass(), "jsType", null);
        setField(term20393, term20393.getClass(), "parent", null);
        setField(term20388, term20388.getClass(), "last", term20393);
        setField(term20388, term20388.getClass(), "propListHead", null);
        setIntField(term20388, term20388.getClass(), "sourcePosition", 0);
        setField(term20388, term20388.getClass(), "jsType", null);
        setField(term20388, term20388.getClass(), "parent", null);
        setField(term20374, term20374.getClass(), "first", term20388);
        setField(term20374, term20374.getClass(), "last", term20378);
        setField(term20374, term20374.getClass(), "propListHead", null);
        setIntField(term20374, term20374.getClass(), "sourcePosition", 0);
        setField(term20374, term20374.getClass(), "jsType", null);
        setField(term20374, term20374.getClass(), "parent", null);
        setField(term20373, term20373.getClass(), "parameters", term20374);
        setField(term20373, term20373.getClass(), "returnType", null);
        setBooleanField(term20373, term20373.getClass(), "returnTypeInferred", false);
        setBooleanField(term20373, term20373.getClass(), "resolved", false);
        setField(term20373, term20373.getClass(), "resolveResult", null);
        setBooleanField(term20373, term20373.getClass(), "inTemplatedCheckVisit", false);
        setField(term20373, term20373.getClass(), "registry", null);
        setField(term20372, term20372.getClass(), "call", term20373);
        setField(term20401, term20401.getClass(), "name", null);
        setField(term20401, term20401.getClass(), "type", null);
        setBooleanField(term20401, term20401.getClass(), "inferred", false);
        setField(term20401, term20401.getClass(), "propertyNode", null);
        setField(term20401, term20401.getClass(), "docInfo", null);
        setField(term20372, term20372.getClass(), "prototypeSlot", term20401);
        setField(term20372, term20372.getClass(), "kind", enum250);
        setField(term20372, term20372.getClass(), "propAccess", enum251);
        setField(term20372, term20372.getClass(), "typeOfThis", null);
        setField(term20372, term20372.getClass(), "source", null);
        setField(term20372, term20372.getClass(), "implementedInterfaces", null);
        setField(term20372, term20372.getClass(), "extendedInterfaces", null);
        setField(term20372, term20372.getClass(), "subTypes", null);
        setField(term20372, term20372.getClass(), "templateTypeNames", null);
        setField(term20372, term20372.getClass(), "className", null);
        setField(term20372, term20372.getClass(), "properties", null);
        setBooleanField(term20372, term20372.getClass(), "nativeType", false);
        setField(term20372, term20372.getClass(), "implicitPrototypeFallback", null);
        setField(term20372, term20372.getClass(), "ownerFunction", null);
        setBooleanField(term20372, term20372.getClass(), "prettyPrint", false);
        setBooleanField(term20372, term20372.getClass(), "visited", false);
        setField(term20372, term20372.getClass(), "docInfo", null);
        setBooleanField(term20372, term20372.getClass(), "unknown", false);
        setBooleanField(term20372, term20372.getClass(), "resolved", false);
        setField(term20372, term20372.getClass(), "resolveResult", null);
        setBooleanField(term20372, term20372.getClass(), "inTemplatedCheckVisit", false);
        setField(term20372, term20372.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllExtendedInterfaces", argTypes, term20372, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


