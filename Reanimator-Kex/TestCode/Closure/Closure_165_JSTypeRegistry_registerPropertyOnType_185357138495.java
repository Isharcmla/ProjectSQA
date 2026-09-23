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

public class JSTypeRegistry_registerPropertyOnType_185357138495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2838;

    public JSTypeRegistry_registerPropertyOnType_185357138495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2840 = new HashMap();
        HashMap term2850 = new HashMap();
        Set<Object> term481588 =  ((Map) term2850).keySet();
        HashSet term2849 = new HashSet((Collection<? extends Object>) term481588);
        HashMap term2867 = new HashMap();
        Set<Object> term481589 =  ((Map) term2867).keySet();
        HashSet term2866 = new HashSet((Collection<? extends Object>) term481589);
        HashMap term2876 = new HashMap();
        Set<Object> term481590 =  ((Map) term2876).keySet();
        HashSet term2875 = new HashSet((Collection<? extends Object>) term481590);
        HashMap term2894 = new HashMap();
        HashMap term2909 = new HashMap();
        HashMap term2914 = new HashMap();
        term2838 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2839 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term2838, term2838.getClass(), "reporter", null);
        setField(term2838, term2838.getClass(), "nativeTypes", term2839);
        setField(term2838, term2838.getClass(), "namesToTypes", term2840);
        setField(term2838, term2838.getClass(), "namespaces", term2849);
        setField(term2838, term2838.getClass(), "nonNullableTypeNames", term2866);
        setField(term2838, term2838.getClass(), "forwardDeclaredTypes", term2875);
        setField(term2838, term2838.getClass(), "typesIndexedByProperty", term2894);
        setField(term2838, term2838.getClass(), "eachRefTypeIndexedByProperty", term2909);
        setField(term2838, term2838.getClass(), "greatestSubtypeByProperty", term2914);
        setField(term2838, term2838.getClass(), "interfaceToImplementors", null);
        setField(term2838, term2838.getClass(), "unresolvedNamedTypes", null);
        setField(term2838, term2838.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2838, term2838.getClass(), "lastGeneration", false);
        setField(term2838, term2838.getClass(), "templateTypeName", null);
        setField(term2838, term2838.getClass(), "templateType", null);
        setBooleanField(term2838, term2838.getClass(), "tolerateUndefinedValues", false);
        setField(term2838, term2838.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = "vMsWjuPTnO";
        args[1] = null;
        try {
            callMethod(klass, "registerPropertyOnType", argTypes, term2838, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


