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

public class JSTypeRegistry_isLastGeneration_554357504105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3798;
     Object term484045;

    public JSTypeRegistry_isLastGeneration_554357504105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3800 = new HashMap();
        HashMap term3810 = new HashMap();
        Set<Object> term484057 =  ((Map) term3810).keySet();
        HashSet term3809 = new HashSet((Collection<? extends Object>) term484057);
        HashMap term3821 = new HashMap();
        Set<Object> term484058 =  ((Map) term3821).keySet();
        HashSet term3820 = new HashSet((Collection<? extends Object>) term484058);
        HashMap term3827 = new HashMap();
        Set<Object> term484059 =  ((Map) term3827).keySet();
        HashSet term3826 = new HashSet((Collection<? extends Object>) term484059);
        HashMap term3837 = new HashMap();
        HashMap term3852 = new HashMap();
        HashMap term3857 = new HashMap();
        term3798 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term3799 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term3798, term3798.getClass(), "reporter", null);
        setField(term3798, term3798.getClass(), "nativeTypes", term3799);
        setField(term3798, term3798.getClass(), "namesToTypes", term3800);
        setField(term3798, term3798.getClass(), "namespaces", term3809);
        setField(term3798, term3798.getClass(), "nonNullableTypeNames", term3820);
        setField(term3798, term3798.getClass(), "forwardDeclaredTypes", term3826);
        setField(term3798, term3798.getClass(), "typesIndexedByProperty", term3837);
        setField(term3798, term3798.getClass(), "eachRefTypeIndexedByProperty", term3852);
        setField(term3798, term3798.getClass(), "greatestSubtypeByProperty", term3857);
        setField(term3798, term3798.getClass(), "interfaceToImplementors", null);
        setField(term3798, term3798.getClass(), "unresolvedNamedTypes", null);
        setField(term3798, term3798.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term3798, term3798.getClass(), "lastGeneration", false);
        setField(term3798, term3798.getClass(), "templateTypeName", null);
        setField(term3798, term3798.getClass(), "templateType", null);
        setBooleanField(term3798, term3798.getClass(), "tolerateUndefinedValues", false);
        setField(term3798, term3798.getClass(), "resolveMode", null);
        HashMap term484047 = new HashMap();
        HashMap term484049 = new HashMap();
        Set<Object> term484060 =  ((Map) term484049).keySet();
        HashSet term484048 = new HashSet((Collection<? extends Object>) term484060);
        HashMap term484051 = new HashMap();
        Set<Object> term484061 =  ((Map) term484051).keySet();
        HashSet term484050 = new HashSet((Collection<? extends Object>) term484061);
        HashMap term484053 = new HashMap();
        Set<Object> term484062 =  ((Map) term484053).keySet();
        HashSet term484052 = new HashSet((Collection<? extends Object>) term484062);
        HashMap term484054 = new HashMap();
        HashMap term484055 = new HashMap();
        HashMap term484056 = new HashMap();
        term484045 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term484046 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term484045, term484045.getClass(), "reporter", null);
        setField(term484045, term484045.getClass(), "nativeTypes", term484046);
        setField(term484045, term484045.getClass(), "namesToTypes", term484047);
        setField(term484045, term484045.getClass(), "namespaces", term484048);
        setField(term484045, term484045.getClass(), "nonNullableTypeNames", term484050);
        setField(term484045, term484045.getClass(), "forwardDeclaredTypes", term484052);
        setField(term484045, term484045.getClass(), "typesIndexedByProperty", term484054);
        setField(term484045, term484045.getClass(), "eachRefTypeIndexedByProperty", term484055);
        setField(term484045, term484045.getClass(), "greatestSubtypeByProperty", term484056);
        setField(term484045, term484045.getClass(), "interfaceToImplementors", null);
        setField(term484045, term484045.getClass(), "unresolvedNamedTypes", null);
        setField(term484045, term484045.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term484045, term484045.getClass(), "lastGeneration", false);
        setField(term484045, term484045.getClass(), "templateTypeName", null);
        setField(term484045, term484045.getClass(), "templateType", null);
        setBooleanField(term484045, term484045.getClass(), "tolerateUndefinedValues", false);
        setField(term484045, term484045.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLastGeneration", argTypes, term3798, args);
        assertTrue(recursiveEquals(term3798, term484045));
    }

};


