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

public class PrototypeObjectType_init_1059340771142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25510;
     Object term25648;
     Object term25685;
     Object term25691;
     Object term25692;

    public PrototypeObjectType_init_1059340771142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term25368 = new HashMap();
        Object term25036 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term25136 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term25240 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term25320 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setBooleanField(term25036, term25036.getClass(), "resolved", false);
        setField(term25036, term25036.getClass(), "resolveResult", term25136);
        setBooleanField(term25036, term25036.getClass(), "inTemplatedCheckVisit", false);
        setField(term25036, term25036.getClass(), "registry", term25240);
        setField(term25036, term25036.getClass(), "docInfo", term25320);
        setBooleanField(term25036, term25036.getClass(), "unknown", false);
        setField(term25036, term25036.getClass(), "ownerFunction", null);
        setBooleanField(term25036, term25036.getClass(), "prettyPrint", false);
        setField(term25036, term25036.getClass(), "properties", term25368);
        setField(term25036, term25036.getClass(), "className", "");
        setBooleanField(term25036, term25036.getClass(), "nativeType", false);
        term25510 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        term25648 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term25685 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term25688 = newInstance(Class.forName("java.util.TreeMap"));
        Object term25689 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term25690 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term25685, term25685.getClass(), "className", "");
        setField(term25688, term25688.getClass(), "comparator", null);
        setField(term25688, term25688.getClass(), "root", null);
        setIntField(term25688, term25688.getClass(), "size", 0);
        setIntField(term25688, term25688.getClass(), "modCount", 0);
        setField(term25688, term25688.getClass(), "entrySet", null);
        setField(term25688, term25688.getClass(), "navigableKeySet", null);
        setField(term25688, term25688.getClass(), "descendingMap", null);
        setField(term25688, term25688.getClass(), "keySet", null);
        setField(term25688, term25688.getClass(), "values", null);
        setField(term25685, term25685.getClass(), "properties", term25688);
        setBooleanField(term25685, term25685.getClass(), "nativeType", false);
        setField(term25689, term25689.getClass(), "call", null);
        setField(term25689, term25689.getClass(), "prototypeSlot", null);
        setField(term25689, term25689.getClass(), "kind", null);
        setField(term25689, term25689.getClass(), "typeOfThis", null);
        setField(term25689, term25689.getClass(), "source", null);
        setField(term25689, term25689.getClass(), "implementedInterfaces", null);
        setField(term25689, term25689.getClass(), "extendedInterfaces", null);
        setField(term25689, term25689.getClass(), "subTypes", null);
        setField(term25689, term25689.getClass(), "templateTypeNames", null);
        setField(term25689, term25689.getClass(), "className", null);
        setField(term25689, term25689.getClass(), "properties", null);
        setBooleanField(term25689, term25689.getClass(), "nativeType", false);
        setField(term25689, term25689.getClass(), "implicitPrototypeFallback", null);
        setField(term25689, term25689.getClass(), "ownerFunction", null);
        setBooleanField(term25689, term25689.getClass(), "prettyPrint", false);
        setBooleanField(term25689, term25689.getClass(), "visited", false);
        setField(term25689, term25689.getClass(), "docInfo", null);
        setBooleanField(term25689, term25689.getClass(), "unknown", false);
        setBooleanField(term25689, term25689.getClass(), "resolved", false);
        setField(term25689, term25689.getClass(), "resolveResult", null);
        setBooleanField(term25689, term25689.getClass(), "inTemplatedCheckVisit", false);
        setField(term25689, term25689.getClass(), "registry", null);
        setField(term25685, term25685.getClass(), "implicitPrototypeFallback", term25689);
        setField(term25685, term25685.getClass(), "ownerFunction", null);
        setBooleanField(term25685, term25685.getClass(), "prettyPrint", false);
        setBooleanField(term25685, term25685.getClass(), "visited", false);
        setField(term25685, term25685.getClass(), "docInfo", null);
        setBooleanField(term25685, term25685.getClass(), "unknown", true);
        setBooleanField(term25685, term25685.getClass(), "resolved", false);
        setField(term25685, term25685.getClass(), "resolveResult", null);
        setBooleanField(term25685, term25685.getClass(), "inTemplatedCheckVisit", false);
        setField(term25690, term25690.getClass(), "reporter", null);
        setField(term25690, term25690.getClass(), "nativeTypes", null);
        setField(term25690, term25690.getClass(), "namesToTypes", null);
        setField(term25690, term25690.getClass(), "namespaces", null);
        setField(term25690, term25690.getClass(), "nonNullableTypeNames", null);
        setField(term25690, term25690.getClass(), "forwardDeclaredTypes", null);
        setField(term25690, term25690.getClass(), "typesIndexedByProperty", null);
        setField(term25690, term25690.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term25690, term25690.getClass(), "greatestSubtypeByProperty", null);
        setField(term25690, term25690.getClass(), "interfaceToImplementors", null);
        setField(term25690, term25690.getClass(), "unresolvedNamedTypes", null);
        setField(term25690, term25690.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term25690, term25690.getClass(), "lastGeneration", false);
        setField(term25690, term25690.getClass(), "templateTypes", null);
        setBooleanField(term25690, term25690.getClass(), "tolerateUndefinedValues", false);
        setField(term25690, term25690.getClass(), "resolveMode", null);
        setField(term25685, term25685.getClass(), "registry", term25690);
        term25691 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term25691, term25691.getClass(), "reporter", null);
        setField(term25691, term25691.getClass(), "nativeTypes", null);
        setField(term25691, term25691.getClass(), "namesToTypes", null);
        setField(term25691, term25691.getClass(), "namespaces", null);
        setField(term25691, term25691.getClass(), "nonNullableTypeNames", null);
        setField(term25691, term25691.getClass(), "forwardDeclaredTypes", null);
        setField(term25691, term25691.getClass(), "typesIndexedByProperty", null);
        setField(term25691, term25691.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term25691, term25691.getClass(), "greatestSubtypeByProperty", null);
        setField(term25691, term25691.getClass(), "interfaceToImplementors", null);
        setField(term25691, term25691.getClass(), "unresolvedNamedTypes", null);
        setField(term25691, term25691.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term25691, term25691.getClass(), "lastGeneration", false);
        setField(term25691, term25691.getClass(), "templateTypes", null);
        setBooleanField(term25691, term25691.getClass(), "tolerateUndefinedValues", false);
        setField(term25691, term25691.getClass(), "resolveMode", null);
        term25692 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term25692, term25692.getClass(), "call", null);
        setField(term25692, term25692.getClass(), "prototypeSlot", null);
        setField(term25692, term25692.getClass(), "kind", null);
        setField(term25692, term25692.getClass(), "typeOfThis", null);
        setField(term25692, term25692.getClass(), "source", null);
        setField(term25692, term25692.getClass(), "implementedInterfaces", null);
        setField(term25692, term25692.getClass(), "extendedInterfaces", null);
        setField(term25692, term25692.getClass(), "subTypes", null);
        setField(term25692, term25692.getClass(), "templateTypeNames", null);
        setField(term25692, term25692.getClass(), "className", null);
        setField(term25692, term25692.getClass(), "properties", null);
        setBooleanField(term25692, term25692.getClass(), "nativeType", false);
        setField(term25692, term25692.getClass(), "implicitPrototypeFallback", null);
        setField(term25692, term25692.getClass(), "ownerFunction", null);
        setBooleanField(term25692, term25692.getClass(), "prettyPrint", false);
        setBooleanField(term25692, term25692.getClass(), "visited", false);
        setField(term25692, term25692.getClass(), "docInfo", null);
        setBooleanField(term25692, term25692.getClass(), "unknown", false);
        setBooleanField(term25692, term25692.getClass(), "resolved", false);
        setField(term25692, term25692.getClass(), "resolveResult", null);
        setBooleanField(term25692, term25692.getClass(), "inTemplatedCheckVisit", false);
        setField(term25692, term25692.getClass(), "registry", null);
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
        args[0] = term25510;
        args[1] = "";
        args[2] = term25648;
        args[3] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term25685));
        assertTrue(recursiveEquals(term25510, term25691));
        assertTrue(recursiveEquals(term25648, ""));
    }

};


