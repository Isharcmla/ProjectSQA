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

public class JSTypeRegistry_getTypesWithProperty_403129303100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3376;
     Object term482416;
     Object term482361;

    public JSTypeRegistry_getTypesWithProperty_403129303100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3378 = new HashMap();
        HashMap term3388 = new HashMap();
        Set<Object> term482430 =  ((Map) term3388).keySet();
        HashSet term3387 = new HashSet((Collection<? extends Object>) term482430);
        HashMap term3405 = new HashMap();
        Set<Object> term482431 =  ((Map) term3405).keySet();
        HashSet term3404 = new HashSet((Collection<? extends Object>) term482431);
        HashMap term3424 = new HashMap();
        Set<Object> term482432 =  ((Map) term3424).keySet();
        HashSet term3423 = new HashSet((Collection<? extends Object>) term482432);
        HashMap term3434 = new HashMap();
        HashMap term3449 = new HashMap();
        HashMap term3454 = new HashMap();
        term3376 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term3377 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term3376, term3376.getClass(), "reporter", null);
        setField(term3376, term3376.getClass(), "nativeTypes", term3377);
        setField(term3376, term3376.getClass(), "namesToTypes", term3378);
        setField(term3376, term3376.getClass(), "namespaces", term3387);
        setField(term3376, term3376.getClass(), "nonNullableTypeNames", term3404);
        setField(term3376, term3376.getClass(), "forwardDeclaredTypes", term3423);
        setField(term3376, term3376.getClass(), "typesIndexedByProperty", term3434);
        setField(term3376, term3376.getClass(), "eachRefTypeIndexedByProperty", term3449);
        setField(term3376, term3376.getClass(), "greatestSubtypeByProperty", term3454);
        setField(term3376, term3376.getClass(), "interfaceToImplementors", null);
        setField(term3376, term3376.getClass(), "unresolvedNamedTypes", null);
        setField(term3376, term3376.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term3376, term3376.getClass(), "lastGeneration", false);
        setField(term3376, term3376.getClass(), "templateTypeName", null);
        setField(term3376, term3376.getClass(), "templateType", null);
        setBooleanField(term3376, term3376.getClass(), "tolerateUndefinedValues", false);
        setField(term3376, term3376.getClass(), "resolveMode", null);
        HashMap term482418 = new HashMap();
        HashMap term482420 = new HashMap();
        Set<Object> term482443 =  ((Map) term482420).keySet();
        HashSet term482419 = new HashSet((Collection<? extends Object>) term482443);
        HashMap term482422 = new HashMap();
        Set<Object> term482444 =  ((Map) term482422).keySet();
        HashSet term482421 = new HashSet((Collection<? extends Object>) term482444);
        HashMap term482424 = new HashMap();
        Set<Object> term482445 =  ((Map) term482424).keySet();
        HashSet term482423 = new HashSet((Collection<? extends Object>) term482445);
        HashMap term482425 = new HashMap();
        HashMap term482426 = new HashMap();
        HashMap term482427 = new HashMap();
        term482416 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term482417 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term482416, term482416.getClass(), "reporter", null);
        setField(term482416, term482416.getClass(), "nativeTypes", term482417);
        setField(term482416, term482416.getClass(), "namesToTypes", term482418);
        setField(term482416, term482416.getClass(), "namespaces", term482419);
        setField(term482416, term482416.getClass(), "nonNullableTypeNames", term482421);
        setField(term482416, term482416.getClass(), "forwardDeclaredTypes", term482423);
        setField(term482416, term482416.getClass(), "typesIndexedByProperty", term482425);
        setField(term482416, term482416.getClass(), "eachRefTypeIndexedByProperty", term482426);
        setField(term482416, term482416.getClass(), "greatestSubtypeByProperty", term482427);
        setField(term482416, term482416.getClass(), "interfaceToImplementors", null);
        setField(term482416, term482416.getClass(), "unresolvedNamedTypes", null);
        setField(term482416, term482416.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term482416, term482416.getClass(), "lastGeneration", false);
        setField(term482416, term482416.getClass(), "templateTypeName", null);
        setField(term482416, term482416.getClass(), "templateType", null);
        setBooleanField(term482416, term482416.getClass(), "tolerateUndefinedValues", false);
        setField(term482416, term482416.getClass(), "resolveMode", null);
        term482361 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableList"));
        setField(term482361, term482361.getClass(), "asList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lBpveIKbea";
        Object retValue = callMethod(klass, "getTypesWithProperty", argTypes, term3376, args);
        assertTrue(recursiveEquals(term3376, term482416));
        assertTrue(recursiveEquals(retValue, term482361));
    }

};


