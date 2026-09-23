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

public class FunctionType_setPrototypeBasedOn_1012666130315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290506;
     Object term290610;
     Object term290727;
     Object term290732;

    public FunctionType_setPrototypeBasedOn_1012666130315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290506 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term290610 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term290727 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term290728 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term290731 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term290727, term290727.getClass(), "call", null);
        setField(term290728, term290728.getClass(), "name", "prototype");
        setField(term290731, term290731.getClass(), "call", null);
        setField(term290731, term290731.getClass(), "prototypeSlot", null);
        setField(term290731, term290731.getClass(), "kind", null);
        setField(term290731, term290731.getClass(), "propAccess", null);
        setField(term290731, term290731.getClass(), "typeOfThis", null);
        setField(term290731, term290731.getClass(), "source", null);
        setField(term290731, term290731.getClass(), "implementedInterfaces", null);
        setField(term290731, term290731.getClass(), "extendedInterfaces", null);
        setField(term290731, term290731.getClass(), "subTypes", null);
        setField(term290731, term290731.getClass(), "templateTypeNames", null);
        setField(term290731, term290731.getClass(), "className", null);
        setField(term290731, term290731.getClass(), "properties", null);
        setBooleanField(term290731, term290731.getClass(), "nativeType", false);
        setField(term290731, term290731.getClass(), "implicitPrototypeFallback", null);
        setField(term290731, term290731.getClass(), "ownerFunction", term290727);
        setBooleanField(term290731, term290731.getClass(), "prettyPrint", false);
        setBooleanField(term290731, term290731.getClass(), "visited", false);
        setField(term290731, term290731.getClass(), "docInfo", null);
        setBooleanField(term290731, term290731.getClass(), "unknown", false);
        setBooleanField(term290731, term290731.getClass(), "resolved", false);
        setField(term290731, term290731.getClass(), "resolveResult", null);
        setBooleanField(term290731, term290731.getClass(), "inTemplatedCheckVisit", false);
        setField(term290731, term290731.getClass(), "registry", null);
        setField(term290728, term290728.getClass(), "type", term290731);
        setBooleanField(term290728, term290728.getClass(), "inferred", true);
        setField(term290728, term290728.getClass(), "propertyNode", null);
        setField(term290728, term290728.getClass(), "docInfo", null);
        setField(term290727, term290727.getClass(), "prototypeSlot", term290728);
        setField(term290727, term290727.getClass(), "kind", null);
        setField(term290727, term290727.getClass(), "propAccess", null);
        setField(term290727, term290727.getClass(), "typeOfThis", null);
        setField(term290727, term290727.getClass(), "source", null);
        setField(term290727, term290727.getClass(), "implementedInterfaces", null);
        setField(term290727, term290727.getClass(), "extendedInterfaces", null);
        setField(term290727, term290727.getClass(), "subTypes", null);
        setField(term290727, term290727.getClass(), "templateTypeNames", null);
        setField(term290727, term290727.getClass(), "className", null);
        setField(term290727, term290727.getClass(), "properties", null);
        setBooleanField(term290727, term290727.getClass(), "nativeType", false);
        setField(term290727, term290727.getClass(), "implicitPrototypeFallback", null);
        setField(term290727, term290727.getClass(), "ownerFunction", null);
        setBooleanField(term290727, term290727.getClass(), "prettyPrint", false);
        setBooleanField(term290727, term290727.getClass(), "visited", false);
        setField(term290727, term290727.getClass(), "docInfo", null);
        setBooleanField(term290727, term290727.getClass(), "unknown", false);
        setBooleanField(term290727, term290727.getClass(), "resolved", false);
        setField(term290727, term290727.getClass(), "resolveResult", null);
        setBooleanField(term290727, term290727.getClass(), "inTemplatedCheckVisit", false);
        setField(term290727, term290727.getClass(), "registry", null);
        term290732 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term290733 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term290734 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term290732, term290732.getClass(), "call", null);
        setField(term290732, term290732.getClass(), "prototypeSlot", null);
        setField(term290732, term290732.getClass(), "kind", null);
        setField(term290732, term290732.getClass(), "propAccess", null);
        setField(term290732, term290732.getClass(), "typeOfThis", null);
        setField(term290732, term290732.getClass(), "source", null);
        setField(term290732, term290732.getClass(), "implementedInterfaces", null);
        setField(term290732, term290732.getClass(), "extendedInterfaces", null);
        setField(term290732, term290732.getClass(), "subTypes", null);
        setField(term290732, term290732.getClass(), "templateTypeNames", null);
        setField(term290732, term290732.getClass(), "className", null);
        setField(term290732, term290732.getClass(), "properties", null);
        setBooleanField(term290732, term290732.getClass(), "nativeType", false);
        setField(term290732, term290732.getClass(), "implicitPrototypeFallback", null);
        setField(term290733, term290733.getClass(), "call", null);
        setField(term290734, term290734.getClass(), "name", "prototype");
        setField(term290734, term290734.getClass(), "type", term290732);
        setBooleanField(term290734, term290734.getClass(), "inferred", true);
        setField(term290734, term290734.getClass(), "propertyNode", null);
        setField(term290734, term290734.getClass(), "docInfo", null);
        setField(term290733, term290733.getClass(), "prototypeSlot", term290734);
        setField(term290733, term290733.getClass(), "kind", null);
        setField(term290733, term290733.getClass(), "propAccess", null);
        setField(term290733, term290733.getClass(), "typeOfThis", null);
        setField(term290733, term290733.getClass(), "source", null);
        setField(term290733, term290733.getClass(), "implementedInterfaces", null);
        setField(term290733, term290733.getClass(), "extendedInterfaces", null);
        setField(term290733, term290733.getClass(), "subTypes", null);
        setField(term290733, term290733.getClass(), "templateTypeNames", null);
        setField(term290733, term290733.getClass(), "className", null);
        setField(term290733, term290733.getClass(), "properties", null);
        setBooleanField(term290733, term290733.getClass(), "nativeType", false);
        setField(term290733, term290733.getClass(), "implicitPrototypeFallback", null);
        setField(term290733, term290733.getClass(), "ownerFunction", null);
        setBooleanField(term290733, term290733.getClass(), "prettyPrint", false);
        setBooleanField(term290733, term290733.getClass(), "visited", false);
        setField(term290733, term290733.getClass(), "docInfo", null);
        setBooleanField(term290733, term290733.getClass(), "unknown", false);
        setBooleanField(term290733, term290733.getClass(), "resolved", false);
        setField(term290733, term290733.getClass(), "resolveResult", null);
        setBooleanField(term290733, term290733.getClass(), "inTemplatedCheckVisit", false);
        setField(term290733, term290733.getClass(), "registry", null);
        setField(term290732, term290732.getClass(), "ownerFunction", term290733);
        setBooleanField(term290732, term290732.getClass(), "prettyPrint", false);
        setBooleanField(term290732, term290732.getClass(), "visited", false);
        setField(term290732, term290732.getClass(), "docInfo", null);
        setBooleanField(term290732, term290732.getClass(), "unknown", false);
        setBooleanField(term290732, term290732.getClass(), "resolved", false);
        setField(term290732, term290732.getClass(), "resolveResult", null);
        setBooleanField(term290732, term290732.getClass(), "inTemplatedCheckVisit", false);
        setField(term290732, term290732.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = term290610;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term290506, args);
        assertTrue(recursiveEquals(term290506, term290727));
        assertTrue(recursiveEquals(term290610, term290732));
    }

};


