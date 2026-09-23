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

public class TypeInference_traverseName_128015816157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1170;
     Object term1225;

    public TypeInference_traverseName_128015816157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1173 = new HashMap();
        HashMap term1182 = new HashMap();
        Set<Object> term11729 =  ((Map) term1182).keySet();
        HashSet term1181 = new HashSet((Collection<? extends Object>) term11729);
        HashMap term1189 = new HashMap();
        Set<Object> term11730 =  ((Map) term1189).keySet();
        HashSet term1188 = new HashSet((Collection<? extends Object>) term11730);
        HashMap term1196 = new HashMap();
        Set<Object> term11731 =  ((Map) term1196).keySet();
        HashSet term1195 = new HashSet((Collection<? extends Object>) term11731);
        HashMap term1202 = new HashMap();
        HashMap term1210 = new HashMap();
        HashMap term1215 = new HashMap();
        term1170 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term1171 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1172 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term1170, term1170.getClass(), "compiler", null);
        setField(term1171, term1171.getClass(), "reporter", null);
        setField(term1171, term1171.getClass(), "nativeTypes", term1172);
        setField(term1171, term1171.getClass(), "namesToTypes", term1173);
        setField(term1171, term1171.getClass(), "namespaces", term1181);
        setField(term1171, term1171.getClass(), "nonNullableTypeNames", term1188);
        setField(term1171, term1171.getClass(), "forwardDeclaredTypes", term1195);
        setField(term1171, term1171.getClass(), "typesIndexedByProperty", term1202);
        setField(term1171, term1171.getClass(), "eachRefTypeIndexedByProperty", term1210);
        setField(term1171, term1171.getClass(), "greatestSubtypeByProperty", term1215);
        setField(term1171, term1171.getClass(), "interfaceToImplementors", null);
        setField(term1171, term1171.getClass(), "unresolvedNamedTypes", null);
        setField(term1171, term1171.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1171, term1171.getClass(), "lastGeneration", false);
        setField(term1171, term1171.getClass(), "templateTypeName", null);
        setField(term1171, term1171.getClass(), "templateType", null);
        setBooleanField(term1171, term1171.getClass(), "tolerateUndefinedValues", false);
        setField(term1171, term1171.getClass(), "resolveMode", null);
        setField(term1170, term1170.getClass(), "registry", term1171);
        setField(term1170, term1170.getClass(), "reverseInterpreter", null);
        setField(term1170, term1170.getClass(), "syntacticScope", null);
        setField(term1170, term1170.getClass(), "functionScope", null);
        setField(term1170, term1170.getClass(), "bottomScope", null);
        setField(term1170, term1170.getClass(), "assertionFunctionsMap", null);
        setField(term1170, term1170.getClass(), "cfg", null);
        setField(term1170, term1170.getClass(), "joinOp", null);
        setField(term1170, term1170.getClass(), "orderedWorkSet", null);
        term1225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1225, term1225.getClass(), "type", -1885090354);
        setIntField(term1227, term1227.getClass(), "type", -2066804303);
        setIntField(term1229, term1229.getClass(), "type", -1731761810);
        setIntField(term1231, term1231.getClass(), "type", 197109649);
        setIntField(term1233, term1233.getClass(), "type", -1239406390);
        setField(term1233, term1233.getClass(), "next", null);
        setField(term1233, term1233.getClass(), "first", null);
        setField(term1233, term1233.getClass(), "last", null);
        setField(term1233, term1233.getClass(), "propListHead", null);
        setIntField(term1233, term1233.getClass(), "sourcePosition", 0);
        setField(term1233, term1233.getClass(), "jsType", null);
        setField(term1233, term1233.getClass(), "parent", null);
        setField(term1231, term1231.getClass(), "next", term1233);
        setIntField(term1236, term1236.getClass(), "type", 1557431527);
        setField(term1236, term1236.getClass(), "next", null);
        setField(term1236, term1236.getClass(), "first", null);
        setField(term1236, term1236.getClass(), "last", term1233);
        setField(term1236, term1236.getClass(), "propListHead", null);
        setIntField(term1236, term1236.getClass(), "sourcePosition", 0);
        setField(term1236, term1236.getClass(), "jsType", null);
        setField(term1236, term1236.getClass(), "parent", null);
        setField(term1231, term1231.getClass(), "first", term1236);
        setField(term1231, term1231.getClass(), "last", term1229);
        setField(term1231, term1231.getClass(), "propListHead", null);
        setIntField(term1231, term1231.getClass(), "sourcePosition", 0);
        setField(term1231, term1231.getClass(), "jsType", null);
        setField(term1231, term1231.getClass(), "parent", null);
        setField(term1229, term1229.getClass(), "next", term1231);
        setField(term1229, term1229.getClass(), "first", term1233);
        setIntField(term1240, term1240.getClass(), "type", 1358829571);
        setIntField(term1242, term1242.getClass(), "type", 991356662);
        setField(term1242, term1242.getClass(), "next", null);
        setField(term1242, term1242.getClass(), "first", term1236);
        setField(term1242, term1242.getClass(), "last", term1231);
        setField(term1242, term1242.getClass(), "propListHead", null);
        setIntField(term1242, term1242.getClass(), "sourcePosition", 0);
        setField(term1242, term1242.getClass(), "jsType", null);
        setField(term1242, term1242.getClass(), "parent", null);
        setField(term1240, term1240.getClass(), "next", term1242);
        setField(term1240, term1240.getClass(), "first", term1227);
        setField(term1240, term1240.getClass(), "last", term1227);
        setField(term1240, term1240.getClass(), "propListHead", null);
        setIntField(term1240, term1240.getClass(), "sourcePosition", 0);
        setField(term1240, term1240.getClass(), "jsType", null);
        setField(term1240, term1240.getClass(), "parent", null);
        setField(term1229, term1229.getClass(), "last", term1240);
        setField(term1229, term1229.getClass(), "propListHead", null);
        setIntField(term1229, term1229.getClass(), "sourcePosition", 0);
        setField(term1229, term1229.getClass(), "jsType", null);
        setField(term1229, term1229.getClass(), "parent", null);
        setField(term1227, term1227.getClass(), "next", term1229);
        setIntField(term1247, term1247.getClass(), "type", -506958186);
        setField(term1247, term1247.getClass(), "next", term1240);
        setField(term1247, term1247.getClass(), "first", term1242);
        setField(term1247, term1247.getClass(), "last", term1225);
        setField(term1247, term1247.getClass(), "propListHead", null);
        setIntField(term1247, term1247.getClass(), "sourcePosition", 0);
        setField(term1247, term1247.getClass(), "jsType", null);
        setField(term1247, term1247.getClass(), "parent", null);
        setField(term1227, term1227.getClass(), "first", term1247);
        setField(term1227, term1227.getClass(), "last", term1247);
        setField(term1227, term1227.getClass(), "propListHead", null);
        setIntField(term1227, term1227.getClass(), "sourcePosition", 0);
        setField(term1227, term1227.getClass(), "jsType", null);
        setField(term1227, term1227.getClass(), "parent", null);
        setField(term1225, term1225.getClass(), "next", term1227);
        setField(term1225, term1225.getClass(), "first", term1231);
        setField(term1225, term1225.getClass(), "last", term1233);
        setField(term1225, term1225.getClass(), "propListHead", null);
        setIntField(term1225, term1225.getClass(), "sourcePosition", 0);
        setField(term1225, term1225.getClass(), "jsType", null);
        setField(term1225, term1225.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1225;
        args[1] = null;
        try {
            callMethod(klass, "traverseName", argTypes, term1170, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


