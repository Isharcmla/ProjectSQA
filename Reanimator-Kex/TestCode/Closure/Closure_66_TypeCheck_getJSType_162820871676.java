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

public class TypeCheck_getJSType_162820871676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8332;
     Object term8386;

    public TypeCheck_getJSType_162820871676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8336 = new HashMap();
        HashMap term8343 = new HashMap();
        Set<Object> term23814 =  ((Map) term8343).keySet();
        HashSet term8342 = new HashSet((Collection<? extends Object>) term23814);
        HashMap term8349 = new HashMap();
        Set<Object> term23815 =  ((Map) term8349).keySet();
        HashSet term8348 = new HashSet((Collection<? extends Object>) term23815);
        HashMap term8355 = new HashMap();
        Set<Object> term23816 =  ((Map) term8355).keySet();
        HashSet term8354 = new HashSet((Collection<? extends Object>) term23816);
        HashMap term8360 = new HashMap();
        HashMap term8366 = new HashMap();
        HashMap term8371 = new HashMap();
        term8332 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term8333 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term8334 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term8335 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term8332, term8332.getClass(), "compiler", null);
        setField(term8333, term8333.getClass(), "compiler", null);
        setField(term8334, term8334.getClass(), "reporter", null);
        setField(term8334, term8334.getClass(), "nativeTypes", term8335);
        setField(term8334, term8334.getClass(), "namesToTypes", term8336);
        setField(term8334, term8334.getClass(), "namespaces", term8342);
        setField(term8334, term8334.getClass(), "nonNullableTypeNames", term8348);
        setField(term8334, term8334.getClass(), "forwardDeclaredTypes", term8354);
        setField(term8334, term8334.getClass(), "typesIndexedByProperty", term8360);
        setField(term8334, term8334.getClass(), "eachRefTypeIndexedByProperty", term8366);
        setField(term8334, term8334.getClass(), "greatestSubtypeByProperty", term8371);
        setField(term8334, term8334.getClass(), "interfaceToImplementors", null);
        setField(term8334, term8334.getClass(), "unresolvedNamedTypes", null);
        setField(term8334, term8334.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term8334, term8334.getClass(), "lastGeneration", false);
        setField(term8334, term8334.getClass(), "templateTypeName", null);
        setField(term8334, term8334.getClass(), "templateType", null);
        setBooleanField(term8334, term8334.getClass(), "tolerateUndefinedValues", false);
        setField(term8334, term8334.getClass(), "resolveMode", null);
        setField(term8333, term8333.getClass(), "typeRegistry", term8334);
        setField(term8333, term8333.getClass(), "allValueTypes", null);
        setBooleanField(term8333, term8333.getClass(), "shouldReport", false);
        setField(term8333, term8333.getClass(), "nullOrUndefined", null);
        setField(term8333, term8333.getClass(), "mismatches", null);
        setField(term8332, term8332.getClass(), "validator", term8333);
        setField(term8332, term8332.getClass(), "reverseInterpreter", null);
        setField(term8332, term8332.getClass(), "typeRegistry", null);
        setField(term8332, term8332.getClass(), "topScope", null);
        setField(term8332, term8332.getClass(), "scopeCreator", null);
        setField(term8332, term8332.getClass(), "reportMissingOverride", null);
        setField(term8332, term8332.getClass(), "reportUnknownTypes", null);
        setBooleanField(term8332, term8332.getClass(), "reportMissingProperties", false);
        setField(term8332, term8332.getClass(), "inferJSDocInfo", null);
        setIntField(term8332, term8332.getClass(), "typedCount", 0);
        setIntField(term8332, term8332.getClass(), "nullCount", 0);
        setIntField(term8332, term8332.getClass(), "unknownCount", 0);
        setBooleanField(term8332, term8332.getClass(), "inExterns", false);
        setIntField(term8332, term8332.getClass(), "noTypeCheckSection", 0);
        term8386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8399 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8409 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term8386, term8386.getClass(), "type", 405295896);
        setIntField(term8388, term8388.getClass(), "type", 868908117);
        setIntField(term8390, term8390.getClass(), "type", 0);
        setField(term8390, term8390.getClass(), "next", null);
        setField(term8390, term8390.getClass(), "first", null);
        setField(term8390, term8390.getClass(), "last", null);
        setField(term8390, term8390.getClass(), "propListHead", null);
        setIntField(term8390, term8390.getClass(), "sourcePosition", 0);
        setField(term8390, term8390.getClass(), "jsType", null);
        setField(term8390, term8390.getClass(), "parent", null);
        setField(term8388, term8388.getClass(), "next", term8390);
        setIntField(term8393, term8393.getClass(), "type", 0);
        setField(term8393, term8393.getClass(), "next", null);
        setField(term8393, term8393.getClass(), "first", null);
        setField(term8393, term8393.getClass(), "last", null);
        setField(term8393, term8393.getClass(), "propListHead", null);
        setIntField(term8393, term8393.getClass(), "sourcePosition", 0);
        setField(term8393, term8393.getClass(), "jsType", null);
        setField(term8393, term8393.getClass(), "parent", null);
        setField(term8388, term8388.getClass(), "first", term8393);
        setIntField(term8396, term8396.getClass(), "type", 0);
        setField(term8396, term8396.getClass(), "next", null);
        setField(term8396, term8396.getClass(), "first", null);
        setField(term8396, term8396.getClass(), "last", null);
        setField(term8396, term8396.getClass(), "propListHead", null);
        setIntField(term8396, term8396.getClass(), "sourcePosition", 0);
        setField(term8396, term8396.getClass(), "jsType", null);
        setField(term8396, term8396.getClass(), "parent", null);
        setField(term8388, term8388.getClass(), "last", term8396);
        setField(term8399, term8399.getClass(), "next", null);
        setIntField(term8399, term8399.getClass(), "type", 0);
        setIntField(term8399, term8399.getClass(), "intValue", 0);
        setField(term8399, term8399.getClass(), "objectValue", null);
        setField(term8388, term8388.getClass(), "propListHead", term8399);
        setIntField(term8388, term8388.getClass(), "sourcePosition", -585773976);
        setField(term8388, term8388.getClass(), "jsType", null);
        setField(term8388, term8388.getClass(), "parent", null);
        setField(term8386, term8386.getClass(), "next", term8388);
        setIntField(term8403, term8403.getClass(), "type", 0);
        setField(term8403, term8403.getClass(), "next", null);
        setField(term8403, term8403.getClass(), "first", null);
        setField(term8403, term8403.getClass(), "last", null);
        setField(term8403, term8403.getClass(), "propListHead", null);
        setIntField(term8403, term8403.getClass(), "sourcePosition", 0);
        setField(term8403, term8403.getClass(), "jsType", null);
        setField(term8403, term8403.getClass(), "parent", null);
        setField(term8386, term8386.getClass(), "first", term8403);
        setIntField(term8406, term8406.getClass(), "type", 0);
        setField(term8406, term8406.getClass(), "next", null);
        setField(term8406, term8406.getClass(), "first", null);
        setField(term8406, term8406.getClass(), "last", null);
        setField(term8406, term8406.getClass(), "propListHead", null);
        setIntField(term8406, term8406.getClass(), "sourcePosition", 0);
        setField(term8406, term8406.getClass(), "jsType", null);
        setField(term8406, term8406.getClass(), "parent", null);
        setField(term8386, term8386.getClass(), "last", term8406);
        setField(term8409, term8409.getClass(), "next", null);
        setIntField(term8409, term8409.getClass(), "type", 0);
        setIntField(term8409, term8409.getClass(), "intValue", 0);
        setField(term8409, term8409.getClass(), "objectValue", null);
        setField(term8386, term8386.getClass(), "propListHead", term8409);
        setIntField(term8386, term8386.getClass(), "sourcePosition", 852806940);
        setField(term8386, term8386.getClass(), "jsType", null);
        setField(term8386, term8386.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term8386;
        try {
            callMethod(klass, "getJSType", argTypes, term8332, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


