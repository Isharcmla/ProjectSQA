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
import java.util.ArrayList;

public class NamedType_handleUnresolvedType_206329762253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78954;
     Object term79196;
     Object term79354;
     Object term79358;

    public NamedType_handleUnresolvedType_206329762253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78954 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term79058 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term79058, term79058.getClass(), "lastGeneration", true);
        setField(term78954, term78954.getClass(), "registry", term79058);
        setField(term78954, term78954.getClass(), "reference", null);
        setField(term78954, term78954.getClass(), "sourceName", "");
        setIntField(term78954, term78954.getClass(), "lineno", 0);
        setIntField(term78954, term78954.getClass(), "charno", 0);
        term79196 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term79196, term79196.getClass(), "warnings", null);
        term79354 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term79357 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term79354, term79354.getClass(), "reference", null);
        setField(term79354, term79354.getClass(), "sourceName", "");
        setIntField(term79354, term79354.getClass(), "lineno", 0);
        setIntField(term79354, term79354.getClass(), "charno", 0);
        setField(term79354, term79354.getClass(), "validator", null);
        setField(term79354, term79354.getClass(), "propertyContinuations", null);
        setField(term79354, term79354.getClass(), "referencedType", null);
        setField(term79354, term79354.getClass(), "referencedObjType", null);
        setBooleanField(term79354, term79354.getClass(), "visited", false);
        setField(term79354, term79354.getClass(), "docInfo", null);
        setBooleanField(term79354, term79354.getClass(), "unknown", false);
        setBooleanField(term79354, term79354.getClass(), "resolved", true);
        setField(term79354, term79354.getClass(), "resolveResult", null);
        setField(term79354, term79354.getClass(), "templateKeys", null);
        setField(term79354, term79354.getClass(), "templatizedTypes", null);
        setBooleanField(term79354, term79354.getClass(), "inTemplatedCheckVisit", false);
        setField(term79357, term79357.getClass(), "reporter", null);
        setField(term79357, term79357.getClass(), "nativeTypes", null);
        setField(term79357, term79357.getClass(), "namesToTypes", null);
        setField(term79357, term79357.getClass(), "namespaces", null);
        setField(term79357, term79357.getClass(), "nonNullableTypeNames", null);
        setField(term79357, term79357.getClass(), "forwardDeclaredTypes", null);
        setField(term79357, term79357.getClass(), "typesIndexedByProperty", null);
        setField(term79357, term79357.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term79357, term79357.getClass(), "greatestSubtypeByProperty", null);
        setField(term79357, term79357.getClass(), "interfaceToImplementors", null);
        setField(term79357, term79357.getClass(), "unresolvedNamedTypes", null);
        setField(term79357, term79357.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term79357, term79357.getClass(), "lastGeneration", true);
        setField(term79357, term79357.getClass(), "templateTypes", null);
        setBooleanField(term79357, term79357.getClass(), "tolerateUndefinedValues", false);
        setField(term79357, term79357.getClass(), "resolveMode", null);
        setField(term79354, term79354.getClass(), "registry", term79357);
        ArrayList term79359 = new ArrayList();
        ((ArrayList) term79359).add("Bad type annotation. Unknown type null");
        term79358 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term79358, term79358.getClass(), "warnings", term79359);
        setField(term79358, term79358.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term79196;
        args[1] = false;
        callMethod(klass, "handleUnresolvedType", argTypes, term78954, args);
        assertTrue(recursiveEquals(term78954, term79354));
        assertTrue(recursiveEquals(term79196, term79358));
    }

};


