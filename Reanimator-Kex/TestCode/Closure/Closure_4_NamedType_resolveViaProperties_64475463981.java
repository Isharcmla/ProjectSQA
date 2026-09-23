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

public class NamedType_resolveViaProperties_64475463981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14833;
     Object term14999;

    public NamedType_resolveViaProperties_64475463981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14833 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term14975 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term14833, term14833.getClass(), "reference", "");
        setField(term14833, term14833.getClass(), "registry", term14975);
        term14999 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term15002 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term14999, term14999.getClass(), "reference", "");
        setField(term14999, term14999.getClass(), "sourceName", null);
        setIntField(term14999, term14999.getClass(), "lineno", 0);
        setIntField(term14999, term14999.getClass(), "charno", 0);
        setField(term14999, term14999.getClass(), "validator", null);
        setField(term14999, term14999.getClass(), "propertyContinuations", null);
        setField(term14999, term14999.getClass(), "referencedType", null);
        setField(term14999, term14999.getClass(), "referencedObjType", null);
        setBooleanField(term14999, term14999.getClass(), "visited", false);
        setField(term14999, term14999.getClass(), "docInfo", null);
        setBooleanField(term14999, term14999.getClass(), "unknown", false);
        setBooleanField(term14999, term14999.getClass(), "resolved", true);
        setField(term14999, term14999.getClass(), "resolveResult", term14999);
        setField(term14999, term14999.getClass(), "templateKeys", null);
        setField(term14999, term14999.getClass(), "templatizedTypes", null);
        setBooleanField(term14999, term14999.getClass(), "inTemplatedCheckVisit", false);
        setField(term15002, term15002.getClass(), "reporter", null);
        setField(term15002, term15002.getClass(), "nativeTypes", null);
        setField(term15002, term15002.getClass(), "namesToTypes", null);
        setField(term15002, term15002.getClass(), "namespaces", null);
        setField(term15002, term15002.getClass(), "nonNullableTypeNames", null);
        setField(term15002, term15002.getClass(), "forwardDeclaredTypes", null);
        setField(term15002, term15002.getClass(), "typesIndexedByProperty", null);
        setField(term15002, term15002.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term15002, term15002.getClass(), "greatestSubtypeByProperty", null);
        setField(term15002, term15002.getClass(), "interfaceToImplementors", null);
        setField(term15002, term15002.getClass(), "unresolvedNamedTypes", null);
        setField(term15002, term15002.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term15002, term15002.getClass(), "lastGeneration", false);
        setField(term15002, term15002.getClass(), "templateTypes", null);
        setBooleanField(term15002, term15002.getClass(), "tolerateUndefinedValues", false);
        setField(term15002, term15002.getClass(), "resolveMode", null);
        setField(term14999, term14999.getClass(), "registry", term15002);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "resolveViaProperties", argTypes, term14833, args);
        assertTrue(recursiveEquals(term14833, term14999));
    }

};


