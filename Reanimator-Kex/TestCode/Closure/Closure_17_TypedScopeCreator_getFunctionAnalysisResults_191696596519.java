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

public class TypedScopeCreator_getFunctionAnalysisResults_191696596519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2899;
     Object term2947;

    public TypedScopeCreator_getFunctionAnalysisResults_191696596519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2903 = new HashMap();
        HashMap term2910 = new HashMap();
        Set<Object> term8641 =  ((Map) term2910).keySet();
        HashSet term2909 = new HashSet((Collection<? extends Object>) term8641);
        HashMap term2916 = new HashMap();
        Set<Object> term8642 =  ((Map) term2916).keySet();
        HashSet term2915 = new HashSet((Collection<? extends Object>) term8642);
        HashMap term2922 = new HashMap();
        Set<Object> term8643 =  ((Map) term2922).keySet();
        HashSet term2921 = new HashSet((Collection<? extends Object>) term8643);
        HashMap term2927 = new HashMap();
        HashMap term2933 = new HashMap();
        HashMap term2938 = new HashMap();
        term2899 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term2900 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term2901 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2902 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term2899, term2899.getClass(), "compiler", null);
        setField(term2899, term2899.getClass(), "typeParsingErrorReporter", null);
        setField(term2900, term2900.getClass(), "compiler", null);
        setField(term2901, term2901.getClass(), "reporter", null);
        setField(term2901, term2901.getClass(), "nativeTypes", term2902);
        setField(term2901, term2901.getClass(), "namesToTypes", term2903);
        setField(term2901, term2901.getClass(), "namespaces", term2909);
        setField(term2901, term2901.getClass(), "nonNullableTypeNames", term2915);
        setField(term2901, term2901.getClass(), "forwardDeclaredTypes", term2921);
        setField(term2901, term2901.getClass(), "typesIndexedByProperty", term2927);
        setField(term2901, term2901.getClass(), "eachRefTypeIndexedByProperty", term2933);
        setField(term2901, term2901.getClass(), "greatestSubtypeByProperty", term2938);
        setField(term2901, term2901.getClass(), "interfaceToImplementors", null);
        setField(term2901, term2901.getClass(), "unresolvedNamedTypes", null);
        setField(term2901, term2901.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2901, term2901.getClass(), "lastGeneration", false);
        setField(term2901, term2901.getClass(), "templateTypes", null);
        setBooleanField(term2901, term2901.getClass(), "tolerateUndefinedValues", false);
        setField(term2901, term2901.getClass(), "resolveMode", null);
        setField(term2900, term2900.getClass(), "typeRegistry", term2901);
        setField(term2900, term2900.getClass(), "allValueTypes", null);
        setBooleanField(term2900, term2900.getClass(), "shouldReport", false);
        setField(term2900, term2900.getClass(), "nullOrUndefined", null);
        setField(term2900, term2900.getClass(), "mismatches", null);
        setField(term2899, term2899.getClass(), "validator", term2900);
        setField(term2899, term2899.getClass(), "codingConvention", null);
        setField(term2899, term2899.getClass(), "typeRegistry", null);
        setField(term2899, term2899.getClass(), "delegateProxyPrototypes", null);
        setField(term2899, term2899.getClass(), "delegateCallingConventions", null);
        setField(term2899, term2899.getClass(), "functionAnalysisResults", null);
        term2947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2947, term2947.getClass(), "type", -1845499264);
        setIntField(term2949, term2949.getClass(), "type", -505439934);
        setIntField(term2951, term2951.getClass(), "type", -344842608);
        setIntField(term2953, term2953.getClass(), "type", 941650513);
        setIntField(term2955, term2955.getClass(), "type", 444029505);
        setField(term2955, term2955.getClass(), "next", null);
        setField(term2955, term2955.getClass(), "first", null);
        setField(term2955, term2955.getClass(), "last", null);
        setField(term2955, term2955.getClass(), "propListHead", null);
        setIntField(term2955, term2955.getClass(), "sourcePosition", 0);
        setField(term2955, term2955.getClass(), "jsType", null);
        setField(term2955, term2955.getClass(), "parent", null);
        setField(term2953, term2953.getClass(), "next", term2955);
        setIntField(term2958, term2958.getClass(), "type", -1034506028);
        setField(term2958, term2958.getClass(), "next", null);
        setField(term2958, term2958.getClass(), "first", null);
        setField(term2958, term2958.getClass(), "last", term2955);
        setField(term2958, term2958.getClass(), "propListHead", null);
        setIntField(term2958, term2958.getClass(), "sourcePosition", 0);
        setField(term2958, term2958.getClass(), "jsType", null);
        setField(term2958, term2958.getClass(), "parent", null);
        setField(term2953, term2953.getClass(), "first", term2958);
        setField(term2953, term2953.getClass(), "last", term2951);
        setField(term2953, term2953.getClass(), "propListHead", null);
        setIntField(term2953, term2953.getClass(), "sourcePosition", 0);
        setField(term2953, term2953.getClass(), "jsType", null);
        setField(term2953, term2953.getClass(), "parent", null);
        setField(term2951, term2951.getClass(), "next", term2953);
        setField(term2951, term2951.getClass(), "first", term2955);
        setIntField(term2962, term2962.getClass(), "type", -894662986);
        setIntField(term2964, term2964.getClass(), "type", 304775596);
        setField(term2964, term2964.getClass(), "next", null);
        setField(term2964, term2964.getClass(), "first", term2958);
        setField(term2964, term2964.getClass(), "last", term2953);
        setField(term2964, term2964.getClass(), "propListHead", null);
        setIntField(term2964, term2964.getClass(), "sourcePosition", 0);
        setField(term2964, term2964.getClass(), "jsType", null);
        setField(term2964, term2964.getClass(), "parent", null);
        setField(term2962, term2962.getClass(), "next", term2964);
        setField(term2962, term2962.getClass(), "first", term2949);
        setField(term2962, term2962.getClass(), "last", term2949);
        setField(term2962, term2962.getClass(), "propListHead", null);
        setIntField(term2962, term2962.getClass(), "sourcePosition", 0);
        setField(term2962, term2962.getClass(), "jsType", null);
        setField(term2962, term2962.getClass(), "parent", null);
        setField(term2951, term2951.getClass(), "last", term2962);
        setField(term2951, term2951.getClass(), "propListHead", null);
        setIntField(term2951, term2951.getClass(), "sourcePosition", 0);
        setField(term2951, term2951.getClass(), "jsType", null);
        setField(term2951, term2951.getClass(), "parent", null);
        setField(term2949, term2949.getClass(), "next", term2951);
        setIntField(term2969, term2969.getClass(), "type", -1347665717);
        setField(term2969, term2969.getClass(), "next", term2962);
        setField(term2969, term2969.getClass(), "first", term2964);
        setField(term2969, term2969.getClass(), "last", term2947);
        setField(term2969, term2969.getClass(), "propListHead", null);
        setIntField(term2969, term2969.getClass(), "sourcePosition", 0);
        setField(term2969, term2969.getClass(), "jsType", null);
        setField(term2969, term2969.getClass(), "parent", null);
        setField(term2949, term2949.getClass(), "first", term2969);
        setField(term2949, term2949.getClass(), "last", term2969);
        setField(term2949, term2949.getClass(), "propListHead", null);
        setIntField(term2949, term2949.getClass(), "sourcePosition", 0);
        setField(term2949, term2949.getClass(), "jsType", null);
        setField(term2949, term2949.getClass(), "parent", null);
        setField(term2947, term2947.getClass(), "next", term2949);
        setField(term2947, term2947.getClass(), "first", term2953);
        setField(term2947, term2947.getClass(), "last", term2955);
        setField(term2947, term2947.getClass(), "propListHead", null);
        setIntField(term2947, term2947.getClass(), "sourcePosition", 0);
        setField(term2947, term2947.getClass(), "jsType", null);
        setField(term2947, term2947.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2947;
        try {
            callMethod(klass, "getFunctionAnalysisResults", argTypes, term2899, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


