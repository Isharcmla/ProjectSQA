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

public class JSTypeRegistry_initializeRegistry_21604168791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term963;

    public JSTypeRegistry_initializeRegistry_21604168791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term965 = new HashMap();
        HashMap term975 = new HashMap();
        Set<Object> term480328 =  ((Map) term975).keySet();
        HashSet term974 = new HashSet((Collection<? extends Object>) term480328);
        HashMap term986 = new HashMap();
        Set<Object> term480329 =  ((Map) term986).keySet();
        HashSet term985 = new HashSet((Collection<? extends Object>) term480329);
        HashMap term995 = new HashMap();
        Set<Object> term480330 =  ((Map) term995).keySet();
        HashSet term994 = new HashSet((Collection<? extends Object>) term480330);
        HashMap term1007 = new HashMap();
        HashMap term1022 = new HashMap();
        HashMap term1027 = new HashMap();
        term963 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term964 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term963, term963.getClass(), "reporter", null);
        setField(term963, term963.getClass(), "nativeTypes", term964);
        setField(term963, term963.getClass(), "namesToTypes", term965);
        setField(term963, term963.getClass(), "namespaces", term974);
        setField(term963, term963.getClass(), "nonNullableTypeNames", term985);
        setField(term963, term963.getClass(), "forwardDeclaredTypes", term994);
        setField(term963, term963.getClass(), "typesIndexedByProperty", term1007);
        setField(term963, term963.getClass(), "eachRefTypeIndexedByProperty", term1022);
        setField(term963, term963.getClass(), "greatestSubtypeByProperty", term1027);
        setField(term963, term963.getClass(), "interfaceToImplementors", null);
        setField(term963, term963.getClass(), "unresolvedNamedTypes", null);
        setField(term963, term963.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term963, term963.getClass(), "lastGeneration", false);
        setField(term963, term963.getClass(), "templateTypeName", null);
        setField(term963, term963.getClass(), "templateType", null);
        setBooleanField(term963, term963.getClass(), "tolerateUndefinedValues", false);
        setField(term963, term963.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "initializeRegistry", argTypes, term963, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


