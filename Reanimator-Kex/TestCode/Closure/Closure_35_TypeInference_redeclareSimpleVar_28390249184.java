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

public class TypeInference_redeclareSimpleVar_28390249184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5903;
     Object term5958;

    public TypeInference_redeclareSimpleVar_28390249184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5906 = new HashMap();
        HashMap term5915 = new HashMap();
        Set<Object> term26458 =  ((Map) term5915).keySet();
        HashSet term5914 = new HashSet((Collection<? extends Object>) term26458);
        HashMap term5922 = new HashMap();
        Set<Object> term26459 =  ((Map) term5922).keySet();
        HashSet term5921 = new HashSet((Collection<? extends Object>) term26459);
        HashMap term5929 = new HashMap();
        Set<Object> term26460 =  ((Map) term5929).keySet();
        HashSet term5928 = new HashSet((Collection<? extends Object>) term26460);
        HashMap term5935 = new HashMap();
        HashMap term5943 = new HashMap();
        HashMap term5948 = new HashMap();
        term5903 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term5904 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term5905 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term5903, term5903.getClass(), "compiler", null);
        setField(term5904, term5904.getClass(), "reporter", null);
        setField(term5904, term5904.getClass(), "nativeTypes", term5905);
        setField(term5904, term5904.getClass(), "namesToTypes", term5906);
        setField(term5904, term5904.getClass(), "namespaces", term5914);
        setField(term5904, term5904.getClass(), "nonNullableTypeNames", term5921);
        setField(term5904, term5904.getClass(), "forwardDeclaredTypes", term5928);
        setField(term5904, term5904.getClass(), "typesIndexedByProperty", term5935);
        setField(term5904, term5904.getClass(), "eachRefTypeIndexedByProperty", term5943);
        setField(term5904, term5904.getClass(), "greatestSubtypeByProperty", term5948);
        setField(term5904, term5904.getClass(), "interfaceToImplementors", null);
        setField(term5904, term5904.getClass(), "unresolvedNamedTypes", null);
        setField(term5904, term5904.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term5904, term5904.getClass(), "lastGeneration", false);
        setField(term5904, term5904.getClass(), "templateTypeName", null);
        setField(term5904, term5904.getClass(), "templateType", null);
        setBooleanField(term5904, term5904.getClass(), "tolerateUndefinedValues", false);
        setField(term5904, term5904.getClass(), "resolveMode", null);
        setField(term5903, term5903.getClass(), "registry", term5904);
        setField(term5903, term5903.getClass(), "reverseInterpreter", null);
        setField(term5903, term5903.getClass(), "syntacticScope", null);
        setField(term5903, term5903.getClass(), "functionScope", null);
        setField(term5903, term5903.getClass(), "bottomScope", null);
        setField(term5903, term5903.getClass(), "assertionFunctionsMap", null);
        setField(term5903, term5903.getClass(), "cfg", null);
        setField(term5903, term5903.getClass(), "joinOp", null);
        setField(term5903, term5903.getClass(), "orderedWorkSet", null);
        term5958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5958, term5958.getClass(), "type", 1467356494);
        setIntField(term5960, term5960.getClass(), "type", -26316536);
        setIntField(term5962, term5962.getClass(), "type", 1716165145);
        setIntField(term5964, term5964.getClass(), "type", 1692937831);
        setIntField(term5966, term5966.getClass(), "type", -1539747985);
        setField(term5966, term5966.getClass(), "next", null);
        setField(term5966, term5966.getClass(), "first", null);
        setField(term5966, term5966.getClass(), "last", null);
        setField(term5966, term5966.getClass(), "propListHead", null);
        setIntField(term5966, term5966.getClass(), "sourcePosition", 0);
        setField(term5966, term5966.getClass(), "jsType", null);
        setField(term5966, term5966.getClass(), "parent", null);
        setField(term5964, term5964.getClass(), "next", term5966);
        setIntField(term5969, term5969.getClass(), "type", -1982489643);
        setField(term5969, term5969.getClass(), "next", null);
        setField(term5969, term5969.getClass(), "first", null);
        setField(term5969, term5969.getClass(), "last", term5966);
        setField(term5969, term5969.getClass(), "propListHead", null);
        setIntField(term5969, term5969.getClass(), "sourcePosition", 0);
        setField(term5969, term5969.getClass(), "jsType", null);
        setField(term5969, term5969.getClass(), "parent", null);
        setField(term5964, term5964.getClass(), "first", term5969);
        setField(term5964, term5964.getClass(), "last", term5962);
        setField(term5964, term5964.getClass(), "propListHead", null);
        setIntField(term5964, term5964.getClass(), "sourcePosition", 0);
        setField(term5964, term5964.getClass(), "jsType", null);
        setField(term5964, term5964.getClass(), "parent", null);
        setField(term5962, term5962.getClass(), "next", term5964);
        setField(term5962, term5962.getClass(), "first", term5966);
        setIntField(term5973, term5973.getClass(), "type", 1237549886);
        setIntField(term5975, term5975.getClass(), "type", -1945635750);
        setField(term5975, term5975.getClass(), "next", null);
        setField(term5975, term5975.getClass(), "first", term5969);
        setField(term5975, term5975.getClass(), "last", term5964);
        setField(term5975, term5975.getClass(), "propListHead", null);
        setIntField(term5975, term5975.getClass(), "sourcePosition", 0);
        setField(term5975, term5975.getClass(), "jsType", null);
        setField(term5975, term5975.getClass(), "parent", null);
        setField(term5973, term5973.getClass(), "next", term5975);
        setField(term5973, term5973.getClass(), "first", term5960);
        setField(term5973, term5973.getClass(), "last", term5960);
        setField(term5973, term5973.getClass(), "propListHead", null);
        setIntField(term5973, term5973.getClass(), "sourcePosition", 0);
        setField(term5973, term5973.getClass(), "jsType", null);
        setField(term5973, term5973.getClass(), "parent", null);
        setField(term5962, term5962.getClass(), "last", term5973);
        setField(term5962, term5962.getClass(), "propListHead", null);
        setIntField(term5962, term5962.getClass(), "sourcePosition", 0);
        setField(term5962, term5962.getClass(), "jsType", null);
        setField(term5962, term5962.getClass(), "parent", null);
        setField(term5960, term5960.getClass(), "next", term5962);
        setIntField(term5980, term5980.getClass(), "type", -1622760744);
        setField(term5980, term5980.getClass(), "next", term5973);
        setField(term5980, term5980.getClass(), "first", term5975);
        setField(term5980, term5980.getClass(), "last", term5958);
        setField(term5980, term5980.getClass(), "propListHead", null);
        setIntField(term5980, term5980.getClass(), "sourcePosition", 0);
        setField(term5980, term5980.getClass(), "jsType", null);
        setField(term5980, term5980.getClass(), "parent", null);
        setField(term5960, term5960.getClass(), "first", term5980);
        setField(term5960, term5960.getClass(), "last", term5980);
        setField(term5960, term5960.getClass(), "propListHead", null);
        setIntField(term5960, term5960.getClass(), "sourcePosition", 0);
        setField(term5960, term5960.getClass(), "jsType", null);
        setField(term5960, term5960.getClass(), "parent", null);
        setField(term5958, term5958.getClass(), "next", term5960);
        setField(term5958, term5958.getClass(), "first", term5964);
        setField(term5958, term5958.getClass(), "last", term5966);
        setField(term5958, term5958.getClass(), "propListHead", null);
        setIntField(term5958, term5958.getClass(), "sourcePosition", 0);
        setField(term5958, term5958.getClass(), "jsType", null);
        setField(term5958, term5958.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.FlowScope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term5958;
        args[2] = null;
        try {
            callMethod(klass, "redeclareSimpleVar", argTypes, term5903, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


