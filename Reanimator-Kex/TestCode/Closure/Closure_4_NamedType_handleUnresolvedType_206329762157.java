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

public class NamedType_handleUnresolvedType_206329762157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33759;
     Object term33963;
     Object term35927;
     Object term35929;

    public NamedType_handleUnresolvedType_206329762157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33759 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term33863 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term33863, term33863.getClass(), "lastGeneration", true);
        setField(term33759, term33759.getClass(), "registry", term33863);
        setField(term33759, term33759.getClass(), "reference", null);
        setField(term33759, term33759.getClass(), "sourceName", null);
        setIntField(term33759, term33759.getClass(), "lineno", 0);
        setIntField(term33759, term33759.getClass(), "charno", 0);
        term33963 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        term35927 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term35928 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term35927, term35927.getClass(), "reference", null);
        setField(term35927, term35927.getClass(), "sourceName", null);
        setIntField(term35927, term35927.getClass(), "lineno", 0);
        setIntField(term35927, term35927.getClass(), "charno", 0);
        setField(term35927, term35927.getClass(), "validator", null);
        setField(term35927, term35927.getClass(), "propertyContinuations", null);
        setField(term35927, term35927.getClass(), "referencedType", null);
        setField(term35927, term35927.getClass(), "referencedObjType", null);
        setBooleanField(term35927, term35927.getClass(), "visited", false);
        setField(term35927, term35927.getClass(), "docInfo", null);
        setBooleanField(term35927, term35927.getClass(), "unknown", false);
        setBooleanField(term35927, term35927.getClass(), "resolved", true);
        setField(term35927, term35927.getClass(), "resolveResult", null);
        setField(term35927, term35927.getClass(), "templateKeys", null);
        setField(term35927, term35927.getClass(), "templatizedTypes", null);
        setBooleanField(term35927, term35927.getClass(), "inTemplatedCheckVisit", false);
        setField(term35928, term35928.getClass(), "reporter", null);
        setField(term35928, term35928.getClass(), "nativeTypes", null);
        setField(term35928, term35928.getClass(), "namesToTypes", null);
        setField(term35928, term35928.getClass(), "namespaces", null);
        setField(term35928, term35928.getClass(), "nonNullableTypeNames", null);
        setField(term35928, term35928.getClass(), "forwardDeclaredTypes", null);
        setField(term35928, term35928.getClass(), "typesIndexedByProperty", null);
        setField(term35928, term35928.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term35928, term35928.getClass(), "greatestSubtypeByProperty", null);
        setField(term35928, term35928.getClass(), "interfaceToImplementors", null);
        setField(term35928, term35928.getClass(), "unresolvedNamedTypes", null);
        setField(term35928, term35928.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term35928, term35928.getClass(), "lastGeneration", true);
        setField(term35928, term35928.getClass(), "templateTypes", null);
        setBooleanField(term35928, term35928.getClass(), "tolerateUndefinedValues", false);
        setField(term35928, term35928.getClass(), "resolveMode", null);
        setField(term35927, term35927.getClass(), "registry", term35928);
        ArrayList term35930 = new ArrayList();
        ((ArrayList) term35930).add("Bad type annotation. Unknown type null");
        term35929 = newInstance(Class.forName("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(term35929, term35929.getClass(), "warnings", term35930);
        setField(term35929, term35929.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term33963;
        args[1] = false;
        callMethod(klass, "handleUnresolvedType", argTypes, term33759, args);
        assertTrue(recursiveEquals(term33759, term35927));
        assertTrue(recursiveEquals(term33963, term35929));
    }

};


