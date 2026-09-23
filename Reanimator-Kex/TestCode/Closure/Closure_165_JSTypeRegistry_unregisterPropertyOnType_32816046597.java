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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class JSTypeRegistry_unregisterPropertyOnType_32816046597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3051;
     Object term481922;

    public JSTypeRegistry_unregisterPropertyOnType_32816046597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3053 = new HashMap();
        HashMap term3063 = new HashMap();
        Set<Object> term481936 =  ((Map) term3063).keySet();
        HashSet term3062 = new HashSet((Collection<? extends Object>) term481936);
        HashMap term3069 = new HashMap();
        Set<Object> term481937 =  ((Map) term3069).keySet();
        HashSet term3068 = new HashSet((Collection<? extends Object>) term481937);
        HashMap term3086 = new HashMap();
        Set<Object> term481938 =  ((Map) term3086).keySet();
        HashSet term3085 = new HashSet((Collection<? extends Object>) term481938);
        HashMap term3100 = new HashMap();
        HashMap term3115 = new HashMap();
        HashMap term3120 = new HashMap();
        term3051 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term3052 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term3051, term3051.getClass(), "reporter", null);
        setField(term3051, term3051.getClass(), "nativeTypes", term3052);
        setField(term3051, term3051.getClass(), "namesToTypes", term3053);
        setField(term3051, term3051.getClass(), "namespaces", term3062);
        setField(term3051, term3051.getClass(), "nonNullableTypeNames", term3068);
        setField(term3051, term3051.getClass(), "forwardDeclaredTypes", term3085);
        setField(term3051, term3051.getClass(), "typesIndexedByProperty", term3100);
        setField(term3051, term3051.getClass(), "eachRefTypeIndexedByProperty", term3115);
        setField(term3051, term3051.getClass(), "greatestSubtypeByProperty", term3120);
        setField(term3051, term3051.getClass(), "interfaceToImplementors", null);
        setField(term3051, term3051.getClass(), "unresolvedNamedTypes", null);
        setField(term3051, term3051.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term3051, term3051.getClass(), "lastGeneration", false);
        setField(term3051, term3051.getClass(), "templateTypeName", null);
        setField(term3051, term3051.getClass(), "templateType", null);
        setBooleanField(term3051, term3051.getClass(), "tolerateUndefinedValues", false);
        setField(term3051, term3051.getClass(), "resolveMode", null);
        HashMap term481924 = new HashMap();
        HashMap term481926 = new HashMap();
        Set<Object> term481949 =  ((Map) term481926).keySet();
        HashSet term481925 = new HashSet((Collection<? extends Object>) term481949);
        HashMap term481928 = new HashMap();
        Set<Object> term481950 =  ((Map) term481928).keySet();
        HashSet term481927 = new HashSet((Collection<? extends Object>) term481950);
        HashMap term481930 = new HashMap();
        Set<Object> term481951 =  ((Map) term481930).keySet();
        HashSet term481929 = new HashSet((Collection<? extends Object>) term481951);
        HashMap term481931 = new HashMap();
        HashMap term481932 = new HashMap();
        HashMap term481933 = new HashMap();
        term481922 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term481923 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term481922, term481922.getClass(), "reporter", null);
        setField(term481922, term481922.getClass(), "nativeTypes", term481923);
        setField(term481922, term481922.getClass(), "namesToTypes", term481924);
        setField(term481922, term481922.getClass(), "namespaces", term481925);
        setField(term481922, term481922.getClass(), "nonNullableTypeNames", term481927);
        setField(term481922, term481922.getClass(), "forwardDeclaredTypes", term481929);
        setField(term481922, term481922.getClass(), "typesIndexedByProperty", term481931);
        setField(term481922, term481922.getClass(), "eachRefTypeIndexedByProperty", term481932);
        setField(term481922, term481922.getClass(), "greatestSubtypeByProperty", term481933);
        setField(term481922, term481922.getClass(), "interfaceToImplementors", null);
        setField(term481922, term481922.getClass(), "unresolvedNamedTypes", null);
        setField(term481922, term481922.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term481922, term481922.getClass(), "lastGeneration", false);
        setField(term481922, term481922.getClass(), "templateTypeName", null);
        setField(term481922, term481922.getClass(), "templateType", null);
        setBooleanField(term481922, term481922.getClass(), "tolerateUndefinedValues", false);
        setField(term481922, term481922.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = "njvnWFTMxN";
        args[1] = null;
        callMethod(klass, "unregisterPropertyOnType", argTypes, term3051, args);
        assertTrue(recursiveEquals(term3051, term481922));
    }

};


