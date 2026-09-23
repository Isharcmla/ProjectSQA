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

public class FunctionType_getSlot_103358849693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12295;

    public FunctionType_getSlot_103358849693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term73891 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term73890 = ((Class) term73891).getDeclaredField((String) "ORDINARY");
        ((Field) term73890).setAccessible(true);
        Object enum214 = ((Field) term73890).get((Object) null);
        Class<? extends Object> term74182 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term74181 = ((Class) term74182).getDeclaredField((String) "ANY");
        ((Field) term74181).setAccessible(true);
        Object enum215 = ((Field) term74181).get((Object) null);
        term12295 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term12296 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term12297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12324 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term12297, term12297.getClass(), "type", 1102721075);
        setIntField(term12299, term12299.getClass(), "type", -426764678);
        setIntField(term12301, term12301.getClass(), "type", -1222614956);
        setField(term12301, term12301.getClass(), "next", null);
        setField(term12301, term12301.getClass(), "first", null);
        setField(term12301, term12301.getClass(), "last", null);
        setField(term12301, term12301.getClass(), "propListHead", null);
        setIntField(term12301, term12301.getClass(), "sourcePosition", 0);
        setField(term12301, term12301.getClass(), "jsType", null);
        setField(term12301, term12301.getClass(), "parent", null);
        setField(term12299, term12299.getClass(), "next", term12301);
        setIntField(term12304, term12304.getClass(), "type", 0);
        setField(term12304, term12304.getClass(), "next", null);
        setField(term12304, term12304.getClass(), "first", null);
        setField(term12304, term12304.getClass(), "last", null);
        setField(term12304, term12304.getClass(), "propListHead", null);
        setIntField(term12304, term12304.getClass(), "sourcePosition", 0);
        setField(term12304, term12304.getClass(), "jsType", null);
        setField(term12304, term12304.getClass(), "parent", null);
        setField(term12299, term12299.getClass(), "first", term12304);
        setIntField(term12307, term12307.getClass(), "type", 318591690);
        setField(term12307, term12307.getClass(), "next", null);
        setField(term12307, term12307.getClass(), "first", term12304);
        setField(term12307, term12307.getClass(), "last", term12307);
        setField(term12307, term12307.getClass(), "propListHead", null);
        setIntField(term12307, term12307.getClass(), "sourcePosition", 0);
        setField(term12307, term12307.getClass(), "jsType", null);
        setField(term12307, term12307.getClass(), "parent", null);
        setField(term12299, term12299.getClass(), "last", term12307);
        setField(term12299, term12299.getClass(), "propListHead", null);
        setIntField(term12299, term12299.getClass(), "sourcePosition", 0);
        setField(term12299, term12299.getClass(), "jsType", null);
        setField(term12299, term12299.getClass(), "parent", null);
        setField(term12297, term12297.getClass(), "next", term12299);
        setIntField(term12311, term12311.getClass(), "type", -2104981311);
        setIntField(term12313, term12313.getClass(), "type", -571169753);
        setField(term12313, term12313.getClass(), "next", term12307);
        setField(term12313, term12313.getClass(), "first", null);
        setField(term12313, term12313.getClass(), "last", term12297);
        setField(term12313, term12313.getClass(), "propListHead", null);
        setIntField(term12313, term12313.getClass(), "sourcePosition", 0);
        setField(term12313, term12313.getClass(), "jsType", null);
        setField(term12313, term12313.getClass(), "parent", null);
        setField(term12311, term12311.getClass(), "next", term12313);
        setField(term12311, term12311.getClass(), "first", term12311);
        setIntField(term12316, term12316.getClass(), "type", -1870495012);
        setField(term12316, term12316.getClass(), "next", null);
        setField(term12316, term12316.getClass(), "first", term12304);
        setField(term12316, term12316.getClass(), "last", term12307);
        setField(term12316, term12316.getClass(), "propListHead", null);
        setIntField(term12316, term12316.getClass(), "sourcePosition", 0);
        setField(term12316, term12316.getClass(), "jsType", null);
        setField(term12316, term12316.getClass(), "parent", null);
        setField(term12311, term12311.getClass(), "last", term12316);
        setField(term12311, term12311.getClass(), "propListHead", null);
        setIntField(term12311, term12311.getClass(), "sourcePosition", 0);
        setField(term12311, term12311.getClass(), "jsType", null);
        setField(term12311, term12311.getClass(), "parent", null);
        setField(term12297, term12297.getClass(), "first", term12311);
        setField(term12297, term12297.getClass(), "last", term12301);
        setField(term12297, term12297.getClass(), "propListHead", null);
        setIntField(term12297, term12297.getClass(), "sourcePosition", 0);
        setField(term12297, term12297.getClass(), "jsType", null);
        setField(term12297, term12297.getClass(), "parent", null);
        setField(term12296, term12296.getClass(), "parameters", term12297);
        setField(term12296, term12296.getClass(), "returnType", null);
        setBooleanField(term12296, term12296.getClass(), "returnTypeInferred", false);
        setBooleanField(term12296, term12296.getClass(), "resolved", false);
        setField(term12296, term12296.getClass(), "resolveResult", null);
        setBooleanField(term12296, term12296.getClass(), "inTemplatedCheckVisit", false);
        setField(term12296, term12296.getClass(), "registry", null);
        setField(term12295, term12295.getClass(), "call", term12296);
        setField(term12324, term12324.getClass(), "name", null);
        setField(term12324, term12324.getClass(), "type", null);
        setBooleanField(term12324, term12324.getClass(), "inferred", false);
        setField(term12324, term12324.getClass(), "propertyNode", null);
        setField(term12324, term12324.getClass(), "docInfo", null);
        setField(term12295, term12295.getClass(), "prototypeSlot", term12324);
        setField(term12295, term12295.getClass(), "kind", enum214);
        setField(term12295, term12295.getClass(), "propAccess", enum215);
        setField(term12295, term12295.getClass(), "typeOfThis", null);
        setField(term12295, term12295.getClass(), "source", null);
        setField(term12295, term12295.getClass(), "implementedInterfaces", null);
        setField(term12295, term12295.getClass(), "extendedInterfaces", null);
        setField(term12295, term12295.getClass(), "subTypes", null);
        setField(term12295, term12295.getClass(), "templateTypeNames", null);
        setField(term12295, term12295.getClass(), "className", null);
        setField(term12295, term12295.getClass(), "properties", null);
        setBooleanField(term12295, term12295.getClass(), "nativeType", false);
        setField(term12295, term12295.getClass(), "implicitPrototypeFallback", null);
        setField(term12295, term12295.getClass(), "ownerFunction", null);
        setBooleanField(term12295, term12295.getClass(), "prettyPrint", false);
        setBooleanField(term12295, term12295.getClass(), "visited", false);
        setField(term12295, term12295.getClass(), "docInfo", null);
        setBooleanField(term12295, term12295.getClass(), "unknown", false);
        setBooleanField(term12295, term12295.getClass(), "resolved", false);
        setField(term12295, term12295.getClass(), "resolveResult", null);
        setBooleanField(term12295, term12295.getClass(), "inTemplatedCheckVisit", false);
        setField(term12295, term12295.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jwsfVjMoJT";
        try {
            callMethod(klass, "getSlot", argTypes, term12295, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


