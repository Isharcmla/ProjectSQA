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

public class JSTypeRegistry_initializeBuiltInTypes_130615465890 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term875;

    public JSTypeRegistry_initializeBuiltInTypes_130615465890() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term877 = new HashMap();
        HashMap term887 = new HashMap();
        Set<Object> term480006 =  ((Map) term887).keySet();
        HashSet term886 = new HashSet((Collection<? extends Object>) term480006);
        HashMap term896 = new HashMap();
        Set<Object> term480007 =  ((Map) term896).keySet();
        HashSet term895 = new HashSet((Collection<? extends Object>) term480007);
        HashMap term913 = new HashMap();
        Set<Object> term480008 =  ((Map) term913).keySet();
        HashSet term912 = new HashSet((Collection<? extends Object>) term480008);
        HashMap term929 = new HashMap();
        HashMap term944 = new HashMap();
        HashMap term949 = new HashMap();
        term875 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term876 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term875, term875.getClass(), "reporter", null);
        setField(term875, term875.getClass(), "nativeTypes", term876);
        setField(term875, term875.getClass(), "namesToTypes", term877);
        setField(term875, term875.getClass(), "namespaces", term886);
        setField(term875, term875.getClass(), "nonNullableTypeNames", term895);
        setField(term875, term875.getClass(), "forwardDeclaredTypes", term912);
        setField(term875, term875.getClass(), "typesIndexedByProperty", term929);
        setField(term875, term875.getClass(), "eachRefTypeIndexedByProperty", term944);
        setField(term875, term875.getClass(), "greatestSubtypeByProperty", term949);
        setField(term875, term875.getClass(), "interfaceToImplementors", null);
        setField(term875, term875.getClass(), "unresolvedNamedTypes", null);
        setField(term875, term875.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term875, term875.getClass(), "lastGeneration", false);
        setField(term875, term875.getClass(), "templateTypeName", null);
        setField(term875, term875.getClass(), "templateType", null);
        setBooleanField(term875, term875.getClass(), "tolerateUndefinedValues", false);
        setField(term875, term875.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "initializeBuiltInTypes", argTypes, term875, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


