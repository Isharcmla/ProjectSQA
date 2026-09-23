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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class FunctionType_setExtendedInterfaces_796243139391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357496;
     Object term357696;
     Object term358025;
     Object term358030;

    public FunctionType_setExtendedInterfaces_796243139391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term358033 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term358032 = ((Class) term358033).getDeclaredField((String) "INTERFACE");
        ((Field) term358032).setAccessible(true);
        Object enum609 = ((Field) term358032).get((Object) null);
        term357496 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term357496, term357496.getClass(), "kind", enum609);
        term357696 = new ArrayList();
        Class<? extends Object> term358327 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term358326 = ((Class) term358327).getDeclaredField((String) "INTERFACE");
        ((Field) term358326).setAccessible(true);
        Object enum610 = ((Field) term358326).get((Object) null);
        term358025 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term358029 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableList"));
        setField(term358025, term358025.getClass(), "call", null);
        setField(term358025, term358025.getClass(), "prototypeSlot", null);
        setField(term358025, term358025.getClass(), "kind", enum610);
        setField(term358025, term358025.getClass(), "propAccess", null);
        setField(term358025, term358025.getClass(), "typeOfThis", null);
        setField(term358025, term358025.getClass(), "source", null);
        setField(term358025, term358025.getClass(), "implementedInterfaces", null);
        setField(term358029, term358029.getClass(), "asList", null);
        setField(term358025, term358025.getClass(), "extendedInterfaces", term358029);
        setField(term358025, term358025.getClass(), "subTypes", null);
        setField(term358025, term358025.getClass(), "templateTypeNames", null);
        setField(term358025, term358025.getClass(), "className", null);
        setField(term358025, term358025.getClass(), "properties", null);
        setBooleanField(term358025, term358025.getClass(), "nativeType", false);
        setField(term358025, term358025.getClass(), "implicitPrototypeFallback", null);
        setField(term358025, term358025.getClass(), "ownerFunction", null);
        setBooleanField(term358025, term358025.getClass(), "prettyPrint", false);
        setBooleanField(term358025, term358025.getClass(), "visited", false);
        setField(term358025, term358025.getClass(), "docInfo", null);
        setBooleanField(term358025, term358025.getClass(), "unknown", false);
        setBooleanField(term358025, term358025.getClass(), "resolved", false);
        setField(term358025, term358025.getClass(), "resolveResult", null);
        setBooleanField(term358025, term358025.getClass(), "inTemplatedCheckVisit", false);
        setField(term358025, term358025.getClass(), "registry", null);
        term358030 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term357696;
        callMethod(klass, "setExtendedInterfaces", argTypes, term357496, args);
        assertTrue(recursiveEquals(term357496, term358025));
        assertTrue(recursiveEquals(term357696, term358030));
    }

};


