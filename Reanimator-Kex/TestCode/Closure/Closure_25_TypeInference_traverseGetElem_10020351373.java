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

public class TypeInference_traverseGetElem_10020351373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3918;
     Object term3973;

    public TypeInference_traverseGetElem_10020351373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3921 = new HashMap();
        HashMap term3930 = new HashMap();
        Set<Object> term19441 =  ((Map) term3930).keySet();
        HashSet term3929 = new HashSet((Collection<? extends Object>) term19441);
        HashMap term3937 = new HashMap();
        Set<Object> term19442 =  ((Map) term3937).keySet();
        HashSet term3936 = new HashSet((Collection<? extends Object>) term19442);
        HashMap term3944 = new HashMap();
        Set<Object> term19443 =  ((Map) term3944).keySet();
        HashSet term3943 = new HashSet((Collection<? extends Object>) term19443);
        HashMap term3950 = new HashMap();
        HashMap term3958 = new HashMap();
        HashMap term3963 = new HashMap();
        term3918 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term3919 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term3920 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 4);
        setField(term3918, term3918.getClass(), "compiler", null);
        setField(term3919, term3919.getClass(), "reporter", null);
        setField(term3919, term3919.getClass(), "nativeTypes", term3920);
        setField(term3919, term3919.getClass(), "namesToTypes", term3921);
        setField(term3919, term3919.getClass(), "namespaces", term3929);
        setField(term3919, term3919.getClass(), "nonNullableTypeNames", term3936);
        setField(term3919, term3919.getClass(), "forwardDeclaredTypes", term3943);
        setField(term3919, term3919.getClass(), "typesIndexedByProperty", term3950);
        setField(term3919, term3919.getClass(), "eachRefTypeIndexedByProperty", term3958);
        setField(term3919, term3919.getClass(), "greatestSubtypeByProperty", term3963);
        setField(term3919, term3919.getClass(), "interfaceToImplementors", null);
        setField(term3919, term3919.getClass(), "unresolvedNamedTypes", null);
        setField(term3919, term3919.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term3919, term3919.getClass(), "lastGeneration", false);
        setField(term3919, term3919.getClass(), "templateTypeName", null);
        setField(term3919, term3919.getClass(), "templateType", null);
        setBooleanField(term3919, term3919.getClass(), "tolerateUndefinedValues", false);
        setField(term3919, term3919.getClass(), "resolveMode", null);
        setField(term3918, term3918.getClass(), "registry", term3919);
        setField(term3918, term3918.getClass(), "reverseInterpreter", null);
        setField(term3918, term3918.getClass(), "syntacticScope", null);
        setField(term3918, term3918.getClass(), "functionScope", null);
        setField(term3918, term3918.getClass(), "bottomScope", null);
        setField(term3918, term3918.getClass(), "assertionFunctionsMap", null);
        setField(term3918, term3918.getClass(), "cfg", null);
        setField(term3918, term3918.getClass(), "joinOp", null);
        setField(term3918, term3918.getClass(), "orderedWorkSet", null);
        term3973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3973, term3973.getClass(), "type", -1748391876);
        setIntField(term3975, term3975.getClass(), "type", 43258317);
        setIntField(term3977, term3977.getClass(), "type", 1707220033);
        setIntField(term3979, term3979.getClass(), "type", -1792504217);
        setIntField(term3981, term3981.getClass(), "type", 1824538861);
        setField(term3981, term3981.getClass(), "next", null);
        setField(term3981, term3981.getClass(), "first", null);
        setField(term3981, term3981.getClass(), "last", null);
        setField(term3981, term3981.getClass(), "propListHead", null);
        setIntField(term3981, term3981.getClass(), "sourcePosition", 0);
        setField(term3981, term3981.getClass(), "jsType", null);
        setField(term3981, term3981.getClass(), "parent", null);
        setField(term3979, term3979.getClass(), "next", term3981);
        setIntField(term3984, term3984.getClass(), "type", 499519708);
        setField(term3984, term3984.getClass(), "next", null);
        setField(term3984, term3984.getClass(), "first", null);
        setField(term3984, term3984.getClass(), "last", term3981);
        setField(term3984, term3984.getClass(), "propListHead", null);
        setIntField(term3984, term3984.getClass(), "sourcePosition", 0);
        setField(term3984, term3984.getClass(), "jsType", null);
        setField(term3984, term3984.getClass(), "parent", null);
        setField(term3979, term3979.getClass(), "first", term3984);
        setField(term3979, term3979.getClass(), "last", term3977);
        setField(term3979, term3979.getClass(), "propListHead", null);
        setIntField(term3979, term3979.getClass(), "sourcePosition", 0);
        setField(term3979, term3979.getClass(), "jsType", null);
        setField(term3979, term3979.getClass(), "parent", null);
        setField(term3977, term3977.getClass(), "next", term3979);
        setField(term3977, term3977.getClass(), "first", term3981);
        setIntField(term3988, term3988.getClass(), "type", 510162332);
        setIntField(term3990, term3990.getClass(), "type", 888506903);
        setField(term3990, term3990.getClass(), "next", null);
        setField(term3990, term3990.getClass(), "first", term3984);
        setField(term3990, term3990.getClass(), "last", term3979);
        setField(term3990, term3990.getClass(), "propListHead", null);
        setIntField(term3990, term3990.getClass(), "sourcePosition", 0);
        setField(term3990, term3990.getClass(), "jsType", null);
        setField(term3990, term3990.getClass(), "parent", null);
        setField(term3988, term3988.getClass(), "next", term3990);
        setField(term3988, term3988.getClass(), "first", term3975);
        setField(term3988, term3988.getClass(), "last", term3975);
        setField(term3988, term3988.getClass(), "propListHead", null);
        setIntField(term3988, term3988.getClass(), "sourcePosition", 0);
        setField(term3988, term3988.getClass(), "jsType", null);
        setField(term3988, term3988.getClass(), "parent", null);
        setField(term3977, term3977.getClass(), "last", term3988);
        setField(term3977, term3977.getClass(), "propListHead", null);
        setIntField(term3977, term3977.getClass(), "sourcePosition", 0);
        setField(term3977, term3977.getClass(), "jsType", null);
        setField(term3977, term3977.getClass(), "parent", null);
        setField(term3975, term3975.getClass(), "next", term3977);
        setIntField(term3995, term3995.getClass(), "type", 200252898);
        setField(term3995, term3995.getClass(), "next", term3988);
        setField(term3995, term3995.getClass(), "first", term3990);
        setField(term3995, term3995.getClass(), "last", term3973);
        setField(term3995, term3995.getClass(), "propListHead", null);
        setIntField(term3995, term3995.getClass(), "sourcePosition", 0);
        setField(term3995, term3995.getClass(), "jsType", null);
        setField(term3995, term3995.getClass(), "parent", null);
        setField(term3975, term3975.getClass(), "first", term3995);
        setField(term3975, term3975.getClass(), "last", term3995);
        setField(term3975, term3975.getClass(), "propListHead", null);
        setIntField(term3975, term3975.getClass(), "sourcePosition", 0);
        setField(term3975, term3975.getClass(), "jsType", null);
        setField(term3975, term3975.getClass(), "parent", null);
        setField(term3973, term3973.getClass(), "next", term3975);
        setField(term3973, term3973.getClass(), "first", term3979);
        setField(term3973, term3973.getClass(), "last", term3981);
        setField(term3973, term3973.getClass(), "propListHead", null);
        setIntField(term3973, term3973.getClass(), "sourcePosition", 0);
        setField(term3973, term3973.getClass(), "jsType", null);
        setField(term3973, term3973.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term3973;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term3918, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


