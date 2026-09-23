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

public class TypeInference_traverseAnd_204102321571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3751;
     Object term3805;

    public TypeInference_traverseAnd_204102321571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3754 = new HashMap();
        HashMap term3763 = new HashMap();
        Set<Object> term18790 =  ((Map) term3763).keySet();
        HashSet term3762 = new HashSet((Collection<? extends Object>) term18790);
        HashMap term3770 = new HashMap();
        Set<Object> term18791 =  ((Map) term3770).keySet();
        HashSet term3769 = new HashSet((Collection<? extends Object>) term18791);
        HashMap term3777 = new HashMap();
        Set<Object> term18792 =  ((Map) term3777).keySet();
        HashSet term3776 = new HashSet((Collection<? extends Object>) term18792);
        HashMap term3782 = new HashMap();
        HashMap term3790 = new HashMap();
        HashMap term3795 = new HashMap();
        term3751 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term3752 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term3753 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term3751, term3751.getClass(), "compiler", null);
        setField(term3752, term3752.getClass(), "reporter", null);
        setField(term3752, term3752.getClass(), "nativeTypes", term3753);
        setField(term3752, term3752.getClass(), "namesToTypes", term3754);
        setField(term3752, term3752.getClass(), "namespaces", term3762);
        setField(term3752, term3752.getClass(), "nonNullableTypeNames", term3769);
        setField(term3752, term3752.getClass(), "forwardDeclaredTypes", term3776);
        setField(term3752, term3752.getClass(), "typesIndexedByProperty", term3782);
        setField(term3752, term3752.getClass(), "eachRefTypeIndexedByProperty", term3790);
        setField(term3752, term3752.getClass(), "greatestSubtypeByProperty", term3795);
        setField(term3752, term3752.getClass(), "interfaceToImplementors", null);
        setField(term3752, term3752.getClass(), "unresolvedNamedTypes", null);
        setField(term3752, term3752.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term3752, term3752.getClass(), "lastGeneration", false);
        setField(term3752, term3752.getClass(), "templateTypeName", null);
        setField(term3752, term3752.getClass(), "templateType", null);
        setBooleanField(term3752, term3752.getClass(), "tolerateUndefinedValues", false);
        setField(term3752, term3752.getClass(), "resolveMode", null);
        setField(term3751, term3751.getClass(), "registry", term3752);
        setField(term3751, term3751.getClass(), "reverseInterpreter", null);
        setField(term3751, term3751.getClass(), "syntacticScope", null);
        setField(term3751, term3751.getClass(), "functionScope", null);
        setField(term3751, term3751.getClass(), "bottomScope", null);
        setField(term3751, term3751.getClass(), "assertionFunctionsMap", null);
        setField(term3751, term3751.getClass(), "cfg", null);
        setField(term3751, term3751.getClass(), "joinOp", null);
        setField(term3751, term3751.getClass(), "orderedWorkSet", null);
        term3805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3816 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3805, term3805.getClass(), "type", 1658391716);
        setIntField(term3807, term3807.getClass(), "type", 2143282300);
        setIntField(term3809, term3809.getClass(), "type", 1137624258);
        setIntField(term3811, term3811.getClass(), "type", 977862393);
        setIntField(term3813, term3813.getClass(), "type", 301401782);
        setField(term3813, term3813.getClass(), "next", null);
        setField(term3813, term3813.getClass(), "first", null);
        setField(term3813, term3813.getClass(), "last", null);
        setField(term3813, term3813.getClass(), "propListHead", null);
        setIntField(term3813, term3813.getClass(), "sourcePosition", 0);
        setField(term3813, term3813.getClass(), "jsType", null);
        setField(term3813, term3813.getClass(), "parent", null);
        setField(term3811, term3811.getClass(), "next", term3813);
        setIntField(term3816, term3816.getClass(), "type", 1988605357);
        setField(term3816, term3816.getClass(), "next", null);
        setField(term3816, term3816.getClass(), "first", null);
        setField(term3816, term3816.getClass(), "last", term3813);
        setField(term3816, term3816.getClass(), "propListHead", null);
        setIntField(term3816, term3816.getClass(), "sourcePosition", 0);
        setField(term3816, term3816.getClass(), "jsType", null);
        setField(term3816, term3816.getClass(), "parent", null);
        setField(term3811, term3811.getClass(), "first", term3816);
        setField(term3811, term3811.getClass(), "last", term3809);
        setField(term3811, term3811.getClass(), "propListHead", null);
        setIntField(term3811, term3811.getClass(), "sourcePosition", 0);
        setField(term3811, term3811.getClass(), "jsType", null);
        setField(term3811, term3811.getClass(), "parent", null);
        setField(term3809, term3809.getClass(), "next", term3811);
        setField(term3809, term3809.getClass(), "first", term3813);
        setIntField(term3820, term3820.getClass(), "type", -544382127);
        setIntField(term3822, term3822.getClass(), "type", -1830198043);
        setField(term3822, term3822.getClass(), "next", null);
        setField(term3822, term3822.getClass(), "first", term3816);
        setField(term3822, term3822.getClass(), "last", term3811);
        setField(term3822, term3822.getClass(), "propListHead", null);
        setIntField(term3822, term3822.getClass(), "sourcePosition", 0);
        setField(term3822, term3822.getClass(), "jsType", null);
        setField(term3822, term3822.getClass(), "parent", null);
        setField(term3820, term3820.getClass(), "next", term3822);
        setField(term3820, term3820.getClass(), "first", term3807);
        setField(term3820, term3820.getClass(), "last", term3807);
        setField(term3820, term3820.getClass(), "propListHead", null);
        setIntField(term3820, term3820.getClass(), "sourcePosition", 0);
        setField(term3820, term3820.getClass(), "jsType", null);
        setField(term3820, term3820.getClass(), "parent", null);
        setField(term3809, term3809.getClass(), "last", term3820);
        setField(term3809, term3809.getClass(), "propListHead", null);
        setIntField(term3809, term3809.getClass(), "sourcePosition", 0);
        setField(term3809, term3809.getClass(), "jsType", null);
        setField(term3809, term3809.getClass(), "parent", null);
        setField(term3807, term3807.getClass(), "next", term3809);
        setIntField(term3827, term3827.getClass(), "type", -439048495);
        setField(term3827, term3827.getClass(), "next", term3820);
        setField(term3827, term3827.getClass(), "first", term3822);
        setField(term3827, term3827.getClass(), "last", term3805);
        setField(term3827, term3827.getClass(), "propListHead", null);
        setIntField(term3827, term3827.getClass(), "sourcePosition", 0);
        setField(term3827, term3827.getClass(), "jsType", null);
        setField(term3827, term3827.getClass(), "parent", null);
        setField(term3807, term3807.getClass(), "first", term3827);
        setField(term3807, term3807.getClass(), "last", term3827);
        setField(term3807, term3807.getClass(), "propListHead", null);
        setIntField(term3807, term3807.getClass(), "sourcePosition", 0);
        setField(term3807, term3807.getClass(), "jsType", null);
        setField(term3807, term3807.getClass(), "parent", null);
        setField(term3805, term3805.getClass(), "next", term3807);
        setField(term3805, term3805.getClass(), "first", term3811);
        setField(term3805, term3805.getClass(), "last", term3813);
        setField(term3805, term3805.getClass(), "propListHead", null);
        setIntField(term3805, term3805.getClass(), "sourcePosition", 0);
        setField(term3805, term3805.getClass(), "jsType", null);
        setField(term3805, term3805.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term3805;
        args[1] = null;
        try {
            callMethod(klass, "traverseAnd", argTypes, term3751, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


