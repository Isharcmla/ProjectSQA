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

public class FunctionType_clearCachedValues_1343537339174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43289;

    public FunctionType_clearCachedValues_1343537339174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term204982 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term204981 = ((Class) term204982).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term204981).setAccessible(true);
        Object enum375 = ((Field) term204981).get((Object) null);
        Class<? extends Object> term205282 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term205281 = ((Class) term205282).getDeclaredField((String) "STRUCT");
        ((Field) term205281).setAccessible(true);
        Object enum376 = ((Field) term205281).get((Object) null);
        term43289 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term43290 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term43291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43318 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term43291, term43291.getClass(), "type", 1163761623);
        setIntField(term43293, term43293.getClass(), "type", 718742281);
        setIntField(term43295, term43295.getClass(), "type", 1532723756);
        setField(term43295, term43295.getClass(), "next", null);
        setField(term43295, term43295.getClass(), "first", null);
        setField(term43295, term43295.getClass(), "last", null);
        setField(term43295, term43295.getClass(), "propListHead", null);
        setIntField(term43295, term43295.getClass(), "sourcePosition", 0);
        setField(term43295, term43295.getClass(), "jsType", null);
        setField(term43295, term43295.getClass(), "parent", null);
        setField(term43293, term43293.getClass(), "next", term43295);
        setIntField(term43298, term43298.getClass(), "type", 0);
        setField(term43298, term43298.getClass(), "next", null);
        setField(term43298, term43298.getClass(), "first", null);
        setField(term43298, term43298.getClass(), "last", null);
        setField(term43298, term43298.getClass(), "propListHead", null);
        setIntField(term43298, term43298.getClass(), "sourcePosition", 0);
        setField(term43298, term43298.getClass(), "jsType", null);
        setField(term43298, term43298.getClass(), "parent", null);
        setField(term43293, term43293.getClass(), "first", term43298);
        setIntField(term43301, term43301.getClass(), "type", -573608449);
        setField(term43301, term43301.getClass(), "next", null);
        setField(term43301, term43301.getClass(), "first", term43298);
        setField(term43301, term43301.getClass(), "last", term43301);
        setField(term43301, term43301.getClass(), "propListHead", null);
        setIntField(term43301, term43301.getClass(), "sourcePosition", 0);
        setField(term43301, term43301.getClass(), "jsType", null);
        setField(term43301, term43301.getClass(), "parent", null);
        setField(term43293, term43293.getClass(), "last", term43301);
        setField(term43293, term43293.getClass(), "propListHead", null);
        setIntField(term43293, term43293.getClass(), "sourcePosition", 0);
        setField(term43293, term43293.getClass(), "jsType", null);
        setField(term43293, term43293.getClass(), "parent", null);
        setField(term43291, term43291.getClass(), "next", term43293);
        setIntField(term43305, term43305.getClass(), "type", 1414025609);
        setIntField(term43307, term43307.getClass(), "type", 255145822);
        setField(term43307, term43307.getClass(), "next", term43301);
        setField(term43307, term43307.getClass(), "first", null);
        setField(term43307, term43307.getClass(), "last", term43291);
        setField(term43307, term43307.getClass(), "propListHead", null);
        setIntField(term43307, term43307.getClass(), "sourcePosition", 0);
        setField(term43307, term43307.getClass(), "jsType", null);
        setField(term43307, term43307.getClass(), "parent", null);
        setField(term43305, term43305.getClass(), "next", term43307);
        setField(term43305, term43305.getClass(), "first", term43305);
        setIntField(term43310, term43310.getClass(), "type", -124088550);
        setField(term43310, term43310.getClass(), "next", null);
        setField(term43310, term43310.getClass(), "first", term43298);
        setField(term43310, term43310.getClass(), "last", term43301);
        setField(term43310, term43310.getClass(), "propListHead", null);
        setIntField(term43310, term43310.getClass(), "sourcePosition", 0);
        setField(term43310, term43310.getClass(), "jsType", null);
        setField(term43310, term43310.getClass(), "parent", null);
        setField(term43305, term43305.getClass(), "last", term43310);
        setField(term43305, term43305.getClass(), "propListHead", null);
        setIntField(term43305, term43305.getClass(), "sourcePosition", 0);
        setField(term43305, term43305.getClass(), "jsType", null);
        setField(term43305, term43305.getClass(), "parent", null);
        setField(term43291, term43291.getClass(), "first", term43305);
        setField(term43291, term43291.getClass(), "last", term43295);
        setField(term43291, term43291.getClass(), "propListHead", null);
        setIntField(term43291, term43291.getClass(), "sourcePosition", 0);
        setField(term43291, term43291.getClass(), "jsType", null);
        setField(term43291, term43291.getClass(), "parent", null);
        setField(term43290, term43290.getClass(), "parameters", term43291);
        setField(term43290, term43290.getClass(), "returnType", null);
        setBooleanField(term43290, term43290.getClass(), "returnTypeInferred", false);
        setBooleanField(term43290, term43290.getClass(), "resolved", false);
        setField(term43290, term43290.getClass(), "resolveResult", null);
        setBooleanField(term43290, term43290.getClass(), "inTemplatedCheckVisit", false);
        setField(term43290, term43290.getClass(), "registry", null);
        setField(term43289, term43289.getClass(), "call", term43290);
        setField(term43318, term43318.getClass(), "name", null);
        setField(term43318, term43318.getClass(), "type", null);
        setBooleanField(term43318, term43318.getClass(), "inferred", false);
        setField(term43318, term43318.getClass(), "propertyNode", null);
        setField(term43318, term43318.getClass(), "docInfo", null);
        setField(term43289, term43289.getClass(), "prototypeSlot", term43318);
        setField(term43289, term43289.getClass(), "kind", enum375);
        setField(term43289, term43289.getClass(), "propAccess", enum376);
        setField(term43289, term43289.getClass(), "typeOfThis", null);
        setField(term43289, term43289.getClass(), "source", null);
        setField(term43289, term43289.getClass(), "implementedInterfaces", null);
        setField(term43289, term43289.getClass(), "extendedInterfaces", null);
        setField(term43289, term43289.getClass(), "subTypes", null);
        setField(term43289, term43289.getClass(), "templateTypeNames", null);
        setField(term43289, term43289.getClass(), "className", null);
        setField(term43289, term43289.getClass(), "properties", null);
        setBooleanField(term43289, term43289.getClass(), "nativeType", false);
        setField(term43289, term43289.getClass(), "implicitPrototypeFallback", null);
        setField(term43289, term43289.getClass(), "ownerFunction", null);
        setBooleanField(term43289, term43289.getClass(), "prettyPrint", false);
        setBooleanField(term43289, term43289.getClass(), "visited", false);
        setField(term43289, term43289.getClass(), "docInfo", null);
        setBooleanField(term43289, term43289.getClass(), "unknown", false);
        setBooleanField(term43289, term43289.getClass(), "resolved", false);
        setField(term43289, term43289.getClass(), "resolveResult", null);
        setBooleanField(term43289, term43289.getClass(), "inTemplatedCheckVisit", false);
        setField(term43289, term43289.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clearCachedValues", argTypes, term43289, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


