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

public class JSTypeRegistry_getDirectImplementors_1722977444108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4426;

    public JSTypeRegistry_getDirectImplementors_1722977444108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4428 = new HashMap();
        HashMap term4438 = new HashMap();
        Set<Object> term485176 =  ((Map) term4438).keySet();
        HashSet term4437 = new HashSet((Collection<? extends Object>) term485176);
        HashMap term4444 = new HashMap();
        Set<Object> term485177 =  ((Map) term4444).keySet();
        HashSet term4443 = new HashSet((Collection<? extends Object>) term485177);
        HashMap term4453 = new HashMap();
        Set<Object> term485178 =  ((Map) term4453).keySet();
        HashSet term4452 = new HashSet((Collection<? extends Object>) term485178);
        HashMap term4469 = new HashMap();
        HashMap term4484 = new HashMap();
        HashMap term4489 = new HashMap();
        term4426 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term4427 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term4426, term4426.getClass(), "reporter", null);
        setField(term4426, term4426.getClass(), "nativeTypes", term4427);
        setField(term4426, term4426.getClass(), "namesToTypes", term4428);
        setField(term4426, term4426.getClass(), "namespaces", term4437);
        setField(term4426, term4426.getClass(), "nonNullableTypeNames", term4443);
        setField(term4426, term4426.getClass(), "forwardDeclaredTypes", term4452);
        setField(term4426, term4426.getClass(), "typesIndexedByProperty", term4469);
        setField(term4426, term4426.getClass(), "eachRefTypeIndexedByProperty", term4484);
        setField(term4426, term4426.getClass(), "greatestSubtypeByProperty", term4489);
        setField(term4426, term4426.getClass(), "interfaceToImplementors", null);
        setField(term4426, term4426.getClass(), "unresolvedNamedTypes", null);
        setField(term4426, term4426.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4426, term4426.getClass(), "lastGeneration", false);
        setField(term4426, term4426.getClass(), "templateTypeName", null);
        setField(term4426, term4426.getClass(), "templateType", null);
        setBooleanField(term4426, term4426.getClass(), "tolerateUndefinedValues", false);
        setField(term4426, term4426.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getDirectImplementors", argTypes, term4426, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


