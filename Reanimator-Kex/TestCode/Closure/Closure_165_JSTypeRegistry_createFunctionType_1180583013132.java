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
import java.util.LinkedList;

public class JSTypeRegistry_createFunctionType_1180583013132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9379;
     Object term9476;

    public JSTypeRegistry_createFunctionType_1180583013132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9381 = new HashMap();
        HashMap term9391 = new HashMap();
        Set<Object> term494270 =  ((Map) term9391).keySet();
        HashSet term9390 = new HashSet((Collection<? extends Object>) term494270);
        HashMap term9408 = new HashMap();
        Set<Object> term494271 =  ((Map) term9408).keySet();
        HashSet term9407 = new HashSet((Collection<? extends Object>) term494271);
        HashMap term9429 = new HashMap();
        Set<Object> term494272 =  ((Map) term9429).keySet();
        HashSet term9428 = new HashSet((Collection<? extends Object>) term494272);
        HashMap term9445 = new HashMap();
        HashMap term9460 = new HashMap();
        HashMap term9465 = new HashMap();
        term9379 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term9380 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        setField(term9379, term9379.getClass(), "reporter", null);
        setField(term9379, term9379.getClass(), "nativeTypes", term9380);
        setField(term9379, term9379.getClass(), "namesToTypes", term9381);
        setField(term9379, term9379.getClass(), "namespaces", term9390);
        setField(term9379, term9379.getClass(), "nonNullableTypeNames", term9407);
        setField(term9379, term9379.getClass(), "forwardDeclaredTypes", term9428);
        setField(term9379, term9379.getClass(), "typesIndexedByProperty", term9445);
        setField(term9379, term9379.getClass(), "eachRefTypeIndexedByProperty", term9460);
        setField(term9379, term9379.getClass(), "greatestSubtypeByProperty", term9465);
        setField(term9379, term9379.getClass(), "interfaceToImplementors", null);
        setField(term9379, term9379.getClass(), "unresolvedNamedTypes", null);
        setField(term9379, term9379.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term9379, term9379.getClass(), "lastGeneration", false);
        setField(term9379, term9379.getClass(), "templateTypeName", null);
        setField(term9379, term9379.getClass(), "templateType", null);
        setBooleanField(term9379, term9379.getClass(), "tolerateUndefinedValues", false);
        setField(term9379, term9379.getClass(), "resolveMode", null);
        term9476 = new LinkedList();
        ((LinkedList) term9476).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term9476;
        try {
            callMethod(klass, "createFunctionType", argTypes, term9379, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


