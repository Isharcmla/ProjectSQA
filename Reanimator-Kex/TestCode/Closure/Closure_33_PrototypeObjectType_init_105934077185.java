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

public class PrototypeObjectType_init_105934077185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10899;
     Object term11680;
     Object term11685;

    public PrototypeObjectType_init_105934077185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10463 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term10573 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term10677 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term10757 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setBooleanField(term10463, term10463.getClass(), "resolved", false);
        setField(term10463, term10463.getClass(), "resolveResult", term10573);
        setField(term10463, term10463.getClass(), "registry", term10677);
        setField(term10463, term10463.getClass(), "docInfo", term10757);
        setBooleanField(term10463, term10463.getClass(), "unknown", false);
        setField(term10463, term10463.getClass(), "ownerFunction", null);
        setBooleanField(term10463, term10463.getClass(), "prettyPrint", false);
        setField(term10463, term10463.getClass(), "properties", null);
        setField(term10463, term10463.getClass(), "className", "");
        setBooleanField(term10463, term10463.getClass(), "nativeType", false);
        term10899 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        term11680 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term11683 = newInstance(Class.forName("java.util.TreeMap"));
        Object term11684 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term11680, term11680.getClass(), "className", "");
        setField(term11683, term11683.getClass(), "comparator", null);
        setField(term11683, term11683.getClass(), "root", null);
        setIntField(term11683, term11683.getClass(), "size", 0);
        setIntField(term11683, term11683.getClass(), "modCount", 0);
        setField(term11683, term11683.getClass(), "entrySet", null);
        setField(term11683, term11683.getClass(), "navigableKeySet", null);
        setField(term11683, term11683.getClass(), "descendingMap", null);
        setField(term11683, term11683.getClass(), "keySet", null);
        setField(term11683, term11683.getClass(), "values", null);
        setField(term11680, term11680.getClass(), "properties", term11683);
        setBooleanField(term11680, term11680.getClass(), "nativeType", true);
        setField(term11680, term11680.getClass(), "implicitPrototypeFallback", null);
        setField(term11680, term11680.getClass(), "ownerFunction", null);
        setBooleanField(term11680, term11680.getClass(), "prettyPrint", false);
        setBooleanField(term11680, term11680.getClass(), "visited", false);
        setField(term11680, term11680.getClass(), "docInfo", null);
        setBooleanField(term11680, term11680.getClass(), "unknown", true);
        setBooleanField(term11680, term11680.getClass(), "resolved", false);
        setField(term11680, term11680.getClass(), "resolveResult", null);
        setField(term11684, term11684.getClass(), "reporter", null);
        setField(term11684, term11684.getClass(), "nativeTypes", null);
        setField(term11684, term11684.getClass(), "namesToTypes", null);
        setField(term11684, term11684.getClass(), "namespaces", null);
        setField(term11684, term11684.getClass(), "nonNullableTypeNames", null);
        setField(term11684, term11684.getClass(), "forwardDeclaredTypes", null);
        setField(term11684, term11684.getClass(), "typesIndexedByProperty", null);
        setField(term11684, term11684.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term11684, term11684.getClass(), "greatestSubtypeByProperty", null);
        setField(term11684, term11684.getClass(), "interfaceToImplementors", null);
        setField(term11684, term11684.getClass(), "unresolvedNamedTypes", null);
        setField(term11684, term11684.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term11684, term11684.getClass(), "lastGeneration", false);
        setField(term11684, term11684.getClass(), "templateTypeName", null);
        setField(term11684, term11684.getClass(), "templateType", null);
        setBooleanField(term11684, term11684.getClass(), "tolerateUndefinedValues", false);
        setField(term11684, term11684.getClass(), "resolveMode", null);
        setField(term11680, term11680.getClass(), "registry", term11684);
        term11685 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term11685, term11685.getClass(), "reporter", null);
        setField(term11685, term11685.getClass(), "nativeTypes", null);
        setField(term11685, term11685.getClass(), "namesToTypes", null);
        setField(term11685, term11685.getClass(), "namespaces", null);
        setField(term11685, term11685.getClass(), "nonNullableTypeNames", null);
        setField(term11685, term11685.getClass(), "forwardDeclaredTypes", null);
        setField(term11685, term11685.getClass(), "typesIndexedByProperty", null);
        setField(term11685, term11685.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term11685, term11685.getClass(), "greatestSubtypeByProperty", null);
        setField(term11685, term11685.getClass(), "interfaceToImplementors", null);
        setField(term11685, term11685.getClass(), "unresolvedNamedTypes", null);
        setField(term11685, term11685.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term11685, term11685.getClass(), "lastGeneration", false);
        setField(term11685, term11685.getClass(), "templateTypeName", null);
        setField(term11685, term11685.getClass(), "templateType", null);
        setBooleanField(term11685, term11685.getClass(), "tolerateUndefinedValues", false);
        setField(term11685, term11685.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term10899;
        args[1] = "";
        args[2] = null;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11680));
        assertTrue(recursiveEquals(term10899, term11685));
    }

};


