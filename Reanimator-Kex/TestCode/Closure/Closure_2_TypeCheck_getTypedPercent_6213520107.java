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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TypeCheck_getTypedPercent_6213520107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13140;
     Object term25764;

    public TypeCheck_getTypedPercent_6213520107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13144 = new HashMap();
        HashMap term13151 = new HashMap();
        Set<Object> term25778 =  ((Map) term13151).keySet();
        HashSet term13150 = new HashSet((Collection<? extends Object>) term25778);
        HashMap term13157 = new HashMap();
        Set<Object> term25779 =  ((Map) term13157).keySet();
        HashSet term13156 = new HashSet((Collection<? extends Object>) term25779);
        HashMap term13163 = new HashMap();
        Set<Object> term25780 =  ((Map) term13163).keySet();
        HashSet term13162 = new HashSet((Collection<? extends Object>) term25780);
        HashMap term13168 = new HashMap();
        HashMap term13174 = new HashMap();
        HashMap term13179 = new HashMap();
        term13140 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term13141 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term13142 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term13143 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term13140, term13140.getClass(), "compiler", null);
        setField(term13141, term13141.getClass(), "compiler", null);
        setField(term13142, term13142.getClass(), "reporter", null);
        setField(term13142, term13142.getClass(), "nativeTypes", term13143);
        setField(term13142, term13142.getClass(), "namesToTypes", term13144);
        setField(term13142, term13142.getClass(), "namespaces", term13150);
        setField(term13142, term13142.getClass(), "nonNullableTypeNames", term13156);
        setField(term13142, term13142.getClass(), "forwardDeclaredTypes", term13162);
        setField(term13142, term13142.getClass(), "typesIndexedByProperty", term13168);
        setField(term13142, term13142.getClass(), "eachRefTypeIndexedByProperty", term13174);
        setField(term13142, term13142.getClass(), "greatestSubtypeByProperty", term13179);
        setField(term13142, term13142.getClass(), "interfaceToImplementors", null);
        setField(term13142, term13142.getClass(), "unresolvedNamedTypes", null);
        setField(term13142, term13142.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term13142, term13142.getClass(), "lastGeneration", false);
        setField(term13142, term13142.getClass(), "templateTypes", null);
        setBooleanField(term13142, term13142.getClass(), "tolerateUndefinedValues", false);
        setField(term13142, term13142.getClass(), "resolveMode", null);
        setField(term13141, term13141.getClass(), "typeRegistry", term13142);
        setField(term13141, term13141.getClass(), "allValueTypes", null);
        setBooleanField(term13141, term13141.getClass(), "shouldReport", false);
        setField(term13141, term13141.getClass(), "nullOrUndefined", null);
        setField(term13141, term13141.getClass(), "mismatches", null);
        setField(term13140, term13140.getClass(), "validator", term13141);
        setField(term13140, term13140.getClass(), "reverseInterpreter", null);
        setField(term13140, term13140.getClass(), "typeRegistry", null);
        setField(term13140, term13140.getClass(), "topScope", null);
        setField(term13140, term13140.getClass(), "scopeCreator", null);
        setField(term13140, term13140.getClass(), "reportMissingOverride", null);
        setField(term13140, term13140.getClass(), "reportUnknownTypes", null);
        setBooleanField(term13140, term13140.getClass(), "reportMissingProperties", false);
        setField(term13140, term13140.getClass(), "inferJSDocInfo", null);
        setIntField(term13140, term13140.getClass(), "typedCount", 0);
        setIntField(term13140, term13140.getClass(), "nullCount", 0);
        setIntField(term13140, term13140.getClass(), "unknownCount", 0);
        setBooleanField(term13140, term13140.getClass(), "inExterns", false);
        setIntField(term13140, term13140.getClass(), "noTypeCheckSection", 0);
        HashMap term25768 = new HashMap();
        HashMap term25770 = new HashMap();
        Set<Object> term25781 =  ((Map) term25770).keySet();
        HashSet term25769 = new HashSet((Collection<? extends Object>) term25781);
        HashMap term25772 = new HashMap();
        Set<Object> term25782 =  ((Map) term25772).keySet();
        HashSet term25771 = new HashSet((Collection<? extends Object>) term25782);
        HashMap term25774 = new HashMap();
        Set<Object> term25783 =  ((Map) term25774).keySet();
        HashSet term25773 = new HashSet((Collection<? extends Object>) term25783);
        HashMap term25775 = new HashMap();
        HashMap term25776 = new HashMap();
        HashMap term25777 = new HashMap();
        term25764 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term25765 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term25766 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term25767 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term25764, term25764.getClass(), "compiler", null);
        setField(term25765, term25765.getClass(), "compiler", null);
        setField(term25766, term25766.getClass(), "reporter", null);
        setField(term25766, term25766.getClass(), "nativeTypes", term25767);
        setField(term25766, term25766.getClass(), "namesToTypes", term25768);
        setField(term25766, term25766.getClass(), "namespaces", term25769);
        setField(term25766, term25766.getClass(), "nonNullableTypeNames", term25771);
        setField(term25766, term25766.getClass(), "forwardDeclaredTypes", term25773);
        setField(term25766, term25766.getClass(), "typesIndexedByProperty", term25775);
        setField(term25766, term25766.getClass(), "eachRefTypeIndexedByProperty", term25776);
        setField(term25766, term25766.getClass(), "greatestSubtypeByProperty", term25777);
        setField(term25766, term25766.getClass(), "interfaceToImplementors", null);
        setField(term25766, term25766.getClass(), "unresolvedNamedTypes", null);
        setField(term25766, term25766.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term25766, term25766.getClass(), "lastGeneration", false);
        setField(term25766, term25766.getClass(), "templateTypes", null);
        setBooleanField(term25766, term25766.getClass(), "tolerateUndefinedValues", false);
        setField(term25766, term25766.getClass(), "resolveMode", null);
        setField(term25765, term25765.getClass(), "typeRegistry", term25766);
        setField(term25765, term25765.getClass(), "allValueTypes", null);
        setBooleanField(term25765, term25765.getClass(), "shouldReport", false);
        setField(term25765, term25765.getClass(), "nullOrUndefined", null);
        setField(term25765, term25765.getClass(), "mismatches", null);
        setField(term25764, term25764.getClass(), "validator", term25765);
        setField(term25764, term25764.getClass(), "reverseInterpreter", null);
        setField(term25764, term25764.getClass(), "typeRegistry", null);
        setField(term25764, term25764.getClass(), "topScope", null);
        setField(term25764, term25764.getClass(), "scopeCreator", null);
        setField(term25764, term25764.getClass(), "reportMissingOverride", null);
        setField(term25764, term25764.getClass(), "reportUnknownTypes", null);
        setBooleanField(term25764, term25764.getClass(), "reportMissingProperties", false);
        setField(term25764, term25764.getClass(), "inferJSDocInfo", null);
        setIntField(term25764, term25764.getClass(), "typedCount", 0);
        setIntField(term25764, term25764.getClass(), "nullCount", 0);
        setIntField(term25764, term25764.getClass(), "unknownCount", 0);
        setBooleanField(term25764, term25764.getClass(), "inExterns", false);
        setIntField(term25764, term25764.getClass(), "noTypeCheckSection", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getTypedPercent", argTypes, term13140, args);
        assertTrue(recursiveEquals(term13140, term25764));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


