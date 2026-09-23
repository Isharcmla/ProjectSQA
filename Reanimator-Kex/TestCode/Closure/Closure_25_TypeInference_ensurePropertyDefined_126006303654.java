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

public class TypeInference_ensurePropertyDefined_126006303654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term917;
     Object term971;

    public TypeInference_ensurePropertyDefined_126006303654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term920 = new HashMap();
        HashMap term929 = new HashMap();
        Set<Object> term10756 =  ((Map) term929).keySet();
        HashSet term928 = new HashSet((Collection<? extends Object>) term10756);
        HashMap term935 = new HashMap();
        Set<Object> term10757 =  ((Map) term935).keySet();
        HashSet term934 = new HashSet((Collection<? extends Object>) term10757);
        HashMap term942 = new HashMap();
        Set<Object> term10758 =  ((Map) term942).keySet();
        HashSet term941 = new HashSet((Collection<? extends Object>) term10758);
        HashMap term948 = new HashMap();
        HashMap term956 = new HashMap();
        HashMap term961 = new HashMap();
        term917 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term918 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term919 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term917, term917.getClass(), "compiler", null);
        setField(term918, term918.getClass(), "reporter", null);
        setField(term918, term918.getClass(), "nativeTypes", term919);
        setField(term918, term918.getClass(), "namesToTypes", term920);
        setField(term918, term918.getClass(), "namespaces", term928);
        setField(term918, term918.getClass(), "nonNullableTypeNames", term934);
        setField(term918, term918.getClass(), "forwardDeclaredTypes", term941);
        setField(term918, term918.getClass(), "typesIndexedByProperty", term948);
        setField(term918, term918.getClass(), "eachRefTypeIndexedByProperty", term956);
        setField(term918, term918.getClass(), "greatestSubtypeByProperty", term961);
        setField(term918, term918.getClass(), "interfaceToImplementors", null);
        setField(term918, term918.getClass(), "unresolvedNamedTypes", null);
        setField(term918, term918.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term918, term918.getClass(), "lastGeneration", false);
        setField(term918, term918.getClass(), "templateTypeName", null);
        setField(term918, term918.getClass(), "templateType", null);
        setBooleanField(term918, term918.getClass(), "tolerateUndefinedValues", false);
        setField(term918, term918.getClass(), "resolveMode", null);
        setField(term917, term917.getClass(), "registry", term918);
        setField(term917, term917.getClass(), "reverseInterpreter", null);
        setField(term917, term917.getClass(), "syntacticScope", null);
        setField(term917, term917.getClass(), "functionScope", null);
        setField(term917, term917.getClass(), "bottomScope", null);
        setField(term917, term917.getClass(), "assertionFunctionsMap", null);
        setField(term917, term917.getClass(), "cfg", null);
        setField(term917, term917.getClass(), "joinOp", null);
        setField(term917, term917.getClass(), "orderedWorkSet", null);
        term971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term971, term971.getClass(), "type", -343325701);
        setIntField(term973, term973.getClass(), "type", 107945604);
        setIntField(term975, term975.getClass(), "type", -1963464809);
        setIntField(term977, term977.getClass(), "type", 71190297);
        setIntField(term979, term979.getClass(), "type", 1202361360);
        setField(term979, term979.getClass(), "next", null);
        setField(term979, term979.getClass(), "first", null);
        setField(term979, term979.getClass(), "last", null);
        setField(term979, term979.getClass(), "propListHead", null);
        setIntField(term979, term979.getClass(), "sourcePosition", 0);
        setField(term979, term979.getClass(), "jsType", null);
        setField(term979, term979.getClass(), "parent", null);
        setField(term977, term977.getClass(), "next", term979);
        setIntField(term982, term982.getClass(), "type", -2015048153);
        setField(term982, term982.getClass(), "next", null);
        setField(term982, term982.getClass(), "first", null);
        setField(term982, term982.getClass(), "last", term979);
        setField(term982, term982.getClass(), "propListHead", null);
        setIntField(term982, term982.getClass(), "sourcePosition", 0);
        setField(term982, term982.getClass(), "jsType", null);
        setField(term982, term982.getClass(), "parent", null);
        setField(term977, term977.getClass(), "first", term982);
        setField(term977, term977.getClass(), "last", term975);
        setField(term977, term977.getClass(), "propListHead", null);
        setIntField(term977, term977.getClass(), "sourcePosition", 0);
        setField(term977, term977.getClass(), "jsType", null);
        setField(term977, term977.getClass(), "parent", null);
        setField(term975, term975.getClass(), "next", term977);
        setField(term975, term975.getClass(), "first", term979);
        setIntField(term986, term986.getClass(), "type", -1222006000);
        setIntField(term988, term988.getClass(), "type", 2095798786);
        setField(term988, term988.getClass(), "next", null);
        setField(term988, term988.getClass(), "first", term982);
        setField(term988, term988.getClass(), "last", term977);
        setField(term988, term988.getClass(), "propListHead", null);
        setIntField(term988, term988.getClass(), "sourcePosition", 0);
        setField(term988, term988.getClass(), "jsType", null);
        setField(term988, term988.getClass(), "parent", null);
        setField(term986, term986.getClass(), "next", term988);
        setField(term986, term986.getClass(), "first", term973);
        setField(term986, term986.getClass(), "last", term973);
        setField(term986, term986.getClass(), "propListHead", null);
        setIntField(term986, term986.getClass(), "sourcePosition", 0);
        setField(term986, term986.getClass(), "jsType", null);
        setField(term986, term986.getClass(), "parent", null);
        setField(term975, term975.getClass(), "last", term986);
        setField(term975, term975.getClass(), "propListHead", null);
        setIntField(term975, term975.getClass(), "sourcePosition", 0);
        setField(term975, term975.getClass(), "jsType", null);
        setField(term975, term975.getClass(), "parent", null);
        setField(term973, term973.getClass(), "next", term975);
        setIntField(term993, term993.getClass(), "type", -1565502840);
        setField(term993, term993.getClass(), "next", term986);
        setField(term993, term993.getClass(), "first", term988);
        setField(term993, term993.getClass(), "last", term971);
        setField(term993, term993.getClass(), "propListHead", null);
        setIntField(term993, term993.getClass(), "sourcePosition", 0);
        setField(term993, term993.getClass(), "jsType", null);
        setField(term993, term993.getClass(), "parent", null);
        setField(term973, term973.getClass(), "first", term993);
        setField(term973, term973.getClass(), "last", term993);
        setField(term973, term973.getClass(), "propListHead", null);
        setIntField(term973, term973.getClass(), "sourcePosition", 0);
        setField(term973, term973.getClass(), "jsType", null);
        setField(term973, term973.getClass(), "parent", null);
        setField(term971, term971.getClass(), "next", term973);
        setField(term971, term971.getClass(), "first", term977);
        setField(term971, term971.getClass(), "last", term979);
        setField(term971, term971.getClass(), "propListHead", null);
        setIntField(term971, term971.getClass(), "sourcePosition", 0);
        setField(term971, term971.getClass(), "jsType", null);
        setField(term971, term971.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term971;
        args[1] = null;
        try {
            callMethod(klass, "ensurePropertyDefined", argTypes, term917, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


