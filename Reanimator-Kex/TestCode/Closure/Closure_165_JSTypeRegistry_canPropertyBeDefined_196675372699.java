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

public class JSTypeRegistry_canPropertyBeDefined_196675372699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3274;
     Object term482318;

    public JSTypeRegistry_canPropertyBeDefined_196675372699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3276 = new HashMap();
        HashMap term3286 = new HashMap();
        Set<Object> term482333 =  ((Map) term3286).keySet();
        HashSet term3285 = new HashSet((Collection<? extends Object>) term482333);
        HashMap term3295 = new HashMap();
        Set<Object> term482334 =  ((Map) term3295).keySet();
        HashSet term3294 = new HashSet((Collection<? extends Object>) term482334);
        HashMap term3310 = new HashMap();
        Set<Object> term482335 =  ((Map) term3310).keySet();
        HashSet term3309 = new HashSet((Collection<? extends Object>) term482335);
        HashMap term3320 = new HashMap();
        HashMap term3335 = new HashMap();
        HashMap term3340 = new HashMap();
        term3274 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term3275 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term3274, term3274.getClass(), "reporter", null);
        setField(term3274, term3274.getClass(), "nativeTypes", term3275);
        setField(term3274, term3274.getClass(), "namesToTypes", term3276);
        setField(term3274, term3274.getClass(), "namespaces", term3285);
        setField(term3274, term3274.getClass(), "nonNullableTypeNames", term3294);
        setField(term3274, term3274.getClass(), "forwardDeclaredTypes", term3309);
        setField(term3274, term3274.getClass(), "typesIndexedByProperty", term3320);
        setField(term3274, term3274.getClass(), "eachRefTypeIndexedByProperty", term3335);
        setField(term3274, term3274.getClass(), "greatestSubtypeByProperty", term3340);
        setField(term3274, term3274.getClass(), "interfaceToImplementors", null);
        setField(term3274, term3274.getClass(), "unresolvedNamedTypes", null);
        setField(term3274, term3274.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term3274, term3274.getClass(), "lastGeneration", false);
        setField(term3274, term3274.getClass(), "templateTypeName", null);
        setField(term3274, term3274.getClass(), "templateType", null);
        setBooleanField(term3274, term3274.getClass(), "tolerateUndefinedValues", false);
        setField(term3274, term3274.getClass(), "resolveMode", null);
        HashMap term482320 = new HashMap();
        HashMap term482322 = new HashMap();
        Set<Object> term482346 =  ((Map) term482322).keySet();
        HashSet term482321 = new HashSet((Collection<? extends Object>) term482346);
        HashMap term482324 = new HashMap();
        Set<Object> term482347 =  ((Map) term482324).keySet();
        HashSet term482323 = new HashSet((Collection<? extends Object>) term482347);
        HashMap term482326 = new HashMap();
        Set<Object> term482348 =  ((Map) term482326).keySet();
        HashSet term482325 = new HashSet((Collection<? extends Object>) term482348);
        HashMap term482327 = new HashMap();
        HashMap term482328 = new HashMap();
        HashMap term482329 = new HashMap();
        term482318 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term482319 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term482318, term482318.getClass(), "reporter", null);
        setField(term482318, term482318.getClass(), "nativeTypes", term482319);
        setField(term482318, term482318.getClass(), "namesToTypes", term482320);
        setField(term482318, term482318.getClass(), "namespaces", term482321);
        setField(term482318, term482318.getClass(), "nonNullableTypeNames", term482323);
        setField(term482318, term482318.getClass(), "forwardDeclaredTypes", term482325);
        setField(term482318, term482318.getClass(), "typesIndexedByProperty", term482327);
        setField(term482318, term482318.getClass(), "eachRefTypeIndexedByProperty", term482328);
        setField(term482318, term482318.getClass(), "greatestSubtypeByProperty", term482329);
        setField(term482318, term482318.getClass(), "interfaceToImplementors", null);
        setField(term482318, term482318.getClass(), "unresolvedNamedTypes", null);
        setField(term482318, term482318.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term482318, term482318.getClass(), "lastGeneration", false);
        setField(term482318, term482318.getClass(), "templateTypeName", null);
        setField(term482318, term482318.getClass(), "templateType", null);
        setBooleanField(term482318, term482318.getClass(), "tolerateUndefinedValues", false);
        setField(term482318, term482318.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "TKOMaGswbU";
        Object retValue = callMethod(klass, "canPropertyBeDefined", argTypes, term3274, args);
        assertTrue(recursiveEquals(term3274, term482318));
        assertTrue(recursiveEquals(retValue, false));
    }

};


