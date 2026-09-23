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

public class TypeInference_getNativeType_159300705587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6182;
     Object enum31;

    public TypeInference_getNativeType_159300705587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6185 = new HashMap();
        HashMap term6194 = new HashMap();
        Set<Object> term27123 =  ((Map) term6194).keySet();
        HashSet term6193 = new HashSet((Collection<? extends Object>) term27123);
        HashMap term6201 = new HashMap();
        Set<Object> term27124 =  ((Map) term6201).keySet();
        HashSet term6200 = new HashSet((Collection<? extends Object>) term27124);
        HashMap term6208 = new HashMap();
        Set<Object> term27125 =  ((Map) term6208).keySet();
        HashSet term6207 = new HashSet((Collection<? extends Object>) term27125);
        HashMap term6214 = new HashMap();
        HashMap term6222 = new HashMap();
        HashMap term6227 = new HashMap();
        term6182 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term6183 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6184 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        setField(term6182, term6182.getClass(), "compiler", null);
        setField(term6183, term6183.getClass(), "reporter", null);
        setField(term6183, term6183.getClass(), "nativeTypes", term6184);
        setField(term6183, term6183.getClass(), "namesToTypes", term6185);
        setField(term6183, term6183.getClass(), "namespaces", term6193);
        setField(term6183, term6183.getClass(), "nonNullableTypeNames", term6200);
        setField(term6183, term6183.getClass(), "forwardDeclaredTypes", term6207);
        setField(term6183, term6183.getClass(), "typesIndexedByProperty", term6214);
        setField(term6183, term6183.getClass(), "eachRefTypeIndexedByProperty", term6222);
        setField(term6183, term6183.getClass(), "greatestSubtypeByProperty", term6227);
        setField(term6183, term6183.getClass(), "interfaceToImplementors", null);
        setField(term6183, term6183.getClass(), "unresolvedNamedTypes", null);
        setField(term6183, term6183.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6183, term6183.getClass(), "lastGeneration", false);
        setField(term6183, term6183.getClass(), "templateTypeName", null);
        setField(term6183, term6183.getClass(), "templateType", null);
        setBooleanField(term6183, term6183.getClass(), "tolerateUndefinedValues", false);
        setField(term6183, term6183.getClass(), "resolveMode", null);
        setField(term6182, term6182.getClass(), "registry", term6183);
        setField(term6182, term6182.getClass(), "reverseInterpreter", null);
        setField(term6182, term6182.getClass(), "syntacticScope", null);
        setField(term6182, term6182.getClass(), "functionScope", null);
        setField(term6182, term6182.getClass(), "bottomScope", null);
        setField(term6182, term6182.getClass(), "assertionFunctionsMap", null);
        setField(term6182, term6182.getClass(), "cfg", null);
        setField(term6182, term6182.getClass(), "joinOp", null);
        setField(term6182, term6182.getClass(), "orderedWorkSet", null);
        Class<? extends Object> term27127 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term27126 = ((Class) term27127).getDeclaredField((String) "REGEXP_FUNCTION_TYPE");
        ((Field) term27126).setAccessible(true);
        enum31 = ((Field) term27126).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum31;
        try {
            callMethod(klass, "getNativeType", argTypes, term6182, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


