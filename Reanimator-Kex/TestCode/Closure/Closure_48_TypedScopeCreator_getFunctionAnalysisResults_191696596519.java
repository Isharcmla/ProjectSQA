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
     Object term2926;
     Object term2974;

    public TypedScopeCreator_getFunctionAnalysisResults_191696596519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2930 = new HashMap();
        HashMap term2937 = new HashMap();
        Set<Object> term8687 =  ((Map) term2937).keySet();
        HashSet term2936 = new HashSet((Collection<? extends Object>) term8687);
        HashMap term2943 = new HashMap();
        Set<Object> term8688 =  ((Map) term2943).keySet();
        HashSet term2942 = new HashSet((Collection<? extends Object>) term8688);
        HashMap term2949 = new HashMap();
        Set<Object> term8689 =  ((Map) term2949).keySet();
        HashSet term2948 = new HashSet((Collection<? extends Object>) term8689);
        HashMap term2954 = new HashMap();
        HashMap term2960 = new HashMap();
        HashMap term2965 = new HashMap();
        term2926 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term2927 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term2928 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2929 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term2926, term2926.getClass(), "compiler", null);
        setField(term2926, term2926.getClass(), "typeParsingErrorReporter", null);
        setField(term2927, term2927.getClass(), "compiler", null);
        setField(term2928, term2928.getClass(), "reporter", null);
        setField(term2928, term2928.getClass(), "nativeTypes", term2929);
        setField(term2928, term2928.getClass(), "namesToTypes", term2930);
        setField(term2928, term2928.getClass(), "namespaces", term2936);
        setField(term2928, term2928.getClass(), "nonNullableTypeNames", term2942);
        setField(term2928, term2928.getClass(), "forwardDeclaredTypes", term2948);
        setField(term2928, term2928.getClass(), "typesIndexedByProperty", term2954);
        setField(term2928, term2928.getClass(), "eachRefTypeIndexedByProperty", term2960);
        setField(term2928, term2928.getClass(), "greatestSubtypeByProperty", term2965);
        setField(term2928, term2928.getClass(), "interfaceToImplementors", null);
        setField(term2928, term2928.getClass(), "unresolvedNamedTypes", null);
        setField(term2928, term2928.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2928, term2928.getClass(), "lastGeneration", false);
        setField(term2928, term2928.getClass(), "templateTypeName", null);
        setField(term2928, term2928.getClass(), "templateType", null);
        setBooleanField(term2928, term2928.getClass(), "tolerateUndefinedValues", false);
        setField(term2928, term2928.getClass(), "resolveMode", null);
        setField(term2927, term2927.getClass(), "typeRegistry", term2928);
        setField(term2927, term2927.getClass(), "allValueTypes", null);
        setBooleanField(term2927, term2927.getClass(), "shouldReport", false);
        setField(term2927, term2927.getClass(), "nullOrUndefined", null);
        setField(term2927, term2927.getClass(), "mismatches", null);
        setField(term2926, term2926.getClass(), "validator", term2927);
        setField(term2926, term2926.getClass(), "codingConvention", null);
        setField(term2926, term2926.getClass(), "typeRegistry", null);
        setField(term2926, term2926.getClass(), "delegateProxyPrototypes", null);
        setField(term2926, term2926.getClass(), "delegateCallingConventions", null);
        setField(term2926, term2926.getClass(), "functionAnalysisResults", null);
        term2974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2974, term2974.getClass(), "type", -1845499264);
        setIntField(term2976, term2976.getClass(), "type", -505439934);
        setIntField(term2978, term2978.getClass(), "type", -344842608);
        setIntField(term2980, term2980.getClass(), "type", 941650513);
        setIntField(term2982, term2982.getClass(), "type", 444029505);
        setField(term2982, term2982.getClass(), "next", null);
        setField(term2982, term2982.getClass(), "first", null);
        setField(term2982, term2982.getClass(), "last", null);
        setField(term2982, term2982.getClass(), "propListHead", null);
        setIntField(term2982, term2982.getClass(), "sourcePosition", 0);
        setField(term2982, term2982.getClass(), "jsType", null);
        setField(term2982, term2982.getClass(), "parent", null);
        setField(term2980, term2980.getClass(), "next", term2982);
        setIntField(term2985, term2985.getClass(), "type", -1034506028);
        setField(term2985, term2985.getClass(), "next", null);
        setField(term2985, term2985.getClass(), "first", null);
        setField(term2985, term2985.getClass(), "last", term2982);
        setField(term2985, term2985.getClass(), "propListHead", null);
        setIntField(term2985, term2985.getClass(), "sourcePosition", 0);
        setField(term2985, term2985.getClass(), "jsType", null);
        setField(term2985, term2985.getClass(), "parent", null);
        setField(term2980, term2980.getClass(), "first", term2985);
        setField(term2980, term2980.getClass(), "last", term2978);
        setField(term2980, term2980.getClass(), "propListHead", null);
        setIntField(term2980, term2980.getClass(), "sourcePosition", 0);
        setField(term2980, term2980.getClass(), "jsType", null);
        setField(term2980, term2980.getClass(), "parent", null);
        setField(term2978, term2978.getClass(), "next", term2980);
        setField(term2978, term2978.getClass(), "first", term2982);
        setIntField(term2989, term2989.getClass(), "type", -894662986);
        setIntField(term2991, term2991.getClass(), "type", 304775596);
        setField(term2991, term2991.getClass(), "next", null);
        setField(term2991, term2991.getClass(), "first", term2985);
        setField(term2991, term2991.getClass(), "last", term2980);
        setField(term2991, term2991.getClass(), "propListHead", null);
        setIntField(term2991, term2991.getClass(), "sourcePosition", 0);
        setField(term2991, term2991.getClass(), "jsType", null);
        setField(term2991, term2991.getClass(), "parent", null);
        setField(term2989, term2989.getClass(), "next", term2991);
        setField(term2989, term2989.getClass(), "first", term2976);
        setField(term2989, term2989.getClass(), "last", term2976);
        setField(term2989, term2989.getClass(), "propListHead", null);
        setIntField(term2989, term2989.getClass(), "sourcePosition", 0);
        setField(term2989, term2989.getClass(), "jsType", null);
        setField(term2989, term2989.getClass(), "parent", null);
        setField(term2978, term2978.getClass(), "last", term2989);
        setField(term2978, term2978.getClass(), "propListHead", null);
        setIntField(term2978, term2978.getClass(), "sourcePosition", 0);
        setField(term2978, term2978.getClass(), "jsType", null);
        setField(term2978, term2978.getClass(), "parent", null);
        setField(term2976, term2976.getClass(), "next", term2978);
        setIntField(term2996, term2996.getClass(), "type", -1347665717);
        setField(term2996, term2996.getClass(), "next", term2989);
        setField(term2996, term2996.getClass(), "first", term2991);
        setField(term2996, term2996.getClass(), "last", term2974);
        setField(term2996, term2996.getClass(), "propListHead", null);
        setIntField(term2996, term2996.getClass(), "sourcePosition", 0);
        setField(term2996, term2996.getClass(), "jsType", null);
        setField(term2996, term2996.getClass(), "parent", null);
        setField(term2976, term2976.getClass(), "first", term2996);
        setField(term2976, term2976.getClass(), "last", term2996);
        setField(term2976, term2976.getClass(), "propListHead", null);
        setIntField(term2976, term2976.getClass(), "sourcePosition", 0);
        setField(term2976, term2976.getClass(), "jsType", null);
        setField(term2976, term2976.getClass(), "parent", null);
        setField(term2974, term2974.getClass(), "next", term2976);
        setField(term2974, term2974.getClass(), "first", term2980);
        setField(term2974, term2974.getClass(), "last", term2982);
        setField(term2974, term2974.getClass(), "propListHead", null);
        setIntField(term2974, term2974.getClass(), "sourcePosition", 0);
        setField(term2974, term2974.getClass(), "jsType", null);
        setField(term2974, term2974.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2974;
        try {
            callMethod(klass, "getFunctionAnalysisResults", argTypes, term2926, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


