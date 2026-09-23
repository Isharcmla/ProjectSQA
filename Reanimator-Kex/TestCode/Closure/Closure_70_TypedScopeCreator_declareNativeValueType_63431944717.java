package com.google.javascript.jscomp;

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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class TypedScopeCreator_declareNativeValueType_63431944717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1769;
     Object term1817;
     Object enum4;

    public TypedScopeCreator_declareNativeValueType_63431944717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1773 = new HashMap();
        HashMap term1780 = new HashMap();
        Set<Object> term6108 =  ((Map) term1780).keySet();
        HashSet term1779 = new HashSet((Collection<? extends Object>) term6108);
        HashMap term1786 = new HashMap();
        Set<Object> term6109 =  ((Map) term1786).keySet();
        HashSet term1785 = new HashSet((Collection<? extends Object>) term6109);
        HashMap term1792 = new HashMap();
        Set<Object> term6110 =  ((Map) term1792).keySet();
        HashSet term1791 = new HashSet((Collection<? extends Object>) term6110);
        HashMap term1797 = new HashMap();
        HashMap term1803 = new HashMap();
        HashMap term1808 = new HashMap();
        term1769 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term1770 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term1771 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1772 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term1769, term1769.getClass(), "compiler", null);
        setField(term1769, term1769.getClass(), "typeParsingErrorReporter", null);
        setField(term1770, term1770.getClass(), "compiler", null);
        setField(term1771, term1771.getClass(), "reporter", null);
        setField(term1771, term1771.getClass(), "nativeTypes", term1772);
        setField(term1771, term1771.getClass(), "namesToTypes", term1773);
        setField(term1771, term1771.getClass(), "namespaces", term1779);
        setField(term1771, term1771.getClass(), "nonNullableTypeNames", term1785);
        setField(term1771, term1771.getClass(), "forwardDeclaredTypes", term1791);
        setField(term1771, term1771.getClass(), "typesIndexedByProperty", term1797);
        setField(term1771, term1771.getClass(), "eachRefTypeIndexedByProperty", term1803);
        setField(term1771, term1771.getClass(), "greatestSubtypeByProperty", term1808);
        setField(term1771, term1771.getClass(), "interfaceToImplementors", null);
        setField(term1771, term1771.getClass(), "unresolvedNamedTypes", null);
        setField(term1771, term1771.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1771, term1771.getClass(), "lastGeneration", false);
        setField(term1771, term1771.getClass(), "templateTypeName", null);
        setField(term1771, term1771.getClass(), "templateType", null);
        setBooleanField(term1771, term1771.getClass(), "tolerateUndefinedValues", false);
        setField(term1771, term1771.getClass(), "resolveMode", null);
        setField(term1770, term1770.getClass(), "typeRegistry", term1771);
        setField(term1770, term1770.getClass(), "allValueTypes", null);
        setBooleanField(term1770, term1770.getClass(), "shouldReport", false);
        setField(term1770, term1770.getClass(), "nullOrUndefined", null);
        setField(term1770, term1770.getClass(), "mismatches", null);
        setField(term1769, term1769.getClass(), "validator", term1770);
        setField(term1769, term1769.getClass(), "codingConvention", null);
        setField(term1769, term1769.getClass(), "typeRegistry", null);
        setField(term1769, term1769.getClass(), "delegateProxyPrototypes", null);
        HashMap term1818 = new HashMap();
        term1817 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1831 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1817, term1817.getClass(), "vars", term1818);
        setField(term1831, term1831.getClass(), "vars", null);
        setField(term1831, term1831.getClass(), "parent", null);
        setIntField(term1831, term1831.getClass(), "depth", 0);
        setField(term1831, term1831.getClass(), "rootNode", null);
        setField(term1831, term1831.getClass(), "thisType", null);
        setBooleanField(term1831, term1831.getClass(), "isBottom", false);
        setField(term1831, term1831.getClass(), "arguments", null);
        setField(term1817, term1817.getClass(), "parent", term1831);
        setIntField(term1817, term1817.getClass(), "depth", 458147407);
        setIntField(term1835, term1835.getClass(), "type", 0);
        setField(term1835, term1835.getClass(), "next", null);
        setField(term1835, term1835.getClass(), "first", null);
        setField(term1835, term1835.getClass(), "last", null);
        setField(term1835, term1835.getClass(), "propListHead", null);
        setIntField(term1835, term1835.getClass(), "sourcePosition", 0);
        setField(term1835, term1835.getClass(), "jsType", null);
        setField(term1835, term1835.getClass(), "parent", null);
        setField(term1817, term1817.getClass(), "rootNode", term1835);
        setField(term1817, term1817.getClass(), "thisType", null);
        setBooleanField(term1817, term1817.getClass(), "isBottom", false);
        setField(term1817, term1817.getClass(), "arguments", null);
        Class<? extends Object> term6122 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term6121 = ((Class) term6122).getDeclaredField((String) "TYPE_ERROR_FUNCTION_TYPE");
        ((Field) term6121).setAccessible(true);
        enum4 = ((Field) term6121).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[3];
        args[0] = term1817;
        args[1] = "XOiDvlDhdc";
        args[2] = enum4;
        try {
            callMethod(klass, "declareNativeValueType", argTypes, term1769, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


