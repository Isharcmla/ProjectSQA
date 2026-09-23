package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.HashSet;

public class DisambiguateProperties_addInvalidatingType_1040538549151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53222;
     Object term53520;
     Object term53861;
     Object term53862;

    public DisambiguateProperties_addInvalidatingType_1040538549151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term53416 = new HashSet();
        term53222 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term53368 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem"));
        setField(term53368, term53368.getClass(), "invalidatingTypes", term53416);
        setField(term53222, term53222.getClass(), "typeSystem", term53368);
        term53520 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term53861 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term53861, term53861.getClass(), "call", null);
        setField(term53861, term53861.getClass(), "prototypeSlot", null);
        setField(term53861, term53861.getClass(), "kind", null);
        setField(term53861, term53861.getClass(), "propAccess", null);
        setField(term53861, term53861.getClass(), "typeOfThis", null);
        setField(term53861, term53861.getClass(), "source", null);
        setField(term53861, term53861.getClass(), "implementedInterfaces", null);
        setField(term53861, term53861.getClass(), "extendedInterfaces", null);
        setField(term53861, term53861.getClass(), "subTypes", null);
        setField(term53861, term53861.getClass(), "className", null);
        setField(term53861, term53861.getClass(), "properties", null);
        setBooleanField(term53861, term53861.getClass(), "nativeType", false);
        setField(term53861, term53861.getClass(), "implicitPrototypeFallback", null);
        setField(term53861, term53861.getClass(), "ownerFunction", null);
        setBooleanField(term53861, term53861.getClass(), "prettyPrint", false);
        setBooleanField(term53861, term53861.getClass(), "visited", false);
        setField(term53861, term53861.getClass(), "docInfo", null);
        setBooleanField(term53861, term53861.getClass(), "unknown", false);
        setBooleanField(term53861, term53861.getClass(), "resolved", false);
        setField(term53861, term53861.getClass(), "resolveResult", null);
        setField(term53861, term53861.getClass(), "templateTypeMap", null);
        setBooleanField(term53861, term53861.getClass(), "inTemplatedCheckVisit", false);
        setField(term53861, term53861.getClass(), "registry", null);
        term53862 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term53862, term53862.getClass(), "call", null);
        setField(term53862, term53862.getClass(), "prototypeSlot", null);
        setField(term53862, term53862.getClass(), "kind", null);
        setField(term53862, term53862.getClass(), "propAccess", null);
        setField(term53862, term53862.getClass(), "typeOfThis", null);
        setField(term53862, term53862.getClass(), "source", null);
        setField(term53862, term53862.getClass(), "implementedInterfaces", null);
        setField(term53862, term53862.getClass(), "extendedInterfaces", null);
        setField(term53862, term53862.getClass(), "subTypes", null);
        setField(term53862, term53862.getClass(), "className", null);
        setField(term53862, term53862.getClass(), "properties", null);
        setBooleanField(term53862, term53862.getClass(), "nativeType", false);
        setField(term53862, term53862.getClass(), "implicitPrototypeFallback", null);
        setField(term53862, term53862.getClass(), "ownerFunction", null);
        setBooleanField(term53862, term53862.getClass(), "prettyPrint", false);
        setBooleanField(term53862, term53862.getClass(), "visited", false);
        setField(term53862, term53862.getClass(), "docInfo", null);
        setBooleanField(term53862, term53862.getClass(), "unknown", false);
        setBooleanField(term53862, term53862.getClass(), "resolved", false);
        setField(term53862, term53862.getClass(), "resolveResult", null);
        setField(term53862, term53862.getClass(), "templateTypeMap", null);
        setBooleanField(term53862, term53862.getClass(), "inTemplatedCheckVisit", false);
        setField(term53862, term53862.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[2];
        args[0] = term53520;
        args[1] = null;
        callMethod(klass, "addInvalidatingType", argTypes, term53222, args);
        assertTrue(recursiveEquals(term53222, term53861));
        assertTrue(recursiveEquals(term53520, term53862));
    }

};


