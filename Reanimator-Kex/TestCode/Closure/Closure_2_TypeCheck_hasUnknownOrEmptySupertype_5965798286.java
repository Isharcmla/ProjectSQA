package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TypeCheck_hasUnknownOrEmptySupertype_5965798286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6141;

    public TypeCheck_hasUnknownOrEmptySupertype_5965798286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19587 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term19586 = ((Class) term19587).getDeclaredField((String) "INTERFACE");
        ((Field) term19586).setAccessible(true);
        Object enum21 = ((Field) term19586).get((Object) null);
        Class<? extends Object> term19881 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term19880 = ((Class) term19881).getDeclaredField((String) "DICT");
        ((Field) term19880).setAccessible(true);
        Object enum22 = ((Field) term19880).get((Object) null);
        term6141 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term6142 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term6143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6170 = newInstance(Class.forName("com.google.javascript.rhino.jstype.Property"));
        setIntField(term6143, term6143.getClass(), "type", -439048495);
        setIntField(term6145, term6145.getClass(), "type", -1849105286);
        setIntField(term6147, term6147.getClass(), "type", 1334483645);
        setField(term6147, term6147.getClass(), "next", null);
        setField(term6147, term6147.getClass(), "first", null);
        setField(term6147, term6147.getClass(), "last", null);
        setField(term6147, term6147.getClass(), "propListHead", null);
        setIntField(term6147, term6147.getClass(), "sourcePosition", 0);
        setField(term6147, term6147.getClass(), "jsType", null);
        setField(term6147, term6147.getClass(), "parent", null);
        setField(term6145, term6145.getClass(), "next", term6147);
        setIntField(term6150, term6150.getClass(), "type", 0);
        setField(term6150, term6150.getClass(), "next", null);
        setField(term6150, term6150.getClass(), "first", null);
        setField(term6150, term6150.getClass(), "last", null);
        setField(term6150, term6150.getClass(), "propListHead", null);
        setIntField(term6150, term6150.getClass(), "sourcePosition", 0);
        setField(term6150, term6150.getClass(), "jsType", null);
        setField(term6150, term6150.getClass(), "parent", null);
        setField(term6145, term6145.getClass(), "first", term6150);
        setIntField(term6153, term6153.getClass(), "type", 320711637);
        setField(term6153, term6153.getClass(), "next", null);
        setField(term6153, term6153.getClass(), "first", term6150);
        setField(term6153, term6153.getClass(), "last", term6153);
        setField(term6153, term6153.getClass(), "propListHead", null);
        setIntField(term6153, term6153.getClass(), "sourcePosition", 0);
        setField(term6153, term6153.getClass(), "jsType", null);
        setField(term6153, term6153.getClass(), "parent", null);
        setField(term6145, term6145.getClass(), "last", term6153);
        setField(term6145, term6145.getClass(), "propListHead", null);
        setIntField(term6145, term6145.getClass(), "sourcePosition", 0);
        setField(term6145, term6145.getClass(), "jsType", null);
        setField(term6145, term6145.getClass(), "parent", null);
        setField(term6143, term6143.getClass(), "next", term6145);
        setIntField(term6157, term6157.getClass(), "type", -2063843486);
        setIntField(term6159, term6159.getClass(), "type", 833762980);
        setField(term6159, term6159.getClass(), "next", term6153);
        setField(term6159, term6159.getClass(), "first", null);
        setField(term6159, term6159.getClass(), "last", term6143);
        setField(term6159, term6159.getClass(), "propListHead", null);
        setIntField(term6159, term6159.getClass(), "sourcePosition", 0);
        setField(term6159, term6159.getClass(), "jsType", null);
        setField(term6159, term6159.getClass(), "parent", null);
        setField(term6157, term6157.getClass(), "next", term6159);
        setField(term6157, term6157.getClass(), "first", term6157);
        setIntField(term6162, term6162.getClass(), "type", 917513193);
        setField(term6162, term6162.getClass(), "next", null);
        setField(term6162, term6162.getClass(), "first", term6150);
        setField(term6162, term6162.getClass(), "last", term6153);
        setField(term6162, term6162.getClass(), "propListHead", null);
        setIntField(term6162, term6162.getClass(), "sourcePosition", 0);
        setField(term6162, term6162.getClass(), "jsType", null);
        setField(term6162, term6162.getClass(), "parent", null);
        setField(term6157, term6157.getClass(), "last", term6162);
        setField(term6157, term6157.getClass(), "propListHead", null);
        setIntField(term6157, term6157.getClass(), "sourcePosition", 0);
        setField(term6157, term6157.getClass(), "jsType", null);
        setField(term6157, term6157.getClass(), "parent", null);
        setField(term6143, term6143.getClass(), "first", term6157);
        setField(term6143, term6143.getClass(), "last", term6147);
        setField(term6143, term6143.getClass(), "propListHead", null);
        setIntField(term6143, term6143.getClass(), "sourcePosition", 0);
        setField(term6143, term6143.getClass(), "jsType", null);
        setField(term6143, term6143.getClass(), "parent", null);
        setField(term6142, term6142.getClass(), "parameters", term6143);
        setField(term6142, term6142.getClass(), "returnType", null);
        setBooleanField(term6142, term6142.getClass(), "returnTypeInferred", false);
        setBooleanField(term6142, term6142.getClass(), "resolved", false);
        setField(term6142, term6142.getClass(), "resolveResult", null);
        setField(term6142, term6142.getClass(), "templateKeys", null);
        setField(term6142, term6142.getClass(), "templatizedTypes", null);
        setBooleanField(term6142, term6142.getClass(), "inTemplatedCheckVisit", false);
        setField(term6142, term6142.getClass(), "registry", null);
        setField(term6141, term6141.getClass(), "call", term6142);
        setField(term6170, term6170.getClass(), "name", null);
        setField(term6170, term6170.getClass(), "type", null);
        setBooleanField(term6170, term6170.getClass(), "inferred", false);
        setField(term6170, term6170.getClass(), "propertyNode", null);
        setField(term6170, term6170.getClass(), "docInfo", null);
        setField(term6141, term6141.getClass(), "prototypeSlot", term6170);
        setField(term6141, term6141.getClass(), "kind", enum21);
        setField(term6141, term6141.getClass(), "propAccess", enum22);
        setField(term6141, term6141.getClass(), "typeOfThis", null);
        setField(term6141, term6141.getClass(), "source", null);
        setField(term6141, term6141.getClass(), "implementedInterfaces", null);
        setField(term6141, term6141.getClass(), "extendedInterfaces", null);
        setField(term6141, term6141.getClass(), "subTypes", null);
        setField(term6141, term6141.getClass(), "className", null);
        setField(term6141, term6141.getClass(), "properties", null);
        setBooleanField(term6141, term6141.getClass(), "nativeType", false);
        setField(term6141, term6141.getClass(), "implicitPrototypeFallback", null);
        setField(term6141, term6141.getClass(), "ownerFunction", null);
        setBooleanField(term6141, term6141.getClass(), "prettyPrint", false);
        setBooleanField(term6141, term6141.getClass(), "visited", false);
        setField(term6141, term6141.getClass(), "docInfo", null);
        setBooleanField(term6141, term6141.getClass(), "unknown", false);
        setBooleanField(term6141, term6141.getClass(), "resolved", false);
        setField(term6141, term6141.getClass(), "resolveResult", null);
        setField(term6141, term6141.getClass(), "templateKeys", null);
        setField(term6141, term6141.getClass(), "templatizedTypes", null);
        setBooleanField(term6141, term6141.getClass(), "inTemplatedCheckVisit", false);
        setField(term6141, term6141.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term6141;
        try {
            callMethod(klass, "hasUnknownOrEmptySupertype", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


