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

public class FunctionType_visit_1870685377166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37265;

    public FunctionType_visit_1870685377166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term192720 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term192719 = ((Class) term192720).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term192719).setAccessible(true);
        Object enum341 = ((Field) term192719).get((Object) null);
        Class<? extends Object> term193020 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term193019 = ((Class) term193020).getDeclaredField((String) "STRUCT");
        ((Field) term193019).setAccessible(true);
        Object enum342 = ((Field) term193019).get((Object) null);
        term37265 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term37266 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term37267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37294 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term37267, term37267.getClass(), "type", 1200440315);
        setIntField(term37269, term37269.getClass(), "type", 40571662);
        setIntField(term37271, term37271.getClass(), "type", 1863910269);
        setField(term37271, term37271.getClass(), "next", null);
        setField(term37271, term37271.getClass(), "first", null);
        setField(term37271, term37271.getClass(), "last", null);
        setField(term37271, term37271.getClass(), "propListHead", null);
        setIntField(term37271, term37271.getClass(), "sourcePosition", 0);
        setField(term37271, term37271.getClass(), "jsType", null);
        setField(term37271, term37271.getClass(), "parent", null);
        setField(term37269, term37269.getClass(), "next", term37271);
        setIntField(term37274, term37274.getClass(), "type", 0);
        setField(term37274, term37274.getClass(), "next", null);
        setField(term37274, term37274.getClass(), "first", null);
        setField(term37274, term37274.getClass(), "last", null);
        setField(term37274, term37274.getClass(), "propListHead", null);
        setIntField(term37274, term37274.getClass(), "sourcePosition", 0);
        setField(term37274, term37274.getClass(), "jsType", null);
        setField(term37274, term37274.getClass(), "parent", null);
        setField(term37269, term37269.getClass(), "first", term37274);
        setIntField(term37277, term37277.getClass(), "type", 797203987);
        setField(term37277, term37277.getClass(), "next", null);
        setField(term37277, term37277.getClass(), "first", term37274);
        setField(term37277, term37277.getClass(), "last", term37277);
        setField(term37277, term37277.getClass(), "propListHead", null);
        setIntField(term37277, term37277.getClass(), "sourcePosition", 0);
        setField(term37277, term37277.getClass(), "jsType", null);
        setField(term37277, term37277.getClass(), "parent", null);
        setField(term37269, term37269.getClass(), "last", term37277);
        setField(term37269, term37269.getClass(), "propListHead", null);
        setIntField(term37269, term37269.getClass(), "sourcePosition", 0);
        setField(term37269, term37269.getClass(), "jsType", null);
        setField(term37269, term37269.getClass(), "parent", null);
        setField(term37267, term37267.getClass(), "next", term37269);
        setIntField(term37281, term37281.getClass(), "type", 1427305953);
        setIntField(term37283, term37283.getClass(), "type", -781832877);
        setField(term37283, term37283.getClass(), "next", term37277);
        setField(term37283, term37283.getClass(), "first", null);
        setField(term37283, term37283.getClass(), "last", term37267);
        setField(term37283, term37283.getClass(), "propListHead", null);
        setIntField(term37283, term37283.getClass(), "sourcePosition", 0);
        setField(term37283, term37283.getClass(), "jsType", null);
        setField(term37283, term37283.getClass(), "parent", null);
        setField(term37281, term37281.getClass(), "next", term37283);
        setField(term37281, term37281.getClass(), "first", term37281);
        setIntField(term37286, term37286.getClass(), "type", 864645689);
        setField(term37286, term37286.getClass(), "next", null);
        setField(term37286, term37286.getClass(), "first", term37274);
        setField(term37286, term37286.getClass(), "last", term37277);
        setField(term37286, term37286.getClass(), "propListHead", null);
        setIntField(term37286, term37286.getClass(), "sourcePosition", 0);
        setField(term37286, term37286.getClass(), "jsType", null);
        setField(term37286, term37286.getClass(), "parent", null);
        setField(term37281, term37281.getClass(), "last", term37286);
        setField(term37281, term37281.getClass(), "propListHead", null);
        setIntField(term37281, term37281.getClass(), "sourcePosition", 0);
        setField(term37281, term37281.getClass(), "jsType", null);
        setField(term37281, term37281.getClass(), "parent", null);
        setField(term37267, term37267.getClass(), "first", term37281);
        setField(term37267, term37267.getClass(), "last", term37271);
        setField(term37267, term37267.getClass(), "propListHead", null);
        setIntField(term37267, term37267.getClass(), "sourcePosition", 0);
        setField(term37267, term37267.getClass(), "jsType", null);
        setField(term37267, term37267.getClass(), "parent", null);
        setField(term37266, term37266.getClass(), "parameters", term37267);
        setField(term37266, term37266.getClass(), "returnType", null);
        setBooleanField(term37266, term37266.getClass(), "returnTypeInferred", false);
        setBooleanField(term37266, term37266.getClass(), "resolved", false);
        setField(term37266, term37266.getClass(), "resolveResult", null);
        setBooleanField(term37266, term37266.getClass(), "inTemplatedCheckVisit", false);
        setField(term37266, term37266.getClass(), "registry", null);
        setField(term37265, term37265.getClass(), "call", term37266);
        setField(term37294, term37294.getClass(), "name", null);
        setField(term37294, term37294.getClass(), "type", null);
        setBooleanField(term37294, term37294.getClass(), "inferred", false);
        setField(term37294, term37294.getClass(), "propertyNode", null);
        setField(term37294, term37294.getClass(), "docInfo", null);
        setField(term37265, term37265.getClass(), "prototypeSlot", term37294);
        setField(term37265, term37265.getClass(), "kind", enum341);
        setField(term37265, term37265.getClass(), "propAccess", enum342);
        setField(term37265, term37265.getClass(), "typeOfThis", null);
        setField(term37265, term37265.getClass(), "source", null);
        setField(term37265, term37265.getClass(), "implementedInterfaces", null);
        setField(term37265, term37265.getClass(), "extendedInterfaces", null);
        setField(term37265, term37265.getClass(), "subTypes", null);
        setField(term37265, term37265.getClass(), "templateTypeNames", null);
        setField(term37265, term37265.getClass(), "className", null);
        setField(term37265, term37265.getClass(), "properties", null);
        setBooleanField(term37265, term37265.getClass(), "nativeType", false);
        setField(term37265, term37265.getClass(), "implicitPrototypeFallback", null);
        setField(term37265, term37265.getClass(), "ownerFunction", null);
        setBooleanField(term37265, term37265.getClass(), "prettyPrint", false);
        setBooleanField(term37265, term37265.getClass(), "visited", false);
        setField(term37265, term37265.getClass(), "docInfo", null);
        setBooleanField(term37265, term37265.getClass(), "unknown", false);
        setBooleanField(term37265, term37265.getClass(), "resolved", false);
        setField(term37265, term37265.getClass(), "resolveResult", null);
        setBooleanField(term37265, term37265.getClass(), "inTemplatedCheckVisit", false);
        setField(term37265, term37265.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "visit", argTypes, term37265, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


