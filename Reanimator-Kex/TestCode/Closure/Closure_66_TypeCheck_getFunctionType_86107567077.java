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

public class TypeCheck_getFunctionType_86107567077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8416;
     Object term8470;

    public TypeCheck_getFunctionType_86107567077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8420 = new HashMap();
        HashMap term8427 = new HashMap();
        Set<Object> term24102 =  ((Map) term8427).keySet();
        HashSet term8426 = new HashSet((Collection<? extends Object>) term24102);
        HashMap term8433 = new HashMap();
        Set<Object> term24103 =  ((Map) term8433).keySet();
        HashSet term8432 = new HashSet((Collection<? extends Object>) term24103);
        HashMap term8439 = new HashMap();
        Set<Object> term24104 =  ((Map) term8439).keySet();
        HashSet term8438 = new HashSet((Collection<? extends Object>) term24104);
        HashMap term8444 = new HashMap();
        HashMap term8450 = new HashMap();
        HashMap term8455 = new HashMap();
        term8416 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term8417 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term8418 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term8419 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term8416, term8416.getClass(), "compiler", null);
        setField(term8417, term8417.getClass(), "compiler", null);
        setField(term8418, term8418.getClass(), "reporter", null);
        setField(term8418, term8418.getClass(), "nativeTypes", term8419);
        setField(term8418, term8418.getClass(), "namesToTypes", term8420);
        setField(term8418, term8418.getClass(), "namespaces", term8426);
        setField(term8418, term8418.getClass(), "nonNullableTypeNames", term8432);
        setField(term8418, term8418.getClass(), "forwardDeclaredTypes", term8438);
        setField(term8418, term8418.getClass(), "typesIndexedByProperty", term8444);
        setField(term8418, term8418.getClass(), "eachRefTypeIndexedByProperty", term8450);
        setField(term8418, term8418.getClass(), "greatestSubtypeByProperty", term8455);
        setField(term8418, term8418.getClass(), "interfaceToImplementors", null);
        setField(term8418, term8418.getClass(), "unresolvedNamedTypes", null);
        setField(term8418, term8418.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term8418, term8418.getClass(), "lastGeneration", false);
        setField(term8418, term8418.getClass(), "templateTypeName", null);
        setField(term8418, term8418.getClass(), "templateType", null);
        setBooleanField(term8418, term8418.getClass(), "tolerateUndefinedValues", false);
        setField(term8418, term8418.getClass(), "resolveMode", null);
        setField(term8417, term8417.getClass(), "typeRegistry", term8418);
        setField(term8417, term8417.getClass(), "allValueTypes", null);
        setBooleanField(term8417, term8417.getClass(), "shouldReport", false);
        setField(term8417, term8417.getClass(), "nullOrUndefined", null);
        setField(term8417, term8417.getClass(), "mismatches", null);
        setField(term8416, term8416.getClass(), "validator", term8417);
        setField(term8416, term8416.getClass(), "reverseInterpreter", null);
        setField(term8416, term8416.getClass(), "typeRegistry", null);
        setField(term8416, term8416.getClass(), "topScope", null);
        setField(term8416, term8416.getClass(), "scopeCreator", null);
        setField(term8416, term8416.getClass(), "reportMissingOverride", null);
        setField(term8416, term8416.getClass(), "reportUnknownTypes", null);
        setBooleanField(term8416, term8416.getClass(), "reportMissingProperties", false);
        setField(term8416, term8416.getClass(), "inferJSDocInfo", null);
        setIntField(term8416, term8416.getClass(), "typedCount", 0);
        setIntField(term8416, term8416.getClass(), "nullCount", 0);
        setIntField(term8416, term8416.getClass(), "unknownCount", 0);
        setBooleanField(term8416, term8416.getClass(), "inExterns", false);
        setIntField(term8416, term8416.getClass(), "noTypeCheckSection", 0);
        term8470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8483 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8493 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term8470, term8470.getClass(), "type", -64893740);
        setIntField(term8472, term8472.getClass(), "type", -1292704466);
        setIntField(term8474, term8474.getClass(), "type", 0);
        setField(term8474, term8474.getClass(), "next", null);
        setField(term8474, term8474.getClass(), "first", null);
        setField(term8474, term8474.getClass(), "last", null);
        setField(term8474, term8474.getClass(), "propListHead", null);
        setIntField(term8474, term8474.getClass(), "sourcePosition", 0);
        setField(term8474, term8474.getClass(), "jsType", null);
        setField(term8474, term8474.getClass(), "parent", null);
        setField(term8472, term8472.getClass(), "next", term8474);
        setIntField(term8477, term8477.getClass(), "type", 0);
        setField(term8477, term8477.getClass(), "next", null);
        setField(term8477, term8477.getClass(), "first", null);
        setField(term8477, term8477.getClass(), "last", null);
        setField(term8477, term8477.getClass(), "propListHead", null);
        setIntField(term8477, term8477.getClass(), "sourcePosition", 0);
        setField(term8477, term8477.getClass(), "jsType", null);
        setField(term8477, term8477.getClass(), "parent", null);
        setField(term8472, term8472.getClass(), "first", term8477);
        setIntField(term8480, term8480.getClass(), "type", 0);
        setField(term8480, term8480.getClass(), "next", null);
        setField(term8480, term8480.getClass(), "first", null);
        setField(term8480, term8480.getClass(), "last", null);
        setField(term8480, term8480.getClass(), "propListHead", null);
        setIntField(term8480, term8480.getClass(), "sourcePosition", 0);
        setField(term8480, term8480.getClass(), "jsType", null);
        setField(term8480, term8480.getClass(), "parent", null);
        setField(term8472, term8472.getClass(), "last", term8480);
        setField(term8483, term8483.getClass(), "next", null);
        setIntField(term8483, term8483.getClass(), "type", 0);
        setIntField(term8483, term8483.getClass(), "intValue", 0);
        setField(term8483, term8483.getClass(), "objectValue", null);
        setField(term8472, term8472.getClass(), "propListHead", term8483);
        setIntField(term8472, term8472.getClass(), "sourcePosition", 188512644);
        setField(term8472, term8472.getClass(), "jsType", null);
        setField(term8472, term8472.getClass(), "parent", null);
        setField(term8470, term8470.getClass(), "next", term8472);
        setIntField(term8487, term8487.getClass(), "type", 0);
        setField(term8487, term8487.getClass(), "next", null);
        setField(term8487, term8487.getClass(), "first", null);
        setField(term8487, term8487.getClass(), "last", null);
        setField(term8487, term8487.getClass(), "propListHead", null);
        setIntField(term8487, term8487.getClass(), "sourcePosition", 0);
        setField(term8487, term8487.getClass(), "jsType", null);
        setField(term8487, term8487.getClass(), "parent", null);
        setField(term8470, term8470.getClass(), "first", term8487);
        setIntField(term8490, term8490.getClass(), "type", 0);
        setField(term8490, term8490.getClass(), "next", null);
        setField(term8490, term8490.getClass(), "first", null);
        setField(term8490, term8490.getClass(), "last", null);
        setField(term8490, term8490.getClass(), "propListHead", null);
        setIntField(term8490, term8490.getClass(), "sourcePosition", 0);
        setField(term8490, term8490.getClass(), "jsType", null);
        setField(term8490, term8490.getClass(), "parent", null);
        setField(term8470, term8470.getClass(), "last", term8490);
        setField(term8493, term8493.getClass(), "next", null);
        setIntField(term8493, term8493.getClass(), "type", 0);
        setIntField(term8493, term8493.getClass(), "intValue", 0);
        setField(term8493, term8493.getClass(), "objectValue", null);
        setField(term8470, term8470.getClass(), "propListHead", term8493);
        setIntField(term8470, term8470.getClass(), "sourcePosition", 1851127634);
        setField(term8470, term8470.getClass(), "jsType", null);
        setField(term8470, term8470.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term8470;
        try {
            callMethod(klass, "getFunctionType", argTypes, term8416, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


