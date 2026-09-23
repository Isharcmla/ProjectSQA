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

public class TypeInference_ensurePropertyDeclaredHelper_52558755156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1085;
     Object term1140;

    public TypeInference_ensurePropertyDeclaredHelper_52558755156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1088 = new HashMap();
        HashMap term1097 = new HashMap();
        Set<Object> term11419 =  ((Map) term1097).keySet();
        HashSet term1096 = new HashSet((Collection<? extends Object>) term11419);
        HashMap term1104 = new HashMap();
        Set<Object> term11420 =  ((Map) term1104).keySet();
        HashSet term1103 = new HashSet((Collection<? extends Object>) term11420);
        HashMap term1111 = new HashMap();
        Set<Object> term11421 =  ((Map) term1111).keySet();
        HashSet term1110 = new HashSet((Collection<? extends Object>) term11421);
        HashMap term1117 = new HashMap();
        HashMap term1125 = new HashMap();
        HashMap term1130 = new HashMap();
        term1085 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term1086 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1087 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term1085, term1085.getClass(), "compiler", null);
        setField(term1086, term1086.getClass(), "reporter", null);
        setField(term1086, term1086.getClass(), "nativeTypes", term1087);
        setField(term1086, term1086.getClass(), "namesToTypes", term1088);
        setField(term1086, term1086.getClass(), "namespaces", term1096);
        setField(term1086, term1086.getClass(), "nonNullableTypeNames", term1103);
        setField(term1086, term1086.getClass(), "forwardDeclaredTypes", term1110);
        setField(term1086, term1086.getClass(), "typesIndexedByProperty", term1117);
        setField(term1086, term1086.getClass(), "eachRefTypeIndexedByProperty", term1125);
        setField(term1086, term1086.getClass(), "greatestSubtypeByProperty", term1130);
        setField(term1086, term1086.getClass(), "interfaceToImplementors", null);
        setField(term1086, term1086.getClass(), "unresolvedNamedTypes", null);
        setField(term1086, term1086.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1086, term1086.getClass(), "lastGeneration", false);
        setField(term1086, term1086.getClass(), "templateTypeName", null);
        setField(term1086, term1086.getClass(), "templateType", null);
        setBooleanField(term1086, term1086.getClass(), "tolerateUndefinedValues", false);
        setField(term1086, term1086.getClass(), "resolveMode", null);
        setField(term1085, term1085.getClass(), "registry", term1086);
        setField(term1085, term1085.getClass(), "reverseInterpreter", null);
        setField(term1085, term1085.getClass(), "syntacticScope", null);
        setField(term1085, term1085.getClass(), "functionScope", null);
        setField(term1085, term1085.getClass(), "bottomScope", null);
        setField(term1085, term1085.getClass(), "assertionFunctionsMap", null);
        setField(term1085, term1085.getClass(), "cfg", null);
        setField(term1085, term1085.getClass(), "joinOp", null);
        setField(term1085, term1085.getClass(), "orderedWorkSet", null);
        term1140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1140, term1140.getClass(), "type", -523949691);
        setIntField(term1142, term1142.getClass(), "type", 1398204340);
        setIntField(term1144, term1144.getClass(), "type", 229204365);
        setIntField(term1146, term1146.getClass(), "type", -461771056);
        setIntField(term1148, term1148.getClass(), "type", -243422082);
        setField(term1148, term1148.getClass(), "next", null);
        setField(term1148, term1148.getClass(), "first", null);
        setField(term1148, term1148.getClass(), "last", null);
        setField(term1148, term1148.getClass(), "propListHead", null);
        setIntField(term1148, term1148.getClass(), "sourcePosition", 0);
        setField(term1148, term1148.getClass(), "jsType", null);
        setField(term1148, term1148.getClass(), "parent", null);
        setField(term1146, term1146.getClass(), "next", term1148);
        setIntField(term1151, term1151.getClass(), "type", 1384592638);
        setField(term1151, term1151.getClass(), "next", null);
        setField(term1151, term1151.getClass(), "first", null);
        setField(term1151, term1151.getClass(), "last", term1148);
        setField(term1151, term1151.getClass(), "propListHead", null);
        setIntField(term1151, term1151.getClass(), "sourcePosition", 0);
        setField(term1151, term1151.getClass(), "jsType", null);
        setField(term1151, term1151.getClass(), "parent", null);
        setField(term1146, term1146.getClass(), "first", term1151);
        setField(term1146, term1146.getClass(), "last", term1144);
        setField(term1146, term1146.getClass(), "propListHead", null);
        setIntField(term1146, term1146.getClass(), "sourcePosition", 0);
        setField(term1146, term1146.getClass(), "jsType", null);
        setField(term1146, term1146.getClass(), "parent", null);
        setField(term1144, term1144.getClass(), "next", term1146);
        setField(term1144, term1144.getClass(), "first", term1148);
        setIntField(term1155, term1155.getClass(), "type", -2014576105);
        setIntField(term1157, term1157.getClass(), "type", 1296895584);
        setField(term1157, term1157.getClass(), "next", null);
        setField(term1157, term1157.getClass(), "first", term1151);
        setField(term1157, term1157.getClass(), "last", term1146);
        setField(term1157, term1157.getClass(), "propListHead", null);
        setIntField(term1157, term1157.getClass(), "sourcePosition", 0);
        setField(term1157, term1157.getClass(), "jsType", null);
        setField(term1157, term1157.getClass(), "parent", null);
        setField(term1155, term1155.getClass(), "next", term1157);
        setField(term1155, term1155.getClass(), "first", term1142);
        setField(term1155, term1155.getClass(), "last", term1142);
        setField(term1155, term1155.getClass(), "propListHead", null);
        setIntField(term1155, term1155.getClass(), "sourcePosition", 0);
        setField(term1155, term1155.getClass(), "jsType", null);
        setField(term1155, term1155.getClass(), "parent", null);
        setField(term1144, term1144.getClass(), "last", term1155);
        setField(term1144, term1144.getClass(), "propListHead", null);
        setIntField(term1144, term1144.getClass(), "sourcePosition", 0);
        setField(term1144, term1144.getClass(), "jsType", null);
        setField(term1144, term1144.getClass(), "parent", null);
        setField(term1142, term1142.getClass(), "next", term1144);
        setIntField(term1162, term1162.getClass(), "type", 628918458);
        setField(term1162, term1162.getClass(), "next", term1155);
        setField(term1162, term1162.getClass(), "first", term1157);
        setField(term1162, term1162.getClass(), "last", term1140);
        setField(term1162, term1162.getClass(), "propListHead", null);
        setIntField(term1162, term1162.getClass(), "sourcePosition", 0);
        setField(term1162, term1162.getClass(), "jsType", null);
        setField(term1162, term1162.getClass(), "parent", null);
        setField(term1142, term1142.getClass(), "first", term1162);
        setField(term1142, term1142.getClass(), "last", term1162);
        setField(term1142, term1142.getClass(), "propListHead", null);
        setIntField(term1142, term1142.getClass(), "sourcePosition", 0);
        setField(term1142, term1142.getClass(), "jsType", null);
        setField(term1142, term1142.getClass(), "parent", null);
        setField(term1140, term1140.getClass(), "next", term1142);
        setField(term1140, term1140.getClass(), "first", term1146);
        setField(term1140, term1140.getClass(), "last", term1148);
        setField(term1140, term1140.getClass(), "propListHead", null);
        setIntField(term1140, term1140.getClass(), "sourcePosition", 0);
        setField(term1140, term1140.getClass(), "jsType", null);
        setField(term1140, term1140.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[2];
        args[0] = term1140;
        args[1] = null;
        try {
            callMethod(klass, "ensurePropertyDeclaredHelper", argTypes, term1085, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


