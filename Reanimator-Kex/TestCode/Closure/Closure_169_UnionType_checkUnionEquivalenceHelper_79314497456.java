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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Boolean;

public class UnionType_checkUnionEquivalenceHelper_79314497456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1060;
     Object term1122;
     Object term1184;

    public UnionType_checkUnionEquivalenceHelper_79314497456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1061 = new ArrayList();
        ((ArrayList) term1061).add((Object)null);
        ((ArrayList) term1061).add((Object)null);
        ((ArrayList) term1061).add((Object)null);
        ((ArrayList) term1061).add((Object)null);
        ((ArrayList) term1061).add((Object)null);
        ((ArrayList) term1061).add((Object)null);
        ((ArrayList) term1061).add((Object)null);
        HashMap term1070 = new HashMap();
        HashMap term1079 = new HashMap();
        Set<Object> term7070 =  ((Map) term1079).keySet();
        HashSet term1078 = new HashSet((Collection<? extends Object>) term7070);
        HashMap term1086 = new HashMap();
        Set<Object> term7071 =  ((Map) term1086).keySet();
        HashSet term1085 = new HashSet((Collection<? extends Object>) term7071);
        HashMap term1093 = new HashMap();
        Set<Object> term7072 =  ((Map) term1093).keySet();
        HashSet term1092 = new HashSet((Collection<? extends Object>) term7072);
        HashMap term1099 = new HashMap();
        HashMap term1107 = new HashMap();
        HashMap term1112 = new HashMap();
        term1060 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term1068 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1069 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        setField(term1060, term1060.getClass(), "alternates", term1061);
        setIntField(term1060, term1060.getClass(), "hashcode", 683666002);
        setBooleanField(term1060, term1060.getClass(), "resolved", false);
        setField(term1060, term1060.getClass(), "resolveResult", null);
        setBooleanField(term1060, term1060.getClass(), "inTemplatedCheckVisit", true);
        setField(term1068, term1068.getClass(), "reporter", null);
        setField(term1068, term1068.getClass(), "nativeTypes", term1069);
        setField(term1068, term1068.getClass(), "namesToTypes", term1070);
        setField(term1068, term1068.getClass(), "namespaces", term1078);
        setField(term1068, term1068.getClass(), "nonNullableTypeNames", term1085);
        setField(term1068, term1068.getClass(), "forwardDeclaredTypes", term1092);
        setField(term1068, term1068.getClass(), "typesIndexedByProperty", term1099);
        setField(term1068, term1068.getClass(), "eachRefTypeIndexedByProperty", term1107);
        setField(term1068, term1068.getClass(), "greatestSubtypeByProperty", term1112);
        setField(term1068, term1068.getClass(), "interfaceToImplementors", null);
        setField(term1068, term1068.getClass(), "unresolvedNamedTypes", null);
        setField(term1068, term1068.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1068, term1068.getClass(), "lastGeneration", false);
        setField(term1068, term1068.getClass(), "templateTypes", null);
        setBooleanField(term1068, term1068.getClass(), "tolerateUndefinedValues", false);
        setField(term1068, term1068.getClass(), "resolveMode", null);
        setField(term1060, term1060.getClass(), "registry", term1068);
        ArrayList term1123 = new ArrayList();
        ((ArrayList) term1123).add((Object)null);
        ((ArrayList) term1123).add((Object)null);
        ((ArrayList) term1123).add((Object)null);
        ((ArrayList) term1123).add((Object)null);
        ((ArrayList) term1123).add((Object)null);
        HashMap term1132 = new HashMap();
        HashMap term1141 = new HashMap();
        Set<Object> term7073 =  ((Map) term1141).keySet();
        HashSet term1140 = new HashSet((Collection<? extends Object>) term7073);
        HashMap term1148 = new HashMap();
        Set<Object> term7074 =  ((Map) term1148).keySet();
        HashSet term1147 = new HashSet((Collection<? extends Object>) term7074);
        HashMap term1155 = new HashMap();
        Set<Object> term7075 =  ((Map) term1155).keySet();
        HashSet term1154 = new HashSet((Collection<? extends Object>) term7075);
        HashMap term1161 = new HashMap();
        HashMap term1169 = new HashMap();
        HashMap term1174 = new HashMap();
        term1122 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term1130 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1131 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term1122, term1122.getClass(), "alternates", term1123);
        setIntField(term1122, term1122.getClass(), "hashcode", -615654495);
        setBooleanField(term1122, term1122.getClass(), "resolved", true);
        setField(term1122, term1122.getClass(), "resolveResult", null);
        setBooleanField(term1122, term1122.getClass(), "inTemplatedCheckVisit", false);
        setField(term1130, term1130.getClass(), "reporter", null);
        setField(term1130, term1130.getClass(), "nativeTypes", term1131);
        setField(term1130, term1130.getClass(), "namesToTypes", term1132);
        setField(term1130, term1130.getClass(), "namespaces", term1140);
        setField(term1130, term1130.getClass(), "nonNullableTypeNames", term1147);
        setField(term1130, term1130.getClass(), "forwardDeclaredTypes", term1154);
        setField(term1130, term1130.getClass(), "typesIndexedByProperty", term1161);
        setField(term1130, term1130.getClass(), "eachRefTypeIndexedByProperty", term1169);
        setField(term1130, term1130.getClass(), "greatestSubtypeByProperty", term1174);
        setField(term1130, term1130.getClass(), "interfaceToImplementors", null);
        setField(term1130, term1130.getClass(), "unresolvedNamedTypes", null);
        setField(term1130, term1130.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1130, term1130.getClass(), "lastGeneration", false);
        setField(term1130, term1130.getClass(), "templateTypes", null);
        setBooleanField(term1130, term1130.getClass(), "tolerateUndefinedValues", false);
        setField(term1130, term1130.getClass(), "resolveMode", null);
        setField(term1122, term1122.getClass(), "registry", term1130);
        term1184 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1122;
        args[1] = term1184;
        try {
            callMethod(klass, "checkUnionEquivalenceHelper", argTypes, term1060, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


