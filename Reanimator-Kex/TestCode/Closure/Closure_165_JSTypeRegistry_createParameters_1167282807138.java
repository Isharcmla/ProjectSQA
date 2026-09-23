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
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class JSTypeRegistry_createParameters_1167282807138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9928;
     Object term10007;
     Object term497717;
     Object term497729;
     Object term497711;

    public JSTypeRegistry_createParameters_1167282807138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9930 = new HashMap();
        HashMap term9940 = new HashMap();
        Set<Object> term497730 =  ((Map) term9940).keySet();
        HashSet term9939 = new HashSet((Collection<? extends Object>) term497730);
        HashMap term9949 = new HashMap();
        Set<Object> term497731 =  ((Map) term9949).keySet();
        HashSet term9948 = new HashSet((Collection<? extends Object>) term497731);
        HashMap term9962 = new HashMap();
        Set<Object> term497732 =  ((Map) term9962).keySet();
        HashSet term9961 = new HashSet((Collection<? extends Object>) term497732);
        HashMap term9976 = new HashMap();
        HashMap term9991 = new HashMap();
        HashMap term9996 = new HashMap();
        term9928 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term9929 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term9928, term9928.getClass(), "reporter", null);
        setField(term9928, term9928.getClass(), "nativeTypes", term9929);
        setField(term9928, term9928.getClass(), "namesToTypes", term9930);
        setField(term9928, term9928.getClass(), "namespaces", term9939);
        setField(term9928, term9928.getClass(), "nonNullableTypeNames", term9948);
        setField(term9928, term9928.getClass(), "forwardDeclaredTypes", term9961);
        setField(term9928, term9928.getClass(), "typesIndexedByProperty", term9976);
        setField(term9928, term9928.getClass(), "eachRefTypeIndexedByProperty", term9991);
        setField(term9928, term9928.getClass(), "greatestSubtypeByProperty", term9996);
        setField(term9928, term9928.getClass(), "interfaceToImplementors", null);
        setField(term9928, term9928.getClass(), "unresolvedNamedTypes", null);
        setField(term9928, term9928.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term9928, term9928.getClass(), "lastGeneration", false);
        setField(term9928, term9928.getClass(), "templateTypeName", null);
        setField(term9928, term9928.getClass(), "templateType", null);
        setBooleanField(term9928, term9928.getClass(), "tolerateUndefinedValues", false);
        setField(term9928, term9928.getClass(), "resolveMode", null);
        term10007 = new LinkedList();
        HashMap term497719 = new HashMap();
        HashMap term497721 = new HashMap();
        Set<Object> term497733 =  ((Map) term497721).keySet();
        HashSet term497720 = new HashSet((Collection<? extends Object>) term497733);
        HashMap term497723 = new HashMap();
        Set<Object> term497734 =  ((Map) term497723).keySet();
        HashSet term497722 = new HashSet((Collection<? extends Object>) term497734);
        HashMap term497725 = new HashMap();
        Set<Object> term497735 =  ((Map) term497725).keySet();
        HashSet term497724 = new HashSet((Collection<? extends Object>) term497735);
        HashMap term497726 = new HashMap();
        HashMap term497727 = new HashMap();
        HashMap term497728 = new HashMap();
        term497717 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term497718 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term497717, term497717.getClass(), "reporter", null);
        setField(term497717, term497717.getClass(), "nativeTypes", term497718);
        setField(term497717, term497717.getClass(), "namesToTypes", term497719);
        setField(term497717, term497717.getClass(), "namespaces", term497720);
        setField(term497717, term497717.getClass(), "nonNullableTypeNames", term497722);
        setField(term497717, term497717.getClass(), "forwardDeclaredTypes", term497724);
        setField(term497717, term497717.getClass(), "typesIndexedByProperty", term497726);
        setField(term497717, term497717.getClass(), "eachRefTypeIndexedByProperty", term497727);
        setField(term497717, term497717.getClass(), "greatestSubtypeByProperty", term497728);
        setField(term497717, term497717.getClass(), "interfaceToImplementors", null);
        setField(term497717, term497717.getClass(), "unresolvedNamedTypes", null);
        setField(term497717, term497717.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term497717, term497717.getClass(), "lastGeneration", false);
        setField(term497717, term497717.getClass(), "templateTypeName", null);
        setField(term497717, term497717.getClass(), "templateType", null);
        setBooleanField(term497717, term497717.getClass(), "tolerateUndefinedValues", false);
        setField(term497717, term497717.getClass(), "resolveMode", null);
        term497729 = new LinkedList();
        term497711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term497711, term497711.getClass(), "type", 83);
        setField(term497711, term497711.getClass(), "next", null);
        setField(term497711, term497711.getClass(), "first", null);
        setField(term497711, term497711.getClass(), "last", null);
        setField(term497711, term497711.getClass(), "propListHead", null);
        setIntField(term497711, term497711.getClass(), "sourcePosition", -1);
        setField(term497711, term497711.getClass(), "jsType", null);
        setField(term497711, term497711.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term10007;
        Object retValue = callMethod(klass, "createParameters", argTypes, term9928, args);
        assertTrue(recursiveEquals(term9928, term497717));
        assertTrue(recursiveEquals(term10007, term497729));
        assertTrue(recursiveEquals(retValue, term497711));
    }

};


