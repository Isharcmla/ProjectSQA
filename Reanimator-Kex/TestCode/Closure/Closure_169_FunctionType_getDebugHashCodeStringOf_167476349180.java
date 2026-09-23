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

public class FunctionType_getDebugHashCodeStringOf_167476349180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47287;

    public FunctionType_getDebugHashCodeStringOf_167476349180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term212217 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term212216 = ((Class) term212217).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term212216).setAccessible(true);
        Object enum397 = ((Field) term212216).get((Object) null);
        Class<? extends Object> term212517 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term212516 = ((Class) term212517).getDeclaredField((String) "STRUCT");
        ((Field) term212516).setAccessible(true);
        Object enum398 = ((Field) term212516).get((Object) null);
        term47287 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term47288 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term47289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47296 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47316 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term47289, term47289.getClass(), "type", -47438786);
        setIntField(term47291, term47291.getClass(), "type", -1955400589);
        setIntField(term47293, term47293.getClass(), "type", 626179200);
        setField(term47293, term47293.getClass(), "next", null);
        setField(term47293, term47293.getClass(), "first", null);
        setField(term47293, term47293.getClass(), "last", null);
        setField(term47293, term47293.getClass(), "propListHead", null);
        setIntField(term47293, term47293.getClass(), "sourcePosition", 0);
        setField(term47293, term47293.getClass(), "jsType", null);
        setField(term47293, term47293.getClass(), "parent", null);
        setField(term47291, term47291.getClass(), "next", term47293);
        setIntField(term47296, term47296.getClass(), "type", 0);
        setField(term47296, term47296.getClass(), "next", null);
        setField(term47296, term47296.getClass(), "first", null);
        setField(term47296, term47296.getClass(), "last", null);
        setField(term47296, term47296.getClass(), "propListHead", null);
        setIntField(term47296, term47296.getClass(), "sourcePosition", 0);
        setField(term47296, term47296.getClass(), "jsType", null);
        setField(term47296, term47296.getClass(), "parent", null);
        setField(term47291, term47291.getClass(), "first", term47296);
        setIntField(term47299, term47299.getClass(), "type", -751079123);
        setField(term47299, term47299.getClass(), "next", null);
        setField(term47299, term47299.getClass(), "first", term47296);
        setField(term47299, term47299.getClass(), "last", term47299);
        setField(term47299, term47299.getClass(), "propListHead", null);
        setIntField(term47299, term47299.getClass(), "sourcePosition", 0);
        setField(term47299, term47299.getClass(), "jsType", null);
        setField(term47299, term47299.getClass(), "parent", null);
        setField(term47291, term47291.getClass(), "last", term47299);
        setField(term47291, term47291.getClass(), "propListHead", null);
        setIntField(term47291, term47291.getClass(), "sourcePosition", 0);
        setField(term47291, term47291.getClass(), "jsType", null);
        setField(term47291, term47291.getClass(), "parent", null);
        setField(term47289, term47289.getClass(), "next", term47291);
        setIntField(term47303, term47303.getClass(), "type", 1053773809);
        setIntField(term47305, term47305.getClass(), "type", 924127883);
        setField(term47305, term47305.getClass(), "next", term47299);
        setField(term47305, term47305.getClass(), "first", null);
        setField(term47305, term47305.getClass(), "last", term47289);
        setField(term47305, term47305.getClass(), "propListHead", null);
        setIntField(term47305, term47305.getClass(), "sourcePosition", 0);
        setField(term47305, term47305.getClass(), "jsType", null);
        setField(term47305, term47305.getClass(), "parent", null);
        setField(term47303, term47303.getClass(), "next", term47305);
        setField(term47303, term47303.getClass(), "first", term47303);
        setIntField(term47308, term47308.getClass(), "type", -511077684);
        setField(term47308, term47308.getClass(), "next", null);
        setField(term47308, term47308.getClass(), "first", term47296);
        setField(term47308, term47308.getClass(), "last", term47299);
        setField(term47308, term47308.getClass(), "propListHead", null);
        setIntField(term47308, term47308.getClass(), "sourcePosition", 0);
        setField(term47308, term47308.getClass(), "jsType", null);
        setField(term47308, term47308.getClass(), "parent", null);
        setField(term47303, term47303.getClass(), "last", term47308);
        setField(term47303, term47303.getClass(), "propListHead", null);
        setIntField(term47303, term47303.getClass(), "sourcePosition", 0);
        setField(term47303, term47303.getClass(), "jsType", null);
        setField(term47303, term47303.getClass(), "parent", null);
        setField(term47289, term47289.getClass(), "first", term47303);
        setField(term47289, term47289.getClass(), "last", term47293);
        setField(term47289, term47289.getClass(), "propListHead", null);
        setIntField(term47289, term47289.getClass(), "sourcePosition", 0);
        setField(term47289, term47289.getClass(), "jsType", null);
        setField(term47289, term47289.getClass(), "parent", null);
        setField(term47288, term47288.getClass(), "parameters", term47289);
        setField(term47288, term47288.getClass(), "returnType", null);
        setBooleanField(term47288, term47288.getClass(), "returnTypeInferred", false);
        setBooleanField(term47288, term47288.getClass(), "resolved", false);
        setField(term47288, term47288.getClass(), "resolveResult", null);
        setBooleanField(term47288, term47288.getClass(), "inTemplatedCheckVisit", false);
        setField(term47288, term47288.getClass(), "registry", null);
        setField(term47287, term47287.getClass(), "call", term47288);
        setField(term47316, term47316.getClass(), "name", null);
        setField(term47316, term47316.getClass(), "type", null);
        setBooleanField(term47316, term47316.getClass(), "inferred", false);
        setField(term47316, term47316.getClass(), "propertyNode", null);
        setField(term47316, term47316.getClass(), "docInfo", null);
        setField(term47287, term47287.getClass(), "prototypeSlot", term47316);
        setField(term47287, term47287.getClass(), "kind", enum397);
        setField(term47287, term47287.getClass(), "propAccess", enum398);
        setField(term47287, term47287.getClass(), "typeOfThis", null);
        setField(term47287, term47287.getClass(), "source", null);
        setField(term47287, term47287.getClass(), "implementedInterfaces", null);
        setField(term47287, term47287.getClass(), "extendedInterfaces", null);
        setField(term47287, term47287.getClass(), "subTypes", null);
        setField(term47287, term47287.getClass(), "templateTypeNames", null);
        setField(term47287, term47287.getClass(), "className", null);
        setField(term47287, term47287.getClass(), "properties", null);
        setBooleanField(term47287, term47287.getClass(), "nativeType", false);
        setField(term47287, term47287.getClass(), "implicitPrototypeFallback", null);
        setField(term47287, term47287.getClass(), "ownerFunction", null);
        setBooleanField(term47287, term47287.getClass(), "prettyPrint", false);
        setBooleanField(term47287, term47287.getClass(), "visited", false);
        setField(term47287, term47287.getClass(), "docInfo", null);
        setBooleanField(term47287, term47287.getClass(), "unknown", false);
        setBooleanField(term47287, term47287.getClass(), "resolved", false);
        setField(term47287, term47287.getClass(), "resolveResult", null);
        setBooleanField(term47287, term47287.getClass(), "inTemplatedCheckVisit", false);
        setField(term47287, term47287.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getDebugHashCodeStringOf", argTypes, term47287, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


