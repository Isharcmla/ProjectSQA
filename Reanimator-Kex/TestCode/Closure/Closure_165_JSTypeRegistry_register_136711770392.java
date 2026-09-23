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

public class JSTypeRegistry_register_136711770392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1041;

    public JSTypeRegistry_register_136711770392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1043 = new HashMap();
        HashMap term1053 = new HashMap();
        Set<Object> term480582 =  ((Map) term1053).keySet();
        HashSet term1052 = new HashSet((Collection<? extends Object>) term480582);
        HashMap term1062 = new HashMap();
        Set<Object> term480583 =  ((Map) term1062).keySet();
        HashSet term1061 = new HashSet((Collection<? extends Object>) term480583);
        HashMap term1077 = new HashMap();
        Set<Object> term480584 =  ((Map) term1077).keySet();
        HashSet term1076 = new HashSet((Collection<? extends Object>) term480584);
        HashMap term1089 = new HashMap();
        HashMap term1104 = new HashMap();
        HashMap term1109 = new HashMap();
        term1041 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1042 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term1041, term1041.getClass(), "reporter", null);
        setField(term1041, term1041.getClass(), "nativeTypes", term1042);
        setField(term1041, term1041.getClass(), "namesToTypes", term1043);
        setField(term1041, term1041.getClass(), "namespaces", term1052);
        setField(term1041, term1041.getClass(), "nonNullableTypeNames", term1061);
        setField(term1041, term1041.getClass(), "forwardDeclaredTypes", term1076);
        setField(term1041, term1041.getClass(), "typesIndexedByProperty", term1089);
        setField(term1041, term1041.getClass(), "eachRefTypeIndexedByProperty", term1104);
        setField(term1041, term1041.getClass(), "greatestSubtypeByProperty", term1109);
        setField(term1041, term1041.getClass(), "interfaceToImplementors", null);
        setField(term1041, term1041.getClass(), "unresolvedNamedTypes", null);
        setField(term1041, term1041.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1041, term1041.getClass(), "lastGeneration", false);
        setField(term1041, term1041.getClass(), "templateTypeName", null);
        setField(term1041, term1041.getClass(), "templateType", null);
        setBooleanField(term1041, term1041.getClass(), "tolerateUndefinedValues", false);
        setField(term1041, term1041.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "register", argTypes, term1041, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


