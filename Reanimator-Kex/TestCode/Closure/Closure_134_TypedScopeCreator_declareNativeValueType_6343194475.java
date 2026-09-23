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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.lang.String;

public class TypedScopeCreator_declareNativeValueType_6343194475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1849;
     Object term1922;
     Object enum1;

    public TypedScopeCreator_declareNativeValueType_6343194475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1853 = new HashMap();
        HashMap term1860 = new HashMap();
        Set<Object> term1977 =  ((Map) term1860).keySet();
        HashSet term1859 = new HashSet((Collection<? extends Object>) term1977);
        HashMap term1866 = new HashMap();
        Set<Object> term1978 =  ((Map) term1866).keySet();
        HashSet term1865 = new HashSet((Collection<? extends Object>) term1978);
        HashMap term1872 = new HashMap();
        Set<Object> term1979 =  ((Map) term1872).keySet();
        HashSet term1871 = new HashSet((Collection<? extends Object>) term1979);
        HashMap term1877 = new HashMap();
        HashMap term1882 = new HashMap();
        Object term1907 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term1907, term1907.getClass(), "first", null);
        setField(term1907, term1907.getClass(), "second", null);
        Object term1908 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term1908, term1908.getClass(), "first", null);
        setField(term1908, term1908.getClass(), "second", null);
        Object term1909 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term1909, term1909.getClass(), "first", null);
        setField(term1909, term1909.getClass(), "second", null);
        Object term1910 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term1910, term1910.getClass(), "first", null);
        setField(term1910, term1910.getClass(), "second", null);
        Object term1911 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term1911, term1911.getClass(), "first", null);
        setField(term1911, term1911.getClass(), "second", null);
        Object term1912 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term1912, term1912.getClass(), "first", null);
        setField(term1912, term1912.getClass(), "second", null);
        ArrayList term1905 = new ArrayList();
        ((ArrayList) term1905).add(term1907);
        ((ArrayList) term1905).add(term1908);
        ((ArrayList) term1905).add(term1909);
        ((ArrayList) term1905).add(term1910);
        ((ArrayList) term1905).add(term1911);
        ((ArrayList) term1905).add(term1912);
        HashMap term1917 = new HashMap();
        term1849 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term1850 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term1851 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1852 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        Object term1901 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term1915 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1849, term1849.getClass(), "compiler", null);
        setField(term1850, term1850.getClass(), "compiler", null);
        setField(term1851, term1851.getClass(), "reporter", null);
        setField(term1851, term1851.getClass(), "nativeTypes", term1852);
        setField(term1851, term1851.getClass(), "namesToTypes", term1853);
        setField(term1851, term1851.getClass(), "namespaces", term1859);
        setField(term1851, term1851.getClass(), "enumTypeNames", term1865);
        setField(term1851, term1851.getClass(), "forwardDeclaredTypes", term1871);
        setField(term1851, term1851.getClass(), "typesIndexedByProperty", term1877);
        setField(term1851, term1851.getClass(), "greatestSubtypeByProperty", term1882);
        setField(term1851, term1851.getClass(), "interfaceToImplementors", null);
        setField(term1851, term1851.getClass(), "unresolvedNamedTypes", null);
        setField(term1851, term1851.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1851, term1851.getClass(), "lastGeneration", false);
        setField(term1851, term1851.getClass(), "templateTypeName", "kBdSllIBVz");
        setField(term1901, term1901.getClass(), "name", "");
        setField(term1901, term1901.getClass(), "referencedType", null);
        setBooleanField(term1901, term1901.getClass(), "visited", false);
        setField(term1901, term1901.getClass(), "docInfo", null);
        setBooleanField(term1901, term1901.getClass(), "unknown", false);
        setField(term1901, term1901.getClass(), "registry", null);
        setField(term1851, term1851.getClass(), "templateType", term1901);
        setField(term1850, term1850.getClass(), "typeRegistry", term1851);
        setField(term1850, term1850.getClass(), "allValueTypes", null);
        setField(term1850, term1850.getClass(), "mismatches", term1905);
        setField(term1849, term1849.getClass(), "validator", term1850);
        setField(term1849, term1849.getClass(), "codingConvention", null);
        setField(term1915, term1915.getClass(), "reporter", null);
        setField(term1915, term1915.getClass(), "nativeTypes", null);
        setField(term1915, term1915.getClass(), "namesToTypes", null);
        setField(term1915, term1915.getClass(), "namespaces", null);
        setField(term1915, term1915.getClass(), "enumTypeNames", null);
        setField(term1915, term1915.getClass(), "forwardDeclaredTypes", null);
        setField(term1915, term1915.getClass(), "typesIndexedByProperty", null);
        setField(term1915, term1915.getClass(), "greatestSubtypeByProperty", null);
        setField(term1915, term1915.getClass(), "interfaceToImplementors", null);
        setField(term1915, term1915.getClass(), "unresolvedNamedTypes", null);
        setField(term1915, term1915.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1915, term1915.getClass(), "lastGeneration", false);
        setField(term1915, term1915.getClass(), "templateTypeName", null);
        setField(term1915, term1915.getClass(), "templateType", null);
        setField(term1849, term1849.getClass(), "typeRegistry", term1915);
        setField(term1849, term1849.getClass(), "delegateProxyMap", term1917);
        HashMap term1923 = new HashMap();
        term1922 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1936 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1922, term1922.getClass(), "vars", term1923);
        setField(term1936, term1936.getClass(), "vars", null);
        setField(term1936, term1936.getClass(), "parent", null);
        setField(term1936, term1936.getClass(), "rootNode", null);
        setField(term1936, term1936.getClass(), "thisType", null);
        setBooleanField(term1936, term1936.getClass(), "isBottom", false);
        setField(term1922, term1922.getClass(), "parent", term1936);
        setIntField(term1938, term1938.getClass(), "type", 0);
        setField(term1938, term1938.getClass(), "next", null);
        setField(term1938, term1938.getClass(), "first", null);
        setField(term1938, term1938.getClass(), "last", null);
        setField(term1938, term1938.getClass(), "propListHead", null);
        setIntField(term1938, term1938.getClass(), "sourcePosition", 0);
        setField(term1938, term1938.getClass(), "jsType", null);
        setField(term1938, term1938.getClass(), "parent", null);
        setField(term1922, term1922.getClass(), "rootNode", term1938);
        setField(term1922, term1922.getClass(), "thisType", null);
        setBooleanField(term1922, term1922.getClass(), "isBottom", false);
        Class<? extends Object> term2001 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term2000 = ((Class) term2001).getDeclaredField((String) "ERROR_FUNCTION_TYPE");
        ((Field) term2000).setAccessible(true);
        enum1 = ((Field) term2000).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[3];
        args[0] = term1922;
        args[1] = "whBvTVIIlC";
        args[2] = enum1;
        callMethod(klass, "declareNativeValueType", argTypes, term1849, args);
    }

};


