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

public class TypeInference_traverseOr_76247731178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4334;
     Object term4389;

    public TypeInference_traverseOr_76247731178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4337 = new HashMap();
        HashMap term4346 = new HashMap();
        Set<Object> term20714 =  ((Map) term4346).keySet();
        HashSet term4345 = new HashSet((Collection<? extends Object>) term20714);
        HashMap term4353 = new HashMap();
        Set<Object> term20715 =  ((Map) term4353).keySet();
        HashSet term4352 = new HashSet((Collection<? extends Object>) term20715);
        HashMap term4360 = new HashMap();
        Set<Object> term20716 =  ((Map) term4360).keySet();
        HashSet term4359 = new HashSet((Collection<? extends Object>) term20716);
        HashMap term4366 = new HashMap();
        HashMap term4374 = new HashMap();
        HashMap term4379 = new HashMap();
        term4334 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term4335 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term4336 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term4334, term4334.getClass(), "compiler", null);
        setField(term4335, term4335.getClass(), "reporter", null);
        setField(term4335, term4335.getClass(), "nativeTypes", term4336);
        setField(term4335, term4335.getClass(), "namesToTypes", term4337);
        setField(term4335, term4335.getClass(), "namespaces", term4345);
        setField(term4335, term4335.getClass(), "nonNullableTypeNames", term4352);
        setField(term4335, term4335.getClass(), "forwardDeclaredTypes", term4359);
        setField(term4335, term4335.getClass(), "typesIndexedByProperty", term4366);
        setField(term4335, term4335.getClass(), "eachRefTypeIndexedByProperty", term4374);
        setField(term4335, term4335.getClass(), "greatestSubtypeByProperty", term4379);
        setField(term4335, term4335.getClass(), "interfaceToImplementors", null);
        setField(term4335, term4335.getClass(), "unresolvedNamedTypes", null);
        setField(term4335, term4335.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4335, term4335.getClass(), "lastGeneration", false);
        setField(term4335, term4335.getClass(), "templateTypeName", null);
        setField(term4335, term4335.getClass(), "templateType", null);
        setBooleanField(term4335, term4335.getClass(), "tolerateUndefinedValues", false);
        setField(term4335, term4335.getClass(), "resolveMode", null);
        setField(term4334, term4334.getClass(), "registry", term4335);
        setField(term4334, term4334.getClass(), "reverseInterpreter", null);
        setField(term4334, term4334.getClass(), "syntacticScope", null);
        setField(term4334, term4334.getClass(), "functionScope", null);
        setField(term4334, term4334.getClass(), "bottomScope", null);
        setField(term4334, term4334.getClass(), "assertionFunctionsMap", null);
        setField(term4334, term4334.getClass(), "cfg", null);
        setField(term4334, term4334.getClass(), "joinOp", null);
        setField(term4334, term4334.getClass(), "orderedWorkSet", null);
        term4389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4389, term4389.getClass(), "type", -222941705);
        setIntField(term4391, term4391.getClass(), "type", 291864719);
        setIntField(term4393, term4393.getClass(), "type", -1549607466);
        setIntField(term4395, term4395.getClass(), "type", 853609788);
        setIntField(term4397, term4397.getClass(), "type", -197820800);
        setField(term4397, term4397.getClass(), "next", null);
        setField(term4397, term4397.getClass(), "first", null);
        setField(term4397, term4397.getClass(), "last", null);
        setField(term4397, term4397.getClass(), "propListHead", null);
        setIntField(term4397, term4397.getClass(), "sourcePosition", 0);
        setField(term4397, term4397.getClass(), "jsType", null);
        setField(term4397, term4397.getClass(), "parent", null);
        setField(term4395, term4395.getClass(), "next", term4397);
        setIntField(term4400, term4400.getClass(), "type", 723812297);
        setField(term4400, term4400.getClass(), "next", null);
        setField(term4400, term4400.getClass(), "first", null);
        setField(term4400, term4400.getClass(), "last", term4397);
        setField(term4400, term4400.getClass(), "propListHead", null);
        setIntField(term4400, term4400.getClass(), "sourcePosition", 0);
        setField(term4400, term4400.getClass(), "jsType", null);
        setField(term4400, term4400.getClass(), "parent", null);
        setField(term4395, term4395.getClass(), "first", term4400);
        setField(term4395, term4395.getClass(), "last", term4393);
        setField(term4395, term4395.getClass(), "propListHead", null);
        setIntField(term4395, term4395.getClass(), "sourcePosition", 0);
        setField(term4395, term4395.getClass(), "jsType", null);
        setField(term4395, term4395.getClass(), "parent", null);
        setField(term4393, term4393.getClass(), "next", term4395);
        setField(term4393, term4393.getClass(), "first", term4397);
        setIntField(term4404, term4404.getClass(), "type", 873659088);
        setIntField(term4406, term4406.getClass(), "type", -975748721);
        setField(term4406, term4406.getClass(), "next", null);
        setField(term4406, term4406.getClass(), "first", term4400);
        setField(term4406, term4406.getClass(), "last", term4395);
        setField(term4406, term4406.getClass(), "propListHead", null);
        setIntField(term4406, term4406.getClass(), "sourcePosition", 0);
        setField(term4406, term4406.getClass(), "jsType", null);
        setField(term4406, term4406.getClass(), "parent", null);
        setField(term4404, term4404.getClass(), "next", term4406);
        setField(term4404, term4404.getClass(), "first", term4391);
        setField(term4404, term4404.getClass(), "last", term4391);
        setField(term4404, term4404.getClass(), "propListHead", null);
        setIntField(term4404, term4404.getClass(), "sourcePosition", 0);
        setField(term4404, term4404.getClass(), "jsType", null);
        setField(term4404, term4404.getClass(), "parent", null);
        setField(term4393, term4393.getClass(), "last", term4404);
        setField(term4393, term4393.getClass(), "propListHead", null);
        setIntField(term4393, term4393.getClass(), "sourcePosition", 0);
        setField(term4393, term4393.getClass(), "jsType", null);
        setField(term4393, term4393.getClass(), "parent", null);
        setField(term4391, term4391.getClass(), "next", term4393);
        setIntField(term4411, term4411.getClass(), "type", 433248783);
        setField(term4411, term4411.getClass(), "next", term4404);
        setField(term4411, term4411.getClass(), "first", term4406);
        setField(term4411, term4411.getClass(), "last", term4389);
        setField(term4411, term4411.getClass(), "propListHead", null);
        setIntField(term4411, term4411.getClass(), "sourcePosition", 0);
        setField(term4411, term4411.getClass(), "jsType", null);
        setField(term4411, term4411.getClass(), "parent", null);
        setField(term4391, term4391.getClass(), "first", term4411);
        setField(term4391, term4391.getClass(), "last", term4411);
        setField(term4391, term4391.getClass(), "propListHead", null);
        setIntField(term4391, term4391.getClass(), "sourcePosition", 0);
        setField(term4391, term4391.getClass(), "jsType", null);
        setField(term4391, term4391.getClass(), "parent", null);
        setField(term4389, term4389.getClass(), "next", term4391);
        setField(term4389, term4389.getClass(), "first", term4395);
        setField(term4389, term4389.getClass(), "last", term4397);
        setField(term4389, term4389.getClass(), "propListHead", null);
        setIntField(term4389, term4389.getClass(), "sourcePosition", 0);
        setField(term4389, term4389.getClass(), "jsType", null);
        setField(term4389, term4389.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term4389;
        args[1] = null;
        try {
            callMethod(klass, "traverseOr", argTypes, term4334, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


