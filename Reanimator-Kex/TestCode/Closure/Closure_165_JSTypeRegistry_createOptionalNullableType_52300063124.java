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

public class JSTypeRegistry_createOptionalNullableType_52300063124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7029;

    public JSTypeRegistry_createOptionalNullableType_52300063124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7031 = new HashMap();
        HashMap term7041 = new HashMap();
        Set<Object> term489296 =  ((Map) term7041).keySet();
        HashSet term7040 = new HashSet((Collection<? extends Object>) term489296);
        HashMap term7050 = new HashMap();
        Set<Object> term489297 =  ((Map) term7050).keySet();
        HashSet term7049 = new HashSet((Collection<? extends Object>) term489297);
        HashMap term7071 = new HashMap();
        Set<Object> term489298 =  ((Map) term7071).keySet();
        HashSet term7070 = new HashSet((Collection<? extends Object>) term489298);
        HashMap term7087 = new HashMap();
        HashMap term7102 = new HashMap();
        HashMap term7107 = new HashMap();
        term7029 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term7030 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term7029, term7029.getClass(), "reporter", null);
        setField(term7029, term7029.getClass(), "nativeTypes", term7030);
        setField(term7029, term7029.getClass(), "namesToTypes", term7031);
        setField(term7029, term7029.getClass(), "namespaces", term7040);
        setField(term7029, term7029.getClass(), "nonNullableTypeNames", term7049);
        setField(term7029, term7029.getClass(), "forwardDeclaredTypes", term7070);
        setField(term7029, term7029.getClass(), "typesIndexedByProperty", term7087);
        setField(term7029, term7029.getClass(), "eachRefTypeIndexedByProperty", term7102);
        setField(term7029, term7029.getClass(), "greatestSubtypeByProperty", term7107);
        setField(term7029, term7029.getClass(), "interfaceToImplementors", null);
        setField(term7029, term7029.getClass(), "unresolvedNamedTypes", null);
        setField(term7029, term7029.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term7029, term7029.getClass(), "lastGeneration", false);
        setField(term7029, term7029.getClass(), "templateTypeName", null);
        setField(term7029, term7029.getClass(), "templateType", null);
        setBooleanField(term7029, term7029.getClass(), "tolerateUndefinedValues", false);
        setField(term7029, term7029.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "createOptionalNullableType", argTypes, term7029, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


