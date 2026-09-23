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

public class TypeInference_traverseObjectLiteral_2856366259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1340;
     Object term1395;

    public TypeInference_traverseObjectLiteral_2856366259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1343 = new HashMap();
        HashMap term1352 = new HashMap();
        Set<Object> term12246 =  ((Map) term1352).keySet();
        HashSet term1351 = new HashSet((Collection<? extends Object>) term12246);
        HashMap term1359 = new HashMap();
        Set<Object> term12247 =  ((Map) term1359).keySet();
        HashSet term1358 = new HashSet((Collection<? extends Object>) term12247);
        HashMap term1366 = new HashMap();
        Set<Object> term12248 =  ((Map) term1366).keySet();
        HashSet term1365 = new HashSet((Collection<? extends Object>) term12248);
        HashMap term1372 = new HashMap();
        HashMap term1380 = new HashMap();
        HashMap term1385 = new HashMap();
        term1340 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term1341 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1342 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        setField(term1340, term1340.getClass(), "compiler", null);
        setField(term1341, term1341.getClass(), "reporter", null);
        setField(term1341, term1341.getClass(), "nativeTypes", term1342);
        setField(term1341, term1341.getClass(), "namesToTypes", term1343);
        setField(term1341, term1341.getClass(), "namespaces", term1351);
        setField(term1341, term1341.getClass(), "nonNullableTypeNames", term1358);
        setField(term1341, term1341.getClass(), "forwardDeclaredTypes", term1365);
        setField(term1341, term1341.getClass(), "typesIndexedByProperty", term1372);
        setField(term1341, term1341.getClass(), "eachRefTypeIndexedByProperty", term1380);
        setField(term1341, term1341.getClass(), "greatestSubtypeByProperty", term1385);
        setField(term1341, term1341.getClass(), "interfaceToImplementors", null);
        setField(term1341, term1341.getClass(), "unresolvedNamedTypes", null);
        setField(term1341, term1341.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1341, term1341.getClass(), "lastGeneration", false);
        setField(term1341, term1341.getClass(), "templateTypeName", null);
        setField(term1341, term1341.getClass(), "templateType", null);
        setBooleanField(term1341, term1341.getClass(), "tolerateUndefinedValues", false);
        setField(term1341, term1341.getClass(), "resolveMode", null);
        setField(term1340, term1340.getClass(), "registry", term1341);
        setField(term1340, term1340.getClass(), "reverseInterpreter", null);
        setField(term1340, term1340.getClass(), "syntacticScope", null);
        setField(term1340, term1340.getClass(), "functionScope", null);
        setField(term1340, term1340.getClass(), "bottomScope", null);
        setField(term1340, term1340.getClass(), "assertionFunctionsMap", null);
        setField(term1340, term1340.getClass(), "cfg", null);
        setField(term1340, term1340.getClass(), "joinOp", null);
        setField(term1340, term1340.getClass(), "orderedWorkSet", null);
        term1395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1395, term1395.getClass(), "type", -1222614956);
        setIntField(term1397, term1397.getClass(), "type", -1870495012);
        setIntField(term1399, term1399.getClass(), "type", -1310015129);
        setIntField(term1401, term1401.getClass(), "type", -2104981311);
        setIntField(term1403, term1403.getClass(), "type", -571169753);
        setField(term1403, term1403.getClass(), "next", null);
        setField(term1403, term1403.getClass(), "first", null);
        setField(term1403, term1403.getClass(), "last", null);
        setField(term1403, term1403.getClass(), "propListHead", null);
        setIntField(term1403, term1403.getClass(), "sourcePosition", 0);
        setField(term1403, term1403.getClass(), "jsType", null);
        setField(term1403, term1403.getClass(), "parent", null);
        setField(term1401, term1401.getClass(), "next", term1403);
        setIntField(term1406, term1406.getClass(), "type", 318591690);
        setField(term1406, term1406.getClass(), "next", null);
        setField(term1406, term1406.getClass(), "first", null);
        setField(term1406, term1406.getClass(), "last", term1403);
        setField(term1406, term1406.getClass(), "propListHead", null);
        setIntField(term1406, term1406.getClass(), "sourcePosition", 0);
        setField(term1406, term1406.getClass(), "jsType", null);
        setField(term1406, term1406.getClass(), "parent", null);
        setField(term1401, term1401.getClass(), "first", term1406);
        setField(term1401, term1401.getClass(), "last", term1399);
        setField(term1401, term1401.getClass(), "propListHead", null);
        setIntField(term1401, term1401.getClass(), "sourcePosition", 0);
        setField(term1401, term1401.getClass(), "jsType", null);
        setField(term1401, term1401.getClass(), "parent", null);
        setField(term1399, term1399.getClass(), "next", term1401);
        setField(term1399, term1399.getClass(), "first", term1403);
        setIntField(term1410, term1410.getClass(), "type", -1347358701);
        setIntField(term1412, term1412.getClass(), "type", 806595993);
        setField(term1412, term1412.getClass(), "next", null);
        setField(term1412, term1412.getClass(), "first", term1406);
        setField(term1412, term1412.getClass(), "last", term1401);
        setField(term1412, term1412.getClass(), "propListHead", null);
        setIntField(term1412, term1412.getClass(), "sourcePosition", 0);
        setField(term1412, term1412.getClass(), "jsType", null);
        setField(term1412, term1412.getClass(), "parent", null);
        setField(term1410, term1410.getClass(), "next", term1412);
        setField(term1410, term1410.getClass(), "first", term1397);
        setField(term1410, term1410.getClass(), "last", term1397);
        setField(term1410, term1410.getClass(), "propListHead", null);
        setIntField(term1410, term1410.getClass(), "sourcePosition", 0);
        setField(term1410, term1410.getClass(), "jsType", null);
        setField(term1410, term1410.getClass(), "parent", null);
        setField(term1399, term1399.getClass(), "last", term1410);
        setField(term1399, term1399.getClass(), "propListHead", null);
        setIntField(term1399, term1399.getClass(), "sourcePosition", 0);
        setField(term1399, term1399.getClass(), "jsType", null);
        setField(term1399, term1399.getClass(), "parent", null);
        setField(term1397, term1397.getClass(), "next", term1399);
        setIntField(term1417, term1417.getClass(), "type", 548228925);
        setField(term1417, term1417.getClass(), "next", term1410);
        setField(term1417, term1417.getClass(), "first", term1412);
        setField(term1417, term1417.getClass(), "last", term1395);
        setField(term1417, term1417.getClass(), "propListHead", null);
        setIntField(term1417, term1417.getClass(), "sourcePosition", 0);
        setField(term1417, term1417.getClass(), "jsType", null);
        setField(term1417, term1417.getClass(), "parent", null);
        setField(term1397, term1397.getClass(), "first", term1417);
        setField(term1397, term1397.getClass(), "last", term1417);
        setField(term1397, term1397.getClass(), "propListHead", null);
        setIntField(term1397, term1397.getClass(), "sourcePosition", 0);
        setField(term1397, term1397.getClass(), "jsType", null);
        setField(term1397, term1397.getClass(), "parent", null);
        setField(term1395, term1395.getClass(), "next", term1397);
        setField(term1395, term1395.getClass(), "first", term1401);
        setField(term1395, term1395.getClass(), "last", term1403);
        setField(term1395, term1395.getClass(), "propListHead", null);
        setIntField(term1395, term1395.getClass(), "sourcePosition", 0);
        setField(term1395, term1395.getClass(), "jsType", null);
        setField(term1395, term1395.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1395;
        args[1] = null;
        try {
            callMethod(klass, "traverseObjectLiteral", argTypes, term1340, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


