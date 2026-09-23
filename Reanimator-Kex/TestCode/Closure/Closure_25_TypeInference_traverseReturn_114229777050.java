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

public class TypeInference_traverseReturn_114229777050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term577;
     Object term632;

    public TypeInference_traverseReturn_114229777050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term580 = new HashMap();
        HashMap term589 = new HashMap();
        Set<Object> term9348 =  ((Map) term589).keySet();
        HashSet term588 = new HashSet((Collection<? extends Object>) term9348);
        HashMap term596 = new HashMap();
        Set<Object> term9349 =  ((Map) term596).keySet();
        HashSet term595 = new HashSet((Collection<? extends Object>) term9349);
        HashMap term603 = new HashMap();
        Set<Object> term9350 =  ((Map) term603).keySet();
        HashSet term602 = new HashSet((Collection<? extends Object>) term9350);
        HashMap term609 = new HashMap();
        HashMap term617 = new HashMap();
        HashMap term622 = new HashMap();
        term577 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term578 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term579 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        setField(term577, term577.getClass(), "compiler", null);
        setField(term578, term578.getClass(), "reporter", null);
        setField(term578, term578.getClass(), "nativeTypes", term579);
        setField(term578, term578.getClass(), "namesToTypes", term580);
        setField(term578, term578.getClass(), "namespaces", term588);
        setField(term578, term578.getClass(), "nonNullableTypeNames", term595);
        setField(term578, term578.getClass(), "forwardDeclaredTypes", term602);
        setField(term578, term578.getClass(), "typesIndexedByProperty", term609);
        setField(term578, term578.getClass(), "eachRefTypeIndexedByProperty", term617);
        setField(term578, term578.getClass(), "greatestSubtypeByProperty", term622);
        setField(term578, term578.getClass(), "interfaceToImplementors", null);
        setField(term578, term578.getClass(), "unresolvedNamedTypes", null);
        setField(term578, term578.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term578, term578.getClass(), "lastGeneration", false);
        setField(term578, term578.getClass(), "templateTypeName", null);
        setField(term578, term578.getClass(), "templateType", null);
        setBooleanField(term578, term578.getClass(), "tolerateUndefinedValues", false);
        setField(term578, term578.getClass(), "resolveMode", null);
        setField(term577, term577.getClass(), "registry", term578);
        setField(term577, term577.getClass(), "reverseInterpreter", null);
        setField(term577, term577.getClass(), "syntacticScope", null);
        setField(term577, term577.getClass(), "functionScope", null);
        setField(term577, term577.getClass(), "bottomScope", null);
        setField(term577, term577.getClass(), "assertionFunctionsMap", null);
        setField(term577, term577.getClass(), "cfg", null);
        setField(term577, term577.getClass(), "joinOp", null);
        setField(term577, term577.getClass(), "orderedWorkSet", null);
        term632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term640 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term632, term632.getClass(), "type", 1063420942);
        setIntField(term634, term634.getClass(), "type", 1375330971);
        setIntField(term636, term636.getClass(), "type", -478195677);
        setIntField(term638, term638.getClass(), "type", 972867650);
        setIntField(term640, term640.getClass(), "type", 1655935355);
        setField(term640, term640.getClass(), "next", null);
        setField(term640, term640.getClass(), "first", null);
        setField(term640, term640.getClass(), "last", null);
        setField(term640, term640.getClass(), "propListHead", null);
        setIntField(term640, term640.getClass(), "sourcePosition", 0);
        setField(term640, term640.getClass(), "jsType", null);
        setField(term640, term640.getClass(), "parent", null);
        setField(term638, term638.getClass(), "next", term640);
        setIntField(term643, term643.getClass(), "type", -481533957);
        setField(term643, term643.getClass(), "next", null);
        setField(term643, term643.getClass(), "first", null);
        setField(term643, term643.getClass(), "last", term640);
        setField(term643, term643.getClass(), "propListHead", null);
        setIntField(term643, term643.getClass(), "sourcePosition", 0);
        setField(term643, term643.getClass(), "jsType", null);
        setField(term643, term643.getClass(), "parent", null);
        setField(term638, term638.getClass(), "first", term643);
        setField(term638, term638.getClass(), "last", term636);
        setField(term638, term638.getClass(), "propListHead", null);
        setIntField(term638, term638.getClass(), "sourcePosition", 0);
        setField(term638, term638.getClass(), "jsType", null);
        setField(term638, term638.getClass(), "parent", null);
        setField(term636, term636.getClass(), "next", term638);
        setField(term636, term636.getClass(), "first", term640);
        setIntField(term647, term647.getClass(), "type", -1465035361);
        setIntField(term649, term649.getClass(), "type", 1090617576);
        setField(term649, term649.getClass(), "next", null);
        setField(term649, term649.getClass(), "first", term643);
        setField(term649, term649.getClass(), "last", term638);
        setField(term649, term649.getClass(), "propListHead", null);
        setIntField(term649, term649.getClass(), "sourcePosition", 0);
        setField(term649, term649.getClass(), "jsType", null);
        setField(term649, term649.getClass(), "parent", null);
        setField(term647, term647.getClass(), "next", term649);
        setField(term647, term647.getClass(), "first", term634);
        setField(term647, term647.getClass(), "last", term634);
        setField(term647, term647.getClass(), "propListHead", null);
        setIntField(term647, term647.getClass(), "sourcePosition", 0);
        setField(term647, term647.getClass(), "jsType", null);
        setField(term647, term647.getClass(), "parent", null);
        setField(term636, term636.getClass(), "last", term647);
        setField(term636, term636.getClass(), "propListHead", null);
        setIntField(term636, term636.getClass(), "sourcePosition", 0);
        setField(term636, term636.getClass(), "jsType", null);
        setField(term636, term636.getClass(), "parent", null);
        setField(term634, term634.getClass(), "next", term636);
        setIntField(term654, term654.getClass(), "type", -1547384488);
        setField(term654, term654.getClass(), "next", term647);
        setField(term654, term654.getClass(), "first", term649);
        setField(term654, term654.getClass(), "last", term632);
        setField(term654, term654.getClass(), "propListHead", null);
        setIntField(term654, term654.getClass(), "sourcePosition", 0);
        setField(term654, term654.getClass(), "jsType", null);
        setField(term654, term654.getClass(), "parent", null);
        setField(term634, term634.getClass(), "first", term654);
        setField(term634, term634.getClass(), "last", term654);
        setField(term634, term634.getClass(), "propListHead", null);
        setIntField(term634, term634.getClass(), "sourcePosition", 0);
        setField(term634, term634.getClass(), "jsType", null);
        setField(term634, term634.getClass(), "parent", null);
        setField(term632, term632.getClass(), "next", term634);
        setField(term632, term632.getClass(), "first", term638);
        setField(term632, term632.getClass(), "last", term640);
        setField(term632, term632.getClass(), "propListHead", null);
        setIntField(term632, term632.getClass(), "sourcePosition", 0);
        setField(term632, term632.getClass(), "jsType", null);
        setField(term632, term632.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term632;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term577, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


