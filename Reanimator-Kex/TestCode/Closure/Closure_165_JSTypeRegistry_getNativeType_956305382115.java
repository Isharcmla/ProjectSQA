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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class JSTypeRegistry_getNativeType_956305382115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5186;
     Object enum24;

    public JSTypeRegistry_getNativeType_956305382115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5188 = new HashMap();
        HashMap term5198 = new HashMap();
        Set<Object> term486522 =  ((Map) term5198).keySet();
        HashSet term5197 = new HashSet((Collection<? extends Object>) term486522);
        HashMap term5219 = new HashMap();
        Set<Object> term486523 =  ((Map) term5219).keySet();
        HashSet term5218 = new HashSet((Collection<? extends Object>) term486523);
        HashMap term5228 = new HashMap();
        Set<Object> term486524 =  ((Map) term5228).keySet();
        HashSet term5227 = new HashSet((Collection<? extends Object>) term486524);
        HashMap term5242 = new HashMap();
        HashMap term5257 = new HashMap();
        HashMap term5262 = new HashMap();
        term5186 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term5187 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term5186, term5186.getClass(), "reporter", null);
        setField(term5186, term5186.getClass(), "nativeTypes", term5187);
        setField(term5186, term5186.getClass(), "namesToTypes", term5188);
        setField(term5186, term5186.getClass(), "namespaces", term5197);
        setField(term5186, term5186.getClass(), "nonNullableTypeNames", term5218);
        setField(term5186, term5186.getClass(), "forwardDeclaredTypes", term5227);
        setField(term5186, term5186.getClass(), "typesIndexedByProperty", term5242);
        setField(term5186, term5186.getClass(), "eachRefTypeIndexedByProperty", term5257);
        setField(term5186, term5186.getClass(), "greatestSubtypeByProperty", term5262);
        setField(term5186, term5186.getClass(), "interfaceToImplementors", null);
        setField(term5186, term5186.getClass(), "unresolvedNamedTypes", null);
        setField(term5186, term5186.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term5186, term5186.getClass(), "lastGeneration", false);
        setField(term5186, term5186.getClass(), "templateTypeName", null);
        setField(term5186, term5186.getClass(), "templateType", null);
        setBooleanField(term5186, term5186.getClass(), "tolerateUndefinedValues", false);
        setField(term5186, term5186.getClass(), "resolveMode", null);
        Class<? extends Object> term486526 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term486525 = ((Class) term486526).getDeclaredField((String) "TYPE_ERROR_FUNCTION_TYPE");
        ((Field) term486525).setAccessible(true);
        enum24 = ((Field) term486525).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum24;
        try {
            callMethod(klass, "getNativeType", argTypes, term5186, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


