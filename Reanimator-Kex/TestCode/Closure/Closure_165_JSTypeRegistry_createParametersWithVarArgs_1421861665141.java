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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class JSTypeRegistry_createParametersWithVarArgs_1421861665141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10193;
     Object term10288;

    public JSTypeRegistry_createParametersWithVarArgs_1421861665141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10195 = new HashMap();
        HashMap term10205 = new HashMap();
        Set<Object> term499741 =  ((Map) term10205).keySet();
        HashSet term10204 = new HashSet((Collection<? extends Object>) term499741);
        HashMap term10228 = new HashMap();
        Set<Object> term499742 =  ((Map) term10228).keySet();
        HashSet term10227 = new HashSet((Collection<? extends Object>) term499742);
        HashMap term10239 = new HashMap();
        Set<Object> term499743 =  ((Map) term10239).keySet();
        HashSet term10238 = new HashSet((Collection<? extends Object>) term499743);
        HashMap term10257 = new HashMap();
        HashMap term10272 = new HashMap();
        HashMap term10277 = new HashMap();
        term10193 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term10194 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term10193, term10193.getClass(), "reporter", null);
        setField(term10193, term10193.getClass(), "nativeTypes", term10194);
        setField(term10193, term10193.getClass(), "namesToTypes", term10195);
        setField(term10193, term10193.getClass(), "namespaces", term10204);
        setField(term10193, term10193.getClass(), "nonNullableTypeNames", term10227);
        setField(term10193, term10193.getClass(), "forwardDeclaredTypes", term10238);
        setField(term10193, term10193.getClass(), "typesIndexedByProperty", term10257);
        setField(term10193, term10193.getClass(), "eachRefTypeIndexedByProperty", term10272);
        setField(term10193, term10193.getClass(), "greatestSubtypeByProperty", term10277);
        setField(term10193, term10193.getClass(), "interfaceToImplementors", null);
        setField(term10193, term10193.getClass(), "unresolvedNamedTypes", null);
        setField(term10193, term10193.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term10193, term10193.getClass(), "lastGeneration", false);
        setField(term10193, term10193.getClass(), "templateTypeName", null);
        setField(term10193, term10193.getClass(), "templateType", null);
        setBooleanField(term10193, term10193.getClass(), "tolerateUndefinedValues", false);
        setField(term10193, term10193.getClass(), "resolveMode", null);
        term10288 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("com.google.javascript.rhino.jstype.JSType"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term10288;
        try {
            callMethod(klass, "createParametersWithVarArgs", argTypes, term10193, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


