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
import java.lang.Boolean;

public class TypeInference_traverseShortCircuitingBinOp_4391324779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4419;
     Object term4474;
     Object term4501;

    public TypeInference_traverseShortCircuitingBinOp_4391324779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4422 = new HashMap();
        HashMap term4431 = new HashMap();
        Set<Object> term21025 =  ((Map) term4431).keySet();
        HashSet term4430 = new HashSet((Collection<? extends Object>) term21025);
        HashMap term4438 = new HashMap();
        Set<Object> term21026 =  ((Map) term4438).keySet();
        HashSet term4437 = new HashSet((Collection<? extends Object>) term21026);
        HashMap term4445 = new HashMap();
        Set<Object> term21027 =  ((Map) term4445).keySet();
        HashSet term4444 = new HashSet((Collection<? extends Object>) term21027);
        HashMap term4451 = new HashMap();
        HashMap term4459 = new HashMap();
        HashMap term4464 = new HashMap();
        term4419 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term4420 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term4421 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        setField(term4419, term4419.getClass(), "compiler", null);
        setField(term4420, term4420.getClass(), "reporter", null);
        setField(term4420, term4420.getClass(), "nativeTypes", term4421);
        setField(term4420, term4420.getClass(), "namesToTypes", term4422);
        setField(term4420, term4420.getClass(), "namespaces", term4430);
        setField(term4420, term4420.getClass(), "nonNullableTypeNames", term4437);
        setField(term4420, term4420.getClass(), "forwardDeclaredTypes", term4444);
        setField(term4420, term4420.getClass(), "typesIndexedByProperty", term4451);
        setField(term4420, term4420.getClass(), "eachRefTypeIndexedByProperty", term4459);
        setField(term4420, term4420.getClass(), "greatestSubtypeByProperty", term4464);
        setField(term4420, term4420.getClass(), "interfaceToImplementors", null);
        setField(term4420, term4420.getClass(), "unresolvedNamedTypes", null);
        setField(term4420, term4420.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4420, term4420.getClass(), "lastGeneration", false);
        setField(term4420, term4420.getClass(), "templateTypeName", null);
        setField(term4420, term4420.getClass(), "templateType", null);
        setBooleanField(term4420, term4420.getClass(), "tolerateUndefinedValues", false);
        setField(term4420, term4420.getClass(), "resolveMode", null);
        setField(term4419, term4419.getClass(), "registry", term4420);
        setField(term4419, term4419.getClass(), "reverseInterpreter", null);
        setField(term4419, term4419.getClass(), "syntacticScope", null);
        setField(term4419, term4419.getClass(), "functionScope", null);
        setField(term4419, term4419.getClass(), "bottomScope", null);
        setField(term4419, term4419.getClass(), "assertionFunctionsMap", null);
        setField(term4419, term4419.getClass(), "cfg", null);
        setField(term4419, term4419.getClass(), "joinOp", null);
        setField(term4419, term4419.getClass(), "orderedWorkSet", null);
        term4474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4474, term4474.getClass(), "type", 1964967720);
        setIntField(term4476, term4476.getClass(), "type", 1351900243);
        setIntField(term4478, term4478.getClass(), "type", -330897705);
        setIntField(term4480, term4480.getClass(), "type", 1065595802);
        setIntField(term4482, term4482.getClass(), "type", 21031843);
        setField(term4482, term4482.getClass(), "next", null);
        setField(term4482, term4482.getClass(), "first", null);
        setField(term4482, term4482.getClass(), "last", null);
        setField(term4482, term4482.getClass(), "propListHead", null);
        setIntField(term4482, term4482.getClass(), "sourcePosition", 0);
        setField(term4482, term4482.getClass(), "jsType", null);
        setField(term4482, term4482.getClass(), "parent", null);
        setField(term4480, term4480.getClass(), "next", term4482);
        setIntField(term4485, term4485.getClass(), "type", -380787857);
        setField(term4485, term4485.getClass(), "next", null);
        setField(term4485, term4485.getClass(), "first", null);
        setField(term4485, term4485.getClass(), "last", term4482);
        setField(term4485, term4485.getClass(), "propListHead", null);
        setIntField(term4485, term4485.getClass(), "sourcePosition", 0);
        setField(term4485, term4485.getClass(), "jsType", null);
        setField(term4485, term4485.getClass(), "parent", null);
        setField(term4480, term4480.getClass(), "first", term4485);
        setField(term4480, term4480.getClass(), "last", term4478);
        setField(term4480, term4480.getClass(), "propListHead", null);
        setIntField(term4480, term4480.getClass(), "sourcePosition", 0);
        setField(term4480, term4480.getClass(), "jsType", null);
        setField(term4480, term4480.getClass(), "parent", null);
        setField(term4478, term4478.getClass(), "next", term4480);
        setField(term4478, term4478.getClass(), "first", term4482);
        setIntField(term4489, term4489.getClass(), "type", -1097563716);
        setIntField(term4491, term4491.getClass(), "type", 1572907769);
        setField(term4491, term4491.getClass(), "next", null);
        setField(term4491, term4491.getClass(), "first", term4485);
        setField(term4491, term4491.getClass(), "last", term4480);
        setField(term4491, term4491.getClass(), "propListHead", null);
        setIntField(term4491, term4491.getClass(), "sourcePosition", 0);
        setField(term4491, term4491.getClass(), "jsType", null);
        setField(term4491, term4491.getClass(), "parent", null);
        setField(term4489, term4489.getClass(), "next", term4491);
        setField(term4489, term4489.getClass(), "first", term4476);
        setField(term4489, term4489.getClass(), "last", term4476);
        setField(term4489, term4489.getClass(), "propListHead", null);
        setIntField(term4489, term4489.getClass(), "sourcePosition", 0);
        setField(term4489, term4489.getClass(), "jsType", null);
        setField(term4489, term4489.getClass(), "parent", null);
        setField(term4478, term4478.getClass(), "last", term4489);
        setField(term4478, term4478.getClass(), "propListHead", null);
        setIntField(term4478, term4478.getClass(), "sourcePosition", 0);
        setField(term4478, term4478.getClass(), "jsType", null);
        setField(term4478, term4478.getClass(), "parent", null);
        setField(term4476, term4476.getClass(), "next", term4478);
        setIntField(term4496, term4496.getClass(), "type", 1608016787);
        setField(term4496, term4496.getClass(), "next", term4489);
        setField(term4496, term4496.getClass(), "first", term4491);
        setField(term4496, term4496.getClass(), "last", term4474);
        setField(term4496, term4496.getClass(), "propListHead", null);
        setIntField(term4496, term4496.getClass(), "sourcePosition", 0);
        setField(term4496, term4496.getClass(), "jsType", null);
        setField(term4496, term4496.getClass(), "parent", null);
        setField(term4476, term4476.getClass(), "first", term4496);
        setField(term4476, term4476.getClass(), "last", term4496);
        setField(term4476, term4476.getClass(), "propListHead", null);
        setIntField(term4476, term4476.getClass(), "sourcePosition", 0);
        setField(term4476, term4476.getClass(), "jsType", null);
        setField(term4476, term4476.getClass(), "parent", null);
        setField(term4474, term4474.getClass(), "next", term4476);
        setField(term4474, term4474.getClass(), "first", term4480);
        setField(term4474, term4474.getClass(), "last", term4482);
        setField(term4474, term4474.getClass(), "propListHead", null);
        setIntField(term4474, term4474.getClass(), "sourcePosition", 0);
        setField(term4474, term4474.getClass(), "jsType", null);
        setField(term4474, term4474.getClass(), "parent", null);
        term4501 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term4474;
        args[1] = null;
        args[2] = term4501;
        try {
            callMethod(klass, "traverseShortCircuitingBinOp", argTypes, term4419, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


