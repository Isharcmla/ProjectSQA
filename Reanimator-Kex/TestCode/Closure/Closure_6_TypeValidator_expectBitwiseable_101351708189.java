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

public class TypeValidator_expectBitwiseable_101351708189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21978;
     Object term22066;
     Object term22287;
     Object term22288;

    public TypeValidator_expectBitwiseable_101351708189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21978 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term22066 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        term22287 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term22287, term22287.getClass(), "compiler", null);
        setField(term22287, term22287.getClass(), "typeRegistry", null);
        setField(term22287, term22287.getClass(), "allValueTypes", null);
        setBooleanField(term22287, term22287.getClass(), "shouldReport", false);
        setField(term22287, term22287.getClass(), "nullOrUndefined", null);
        setField(term22287, term22287.getClass(), "mismatches", null);
        term22288 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term22288, term22288.getClass(), "call", null);
        setField(term22288, term22288.getClass(), "prototypeSlot", null);
        setField(term22288, term22288.getClass(), "kind", null);
        setField(term22288, term22288.getClass(), "propAccess", null);
        setField(term22288, term22288.getClass(), "typeOfThis", null);
        setField(term22288, term22288.getClass(), "source", null);
        setField(term22288, term22288.getClass(), "implementedInterfaces", null);
        setField(term22288, term22288.getClass(), "extendedInterfaces", null);
        setField(term22288, term22288.getClass(), "subTypes", null);
        setField(term22288, term22288.getClass(), "className", null);
        setField(term22288, term22288.getClass(), "properties", null);
        setBooleanField(term22288, term22288.getClass(), "nativeType", false);
        setField(term22288, term22288.getClass(), "implicitPrototypeFallback", null);
        setField(term22288, term22288.getClass(), "ownerFunction", null);
        setBooleanField(term22288, term22288.getClass(), "prettyPrint", false);
        setBooleanField(term22288, term22288.getClass(), "visited", false);
        setField(term22288, term22288.getClass(), "docInfo", null);
        setBooleanField(term22288, term22288.getClass(), "unknown", false);
        setBooleanField(term22288, term22288.getClass(), "resolved", false);
        setField(term22288, term22288.getClass(), "resolveResult", null);
        setField(term22288, term22288.getClass(), "templateKeys", null);
        setField(term22288, term22288.getClass(), "templatizedTypes", null);
        setBooleanField(term22288, term22288.getClass(), "inTemplatedCheckVisit", false);
        setField(term22288, term22288.getClass(), "registry", null);
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
        args[2] = term22066;
        args[3] = null;
        callMethod(klass, "expectBitwiseable", argTypes, term21978, args);
        assertTrue(recursiveEquals(term21978, term22287));
        assertTrue(recursiveEquals(term22066, null));
    }

};


