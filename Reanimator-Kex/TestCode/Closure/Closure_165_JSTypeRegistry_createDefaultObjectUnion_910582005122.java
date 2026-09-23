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

public class JSTypeRegistry_createDefaultObjectUnion_910582005122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6846;

    public JSTypeRegistry_createDefaultObjectUnion_910582005122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6848 = new HashMap();
        HashMap term6858 = new HashMap();
        Set<Object> term488066 =  ((Map) term6858).keySet();
        HashSet term6857 = new HashSet((Collection<? extends Object>) term488066);
        HashMap term6873 = new HashMap();
        Set<Object> term488067 =  ((Map) term6873).keySet();
        HashSet term6872 = new HashSet((Collection<? extends Object>) term488067);
        HashMap term6879 = new HashMap();
        Set<Object> term488068 =  ((Map) term6879).keySet();
        HashSet term6878 = new HashSet((Collection<? extends Object>) term488068);
        HashMap term6893 = new HashMap();
        HashMap term6908 = new HashMap();
        HashMap term6913 = new HashMap();
        term6846 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6847 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term6846, term6846.getClass(), "reporter", null);
        setField(term6846, term6846.getClass(), "nativeTypes", term6847);
        setField(term6846, term6846.getClass(), "namesToTypes", term6848);
        setField(term6846, term6846.getClass(), "namespaces", term6857);
        setField(term6846, term6846.getClass(), "nonNullableTypeNames", term6872);
        setField(term6846, term6846.getClass(), "forwardDeclaredTypes", term6878);
        setField(term6846, term6846.getClass(), "typesIndexedByProperty", term6893);
        setField(term6846, term6846.getClass(), "eachRefTypeIndexedByProperty", term6908);
        setField(term6846, term6846.getClass(), "greatestSubtypeByProperty", term6913);
        setField(term6846, term6846.getClass(), "interfaceToImplementors", null);
        setField(term6846, term6846.getClass(), "unresolvedNamedTypes", null);
        setField(term6846, term6846.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6846, term6846.getClass(), "lastGeneration", false);
        setField(term6846, term6846.getClass(), "templateTypeName", null);
        setField(term6846, term6846.getClass(), "templateType", null);
        setBooleanField(term6846, term6846.getClass(), "tolerateUndefinedValues", false);
        setField(term6846, term6846.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "createDefaultObjectUnion", argTypes, term6846, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


