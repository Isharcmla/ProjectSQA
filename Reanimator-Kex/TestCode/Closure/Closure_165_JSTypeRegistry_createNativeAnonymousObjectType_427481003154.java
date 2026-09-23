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

public class JSTypeRegistry_createNativeAnonymousObjectType_427481003154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12168;
     Object term506847;
     Object term506785;

    public JSTypeRegistry_createNativeAnonymousObjectType_427481003154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12170 = new HashMap();
        HashMap term12180 = new HashMap();
        Set<Object> term506859 =  ((Map) term12180).keySet();
        HashSet term12179 = new HashSet((Collection<? extends Object>) term506859);
        HashMap term12186 = new HashMap();
        Set<Object> term506860 =  ((Map) term12186).keySet();
        HashSet term12185 = new HashSet((Collection<? extends Object>) term506860);
        HashMap term12209 = new HashMap();
        Set<Object> term506861 =  ((Map) term12209).keySet();
        HashSet term12208 = new HashSet((Collection<? extends Object>) term506861);
        HashMap term12227 = new HashMap();
        HashMap term12242 = new HashMap();
        HashMap term12247 = new HashMap();
        term12168 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term12169 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term12168, term12168.getClass(), "reporter", null);
        setField(term12168, term12168.getClass(), "nativeTypes", term12169);
        setField(term12168, term12168.getClass(), "namesToTypes", term12170);
        setField(term12168, term12168.getClass(), "namespaces", term12179);
        setField(term12168, term12168.getClass(), "nonNullableTypeNames", term12185);
        setField(term12168, term12168.getClass(), "forwardDeclaredTypes", term12208);
        setField(term12168, term12168.getClass(), "typesIndexedByProperty", term12227);
        setField(term12168, term12168.getClass(), "eachRefTypeIndexedByProperty", term12242);
        setField(term12168, term12168.getClass(), "greatestSubtypeByProperty", term12247);
        setField(term12168, term12168.getClass(), "interfaceToImplementors", null);
        setField(term12168, term12168.getClass(), "unresolvedNamedTypes", null);
        setField(term12168, term12168.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term12168, term12168.getClass(), "lastGeneration", false);
        setField(term12168, term12168.getClass(), "templateTypeName", null);
        setField(term12168, term12168.getClass(), "templateType", null);
        setBooleanField(term12168, term12168.getClass(), "tolerateUndefinedValues", false);
        setField(term12168, term12168.getClass(), "resolveMode", null);
        HashMap term506849 = new HashMap();
        HashMap term506851 = new HashMap();
        Set<Object> term506862 =  ((Map) term506851).keySet();
        HashSet term506850 = new HashSet((Collection<? extends Object>) term506862);
        HashMap term506853 = new HashMap();
        Set<Object> term506863 =  ((Map) term506853).keySet();
        HashSet term506852 = new HashSet((Collection<? extends Object>) term506863);
        HashMap term506855 = new HashMap();
        Set<Object> term506864 =  ((Map) term506855).keySet();
        HashSet term506854 = new HashSet((Collection<? extends Object>) term506864);
        HashMap term506856 = new HashMap();
        HashMap term506857 = new HashMap();
        HashMap term506858 = new HashMap();
        term506847 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term506848 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term506847, term506847.getClass(), "reporter", null);
        setField(term506847, term506847.getClass(), "nativeTypes", term506848);
        setField(term506847, term506847.getClass(), "namesToTypes", term506849);
        setField(term506847, term506847.getClass(), "namespaces", term506850);
        setField(term506847, term506847.getClass(), "nonNullableTypeNames", term506852);
        setField(term506847, term506847.getClass(), "forwardDeclaredTypes", term506854);
        setField(term506847, term506847.getClass(), "typesIndexedByProperty", term506856);
        setField(term506847, term506847.getClass(), "eachRefTypeIndexedByProperty", term506857);
        setField(term506847, term506847.getClass(), "greatestSubtypeByProperty", term506858);
        setField(term506847, term506847.getClass(), "interfaceToImplementors", null);
        setField(term506847, term506847.getClass(), "unresolvedNamedTypes", null);
        setField(term506847, term506847.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term506847, term506847.getClass(), "lastGeneration", false);
        setField(term506847, term506847.getClass(), "templateTypeName", null);
        setField(term506847, term506847.getClass(), "templateType", null);
        setBooleanField(term506847, term506847.getClass(), "tolerateUndefinedValues", false);
        setField(term506847, term506847.getClass(), "resolveMode", null);
        HashMap term506796 = new HashMap();
        HashMap term506802 = new HashMap();
        Set<Object> term506865 =  ((Map) term506802).keySet();
        HashSet term506801 = new HashSet((Collection<? extends Object>) term506865);
        HashMap term506808 = new HashMap();
        Set<Object> term506866 =  ((Map) term506808).keySet();
        HashSet term506807 = new HashSet((Collection<? extends Object>) term506866);
        HashMap term506814 = new HashMap();
        Set<Object> term506867 =  ((Map) term506814).keySet();
        HashSet term506813 = new HashSet((Collection<? extends Object>) term506867);
        HashMap term506819 = new HashMap();
        HashMap term506824 = new HashMap();
        HashMap term506829 = new HashMap();
        term506785 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term506786 = newInstance(Class.forName("java.util.TreeMap"));
        Object term506794 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term506795 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term506785, term506785.getClass(), "className", null);
        setField(term506786, term506786.getClass(), "comparator", null);
        setField(term506786, term506786.getClass(), "root", null);
        setIntField(term506786, term506786.getClass(), "size", 0);
        setIntField(term506786, term506786.getClass(), "modCount", 0);
        setField(term506786, term506786.getClass(), "entrySet", null);
        setField(term506786, term506786.getClass(), "navigableKeySet", null);
        setField(term506786, term506786.getClass(), "descendingMap", null);
        setField(term506786, term506786.getClass(), "keySet", null);
        setField(term506786, term506786.getClass(), "values", null);
        setField(term506785, term506785.getClass(), "properties", term506786);
        setBooleanField(term506785, term506785.getClass(), "nativeType", true);
        setField(term506785, term506785.getClass(), "implicitPrototypeFallback", null);
        setField(term506785, term506785.getClass(), "ownerFunction", null);
        setBooleanField(term506785, term506785.getClass(), "prettyPrint", true);
        setBooleanField(term506785, term506785.getClass(), "visited", false);
        setField(term506785, term506785.getClass(), "docInfo", null);
        setBooleanField(term506785, term506785.getClass(), "unknown", true);
        setBooleanField(term506785, term506785.getClass(), "resolved", false);
        setField(term506785, term506785.getClass(), "resolveResult", null);
        setField(term506794, term506794.getClass(), "reporter", null);
        setField(term506794, term506794.getClass(), "nativeTypes", term506795);
        setField(term506794, term506794.getClass(), "namesToTypes", term506796);
        setField(term506794, term506794.getClass(), "namespaces", term506801);
        setField(term506794, term506794.getClass(), "nonNullableTypeNames", term506807);
        setField(term506794, term506794.getClass(), "forwardDeclaredTypes", term506813);
        setField(term506794, term506794.getClass(), "typesIndexedByProperty", term506819);
        setField(term506794, term506794.getClass(), "eachRefTypeIndexedByProperty", term506824);
        setField(term506794, term506794.getClass(), "greatestSubtypeByProperty", term506829);
        setField(term506794, term506794.getClass(), "interfaceToImplementors", null);
        setField(term506794, term506794.getClass(), "unresolvedNamedTypes", null);
        setField(term506794, term506794.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term506794, term506794.getClass(), "lastGeneration", false);
        setField(term506794, term506794.getClass(), "templateTypeName", null);
        setField(term506794, term506794.getClass(), "templateType", null);
        setBooleanField(term506794, term506794.getClass(), "tolerateUndefinedValues", false);
        setField(term506794, term506794.getClass(), "resolveMode", null);
        setField(term506785, term506785.getClass(), "registry", term506794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "createNativeAnonymousObjectType", argTypes, term12168, args);
        assertTrue(recursiveEquals(term12168, term506847));
        assertTrue(recursiveEquals(retValue, term506785));
    }

};


