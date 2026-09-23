package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class JSTypeRegistry_createFromTypeNodesInternal_1247680207161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13145;
     Object term13227;

    public JSTypeRegistry_createFromTypeNodesInternal_1247680207161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13147 = new HashMap();
        HashMap term13157 = new HashMap();
        Set<Object> term508750 =  ((Map) term13157).keySet();
        HashSet term13156 = new HashSet((Collection<? extends Object>) term508750);
        HashMap term13172 = new HashMap();
        Set<Object> term508751 =  ((Map) term13172).keySet();
        HashSet term13171 = new HashSet((Collection<? extends Object>) term508751);
        HashMap term13191 = new HashMap();
        Set<Object> term508752 =  ((Map) term13191).keySet();
        HashSet term13190 = new HashSet((Collection<? extends Object>) term508752);
        HashMap term13196 = new HashMap();
        HashMap term13211 = new HashMap();
        HashMap term13216 = new HashMap();
        term13145 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term13146 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term13145, term13145.getClass(), "reporter", null);
        setField(term13145, term13145.getClass(), "nativeTypes", term13146);
        setField(term13145, term13145.getClass(), "namesToTypes", term13147);
        setField(term13145, term13145.getClass(), "namespaces", term13156);
        setField(term13145, term13145.getClass(), "nonNullableTypeNames", term13171);
        setField(term13145, term13145.getClass(), "forwardDeclaredTypes", term13190);
        setField(term13145, term13145.getClass(), "typesIndexedByProperty", term13196);
        setField(term13145, term13145.getClass(), "eachRefTypeIndexedByProperty", term13211);
        setField(term13145, term13145.getClass(), "greatestSubtypeByProperty", term13216);
        setField(term13145, term13145.getClass(), "interfaceToImplementors", null);
        setField(term13145, term13145.getClass(), "unresolvedNamedTypes", null);
        setField(term13145, term13145.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term13145, term13145.getClass(), "lastGeneration", false);
        setField(term13145, term13145.getClass(), "templateTypeName", null);
        setField(term13145, term13145.getClass(), "templateType", null);
        setBooleanField(term13145, term13145.getClass(), "tolerateUndefinedValues", false);
        setField(term13145, term13145.getClass(), "resolveMode", null);
        term13227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13227, term13227.getClass(), "type", -865722613);
        setIntField(term13229, term13229.getClass(), "type", -1551355284);
        setIntField(term13231, term13231.getClass(), "type", -1381970335);
        setIntField(term13233, term13233.getClass(), "type", 1213549815);
        setIntField(term13235, term13235.getClass(), "type", -1518419301);
        setField(term13235, term13235.getClass(), "next", null);
        setField(term13235, term13235.getClass(), "first", null);
        setField(term13235, term13235.getClass(), "last", null);
        setField(term13235, term13235.getClass(), "propListHead", null);
        setIntField(term13235, term13235.getClass(), "sourcePosition", 0);
        setField(term13235, term13235.getClass(), "jsType", null);
        setField(term13235, term13235.getClass(), "parent", null);
        setField(term13233, term13233.getClass(), "next", term13235);
        setIntField(term13238, term13238.getClass(), "type", 674879025);
        setField(term13238, term13238.getClass(), "next", null);
        setField(term13238, term13238.getClass(), "first", null);
        setField(term13238, term13238.getClass(), "last", term13235);
        setField(term13238, term13238.getClass(), "propListHead", null);
        setIntField(term13238, term13238.getClass(), "sourcePosition", 0);
        setField(term13238, term13238.getClass(), "jsType", null);
        setField(term13238, term13238.getClass(), "parent", null);
        setField(term13233, term13233.getClass(), "first", term13238);
        setField(term13233, term13233.getClass(), "last", term13231);
        setField(term13233, term13233.getClass(), "propListHead", null);
        setIntField(term13233, term13233.getClass(), "sourcePosition", 0);
        setField(term13233, term13233.getClass(), "jsType", null);
        setField(term13233, term13233.getClass(), "parent", null);
        setField(term13231, term13231.getClass(), "next", term13233);
        setField(term13231, term13231.getClass(), "first", term13235);
        setIntField(term13242, term13242.getClass(), "type", -752870423);
        setIntField(term13244, term13244.getClass(), "type", -1698809299);
        setField(term13244, term13244.getClass(), "next", null);
        setField(term13244, term13244.getClass(), "first", term13238);
        setField(term13244, term13244.getClass(), "last", term13233);
        setField(term13244, term13244.getClass(), "propListHead", null);
        setIntField(term13244, term13244.getClass(), "sourcePosition", 0);
        setField(term13244, term13244.getClass(), "jsType", null);
        setField(term13244, term13244.getClass(), "parent", null);
        setField(term13242, term13242.getClass(), "next", term13244);
        setField(term13242, term13242.getClass(), "first", term13229);
        setField(term13242, term13242.getClass(), "last", term13229);
        setField(term13242, term13242.getClass(), "propListHead", null);
        setIntField(term13242, term13242.getClass(), "sourcePosition", 0);
        setField(term13242, term13242.getClass(), "jsType", null);
        setField(term13242, term13242.getClass(), "parent", null);
        setField(term13231, term13231.getClass(), "last", term13242);
        setField(term13231, term13231.getClass(), "propListHead", null);
        setIntField(term13231, term13231.getClass(), "sourcePosition", 0);
        setField(term13231, term13231.getClass(), "jsType", null);
        setField(term13231, term13231.getClass(), "parent", null);
        setField(term13229, term13229.getClass(), "next", term13231);
        setIntField(term13249, term13249.getClass(), "type", 401512128);
        setField(term13249, term13249.getClass(), "next", term13242);
        setField(term13249, term13249.getClass(), "first", term13244);
        setField(term13249, term13249.getClass(), "last", term13227);
        setField(term13249, term13249.getClass(), "propListHead", null);
        setIntField(term13249, term13249.getClass(), "sourcePosition", 0);
        setField(term13249, term13249.getClass(), "jsType", null);
        setField(term13249, term13249.getClass(), "parent", null);
        setField(term13229, term13229.getClass(), "first", term13249);
        setField(term13229, term13229.getClass(), "last", term13249);
        setField(term13229, term13229.getClass(), "propListHead", null);
        setIntField(term13229, term13229.getClass(), "sourcePosition", 0);
        setField(term13229, term13229.getClass(), "jsType", null);
        setField(term13229, term13229.getClass(), "parent", null);
        setField(term13227, term13227.getClass(), "next", term13229);
        setField(term13227, term13227.getClass(), "first", term13233);
        setField(term13227, term13227.getClass(), "last", term13235);
        setField(term13227, term13227.getClass(), "propListHead", null);
        setIntField(term13227, term13227.getClass(), "sourcePosition", 0);
        setField(term13227, term13227.getClass(), "jsType", null);
        setField(term13227, term13227.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term13227;
        args[1] = "JeDxEhXsPC";
        args[2] = null;
        try {
            callMethod(klass, "createFromTypeNodesInternal", argTypes, term13145, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


