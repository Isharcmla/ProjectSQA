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

public class TypeValidator_getNativeType_177806635866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6476;
     Object enum6;

    public TypeValidator_getNativeType_177806635866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6479 = new HashMap();
        HashMap term6488 = new HashMap();
        Set<Object> term16368 =  ((Map) term6488).keySet();
        HashSet term6487 = new HashSet((Collection<? extends Object>) term16368);
        HashMap term6495 = new HashMap();
        Set<Object> term16369 =  ((Map) term6495).keySet();
        HashSet term6494 = new HashSet((Collection<? extends Object>) term16369);
        HashMap term6502 = new HashMap();
        Set<Object> term16370 =  ((Map) term6502).keySet();
        HashSet term6501 = new HashSet((Collection<? extends Object>) term16370);
        HashMap term6508 = new HashMap();
        HashMap term6516 = new HashMap();
        HashMap term6521 = new HashMap();
        term6476 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term6477 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6478 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term6476, term6476.getClass(), "compiler", null);
        setField(term6477, term6477.getClass(), "reporter", null);
        setField(term6477, term6477.getClass(), "nativeTypes", term6478);
        setField(term6477, term6477.getClass(), "namesToTypes", term6479);
        setField(term6477, term6477.getClass(), "namespaces", term6487);
        setField(term6477, term6477.getClass(), "nonNullableTypeNames", term6494);
        setField(term6477, term6477.getClass(), "forwardDeclaredTypes", term6501);
        setField(term6477, term6477.getClass(), "typesIndexedByProperty", term6508);
        setField(term6477, term6477.getClass(), "eachRefTypeIndexedByProperty", term6516);
        setField(term6477, term6477.getClass(), "greatestSubtypeByProperty", term6521);
        setField(term6477, term6477.getClass(), "interfaceToImplementors", null);
        setField(term6477, term6477.getClass(), "unresolvedNamedTypes", null);
        setField(term6477, term6477.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6477, term6477.getClass(), "lastGeneration", false);
        setField(term6477, term6477.getClass(), "templateTypeName", null);
        setField(term6477, term6477.getClass(), "templateType", null);
        setBooleanField(term6477, term6477.getClass(), "tolerateUndefinedValues", false);
        setField(term6477, term6477.getClass(), "resolveMode", null);
        setField(term6476, term6476.getClass(), "typeRegistry", term6477);
        setField(term6476, term6476.getClass(), "allValueTypes", null);
        setBooleanField(term6476, term6476.getClass(), "shouldReport", false);
        setField(term6476, term6476.getClass(), "nullOrUndefined", null);
        setField(term6476, term6476.getClass(), "mismatches", null);
        Class<? extends Object> term16372 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term16371 = ((Class) term16372).getDeclaredField((String) "TYPE_ERROR_FUNCTION_TYPE");
        ((Field) term16371).setAccessible(true);
        enum6 = ((Field) term16371).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum6;
        try {
            callMethod(klass, "getNativeType", argTypes, term6476, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


