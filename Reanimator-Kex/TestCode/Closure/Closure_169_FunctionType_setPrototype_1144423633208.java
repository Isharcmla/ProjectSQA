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

public class FunctionType_setPrototype_1144423633208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105359;
     Object term105459;
     Object term227282;
     Object term227287;

    public FunctionType_setPrototype_1144423633208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105359 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term105459 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term227282 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term227283 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term227286 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term227282, term227282.getClass(), "call", null);
        setField(term227283, term227283.getClass(), "name", "prototype");
        setField(term227286, term227286.getClass(), "call", null);
        setField(term227286, term227286.getClass(), "prototypeSlot", null);
        setField(term227286, term227286.getClass(), "kind", null);
        setField(term227286, term227286.getClass(), "propAccess", null);
        setField(term227286, term227286.getClass(), "typeOfThis", null);
        setField(term227286, term227286.getClass(), "source", null);
        setField(term227286, term227286.getClass(), "implementedInterfaces", null);
        setField(term227286, term227286.getClass(), "extendedInterfaces", null);
        setField(term227286, term227286.getClass(), "subTypes", null);
        setField(term227286, term227286.getClass(), "templateTypeNames", null);
        setField(term227286, term227286.getClass(), "className", null);
        setField(term227286, term227286.getClass(), "properties", null);
        setBooleanField(term227286, term227286.getClass(), "nativeType", false);
        setField(term227286, term227286.getClass(), "implicitPrototypeFallback", null);
        setField(term227286, term227286.getClass(), "ownerFunction", term227282);
        setBooleanField(term227286, term227286.getClass(), "prettyPrint", false);
        setBooleanField(term227286, term227286.getClass(), "visited", false);
        setField(term227286, term227286.getClass(), "docInfo", null);
        setBooleanField(term227286, term227286.getClass(), "unknown", false);
        setBooleanField(term227286, term227286.getClass(), "resolved", false);
        setField(term227286, term227286.getClass(), "resolveResult", null);
        setBooleanField(term227286, term227286.getClass(), "inTemplatedCheckVisit", false);
        setField(term227286, term227286.getClass(), "registry", null);
        setField(term227283, term227283.getClass(), "type", term227286);
        setBooleanField(term227283, term227283.getClass(), "inferred", true);
        setField(term227283, term227283.getClass(), "propertyNode", null);
        setField(term227283, term227283.getClass(), "docInfo", null);
        setField(term227282, term227282.getClass(), "prototypeSlot", term227283);
        setField(term227282, term227282.getClass(), "kind", null);
        setField(term227282, term227282.getClass(), "propAccess", null);
        setField(term227282, term227282.getClass(), "typeOfThis", null);
        setField(term227282, term227282.getClass(), "source", null);
        setField(term227282, term227282.getClass(), "implementedInterfaces", null);
        setField(term227282, term227282.getClass(), "extendedInterfaces", null);
        setField(term227282, term227282.getClass(), "subTypes", null);
        setField(term227282, term227282.getClass(), "templateTypeNames", null);
        setField(term227282, term227282.getClass(), "className", null);
        setField(term227282, term227282.getClass(), "properties", null);
        setBooleanField(term227282, term227282.getClass(), "nativeType", false);
        setField(term227282, term227282.getClass(), "implicitPrototypeFallback", null);
        setField(term227282, term227282.getClass(), "ownerFunction", null);
        setBooleanField(term227282, term227282.getClass(), "prettyPrint", false);
        setBooleanField(term227282, term227282.getClass(), "visited", false);
        setField(term227282, term227282.getClass(), "docInfo", null);
        setBooleanField(term227282, term227282.getClass(), "unknown", false);
        setBooleanField(term227282, term227282.getClass(), "resolved", false);
        setField(term227282, term227282.getClass(), "resolveResult", null);
        setBooleanField(term227282, term227282.getClass(), "inTemplatedCheckVisit", false);
        setField(term227282, term227282.getClass(), "registry", null);
        term227287 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term227288 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term227289 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term227287, term227287.getClass(), "call", null);
        setField(term227287, term227287.getClass(), "prototypeSlot", null);
        setField(term227287, term227287.getClass(), "kind", null);
        setField(term227287, term227287.getClass(), "propAccess", null);
        setField(term227287, term227287.getClass(), "typeOfThis", null);
        setField(term227287, term227287.getClass(), "source", null);
        setField(term227287, term227287.getClass(), "implementedInterfaces", null);
        setField(term227287, term227287.getClass(), "extendedInterfaces", null);
        setField(term227287, term227287.getClass(), "subTypes", null);
        setField(term227287, term227287.getClass(), "templateTypeNames", null);
        setField(term227287, term227287.getClass(), "className", null);
        setField(term227287, term227287.getClass(), "properties", null);
        setBooleanField(term227287, term227287.getClass(), "nativeType", false);
        setField(term227287, term227287.getClass(), "implicitPrototypeFallback", null);
        setField(term227288, term227288.getClass(), "call", null);
        setField(term227289, term227289.getClass(), "name", "prototype");
        setField(term227289, term227289.getClass(), "type", term227287);
        setBooleanField(term227289, term227289.getClass(), "inferred", true);
        setField(term227289, term227289.getClass(), "propertyNode", null);
        setField(term227289, term227289.getClass(), "docInfo", null);
        setField(term227288, term227288.getClass(), "prototypeSlot", term227289);
        setField(term227288, term227288.getClass(), "kind", null);
        setField(term227288, term227288.getClass(), "propAccess", null);
        setField(term227288, term227288.getClass(), "typeOfThis", null);
        setField(term227288, term227288.getClass(), "source", null);
        setField(term227288, term227288.getClass(), "implementedInterfaces", null);
        setField(term227288, term227288.getClass(), "extendedInterfaces", null);
        setField(term227288, term227288.getClass(), "subTypes", null);
        setField(term227288, term227288.getClass(), "templateTypeNames", null);
        setField(term227288, term227288.getClass(), "className", null);
        setField(term227288, term227288.getClass(), "properties", null);
        setBooleanField(term227288, term227288.getClass(), "nativeType", false);
        setField(term227288, term227288.getClass(), "implicitPrototypeFallback", null);
        setField(term227288, term227288.getClass(), "ownerFunction", null);
        setBooleanField(term227288, term227288.getClass(), "prettyPrint", false);
        setBooleanField(term227288, term227288.getClass(), "visited", false);
        setField(term227288, term227288.getClass(), "docInfo", null);
        setBooleanField(term227288, term227288.getClass(), "unknown", false);
        setBooleanField(term227288, term227288.getClass(), "resolved", false);
        setField(term227288, term227288.getClass(), "resolveResult", null);
        setBooleanField(term227288, term227288.getClass(), "inTemplatedCheckVisit", false);
        setField(term227288, term227288.getClass(), "registry", null);
        setField(term227287, term227287.getClass(), "ownerFunction", term227288);
        setBooleanField(term227287, term227287.getClass(), "prettyPrint", false);
        setBooleanField(term227287, term227287.getClass(), "visited", false);
        setField(term227287, term227287.getClass(), "docInfo", null);
        setBooleanField(term227287, term227287.getClass(), "unknown", false);
        setBooleanField(term227287, term227287.getClass(), "resolved", false);
        setField(term227287, term227287.getClass(), "resolveResult", null);
        setBooleanField(term227287, term227287.getClass(), "inTemplatedCheckVisit", false);
        setField(term227287, term227287.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term105459;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term105359, args);
        assertTrue(recursiveEquals(term105359, term227282));
        assertTrue(recursiveEquals(term105459, term227287));
        assertTrue(recursiveEquals(retValue, true));
    }

};


