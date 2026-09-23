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
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.ArrayList;

public class NamedType_getTypedefType_106686040294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92699;
     Object term93103;
     Object term93227;
     Object term143915;
     Object term143919;
     Object term143920;

    public NamedType_getTypedefType_106686040294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term92851 = new HashSet();
        term92699 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term92803 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term92803, term92803.getClass(), "lastGeneration", true);
        setField(term92803, term92803.getClass(), "forwardDeclaredTypes", term92851);
        setField(term92699, term92699.getClass(), "registry", term92803);
        setField(term92699, term92699.getClass(), "reference", null);
        setField(term92699, term92699.getClass(), "sourceName", null);
        setIntField(term92699, term92699.getClass(), "lineno", 0);
        setIntField(term92699, term92699.getClass(), "charno", 0);
        term93103 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        term93227 = newInstance(Class.forName("com.google.javascript.jscomp.LinkedFlowScope$LinkedFlowSlot"));
        setField(term93227, term93227.getClass(), "type", null);
        HashMap term143918 = new HashMap();
        Set<Object> term143925 =  ((Map) term143918).keySet();
        HashSet term143917 = new HashSet((Collection<? extends Object>) term143925);
        term143915 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term143916 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term143915, term143915.getClass(), "reference", null);
        setField(term143915, term143915.getClass(), "sourceName", null);
        setIntField(term143915, term143915.getClass(), "lineno", 0);
        setIntField(term143915, term143915.getClass(), "charno", 0);
        setField(term143915, term143915.getClass(), "validator", null);
        setField(term143915, term143915.getClass(), "propertyContinuations", null);
        setField(term143915, term143915.getClass(), "referencedType", null);
        setField(term143915, term143915.getClass(), "referencedObjType", null);
        setBooleanField(term143915, term143915.getClass(), "visited", false);
        setField(term143915, term143915.getClass(), "docInfo", null);
        setBooleanField(term143915, term143915.getClass(), "unknown", false);
        setBooleanField(term143915, term143915.getClass(), "resolved", true);
        setField(term143915, term143915.getClass(), "resolveResult", null);
        setField(term143915, term143915.getClass(), "templateKeys", null);
        setField(term143915, term143915.getClass(), "templatizedTypes", null);
        setBooleanField(term143915, term143915.getClass(), "inTemplatedCheckVisit", false);
        setField(term143916, term143916.getClass(), "reporter", null);
        setField(term143916, term143916.getClass(), "nativeTypes", null);
        setField(term143916, term143916.getClass(), "namesToTypes", null);
        setField(term143916, term143916.getClass(), "namespaces", null);
        setField(term143916, term143916.getClass(), "nonNullableTypeNames", null);
        setField(term143916, term143916.getClass(), "forwardDeclaredTypes", term143917);
        setField(term143916, term143916.getClass(), "typesIndexedByProperty", null);
        setField(term143916, term143916.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term143916, term143916.getClass(), "greatestSubtypeByProperty", null);
        setField(term143916, term143916.getClass(), "interfaceToImplementors", null);
        setField(term143916, term143916.getClass(), "unresolvedNamedTypes", null);
        setField(term143916, term143916.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term143916, term143916.getClass(), "lastGeneration", true);
        setField(term143916, term143916.getClass(), "templateTypes", null);
        setBooleanField(term143916, term143916.getClass(), "tolerateUndefinedValues", false);
        setField(term143916, term143916.getClass(), "resolveMode", null);
        setField(term143915, term143915.getClass(), "registry", term143916);
        term143919 = newInstance(Class.forName("com.google.javascript.jscomp.LinkedFlowScope$LinkedFlowSlot"));
        setField(term143919, term143919.getClass(), "parent", null);
        setField(term143919, term143919.getClass(), "name", null);
        setField(term143919, term143919.getClass(), "type", null);
        setBooleanField(term143919, term143919.getClass(), "inferred", false);
        ArrayList term143921 = new ArrayList();
        ((ArrayList) term143921).add("Bad type annotation. Unknown type null");
        term143920 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term143920, term143920.getClass(), "warnings", term143921);
        setField(term143920, term143920.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticSlot");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term93103;
        args[1] = term93227;
        args[2] = null;
        Object retValue = callMethod(klass, "getTypedefType", argTypes, term92699, args);
        assertTrue(recursiveEquals(term92699, term143915));
        assertTrue(recursiveEquals(term93103, term143919));
        assertTrue(recursiveEquals(term93227, term143920));
        assertTrue(recursiveEquals(retValue, null));
    }

};


