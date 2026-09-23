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

public class TypeInference_isUnflowable_16288904085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5988;
     Object term6043;

    public TypeInference_isUnflowable_16288904085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5991 = new HashMap();
        HashMap term6000 = new HashMap();
        Set<Object> term26496 =  ((Map) term6000).keySet();
        HashSet term5999 = new HashSet((Collection<? extends Object>) term26496);
        HashMap term6007 = new HashMap();
        Set<Object> term26497 =  ((Map) term6007).keySet();
        HashSet term6006 = new HashSet((Collection<? extends Object>) term26497);
        HashMap term6014 = new HashMap();
        Set<Object> term26498 =  ((Map) term6014).keySet();
        HashSet term6013 = new HashSet((Collection<? extends Object>) term26498);
        HashMap term6020 = new HashMap();
        HashMap term6028 = new HashMap();
        HashMap term6033 = new HashMap();
        term5988 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term5989 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term5990 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term5988, term5988.getClass(), "compiler", null);
        setField(term5989, term5989.getClass(), "reporter", null);
        setField(term5989, term5989.getClass(), "nativeTypes", term5990);
        setField(term5989, term5989.getClass(), "namesToTypes", term5991);
        setField(term5989, term5989.getClass(), "namespaces", term5999);
        setField(term5989, term5989.getClass(), "nonNullableTypeNames", term6006);
        setField(term5989, term5989.getClass(), "forwardDeclaredTypes", term6013);
        setField(term5989, term5989.getClass(), "typesIndexedByProperty", term6020);
        setField(term5989, term5989.getClass(), "eachRefTypeIndexedByProperty", term6028);
        setField(term5989, term5989.getClass(), "greatestSubtypeByProperty", term6033);
        setField(term5989, term5989.getClass(), "interfaceToImplementors", null);
        setField(term5989, term5989.getClass(), "unresolvedNamedTypes", null);
        setField(term5989, term5989.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term5989, term5989.getClass(), "lastGeneration", false);
        setField(term5989, term5989.getClass(), "templateTypeName", null);
        setField(term5989, term5989.getClass(), "templateType", null);
        setBooleanField(term5989, term5989.getClass(), "tolerateUndefinedValues", false);
        setField(term5989, term5989.getClass(), "resolveMode", null);
        setField(term5988, term5988.getClass(), "registry", term5989);
        setField(term5988, term5988.getClass(), "reverseInterpreter", null);
        setField(term5988, term5988.getClass(), "syntacticScope", null);
        setField(term5988, term5988.getClass(), "functionScope", null);
        setField(term5988, term5988.getClass(), "bottomScope", null);
        setField(term5988, term5988.getClass(), "assertionFunctionsMap", null);
        setField(term5988, term5988.getClass(), "cfg", null);
        setField(term5988, term5988.getClass(), "joinOp", null);
        setField(term5988, term5988.getClass(), "orderedWorkSet", null);
        term6043 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        Object term6056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term6043, term6043.getClass(), "name", "kmgEVEqTGa");
        setIntField(term6056, term6056.getClass(), "type", -1428063820);
        setIntField(term6058, term6058.getClass(), "type", -1271375703);
        setIntField(term6060, term6060.getClass(), "type", 1136208236);
        setIntField(term6062, term6062.getClass(), "type", -1220630391);
        setField(term6062, term6062.getClass(), "next", null);
        setField(term6062, term6062.getClass(), "first", null);
        setField(term6062, term6062.getClass(), "last", null);
        setField(term6062, term6062.getClass(), "propListHead", null);
        setIntField(term6062, term6062.getClass(), "sourcePosition", 0);
        setField(term6062, term6062.getClass(), "jsType", null);
        setField(term6062, term6062.getClass(), "parent", null);
        setField(term6060, term6060.getClass(), "next", term6062);
        setIntField(term6065, term6065.getClass(), "type", 40571662);
        setField(term6065, term6065.getClass(), "next", null);
        setField(term6065, term6065.getClass(), "first", term6056);
        setField(term6065, term6065.getClass(), "last", null);
        setField(term6065, term6065.getClass(), "propListHead", null);
        setIntField(term6065, term6065.getClass(), "sourcePosition", 0);
        setField(term6065, term6065.getClass(), "jsType", null);
        setField(term6065, term6065.getClass(), "parent", null);
        setField(term6060, term6060.getClass(), "first", term6065);
        setIntField(term6068, term6068.getClass(), "type", -687282231);
        setField(term6068, term6068.getClass(), "next", null);
        setField(term6068, term6068.getClass(), "first", term6058);
        setField(term6068, term6068.getClass(), "last", null);
        setField(term6068, term6068.getClass(), "propListHead", null);
        setIntField(term6068, term6068.getClass(), "sourcePosition", 0);
        setField(term6068, term6068.getClass(), "jsType", null);
        setField(term6068, term6068.getClass(), "parent", null);
        setField(term6060, term6060.getClass(), "last", term6068);
        setField(term6060, term6060.getClass(), "propListHead", null);
        setIntField(term6060, term6060.getClass(), "sourcePosition", 0);
        setField(term6060, term6060.getClass(), "jsType", null);
        setField(term6060, term6060.getClass(), "parent", null);
        setField(term6058, term6058.getClass(), "next", term6060);
        setField(term6058, term6058.getClass(), "first", term6060);
        setIntField(term6072, term6072.getClass(), "type", -995822131);
        setField(term6072, term6072.getClass(), "next", term6068);
        setField(term6072, term6072.getClass(), "first", term6065);
        setField(term6072, term6072.getClass(), "last", term6065);
        setField(term6072, term6072.getClass(), "propListHead", null);
        setIntField(term6072, term6072.getClass(), "sourcePosition", 0);
        setField(term6072, term6072.getClass(), "jsType", null);
        setField(term6072, term6072.getClass(), "parent", null);
        setField(term6058, term6058.getClass(), "last", term6072);
        setField(term6058, term6058.getClass(), "propListHead", null);
        setIntField(term6058, term6058.getClass(), "sourcePosition", 0);
        setField(term6058, term6058.getClass(), "jsType", null);
        setField(term6058, term6058.getClass(), "parent", null);
        setField(term6056, term6056.getClass(), "next", term6058);
        setField(term6056, term6056.getClass(), "first", term6065);
        setIntField(term6076, term6076.getClass(), "type", 0);
        setField(term6076, term6076.getClass(), "next", null);
        setField(term6076, term6076.getClass(), "first", null);
        setField(term6076, term6076.getClass(), "last", null);
        setField(term6076, term6076.getClass(), "propListHead", null);
        setIntField(term6076, term6076.getClass(), "sourcePosition", 0);
        setField(term6076, term6076.getClass(), "jsType", null);
        setField(term6076, term6076.getClass(), "parent", null);
        setField(term6056, term6056.getClass(), "last", term6076);
        setField(term6056, term6056.getClass(), "propListHead", null);
        setIntField(term6056, term6056.getClass(), "sourcePosition", 0);
        setField(term6056, term6056.getClass(), "jsType", null);
        setField(term6056, term6056.getClass(), "parent", null);
        setField(term6043, term6043.getClass(), "nameNode", term6056);
        setField(term6043, term6043.getClass(), "type", null);
        setField(term6043, term6043.getClass(), "info", null);
        setBooleanField(term6043, term6043.getClass(), "typeInferred", false);
        setField(term6043, term6043.getClass(), "input", null);
        setBooleanField(term6043, term6043.getClass(), "isDefine", false);
        setIntField(term6043, term6043.getClass(), "index", 0);
        setField(term6043, term6043.getClass(), "scope", null);
        setBooleanField(term6043, term6043.getClass(), "markedEscaped", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Object[] args = new Object[1];
        args[0] = term6043;
        try {
            callMethod(klass, "isUnflowable", argTypes, term5988, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


