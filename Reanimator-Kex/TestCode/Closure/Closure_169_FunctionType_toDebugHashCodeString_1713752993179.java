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

public class FunctionType_toDebugHashCodeString_1713752993179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46610;

    public FunctionType_toDebugHashCodeString_1713752993179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term211353 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term211352 = ((Class) term211353).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term211352).setAccessible(true);
        Object enum395 = ((Field) term211352).get((Object) null);
        Class<? extends Object> term211653 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term211652 = ((Class) term211653).getDeclaredField((String) "STRUCT");
        ((Field) term211652).setAccessible(true);
        Object enum396 = ((Field) term211652).get((Object) null);
        term46610 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term46611 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term46612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46639 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term46612, term46612.getClass(), "type", -514195141);
        setIntField(term46614, term46614.getClass(), "type", -297946422);
        setIntField(term46616, term46616.getClass(), "type", 385463636);
        setField(term46616, term46616.getClass(), "next", null);
        setField(term46616, term46616.getClass(), "first", null);
        setField(term46616, term46616.getClass(), "last", null);
        setField(term46616, term46616.getClass(), "propListHead", null);
        setIntField(term46616, term46616.getClass(), "sourcePosition", 0);
        setField(term46616, term46616.getClass(), "jsType", null);
        setField(term46616, term46616.getClass(), "parent", null);
        setField(term46614, term46614.getClass(), "next", term46616);
        setIntField(term46619, term46619.getClass(), "type", 0);
        setField(term46619, term46619.getClass(), "next", null);
        setField(term46619, term46619.getClass(), "first", null);
        setField(term46619, term46619.getClass(), "last", null);
        setField(term46619, term46619.getClass(), "propListHead", null);
        setIntField(term46619, term46619.getClass(), "sourcePosition", 0);
        setField(term46619, term46619.getClass(), "jsType", null);
        setField(term46619, term46619.getClass(), "parent", null);
        setField(term46614, term46614.getClass(), "first", term46619);
        setIntField(term46622, term46622.getClass(), "type", -2129828854);
        setField(term46622, term46622.getClass(), "next", null);
        setField(term46622, term46622.getClass(), "first", term46619);
        setField(term46622, term46622.getClass(), "last", term46622);
        setField(term46622, term46622.getClass(), "propListHead", null);
        setIntField(term46622, term46622.getClass(), "sourcePosition", 0);
        setField(term46622, term46622.getClass(), "jsType", null);
        setField(term46622, term46622.getClass(), "parent", null);
        setField(term46614, term46614.getClass(), "last", term46622);
        setField(term46614, term46614.getClass(), "propListHead", null);
        setIntField(term46614, term46614.getClass(), "sourcePosition", 0);
        setField(term46614, term46614.getClass(), "jsType", null);
        setField(term46614, term46614.getClass(), "parent", null);
        setField(term46612, term46612.getClass(), "next", term46614);
        setIntField(term46626, term46626.getClass(), "type", -497534255);
        setIntField(term46628, term46628.getClass(), "type", 1588942911);
        setField(term46628, term46628.getClass(), "next", term46622);
        setField(term46628, term46628.getClass(), "first", null);
        setField(term46628, term46628.getClass(), "last", term46612);
        setField(term46628, term46628.getClass(), "propListHead", null);
        setIntField(term46628, term46628.getClass(), "sourcePosition", 0);
        setField(term46628, term46628.getClass(), "jsType", null);
        setField(term46628, term46628.getClass(), "parent", null);
        setField(term46626, term46626.getClass(), "next", term46628);
        setField(term46626, term46626.getClass(), "first", term46626);
        setIntField(term46631, term46631.getClass(), "type", -1677599962);
        setField(term46631, term46631.getClass(), "next", null);
        setField(term46631, term46631.getClass(), "first", term46619);
        setField(term46631, term46631.getClass(), "last", term46622);
        setField(term46631, term46631.getClass(), "propListHead", null);
        setIntField(term46631, term46631.getClass(), "sourcePosition", 0);
        setField(term46631, term46631.getClass(), "jsType", null);
        setField(term46631, term46631.getClass(), "parent", null);
        setField(term46626, term46626.getClass(), "last", term46631);
        setField(term46626, term46626.getClass(), "propListHead", null);
        setIntField(term46626, term46626.getClass(), "sourcePosition", 0);
        setField(term46626, term46626.getClass(), "jsType", null);
        setField(term46626, term46626.getClass(), "parent", null);
        setField(term46612, term46612.getClass(), "first", term46626);
        setField(term46612, term46612.getClass(), "last", term46616);
        setField(term46612, term46612.getClass(), "propListHead", null);
        setIntField(term46612, term46612.getClass(), "sourcePosition", 0);
        setField(term46612, term46612.getClass(), "jsType", null);
        setField(term46612, term46612.getClass(), "parent", null);
        setField(term46611, term46611.getClass(), "parameters", term46612);
        setField(term46611, term46611.getClass(), "returnType", null);
        setBooleanField(term46611, term46611.getClass(), "returnTypeInferred", false);
        setBooleanField(term46611, term46611.getClass(), "resolved", false);
        setField(term46611, term46611.getClass(), "resolveResult", null);
        setBooleanField(term46611, term46611.getClass(), "inTemplatedCheckVisit", false);
        setField(term46611, term46611.getClass(), "registry", null);
        setField(term46610, term46610.getClass(), "call", term46611);
        setField(term46639, term46639.getClass(), "name", null);
        setField(term46639, term46639.getClass(), "type", null);
        setBooleanField(term46639, term46639.getClass(), "inferred", false);
        setField(term46639, term46639.getClass(), "propertyNode", null);
        setField(term46639, term46639.getClass(), "docInfo", null);
        setField(term46610, term46610.getClass(), "prototypeSlot", term46639);
        setField(term46610, term46610.getClass(), "kind", enum395);
        setField(term46610, term46610.getClass(), "propAccess", enum396);
        setField(term46610, term46610.getClass(), "typeOfThis", null);
        setField(term46610, term46610.getClass(), "source", null);
        setField(term46610, term46610.getClass(), "implementedInterfaces", null);
        setField(term46610, term46610.getClass(), "extendedInterfaces", null);
        setField(term46610, term46610.getClass(), "subTypes", null);
        setField(term46610, term46610.getClass(), "templateTypeNames", null);
        setField(term46610, term46610.getClass(), "className", null);
        setField(term46610, term46610.getClass(), "properties", null);
        setBooleanField(term46610, term46610.getClass(), "nativeType", false);
        setField(term46610, term46610.getClass(), "implicitPrototypeFallback", null);
        setField(term46610, term46610.getClass(), "ownerFunction", null);
        setBooleanField(term46610, term46610.getClass(), "prettyPrint", false);
        setBooleanField(term46610, term46610.getClass(), "visited", false);
        setField(term46610, term46610.getClass(), "docInfo", null);
        setBooleanField(term46610, term46610.getClass(), "unknown", false);
        setBooleanField(term46610, term46610.getClass(), "resolved", false);
        setField(term46610, term46610.getClass(), "resolveResult", null);
        setBooleanField(term46610, term46610.getClass(), "inTemplatedCheckVisit", false);
        setField(term46610, term46610.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toDebugHashCodeString", argTypes, term46610, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


