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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;

public class FunctionType_setPrototypeNoCheck_1402626902433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term396863;
     Object term397177;
     Object term397350;
     Object term397355;

    public FunctionType_setPrototypeNoCheck_1402626902433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term396863 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term396977 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term397077 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term397077, term397077.getClass(), "ownerFunction", null);
        setField(term396977, term396977.getClass(), "type", term397077);
        setField(term396863, term396863.getClass(), "prototypeSlot", term396977);
        setField(term396863, term396863.getClass(), "source", null);
        term397177 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term397177, term397177.getClass(), "ownerFunction", null);
        term397350 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term397351 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term397354 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term397350, term397350.getClass(), "call", null);
        setField(term397351, term397351.getClass(), "name", "prototype");
        setField(term397354, term397354.getClass(), "call", null);
        setField(term397354, term397354.getClass(), "prototypeSlot", null);
        setField(term397354, term397354.getClass(), "kind", null);
        setField(term397354, term397354.getClass(), "propAccess", null);
        setField(term397354, term397354.getClass(), "typeOfThis", null);
        setField(term397354, term397354.getClass(), "source", null);
        setField(term397354, term397354.getClass(), "implementedInterfaces", null);
        setField(term397354, term397354.getClass(), "extendedInterfaces", null);
        setField(term397354, term397354.getClass(), "subTypes", null);
        setField(term397354, term397354.getClass(), "templateTypeNames", null);
        setField(term397354, term397354.getClass(), "className", null);
        setField(term397354, term397354.getClass(), "properties", null);
        setBooleanField(term397354, term397354.getClass(), "nativeType", false);
        setField(term397354, term397354.getClass(), "implicitPrototypeFallback", null);
        setField(term397354, term397354.getClass(), "ownerFunction", term397350);
        setBooleanField(term397354, term397354.getClass(), "prettyPrint", false);
        setBooleanField(term397354, term397354.getClass(), "visited", false);
        setField(term397354, term397354.getClass(), "docInfo", null);
        setBooleanField(term397354, term397354.getClass(), "unknown", true);
        setBooleanField(term397354, term397354.getClass(), "resolved", false);
        setField(term397354, term397354.getClass(), "resolveResult", null);
        setBooleanField(term397354, term397354.getClass(), "inTemplatedCheckVisit", false);
        setField(term397354, term397354.getClass(), "registry", null);
        setField(term397351, term397351.getClass(), "type", term397354);
        setBooleanField(term397351, term397351.getClass(), "inferred", true);
        setField(term397351, term397351.getClass(), "propertyNode", null);
        setField(term397351, term397351.getClass(), "docInfo", null);
        setField(term397350, term397350.getClass(), "prototypeSlot", term397351);
        setField(term397350, term397350.getClass(), "kind", null);
        setField(term397350, term397350.getClass(), "propAccess", null);
        setField(term397350, term397350.getClass(), "typeOfThis", null);
        setField(term397350, term397350.getClass(), "source", null);
        setField(term397350, term397350.getClass(), "implementedInterfaces", null);
        setField(term397350, term397350.getClass(), "extendedInterfaces", null);
        setField(term397350, term397350.getClass(), "subTypes", null);
        setField(term397350, term397350.getClass(), "templateTypeNames", null);
        setField(term397350, term397350.getClass(), "className", null);
        setField(term397350, term397350.getClass(), "properties", null);
        setBooleanField(term397350, term397350.getClass(), "nativeType", false);
        setField(term397350, term397350.getClass(), "implicitPrototypeFallback", null);
        setField(term397350, term397350.getClass(), "ownerFunction", null);
        setBooleanField(term397350, term397350.getClass(), "prettyPrint", false);
        setBooleanField(term397350, term397350.getClass(), "visited", false);
        setField(term397350, term397350.getClass(), "docInfo", null);
        setBooleanField(term397350, term397350.getClass(), "unknown", true);
        setBooleanField(term397350, term397350.getClass(), "resolved", false);
        setField(term397350, term397350.getClass(), "resolveResult", null);
        setBooleanField(term397350, term397350.getClass(), "inTemplatedCheckVisit", false);
        setField(term397350, term397350.getClass(), "registry", null);
        term397355 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term397356 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term397357 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term397355, term397355.getClass(), "call", null);
        setField(term397355, term397355.getClass(), "prototypeSlot", null);
        setField(term397355, term397355.getClass(), "kind", null);
        setField(term397355, term397355.getClass(), "propAccess", null);
        setField(term397355, term397355.getClass(), "typeOfThis", null);
        setField(term397355, term397355.getClass(), "source", null);
        setField(term397355, term397355.getClass(), "implementedInterfaces", null);
        setField(term397355, term397355.getClass(), "extendedInterfaces", null);
        setField(term397355, term397355.getClass(), "subTypes", null);
        setField(term397355, term397355.getClass(), "templateTypeNames", null);
        setField(term397355, term397355.getClass(), "className", null);
        setField(term397355, term397355.getClass(), "properties", null);
        setBooleanField(term397355, term397355.getClass(), "nativeType", false);
        setField(term397355, term397355.getClass(), "implicitPrototypeFallback", null);
        setField(term397356, term397356.getClass(), "call", null);
        setField(term397357, term397357.getClass(), "name", "prototype");
        setField(term397357, term397357.getClass(), "type", term397355);
        setBooleanField(term397357, term397357.getClass(), "inferred", true);
        setField(term397357, term397357.getClass(), "propertyNode", null);
        setField(term397357, term397357.getClass(), "docInfo", null);
        setField(term397356, term397356.getClass(), "prototypeSlot", term397357);
        setField(term397356, term397356.getClass(), "kind", null);
        setField(term397356, term397356.getClass(), "propAccess", null);
        setField(term397356, term397356.getClass(), "typeOfThis", null);
        setField(term397356, term397356.getClass(), "source", null);
        setField(term397356, term397356.getClass(), "implementedInterfaces", null);
        setField(term397356, term397356.getClass(), "extendedInterfaces", null);
        setField(term397356, term397356.getClass(), "subTypes", null);
        setField(term397356, term397356.getClass(), "templateTypeNames", null);
        setField(term397356, term397356.getClass(), "className", null);
        setField(term397356, term397356.getClass(), "properties", null);
        setBooleanField(term397356, term397356.getClass(), "nativeType", false);
        setField(term397356, term397356.getClass(), "implicitPrototypeFallback", null);
        setField(term397356, term397356.getClass(), "ownerFunction", null);
        setBooleanField(term397356, term397356.getClass(), "prettyPrint", false);
        setBooleanField(term397356, term397356.getClass(), "visited", false);
        setField(term397356, term397356.getClass(), "docInfo", null);
        setBooleanField(term397356, term397356.getClass(), "unknown", true);
        setBooleanField(term397356, term397356.getClass(), "resolved", false);
        setField(term397356, term397356.getClass(), "resolveResult", null);
        setBooleanField(term397356, term397356.getClass(), "inTemplatedCheckVisit", false);
        setField(term397356, term397356.getClass(), "registry", null);
        setField(term397355, term397355.getClass(), "ownerFunction", term397356);
        setBooleanField(term397355, term397355.getClass(), "prettyPrint", false);
        setBooleanField(term397355, term397355.getClass(), "visited", false);
        setField(term397355, term397355.getClass(), "docInfo", null);
        setBooleanField(term397355, term397355.getClass(), "unknown", true);
        setBooleanField(term397355, term397355.getClass(), "resolved", false);
        setField(term397355, term397355.getClass(), "resolveResult", null);
        setBooleanField(term397355, term397355.getClass(), "inTemplatedCheckVisit", false);
        setField(term397355, term397355.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term397177;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototypeNoCheck", argTypes, term396863, args);
        assertTrue(recursiveEquals(term396863, term397350));
        assertTrue(recursiveEquals(term397177, term397355));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


