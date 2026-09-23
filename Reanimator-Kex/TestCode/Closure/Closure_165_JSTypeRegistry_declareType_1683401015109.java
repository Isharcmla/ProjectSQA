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

public class JSTypeRegistry_declareType_1683401015109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4503;
     Object term485807;

    public JSTypeRegistry_declareType_1683401015109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4505 = new HashMap();
        HashMap term4515 = new HashMap();
        Set<Object> term485825 =  ((Map) term4515).keySet();
        HashSet term4514 = new HashSet((Collection<? extends Object>) term485825);
        HashMap term4526 = new HashMap();
        Set<Object> term485826 =  ((Map) term4526).keySet();
        HashSet term4525 = new HashSet((Collection<? extends Object>) term485826);
        HashMap term4541 = new HashMap();
        Set<Object> term485827 =  ((Map) term4541).keySet();
        HashSet term4540 = new HashSet((Collection<? extends Object>) term485827);
        HashMap term4549 = new HashMap();
        HashMap term4564 = new HashMap();
        HashMap term4569 = new HashMap();
        term4503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term4504 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 4);
        setField(term4503, term4503.getClass(), "reporter", null);
        setField(term4503, term4503.getClass(), "nativeTypes", term4504);
        setField(term4503, term4503.getClass(), "namesToTypes", term4505);
        setField(term4503, term4503.getClass(), "namespaces", term4514);
        setField(term4503, term4503.getClass(), "nonNullableTypeNames", term4525);
        setField(term4503, term4503.getClass(), "forwardDeclaredTypes", term4540);
        setField(term4503, term4503.getClass(), "typesIndexedByProperty", term4549);
        setField(term4503, term4503.getClass(), "eachRefTypeIndexedByProperty", term4564);
        setField(term4503, term4503.getClass(), "greatestSubtypeByProperty", term4569);
        setField(term4503, term4503.getClass(), "interfaceToImplementors", null);
        setField(term4503, term4503.getClass(), "unresolvedNamedTypes", null);
        setField(term4503, term4503.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4503, term4503.getClass(), "lastGeneration", false);
        setField(term4503, term4503.getClass(), "templateTypeName", null);
        setField(term4503, term4503.getClass(), "templateType", null);
        setBooleanField(term4503, term4503.getClass(), "tolerateUndefinedValues", false);
        setField(term4503, term4503.getClass(), "resolveMode", null);
        HashMap term485809 = new HashMap();
        HashMap term485814 = new HashMap();
        Set<Object> term485838 =  ((Map) term485814).keySet();
        HashSet term485813 = new HashSet((Collection<? extends Object>) term485838);
        HashMap term485816 = new HashMap();
        Set<Object> term485839 =  ((Map) term485816).keySet();
        HashSet term485815 = new HashSet((Collection<? extends Object>) term485839);
        HashMap term485818 = new HashMap();
        Set<Object> term485840 =  ((Map) term485818).keySet();
        HashSet term485817 = new HashSet((Collection<? extends Object>) term485840);
        HashMap term485819 = new HashMap();
        HashMap term485820 = new HashMap();
        HashMap term485821 = new HashMap();
        term485807 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term485808 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 4);
        setField(term485807, term485807.getClass(), "reporter", null);
        setField(term485807, term485807.getClass(), "nativeTypes", term485808);
        setField(term485807, term485807.getClass(), "namesToTypes", term485809);
        setField(term485807, term485807.getClass(), "namespaces", term485813);
        setField(term485807, term485807.getClass(), "nonNullableTypeNames", term485815);
        setField(term485807, term485807.getClass(), "forwardDeclaredTypes", term485817);
        setField(term485807, term485807.getClass(), "typesIndexedByProperty", term485819);
        setField(term485807, term485807.getClass(), "eachRefTypeIndexedByProperty", term485820);
        setField(term485807, term485807.getClass(), "greatestSubtypeByProperty", term485821);
        setField(term485807, term485807.getClass(), "interfaceToImplementors", null);
        setField(term485807, term485807.getClass(), "unresolvedNamedTypes", null);
        setField(term485807, term485807.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term485807, term485807.getClass(), "lastGeneration", false);
        setField(term485807, term485807.getClass(), "templateTypeName", null);
        setField(term485807, term485807.getClass(), "templateType", null);
        setBooleanField(term485807, term485807.getClass(), "tolerateUndefinedValues", false);
        setField(term485807, term485807.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = "ZWRAbOuktl";
        args[1] = null;
        Object retValue = callMethod(klass, "declareType", argTypes, term4503, args);
        assertTrue(recursiveEquals(term4503, term485807));
        assertTrue(recursiveEquals(retValue, true));
    }

};


