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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;
import java.util.ArrayList;

public class TypedScopeCreator_declareNativeValueType_63431944713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2978;
     Object term3051;
     Object enum13;

    public TypedScopeCreator_declareNativeValueType_63431944713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2982 = new HashMap();
        HashMap term2989 = new HashMap();
        Set<Object> term8983 =  ((Map) term2989).keySet();
        HashSet term2988 = new HashSet((Collection<? extends Object>) term8983);
        HashMap term2995 = new HashMap();
        Set<Object> term8984 =  ((Map) term2995).keySet();
        HashSet term2994 = new HashSet((Collection<? extends Object>) term8984);
        HashMap term3001 = new HashMap();
        Set<Object> term8985 =  ((Map) term3001).keySet();
        HashSet term3000 = new HashSet((Collection<? extends Object>) term8985);
        HashMap term3006 = new HashMap();
        HashMap term3011 = new HashMap();
        Class<? extends Object> term8997 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term8996 = ((Class) term8997).getDeclaredField((String) "LAZY_NAMES");
        ((Field) term8996).setAccessible(true);
        Object enum12 = ((Field) term8996).get((Object) null);
        Object term3041 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term3041, term3041.getClass(), "typeA", null);
        setField(term3041, term3041.getClass(), "typeB", null);
        ArrayList term3039 = new ArrayList();
        ((ArrayList) term3039).add(term3041);
        ArrayList term3047 = new ArrayList();
        ((ArrayList) term3047).add((Object)null);
        term2978 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term2979 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term2980 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2981 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 4);
        Object term3030 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term3044 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term2978, term2978.getClass(), "compiler", null);
        setField(term2978, term2978.getClass(), "typeParsingErrorReporter", null);
        setField(term2979, term2979.getClass(), "compiler", null);
        setField(term2980, term2980.getClass(), "reporter", null);
        setField(term2980, term2980.getClass(), "nativeTypes", term2981);
        setField(term2980, term2980.getClass(), "namesToTypes", term2982);
        setField(term2980, term2980.getClass(), "namespaces", term2988);
        setField(term2980, term2980.getClass(), "enumTypeNames", term2994);
        setField(term2980, term2980.getClass(), "forwardDeclaredTypes", term3000);
        setField(term2980, term2980.getClass(), "typesIndexedByProperty", term3006);
        setField(term2980, term2980.getClass(), "greatestSubtypeByProperty", term3011);
        setField(term2980, term2980.getClass(), "interfaceToImplementors", null);
        setField(term2980, term2980.getClass(), "unresolvedNamedTypes", null);
        setField(term2980, term2980.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2980, term2980.getClass(), "lastGeneration", true);
        setField(term2980, term2980.getClass(), "templateTypeName", "ieCtQFdkii");
        setField(term3030, term3030.getClass(), "name", null);
        setField(term3030, term3030.getClass(), "referencedType", null);
        setBooleanField(term3030, term3030.getClass(), "visited", false);
        setField(term3030, term3030.getClass(), "docInfo", null);
        setBooleanField(term3030, term3030.getClass(), "unknown", false);
        setBooleanField(term3030, term3030.getClass(), "resolved", false);
        setField(term3030, term3030.getClass(), "resolveResult", null);
        setField(term3030, term3030.getClass(), "registry", null);
        setField(term2980, term2980.getClass(), "templateType", term3030);
        setBooleanField(term2980, term2980.getClass(), "tolerateUndefinedValues", false);
        setField(term2980, term2980.getClass(), "resolveMode", enum12);
        setField(term2979, term2979.getClass(), "typeRegistry", term2980);
        setField(term2979, term2979.getClass(), "allValueTypes", null);
        setBooleanField(term2979, term2979.getClass(), "shouldReport", true);
        setField(term2979, term2979.getClass(), "mismatches", term3039);
        setField(term2978, term2978.getClass(), "validator", term2979);
        setField(term2978, term2978.getClass(), "codingConvention", null);
        setField(term3044, term3044.getClass(), "reporter", null);
        setField(term3044, term3044.getClass(), "nativeTypes", null);
        setField(term3044, term3044.getClass(), "namesToTypes", null);
        setField(term3044, term3044.getClass(), "namespaces", null);
        setField(term3044, term3044.getClass(), "enumTypeNames", null);
        setField(term3044, term3044.getClass(), "forwardDeclaredTypes", null);
        setField(term3044, term3044.getClass(), "typesIndexedByProperty", null);
        setField(term3044, term3044.getClass(), "greatestSubtypeByProperty", null);
        setField(term3044, term3044.getClass(), "interfaceToImplementors", null);
        setField(term3044, term3044.getClass(), "unresolvedNamedTypes", null);
        setField(term3044, term3044.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term3044, term3044.getClass(), "lastGeneration", false);
        setField(term3044, term3044.getClass(), "templateTypeName", null);
        setField(term3044, term3044.getClass(), "templateType", null);
        setBooleanField(term3044, term3044.getClass(), "tolerateUndefinedValues", false);
        setField(term3044, term3044.getClass(), "resolveMode", null);
        setField(term2978, term2978.getClass(), "typeRegistry", term3044);
        setField(term2978, term2978.getClass(), "delegateProxyPrototypes", term3047);
        HashMap term3052 = new HashMap();
        term3051 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3065 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3051, term3051.getClass(), "vars", term3052);
        setField(term3065, term3065.getClass(), "vars", null);
        setField(term3065, term3065.getClass(), "parent", null);
        setField(term3065, term3065.getClass(), "rootNode", null);
        setField(term3065, term3065.getClass(), "thisType", null);
        setBooleanField(term3065, term3065.getClass(), "isBottom", false);
        setField(term3051, term3051.getClass(), "parent", term3065);
        setIntField(term3067, term3067.getClass(), "type", 0);
        setField(term3067, term3067.getClass(), "next", null);
        setField(term3067, term3067.getClass(), "first", null);
        setField(term3067, term3067.getClass(), "last", null);
        setField(term3067, term3067.getClass(), "propListHead", null);
        setIntField(term3067, term3067.getClass(), "sourcePosition", 0);
        setField(term3067, term3067.getClass(), "jsType", null);
        setField(term3067, term3067.getClass(), "parent", null);
        setField(term3051, term3051.getClass(), "rootNode", term3067);
        setField(term3051, term3051.getClass(), "thisType", null);
        setBooleanField(term3051, term3051.getClass(), "isBottom", false);
        Class<? extends Object> term9349 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term9348 = ((Class) term9349).getDeclaredField((String) "ERROR_FUNCTION_TYPE");
        ((Field) term9348).setAccessible(true);
        enum13 = ((Field) term9348).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[3];
        args[0] = term3051;
        args[1] = "eqJfYWRaEL";
        args[2] = enum13;
        try {
            callMethod(klass, "declareNativeValueType", argTypes, term2978, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


