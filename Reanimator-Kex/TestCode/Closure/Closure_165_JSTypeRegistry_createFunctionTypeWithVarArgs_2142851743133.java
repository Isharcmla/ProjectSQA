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

public class JSTypeRegistry_createFunctionTypeWithVarArgs_2142851743133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9483;
     Object term9572;

    public JSTypeRegistry_createFunctionTypeWithVarArgs_2142851743133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9485 = new HashMap();
        HashMap term9495 = new HashMap();
        Set<Object> term495400 =  ((Map) term9495).keySet();
        HashSet term9494 = new HashSet((Collection<? extends Object>) term495400);
        HashMap term9504 = new HashMap();
        Set<Object> term495401 =  ((Map) term9504).keySet();
        HashSet term9503 = new HashSet((Collection<? extends Object>) term495401);
        HashMap term9519 = new HashMap();
        Set<Object> term495402 =  ((Map) term9519).keySet();
        HashSet term9518 = new HashSet((Collection<? extends Object>) term495402);
        HashMap term9541 = new HashMap();
        HashMap term9556 = new HashMap();
        HashMap term9561 = new HashMap();
        term9483 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term9484 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term9483, term9483.getClass(), "reporter", null);
        setField(term9483, term9483.getClass(), "nativeTypes", term9484);
        setField(term9483, term9483.getClass(), "namesToTypes", term9485);
        setField(term9483, term9483.getClass(), "namespaces", term9494);
        setField(term9483, term9483.getClass(), "nonNullableTypeNames", term9503);
        setField(term9483, term9483.getClass(), "forwardDeclaredTypes", term9518);
        setField(term9483, term9483.getClass(), "typesIndexedByProperty", term9541);
        setField(term9483, term9483.getClass(), "eachRefTypeIndexedByProperty", term9556);
        setField(term9483, term9483.getClass(), "greatestSubtypeByProperty", term9561);
        setField(term9483, term9483.getClass(), "interfaceToImplementors", null);
        setField(term9483, term9483.getClass(), "unresolvedNamedTypes", null);
        setField(term9483, term9483.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term9483, term9483.getClass(), "lastGeneration", false);
        setField(term9483, term9483.getClass(), "templateTypeName", null);
        setField(term9483, term9483.getClass(), "templateType", null);
        setBooleanField(term9483, term9483.getClass(), "tolerateUndefinedValues", false);
        setField(term9483, term9483.getClass(), "resolveMode", null);
        term9572 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.rhino.jstype.JSType"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term9572;
        try {
            callMethod(klass, "createFunctionTypeWithVarArgs", argTypes, term9483, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


