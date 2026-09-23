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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.lang.Boolean;

public class RecordType_init_130766274212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198;
     Object term277;
     Object term359;

    public RecordType_init_130766274212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term200 = new HashMap();
        HashMap term210 = new HashMap();
        Set<Object> term2164 =  ((Map) term210).keySet();
        HashSet term209 = new HashSet((Collection<? extends Object>) term2164);
        HashMap term225 = new HashMap();
        Set<Object> term2165 =  ((Map) term225).keySet();
        HashSet term224 = new HashSet((Collection<? extends Object>) term2165);
        HashMap term238 = new HashMap();
        Set<Object> term2166 =  ((Map) term238).keySet();
        HashSet term237 = new HashSet((Collection<? extends Object>) term2166);
        HashMap term246 = new HashMap();
        HashMap term261 = new HashMap();
        HashMap term266 = new HashMap();
        term198 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term199 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term198, term198.getClass(), "reporter", null);
        setField(term198, term198.getClass(), "nativeTypes", term199);
        setField(term198, term198.getClass(), "namesToTypes", term200);
        setField(term198, term198.getClass(), "namespaces", term209);
        setField(term198, term198.getClass(), "nonNullableTypeNames", term224);
        setField(term198, term198.getClass(), "forwardDeclaredTypes", term237);
        setField(term198, term198.getClass(), "typesIndexedByProperty", term246);
        setField(term198, term198.getClass(), "eachRefTypeIndexedByProperty", term261);
        setField(term198, term198.getClass(), "greatestSubtypeByProperty", term266);
        setField(term198, term198.getClass(), "interfaceToImplementors", null);
        setField(term198, term198.getClass(), "unresolvedNamedTypes", null);
        setField(term198, term198.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term198, term198.getClass(), "lastGeneration", false);
        setField(term198, term198.getClass(), "templateTypes", null);
        setBooleanField(term198, term198.getClass(), "tolerateUndefinedValues", false);
        setField(term198, term198.getClass(), "resolveMode", null);
        term277 = new LinkedHashMap();
        term359 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[1] = Class.forName("java.util.Map");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term198;
        args[1] = term277;
        args[2] = term359;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


