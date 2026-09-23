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

public class JSTypeRegistry_hasNamespace_1727866310113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4959;
     Object term486442;

    public JSTypeRegistry_hasNamespace_1727866310113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4961 = new HashMap();
        HashMap term4971 = new HashMap();
        Set<Object> term486456 =  ((Map) term4971).keySet();
        HashSet term4970 = new HashSet((Collection<? extends Object>) term486456);
        HashMap term4990 = new HashMap();
        Set<Object> term486457 =  ((Map) term4990).keySet();
        HashSet term4989 = new HashSet((Collection<? extends Object>) term486457);
        HashMap term5003 = new HashMap();
        Set<Object> term486458 =  ((Map) term5003).keySet();
        HashSet term5002 = new HashSet((Collection<? extends Object>) term486458);
        HashMap term5021 = new HashMap();
        HashMap term5036 = new HashMap();
        HashMap term5041 = new HashMap();
        term4959 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term4960 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term4959, term4959.getClass(), "reporter", null);
        setField(term4959, term4959.getClass(), "nativeTypes", term4960);
        setField(term4959, term4959.getClass(), "namesToTypes", term4961);
        setField(term4959, term4959.getClass(), "namespaces", term4970);
        setField(term4959, term4959.getClass(), "nonNullableTypeNames", term4989);
        setField(term4959, term4959.getClass(), "forwardDeclaredTypes", term5002);
        setField(term4959, term4959.getClass(), "typesIndexedByProperty", term5021);
        setField(term4959, term4959.getClass(), "eachRefTypeIndexedByProperty", term5036);
        setField(term4959, term4959.getClass(), "greatestSubtypeByProperty", term5041);
        setField(term4959, term4959.getClass(), "interfaceToImplementors", null);
        setField(term4959, term4959.getClass(), "unresolvedNamedTypes", null);
        setField(term4959, term4959.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4959, term4959.getClass(), "lastGeneration", false);
        setField(term4959, term4959.getClass(), "templateTypeName", null);
        setField(term4959, term4959.getClass(), "templateType", null);
        setBooleanField(term4959, term4959.getClass(), "tolerateUndefinedValues", false);
        setField(term4959, term4959.getClass(), "resolveMode", null);
        HashMap term486444 = new HashMap();
        HashMap term486446 = new HashMap();
        Set<Object> term486469 =  ((Map) term486446).keySet();
        HashSet term486445 = new HashSet((Collection<? extends Object>) term486469);
        HashMap term486448 = new HashMap();
        Set<Object> term486470 =  ((Map) term486448).keySet();
        HashSet term486447 = new HashSet((Collection<? extends Object>) term486470);
        HashMap term486450 = new HashMap();
        Set<Object> term486471 =  ((Map) term486450).keySet();
        HashSet term486449 = new HashSet((Collection<? extends Object>) term486471);
        HashMap term486451 = new HashMap();
        HashMap term486452 = new HashMap();
        HashMap term486453 = new HashMap();
        term486442 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term486443 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term486442, term486442.getClass(), "reporter", null);
        setField(term486442, term486442.getClass(), "nativeTypes", term486443);
        setField(term486442, term486442.getClass(), "namesToTypes", term486444);
        setField(term486442, term486442.getClass(), "namespaces", term486445);
        setField(term486442, term486442.getClass(), "nonNullableTypeNames", term486447);
        setField(term486442, term486442.getClass(), "forwardDeclaredTypes", term486449);
        setField(term486442, term486442.getClass(), "typesIndexedByProperty", term486451);
        setField(term486442, term486442.getClass(), "eachRefTypeIndexedByProperty", term486452);
        setField(term486442, term486442.getClass(), "greatestSubtypeByProperty", term486453);
        setField(term486442, term486442.getClass(), "interfaceToImplementors", null);
        setField(term486442, term486442.getClass(), "unresolvedNamedTypes", null);
        setField(term486442, term486442.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term486442, term486442.getClass(), "lastGeneration", false);
        setField(term486442, term486442.getClass(), "templateTypeName", null);
        setField(term486442, term486442.getClass(), "templateType", null);
        setBooleanField(term486442, term486442.getClass(), "tolerateUndefinedValues", false);
        setField(term486442, term486442.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fzQzzdIOMC";
        callMethod(klass, "hasNamespace", argTypes, term4959, args);
        assertTrue(recursiveEquals(term4959, term486442));
    }

};


