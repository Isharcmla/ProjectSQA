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

public class JSTypeRegistry_clearNamedTypes_356652503119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6557;

    public JSTypeRegistry_clearNamedTypes_356652503119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6559 = new HashMap();
        HashMap term6569 = new HashMap();
        Set<Object> term487467 =  ((Map) term6569).keySet();
        HashSet term6568 = new HashSet((Collection<? extends Object>) term487467);
        HashMap term6592 = new HashMap();
        Set<Object> term487468 =  ((Map) term6592).keySet();
        HashSet term6591 = new HashSet((Collection<? extends Object>) term487468);
        HashMap term6609 = new HashMap();
        Set<Object> term487469 =  ((Map) term6609).keySet();
        HashSet term6608 = new HashSet((Collection<? extends Object>) term487469);
        HashMap term6631 = new HashMap();
        HashMap term6646 = new HashMap();
        HashMap term6651 = new HashMap();
        term6557 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6558 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        setField(term6557, term6557.getClass(), "reporter", null);
        setField(term6557, term6557.getClass(), "nativeTypes", term6558);
        setField(term6557, term6557.getClass(), "namesToTypes", term6559);
        setField(term6557, term6557.getClass(), "namespaces", term6568);
        setField(term6557, term6557.getClass(), "nonNullableTypeNames", term6591);
        setField(term6557, term6557.getClass(), "forwardDeclaredTypes", term6608);
        setField(term6557, term6557.getClass(), "typesIndexedByProperty", term6631);
        setField(term6557, term6557.getClass(), "eachRefTypeIndexedByProperty", term6646);
        setField(term6557, term6557.getClass(), "greatestSubtypeByProperty", term6651);
        setField(term6557, term6557.getClass(), "interfaceToImplementors", null);
        setField(term6557, term6557.getClass(), "unresolvedNamedTypes", null);
        setField(term6557, term6557.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6557, term6557.getClass(), "lastGeneration", false);
        setField(term6557, term6557.getClass(), "templateTypeName", null);
        setField(term6557, term6557.getClass(), "templateType", null);
        setBooleanField(term6557, term6557.getClass(), "tolerateUndefinedValues", false);
        setField(term6557, term6557.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clearNamedTypes", argTypes, term6557, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


