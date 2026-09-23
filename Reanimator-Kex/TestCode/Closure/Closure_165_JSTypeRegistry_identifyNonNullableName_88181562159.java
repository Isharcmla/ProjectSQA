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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class JSTypeRegistry_identifyNonNullableName_88181562159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12797;
     Object term507968;

    public JSTypeRegistry_identifyNonNullableName_88181562159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12799 = new HashMap();
        HashMap term12809 = new HashMap();
        Set<Object> term507984 =  ((Map) term12809).keySet();
        HashSet term12808 = new HashSet((Collection<? extends Object>) term507984);
        HashMap term12828 = new HashMap();
        Set<Object> term507985 =  ((Map) term12828).keySet();
        HashSet term12827 = new HashSet((Collection<? extends Object>) term507985);
        HashMap term12841 = new HashMap();
        Set<Object> term507986 =  ((Map) term12841).keySet();
        HashSet term12840 = new HashSet((Collection<? extends Object>) term507986);
        HashMap term12855 = new HashMap();
        HashMap term12870 = new HashMap();
        HashMap term12875 = new HashMap();
        term12797 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term12798 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term12797, term12797.getClass(), "reporter", null);
        setField(term12797, term12797.getClass(), "nativeTypes", term12798);
        setField(term12797, term12797.getClass(), "namesToTypes", term12799);
        setField(term12797, term12797.getClass(), "namespaces", term12808);
        setField(term12797, term12797.getClass(), "nonNullableTypeNames", term12827);
        setField(term12797, term12797.getClass(), "forwardDeclaredTypes", term12840);
        setField(term12797, term12797.getClass(), "typesIndexedByProperty", term12855);
        setField(term12797, term12797.getClass(), "eachRefTypeIndexedByProperty", term12870);
        setField(term12797, term12797.getClass(), "greatestSubtypeByProperty", term12875);
        setField(term12797, term12797.getClass(), "interfaceToImplementors", null);
        setField(term12797, term12797.getClass(), "unresolvedNamedTypes", null);
        setField(term12797, term12797.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term12797, term12797.getClass(), "lastGeneration", false);
        setField(term12797, term12797.getClass(), "templateTypeName", null);
        setField(term12797, term12797.getClass(), "templateType", null);
        setBooleanField(term12797, term12797.getClass(), "tolerateUndefinedValues", false);
        setField(term12797, term12797.getClass(), "resolveMode", null);
        HashMap term507970 = new HashMap();
        HashMap term507972 = new HashMap();
        Set<Object> term507997 =  ((Map) term507972).keySet();
        HashSet term507971 = new HashSet((Collection<? extends Object>) term507997);
        HashMap term507974 = new HashMap();
        Set<Object> term507998 =  ((Map) term507974).keySet();
        HashSet term507973 = new HashSet((Collection<? extends Object>) term507998);
        HashMap term507978 = new HashMap();
        Set<Object> term507999 =  ((Map) term507978).keySet();
        HashSet term507977 = new HashSet((Collection<? extends Object>) term507999);
        HashMap term507979 = new HashMap();
        HashMap term507980 = new HashMap();
        HashMap term507981 = new HashMap();
        term507968 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term507969 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term507968, term507968.getClass(), "reporter", null);
        setField(term507968, term507968.getClass(), "nativeTypes", term507969);
        setField(term507968, term507968.getClass(), "namesToTypes", term507970);
        setField(term507968, term507968.getClass(), "namespaces", term507971);
        setField(term507968, term507968.getClass(), "nonNullableTypeNames", term507973);
        setField(term507968, term507968.getClass(), "forwardDeclaredTypes", term507977);
        setField(term507968, term507968.getClass(), "typesIndexedByProperty", term507979);
        setField(term507968, term507968.getClass(), "eachRefTypeIndexedByProperty", term507980);
        setField(term507968, term507968.getClass(), "greatestSubtypeByProperty", term507981);
        setField(term507968, term507968.getClass(), "interfaceToImplementors", null);
        setField(term507968, term507968.getClass(), "unresolvedNamedTypes", null);
        setField(term507968, term507968.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term507968, term507968.getClass(), "lastGeneration", false);
        setField(term507968, term507968.getClass(), "templateTypeName", null);
        setField(term507968, term507968.getClass(), "templateType", null);
        setBooleanField(term507968, term507968.getClass(), "tolerateUndefinedValues", false);
        setField(term507968, term507968.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wOeJuAGSwi";
        callMethod(klass, "identifyNonNullableName", argTypes, term12797, args);
        assertTrue(recursiveEquals(term12797, term507968));
    }

};


