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

public class TypeValidator_expectCanCast_1169833078172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42761;
     Object term42865;
     Object term42969;
     Object term43052;
     Object term43053;
     Object term43054;

    public TypeValidator_expectCanCast_1169833078172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42761 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term42865 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term42969 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term43052 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term43052, term43052.getClass(), "compiler", null);
        setField(term43052, term43052.getClass(), "typeRegistry", null);
        setField(term43052, term43052.getClass(), "allValueTypes", null);
        setBooleanField(term43052, term43052.getClass(), "shouldReport", false);
        setField(term43052, term43052.getClass(), "nullOrUndefined", null);
        setField(term43052, term43052.getClass(), "mismatches", null);
        term43053 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term43053, term43053.getClass(), "call", null);
        setField(term43053, term43053.getClass(), "prototypeSlot", null);
        setField(term43053, term43053.getClass(), "kind", null);
        setField(term43053, term43053.getClass(), "propAccess", null);
        setField(term43053, term43053.getClass(), "typeOfThis", null);
        setField(term43053, term43053.getClass(), "source", null);
        setField(term43053, term43053.getClass(), "implementedInterfaces", null);
        setField(term43053, term43053.getClass(), "extendedInterfaces", null);
        setField(term43053, term43053.getClass(), "subTypes", null);
        setField(term43053, term43053.getClass(), "className", null);
        setField(term43053, term43053.getClass(), "properties", null);
        setBooleanField(term43053, term43053.getClass(), "nativeType", false);
        setField(term43053, term43053.getClass(), "implicitPrototypeFallback", null);
        setField(term43053, term43053.getClass(), "ownerFunction", null);
        setBooleanField(term43053, term43053.getClass(), "prettyPrint", false);
        setBooleanField(term43053, term43053.getClass(), "visited", false);
        setField(term43053, term43053.getClass(), "docInfo", null);
        setBooleanField(term43053, term43053.getClass(), "unknown", false);
        setBooleanField(term43053, term43053.getClass(), "resolved", false);
        setField(term43053, term43053.getClass(), "resolveResult", null);
        setField(term43053, term43053.getClass(), "templateKeys", null);
        setField(term43053, term43053.getClass(), "templatizedTypes", null);
        setBooleanField(term43053, term43053.getClass(), "inTemplatedCheckVisit", false);
        setField(term43053, term43053.getClass(), "registry", null);
        term43054 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term43054, term43054.getClass(), "call", null);
        setField(term43054, term43054.getClass(), "prototypeSlot", null);
        setField(term43054, term43054.getClass(), "kind", null);
        setField(term43054, term43054.getClass(), "propAccess", null);
        setField(term43054, term43054.getClass(), "typeOfThis", null);
        setField(term43054, term43054.getClass(), "source", null);
        setField(term43054, term43054.getClass(), "implementedInterfaces", null);
        setField(term43054, term43054.getClass(), "extendedInterfaces", null);
        setField(term43054, term43054.getClass(), "subTypes", null);
        setField(term43054, term43054.getClass(), "className", null);
        setField(term43054, term43054.getClass(), "properties", null);
        setBooleanField(term43054, term43054.getClass(), "nativeType", false);
        setField(term43054, term43054.getClass(), "implicitPrototypeFallback", null);
        setField(term43054, term43054.getClass(), "ownerFunction", null);
        setBooleanField(term43054, term43054.getClass(), "prettyPrint", false);
        setBooleanField(term43054, term43054.getClass(), "visited", false);
        setField(term43054, term43054.getClass(), "docInfo", null);
        setBooleanField(term43054, term43054.getClass(), "unknown", false);
        setBooleanField(term43054, term43054.getClass(), "resolved", false);
        setField(term43054, term43054.getClass(), "resolveResult", null);
        setField(term43054, term43054.getClass(), "templateKeys", null);
        setField(term43054, term43054.getClass(), "templatizedTypes", null);
        setBooleanField(term43054, term43054.getClass(), "inTemplatedCheckVisit", false);
        setField(term43054, term43054.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term42865;
        args[3] = term42969;
        callMethod(klass, "expectCanCast", argTypes, term42761, args);
        assertTrue(recursiveEquals(term42761, term43052));
        assertTrue(recursiveEquals(term42865, null));
        assertTrue(recursiveEquals(term42969, null));
    }

};


