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

public class PrototypeObjectType_init_105934077187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11150;
     Object term11520;
     Object term11525;

    public PrototypeObjectType_init_105934077187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10732 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term10824 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        Object term10928 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term11008 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setBooleanField(term10732, term10732.getClass(), "resolved", false);
        setField(term10732, term10732.getClass(), "resolveResult", term10824);
        setBooleanField(term10732, term10732.getClass(), "inTemplatedCheckVisit", false);
        setField(term10732, term10732.getClass(), "registry", term10928);
        setField(term10732, term10732.getClass(), "docInfo", term11008);
        setBooleanField(term10732, term10732.getClass(), "unknown", false);
        setField(term10732, term10732.getClass(), "ownerFunction", null);
        setBooleanField(term10732, term10732.getClass(), "prettyPrint", false);
        setField(term10732, term10732.getClass(), "properties", null);
        setField(term10732, term10732.getClass(), "className", "");
        setBooleanField(term10732, term10732.getClass(), "nativeType", false);
        term11150 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        term11520 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term11523 = newInstance(Class.forName("java.util.TreeMap"));
        Object term11524 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term11520, term11520.getClass(), "className", "");
        setField(term11523, term11523.getClass(), "comparator", null);
        setField(term11523, term11523.getClass(), "root", null);
        setIntField(term11523, term11523.getClass(), "size", 0);
        setIntField(term11523, term11523.getClass(), "modCount", 0);
        setField(term11523, term11523.getClass(), "entrySet", null);
        setField(term11523, term11523.getClass(), "navigableKeySet", null);
        setField(term11523, term11523.getClass(), "descendingMap", null);
        setField(term11523, term11523.getClass(), "keySet", null);
        setField(term11523, term11523.getClass(), "values", null);
        setField(term11520, term11520.getClass(), "properties", term11523);
        setBooleanField(term11520, term11520.getClass(), "nativeType", true);
        setField(term11520, term11520.getClass(), "implicitPrototypeFallback", null);
        setField(term11520, term11520.getClass(), "ownerFunction", null);
        setBooleanField(term11520, term11520.getClass(), "prettyPrint", false);
        setBooleanField(term11520, term11520.getClass(), "visited", false);
        setField(term11520, term11520.getClass(), "docInfo", null);
        setBooleanField(term11520, term11520.getClass(), "unknown", true);
        setBooleanField(term11520, term11520.getClass(), "resolved", false);
        setField(term11520, term11520.getClass(), "resolveResult", null);
        setBooleanField(term11520, term11520.getClass(), "inTemplatedCheckVisit", false);
        setField(term11524, term11524.getClass(), "reporter", null);
        setField(term11524, term11524.getClass(), "nativeTypes", null);
        setField(term11524, term11524.getClass(), "namesToTypes", null);
        setField(term11524, term11524.getClass(), "namespaces", null);
        setField(term11524, term11524.getClass(), "nonNullableTypeNames", null);
        setField(term11524, term11524.getClass(), "forwardDeclaredTypes", null);
        setField(term11524, term11524.getClass(), "typesIndexedByProperty", null);
        setField(term11524, term11524.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term11524, term11524.getClass(), "greatestSubtypeByProperty", null);
        setField(term11524, term11524.getClass(), "interfaceToImplementors", null);
        setField(term11524, term11524.getClass(), "unresolvedNamedTypes", null);
        setField(term11524, term11524.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term11524, term11524.getClass(), "lastGeneration", false);
        setField(term11524, term11524.getClass(), "templateTypes", null);
        setBooleanField(term11524, term11524.getClass(), "tolerateUndefinedValues", false);
        setField(term11524, term11524.getClass(), "resolveMode", null);
        setField(term11520, term11520.getClass(), "registry", term11524);
        term11525 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term11525, term11525.getClass(), "reporter", null);
        setField(term11525, term11525.getClass(), "nativeTypes", null);
        setField(term11525, term11525.getClass(), "namesToTypes", null);
        setField(term11525, term11525.getClass(), "namespaces", null);
        setField(term11525, term11525.getClass(), "nonNullableTypeNames", null);
        setField(term11525, term11525.getClass(), "forwardDeclaredTypes", null);
        setField(term11525, term11525.getClass(), "typesIndexedByProperty", null);
        setField(term11525, term11525.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term11525, term11525.getClass(), "greatestSubtypeByProperty", null);
        setField(term11525, term11525.getClass(), "interfaceToImplementors", null);
        setField(term11525, term11525.getClass(), "unresolvedNamedTypes", null);
        setField(term11525, term11525.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term11525, term11525.getClass(), "lastGeneration", false);
        setField(term11525, term11525.getClass(), "templateTypes", null);
        setBooleanField(term11525, term11525.getClass(), "tolerateUndefinedValues", false);
        setField(term11525, term11525.getClass(), "resolveMode", null);
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
        args[0] = term11150;
        args[1] = "";
        args[2] = null;
        args[3] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11520));
        assertTrue(recursiveEquals(term11150, term11525));
    }

};


