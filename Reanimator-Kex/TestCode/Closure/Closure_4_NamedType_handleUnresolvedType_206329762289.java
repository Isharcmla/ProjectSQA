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

public class NamedType_handleUnresolvedType_206329762289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89764;
     Object term90006;
     Object term142806;
     Object term142810;

    public NamedType_handleUnresolvedType_206329762289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89764 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term89868 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term89868, term89868.getClass(), "lastGeneration", true);
        setField(term89764, term89764.getClass(), "registry", term89868);
        setField(term89764, term89764.getClass(), "reference", null);
        setField(term89764, term89764.getClass(), "sourceName", "");
        setIntField(term89764, term89764.getClass(), "lineno", 0);
        setIntField(term89764, term89764.getClass(), "charno", 0);
        ArrayList term90058 = new ArrayList();
        term90006 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term90006, term90006.getClass(), "warnings", term90058);
        term142806 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term142809 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term142806, term142806.getClass(), "reference", null);
        setField(term142806, term142806.getClass(), "sourceName", "");
        setIntField(term142806, term142806.getClass(), "lineno", 0);
        setIntField(term142806, term142806.getClass(), "charno", 0);
        setField(term142806, term142806.getClass(), "validator", null);
        setField(term142806, term142806.getClass(), "propertyContinuations", null);
        setField(term142806, term142806.getClass(), "referencedType", null);
        setField(term142806, term142806.getClass(), "referencedObjType", null);
        setBooleanField(term142806, term142806.getClass(), "visited", false);
        setField(term142806, term142806.getClass(), "docInfo", null);
        setBooleanField(term142806, term142806.getClass(), "unknown", false);
        setBooleanField(term142806, term142806.getClass(), "resolved", true);
        setField(term142806, term142806.getClass(), "resolveResult", null);
        setField(term142806, term142806.getClass(), "templateKeys", null);
        setField(term142806, term142806.getClass(), "templatizedTypes", null);
        setBooleanField(term142806, term142806.getClass(), "inTemplatedCheckVisit", false);
        setField(term142809, term142809.getClass(), "reporter", null);
        setField(term142809, term142809.getClass(), "nativeTypes", null);
        setField(term142809, term142809.getClass(), "namesToTypes", null);
        setField(term142809, term142809.getClass(), "namespaces", null);
        setField(term142809, term142809.getClass(), "nonNullableTypeNames", null);
        setField(term142809, term142809.getClass(), "forwardDeclaredTypes", null);
        setField(term142809, term142809.getClass(), "typesIndexedByProperty", null);
        setField(term142809, term142809.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term142809, term142809.getClass(), "greatestSubtypeByProperty", null);
        setField(term142809, term142809.getClass(), "interfaceToImplementors", null);
        setField(term142809, term142809.getClass(), "unresolvedNamedTypes", null);
        setField(term142809, term142809.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term142809, term142809.getClass(), "lastGeneration", true);
        setField(term142809, term142809.getClass(), "templateTypes", null);
        setBooleanField(term142809, term142809.getClass(), "tolerateUndefinedValues", false);
        setField(term142809, term142809.getClass(), "resolveMode", null);
        setField(term142806, term142806.getClass(), "registry", term142809);
        ArrayList term142811 = new ArrayList();
        ((ArrayList) term142811).add("Bad type annotation. Unknown type null");
        term142810 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term142810, term142810.getClass(), "warnings", term142811);
        setField(term142810, term142810.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term90006;
        args[1] = false;
        callMethod(klass, "handleUnresolvedType", argTypes, term89764, args);
        assertTrue(recursiveEquals(term89764, term142806));
        assertTrue(recursiveEquals(term90006, term142810));
    }

};


