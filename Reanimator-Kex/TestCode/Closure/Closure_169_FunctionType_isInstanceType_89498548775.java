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

public class FunctionType_isInstanceType_89498548775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276;

    public FunctionType_isInstanceType_89498548775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50605 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term50604 = ((Class) term50605).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term50604).setAccessible(true);
        Object enum146 = ((Field) term50604).get((Object) null);
        Class<? extends Object> term50905 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term50904 = ((Class) term50905).getDeclaredField((String) "STRUCT");
        ((Field) term50904).setAccessible(true);
        Object enum147 = ((Field) term50904).get((Object) null);
        term276 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term277 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term305 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term278, term278.getClass(), "type", -184153539);
        setIntField(term280, term280.getClass(), "type", 493620644);
        setIntField(term282, term282.getClass(), "type", 1328271830);
        setField(term282, term282.getClass(), "next", null);
        setField(term282, term282.getClass(), "first", null);
        setField(term282, term282.getClass(), "last", null);
        setField(term282, term282.getClass(), "propListHead", null);
        setIntField(term282, term282.getClass(), "sourcePosition", 0);
        setField(term282, term282.getClass(), "jsType", null);
        setField(term282, term282.getClass(), "parent", null);
        setField(term280, term280.getClass(), "next", term282);
        setIntField(term285, term285.getClass(), "type", 0);
        setField(term285, term285.getClass(), "next", null);
        setField(term285, term285.getClass(), "first", null);
        setField(term285, term285.getClass(), "last", null);
        setField(term285, term285.getClass(), "propListHead", null);
        setIntField(term285, term285.getClass(), "sourcePosition", 0);
        setField(term285, term285.getClass(), "jsType", null);
        setField(term285, term285.getClass(), "parent", null);
        setField(term280, term280.getClass(), "first", term285);
        setIntField(term288, term288.getClass(), "type", 1225272962);
        setField(term288, term288.getClass(), "next", null);
        setField(term288, term288.getClass(), "first", term285);
        setField(term288, term288.getClass(), "last", term288);
        setField(term288, term288.getClass(), "propListHead", null);
        setIntField(term288, term288.getClass(), "sourcePosition", 0);
        setField(term288, term288.getClass(), "jsType", null);
        setField(term288, term288.getClass(), "parent", null);
        setField(term280, term280.getClass(), "last", term288);
        setField(term280, term280.getClass(), "propListHead", null);
        setIntField(term280, term280.getClass(), "sourcePosition", 0);
        setField(term280, term280.getClass(), "jsType", null);
        setField(term280, term280.getClass(), "parent", null);
        setField(term278, term278.getClass(), "next", term280);
        setIntField(term292, term292.getClass(), "type", -1371869594);
        setIntField(term294, term294.getClass(), "type", -2095575670);
        setField(term294, term294.getClass(), "next", term288);
        setField(term294, term294.getClass(), "first", null);
        setField(term294, term294.getClass(), "last", term278);
        setField(term294, term294.getClass(), "propListHead", null);
        setIntField(term294, term294.getClass(), "sourcePosition", 0);
        setField(term294, term294.getClass(), "jsType", null);
        setField(term294, term294.getClass(), "parent", null);
        setField(term292, term292.getClass(), "next", term294);
        setField(term292, term292.getClass(), "first", term292);
        setIntField(term297, term297.getClass(), "type", 1596070772);
        setField(term297, term297.getClass(), "next", null);
        setField(term297, term297.getClass(), "first", term285);
        setField(term297, term297.getClass(), "last", term288);
        setField(term297, term297.getClass(), "propListHead", null);
        setIntField(term297, term297.getClass(), "sourcePosition", 0);
        setField(term297, term297.getClass(), "jsType", null);
        setField(term297, term297.getClass(), "parent", null);
        setField(term292, term292.getClass(), "last", term297);
        setField(term292, term292.getClass(), "propListHead", null);
        setIntField(term292, term292.getClass(), "sourcePosition", 0);
        setField(term292, term292.getClass(), "jsType", null);
        setField(term292, term292.getClass(), "parent", null);
        setField(term278, term278.getClass(), "first", term292);
        setField(term278, term278.getClass(), "last", term282);
        setField(term278, term278.getClass(), "propListHead", null);
        setIntField(term278, term278.getClass(), "sourcePosition", 0);
        setField(term278, term278.getClass(), "jsType", null);
        setField(term278, term278.getClass(), "parent", null);
        setField(term277, term277.getClass(), "parameters", term278);
        setField(term277, term277.getClass(), "returnType", null);
        setBooleanField(term277, term277.getClass(), "returnTypeInferred", false);
        setBooleanField(term277, term277.getClass(), "resolved", false);
        setField(term277, term277.getClass(), "resolveResult", null);
        setBooleanField(term277, term277.getClass(), "inTemplatedCheckVisit", false);
        setField(term277, term277.getClass(), "registry", null);
        setField(term276, term276.getClass(), "call", term277);
        setField(term305, term305.getClass(), "name", null);
        setField(term305, term305.getClass(), "type", null);
        setBooleanField(term305, term305.getClass(), "inferred", false);
        setField(term305, term305.getClass(), "propertyNode", null);
        setField(term305, term305.getClass(), "docInfo", null);
        setField(term276, term276.getClass(), "prototypeSlot", term305);
        setField(term276, term276.getClass(), "kind", enum146);
        setField(term276, term276.getClass(), "propAccess", enum147);
        setField(term276, term276.getClass(), "typeOfThis", null);
        setField(term276, term276.getClass(), "source", null);
        setField(term276, term276.getClass(), "implementedInterfaces", null);
        setField(term276, term276.getClass(), "extendedInterfaces", null);
        setField(term276, term276.getClass(), "subTypes", null);
        setField(term276, term276.getClass(), "templateTypeNames", null);
        setField(term276, term276.getClass(), "className", null);
        setField(term276, term276.getClass(), "properties", null);
        setBooleanField(term276, term276.getClass(), "nativeType", false);
        setField(term276, term276.getClass(), "implicitPrototypeFallback", null);
        setField(term276, term276.getClass(), "ownerFunction", null);
        setBooleanField(term276, term276.getClass(), "prettyPrint", false);
        setBooleanField(term276, term276.getClass(), "visited", false);
        setField(term276, term276.getClass(), "docInfo", null);
        setBooleanField(term276, term276.getClass(), "unknown", false);
        setBooleanField(term276, term276.getClass(), "resolved", false);
        setField(term276, term276.getClass(), "resolveResult", null);
        setBooleanField(term276, term276.getClass(), "inTemplatedCheckVisit", false);
        setField(term276, term276.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isInstanceType", argTypes, term276, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


