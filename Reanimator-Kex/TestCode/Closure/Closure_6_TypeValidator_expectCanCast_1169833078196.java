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

public class TypeValidator_expectCanCast_1169833078196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52954;
     Object term53110;
     Object term53153;
     Object term53154;
     Object term53155;

    public TypeValidator_expectCanCast_1169833078196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52954 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term53110 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setBooleanField(term53110, term53110.getClass(), "unknown", false);
        term53153 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term53153, term53153.getClass(), "compiler", null);
        setField(term53153, term53153.getClass(), "typeRegistry", null);
        setField(term53153, term53153.getClass(), "allValueTypes", null);
        setBooleanField(term53153, term53153.getClass(), "shouldReport", false);
        setField(term53153, term53153.getClass(), "nullOrUndefined", null);
        setField(term53153, term53153.getClass(), "mismatches", null);
        term53154 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term53154, term53154.getClass(), "call", null);
        setField(term53154, term53154.getClass(), "prototypeSlot", null);
        setField(term53154, term53154.getClass(), "kind", null);
        setField(term53154, term53154.getClass(), "propAccess", null);
        setField(term53154, term53154.getClass(), "typeOfThis", null);
        setField(term53154, term53154.getClass(), "source", null);
        setField(term53154, term53154.getClass(), "implementedInterfaces", null);
        setField(term53154, term53154.getClass(), "extendedInterfaces", null);
        setField(term53154, term53154.getClass(), "subTypes", null);
        setField(term53154, term53154.getClass(), "className", null);
        setField(term53154, term53154.getClass(), "properties", null);
        setBooleanField(term53154, term53154.getClass(), "nativeType", false);
        setField(term53154, term53154.getClass(), "implicitPrototypeFallback", null);
        setField(term53154, term53154.getClass(), "ownerFunction", null);
        setBooleanField(term53154, term53154.getClass(), "prettyPrint", false);
        setBooleanField(term53154, term53154.getClass(), "visited", false);
        setField(term53154, term53154.getClass(), "docInfo", null);
        setBooleanField(term53154, term53154.getClass(), "unknown", false);
        setBooleanField(term53154, term53154.getClass(), "resolved", false);
        setField(term53154, term53154.getClass(), "resolveResult", null);
        setField(term53154, term53154.getClass(), "templateKeys", null);
        setField(term53154, term53154.getClass(), "templatizedTypes", null);
        setBooleanField(term53154, term53154.getClass(), "inTemplatedCheckVisit", false);
        setField(term53154, term53154.getClass(), "registry", null);
        term53155 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term53155, term53155.getClass(), "call", null);
        setField(term53155, term53155.getClass(), "prototypeSlot", null);
        setField(term53155, term53155.getClass(), "kind", null);
        setField(term53155, term53155.getClass(), "propAccess", null);
        setField(term53155, term53155.getClass(), "typeOfThis", null);
        setField(term53155, term53155.getClass(), "source", null);
        setField(term53155, term53155.getClass(), "implementedInterfaces", null);
        setField(term53155, term53155.getClass(), "extendedInterfaces", null);
        setField(term53155, term53155.getClass(), "subTypes", null);
        setField(term53155, term53155.getClass(), "className", null);
        setField(term53155, term53155.getClass(), "properties", null);
        setBooleanField(term53155, term53155.getClass(), "nativeType", false);
        setField(term53155, term53155.getClass(), "implicitPrototypeFallback", null);
        setField(term53155, term53155.getClass(), "ownerFunction", null);
        setBooleanField(term53155, term53155.getClass(), "prettyPrint", false);
        setBooleanField(term53155, term53155.getClass(), "visited", false);
        setField(term53155, term53155.getClass(), "docInfo", null);
        setBooleanField(term53155, term53155.getClass(), "unknown", false);
        setBooleanField(term53155, term53155.getClass(), "resolved", false);
        setField(term53155, term53155.getClass(), "resolveResult", null);
        setField(term53155, term53155.getClass(), "templateKeys", null);
        setField(term53155, term53155.getClass(), "templatizedTypes", null);
        setBooleanField(term53155, term53155.getClass(), "inTemplatedCheckVisit", false);
        setField(term53155, term53155.getClass(), "registry", null);
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
        args[2] = term53110;
        args[3] = term53110;
        callMethod(klass, "expectCanCast", argTypes, term52954, args);
        assertTrue(recursiveEquals(term52954, term53153));
        assertTrue(recursiveEquals(term53110, null));
        assertTrue(recursiveEquals(term53110, null));
    }

};


