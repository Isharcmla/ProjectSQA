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

public class TypeInference_traverseGetProp_22055906774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4003;
     Object term4057;

    public TypeInference_traverseGetProp_22055906774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4006 = new HashMap();
        HashMap term4015 = new HashMap();
        Set<Object> term19936 =  ((Map) term4015).keySet();
        HashSet term4014 = new HashSet((Collection<? extends Object>) term19936);
        HashMap term4021 = new HashMap();
        Set<Object> term19937 =  ((Map) term4021).keySet();
        HashSet term4020 = new HashSet((Collection<? extends Object>) term19937);
        HashMap term4028 = new HashMap();
        Set<Object> term19938 =  ((Map) term4028).keySet();
        HashSet term4027 = new HashSet((Collection<? extends Object>) term19938);
        HashMap term4034 = new HashMap();
        HashMap term4042 = new HashMap();
        HashMap term4047 = new HashMap();
        term4003 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term4004 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term4005 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term4003, term4003.getClass(), "compiler", null);
        setField(term4004, term4004.getClass(), "reporter", null);
        setField(term4004, term4004.getClass(), "nativeTypes", term4005);
        setField(term4004, term4004.getClass(), "namesToTypes", term4006);
        setField(term4004, term4004.getClass(), "namespaces", term4014);
        setField(term4004, term4004.getClass(), "nonNullableTypeNames", term4020);
        setField(term4004, term4004.getClass(), "forwardDeclaredTypes", term4027);
        setField(term4004, term4004.getClass(), "typesIndexedByProperty", term4034);
        setField(term4004, term4004.getClass(), "eachRefTypeIndexedByProperty", term4042);
        setField(term4004, term4004.getClass(), "greatestSubtypeByProperty", term4047);
        setField(term4004, term4004.getClass(), "interfaceToImplementors", null);
        setField(term4004, term4004.getClass(), "unresolvedNamedTypes", null);
        setField(term4004, term4004.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4004, term4004.getClass(), "lastGeneration", false);
        setField(term4004, term4004.getClass(), "templateTypeName", null);
        setField(term4004, term4004.getClass(), "templateType", null);
        setBooleanField(term4004, term4004.getClass(), "tolerateUndefinedValues", false);
        setField(term4004, term4004.getClass(), "resolveMode", null);
        setField(term4003, term4003.getClass(), "registry", term4004);
        setField(term4003, term4003.getClass(), "reverseInterpreter", null);
        setField(term4003, term4003.getClass(), "syntacticScope", null);
        setField(term4003, term4003.getClass(), "functionScope", null);
        setField(term4003, term4003.getClass(), "bottomScope", null);
        setField(term4003, term4003.getClass(), "assertionFunctionsMap", null);
        setField(term4003, term4003.getClass(), "cfg", null);
        setField(term4003, term4003.getClass(), "joinOp", null);
        setField(term4003, term4003.getClass(), "orderedWorkSet", null);
        term4057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4057, term4057.getClass(), "type", 489201218);
        setIntField(term4059, term4059.getClass(), "type", 464181937);
        setIntField(term4061, term4061.getClass(), "type", -1455526612);
        setIntField(term4063, term4063.getClass(), "type", -941356098);
        setIntField(term4065, term4065.getClass(), "type", -201517446);
        setField(term4065, term4065.getClass(), "next", null);
        setField(term4065, term4065.getClass(), "first", null);
        setField(term4065, term4065.getClass(), "last", null);
        setField(term4065, term4065.getClass(), "propListHead", null);
        setIntField(term4065, term4065.getClass(), "sourcePosition", 0);
        setField(term4065, term4065.getClass(), "jsType", null);
        setField(term4065, term4065.getClass(), "parent", null);
        setField(term4063, term4063.getClass(), "next", term4065);
        setIntField(term4068, term4068.getClass(), "type", -97742366);
        setField(term4068, term4068.getClass(), "next", null);
        setField(term4068, term4068.getClass(), "first", null);
        setField(term4068, term4068.getClass(), "last", term4065);
        setField(term4068, term4068.getClass(), "propListHead", null);
        setIntField(term4068, term4068.getClass(), "sourcePosition", 0);
        setField(term4068, term4068.getClass(), "jsType", null);
        setField(term4068, term4068.getClass(), "parent", null);
        setField(term4063, term4063.getClass(), "first", term4068);
        setField(term4063, term4063.getClass(), "last", term4061);
        setField(term4063, term4063.getClass(), "propListHead", null);
        setIntField(term4063, term4063.getClass(), "sourcePosition", 0);
        setField(term4063, term4063.getClass(), "jsType", null);
        setField(term4063, term4063.getClass(), "parent", null);
        setField(term4061, term4061.getClass(), "next", term4063);
        setField(term4061, term4061.getClass(), "first", term4065);
        setIntField(term4072, term4072.getClass(), "type", 1374790203);
        setIntField(term4074, term4074.getClass(), "type", 1160010161);
        setField(term4074, term4074.getClass(), "next", null);
        setField(term4074, term4074.getClass(), "first", term4068);
        setField(term4074, term4074.getClass(), "last", term4063);
        setField(term4074, term4074.getClass(), "propListHead", null);
        setIntField(term4074, term4074.getClass(), "sourcePosition", 0);
        setField(term4074, term4074.getClass(), "jsType", null);
        setField(term4074, term4074.getClass(), "parent", null);
        setField(term4072, term4072.getClass(), "next", term4074);
        setField(term4072, term4072.getClass(), "first", term4059);
        setField(term4072, term4072.getClass(), "last", term4059);
        setField(term4072, term4072.getClass(), "propListHead", null);
        setIntField(term4072, term4072.getClass(), "sourcePosition", 0);
        setField(term4072, term4072.getClass(), "jsType", null);
        setField(term4072, term4072.getClass(), "parent", null);
        setField(term4061, term4061.getClass(), "last", term4072);
        setField(term4061, term4061.getClass(), "propListHead", null);
        setIntField(term4061, term4061.getClass(), "sourcePosition", 0);
        setField(term4061, term4061.getClass(), "jsType", null);
        setField(term4061, term4061.getClass(), "parent", null);
        setField(term4059, term4059.getClass(), "next", term4061);
        setIntField(term4079, term4079.getClass(), "type", -423900705);
        setField(term4079, term4079.getClass(), "next", term4072);
        setField(term4079, term4079.getClass(), "first", term4074);
        setField(term4079, term4079.getClass(), "last", term4057);
        setField(term4079, term4079.getClass(), "propListHead", null);
        setIntField(term4079, term4079.getClass(), "sourcePosition", 0);
        setField(term4079, term4079.getClass(), "jsType", null);
        setField(term4079, term4079.getClass(), "parent", null);
        setField(term4059, term4059.getClass(), "first", term4079);
        setField(term4059, term4059.getClass(), "last", term4079);
        setField(term4059, term4059.getClass(), "propListHead", null);
        setIntField(term4059, term4059.getClass(), "sourcePosition", 0);
        setField(term4059, term4059.getClass(), "jsType", null);
        setField(term4059, term4059.getClass(), "parent", null);
        setField(term4057, term4057.getClass(), "next", term4059);
        setField(term4057, term4057.getClass(), "first", term4063);
        setField(term4057, term4057.getClass(), "last", term4065);
        setField(term4057, term4057.getClass(), "propListHead", null);
        setIntField(term4057, term4057.getClass(), "sourcePosition", 0);
        setField(term4057, term4057.getClass(), "jsType", null);
        setField(term4057, term4057.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term4057;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term4003, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


