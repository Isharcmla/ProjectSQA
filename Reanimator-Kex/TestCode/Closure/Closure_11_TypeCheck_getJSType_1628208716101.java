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

public class TypeCheck_getJSType_1628208716101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10764;
     Object term10818;

    public TypeCheck_getJSType_1628208716101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10768 = new HashMap();
        HashMap term10775 = new HashMap();
        Set<Object> term24495 =  ((Map) term10775).keySet();
        HashSet term10774 = new HashSet((Collection<? extends Object>) term24495);
        HashMap term10781 = new HashMap();
        Set<Object> term24496 =  ((Map) term10781).keySet();
        HashSet term10780 = new HashSet((Collection<? extends Object>) term24496);
        HashMap term10787 = new HashMap();
        Set<Object> term24497 =  ((Map) term10787).keySet();
        HashSet term10786 = new HashSet((Collection<? extends Object>) term24497);
        HashMap term10792 = new HashMap();
        HashMap term10798 = new HashMap();
        HashMap term10803 = new HashMap();
        term10764 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term10765 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term10766 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term10767 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        setField(term10764, term10764.getClass(), "compiler", null);
        setField(term10765, term10765.getClass(), "compiler", null);
        setField(term10766, term10766.getClass(), "reporter", null);
        setField(term10766, term10766.getClass(), "nativeTypes", term10767);
        setField(term10766, term10766.getClass(), "namesToTypes", term10768);
        setField(term10766, term10766.getClass(), "namespaces", term10774);
        setField(term10766, term10766.getClass(), "nonNullableTypeNames", term10780);
        setField(term10766, term10766.getClass(), "forwardDeclaredTypes", term10786);
        setField(term10766, term10766.getClass(), "typesIndexedByProperty", term10792);
        setField(term10766, term10766.getClass(), "eachRefTypeIndexedByProperty", term10798);
        setField(term10766, term10766.getClass(), "greatestSubtypeByProperty", term10803);
        setField(term10766, term10766.getClass(), "interfaceToImplementors", null);
        setField(term10766, term10766.getClass(), "unresolvedNamedTypes", null);
        setField(term10766, term10766.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term10766, term10766.getClass(), "lastGeneration", false);
        setField(term10766, term10766.getClass(), "templateTypes", null);
        setBooleanField(term10766, term10766.getClass(), "tolerateUndefinedValues", false);
        setField(term10766, term10766.getClass(), "resolveMode", null);
        setField(term10765, term10765.getClass(), "typeRegistry", term10766);
        setField(term10765, term10765.getClass(), "allValueTypes", null);
        setBooleanField(term10765, term10765.getClass(), "shouldReport", false);
        setField(term10765, term10765.getClass(), "nullOrUndefined", null);
        setField(term10765, term10765.getClass(), "mismatches", null);
        setField(term10764, term10764.getClass(), "validator", term10765);
        setField(term10764, term10764.getClass(), "reverseInterpreter", null);
        setField(term10764, term10764.getClass(), "typeRegistry", null);
        setField(term10764, term10764.getClass(), "topScope", null);
        setField(term10764, term10764.getClass(), "scopeCreator", null);
        setField(term10764, term10764.getClass(), "reportMissingOverride", null);
        setField(term10764, term10764.getClass(), "reportUnknownTypes", null);
        setBooleanField(term10764, term10764.getClass(), "reportMissingProperties", false);
        setField(term10764, term10764.getClass(), "inferJSDocInfo", null);
        setIntField(term10764, term10764.getClass(), "typedCount", 0);
        setIntField(term10764, term10764.getClass(), "nullCount", 0);
        setIntField(term10764, term10764.getClass(), "unknownCount", 0);
        setBooleanField(term10764, term10764.getClass(), "inExterns", false);
        setIntField(term10764, term10764.getClass(), "noTypeCheckSection", 0);
        term10818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10818, term10818.getClass(), "type", 532666604);
        setIntField(term10820, term10820.getClass(), "type", -13725716);
        setIntField(term10822, term10822.getClass(), "type", -1695750603);
        setIntField(term10824, term10824.getClass(), "type", 63677360);
        setIntField(term10826, term10826.getClass(), "type", 1478914037);
        setField(term10826, term10826.getClass(), "next", null);
        setField(term10826, term10826.getClass(), "first", null);
        setField(term10826, term10826.getClass(), "last", null);
        setField(term10826, term10826.getClass(), "propListHead", null);
        setIntField(term10826, term10826.getClass(), "sourcePosition", 0);
        setField(term10826, term10826.getClass(), "jsType", null);
        setField(term10826, term10826.getClass(), "parent", null);
        setField(term10824, term10824.getClass(), "next", term10826);
        setIntField(term10829, term10829.getClass(), "type", 1630231519);
        setField(term10829, term10829.getClass(), "next", null);
        setField(term10829, term10829.getClass(), "first", null);
        setField(term10829, term10829.getClass(), "last", term10826);
        setField(term10829, term10829.getClass(), "propListHead", null);
        setIntField(term10829, term10829.getClass(), "sourcePosition", 0);
        setField(term10829, term10829.getClass(), "jsType", null);
        setField(term10829, term10829.getClass(), "parent", null);
        setField(term10824, term10824.getClass(), "first", term10829);
        setField(term10824, term10824.getClass(), "last", term10822);
        setField(term10824, term10824.getClass(), "propListHead", null);
        setIntField(term10824, term10824.getClass(), "sourcePosition", 0);
        setField(term10824, term10824.getClass(), "jsType", null);
        setField(term10824, term10824.getClass(), "parent", null);
        setField(term10822, term10822.getClass(), "next", term10824);
        setField(term10822, term10822.getClass(), "first", term10826);
        setIntField(term10833, term10833.getClass(), "type", -1398142433);
        setIntField(term10835, term10835.getClass(), "type", -1112119058);
        setField(term10835, term10835.getClass(), "next", null);
        setField(term10835, term10835.getClass(), "first", term10829);
        setField(term10835, term10835.getClass(), "last", term10824);
        setField(term10835, term10835.getClass(), "propListHead", null);
        setIntField(term10835, term10835.getClass(), "sourcePosition", 0);
        setField(term10835, term10835.getClass(), "jsType", null);
        setField(term10835, term10835.getClass(), "parent", null);
        setField(term10833, term10833.getClass(), "next", term10835);
        setField(term10833, term10833.getClass(), "first", term10820);
        setField(term10833, term10833.getClass(), "last", term10820);
        setField(term10833, term10833.getClass(), "propListHead", null);
        setIntField(term10833, term10833.getClass(), "sourcePosition", 0);
        setField(term10833, term10833.getClass(), "jsType", null);
        setField(term10833, term10833.getClass(), "parent", null);
        setField(term10822, term10822.getClass(), "last", term10833);
        setField(term10822, term10822.getClass(), "propListHead", null);
        setIntField(term10822, term10822.getClass(), "sourcePosition", 0);
        setField(term10822, term10822.getClass(), "jsType", null);
        setField(term10822, term10822.getClass(), "parent", null);
        setField(term10820, term10820.getClass(), "next", term10822);
        setIntField(term10840, term10840.getClass(), "type", 2073858334);
        setField(term10840, term10840.getClass(), "next", term10833);
        setField(term10840, term10840.getClass(), "first", term10835);
        setField(term10840, term10840.getClass(), "last", term10818);
        setField(term10840, term10840.getClass(), "propListHead", null);
        setIntField(term10840, term10840.getClass(), "sourcePosition", 0);
        setField(term10840, term10840.getClass(), "jsType", null);
        setField(term10840, term10840.getClass(), "parent", null);
        setField(term10820, term10820.getClass(), "first", term10840);
        setField(term10820, term10820.getClass(), "last", term10840);
        setField(term10820, term10820.getClass(), "propListHead", null);
        setIntField(term10820, term10820.getClass(), "sourcePosition", 0);
        setField(term10820, term10820.getClass(), "jsType", null);
        setField(term10820, term10820.getClass(), "parent", null);
        setField(term10818, term10818.getClass(), "next", term10820);
        setField(term10818, term10818.getClass(), "first", term10824);
        setField(term10818, term10818.getClass(), "last", term10826);
        setField(term10818, term10818.getClass(), "propListHead", null);
        setIntField(term10818, term10818.getClass(), "sourcePosition", 0);
        setField(term10818, term10818.getClass(), "jsType", null);
        setField(term10818, term10818.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term10818;
        try {
            callMethod(klass, "getJSType", argTypes, term10764, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


