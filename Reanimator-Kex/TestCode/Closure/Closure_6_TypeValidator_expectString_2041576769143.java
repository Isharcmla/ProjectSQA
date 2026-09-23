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

public class TypeValidator_expectString_2041576769143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33596;
     Object term33700;
     Object term35474;
     Object term35475;

    public TypeValidator_expectString_2041576769143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33596 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term33700 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term35474 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term35474, term35474.getClass(), "compiler", null);
        setField(term35474, term35474.getClass(), "typeRegistry", null);
        setField(term35474, term35474.getClass(), "allValueTypes", null);
        setBooleanField(term35474, term35474.getClass(), "shouldReport", false);
        setField(term35474, term35474.getClass(), "nullOrUndefined", null);
        setField(term35474, term35474.getClass(), "mismatches", null);
        term35475 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term35475, term35475.getClass(), "call", null);
        setField(term35475, term35475.getClass(), "prototypeSlot", null);
        setField(term35475, term35475.getClass(), "kind", null);
        setField(term35475, term35475.getClass(), "propAccess", null);
        setField(term35475, term35475.getClass(), "typeOfThis", null);
        setField(term35475, term35475.getClass(), "source", null);
        setField(term35475, term35475.getClass(), "implementedInterfaces", null);
        setField(term35475, term35475.getClass(), "extendedInterfaces", null);
        setField(term35475, term35475.getClass(), "subTypes", null);
        setField(term35475, term35475.getClass(), "className", null);
        setField(term35475, term35475.getClass(), "properties", null);
        setBooleanField(term35475, term35475.getClass(), "nativeType", false);
        setField(term35475, term35475.getClass(), "implicitPrototypeFallback", null);
        setField(term35475, term35475.getClass(), "ownerFunction", null);
        setBooleanField(term35475, term35475.getClass(), "prettyPrint", false);
        setBooleanField(term35475, term35475.getClass(), "visited", false);
        setField(term35475, term35475.getClass(), "docInfo", null);
        setBooleanField(term35475, term35475.getClass(), "unknown", false);
        setBooleanField(term35475, term35475.getClass(), "resolved", false);
        setField(term35475, term35475.getClass(), "resolveResult", null);
        setField(term35475, term35475.getClass(), "templateKeys", null);
        setField(term35475, term35475.getClass(), "templatizedTypes", null);
        setBooleanField(term35475, term35475.getClass(), "inTemplatedCheckVisit", false);
        setField(term35475, term35475.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term33700;
        args[3] = null;
        callMethod(klass, "expectString", argTypes, term33596, args);
        assertTrue(recursiveEquals(term33596, term35474));
        assertTrue(recursiveEquals(term33700, null));
    }

};


