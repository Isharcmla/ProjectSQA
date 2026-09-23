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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UnionType_testForEquality_87171697949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term607;
     Object term5094;

    public UnionType_testForEquality_87171697949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term608 = new ArrayList();
        HashMap term617 = new HashMap();
        HashMap term626 = new HashMap();
        Set<Object> term5109 =  ((Map) term626).keySet();
        HashSet term625 = new HashSet((Collection<? extends Object>) term5109);
        HashMap term633 = new HashMap();
        Set<Object> term5110 =  ((Map) term633).keySet();
        HashSet term632 = new HashSet((Collection<? extends Object>) term5110);
        HashMap term640 = new HashMap();
        Set<Object> term5111 =  ((Map) term640).keySet();
        HashSet term639 = new HashSet((Collection<? extends Object>) term5111);
        HashMap term645 = new HashMap();
        HashMap term653 = new HashMap();
        HashMap term658 = new HashMap();
        term607 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term615 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term616 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term607, term607.getClass(), "alternates", term608);
        setIntField(term607, term607.getClass(), "hashcode", 1596070772);
        setBooleanField(term607, term607.getClass(), "resolved", false);
        setField(term607, term607.getClass(), "resolveResult", null);
        setBooleanField(term607, term607.getClass(), "inTemplatedCheckVisit", true);
        setField(term615, term615.getClass(), "reporter", null);
        setField(term615, term615.getClass(), "nativeTypes", term616);
        setField(term615, term615.getClass(), "namesToTypes", term617);
        setField(term615, term615.getClass(), "namespaces", term625);
        setField(term615, term615.getClass(), "nonNullableTypeNames", term632);
        setField(term615, term615.getClass(), "forwardDeclaredTypes", term639);
        setField(term615, term615.getClass(), "typesIndexedByProperty", term645);
        setField(term615, term615.getClass(), "eachRefTypeIndexedByProperty", term653);
        setField(term615, term615.getClass(), "greatestSubtypeByProperty", term658);
        setField(term615, term615.getClass(), "interfaceToImplementors", null);
        setField(term615, term615.getClass(), "unresolvedNamedTypes", null);
        setField(term615, term615.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term615, term615.getClass(), "lastGeneration", false);
        setField(term615, term615.getClass(), "templateTypes", null);
        setBooleanField(term615, term615.getClass(), "tolerateUndefinedValues", false);
        setField(term615, term615.getClass(), "resolveMode", null);
        setField(term607, term607.getClass(), "registry", term615);
        ArrayList term5095 = new ArrayList();
        HashMap term5099 = new HashMap();
        HashMap term5101 = new HashMap();
        Set<Object> term5112 =  ((Map) term5101).keySet();
        HashSet term5100 = new HashSet((Collection<? extends Object>) term5112);
        HashMap term5103 = new HashMap();
        Set<Object> term5113 =  ((Map) term5103).keySet();
        HashSet term5102 = new HashSet((Collection<? extends Object>) term5113);
        HashMap term5105 = new HashMap();
        Set<Object> term5114 =  ((Map) term5105).keySet();
        HashSet term5104 = new HashSet((Collection<? extends Object>) term5114);
        HashMap term5106 = new HashMap();
        HashMap term5107 = new HashMap();
        HashMap term5108 = new HashMap();
        term5094 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term5097 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term5098 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term5094, term5094.getClass(), "alternates", term5095);
        setIntField(term5094, term5094.getClass(), "hashcode", 1596070772);
        setBooleanField(term5094, term5094.getClass(), "resolved", false);
        setField(term5094, term5094.getClass(), "resolveResult", null);
        setBooleanField(term5094, term5094.getClass(), "inTemplatedCheckVisit", true);
        setField(term5097, term5097.getClass(), "reporter", null);
        setField(term5097, term5097.getClass(), "nativeTypes", term5098);
        setField(term5097, term5097.getClass(), "namesToTypes", term5099);
        setField(term5097, term5097.getClass(), "namespaces", term5100);
        setField(term5097, term5097.getClass(), "nonNullableTypeNames", term5102);
        setField(term5097, term5097.getClass(), "forwardDeclaredTypes", term5104);
        setField(term5097, term5097.getClass(), "typesIndexedByProperty", term5106);
        setField(term5097, term5097.getClass(), "eachRefTypeIndexedByProperty", term5107);
        setField(term5097, term5097.getClass(), "greatestSubtypeByProperty", term5108);
        setField(term5097, term5097.getClass(), "interfaceToImplementors", null);
        setField(term5097, term5097.getClass(), "unresolvedNamedTypes", null);
        setField(term5097, term5097.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term5097, term5097.getClass(), "lastGeneration", false);
        setField(term5097, term5097.getClass(), "templateTypes", null);
        setBooleanField(term5097, term5097.getClass(), "tolerateUndefinedValues", false);
        setField(term5097, term5097.getClass(), "resolveMode", null);
        setField(term5094, term5094.getClass(), "registry", term5097);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "testForEquality", argTypes, term607, args);
        assertTrue(recursiveEquals(term607, term5094));
        assertTrue(recursiveEquals(retValue, null));
    }

};


