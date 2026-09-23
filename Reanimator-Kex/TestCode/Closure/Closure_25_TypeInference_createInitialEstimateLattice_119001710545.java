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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TypeInference_createInitialEstimateLattice_119001710545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210;
     Object term8299;

    public TypeInference_createInitialEstimateLattice_119001710545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term213 = new HashMap();
        HashMap term222 = new HashMap();
        Set<Object> term8312 =  ((Map) term222).keySet();
        HashSet term221 = new HashSet((Collection<? extends Object>) term8312);
        HashMap term229 = new HashMap();
        Set<Object> term8313 =  ((Map) term229).keySet();
        HashSet term228 = new HashSet((Collection<? extends Object>) term8313);
        HashMap term235 = new HashMap();
        Set<Object> term8314 =  ((Map) term235).keySet();
        HashSet term234 = new HashSet((Collection<? extends Object>) term8314);
        HashMap term241 = new HashMap();
        HashMap term249 = new HashMap();
        HashMap term254 = new HashMap();
        term210 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term211 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term212 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term210, term210.getClass(), "compiler", null);
        setField(term211, term211.getClass(), "reporter", null);
        setField(term211, term211.getClass(), "nativeTypes", term212);
        setField(term211, term211.getClass(), "namesToTypes", term213);
        setField(term211, term211.getClass(), "namespaces", term221);
        setField(term211, term211.getClass(), "nonNullableTypeNames", term228);
        setField(term211, term211.getClass(), "forwardDeclaredTypes", term234);
        setField(term211, term211.getClass(), "typesIndexedByProperty", term241);
        setField(term211, term211.getClass(), "eachRefTypeIndexedByProperty", term249);
        setField(term211, term211.getClass(), "greatestSubtypeByProperty", term254);
        setField(term211, term211.getClass(), "interfaceToImplementors", null);
        setField(term211, term211.getClass(), "unresolvedNamedTypes", null);
        setField(term211, term211.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term211, term211.getClass(), "lastGeneration", false);
        setField(term211, term211.getClass(), "templateTypeName", null);
        setField(term211, term211.getClass(), "templateType", null);
        setBooleanField(term211, term211.getClass(), "tolerateUndefinedValues", false);
        setField(term211, term211.getClass(), "resolveMode", null);
        setField(term210, term210.getClass(), "registry", term211);
        setField(term210, term210.getClass(), "reverseInterpreter", null);
        setField(term210, term210.getClass(), "syntacticScope", null);
        setField(term210, term210.getClass(), "functionScope", null);
        setField(term210, term210.getClass(), "bottomScope", null);
        setField(term210, term210.getClass(), "assertionFunctionsMap", null);
        setField(term210, term210.getClass(), "cfg", null);
        setField(term210, term210.getClass(), "joinOp", null);
        setField(term210, term210.getClass(), "orderedWorkSet", null);
        HashMap term8302 = new HashMap();
        HashMap term8304 = new HashMap();
        Set<Object> term8315 =  ((Map) term8304).keySet();
        HashSet term8303 = new HashSet((Collection<? extends Object>) term8315);
        HashMap term8306 = new HashMap();
        Set<Object> term8316 =  ((Map) term8306).keySet();
        HashSet term8305 = new HashSet((Collection<? extends Object>) term8316);
        HashMap term8308 = new HashMap();
        Set<Object> term8317 =  ((Map) term8308).keySet();
        HashSet term8307 = new HashSet((Collection<? extends Object>) term8317);
        HashMap term8309 = new HashMap();
        HashMap term8310 = new HashMap();
        HashMap term8311 = new HashMap();
        term8299 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term8300 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term8301 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term8299, term8299.getClass(), "compiler", null);
        setField(term8300, term8300.getClass(), "reporter", null);
        setField(term8300, term8300.getClass(), "nativeTypes", term8301);
        setField(term8300, term8300.getClass(), "namesToTypes", term8302);
        setField(term8300, term8300.getClass(), "namespaces", term8303);
        setField(term8300, term8300.getClass(), "nonNullableTypeNames", term8305);
        setField(term8300, term8300.getClass(), "forwardDeclaredTypes", term8307);
        setField(term8300, term8300.getClass(), "typesIndexedByProperty", term8309);
        setField(term8300, term8300.getClass(), "eachRefTypeIndexedByProperty", term8310);
        setField(term8300, term8300.getClass(), "greatestSubtypeByProperty", term8311);
        setField(term8300, term8300.getClass(), "interfaceToImplementors", null);
        setField(term8300, term8300.getClass(), "unresolvedNamedTypes", null);
        setField(term8300, term8300.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term8300, term8300.getClass(), "lastGeneration", false);
        setField(term8300, term8300.getClass(), "templateTypeName", null);
        setField(term8300, term8300.getClass(), "templateType", null);
        setBooleanField(term8300, term8300.getClass(), "tolerateUndefinedValues", false);
        setField(term8300, term8300.getClass(), "resolveMode", null);
        setField(term8299, term8299.getClass(), "registry", term8300);
        setField(term8299, term8299.getClass(), "reverseInterpreter", null);
        setField(term8299, term8299.getClass(), "syntacticScope", null);
        setField(term8299, term8299.getClass(), "functionScope", null);
        setField(term8299, term8299.getClass(), "bottomScope", null);
        setField(term8299, term8299.getClass(), "assertionFunctionsMap", null);
        setField(term8299, term8299.getClass(), "cfg", null);
        setField(term8299, term8299.getClass(), "joinOp", null);
        setField(term8299, term8299.getClass(), "orderedWorkSet", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "createInitialEstimateLattice", argTypes, term210, args);
        assertTrue(recursiveEquals(term210, term8299));
        assertTrue(recursiveEquals(retValue, null));
    }

};


