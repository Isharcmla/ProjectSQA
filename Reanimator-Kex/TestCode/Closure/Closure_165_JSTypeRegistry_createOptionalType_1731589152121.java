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

public class JSTypeRegistry_createOptionalType_1731589152121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6765;

    public JSTypeRegistry_createOptionalType_1731589152121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6767 = new HashMap();
        HashMap term6777 = new HashMap();
        Set<Object> term487722 =  ((Map) term6777).keySet();
        HashSet term6776 = new HashSet((Collection<? extends Object>) term487722);
        HashMap term6790 = new HashMap();
        Set<Object> term487723 =  ((Map) term6790).keySet();
        HashSet term6789 = new HashSet((Collection<? extends Object>) term487723);
        HashMap term6796 = new HashMap();
        Set<Object> term487724 =  ((Map) term6796).keySet();
        HashSet term6795 = new HashSet((Collection<? extends Object>) term487724);
        HashMap term6812 = new HashMap();
        HashMap term6827 = new HashMap();
        HashMap term6832 = new HashMap();
        term6765 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6766 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        setField(term6765, term6765.getClass(), "reporter", null);
        setField(term6765, term6765.getClass(), "nativeTypes", term6766);
        setField(term6765, term6765.getClass(), "namesToTypes", term6767);
        setField(term6765, term6765.getClass(), "namespaces", term6776);
        setField(term6765, term6765.getClass(), "nonNullableTypeNames", term6789);
        setField(term6765, term6765.getClass(), "forwardDeclaredTypes", term6795);
        setField(term6765, term6765.getClass(), "typesIndexedByProperty", term6812);
        setField(term6765, term6765.getClass(), "eachRefTypeIndexedByProperty", term6827);
        setField(term6765, term6765.getClass(), "greatestSubtypeByProperty", term6832);
        setField(term6765, term6765.getClass(), "interfaceToImplementors", null);
        setField(term6765, term6765.getClass(), "unresolvedNamedTypes", null);
        setField(term6765, term6765.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6765, term6765.getClass(), "lastGeneration", false);
        setField(term6765, term6765.getClass(), "templateTypeName", null);
        setField(term6765, term6765.getClass(), "templateType", null);
        setBooleanField(term6765, term6765.getClass(), "tolerateUndefinedValues", false);
        setField(term6765, term6765.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "createOptionalType", argTypes, term6765, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


