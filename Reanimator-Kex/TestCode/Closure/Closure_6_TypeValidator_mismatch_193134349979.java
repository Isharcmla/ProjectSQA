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

public class TypeValidator_mismatch_193134349979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6620;
     Object term6687;

    public TypeValidator_mismatch_193134349979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6623 = new HashMap();
        HashMap term6632 = new HashMap();
        Set<Object> term16709 =  ((Map) term6632).keySet();
        HashSet term6631 = new HashSet((Collection<? extends Object>) term16709);
        HashMap term6639 = new HashMap();
        Set<Object> term16710 =  ((Map) term6639).keySet();
        HashSet term6638 = new HashSet((Collection<? extends Object>) term16710);
        HashMap term6645 = new HashMap();
        Set<Object> term16711 =  ((Map) term6645).keySet();
        HashSet term6644 = new HashSet((Collection<? extends Object>) term16711);
        HashMap term6651 = new HashMap();
        HashMap term6659 = new HashMap();
        HashMap term6664 = new HashMap();
        term6620 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term6621 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6622 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term6620, term6620.getClass(), "compiler", null);
        setField(term6621, term6621.getClass(), "reporter", null);
        setField(term6621, term6621.getClass(), "nativeTypes", term6622);
        setField(term6621, term6621.getClass(), "namesToTypes", term6623);
        setField(term6621, term6621.getClass(), "namespaces", term6631);
        setField(term6621, term6621.getClass(), "nonNullableTypeNames", term6638);
        setField(term6621, term6621.getClass(), "forwardDeclaredTypes", term6644);
        setField(term6621, term6621.getClass(), "typesIndexedByProperty", term6651);
        setField(term6621, term6621.getClass(), "eachRefTypeIndexedByProperty", term6659);
        setField(term6621, term6621.getClass(), "greatestSubtypeByProperty", term6664);
        setField(term6621, term6621.getClass(), "interfaceToImplementors", null);
        setField(term6621, term6621.getClass(), "unresolvedNamedTypes", null);
        setField(term6621, term6621.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6621, term6621.getClass(), "lastGeneration", false);
        setField(term6621, term6621.getClass(), "templateTypes", null);
        setBooleanField(term6621, term6621.getClass(), "tolerateUndefinedValues", false);
        setField(term6621, term6621.getClass(), "resolveMode", null);
        setField(term6620, term6620.getClass(), "typeRegistry", term6621);
        setField(term6620, term6620.getClass(), "allValueTypes", null);
        setBooleanField(term6620, term6620.getClass(), "shouldReport", false);
        setField(term6620, term6620.getClass(), "nullOrUndefined", null);
        setField(term6620, term6620.getClass(), "mismatches", null);
        term6687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6687, term6687.getClass(), "type", 990883365);
        setIntField(term6689, term6689.getClass(), "type", 633598642);
        setIntField(term6691, term6691.getClass(), "type", 1862841859);
        setIntField(term6693, term6693.getClass(), "type", -1114668574);
        setIntField(term6695, term6695.getClass(), "type", 514511037);
        setField(term6695, term6695.getClass(), "next", null);
        setField(term6695, term6695.getClass(), "first", null);
        setField(term6695, term6695.getClass(), "last", null);
        setField(term6695, term6695.getClass(), "propListHead", null);
        setIntField(term6695, term6695.getClass(), "sourcePosition", 0);
        setField(term6695, term6695.getClass(), "jsType", null);
        setField(term6695, term6695.getClass(), "parent", null);
        setField(term6693, term6693.getClass(), "next", term6695);
        setIntField(term6698, term6698.getClass(), "type", 1713573821);
        setField(term6698, term6698.getClass(), "next", null);
        setField(term6698, term6698.getClass(), "first", null);
        setField(term6698, term6698.getClass(), "last", term6695);
        setField(term6698, term6698.getClass(), "propListHead", null);
        setIntField(term6698, term6698.getClass(), "sourcePosition", 0);
        setField(term6698, term6698.getClass(), "jsType", null);
        setField(term6698, term6698.getClass(), "parent", null);
        setField(term6693, term6693.getClass(), "first", term6698);
        setField(term6693, term6693.getClass(), "last", term6691);
        setField(term6693, term6693.getClass(), "propListHead", null);
        setIntField(term6693, term6693.getClass(), "sourcePosition", 0);
        setField(term6693, term6693.getClass(), "jsType", null);
        setField(term6693, term6693.getClass(), "parent", null);
        setField(term6691, term6691.getClass(), "next", term6693);
        setField(term6691, term6691.getClass(), "first", term6695);
        setIntField(term6702, term6702.getClass(), "type", 1467356494);
        setIntField(term6704, term6704.getClass(), "type", -26316536);
        setField(term6704, term6704.getClass(), "next", null);
        setField(term6704, term6704.getClass(), "first", term6698);
        setField(term6704, term6704.getClass(), "last", term6693);
        setField(term6704, term6704.getClass(), "propListHead", null);
        setIntField(term6704, term6704.getClass(), "sourcePosition", 0);
        setField(term6704, term6704.getClass(), "jsType", null);
        setField(term6704, term6704.getClass(), "parent", null);
        setField(term6702, term6702.getClass(), "next", term6704);
        setField(term6702, term6702.getClass(), "first", term6689);
        setField(term6702, term6702.getClass(), "last", term6689);
        setField(term6702, term6702.getClass(), "propListHead", null);
        setIntField(term6702, term6702.getClass(), "sourcePosition", 0);
        setField(term6702, term6702.getClass(), "jsType", null);
        setField(term6702, term6702.getClass(), "parent", null);
        setField(term6691, term6691.getClass(), "last", term6702);
        setField(term6691, term6691.getClass(), "propListHead", null);
        setIntField(term6691, term6691.getClass(), "sourcePosition", 0);
        setField(term6691, term6691.getClass(), "jsType", null);
        setField(term6691, term6691.getClass(), "parent", null);
        setField(term6689, term6689.getClass(), "next", term6691);
        setIntField(term6709, term6709.getClass(), "type", 1716165145);
        setField(term6709, term6709.getClass(), "next", term6702);
        setField(term6709, term6709.getClass(), "first", term6704);
        setField(term6709, term6709.getClass(), "last", term6687);
        setField(term6709, term6709.getClass(), "propListHead", null);
        setIntField(term6709, term6709.getClass(), "sourcePosition", 0);
        setField(term6709, term6709.getClass(), "jsType", null);
        setField(term6709, term6709.getClass(), "parent", null);
        setField(term6689, term6689.getClass(), "first", term6709);
        setField(term6689, term6689.getClass(), "last", term6709);
        setField(term6689, term6689.getClass(), "propListHead", null);
        setIntField(term6689, term6689.getClass(), "sourcePosition", 0);
        setField(term6689, term6689.getClass(), "jsType", null);
        setField(term6689, term6689.getClass(), "parent", null);
        setField(term6687, term6687.getClass(), "next", term6689);
        setField(term6687, term6687.getClass(), "first", term6693);
        setField(term6687, term6687.getClass(), "last", term6695);
        setField(term6687, term6687.getClass(), "propListHead", null);
        setIntField(term6687, term6687.getClass(), "sourcePosition", 0);
        setField(term6687, term6687.getClass(), "jsType", null);
        setField(term6687, term6687.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[5];
        args[0] = "SDbDgydVpg";
        args[1] = term6687;
        args[2] = "EEMaiNkiOH";
        args[3] = null;
        args[4] = null;
        try {
            callMethod(klass, "mismatch", argTypes, term6620, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


