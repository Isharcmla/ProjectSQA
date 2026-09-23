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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TypeInference_traverseAdd_188658688360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1425;
     Object term1480;

    public TypeInference_traverseAdd_188658688360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1428 = new HashMap();
        HashMap term1437 = new HashMap();
        Set<Object> term12755 =  ((Map) term1437).keySet();
        HashSet term1436 = new HashSet((Collection<? extends Object>) term12755);
        HashMap term1444 = new HashMap();
        Set<Object> term12756 =  ((Map) term1444).keySet();
        HashSet term1443 = new HashSet((Collection<? extends Object>) term12756);
        HashMap term1451 = new HashMap();
        Set<Object> term12757 =  ((Map) term1451).keySet();
        HashSet term1450 = new HashSet((Collection<? extends Object>) term12757);
        HashMap term1457 = new HashMap();
        HashMap term1465 = new HashMap();
        HashMap term1470 = new HashMap();
        term1425 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term1426 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1427 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term1425, term1425.getClass(), "compiler", null);
        setField(term1426, term1426.getClass(), "reporter", null);
        setField(term1426, term1426.getClass(), "nativeTypes", term1427);
        setField(term1426, term1426.getClass(), "namesToTypes", term1428);
        setField(term1426, term1426.getClass(), "namespaces", term1436);
        setField(term1426, term1426.getClass(), "nonNullableTypeNames", term1443);
        setField(term1426, term1426.getClass(), "forwardDeclaredTypes", term1450);
        setField(term1426, term1426.getClass(), "typesIndexedByProperty", term1457);
        setField(term1426, term1426.getClass(), "eachRefTypeIndexedByProperty", term1465);
        setField(term1426, term1426.getClass(), "greatestSubtypeByProperty", term1470);
        setField(term1426, term1426.getClass(), "interfaceToImplementors", null);
        setField(term1426, term1426.getClass(), "unresolvedNamedTypes", null);
        setField(term1426, term1426.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1426, term1426.getClass(), "lastGeneration", false);
        setField(term1426, term1426.getClass(), "templateTypeName", null);
        setField(term1426, term1426.getClass(), "templateType", null);
        setBooleanField(term1426, term1426.getClass(), "tolerateUndefinedValues", false);
        setField(term1426, term1426.getClass(), "resolveMode", null);
        setField(term1425, term1425.getClass(), "registry", term1426);
        setField(term1425, term1425.getClass(), "reverseInterpreter", null);
        setField(term1425, term1425.getClass(), "syntacticScope", null);
        setField(term1425, term1425.getClass(), "functionScope", null);
        setField(term1425, term1425.getClass(), "bottomScope", null);
        setField(term1425, term1425.getClass(), "assertionFunctionsMap", null);
        setField(term1425, term1425.getClass(), "cfg", null);
        setField(term1425, term1425.getClass(), "joinOp", null);
        setField(term1425, term1425.getClass(), "orderedWorkSet", null);
        term1480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1480, term1480.getClass(), "type", -2131181468);
        setIntField(term1482, term1482.getClass(), "type", 282916351);
        setIntField(term1484, term1484.getClass(), "type", 880977281);
        setIntField(term1486, term1486.getClass(), "type", 371943306);
        setIntField(term1488, term1488.getClass(), "type", 982388293);
        setField(term1488, term1488.getClass(), "next", null);
        setField(term1488, term1488.getClass(), "first", null);
        setField(term1488, term1488.getClass(), "last", null);
        setField(term1488, term1488.getClass(), "propListHead", null);
        setIntField(term1488, term1488.getClass(), "sourcePosition", 0);
        setField(term1488, term1488.getClass(), "jsType", null);
        setField(term1488, term1488.getClass(), "parent", null);
        setField(term1486, term1486.getClass(), "next", term1488);
        setIntField(term1491, term1491.getClass(), "type", -159494544);
        setField(term1491, term1491.getClass(), "next", null);
        setField(term1491, term1491.getClass(), "first", null);
        setField(term1491, term1491.getClass(), "last", term1488);
        setField(term1491, term1491.getClass(), "propListHead", null);
        setIntField(term1491, term1491.getClass(), "sourcePosition", 0);
        setField(term1491, term1491.getClass(), "jsType", null);
        setField(term1491, term1491.getClass(), "parent", null);
        setField(term1486, term1486.getClass(), "first", term1491);
        setField(term1486, term1486.getClass(), "last", term1484);
        setField(term1486, term1486.getClass(), "propListHead", null);
        setIntField(term1486, term1486.getClass(), "sourcePosition", 0);
        setField(term1486, term1486.getClass(), "jsType", null);
        setField(term1486, term1486.getClass(), "parent", null);
        setField(term1484, term1484.getClass(), "next", term1486);
        setField(term1484, term1484.getClass(), "first", term1488);
        setIntField(term1495, term1495.getClass(), "type", -1618206977);
        setIntField(term1497, term1497.getClass(), "type", -1747406163);
        setField(term1497, term1497.getClass(), "next", null);
        setField(term1497, term1497.getClass(), "first", term1491);
        setField(term1497, term1497.getClass(), "last", term1486);
        setField(term1497, term1497.getClass(), "propListHead", null);
        setIntField(term1497, term1497.getClass(), "sourcePosition", 0);
        setField(term1497, term1497.getClass(), "jsType", null);
        setField(term1497, term1497.getClass(), "parent", null);
        setField(term1495, term1495.getClass(), "next", term1497);
        setField(term1495, term1495.getClass(), "first", term1482);
        setField(term1495, term1495.getClass(), "last", term1482);
        setField(term1495, term1495.getClass(), "propListHead", null);
        setIntField(term1495, term1495.getClass(), "sourcePosition", 0);
        setField(term1495, term1495.getClass(), "jsType", null);
        setField(term1495, term1495.getClass(), "parent", null);
        setField(term1484, term1484.getClass(), "last", term1495);
        setField(term1484, term1484.getClass(), "propListHead", null);
        setIntField(term1484, term1484.getClass(), "sourcePosition", 0);
        setField(term1484, term1484.getClass(), "jsType", null);
        setField(term1484, term1484.getClass(), "parent", null);
        setField(term1482, term1482.getClass(), "next", term1484);
        setIntField(term1502, term1502.getClass(), "type", 388157121);
        setField(term1502, term1502.getClass(), "next", term1495);
        setField(term1502, term1502.getClass(), "first", term1497);
        setField(term1502, term1502.getClass(), "last", term1480);
        setField(term1502, term1502.getClass(), "propListHead", null);
        setIntField(term1502, term1502.getClass(), "sourcePosition", 0);
        setField(term1502, term1502.getClass(), "jsType", null);
        setField(term1502, term1502.getClass(), "parent", null);
        setField(term1482, term1482.getClass(), "first", term1502);
        setField(term1482, term1482.getClass(), "last", term1502);
        setField(term1482, term1482.getClass(), "propListHead", null);
        setIntField(term1482, term1482.getClass(), "sourcePosition", 0);
        setField(term1482, term1482.getClass(), "jsType", null);
        setField(term1482, term1482.getClass(), "parent", null);
        setField(term1480, term1480.getClass(), "next", term1482);
        setField(term1480, term1480.getClass(), "first", term1486);
        setField(term1480, term1480.getClass(), "last", term1488);
        setField(term1480, term1480.getClass(), "propListHead", null);
        setIntField(term1480, term1480.getClass(), "sourcePosition", 0);
        setField(term1480, term1480.getClass(), "jsType", null);
        setField(term1480, term1480.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1480;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term1425, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


