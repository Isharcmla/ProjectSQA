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

public class JSTypeRegistry_clearTemplateTypeName_1246966936165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13511;
     Object term509599;

    public JSTypeRegistry_clearTemplateTypeName_1246966936165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13513 = new HashMap();
        HashMap term13523 = new HashMap();
        Set<Object> term509611 =  ((Map) term13523).keySet();
        HashSet term13522 = new HashSet((Collection<? extends Object>) term509611);
        HashMap term13542 = new HashMap();
        Set<Object> term509612 =  ((Map) term13542).keySet();
        HashSet term13541 = new HashSet((Collection<? extends Object>) term509612);
        HashMap term13563 = new HashMap();
        Set<Object> term509613 =  ((Map) term13563).keySet();
        HashSet term13562 = new HashSet((Collection<? extends Object>) term509613);
        HashMap term13581 = new HashMap();
        HashMap term13596 = new HashMap();
        HashMap term13601 = new HashMap();
        term13511 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term13512 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term13511, term13511.getClass(), "reporter", null);
        setField(term13511, term13511.getClass(), "nativeTypes", term13512);
        setField(term13511, term13511.getClass(), "namesToTypes", term13513);
        setField(term13511, term13511.getClass(), "namespaces", term13522);
        setField(term13511, term13511.getClass(), "nonNullableTypeNames", term13541);
        setField(term13511, term13511.getClass(), "forwardDeclaredTypes", term13562);
        setField(term13511, term13511.getClass(), "typesIndexedByProperty", term13581);
        setField(term13511, term13511.getClass(), "eachRefTypeIndexedByProperty", term13596);
        setField(term13511, term13511.getClass(), "greatestSubtypeByProperty", term13601);
        setField(term13511, term13511.getClass(), "interfaceToImplementors", null);
        setField(term13511, term13511.getClass(), "unresolvedNamedTypes", null);
        setField(term13511, term13511.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term13511, term13511.getClass(), "lastGeneration", false);
        setField(term13511, term13511.getClass(), "templateTypeName", null);
        setField(term13511, term13511.getClass(), "templateType", null);
        setBooleanField(term13511, term13511.getClass(), "tolerateUndefinedValues", false);
        setField(term13511, term13511.getClass(), "resolveMode", null);
        HashMap term509601 = new HashMap();
        HashMap term509603 = new HashMap();
        Set<Object> term509614 =  ((Map) term509603).keySet();
        HashSet term509602 = new HashSet((Collection<? extends Object>) term509614);
        HashMap term509605 = new HashMap();
        Set<Object> term509615 =  ((Map) term509605).keySet();
        HashSet term509604 = new HashSet((Collection<? extends Object>) term509615);
        HashMap term509607 = new HashMap();
        Set<Object> term509616 =  ((Map) term509607).keySet();
        HashSet term509606 = new HashSet((Collection<? extends Object>) term509616);
        HashMap term509608 = new HashMap();
        HashMap term509609 = new HashMap();
        HashMap term509610 = new HashMap();
        term509599 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term509600 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term509599, term509599.getClass(), "reporter", null);
        setField(term509599, term509599.getClass(), "nativeTypes", term509600);
        setField(term509599, term509599.getClass(), "namesToTypes", term509601);
        setField(term509599, term509599.getClass(), "namespaces", term509602);
        setField(term509599, term509599.getClass(), "nonNullableTypeNames", term509604);
        setField(term509599, term509599.getClass(), "forwardDeclaredTypes", term509606);
        setField(term509599, term509599.getClass(), "typesIndexedByProperty", term509608);
        setField(term509599, term509599.getClass(), "eachRefTypeIndexedByProperty", term509609);
        setField(term509599, term509599.getClass(), "greatestSubtypeByProperty", term509610);
        setField(term509599, term509599.getClass(), "interfaceToImplementors", null);
        setField(term509599, term509599.getClass(), "unresolvedNamedTypes", null);
        setField(term509599, term509599.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term509599, term509599.getClass(), "lastGeneration", false);
        setField(term509599, term509599.getClass(), "templateTypeName", null);
        setField(term509599, term509599.getClass(), "templateType", null);
        setBooleanField(term509599, term509599.getClass(), "tolerateUndefinedValues", false);
        setField(term509599, term509599.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearTemplateTypeName", argTypes, term13511, args);
        assertTrue(recursiveEquals(term13511, term509599));
    }

};


