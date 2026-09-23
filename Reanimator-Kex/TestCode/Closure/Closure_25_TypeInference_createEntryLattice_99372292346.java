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

public class TypeInference_createEntryLattice_99372292346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267;
     Object term8361;

    public TypeInference_createEntryLattice_99372292346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term270 = new HashMap();
        HashMap term279 = new HashMap();
        Set<Object> term8374 =  ((Map) term279).keySet();
        HashSet term278 = new HashSet((Collection<? extends Object>) term8374);
        HashMap term286 = new HashMap();
        Set<Object> term8375 =  ((Map) term286).keySet();
        HashSet term285 = new HashSet((Collection<? extends Object>) term8375);
        HashMap term293 = new HashMap();
        Set<Object> term8376 =  ((Map) term293).keySet();
        HashSet term292 = new HashSet((Collection<? extends Object>) term8376);
        HashMap term299 = new HashMap();
        HashMap term307 = new HashMap();
        HashMap term312 = new HashMap();
        term267 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term268 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term269 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term267, term267.getClass(), "compiler", null);
        setField(term268, term268.getClass(), "reporter", null);
        setField(term268, term268.getClass(), "nativeTypes", term269);
        setField(term268, term268.getClass(), "namesToTypes", term270);
        setField(term268, term268.getClass(), "namespaces", term278);
        setField(term268, term268.getClass(), "nonNullableTypeNames", term285);
        setField(term268, term268.getClass(), "forwardDeclaredTypes", term292);
        setField(term268, term268.getClass(), "typesIndexedByProperty", term299);
        setField(term268, term268.getClass(), "eachRefTypeIndexedByProperty", term307);
        setField(term268, term268.getClass(), "greatestSubtypeByProperty", term312);
        setField(term268, term268.getClass(), "interfaceToImplementors", null);
        setField(term268, term268.getClass(), "unresolvedNamedTypes", null);
        setField(term268, term268.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term268, term268.getClass(), "lastGeneration", false);
        setField(term268, term268.getClass(), "templateTypeName", null);
        setField(term268, term268.getClass(), "templateType", null);
        setBooleanField(term268, term268.getClass(), "tolerateUndefinedValues", false);
        setField(term268, term268.getClass(), "resolveMode", null);
        setField(term267, term267.getClass(), "registry", term268);
        setField(term267, term267.getClass(), "reverseInterpreter", null);
        setField(term267, term267.getClass(), "syntacticScope", null);
        setField(term267, term267.getClass(), "functionScope", null);
        setField(term267, term267.getClass(), "bottomScope", null);
        setField(term267, term267.getClass(), "assertionFunctionsMap", null);
        setField(term267, term267.getClass(), "cfg", null);
        setField(term267, term267.getClass(), "joinOp", null);
        setField(term267, term267.getClass(), "orderedWorkSet", null);
        HashMap term8364 = new HashMap();
        HashMap term8366 = new HashMap();
        Set<Object> term8377 =  ((Map) term8366).keySet();
        HashSet term8365 = new HashSet((Collection<? extends Object>) term8377);
        HashMap term8368 = new HashMap();
        Set<Object> term8378 =  ((Map) term8368).keySet();
        HashSet term8367 = new HashSet((Collection<? extends Object>) term8378);
        HashMap term8370 = new HashMap();
        Set<Object> term8379 =  ((Map) term8370).keySet();
        HashSet term8369 = new HashSet((Collection<? extends Object>) term8379);
        HashMap term8371 = new HashMap();
        HashMap term8372 = new HashMap();
        HashMap term8373 = new HashMap();
        term8361 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term8362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term8363 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term8361, term8361.getClass(), "compiler", null);
        setField(term8362, term8362.getClass(), "reporter", null);
        setField(term8362, term8362.getClass(), "nativeTypes", term8363);
        setField(term8362, term8362.getClass(), "namesToTypes", term8364);
        setField(term8362, term8362.getClass(), "namespaces", term8365);
        setField(term8362, term8362.getClass(), "nonNullableTypeNames", term8367);
        setField(term8362, term8362.getClass(), "forwardDeclaredTypes", term8369);
        setField(term8362, term8362.getClass(), "typesIndexedByProperty", term8371);
        setField(term8362, term8362.getClass(), "eachRefTypeIndexedByProperty", term8372);
        setField(term8362, term8362.getClass(), "greatestSubtypeByProperty", term8373);
        setField(term8362, term8362.getClass(), "interfaceToImplementors", null);
        setField(term8362, term8362.getClass(), "unresolvedNamedTypes", null);
        setField(term8362, term8362.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term8362, term8362.getClass(), "lastGeneration", false);
        setField(term8362, term8362.getClass(), "templateTypeName", null);
        setField(term8362, term8362.getClass(), "templateType", null);
        setBooleanField(term8362, term8362.getClass(), "tolerateUndefinedValues", false);
        setField(term8362, term8362.getClass(), "resolveMode", null);
        setField(term8361, term8361.getClass(), "registry", term8362);
        setField(term8361, term8361.getClass(), "reverseInterpreter", null);
        setField(term8361, term8361.getClass(), "syntacticScope", null);
        setField(term8361, term8361.getClass(), "functionScope", null);
        setField(term8361, term8361.getClass(), "bottomScope", null);
        setField(term8361, term8361.getClass(), "assertionFunctionsMap", null);
        setField(term8361, term8361.getClass(), "cfg", null);
        setField(term8361, term8361.getClass(), "joinOp", null);
        setField(term8361, term8361.getClass(), "orderedWorkSet", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "createEntryLattice", argTypes, term267, args);
        assertTrue(recursiveEquals(term267, term8361));
        assertTrue(recursiveEquals(retValue, null));
    }

};


