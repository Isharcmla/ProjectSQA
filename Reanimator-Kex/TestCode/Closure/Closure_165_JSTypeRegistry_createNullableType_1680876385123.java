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

public class JSTypeRegistry_createNullableType_1680876385123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6927;

    public JSTypeRegistry_createNullableType_1680876385123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6929 = new HashMap();
        HashMap term6939 = new HashMap();
        Set<Object> term489293 =  ((Map) term6939).keySet();
        HashSet term6938 = new HashSet((Collection<? extends Object>) term489293);
        HashMap term6958 = new HashMap();
        Set<Object> term489294 =  ((Map) term6958).keySet();
        HashSet term6957 = new HashSet((Collection<? extends Object>) term489294);
        HashMap term6981 = new HashMap();
        Set<Object> term489295 =  ((Map) term6981).keySet();
        HashSet term6980 = new HashSet((Collection<? extends Object>) term489295);
        HashMap term6995 = new HashMap();
        HashMap term7010 = new HashMap();
        HashMap term7015 = new HashMap();
        term6927 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6928 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        setField(term6927, term6927.getClass(), "reporter", null);
        setField(term6927, term6927.getClass(), "nativeTypes", term6928);
        setField(term6927, term6927.getClass(), "namesToTypes", term6929);
        setField(term6927, term6927.getClass(), "namespaces", term6938);
        setField(term6927, term6927.getClass(), "nonNullableTypeNames", term6957);
        setField(term6927, term6927.getClass(), "forwardDeclaredTypes", term6980);
        setField(term6927, term6927.getClass(), "typesIndexedByProperty", term6995);
        setField(term6927, term6927.getClass(), "eachRefTypeIndexedByProperty", term7010);
        setField(term6927, term6927.getClass(), "greatestSubtypeByProperty", term7015);
        setField(term6927, term6927.getClass(), "interfaceToImplementors", null);
        setField(term6927, term6927.getClass(), "unresolvedNamedTypes", null);
        setField(term6927, term6927.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6927, term6927.getClass(), "lastGeneration", false);
        setField(term6927, term6927.getClass(), "templateTypeName", null);
        setField(term6927, term6927.getClass(), "templateType", null);
        setBooleanField(term6927, term6927.getClass(), "tolerateUndefinedValues", false);
        setField(term6927, term6927.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "createNullableType", argTypes, term6927, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


