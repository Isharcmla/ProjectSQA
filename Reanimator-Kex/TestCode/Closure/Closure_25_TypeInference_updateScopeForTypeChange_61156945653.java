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

public class TypeInference_updateScopeForTypeChange_61156945653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term832;
     Object term887;

    public TypeInference_updateScopeForTypeChange_61156945653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term835 = new HashMap();
        HashMap term844 = new HashMap();
        Set<Object> term10444 =  ((Map) term844).keySet();
        HashSet term843 = new HashSet((Collection<? extends Object>) term10444);
        HashMap term851 = new HashMap();
        Set<Object> term10445 =  ((Map) term851).keySet();
        HashSet term850 = new HashSet((Collection<? extends Object>) term10445);
        HashMap term858 = new HashMap();
        Set<Object> term10446 =  ((Map) term858).keySet();
        HashSet term857 = new HashSet((Collection<? extends Object>) term10446);
        HashMap term864 = new HashMap();
        HashMap term872 = new HashMap();
        HashMap term877 = new HashMap();
        term832 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term833 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term834 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        setField(term832, term832.getClass(), "compiler", null);
        setField(term833, term833.getClass(), "reporter", null);
        setField(term833, term833.getClass(), "nativeTypes", term834);
        setField(term833, term833.getClass(), "namesToTypes", term835);
        setField(term833, term833.getClass(), "namespaces", term843);
        setField(term833, term833.getClass(), "nonNullableTypeNames", term850);
        setField(term833, term833.getClass(), "forwardDeclaredTypes", term857);
        setField(term833, term833.getClass(), "typesIndexedByProperty", term864);
        setField(term833, term833.getClass(), "eachRefTypeIndexedByProperty", term872);
        setField(term833, term833.getClass(), "greatestSubtypeByProperty", term877);
        setField(term833, term833.getClass(), "interfaceToImplementors", null);
        setField(term833, term833.getClass(), "unresolvedNamedTypes", null);
        setField(term833, term833.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term833, term833.getClass(), "lastGeneration", false);
        setField(term833, term833.getClass(), "templateTypeName", null);
        setField(term833, term833.getClass(), "templateType", null);
        setBooleanField(term833, term833.getClass(), "tolerateUndefinedValues", false);
        setField(term833, term833.getClass(), "resolveMode", null);
        setField(term832, term832.getClass(), "registry", term833);
        setField(term832, term832.getClass(), "reverseInterpreter", null);
        setField(term832, term832.getClass(), "syntacticScope", null);
        setField(term832, term832.getClass(), "functionScope", null);
        setField(term832, term832.getClass(), "bottomScope", null);
        setField(term832, term832.getClass(), "assertionFunctionsMap", null);
        setField(term832, term832.getClass(), "cfg", null);
        setField(term832, term832.getClass(), "joinOp", null);
        setField(term832, term832.getClass(), "orderedWorkSet", null);
        term887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term887, term887.getClass(), "type", 1045657203);
        setIntField(term889, term889.getClass(), "type", 1386130016);
        setIntField(term891, term891.getClass(), "type", 1072005683);
        setIntField(term893, term893.getClass(), "type", 1861318859);
        setIntField(term895, term895.getClass(), "type", 1474524152);
        setField(term895, term895.getClass(), "next", null);
        setField(term895, term895.getClass(), "first", null);
        setField(term895, term895.getClass(), "last", null);
        setField(term895, term895.getClass(), "propListHead", null);
        setIntField(term895, term895.getClass(), "sourcePosition", 0);
        setField(term895, term895.getClass(), "jsType", null);
        setField(term895, term895.getClass(), "parent", null);
        setField(term893, term893.getClass(), "next", term895);
        setIntField(term898, term898.getClass(), "type", 568954359);
        setField(term898, term898.getClass(), "next", null);
        setField(term898, term898.getClass(), "first", null);
        setField(term898, term898.getClass(), "last", term895);
        setField(term898, term898.getClass(), "propListHead", null);
        setIntField(term898, term898.getClass(), "sourcePosition", 0);
        setField(term898, term898.getClass(), "jsType", null);
        setField(term898, term898.getClass(), "parent", null);
        setField(term893, term893.getClass(), "first", term898);
        setField(term893, term893.getClass(), "last", term891);
        setField(term893, term893.getClass(), "propListHead", null);
        setIntField(term893, term893.getClass(), "sourcePosition", 0);
        setField(term893, term893.getClass(), "jsType", null);
        setField(term893, term893.getClass(), "parent", null);
        setField(term891, term891.getClass(), "next", term893);
        setField(term891, term891.getClass(), "first", term895);
        setIntField(term902, term902.getClass(), "type", -375014958);
        setIntField(term904, term904.getClass(), "type", 1107176718);
        setField(term904, term904.getClass(), "next", null);
        setField(term904, term904.getClass(), "first", term898);
        setField(term904, term904.getClass(), "last", term893);
        setField(term904, term904.getClass(), "propListHead", null);
        setIntField(term904, term904.getClass(), "sourcePosition", 0);
        setField(term904, term904.getClass(), "jsType", null);
        setField(term904, term904.getClass(), "parent", null);
        setField(term902, term902.getClass(), "next", term904);
        setField(term902, term902.getClass(), "first", term889);
        setField(term902, term902.getClass(), "last", term889);
        setField(term902, term902.getClass(), "propListHead", null);
        setIntField(term902, term902.getClass(), "sourcePosition", 0);
        setField(term902, term902.getClass(), "jsType", null);
        setField(term902, term902.getClass(), "parent", null);
        setField(term891, term891.getClass(), "last", term902);
        setField(term891, term891.getClass(), "propListHead", null);
        setIntField(term891, term891.getClass(), "sourcePosition", 0);
        setField(term891, term891.getClass(), "jsType", null);
        setField(term891, term891.getClass(), "parent", null);
        setField(term889, term889.getClass(), "next", term891);
        setIntField(term909, term909.getClass(), "type", 480137250);
        setField(term909, term909.getClass(), "next", term902);
        setField(term909, term909.getClass(), "first", term904);
        setField(term909, term909.getClass(), "last", term887);
        setField(term909, term909.getClass(), "propListHead", null);
        setIntField(term909, term909.getClass(), "sourcePosition", 0);
        setField(term909, term909.getClass(), "jsType", null);
        setField(term909, term909.getClass(), "parent", null);
        setField(term889, term889.getClass(), "first", term909);
        setField(term889, term889.getClass(), "last", term909);
        setField(term889, term889.getClass(), "propListHead", null);
        setIntField(term889, term889.getClass(), "sourcePosition", 0);
        setField(term889, term889.getClass(), "jsType", null);
        setField(term889, term889.getClass(), "parent", null);
        setField(term887, term887.getClass(), "next", term889);
        setField(term887, term887.getClass(), "first", term893);
        setField(term887, term887.getClass(), "last", term895);
        setField(term887, term887.getClass(), "propListHead", null);
        setIntField(term887, term887.getClass(), "sourcePosition", 0);
        setField(term887, term887.getClass(), "jsType", null);
        setField(term887, term887.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term887;
        args[2] = null;
        args[3] = null;
        try {
            callMethod(klass, "updateScopeForTypeChange", argTypes, term832, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


