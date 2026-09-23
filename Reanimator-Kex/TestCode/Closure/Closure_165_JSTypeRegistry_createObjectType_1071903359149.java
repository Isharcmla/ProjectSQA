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

public class JSTypeRegistry_createObjectType_1071903359149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11629;

    public JSTypeRegistry_createObjectType_1071903359149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11631 = new HashMap();
        HashMap term11641 = new HashMap();
        Set<Object> term505629 =  ((Map) term11641).keySet();
        HashSet term11640 = new HashSet((Collection<? extends Object>) term505629);
        HashMap term11656 = new HashMap();
        Set<Object> term505630 =  ((Map) term11656).keySet();
        HashSet term11655 = new HashSet((Collection<? extends Object>) term505630);
        HashMap term11673 = new HashMap();
        Set<Object> term505631 =  ((Map) term11673).keySet();
        HashSet term11672 = new HashSet((Collection<? extends Object>) term505631);
        HashMap term11681 = new HashMap();
        HashMap term11696 = new HashMap();
        HashMap term11701 = new HashMap();
        term11629 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term11630 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term11629, term11629.getClass(), "reporter", null);
        setField(term11629, term11629.getClass(), "nativeTypes", term11630);
        setField(term11629, term11629.getClass(), "namesToTypes", term11631);
        setField(term11629, term11629.getClass(), "namespaces", term11640);
        setField(term11629, term11629.getClass(), "nonNullableTypeNames", term11655);
        setField(term11629, term11629.getClass(), "forwardDeclaredTypes", term11672);
        setField(term11629, term11629.getClass(), "typesIndexedByProperty", term11681);
        setField(term11629, term11629.getClass(), "eachRefTypeIndexedByProperty", term11696);
        setField(term11629, term11629.getClass(), "greatestSubtypeByProperty", term11701);
        setField(term11629, term11629.getClass(), "interfaceToImplementors", null);
        setField(term11629, term11629.getClass(), "unresolvedNamedTypes", null);
        setField(term11629, term11629.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term11629, term11629.getClass(), "lastGeneration", false);
        setField(term11629, term11629.getClass(), "templateTypeName", null);
        setField(term11629, term11629.getClass(), "templateType", null);
        setBooleanField(term11629, term11629.getClass(), "tolerateUndefinedValues", false);
        setField(term11629, term11629.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "createObjectType", argTypes, term11629, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


