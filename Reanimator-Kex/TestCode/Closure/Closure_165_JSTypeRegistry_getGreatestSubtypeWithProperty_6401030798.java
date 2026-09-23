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

public class JSTypeRegistry_getGreatestSubtypeWithProperty_6401030798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3156;

    public JSTypeRegistry_getGreatestSubtypeWithProperty_6401030798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3158 = new HashMap();
        HashMap term3168 = new HashMap();
        Set<Object> term482249 =  ((Map) term3168).keySet();
        HashSet term3167 = new HashSet((Collection<? extends Object>) term482249);
        HashMap term3191 = new HashMap();
        Set<Object> term482250 =  ((Map) term3191).keySet();
        HashSet term3190 = new HashSet((Collection<? extends Object>) term482250);
        HashMap term3210 = new HashMap();
        Set<Object> term482251 =  ((Map) term3210).keySet();
        HashSet term3209 = new HashSet((Collection<? extends Object>) term482251);
        HashMap term3218 = new HashMap();
        HashMap term3233 = new HashMap();
        HashMap term3238 = new HashMap();
        term3156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term3157 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        setField(term3156, term3156.getClass(), "reporter", null);
        setField(term3156, term3156.getClass(), "nativeTypes", term3157);
        setField(term3156, term3156.getClass(), "namesToTypes", term3158);
        setField(term3156, term3156.getClass(), "namespaces", term3167);
        setField(term3156, term3156.getClass(), "nonNullableTypeNames", term3190);
        setField(term3156, term3156.getClass(), "forwardDeclaredTypes", term3209);
        setField(term3156, term3156.getClass(), "typesIndexedByProperty", term3218);
        setField(term3156, term3156.getClass(), "eachRefTypeIndexedByProperty", term3233);
        setField(term3156, term3156.getClass(), "greatestSubtypeByProperty", term3238);
        setField(term3156, term3156.getClass(), "interfaceToImplementors", null);
        setField(term3156, term3156.getClass(), "unresolvedNamedTypes", null);
        setField(term3156, term3156.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term3156, term3156.getClass(), "lastGeneration", false);
        setField(term3156, term3156.getClass(), "templateTypeName", null);
        setField(term3156, term3156.getClass(), "templateType", null);
        setBooleanField(term3156, term3156.getClass(), "tolerateUndefinedValues", false);
        setField(term3156, term3156.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "VNdDwXMYxR";
        try {
            callMethod(klass, "getGreatestSubtypeWithProperty", argTypes, term3156, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


