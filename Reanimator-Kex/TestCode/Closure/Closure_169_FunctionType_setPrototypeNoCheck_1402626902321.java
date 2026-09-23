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

public class FunctionType_setPrototypeNoCheck_1402626902321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295057;
     Object term295124;
     Object term295128;

    public FunctionType_setPrototypeNoCheck_1402626902321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295057 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term295057, term295057.getClass(), "prototypeSlot", null);
        setField(term295057, term295057.getClass(), "source", null);
        term295124 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term295125 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term295124, term295124.getClass(), "call", null);
        setField(term295125, term295125.getClass(), "name", "prototype");
        setField(term295125, term295125.getClass(), "type", term295124);
        setBooleanField(term295125, term295125.getClass(), "inferred", true);
        setField(term295125, term295125.getClass(), "propertyNode", null);
        setField(term295125, term295125.getClass(), "docInfo", null);
        setField(term295124, term295124.getClass(), "prototypeSlot", term295125);
        setField(term295124, term295124.getClass(), "kind", null);
        setField(term295124, term295124.getClass(), "propAccess", null);
        setField(term295124, term295124.getClass(), "typeOfThis", null);
        setField(term295124, term295124.getClass(), "source", null);
        setField(term295124, term295124.getClass(), "implementedInterfaces", null);
        setField(term295124, term295124.getClass(), "extendedInterfaces", null);
        setField(term295124, term295124.getClass(), "subTypes", null);
        setField(term295124, term295124.getClass(), "templateTypeNames", null);
        setField(term295124, term295124.getClass(), "className", null);
        setField(term295124, term295124.getClass(), "properties", null);
        setBooleanField(term295124, term295124.getClass(), "nativeType", false);
        setField(term295124, term295124.getClass(), "implicitPrototypeFallback", null);
        setField(term295124, term295124.getClass(), "ownerFunction", term295124);
        setBooleanField(term295124, term295124.getClass(), "prettyPrint", false);
        setBooleanField(term295124, term295124.getClass(), "visited", false);
        setField(term295124, term295124.getClass(), "docInfo", null);
        setBooleanField(term295124, term295124.getClass(), "unknown", false);
        setBooleanField(term295124, term295124.getClass(), "resolved", false);
        setField(term295124, term295124.getClass(), "resolveResult", null);
        setBooleanField(term295124, term295124.getClass(), "inTemplatedCheckVisit", false);
        setField(term295124, term295124.getClass(), "registry", null);
        term295128 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term295129 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term295128, term295128.getClass(), "call", null);
        setField(term295129, term295129.getClass(), "name", "prototype");
        setField(term295129, term295129.getClass(), "type", term295128);
        setBooleanField(term295129, term295129.getClass(), "inferred", true);
        setField(term295129, term295129.getClass(), "propertyNode", null);
        setField(term295129, term295129.getClass(), "docInfo", null);
        setField(term295128, term295128.getClass(), "prototypeSlot", term295129);
        setField(term295128, term295128.getClass(), "kind", null);
        setField(term295128, term295128.getClass(), "propAccess", null);
        setField(term295128, term295128.getClass(), "typeOfThis", null);
        setField(term295128, term295128.getClass(), "source", null);
        setField(term295128, term295128.getClass(), "implementedInterfaces", null);
        setField(term295128, term295128.getClass(), "extendedInterfaces", null);
        setField(term295128, term295128.getClass(), "subTypes", null);
        setField(term295128, term295128.getClass(), "templateTypeNames", null);
        setField(term295128, term295128.getClass(), "className", null);
        setField(term295128, term295128.getClass(), "properties", null);
        setBooleanField(term295128, term295128.getClass(), "nativeType", false);
        setField(term295128, term295128.getClass(), "implicitPrototypeFallback", null);
        setField(term295128, term295128.getClass(), "ownerFunction", term295128);
        setBooleanField(term295128, term295128.getClass(), "prettyPrint", false);
        setBooleanField(term295128, term295128.getClass(), "visited", false);
        setField(term295128, term295128.getClass(), "docInfo", null);
        setBooleanField(term295128, term295128.getClass(), "unknown", false);
        setBooleanField(term295128, term295128.getClass(), "resolved", false);
        setField(term295128, term295128.getClass(), "resolveResult", null);
        setBooleanField(term295128, term295128.getClass(), "inTemplatedCheckVisit", false);
        setField(term295128, term295128.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term295057;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototypeNoCheck", argTypes, term295057, args);
        assertTrue(recursiveEquals(term295057, term295124));
        assertTrue(recursiveEquals(term295057, term295128));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


