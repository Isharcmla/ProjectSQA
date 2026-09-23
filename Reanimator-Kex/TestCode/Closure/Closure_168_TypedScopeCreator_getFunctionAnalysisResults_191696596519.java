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
     Object term2904;
     Object term2952;

    public TypedScopeCreator_getFunctionAnalysisResults_191696596519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2908 = new HashMap();
        HashMap term2915 = new HashMap();
        Set<Object> term8648 =  ((Map) term2915).keySet();
        HashSet term2914 = new HashSet((Collection<? extends Object>) term8648);
        HashMap term2921 = new HashMap();
        Set<Object> term8649 =  ((Map) term2921).keySet();
        HashSet term2920 = new HashSet((Collection<? extends Object>) term8649);
        HashMap term2927 = new HashMap();
        Set<Object> term8650 =  ((Map) term2927).keySet();
        HashSet term2926 = new HashSet((Collection<? extends Object>) term8650);
        HashMap term2932 = new HashMap();
        HashMap term2938 = new HashMap();
        HashMap term2943 = new HashMap();
        term2904 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term2905 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term2906 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2907 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term2904, term2904.getClass(), "compiler", null);
        setField(term2904, term2904.getClass(), "typeParsingErrorReporter", null);
        setField(term2905, term2905.getClass(), "compiler", null);
        setField(term2906, term2906.getClass(), "reporter", null);
        setField(term2906, term2906.getClass(), "nativeTypes", term2907);
        setField(term2906, term2906.getClass(), "namesToTypes", term2908);
        setField(term2906, term2906.getClass(), "namespaces", term2914);
        setField(term2906, term2906.getClass(), "nonNullableTypeNames", term2920);
        setField(term2906, term2906.getClass(), "forwardDeclaredTypes", term2926);
        setField(term2906, term2906.getClass(), "typesIndexedByProperty", term2932);
        setField(term2906, term2906.getClass(), "eachRefTypeIndexedByProperty", term2938);
        setField(term2906, term2906.getClass(), "greatestSubtypeByProperty", term2943);
        setField(term2906, term2906.getClass(), "interfaceToImplementors", null);
        setField(term2906, term2906.getClass(), "unresolvedNamedTypes", null);
        setField(term2906, term2906.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2906, term2906.getClass(), "lastGeneration", false);
        setField(term2906, term2906.getClass(), "templateTypes", null);
        setBooleanField(term2906, term2906.getClass(), "tolerateUndefinedValues", false);
        setField(term2906, term2906.getClass(), "resolveMode", null);
        setField(term2905, term2905.getClass(), "typeRegistry", term2906);
        setField(term2905, term2905.getClass(), "allValueTypes", null);
        setBooleanField(term2905, term2905.getClass(), "shouldReport", false);
        setField(term2905, term2905.getClass(), "nullOrUndefined", null);
        setField(term2905, term2905.getClass(), "mismatches", null);
        setField(term2904, term2904.getClass(), "validator", term2905);
        setField(term2904, term2904.getClass(), "codingConvention", null);
        setField(term2904, term2904.getClass(), "typeRegistry", null);
        setField(term2904, term2904.getClass(), "delegateProxyPrototypes", null);
        setField(term2904, term2904.getClass(), "delegateCallingConventions", null);
        setField(term2904, term2904.getClass(), "functionAnalysisResults", null);
        term2952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2952, term2952.getClass(), "type", -1845499264);
        setIntField(term2954, term2954.getClass(), "type", -505439934);
        setIntField(term2956, term2956.getClass(), "type", -344842608);
        setIntField(term2958, term2958.getClass(), "type", 941650513);
        setIntField(term2960, term2960.getClass(), "type", 444029505);
        setField(term2960, term2960.getClass(), "next", null);
        setField(term2960, term2960.getClass(), "first", null);
        setField(term2960, term2960.getClass(), "last", null);
        setField(term2960, term2960.getClass(), "propListHead", null);
        setIntField(term2960, term2960.getClass(), "sourcePosition", 0);
        setField(term2960, term2960.getClass(), "jsType", null);
        setField(term2960, term2960.getClass(), "parent", null);
        setField(term2958, term2958.getClass(), "next", term2960);
        setIntField(term2963, term2963.getClass(), "type", -1034506028);
        setField(term2963, term2963.getClass(), "next", null);
        setField(term2963, term2963.getClass(), "first", null);
        setField(term2963, term2963.getClass(), "last", term2960);
        setField(term2963, term2963.getClass(), "propListHead", null);
        setIntField(term2963, term2963.getClass(), "sourcePosition", 0);
        setField(term2963, term2963.getClass(), "jsType", null);
        setField(term2963, term2963.getClass(), "parent", null);
        setField(term2958, term2958.getClass(), "first", term2963);
        setField(term2958, term2958.getClass(), "last", term2956);
        setField(term2958, term2958.getClass(), "propListHead", null);
        setIntField(term2958, term2958.getClass(), "sourcePosition", 0);
        setField(term2958, term2958.getClass(), "jsType", null);
        setField(term2958, term2958.getClass(), "parent", null);
        setField(term2956, term2956.getClass(), "next", term2958);
        setField(term2956, term2956.getClass(), "first", term2960);
        setIntField(term2967, term2967.getClass(), "type", -894662986);
        setIntField(term2969, term2969.getClass(), "type", 304775596);
        setField(term2969, term2969.getClass(), "next", null);
        setField(term2969, term2969.getClass(), "first", term2963);
        setField(term2969, term2969.getClass(), "last", term2958);
        setField(term2969, term2969.getClass(), "propListHead", null);
        setIntField(term2969, term2969.getClass(), "sourcePosition", 0);
        setField(term2969, term2969.getClass(), "jsType", null);
        setField(term2969, term2969.getClass(), "parent", null);
        setField(term2967, term2967.getClass(), "next", term2969);
        setField(term2967, term2967.getClass(), "first", term2954);
        setField(term2967, term2967.getClass(), "last", term2954);
        setField(term2967, term2967.getClass(), "propListHead", null);
        setIntField(term2967, term2967.getClass(), "sourcePosition", 0);
        setField(term2967, term2967.getClass(), "jsType", null);
        setField(term2967, term2967.getClass(), "parent", null);
        setField(term2956, term2956.getClass(), "last", term2967);
        setField(term2956, term2956.getClass(), "propListHead", null);
        setIntField(term2956, term2956.getClass(), "sourcePosition", 0);
        setField(term2956, term2956.getClass(), "jsType", null);
        setField(term2956, term2956.getClass(), "parent", null);
        setField(term2954, term2954.getClass(), "next", term2956);
        setIntField(term2974, term2974.getClass(), "type", -1347665717);
        setField(term2974, term2974.getClass(), "next", term2967);
        setField(term2974, term2974.getClass(), "first", term2969);
        setField(term2974, term2974.getClass(), "last", term2952);
        setField(term2974, term2974.getClass(), "propListHead", null);
        setIntField(term2974, term2974.getClass(), "sourcePosition", 0);
        setField(term2974, term2974.getClass(), "jsType", null);
        setField(term2974, term2974.getClass(), "parent", null);
        setField(term2954, term2954.getClass(), "first", term2974);
        setField(term2954, term2954.getClass(), "last", term2974);
        setField(term2954, term2954.getClass(), "propListHead", null);
        setIntField(term2954, term2954.getClass(), "sourcePosition", 0);
        setField(term2954, term2954.getClass(), "jsType", null);
        setField(term2954, term2954.getClass(), "parent", null);
        setField(term2952, term2952.getClass(), "next", term2954);
        setField(term2952, term2952.getClass(), "first", term2958);
        setField(term2952, term2952.getClass(), "last", term2960);
        setField(term2952, term2952.getClass(), "propListHead", null);
        setIntField(term2952, term2952.getClass(), "sourcePosition", 0);
        setField(term2952, term2952.getClass(), "jsType", null);
        setField(term2952, term2952.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2952;
        try {
            callMethod(klass, "getFunctionAnalysisResults", argTypes, term2904, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


