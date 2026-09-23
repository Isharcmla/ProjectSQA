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

public class JSTypeRegistry_resolveTypesInScope_1426981329120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6665;

    public JSTypeRegistry_resolveTypesInScope_1426981329120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6667 = new HashMap();
        HashMap term6677 = new HashMap();
        Set<Object> term487470 =  ((Map) term6677).keySet();
        HashSet term6676 = new HashSet((Collection<? extends Object>) term487470);
        HashMap term6696 = new HashMap();
        Set<Object> term487471 =  ((Map) term6696).keySet();
        HashSet term6695 = new HashSet((Collection<? extends Object>) term487471);
        HashMap term6719 = new HashMap();
        Set<Object> term487472 =  ((Map) term6719).keySet();
        HashSet term6718 = new HashSet((Collection<? extends Object>) term487472);
        HashMap term6731 = new HashMap();
        HashMap term6746 = new HashMap();
        HashMap term6751 = new HashMap();
        term6665 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6666 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term6665, term6665.getClass(), "reporter", null);
        setField(term6665, term6665.getClass(), "nativeTypes", term6666);
        setField(term6665, term6665.getClass(), "namesToTypes", term6667);
        setField(term6665, term6665.getClass(), "namespaces", term6676);
        setField(term6665, term6665.getClass(), "nonNullableTypeNames", term6695);
        setField(term6665, term6665.getClass(), "forwardDeclaredTypes", term6718);
        setField(term6665, term6665.getClass(), "typesIndexedByProperty", term6731);
        setField(term6665, term6665.getClass(), "eachRefTypeIndexedByProperty", term6746);
        setField(term6665, term6665.getClass(), "greatestSubtypeByProperty", term6751);
        setField(term6665, term6665.getClass(), "interfaceToImplementors", null);
        setField(term6665, term6665.getClass(), "unresolvedNamedTypes", null);
        setField(term6665, term6665.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6665, term6665.getClass(), "lastGeneration", false);
        setField(term6665, term6665.getClass(), "templateTypeName", null);
        setField(term6665, term6665.getClass(), "templateType", null);
        setBooleanField(term6665, term6665.getClass(), "tolerateUndefinedValues", false);
        setField(term6665, term6665.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "resolveTypesInScope", argTypes, term6665, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


