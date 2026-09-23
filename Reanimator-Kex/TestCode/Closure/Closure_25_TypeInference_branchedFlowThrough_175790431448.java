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

public class TypeInference_branchedFlowThrough_175790431448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term408;
     Object term463;

    public TypeInference_branchedFlowThrough_175790431448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term411 = new HashMap();
        HashMap term420 = new HashMap();
        Set<Object> term8820 =  ((Map) term420).keySet();
        HashSet term419 = new HashSet((Collection<? extends Object>) term8820);
        HashMap term427 = new HashMap();
        Set<Object> term8821 =  ((Map) term427).keySet();
        HashSet term426 = new HashSet((Collection<? extends Object>) term8821);
        HashMap term434 = new HashMap();
        Set<Object> term8822 =  ((Map) term434).keySet();
        HashSet term433 = new HashSet((Collection<? extends Object>) term8822);
        HashMap term440 = new HashMap();
        HashMap term448 = new HashMap();
        HashMap term453 = new HashMap();
        term408 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term409 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term410 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term408, term408.getClass(), "compiler", null);
        setField(term409, term409.getClass(), "reporter", null);
        setField(term409, term409.getClass(), "nativeTypes", term410);
        setField(term409, term409.getClass(), "namesToTypes", term411);
        setField(term409, term409.getClass(), "namespaces", term419);
        setField(term409, term409.getClass(), "nonNullableTypeNames", term426);
        setField(term409, term409.getClass(), "forwardDeclaredTypes", term433);
        setField(term409, term409.getClass(), "typesIndexedByProperty", term440);
        setField(term409, term409.getClass(), "eachRefTypeIndexedByProperty", term448);
        setField(term409, term409.getClass(), "greatestSubtypeByProperty", term453);
        setField(term409, term409.getClass(), "interfaceToImplementors", null);
        setField(term409, term409.getClass(), "unresolvedNamedTypes", null);
        setField(term409, term409.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term409, term409.getClass(), "lastGeneration", false);
        setField(term409, term409.getClass(), "templateTypeName", null);
        setField(term409, term409.getClass(), "templateType", null);
        setBooleanField(term409, term409.getClass(), "tolerateUndefinedValues", false);
        setField(term409, term409.getClass(), "resolveMode", null);
        setField(term408, term408.getClass(), "registry", term409);
        setField(term408, term408.getClass(), "reverseInterpreter", null);
        setField(term408, term408.getClass(), "syntacticScope", null);
        setField(term408, term408.getClass(), "functionScope", null);
        setField(term408, term408.getClass(), "bottomScope", null);
        setField(term408, term408.getClass(), "assertionFunctionsMap", null);
        setField(term408, term408.getClass(), "cfg", null);
        setField(term408, term408.getClass(), "joinOp", null);
        setField(term408, term408.getClass(), "orderedWorkSet", null);
        term463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term463, term463.getClass(), "type", -14890619);
        setIntField(term465, term465.getClass(), "type", 1632125673);
        setIntField(term467, term467.getClass(), "type", 454281060);
        setIntField(term469, term469.getClass(), "type", -1786399638);
        setIntField(term471, term471.getClass(), "type", 2055867847);
        setField(term471, term471.getClass(), "next", null);
        setField(term471, term471.getClass(), "first", null);
        setField(term471, term471.getClass(), "last", null);
        setField(term471, term471.getClass(), "propListHead", null);
        setIntField(term471, term471.getClass(), "sourcePosition", 0);
        setField(term471, term471.getClass(), "jsType", null);
        setField(term471, term471.getClass(), "parent", null);
        setField(term469, term469.getClass(), "next", term471);
        setIntField(term474, term474.getClass(), "type", -1048298087);
        setField(term474, term474.getClass(), "next", null);
        setField(term474, term474.getClass(), "first", null);
        setField(term474, term474.getClass(), "last", term471);
        setField(term474, term474.getClass(), "propListHead", null);
        setIntField(term474, term474.getClass(), "sourcePosition", 0);
        setField(term474, term474.getClass(), "jsType", null);
        setField(term474, term474.getClass(), "parent", null);
        setField(term469, term469.getClass(), "first", term474);
        setField(term469, term469.getClass(), "last", term467);
        setField(term469, term469.getClass(), "propListHead", null);
        setIntField(term469, term469.getClass(), "sourcePosition", 0);
        setField(term469, term469.getClass(), "jsType", null);
        setField(term469, term469.getClass(), "parent", null);
        setField(term467, term467.getClass(), "next", term469);
        setField(term467, term467.getClass(), "first", term471);
        setIntField(term478, term478.getClass(), "type", 458147407);
        setIntField(term480, term480.getClass(), "type", -184153539);
        setField(term480, term480.getClass(), "next", null);
        setField(term480, term480.getClass(), "first", term474);
        setField(term480, term480.getClass(), "last", term469);
        setField(term480, term480.getClass(), "propListHead", null);
        setIntField(term480, term480.getClass(), "sourcePosition", 0);
        setField(term480, term480.getClass(), "jsType", null);
        setField(term480, term480.getClass(), "parent", null);
        setField(term478, term478.getClass(), "next", term480);
        setField(term478, term478.getClass(), "first", term465);
        setField(term478, term478.getClass(), "last", term465);
        setField(term478, term478.getClass(), "propListHead", null);
        setIntField(term478, term478.getClass(), "sourcePosition", 0);
        setField(term478, term478.getClass(), "jsType", null);
        setField(term478, term478.getClass(), "parent", null);
        setField(term467, term467.getClass(), "last", term478);
        setField(term467, term467.getClass(), "propListHead", null);
        setIntField(term467, term467.getClass(), "sourcePosition", 0);
        setField(term467, term467.getClass(), "jsType", null);
        setField(term467, term467.getClass(), "parent", null);
        setField(term465, term465.getClass(), "next", term467);
        setIntField(term485, term485.getClass(), "type", 493620644);
        setField(term485, term485.getClass(), "next", term478);
        setField(term485, term485.getClass(), "first", term480);
        setField(term485, term485.getClass(), "last", term463);
        setField(term485, term485.getClass(), "propListHead", null);
        setIntField(term485, term485.getClass(), "sourcePosition", 0);
        setField(term485, term485.getClass(), "jsType", null);
        setField(term485, term485.getClass(), "parent", null);
        setField(term465, term465.getClass(), "first", term485);
        setField(term465, term465.getClass(), "last", term485);
        setField(term465, term465.getClass(), "propListHead", null);
        setIntField(term465, term465.getClass(), "sourcePosition", 0);
        setField(term465, term465.getClass(), "jsType", null);
        setField(term465, term465.getClass(), "parent", null);
        setField(term463, term463.getClass(), "next", term465);
        setField(term463, term463.getClass(), "first", term469);
        setField(term463, term463.getClass(), "last", term471);
        setField(term463, term463.getClass(), "propListHead", null);
        setIntField(term463, term463.getClass(), "sourcePosition", 0);
        setField(term463, term463.getClass(), "jsType", null);
        setField(term463, term463.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term463;
        args[1] = null;
        try {
            callMethod(klass, "branchedFlowThrough", argTypes, term408, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


