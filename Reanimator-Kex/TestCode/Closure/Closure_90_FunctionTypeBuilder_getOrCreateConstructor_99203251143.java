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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class FunctionTypeBuilder_getOrCreateConstructor_99203251143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15490;

    public FunctionTypeBuilder_getOrCreateConstructor_99203251143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term15505 = new HashMap();
        HashMap term15514 = new HashMap();
        Set<Object> term33476 =  ((Map) term15514).keySet();
        HashSet term15513 = new HashSet((Collection<? extends Object>) term33476);
        HashMap term15521 = new HashMap();
        Set<Object> term33477 =  ((Map) term15521).keySet();
        HashSet term15520 = new HashSet((Collection<? extends Object>) term33477);
        HashMap term15528 = new HashMap();
        Set<Object> term33478 =  ((Map) term15528).keySet();
        HashSet term15527 = new HashSet((Collection<? extends Object>) term33478);
        HashMap term15534 = new HashMap();
        HashMap term15539 = new HashMap();
        Class<? extends Object> term33500 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term33499 = ((Class) term33500).getDeclaredField((String) "LAZY_NAMES");
        ((Field) term33499).setAccessible(true);
        Object enum63 = ((Field) term33499).get((Object) null);
        term15490 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term15503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term15504 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        Object term15560 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term15591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15606 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term15490, term15490.getClass(), "fnName", "UEdzEKEEEV");
        setField(term15490, term15490.getClass(), "compiler", null);
        setField(term15490, term15490.getClass(), "codingConvention", null);
        setField(term15503, term15503.getClass(), "reporter", null);
        setField(term15503, term15503.getClass(), "nativeTypes", term15504);
        setField(term15503, term15503.getClass(), "namesToTypes", term15505);
        setField(term15503, term15503.getClass(), "namespaces", term15513);
        setField(term15503, term15503.getClass(), "nonNullableTypeNames", term15520);
        setField(term15503, term15503.getClass(), "forwardDeclaredTypes", term15527);
        setField(term15503, term15503.getClass(), "typesIndexedByProperty", term15534);
        setField(term15503, term15503.getClass(), "greatestSubtypeByProperty", term15539);
        setField(term15503, term15503.getClass(), "interfaceToImplementors", null);
        setField(term15503, term15503.getClass(), "unresolvedNamedTypes", null);
        setField(term15503, term15503.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term15503, term15503.getClass(), "lastGeneration", false);
        setField(term15503, term15503.getClass(), "templateTypeName", "DNOtiLPAIY");
        setField(term15560, term15560.getClass(), "name", "FnEkAHBfyV");
        setField(term15560, term15560.getClass(), "referencedType", null);
        setField(term15560, term15560.getClass(), "referencedObjType", null);
        setBooleanField(term15560, term15560.getClass(), "visited", false);
        setField(term15560, term15560.getClass(), "docInfo", null);
        setBooleanField(term15560, term15560.getClass(), "unknown", false);
        setBooleanField(term15560, term15560.getClass(), "resolved", false);
        setField(term15560, term15560.getClass(), "resolveResult", null);
        setField(term15560, term15560.getClass(), "registry", null);
        setField(term15503, term15503.getClass(), "templateType", term15560);
        setBooleanField(term15503, term15503.getClass(), "tolerateUndefinedValues", true);
        setField(term15503, term15503.getClass(), "resolveMode", enum63);
        setField(term15490, term15490.getClass(), "typeRegistry", term15503);
        setIntField(term15591, term15591.getClass(), "type", 0);
        setField(term15591, term15591.getClass(), "next", null);
        setField(term15591, term15591.getClass(), "first", null);
        setField(term15591, term15591.getClass(), "last", null);
        setField(term15591, term15591.getClass(), "propListHead", null);
        setIntField(term15591, term15591.getClass(), "sourcePosition", 0);
        setField(term15591, term15591.getClass(), "jsType", null);
        setField(term15591, term15591.getClass(), "parent", null);
        setField(term15490, term15490.getClass(), "errorRoot", term15591);
        setField(term15490, term15490.getClass(), "sourceName", "VfmNFpEuax");
        setField(term15606, term15606.getClass(), "vars", null);
        setField(term15606, term15606.getClass(), "parent", null);
        setField(term15606, term15606.getClass(), "rootNode", null);
        setField(term15606, term15606.getClass(), "thisType", null);
        setBooleanField(term15606, term15606.getClass(), "isBottom", false);
        setField(term15490, term15490.getClass(), "scope", term15606);
        setField(term15490, term15490.getClass(), "returnType", null);
        setBooleanField(term15490, term15490.getClass(), "returnTypeInferred", false);
        setField(term15490, term15490.getClass(), "implementedInterfaces", null);
        setField(term15490, term15490.getClass(), "baseType", null);
        setField(term15490, term15490.getClass(), "thisType", null);
        setBooleanField(term15490, term15490.getClass(), "isConstructor", false);
        setBooleanField(term15490, term15490.getClass(), "isInterface", false);
        setField(term15490, term15490.getClass(), "parametersNode", null);
        setField(term15490, term15490.getClass(), "sourceNode", null);
        setField(term15490, term15490.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getOrCreateConstructor", argTypes, term15490, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


