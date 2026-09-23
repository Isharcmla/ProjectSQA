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
import java.lang.String;

public class JSTypeRegistry_getNativeObjectType_1231210993116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5618;
     Object enum25;

    public JSTypeRegistry_getNativeObjectType_1231210993116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5620 = new HashMap();
        HashMap term5630 = new HashMap();
        Set<Object> term486839 =  ((Map) term5630).keySet();
        HashSet term5629 = new HashSet((Collection<? extends Object>) term486839);
        HashMap term5649 = new HashMap();
        Set<Object> term486840 =  ((Map) term5649).keySet();
        HashSet term5648 = new HashSet((Collection<? extends Object>) term486840);
        HashMap term5666 = new HashMap();
        Set<Object> term486841 =  ((Map) term5666).keySet();
        HashSet term5665 = new HashSet((Collection<? extends Object>) term486841);
        HashMap term5682 = new HashMap();
        HashMap term5697 = new HashMap();
        HashMap term5702 = new HashMap();
        term5618 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term5619 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term5618, term5618.getClass(), "reporter", null);
        setField(term5618, term5618.getClass(), "nativeTypes", term5619);
        setField(term5618, term5618.getClass(), "namesToTypes", term5620);
        setField(term5618, term5618.getClass(), "namespaces", term5629);
        setField(term5618, term5618.getClass(), "nonNullableTypeNames", term5648);
        setField(term5618, term5618.getClass(), "forwardDeclaredTypes", term5665);
        setField(term5618, term5618.getClass(), "typesIndexedByProperty", term5682);
        setField(term5618, term5618.getClass(), "eachRefTypeIndexedByProperty", term5697);
        setField(term5618, term5618.getClass(), "greatestSubtypeByProperty", term5702);
        setField(term5618, term5618.getClass(), "interfaceToImplementors", null);
        setField(term5618, term5618.getClass(), "unresolvedNamedTypes", null);
        setField(term5618, term5618.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term5618, term5618.getClass(), "lastGeneration", false);
        setField(term5618, term5618.getClass(), "templateTypeName", null);
        setField(term5618, term5618.getClass(), "templateType", null);
        setBooleanField(term5618, term5618.getClass(), "tolerateUndefinedValues", false);
        setField(term5618, term5618.getClass(), "resolveMode", null);
        Class<? extends Object> term486843 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term486842 = ((Class) term486843).getDeclaredField((String) "GREATEST_FUNCTION_TYPE");
        ((Field) term486842).setAccessible(true);
        enum25 = ((Field) term486842).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum25;
        try {
            callMethod(klass, "getNativeObjectType", argTypes, term5618, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


