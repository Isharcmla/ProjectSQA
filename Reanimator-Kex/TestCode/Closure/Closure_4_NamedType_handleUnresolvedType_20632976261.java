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

public class NamedType_handleUnresolvedType_20632976261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12271;
     Object term12392;

    public NamedType_handleUnresolvedType_20632976261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12271 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term12375 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term12271, term12271.getClass(), "registry", term12375);
        term12392 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term12393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term12392, term12392.getClass(), "reference", null);
        setField(term12392, term12392.getClass(), "sourceName", null);
        setIntField(term12392, term12392.getClass(), "lineno", 0);
        setIntField(term12392, term12392.getClass(), "charno", 0);
        setField(term12392, term12392.getClass(), "validator", null);
        setField(term12392, term12392.getClass(), "propertyContinuations", null);
        setField(term12392, term12392.getClass(), "referencedType", null);
        setField(term12392, term12392.getClass(), "referencedObjType", null);
        setBooleanField(term12392, term12392.getClass(), "visited", false);
        setField(term12392, term12392.getClass(), "docInfo", null);
        setBooleanField(term12392, term12392.getClass(), "unknown", false);
        setBooleanField(term12392, term12392.getClass(), "resolved", true);
        setField(term12392, term12392.getClass(), "resolveResult", term12392);
        setField(term12392, term12392.getClass(), "templateKeys", null);
        setField(term12392, term12392.getClass(), "templatizedTypes", null);
        setBooleanField(term12392, term12392.getClass(), "inTemplatedCheckVisit", false);
        setField(term12393, term12393.getClass(), "reporter", null);
        setField(term12393, term12393.getClass(), "nativeTypes", null);
        setField(term12393, term12393.getClass(), "namesToTypes", null);
        setField(term12393, term12393.getClass(), "namespaces", null);
        setField(term12393, term12393.getClass(), "nonNullableTypeNames", null);
        setField(term12393, term12393.getClass(), "forwardDeclaredTypes", null);
        setField(term12393, term12393.getClass(), "typesIndexedByProperty", null);
        setField(term12393, term12393.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term12393, term12393.getClass(), "greatestSubtypeByProperty", null);
        setField(term12393, term12393.getClass(), "interfaceToImplementors", null);
        setField(term12393, term12393.getClass(), "unresolvedNamedTypes", null);
        setField(term12393, term12393.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term12393, term12393.getClass(), "lastGeneration", false);
        setField(term12393, term12393.getClass(), "templateTypes", null);
        setBooleanField(term12393, term12393.getClass(), "tolerateUndefinedValues", false);
        setField(term12393, term12393.getClass(), "resolveMode", null);
        setField(term12392, term12392.getClass(), "registry", term12393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = false;
        callMethod(klass, "handleUnresolvedType", argTypes, term12271, args);
        assertTrue(recursiveEquals(term12271, term12392));
    }

};


