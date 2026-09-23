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
import java.util.ArrayDeque;

public class TypeValidator_mismatch_114507010758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4108;
     Object term4164;
     Object term4210;

    public TypeValidator_mismatch_114507010758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4111 = new HashMap();
        HashMap term4120 = new HashMap();
        Set<Object> term14024 =  ((Map) term4120).keySet();
        HashSet term4119 = new HashSet((Collection<? extends Object>) term14024);
        HashMap term4127 = new HashMap();
        Set<Object> term14025 =  ((Map) term4127).keySet();
        HashSet term4126 = new HashSet((Collection<? extends Object>) term14025);
        HashMap term4134 = new HashMap();
        Set<Object> term14026 =  ((Map) term4134).keySet();
        HashSet term4133 = new HashSet((Collection<? extends Object>) term14026);
        HashMap term4140 = new HashMap();
        HashMap term4148 = new HashMap();
        HashMap term4153 = new HashMap();
        term4108 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term4109 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term4110 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        setField(term4108, term4108.getClass(), "compiler", null);
        setField(term4109, term4109.getClass(), "reporter", null);
        setField(term4109, term4109.getClass(), "nativeTypes", term4110);
        setField(term4109, term4109.getClass(), "namesToTypes", term4111);
        setField(term4109, term4109.getClass(), "namespaces", term4119);
        setField(term4109, term4109.getClass(), "nonNullableTypeNames", term4126);
        setField(term4109, term4109.getClass(), "forwardDeclaredTypes", term4133);
        setField(term4109, term4109.getClass(), "typesIndexedByProperty", term4140);
        setField(term4109, term4109.getClass(), "eachRefTypeIndexedByProperty", term4148);
        setField(term4109, term4109.getClass(), "greatestSubtypeByProperty", term4153);
        setField(term4109, term4109.getClass(), "interfaceToImplementors", null);
        setField(term4109, term4109.getClass(), "unresolvedNamedTypes", null);
        setField(term4109, term4109.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4109, term4109.getClass(), "lastGeneration", false);
        setField(term4109, term4109.getClass(), "templateTypeName", null);
        setField(term4109, term4109.getClass(), "templateType", null);
        setBooleanField(term4109, term4109.getClass(), "tolerateUndefinedValues", false);
        setField(term4109, term4109.getClass(), "resolveMode", null);
        setField(term4108, term4108.getClass(), "typeRegistry", term4109);
        setField(term4108, term4108.getClass(), "allValueTypes", null);
        setBooleanField(term4108, term4108.getClass(), "shouldReport", false);
        setField(term4108, term4108.getClass(), "nullOrUndefined", null);
        setField(term4108, term4108.getClass(), "mismatches", null);
        ArrayDeque term4180 = new ArrayDeque();
        Object term4186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4186, term4186.getClass(), "type", 0);
        setField(term4186, term4186.getClass(), "next", null);
        setField(term4186, term4186.getClass(), "first", null);
        setField(term4186, term4186.getClass(), "last", null);
        setField(term4186, term4186.getClass(), "propListHead", null);
        setIntField(term4186, term4186.getClass(), "sourcePosition", 0);
        setField(term4186, term4186.getClass(), "jsType", null);
        setField(term4186, term4186.getClass(), "parent", null);
        Object term4189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4189, term4189.getClass(), "type", 0);
        setField(term4189, term4189.getClass(), "next", null);
        setField(term4189, term4189.getClass(), "first", null);
        setField(term4189, term4189.getClass(), "last", null);
        setField(term4189, term4189.getClass(), "propListHead", null);
        setIntField(term4189, term4189.getClass(), "sourcePosition", 0);
        setField(term4189, term4189.getClass(), "jsType", null);
        setField(term4189, term4189.getClass(), "parent", null);
        ArrayDeque term4184 = new ArrayDeque();
        ((ArrayDeque) term4184).add(term4186);
        ((ArrayDeque) term4184).add(term4189);
        ArrayDeque term4194 = new ArrayDeque();
        term4164 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term4165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4176 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term4164, term4164.getClass(), "compiler", null);
        setField(term4164, term4164.getClass(), "callback", null);
        setIntField(term4165, term4165.getClass(), "type", -1577069773);
        setIntField(term4167, term4167.getClass(), "type", 0);
        setField(term4167, term4167.getClass(), "next", null);
        setField(term4167, term4167.getClass(), "first", null);
        setField(term4167, term4167.getClass(), "last", null);
        setField(term4167, term4167.getClass(), "propListHead", null);
        setIntField(term4167, term4167.getClass(), "sourcePosition", 0);
        setField(term4167, term4167.getClass(), "jsType", null);
        setField(term4167, term4167.getClass(), "parent", null);
        setField(term4165, term4165.getClass(), "next", term4167);
        setIntField(term4170, term4170.getClass(), "type", 0);
        setField(term4170, term4170.getClass(), "next", null);
        setField(term4170, term4170.getClass(), "first", null);
        setField(term4170, term4170.getClass(), "last", null);
        setField(term4170, term4170.getClass(), "propListHead", null);
        setIntField(term4170, term4170.getClass(), "sourcePosition", 0);
        setField(term4170, term4170.getClass(), "jsType", null);
        setField(term4170, term4170.getClass(), "parent", null);
        setField(term4165, term4165.getClass(), "first", term4170);
        setIntField(term4173, term4173.getClass(), "type", 0);
        setField(term4173, term4173.getClass(), "next", null);
        setField(term4173, term4173.getClass(), "first", null);
        setField(term4173, term4173.getClass(), "last", null);
        setField(term4173, term4173.getClass(), "propListHead", null);
        setIntField(term4173, term4173.getClass(), "sourcePosition", 0);
        setField(term4173, term4173.getClass(), "jsType", null);
        setField(term4173, term4173.getClass(), "parent", null);
        setField(term4165, term4165.getClass(), "last", term4173);
        setField(term4176, term4176.getClass(), "next", null);
        setIntField(term4176, term4176.getClass(), "type", 0);
        setIntField(term4176, term4176.getClass(), "intValue", 0);
        setField(term4176, term4176.getClass(), "objectValue", null);
        setField(term4165, term4165.getClass(), "propListHead", term4176);
        setIntField(term4165, term4165.getClass(), "sourcePosition", -1455526612);
        setField(term4165, term4165.getClass(), "jsType", null);
        setField(term4165, term4165.getClass(), "parent", null);
        setField(term4164, term4164.getClass(), "curNode", term4165);
        setField(term4164, term4164.getClass(), "scopes", term4180);
        setField(term4164, term4164.getClass(), "scopeRoots", term4184);
        setField(term4164, term4164.getClass(), "cfgs", term4194);
        setField(term4164, term4164.getClass(), "sourceName", "uoBijJjvaj");
        setField(term4164, term4164.getClass(), "scopeCreator", null);
        setField(term4164, term4164.getClass(), "scopeCallback", null);
        term4210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4223 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4233 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4210, term4210.getClass(), "type", 1638851942);
        setIntField(term4212, term4212.getClass(), "type", -525570815);
        setIntField(term4214, term4214.getClass(), "type", 0);
        setField(term4214, term4214.getClass(), "next", null);
        setField(term4214, term4214.getClass(), "first", null);
        setField(term4214, term4214.getClass(), "last", null);
        setField(term4214, term4214.getClass(), "propListHead", null);
        setIntField(term4214, term4214.getClass(), "sourcePosition", 0);
        setField(term4214, term4214.getClass(), "jsType", null);
        setField(term4214, term4214.getClass(), "parent", null);
        setField(term4212, term4212.getClass(), "next", term4214);
        setIntField(term4217, term4217.getClass(), "type", 0);
        setField(term4217, term4217.getClass(), "next", null);
        setField(term4217, term4217.getClass(), "first", null);
        setField(term4217, term4217.getClass(), "last", null);
        setField(term4217, term4217.getClass(), "propListHead", null);
        setIntField(term4217, term4217.getClass(), "sourcePosition", 0);
        setField(term4217, term4217.getClass(), "jsType", null);
        setField(term4217, term4217.getClass(), "parent", null);
        setField(term4212, term4212.getClass(), "first", term4217);
        setIntField(term4220, term4220.getClass(), "type", 0);
        setField(term4220, term4220.getClass(), "next", null);
        setField(term4220, term4220.getClass(), "first", null);
        setField(term4220, term4220.getClass(), "last", null);
        setField(term4220, term4220.getClass(), "propListHead", null);
        setIntField(term4220, term4220.getClass(), "sourcePosition", 0);
        setField(term4220, term4220.getClass(), "jsType", null);
        setField(term4220, term4220.getClass(), "parent", null);
        setField(term4212, term4212.getClass(), "last", term4220);
        setField(term4223, term4223.getClass(), "next", null);
        setIntField(term4223, term4223.getClass(), "type", 0);
        setIntField(term4223, term4223.getClass(), "intValue", 0);
        setField(term4223, term4223.getClass(), "objectValue", null);
        setField(term4212, term4212.getClass(), "propListHead", term4223);
        setIntField(term4212, term4212.getClass(), "sourcePosition", -370828664);
        setField(term4212, term4212.getClass(), "jsType", null);
        setField(term4212, term4212.getClass(), "parent", null);
        setField(term4210, term4210.getClass(), "next", term4212);
        setIntField(term4227, term4227.getClass(), "type", 0);
        setField(term4227, term4227.getClass(), "next", null);
        setField(term4227, term4227.getClass(), "first", null);
        setField(term4227, term4227.getClass(), "last", null);
        setField(term4227, term4227.getClass(), "propListHead", null);
        setIntField(term4227, term4227.getClass(), "sourcePosition", 0);
        setField(term4227, term4227.getClass(), "jsType", null);
        setField(term4227, term4227.getClass(), "parent", null);
        setField(term4210, term4210.getClass(), "first", term4227);
        setIntField(term4230, term4230.getClass(), "type", 0);
        setField(term4230, term4230.getClass(), "next", null);
        setField(term4230, term4230.getClass(), "first", null);
        setField(term4230, term4230.getClass(), "last", null);
        setField(term4230, term4230.getClass(), "propListHead", null);
        setIntField(term4230, term4230.getClass(), "sourcePosition", 0);
        setField(term4230, term4230.getClass(), "jsType", null);
        setField(term4230, term4230.getClass(), "parent", null);
        setField(term4210, term4210.getClass(), "last", term4230);
        setField(term4233, term4233.getClass(), "next", null);
        setIntField(term4233, term4233.getClass(), "type", 0);
        setIntField(term4233, term4233.getClass(), "intValue", 0);
        setField(term4233, term4233.getClass(), "objectValue", null);
        setField(term4210, term4210.getClass(), "propListHead", term4233);
        setIntField(term4210, term4210.getClass(), "sourcePosition", 1168633950);
        setField(term4210, term4210.getClass(), "jsType", null);
        setField(term4210, term4210.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[5];
        args[0] = term4164;
        args[1] = term4210;
        args[2] = "BdsLFSRWda";
        args[3] = null;
        args[4] = null;
        try {
            callMethod(klass, "mismatch", argTypes, term4108, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


