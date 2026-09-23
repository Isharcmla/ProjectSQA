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

public class TypeInference_getPropertyType_164697948977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4228;
     Object term4294;

    public TypeInference_getPropertyType_164697948977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4231 = new HashMap();
        HashMap term4240 = new HashMap();
        Set<Object> term20609 =  ((Map) term4240).keySet();
        HashSet term4239 = new HashSet((Collection<? extends Object>) term20609);
        HashMap term4246 = new HashMap();
        Set<Object> term20610 =  ((Map) term4246).keySet();
        HashSet term4245 = new HashSet((Collection<? extends Object>) term20610);
        HashMap term4253 = new HashMap();
        Set<Object> term20611 =  ((Map) term4253).keySet();
        HashSet term4252 = new HashSet((Collection<? extends Object>) term20611);
        HashMap term4259 = new HashMap();
        HashMap term4267 = new HashMap();
        HashMap term4272 = new HashMap();
        term4228 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term4229 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term4230 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term4228, term4228.getClass(), "compiler", null);
        setField(term4229, term4229.getClass(), "reporter", null);
        setField(term4229, term4229.getClass(), "nativeTypes", term4230);
        setField(term4229, term4229.getClass(), "namesToTypes", term4231);
        setField(term4229, term4229.getClass(), "namespaces", term4239);
        setField(term4229, term4229.getClass(), "nonNullableTypeNames", term4245);
        setField(term4229, term4229.getClass(), "forwardDeclaredTypes", term4252);
        setField(term4229, term4229.getClass(), "typesIndexedByProperty", term4259);
        setField(term4229, term4229.getClass(), "eachRefTypeIndexedByProperty", term4267);
        setField(term4229, term4229.getClass(), "greatestSubtypeByProperty", term4272);
        setField(term4229, term4229.getClass(), "interfaceToImplementors", null);
        setField(term4229, term4229.getClass(), "unresolvedNamedTypes", null);
        setField(term4229, term4229.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4229, term4229.getClass(), "lastGeneration", false);
        setField(term4229, term4229.getClass(), "templateTypeName", null);
        setField(term4229, term4229.getClass(), "templateType", null);
        setBooleanField(term4229, term4229.getClass(), "tolerateUndefinedValues", false);
        setField(term4229, term4229.getClass(), "resolveMode", null);
        setField(term4228, term4228.getClass(), "registry", term4229);
        setField(term4228, term4228.getClass(), "reverseInterpreter", null);
        setField(term4228, term4228.getClass(), "syntacticScope", null);
        setField(term4228, term4228.getClass(), "functionScope", null);
        setField(term4228, term4228.getClass(), "bottomScope", null);
        setField(term4228, term4228.getClass(), "assertionFunctionsMap", null);
        setField(term4228, term4228.getClass(), "cfg", null);
        setField(term4228, term4228.getClass(), "joinOp", null);
        setField(term4228, term4228.getClass(), "orderedWorkSet", null);
        term4294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4296 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4294, term4294.getClass(), "type", -1252345779);
        setIntField(term4296, term4296.getClass(), "type", -2063365430);
        setIntField(term4298, term4298.getClass(), "type", 812570053);
        setIntField(term4300, term4300.getClass(), "type", -1488938905);
        setIntField(term4302, term4302.getClass(), "type", 1916544127);
        setField(term4302, term4302.getClass(), "next", null);
        setField(term4302, term4302.getClass(), "first", null);
        setField(term4302, term4302.getClass(), "last", null);
        setField(term4302, term4302.getClass(), "propListHead", null);
        setIntField(term4302, term4302.getClass(), "sourcePosition", 0);
        setField(term4302, term4302.getClass(), "jsType", null);
        setField(term4302, term4302.getClass(), "parent", null);
        setField(term4300, term4300.getClass(), "next", term4302);
        setIntField(term4305, term4305.getClass(), "type", -1133405894);
        setField(term4305, term4305.getClass(), "next", null);
        setField(term4305, term4305.getClass(), "first", null);
        setField(term4305, term4305.getClass(), "last", term4302);
        setField(term4305, term4305.getClass(), "propListHead", null);
        setIntField(term4305, term4305.getClass(), "sourcePosition", 0);
        setField(term4305, term4305.getClass(), "jsType", null);
        setField(term4305, term4305.getClass(), "parent", null);
        setField(term4300, term4300.getClass(), "first", term4305);
        setField(term4300, term4300.getClass(), "last", term4298);
        setField(term4300, term4300.getClass(), "propListHead", null);
        setIntField(term4300, term4300.getClass(), "sourcePosition", 0);
        setField(term4300, term4300.getClass(), "jsType", null);
        setField(term4300, term4300.getClass(), "parent", null);
        setField(term4298, term4298.getClass(), "next", term4300);
        setField(term4298, term4298.getClass(), "first", term4302);
        setIntField(term4309, term4309.getClass(), "type", 243280944);
        setIntField(term4311, term4311.getClass(), "type", -726681073);
        setField(term4311, term4311.getClass(), "next", null);
        setField(term4311, term4311.getClass(), "first", term4305);
        setField(term4311, term4311.getClass(), "last", term4300);
        setField(term4311, term4311.getClass(), "propListHead", null);
        setIntField(term4311, term4311.getClass(), "sourcePosition", 0);
        setField(term4311, term4311.getClass(), "jsType", null);
        setField(term4311, term4311.getClass(), "parent", null);
        setField(term4309, term4309.getClass(), "next", term4311);
        setField(term4309, term4309.getClass(), "first", term4296);
        setField(term4309, term4309.getClass(), "last", term4296);
        setField(term4309, term4309.getClass(), "propListHead", null);
        setIntField(term4309, term4309.getClass(), "sourcePosition", 0);
        setField(term4309, term4309.getClass(), "jsType", null);
        setField(term4309, term4309.getClass(), "parent", null);
        setField(term4298, term4298.getClass(), "last", term4309);
        setField(term4298, term4298.getClass(), "propListHead", null);
        setIntField(term4298, term4298.getClass(), "sourcePosition", 0);
        setField(term4298, term4298.getClass(), "jsType", null);
        setField(term4298, term4298.getClass(), "parent", null);
        setField(term4296, term4296.getClass(), "next", term4298);
        setIntField(term4316, term4316.getClass(), "type", -1724487863);
        setField(term4316, term4316.getClass(), "next", term4309);
        setField(term4316, term4316.getClass(), "first", term4311);
        setField(term4316, term4316.getClass(), "last", term4294);
        setField(term4316, term4316.getClass(), "propListHead", null);
        setIntField(term4316, term4316.getClass(), "sourcePosition", 0);
        setField(term4316, term4316.getClass(), "jsType", null);
        setField(term4316, term4316.getClass(), "parent", null);
        setField(term4296, term4296.getClass(), "first", term4316);
        setField(term4296, term4296.getClass(), "last", term4316);
        setField(term4296, term4296.getClass(), "propListHead", null);
        setIntField(term4296, term4296.getClass(), "sourcePosition", 0);
        setField(term4296, term4296.getClass(), "jsType", null);
        setField(term4296, term4296.getClass(), "parent", null);
        setField(term4294, term4294.getClass(), "next", term4296);
        setField(term4294, term4294.getClass(), "first", term4300);
        setField(term4294, term4294.getClass(), "last", term4302);
        setField(term4294, term4294.getClass(), "propListHead", null);
        setIntField(term4294, term4294.getClass(), "sourcePosition", 0);
        setField(term4294, term4294.getClass(), "jsType", null);
        setField(term4294, term4294.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = "eCxWMOpomA";
        args[2] = term4294;
        args[3] = null;
        try {
            callMethod(klass, "getPropertyType", argTypes, term4228, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


