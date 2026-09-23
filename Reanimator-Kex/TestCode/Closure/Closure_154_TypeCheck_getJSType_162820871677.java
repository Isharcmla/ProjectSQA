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

public class TypeCheck_getJSType_162820871677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8001;
     Object term8055;

    public TypeCheck_getJSType_162820871677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8005 = new HashMap();
        HashMap term8012 = new HashMap();
        Set<Object> term23227 =  ((Map) term8012).keySet();
        HashSet term8011 = new HashSet((Collection<? extends Object>) term23227);
        HashMap term8018 = new HashMap();
        Set<Object> term23228 =  ((Map) term8018).keySet();
        HashSet term8017 = new HashSet((Collection<? extends Object>) term23228);
        HashMap term8024 = new HashMap();
        Set<Object> term23229 =  ((Map) term8024).keySet();
        HashSet term8023 = new HashSet((Collection<? extends Object>) term23229);
        HashMap term8029 = new HashMap();
        HashMap term8035 = new HashMap();
        HashMap term8040 = new HashMap();
        term8001 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term8002 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term8003 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term8004 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term8001, term8001.getClass(), "compiler", null);
        setField(term8002, term8002.getClass(), "compiler", null);
        setField(term8003, term8003.getClass(), "reporter", null);
        setField(term8003, term8003.getClass(), "nativeTypes", term8004);
        setField(term8003, term8003.getClass(), "namesToTypes", term8005);
        setField(term8003, term8003.getClass(), "namespaces", term8011);
        setField(term8003, term8003.getClass(), "nonNullableTypeNames", term8017);
        setField(term8003, term8003.getClass(), "forwardDeclaredTypes", term8023);
        setField(term8003, term8003.getClass(), "typesIndexedByProperty", term8029);
        setField(term8003, term8003.getClass(), "eachRefTypeIndexedByProperty", term8035);
        setField(term8003, term8003.getClass(), "greatestSubtypeByProperty", term8040);
        setField(term8003, term8003.getClass(), "interfaceToImplementors", null);
        setField(term8003, term8003.getClass(), "unresolvedNamedTypes", null);
        setField(term8003, term8003.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term8003, term8003.getClass(), "lastGeneration", false);
        setField(term8003, term8003.getClass(), "templateTypeName", null);
        setField(term8003, term8003.getClass(), "templateType", null);
        setBooleanField(term8003, term8003.getClass(), "tolerateUndefinedValues", false);
        setField(term8003, term8003.getClass(), "resolveMode", null);
        setField(term8002, term8002.getClass(), "typeRegistry", term8003);
        setField(term8002, term8002.getClass(), "allValueTypes", null);
        setBooleanField(term8002, term8002.getClass(), "shouldReport", false);
        setField(term8002, term8002.getClass(), "nullOrUndefined", null);
        setField(term8002, term8002.getClass(), "mismatches", null);
        setField(term8001, term8001.getClass(), "validator", term8002);
        setField(term8001, term8001.getClass(), "reverseInterpreter", null);
        setField(term8001, term8001.getClass(), "typeRegistry", null);
        setField(term8001, term8001.getClass(), "topScope", null);
        setField(term8001, term8001.getClass(), "scopeCreator", null);
        setField(term8001, term8001.getClass(), "reportMissingOverride", null);
        setField(term8001, term8001.getClass(), "reportUnknownTypes", null);
        setBooleanField(term8001, term8001.getClass(), "reportMissingProperties", false);
        setField(term8001, term8001.getClass(), "inferJSDocInfo", null);
        setIntField(term8001, term8001.getClass(), "typedCount", 0);
        setIntField(term8001, term8001.getClass(), "nullCount", 0);
        setIntField(term8001, term8001.getClass(), "unknownCount", 0);
        setBooleanField(term8001, term8001.getClass(), "inExterns", false);
        setIntField(term8001, term8001.getClass(), "noTypeCheckSection", 0);
        term8055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8068 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8078 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term8055, term8055.getClass(), "type", -1630069454);
        setIntField(term8057, term8057.getClass(), "type", 1038029515);
        setIntField(term8059, term8059.getClass(), "type", 0);
        setField(term8059, term8059.getClass(), "next", null);
        setField(term8059, term8059.getClass(), "first", null);
        setField(term8059, term8059.getClass(), "last", null);
        setField(term8059, term8059.getClass(), "propListHead", null);
        setIntField(term8059, term8059.getClass(), "sourcePosition", 0);
        setField(term8059, term8059.getClass(), "jsType", null);
        setField(term8059, term8059.getClass(), "parent", null);
        setField(term8057, term8057.getClass(), "next", term8059);
        setIntField(term8062, term8062.getClass(), "type", 0);
        setField(term8062, term8062.getClass(), "next", null);
        setField(term8062, term8062.getClass(), "first", null);
        setField(term8062, term8062.getClass(), "last", null);
        setField(term8062, term8062.getClass(), "propListHead", null);
        setIntField(term8062, term8062.getClass(), "sourcePosition", 0);
        setField(term8062, term8062.getClass(), "jsType", null);
        setField(term8062, term8062.getClass(), "parent", null);
        setField(term8057, term8057.getClass(), "first", term8062);
        setIntField(term8065, term8065.getClass(), "type", 0);
        setField(term8065, term8065.getClass(), "next", null);
        setField(term8065, term8065.getClass(), "first", null);
        setField(term8065, term8065.getClass(), "last", null);
        setField(term8065, term8065.getClass(), "propListHead", null);
        setIntField(term8065, term8065.getClass(), "sourcePosition", 0);
        setField(term8065, term8065.getClass(), "jsType", null);
        setField(term8065, term8065.getClass(), "parent", null);
        setField(term8057, term8057.getClass(), "last", term8065);
        setField(term8068, term8068.getClass(), "next", null);
        setIntField(term8068, term8068.getClass(), "type", 0);
        setIntField(term8068, term8068.getClass(), "intValue", 0);
        setField(term8068, term8068.getClass(), "objectValue", null);
        setField(term8057, term8057.getClass(), "propListHead", term8068);
        setIntField(term8057, term8057.getClass(), "sourcePosition", 296568835);
        setField(term8057, term8057.getClass(), "jsType", null);
        setField(term8057, term8057.getClass(), "parent", null);
        setField(term8055, term8055.getClass(), "next", term8057);
        setIntField(term8072, term8072.getClass(), "type", 0);
        setField(term8072, term8072.getClass(), "next", null);
        setField(term8072, term8072.getClass(), "first", null);
        setField(term8072, term8072.getClass(), "last", null);
        setField(term8072, term8072.getClass(), "propListHead", null);
        setIntField(term8072, term8072.getClass(), "sourcePosition", 0);
        setField(term8072, term8072.getClass(), "jsType", null);
        setField(term8072, term8072.getClass(), "parent", null);
        setField(term8055, term8055.getClass(), "first", term8072);
        setIntField(term8075, term8075.getClass(), "type", 0);
        setField(term8075, term8075.getClass(), "next", null);
        setField(term8075, term8075.getClass(), "first", null);
        setField(term8075, term8075.getClass(), "last", null);
        setField(term8075, term8075.getClass(), "propListHead", null);
        setIntField(term8075, term8075.getClass(), "sourcePosition", 0);
        setField(term8075, term8075.getClass(), "jsType", null);
        setField(term8075, term8075.getClass(), "parent", null);
        setField(term8055, term8055.getClass(), "last", term8075);
        setField(term8078, term8078.getClass(), "next", null);
        setIntField(term8078, term8078.getClass(), "type", 0);
        setIntField(term8078, term8078.getClass(), "intValue", 0);
        setField(term8078, term8078.getClass(), "objectValue", null);
        setField(term8055, term8055.getClass(), "propListHead", term8078);
        setIntField(term8055, term8055.getClass(), "sourcePosition", 1431951992);
        setField(term8055, term8055.getClass(), "jsType", null);
        setField(term8055, term8055.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term8055;
        try {
            callMethod(klass, "getJSType", argTypes, term8001, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


