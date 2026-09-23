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

public class JSTypeRegistry_getNativeFunctionType_161211137117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6050;
     Object enum26;

    public JSTypeRegistry_getNativeFunctionType_161211137117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6052 = new HashMap();
        HashMap term6062 = new HashMap();
        Set<Object> term487164 =  ((Map) term6062).keySet();
        HashSet term6061 = new HashSet((Collection<? extends Object>) term487164);
        HashMap term6075 = new HashMap();
        Set<Object> term487165 =  ((Map) term6075).keySet();
        HashSet term6074 = new HashSet((Collection<? extends Object>) term487165);
        HashMap term6081 = new HashMap();
        Set<Object> term487166 =  ((Map) term6081).keySet();
        HashSet term6080 = new HashSet((Collection<? extends Object>) term487166);
        HashMap term6099 = new HashMap();
        HashMap term6114 = new HashMap();
        HashMap term6119 = new HashMap();
        term6050 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6051 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term6050, term6050.getClass(), "reporter", null);
        setField(term6050, term6050.getClass(), "nativeTypes", term6051);
        setField(term6050, term6050.getClass(), "namesToTypes", term6052);
        setField(term6050, term6050.getClass(), "namespaces", term6061);
        setField(term6050, term6050.getClass(), "nonNullableTypeNames", term6074);
        setField(term6050, term6050.getClass(), "forwardDeclaredTypes", term6080);
        setField(term6050, term6050.getClass(), "typesIndexedByProperty", term6099);
        setField(term6050, term6050.getClass(), "eachRefTypeIndexedByProperty", term6114);
        setField(term6050, term6050.getClass(), "greatestSubtypeByProperty", term6119);
        setField(term6050, term6050.getClass(), "interfaceToImplementors", null);
        setField(term6050, term6050.getClass(), "unresolvedNamedTypes", null);
        setField(term6050, term6050.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6050, term6050.getClass(), "lastGeneration", false);
        setField(term6050, term6050.getClass(), "templateTypeName", null);
        setField(term6050, term6050.getClass(), "templateType", null);
        setBooleanField(term6050, term6050.getClass(), "tolerateUndefinedValues", false);
        setField(term6050, term6050.getClass(), "resolveMode", null);
        Class<? extends Object> term487171 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term487170 = ((Class) term487171).getDeclaredField((String) "NULL_TYPE");
        ((Field) term487170).setAccessible(true);
        enum26 = ((Field) term487170).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum26;
        try {
            callMethod(klass, "getNativeFunctionType", argTypes, term6050, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


