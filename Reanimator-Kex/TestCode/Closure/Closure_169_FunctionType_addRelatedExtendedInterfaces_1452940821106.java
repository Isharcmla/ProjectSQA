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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FunctionType_addRelatedExtendedInterfaces_1452940821106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21033;
     Object term21095;

    public FunctionType_addRelatedExtendedInterfaces_1452940821106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term88934 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term88933 = ((Class) term88934).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term88933).setAccessible(true);
        Object enum254 = ((Field) term88933).get((Object) null);
        Class<? extends Object> term90749 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term90748 = ((Class) term90749).getDeclaredField((String) "STRUCT");
        ((Field) term90748).setAccessible(true);
        Object enum259 = ((Field) term90748).get((Object) null);
        term21033 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term21034 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term21035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21062 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term21035, term21035.getClass(), "type", 1741500243);
        setIntField(term21037, term21037.getClass(), "type", -2070466617);
        setIntField(term21039, term21039.getClass(), "type", -1127721881);
        setField(term21039, term21039.getClass(), "next", null);
        setField(term21039, term21039.getClass(), "first", null);
        setField(term21039, term21039.getClass(), "last", null);
        setField(term21039, term21039.getClass(), "propListHead", null);
        setIntField(term21039, term21039.getClass(), "sourcePosition", 0);
        setField(term21039, term21039.getClass(), "jsType", null);
        setField(term21039, term21039.getClass(), "parent", null);
        setField(term21037, term21037.getClass(), "next", term21039);
        setIntField(term21042, term21042.getClass(), "type", 0);
        setField(term21042, term21042.getClass(), "next", null);
        setField(term21042, term21042.getClass(), "first", null);
        setField(term21042, term21042.getClass(), "last", null);
        setField(term21042, term21042.getClass(), "propListHead", null);
        setIntField(term21042, term21042.getClass(), "sourcePosition", 0);
        setField(term21042, term21042.getClass(), "jsType", null);
        setField(term21042, term21042.getClass(), "parent", null);
        setField(term21037, term21037.getClass(), "first", term21042);
        setIntField(term21045, term21045.getClass(), "type", 1048271679);
        setField(term21045, term21045.getClass(), "next", null);
        setField(term21045, term21045.getClass(), "first", term21042);
        setField(term21045, term21045.getClass(), "last", term21045);
        setField(term21045, term21045.getClass(), "propListHead", null);
        setIntField(term21045, term21045.getClass(), "sourcePosition", 0);
        setField(term21045, term21045.getClass(), "jsType", null);
        setField(term21045, term21045.getClass(), "parent", null);
        setField(term21037, term21037.getClass(), "last", term21045);
        setField(term21037, term21037.getClass(), "propListHead", null);
        setIntField(term21037, term21037.getClass(), "sourcePosition", 0);
        setField(term21037, term21037.getClass(), "jsType", null);
        setField(term21037, term21037.getClass(), "parent", null);
        setField(term21035, term21035.getClass(), "next", term21037);
        setIntField(term21049, term21049.getClass(), "type", 798043553);
        setIntField(term21051, term21051.getClass(), "type", 533197381);
        setField(term21051, term21051.getClass(), "next", term21045);
        setField(term21051, term21051.getClass(), "first", null);
        setField(term21051, term21051.getClass(), "last", term21035);
        setField(term21051, term21051.getClass(), "propListHead", null);
        setIntField(term21051, term21051.getClass(), "sourcePosition", 0);
        setField(term21051, term21051.getClass(), "jsType", null);
        setField(term21051, term21051.getClass(), "parent", null);
        setField(term21049, term21049.getClass(), "next", term21051);
        setField(term21049, term21049.getClass(), "first", term21049);
        setIntField(term21054, term21054.getClass(), "type", 1074848808);
        setField(term21054, term21054.getClass(), "next", null);
        setField(term21054, term21054.getClass(), "first", term21042);
        setField(term21054, term21054.getClass(), "last", term21045);
        setField(term21054, term21054.getClass(), "propListHead", null);
        setIntField(term21054, term21054.getClass(), "sourcePosition", 0);
        setField(term21054, term21054.getClass(), "jsType", null);
        setField(term21054, term21054.getClass(), "parent", null);
        setField(term21049, term21049.getClass(), "last", term21054);
        setField(term21049, term21049.getClass(), "propListHead", null);
        setIntField(term21049, term21049.getClass(), "sourcePosition", 0);
        setField(term21049, term21049.getClass(), "jsType", null);
        setField(term21049, term21049.getClass(), "parent", null);
        setField(term21035, term21035.getClass(), "first", term21049);
        setField(term21035, term21035.getClass(), "last", term21039);
        setField(term21035, term21035.getClass(), "propListHead", null);
        setIntField(term21035, term21035.getClass(), "sourcePosition", 0);
        setField(term21035, term21035.getClass(), "jsType", null);
        setField(term21035, term21035.getClass(), "parent", null);
        setField(term21034, term21034.getClass(), "parameters", term21035);
        setField(term21034, term21034.getClass(), "returnType", null);
        setBooleanField(term21034, term21034.getClass(), "returnTypeInferred", false);
        setBooleanField(term21034, term21034.getClass(), "resolved", false);
        setField(term21034, term21034.getClass(), "resolveResult", null);
        setBooleanField(term21034, term21034.getClass(), "inTemplatedCheckVisit", false);
        setField(term21034, term21034.getClass(), "registry", null);
        setField(term21033, term21033.getClass(), "call", term21034);
        setField(term21062, term21062.getClass(), "name", null);
        setField(term21062, term21062.getClass(), "type", null);
        setBooleanField(term21062, term21062.getClass(), "inferred", false);
        setField(term21062, term21062.getClass(), "propertyNode", null);
        setField(term21062, term21062.getClass(), "docInfo", null);
        setField(term21033, term21033.getClass(), "prototypeSlot", term21062);
        setField(term21033, term21033.getClass(), "kind", enum254);
        setField(term21033, term21033.getClass(), "propAccess", enum259);
        setField(term21033, term21033.getClass(), "typeOfThis", null);
        setField(term21033, term21033.getClass(), "source", null);
        setField(term21033, term21033.getClass(), "implementedInterfaces", null);
        setField(term21033, term21033.getClass(), "extendedInterfaces", null);
        setField(term21033, term21033.getClass(), "subTypes", null);
        setField(term21033, term21033.getClass(), "templateTypeNames", null);
        setField(term21033, term21033.getClass(), "className", null);
        setField(term21033, term21033.getClass(), "properties", null);
        setBooleanField(term21033, term21033.getClass(), "nativeType", false);
        setField(term21033, term21033.getClass(), "implicitPrototypeFallback", null);
        setField(term21033, term21033.getClass(), "ownerFunction", null);
        setBooleanField(term21033, term21033.getClass(), "prettyPrint", false);
        setBooleanField(term21033, term21033.getClass(), "visited", false);
        setField(term21033, term21033.getClass(), "docInfo", null);
        setBooleanField(term21033, term21033.getClass(), "unknown", false);
        setBooleanField(term21033, term21033.getClass(), "resolved", false);
        setField(term21033, term21033.getClass(), "resolveResult", null);
        setBooleanField(term21033, term21033.getClass(), "inTemplatedCheckVisit", false);
        setField(term21033, term21033.getClass(), "registry", null);
        HashMap term21096 = new HashMap();
        Set<Object> term91063 =  ((Map) term21096).keySet();
        term21095 = new HashSet((Collection<? extends Object>) term91063);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term21095;
        try {
            callMethod(klass, "addRelatedExtendedInterfaces", argTypes, term21033, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


