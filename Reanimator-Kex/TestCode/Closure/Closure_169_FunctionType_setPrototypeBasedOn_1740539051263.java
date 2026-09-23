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

public class FunctionType_setPrototypeBasedOn_1740539051263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256129;
     Object term256229;
     Object term256346;
     Object term256351;

    public FunctionType_setPrototypeBasedOn_1740539051263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256129 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        term256229 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        term256346 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term256347 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term256350 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term256346, term256346.getClass(), "call", null);
        setField(term256347, term256347.getClass(), "name", "prototype");
        setField(term256350, term256350.getClass(), "call", null);
        setField(term256350, term256350.getClass(), "prototypeSlot", null);
        setField(term256350, term256350.getClass(), "kind", null);
        setField(term256350, term256350.getClass(), "propAccess", null);
        setField(term256350, term256350.getClass(), "typeOfThis", null);
        setField(term256350, term256350.getClass(), "source", null);
        setField(term256350, term256350.getClass(), "implementedInterfaces", null);
        setField(term256350, term256350.getClass(), "extendedInterfaces", null);
        setField(term256350, term256350.getClass(), "subTypes", null);
        setField(term256350, term256350.getClass(), "templateTypeNames", null);
        setField(term256350, term256350.getClass(), "className", null);
        setField(term256350, term256350.getClass(), "properties", null);
        setBooleanField(term256350, term256350.getClass(), "nativeType", false);
        setField(term256350, term256350.getClass(), "implicitPrototypeFallback", null);
        setField(term256350, term256350.getClass(), "ownerFunction", term256346);
        setBooleanField(term256350, term256350.getClass(), "prettyPrint", false);
        setBooleanField(term256350, term256350.getClass(), "visited", false);
        setField(term256350, term256350.getClass(), "docInfo", null);
        setBooleanField(term256350, term256350.getClass(), "unknown", false);
        setBooleanField(term256350, term256350.getClass(), "resolved", false);
        setField(term256350, term256350.getClass(), "resolveResult", null);
        setBooleanField(term256350, term256350.getClass(), "inTemplatedCheckVisit", false);
        setField(term256350, term256350.getClass(), "registry", null);
        setField(term256347, term256347.getClass(), "type", term256350);
        setBooleanField(term256347, term256347.getClass(), "inferred", true);
        setField(term256347, term256347.getClass(), "propertyNode", null);
        setField(term256347, term256347.getClass(), "docInfo", null);
        setField(term256346, term256346.getClass(), "prototypeSlot", term256347);
        setField(term256346, term256346.getClass(), "kind", null);
        setField(term256346, term256346.getClass(), "propAccess", null);
        setField(term256346, term256346.getClass(), "typeOfThis", null);
        setField(term256346, term256346.getClass(), "source", null);
        setField(term256346, term256346.getClass(), "implementedInterfaces", null);
        setField(term256346, term256346.getClass(), "extendedInterfaces", null);
        setField(term256346, term256346.getClass(), "subTypes", null);
        setField(term256346, term256346.getClass(), "templateTypeNames", null);
        setField(term256346, term256346.getClass(), "className", null);
        setField(term256346, term256346.getClass(), "properties", null);
        setBooleanField(term256346, term256346.getClass(), "nativeType", false);
        setField(term256346, term256346.getClass(), "implicitPrototypeFallback", null);
        setField(term256346, term256346.getClass(), "ownerFunction", null);
        setBooleanField(term256346, term256346.getClass(), "prettyPrint", false);
        setBooleanField(term256346, term256346.getClass(), "visited", false);
        setField(term256346, term256346.getClass(), "docInfo", null);
        setBooleanField(term256346, term256346.getClass(), "unknown", false);
        setBooleanField(term256346, term256346.getClass(), "resolved", false);
        setField(term256346, term256346.getClass(), "resolveResult", null);
        setBooleanField(term256346, term256346.getClass(), "inTemplatedCheckVisit", false);
        setField(term256346, term256346.getClass(), "registry", null);
        term256351 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term256352 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term256353 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term256351, term256351.getClass(), "call", null);
        setField(term256351, term256351.getClass(), "prototypeSlot", null);
        setField(term256351, term256351.getClass(), "kind", null);
        setField(term256351, term256351.getClass(), "propAccess", null);
        setField(term256351, term256351.getClass(), "typeOfThis", null);
        setField(term256351, term256351.getClass(), "source", null);
        setField(term256351, term256351.getClass(), "implementedInterfaces", null);
        setField(term256351, term256351.getClass(), "extendedInterfaces", null);
        setField(term256351, term256351.getClass(), "subTypes", null);
        setField(term256351, term256351.getClass(), "templateTypeNames", null);
        setField(term256351, term256351.getClass(), "className", null);
        setField(term256351, term256351.getClass(), "properties", null);
        setBooleanField(term256351, term256351.getClass(), "nativeType", false);
        setField(term256351, term256351.getClass(), "implicitPrototypeFallback", null);
        setField(term256352, term256352.getClass(), "call", null);
        setField(term256353, term256353.getClass(), "name", "prototype");
        setField(term256353, term256353.getClass(), "type", term256351);
        setBooleanField(term256353, term256353.getClass(), "inferred", true);
        setField(term256353, term256353.getClass(), "propertyNode", null);
        setField(term256353, term256353.getClass(), "docInfo", null);
        setField(term256352, term256352.getClass(), "prototypeSlot", term256353);
        setField(term256352, term256352.getClass(), "kind", null);
        setField(term256352, term256352.getClass(), "propAccess", null);
        setField(term256352, term256352.getClass(), "typeOfThis", null);
        setField(term256352, term256352.getClass(), "source", null);
        setField(term256352, term256352.getClass(), "implementedInterfaces", null);
        setField(term256352, term256352.getClass(), "extendedInterfaces", null);
        setField(term256352, term256352.getClass(), "subTypes", null);
        setField(term256352, term256352.getClass(), "templateTypeNames", null);
        setField(term256352, term256352.getClass(), "className", null);
        setField(term256352, term256352.getClass(), "properties", null);
        setBooleanField(term256352, term256352.getClass(), "nativeType", false);
        setField(term256352, term256352.getClass(), "implicitPrototypeFallback", null);
        setField(term256352, term256352.getClass(), "ownerFunction", null);
        setBooleanField(term256352, term256352.getClass(), "prettyPrint", false);
        setBooleanField(term256352, term256352.getClass(), "visited", false);
        setField(term256352, term256352.getClass(), "docInfo", null);
        setBooleanField(term256352, term256352.getClass(), "unknown", false);
        setBooleanField(term256352, term256352.getClass(), "resolved", false);
        setField(term256352, term256352.getClass(), "resolveResult", null);
        setBooleanField(term256352, term256352.getClass(), "inTemplatedCheckVisit", false);
        setField(term256352, term256352.getClass(), "registry", null);
        setField(term256351, term256351.getClass(), "ownerFunction", term256352);
        setBooleanField(term256351, term256351.getClass(), "prettyPrint", false);
        setBooleanField(term256351, term256351.getClass(), "visited", false);
        setField(term256351, term256351.getClass(), "docInfo", null);
        setBooleanField(term256351, term256351.getClass(), "unknown", false);
        setBooleanField(term256351, term256351.getClass(), "resolved", false);
        setField(term256351, term256351.getClass(), "resolveResult", null);
        setBooleanField(term256351, term256351.getClass(), "inTemplatedCheckVisit", false);
        setField(term256351, term256351.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term256229;
        args[1] = null;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term256129, args);
        assertTrue(recursiveEquals(term256129, term256346));
        assertTrue(recursiveEquals(term256229, term256351));
    }

};


