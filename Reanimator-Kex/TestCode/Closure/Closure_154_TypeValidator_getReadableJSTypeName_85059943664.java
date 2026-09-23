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
import java.lang.Boolean;

public class TypeValidator_getReadableJSTypeName_85059943664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6303;
     Object term6358;
     Object term6385;

    public TypeValidator_getReadableJSTypeName_85059943664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6306 = new HashMap();
        HashMap term6315 = new HashMap();
        Set<Object> term15751 =  ((Map) term6315).keySet();
        HashSet term6314 = new HashSet((Collection<? extends Object>) term15751);
        HashMap term6321 = new HashMap();
        Set<Object> term15752 =  ((Map) term6321).keySet();
        HashSet term6320 = new HashSet((Collection<? extends Object>) term15752);
        HashMap term6328 = new HashMap();
        Set<Object> term15753 =  ((Map) term6328).keySet();
        HashSet term6327 = new HashSet((Collection<? extends Object>) term15753);
        HashMap term6334 = new HashMap();
        HashMap term6342 = new HashMap();
        HashMap term6347 = new HashMap();
        term6303 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term6304 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6305 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term6303, term6303.getClass(), "compiler", null);
        setField(term6304, term6304.getClass(), "reporter", null);
        setField(term6304, term6304.getClass(), "nativeTypes", term6305);
        setField(term6304, term6304.getClass(), "namesToTypes", term6306);
        setField(term6304, term6304.getClass(), "namespaces", term6314);
        setField(term6304, term6304.getClass(), "nonNullableTypeNames", term6320);
        setField(term6304, term6304.getClass(), "forwardDeclaredTypes", term6327);
        setField(term6304, term6304.getClass(), "typesIndexedByProperty", term6334);
        setField(term6304, term6304.getClass(), "eachRefTypeIndexedByProperty", term6342);
        setField(term6304, term6304.getClass(), "greatestSubtypeByProperty", term6347);
        setField(term6304, term6304.getClass(), "interfaceToImplementors", null);
        setField(term6304, term6304.getClass(), "unresolvedNamedTypes", null);
        setField(term6304, term6304.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6304, term6304.getClass(), "lastGeneration", false);
        setField(term6304, term6304.getClass(), "templateTypeName", null);
        setField(term6304, term6304.getClass(), "templateType", null);
        setBooleanField(term6304, term6304.getClass(), "tolerateUndefinedValues", false);
        setField(term6304, term6304.getClass(), "resolveMode", null);
        setField(term6303, term6303.getClass(), "typeRegistry", term6304);
        setField(term6303, term6303.getClass(), "allValueTypes", null);
        setBooleanField(term6303, term6303.getClass(), "shouldReport", false);
        setField(term6303, term6303.getClass(), "nullOrUndefined", null);
        setField(term6303, term6303.getClass(), "mismatches", null);
        term6358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6371 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6381 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6358, term6358.getClass(), "type", -197820800);
        setIntField(term6360, term6360.getClass(), "type", -975748721);
        setIntField(term6362, term6362.getClass(), "type", 0);
        setField(term6362, term6362.getClass(), "next", null);
        setField(term6362, term6362.getClass(), "first", null);
        setField(term6362, term6362.getClass(), "last", null);
        setField(term6362, term6362.getClass(), "propListHead", null);
        setIntField(term6362, term6362.getClass(), "sourcePosition", 0);
        setField(term6362, term6362.getClass(), "jsType", null);
        setField(term6362, term6362.getClass(), "parent", null);
        setField(term6360, term6360.getClass(), "next", term6362);
        setIntField(term6365, term6365.getClass(), "type", 0);
        setField(term6365, term6365.getClass(), "next", null);
        setField(term6365, term6365.getClass(), "first", null);
        setField(term6365, term6365.getClass(), "last", null);
        setField(term6365, term6365.getClass(), "propListHead", null);
        setIntField(term6365, term6365.getClass(), "sourcePosition", 0);
        setField(term6365, term6365.getClass(), "jsType", null);
        setField(term6365, term6365.getClass(), "parent", null);
        setField(term6360, term6360.getClass(), "first", term6365);
        setIntField(term6368, term6368.getClass(), "type", 0);
        setField(term6368, term6368.getClass(), "next", null);
        setField(term6368, term6368.getClass(), "first", null);
        setField(term6368, term6368.getClass(), "last", null);
        setField(term6368, term6368.getClass(), "propListHead", null);
        setIntField(term6368, term6368.getClass(), "sourcePosition", 0);
        setField(term6368, term6368.getClass(), "jsType", null);
        setField(term6368, term6368.getClass(), "parent", null);
        setField(term6360, term6360.getClass(), "last", term6368);
        setField(term6371, term6371.getClass(), "next", null);
        setIntField(term6371, term6371.getClass(), "type", 0);
        setIntField(term6371, term6371.getClass(), "intValue", 0);
        setField(term6371, term6371.getClass(), "objectValue", null);
        setField(term6360, term6360.getClass(), "propListHead", term6371);
        setIntField(term6360, term6360.getClass(), "sourcePosition", -1736183862);
        setField(term6360, term6360.getClass(), "jsType", null);
        setField(term6360, term6360.getClass(), "parent", null);
        setField(term6358, term6358.getClass(), "next", term6360);
        setIntField(term6375, term6375.getClass(), "type", 0);
        setField(term6375, term6375.getClass(), "next", null);
        setField(term6375, term6375.getClass(), "first", null);
        setField(term6375, term6375.getClass(), "last", null);
        setField(term6375, term6375.getClass(), "propListHead", null);
        setIntField(term6375, term6375.getClass(), "sourcePosition", 0);
        setField(term6375, term6375.getClass(), "jsType", null);
        setField(term6375, term6375.getClass(), "parent", null);
        setField(term6358, term6358.getClass(), "first", term6375);
        setIntField(term6378, term6378.getClass(), "type", 0);
        setField(term6378, term6378.getClass(), "next", null);
        setField(term6378, term6378.getClass(), "first", null);
        setField(term6378, term6378.getClass(), "last", null);
        setField(term6378, term6378.getClass(), "propListHead", null);
        setIntField(term6378, term6378.getClass(), "sourcePosition", 0);
        setField(term6378, term6378.getClass(), "jsType", null);
        setField(term6378, term6378.getClass(), "parent", null);
        setField(term6358, term6358.getClass(), "last", term6378);
        setField(term6381, term6381.getClass(), "next", null);
        setIntField(term6381, term6381.getClass(), "type", 0);
        setIntField(term6381, term6381.getClass(), "intValue", 0);
        setField(term6381, term6381.getClass(), "objectValue", null);
        setField(term6358, term6358.getClass(), "propListHead", term6381);
        setIntField(term6358, term6358.getClass(), "sourcePosition", 897010381);
        setField(term6358, term6358.getClass(), "jsType", null);
        setField(term6358, term6358.getClass(), "parent", null);
        term6385 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term6358;
        args[1] = term6385;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term6303, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


