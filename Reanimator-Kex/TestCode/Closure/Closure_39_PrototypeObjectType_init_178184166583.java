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
import java.util.HashMap;

public class PrototypeObjectType_init_178184166583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10711;
     Object term10811;
     Object term11269;
     Object term11273;
     Object term11274;

    public PrototypeObjectType_init_178184166583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10569 = new HashMap();
        Object term10227 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term10337 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term10441 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term10521 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setBooleanField(term10227, term10227.getClass(), "resolved", false);
        setField(term10227, term10227.getClass(), "resolveResult", term10337);
        setField(term10227, term10227.getClass(), "registry", term10441);
        setField(term10227, term10227.getClass(), "docInfo", term10521);
        setBooleanField(term10227, term10227.getClass(), "unknown", false);
        setField(term10227, term10227.getClass(), "ownerFunction", null);
        setBooleanField(term10227, term10227.getClass(), "prettyPrint", false);
        setField(term10227, term10227.getClass(), "properties", term10569);
        setField(term10227, term10227.getClass(), "className", "");
        setBooleanField(term10227, term10227.getClass(), "nativeType", false);
        term10711 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        term10811 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term11269 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term11270 = newInstance(Class.forName("java.util.TreeMap"));
        Object term11271 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term11272 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term11269, term11269.getClass(), "className", null);
        setField(term11270, term11270.getClass(), "comparator", null);
        setField(term11270, term11270.getClass(), "root", null);
        setIntField(term11270, term11270.getClass(), "size", 0);
        setIntField(term11270, term11270.getClass(), "modCount", 0);
        setField(term11270, term11270.getClass(), "entrySet", null);
        setField(term11270, term11270.getClass(), "navigableKeySet", null);
        setField(term11270, term11270.getClass(), "descendingMap", null);
        setField(term11270, term11270.getClass(), "keySet", null);
        setField(term11270, term11270.getClass(), "values", null);
        setField(term11269, term11269.getClass(), "properties", term11270);
        setBooleanField(term11269, term11269.getClass(), "nativeType", false);
        setField(term11271, term11271.getClass(), "call", null);
        setField(term11271, term11271.getClass(), "prototypeSlot", null);
        setField(term11271, term11271.getClass(), "kind", null);
        setField(term11271, term11271.getClass(), "typeOfThis", null);
        setField(term11271, term11271.getClass(), "source", null);
        setField(term11271, term11271.getClass(), "implementedInterfaces", null);
        setField(term11271, term11271.getClass(), "extendedInterfaces", null);
        setField(term11271, term11271.getClass(), "subTypes", null);
        setField(term11271, term11271.getClass(), "templateTypeName", null);
        setField(term11271, term11271.getClass(), "className", null);
        setField(term11271, term11271.getClass(), "properties", null);
        setBooleanField(term11271, term11271.getClass(), "nativeType", false);
        setField(term11271, term11271.getClass(), "implicitPrototypeFallback", null);
        setField(term11271, term11271.getClass(), "ownerFunction", null);
        setBooleanField(term11271, term11271.getClass(), "prettyPrint", false);
        setBooleanField(term11271, term11271.getClass(), "visited", false);
        setField(term11271, term11271.getClass(), "docInfo", null);
        setBooleanField(term11271, term11271.getClass(), "unknown", false);
        setBooleanField(term11271, term11271.getClass(), "resolved", false);
        setField(term11271, term11271.getClass(), "resolveResult", null);
        setField(term11271, term11271.getClass(), "registry", null);
        setField(term11269, term11269.getClass(), "implicitPrototypeFallback", term11271);
        setField(term11269, term11269.getClass(), "ownerFunction", null);
        setBooleanField(term11269, term11269.getClass(), "prettyPrint", false);
        setBooleanField(term11269, term11269.getClass(), "visited", false);
        setField(term11269, term11269.getClass(), "docInfo", null);
        setBooleanField(term11269, term11269.getClass(), "unknown", true);
        setBooleanField(term11269, term11269.getClass(), "resolved", false);
        setField(term11269, term11269.getClass(), "resolveResult", null);
        setField(term11272, term11272.getClass(), "reporter", null);
        setField(term11272, term11272.getClass(), "nativeTypes", null);
        setField(term11272, term11272.getClass(), "namesToTypes", null);
        setField(term11272, term11272.getClass(), "namespaces", null);
        setField(term11272, term11272.getClass(), "nonNullableTypeNames", null);
        setField(term11272, term11272.getClass(), "forwardDeclaredTypes", null);
        setField(term11272, term11272.getClass(), "typesIndexedByProperty", null);
        setField(term11272, term11272.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term11272, term11272.getClass(), "greatestSubtypeByProperty", null);
        setField(term11272, term11272.getClass(), "interfaceToImplementors", null);
        setField(term11272, term11272.getClass(), "unresolvedNamedTypes", null);
        setField(term11272, term11272.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term11272, term11272.getClass(), "lastGeneration", false);
        setField(term11272, term11272.getClass(), "templateTypeName", null);
        setField(term11272, term11272.getClass(), "templateType", null);
        setBooleanField(term11272, term11272.getClass(), "tolerateUndefinedValues", false);
        setField(term11272, term11272.getClass(), "resolveMode", null);
        setField(term11269, term11269.getClass(), "registry", term11272);
        term11273 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term11273, term11273.getClass(), "reporter", null);
        setField(term11273, term11273.getClass(), "nativeTypes", null);
        setField(term11273, term11273.getClass(), "namesToTypes", null);
        setField(term11273, term11273.getClass(), "namespaces", null);
        setField(term11273, term11273.getClass(), "nonNullableTypeNames", null);
        setField(term11273, term11273.getClass(), "forwardDeclaredTypes", null);
        setField(term11273, term11273.getClass(), "typesIndexedByProperty", null);
        setField(term11273, term11273.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term11273, term11273.getClass(), "greatestSubtypeByProperty", null);
        setField(term11273, term11273.getClass(), "interfaceToImplementors", null);
        setField(term11273, term11273.getClass(), "unresolvedNamedTypes", null);
        setField(term11273, term11273.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term11273, term11273.getClass(), "lastGeneration", false);
        setField(term11273, term11273.getClass(), "templateTypeName", null);
        setField(term11273, term11273.getClass(), "templateType", null);
        setBooleanField(term11273, term11273.getClass(), "tolerateUndefinedValues", false);
        setField(term11273, term11273.getClass(), "resolveMode", null);
        term11274 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term11274, term11274.getClass(), "call", null);
        setField(term11274, term11274.getClass(), "prototypeSlot", null);
        setField(term11274, term11274.getClass(), "kind", null);
        setField(term11274, term11274.getClass(), "typeOfThis", null);
        setField(term11274, term11274.getClass(), "source", null);
        setField(term11274, term11274.getClass(), "implementedInterfaces", null);
        setField(term11274, term11274.getClass(), "extendedInterfaces", null);
        setField(term11274, term11274.getClass(), "subTypes", null);
        setField(term11274, term11274.getClass(), "templateTypeName", null);
        setField(term11274, term11274.getClass(), "className", null);
        setField(term11274, term11274.getClass(), "properties", null);
        setBooleanField(term11274, term11274.getClass(), "nativeType", false);
        setField(term11274, term11274.getClass(), "implicitPrototypeFallback", null);
        setField(term11274, term11274.getClass(), "ownerFunction", null);
        setBooleanField(term11274, term11274.getClass(), "prettyPrint", false);
        setBooleanField(term11274, term11274.getClass(), "visited", false);
        setField(term11274, term11274.getClass(), "docInfo", null);
        setBooleanField(term11274, term11274.getClass(), "unknown", false);
        setBooleanField(term11274, term11274.getClass(), "resolved", false);
        setField(term11274, term11274.getClass(), "resolveResult", null);
        setField(term11274, term11274.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[3];
        args[0] = term10711;
        args[1] = null;
        args[2] = term10811;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11269));
        assertTrue(recursiveEquals(term10711, term11273));
        assertTrue(recursiveEquals(term10811, null));
    }

};


