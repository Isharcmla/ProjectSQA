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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;

public class JSTypeRegistry_hasTypeName_872336494167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term524684;
     Object term524776;
     Object term524898;
     Object term524899;

    public JSTypeRegistry_hasTypeName_872336494167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term524684 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        term524776 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term524868 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term524776, term524776.getClass(), "type", -41);
        setField(term524776, term524776.getClass(), "first", term524868);
        term524898 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term524898, term524898.getClass(), "reporter", null);
        setField(term524898, term524898.getClass(), "nativeTypes", null);
        setField(term524898, term524898.getClass(), "namesToTypes", null);
        setField(term524898, term524898.getClass(), "namespaces", null);
        setField(term524898, term524898.getClass(), "nonNullableTypeNames", null);
        setField(term524898, term524898.getClass(), "forwardDeclaredTypes", null);
        setField(term524898, term524898.getClass(), "typesIndexedByProperty", null);
        setField(term524898, term524898.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term524898, term524898.getClass(), "greatestSubtypeByProperty", null);
        setField(term524898, term524898.getClass(), "interfaceToImplementors", null);
        setField(term524898, term524898.getClass(), "unresolvedNamedTypes", null);
        setField(term524898, term524898.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term524898, term524898.getClass(), "lastGeneration", false);
        setField(term524898, term524898.getClass(), "templateTypeName", null);
        setField(term524898, term524898.getClass(), "templateType", null);
        setBooleanField(term524898, term524898.getClass(), "tolerateUndefinedValues", false);
        setField(term524898, term524898.getClass(), "resolveMode", null);
        term524899 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term524900 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term524899, term524899.getClass(), "number", 0.0);
        setIntField(term524899, term524899.getClass(), "type", -41);
        setField(term524899, term524899.getClass(), "next", null);
        setDoubleField(term524900, term524900.getClass(), "number", 0.0);
        setIntField(term524900, term524900.getClass(), "type", 0);
        setField(term524900, term524900.getClass(), "next", null);
        setField(term524900, term524900.getClass(), "first", null);
        setField(term524900, term524900.getClass(), "last", null);
        setField(term524900, term524900.getClass(), "propListHead", null);
        setIntField(term524900, term524900.getClass(), "sourcePosition", 0);
        setField(term524900, term524900.getClass(), "jsType", null);
        setField(term524900, term524900.getClass(), "parent", null);
        setField(term524899, term524899.getClass(), "first", term524900);
        setField(term524899, term524899.getClass(), "last", null);
        setField(term524899, term524899.getClass(), "propListHead", null);
        setIntField(term524899, term524899.getClass(), "sourcePosition", 0);
        setField(term524899, term524899.getClass(), "jsType", null);
        setField(term524899, term524899.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term524776;
        Object retValue = callMethod(klass, "hasTypeName", argTypes, term524684, args);
        assertTrue(recursiveEquals(term524684, term524898));
        assertTrue(recursiveEquals(term524776, term524899));
        assertTrue(recursiveEquals(retValue, false));
    }

};


