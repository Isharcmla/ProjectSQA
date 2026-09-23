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

public class JSTypeRegistry_createUnionType_1396522391125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7121;
     Object term7224;

    public JSTypeRegistry_createUnionType_1396522391125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7123 = new HashMap();
        HashMap term7133 = new HashMap();
        Set<Object> term489311 =  ((Map) term7133).keySet();
        HashSet term7132 = new HashSet((Collection<? extends Object>) term489311);
        HashMap term7154 = new HashMap();
        Set<Object> term489312 =  ((Map) term7154).keySet();
        HashSet term7153 = new HashSet((Collection<? extends Object>) term489312);
        HashMap term7171 = new HashMap();
        Set<Object> term489313 =  ((Map) term7171).keySet();
        HashSet term7170 = new HashSet((Collection<? extends Object>) term489313);
        HashMap term7193 = new HashMap();
        HashMap term7208 = new HashMap();
        HashMap term7213 = new HashMap();
        term7121 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term7122 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term7121, term7121.getClass(), "reporter", null);
        setField(term7121, term7121.getClass(), "nativeTypes", term7122);
        setField(term7121, term7121.getClass(), "namesToTypes", term7123);
        setField(term7121, term7121.getClass(), "namespaces", term7132);
        setField(term7121, term7121.getClass(), "nonNullableTypeNames", term7153);
        setField(term7121, term7121.getClass(), "forwardDeclaredTypes", term7170);
        setField(term7121, term7121.getClass(), "typesIndexedByProperty", term7193);
        setField(term7121, term7121.getClass(), "eachRefTypeIndexedByProperty", term7208);
        setField(term7121, term7121.getClass(), "greatestSubtypeByProperty", term7213);
        setField(term7121, term7121.getClass(), "interfaceToImplementors", null);
        setField(term7121, term7121.getClass(), "unresolvedNamedTypes", null);
        setField(term7121, term7121.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term7121, term7121.getClass(), "lastGeneration", false);
        setField(term7121, term7121.getClass(), "templateTypeName", null);
        setField(term7121, term7121.getClass(), "templateType", null);
        setBooleanField(term7121, term7121.getClass(), "tolerateUndefinedValues", false);
        setField(term7121, term7121.getClass(), "resolveMode", null);
        term7224 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("com.google.javascript.rhino.jstype.JSType"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term7224;
        try {
            callMethod(klass, "createUnionType", argTypes, term7121, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


