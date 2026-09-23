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

public class PrototypeObjectType_init_105934077186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11552;
     Object term11652;
     Object term11718;
     Object term11722;
     Object term11723;

    public PrototypeObjectType_init_105934077186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11410 = new HashMap();
        Object term11074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term11178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term11282 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term11362 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setBooleanField(term11074, term11074.getClass(), "resolved", false);
        setField(term11074, term11074.getClass(), "resolveResult", term11178);
        setField(term11074, term11074.getClass(), "registry", term11282);
        setField(term11074, term11074.getClass(), "docInfo", term11362);
        setBooleanField(term11074, term11074.getClass(), "unknown", false);
        setField(term11074, term11074.getClass(), "ownerFunction", null);
        setBooleanField(term11074, term11074.getClass(), "prettyPrint", false);
        setField(term11074, term11074.getClass(), "properties", term11410);
        setField(term11074, term11074.getClass(), "className", "");
        setBooleanField(term11074, term11074.getClass(), "nativeType", false);
        term11552 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        term11652 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term11718 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term11719 = newInstance(Class.forName("java.util.TreeMap"));
        Object term11720 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term11721 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term11718, term11718.getClass(), "className", null);
        setField(term11719, term11719.getClass(), "comparator", null);
        setField(term11719, term11719.getClass(), "root", null);
        setIntField(term11719, term11719.getClass(), "size", 0);
        setIntField(term11719, term11719.getClass(), "modCount", 0);
        setField(term11719, term11719.getClass(), "entrySet", null);
        setField(term11719, term11719.getClass(), "navigableKeySet", null);
        setField(term11719, term11719.getClass(), "descendingMap", null);
        setField(term11719, term11719.getClass(), "keySet", null);
        setField(term11719, term11719.getClass(), "values", null);
        setField(term11718, term11718.getClass(), "properties", term11719);
        setBooleanField(term11718, term11718.getClass(), "nativeType", false);
        setField(term11720, term11720.getClass(), "call", null);
        setField(term11720, term11720.getClass(), "prototypeSlot", null);
        setField(term11720, term11720.getClass(), "kind", null);
        setField(term11720, term11720.getClass(), "typeOfThis", null);
        setField(term11720, term11720.getClass(), "source", null);
        setField(term11720, term11720.getClass(), "implementedInterfaces", null);
        setField(term11720, term11720.getClass(), "extendedInterfaces", null);
        setField(term11720, term11720.getClass(), "subTypes", null);
        setField(term11720, term11720.getClass(), "templateTypeName", null);
        setField(term11720, term11720.getClass(), "className", null);
        setField(term11720, term11720.getClass(), "properties", null);
        setBooleanField(term11720, term11720.getClass(), "nativeType", false);
        setField(term11720, term11720.getClass(), "implicitPrototypeFallback", null);
        setField(term11720, term11720.getClass(), "ownerFunction", null);
        setBooleanField(term11720, term11720.getClass(), "prettyPrint", false);
        setBooleanField(term11720, term11720.getClass(), "visited", false);
        setField(term11720, term11720.getClass(), "docInfo", null);
        setBooleanField(term11720, term11720.getClass(), "unknown", false);
        setBooleanField(term11720, term11720.getClass(), "resolved", false);
        setField(term11720, term11720.getClass(), "resolveResult", null);
        setField(term11720, term11720.getClass(), "registry", null);
        setField(term11718, term11718.getClass(), "implicitPrototypeFallback", term11720);
        setField(term11718, term11718.getClass(), "ownerFunction", null);
        setBooleanField(term11718, term11718.getClass(), "prettyPrint", false);
        setBooleanField(term11718, term11718.getClass(), "visited", false);
        setField(term11718, term11718.getClass(), "docInfo", null);
        setBooleanField(term11718, term11718.getClass(), "unknown", true);
        setBooleanField(term11718, term11718.getClass(), "resolved", false);
        setField(term11718, term11718.getClass(), "resolveResult", null);
        setField(term11721, term11721.getClass(), "reporter", null);
        setField(term11721, term11721.getClass(), "nativeTypes", null);
        setField(term11721, term11721.getClass(), "namesToTypes", null);
        setField(term11721, term11721.getClass(), "namespaces", null);
        setField(term11721, term11721.getClass(), "nonNullableTypeNames", null);
        setField(term11721, term11721.getClass(), "forwardDeclaredTypes", null);
        setField(term11721, term11721.getClass(), "typesIndexedByProperty", null);
        setField(term11721, term11721.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term11721, term11721.getClass(), "greatestSubtypeByProperty", null);
        setField(term11721, term11721.getClass(), "interfaceToImplementors", null);
        setField(term11721, term11721.getClass(), "unresolvedNamedTypes", null);
        setField(term11721, term11721.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term11721, term11721.getClass(), "lastGeneration", false);
        setField(term11721, term11721.getClass(), "templateTypeName", null);
        setField(term11721, term11721.getClass(), "templateType", null);
        setBooleanField(term11721, term11721.getClass(), "tolerateUndefinedValues", false);
        setField(term11721, term11721.getClass(), "resolveMode", null);
        setField(term11718, term11718.getClass(), "registry", term11721);
        term11722 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term11722, term11722.getClass(), "reporter", null);
        setField(term11722, term11722.getClass(), "nativeTypes", null);
        setField(term11722, term11722.getClass(), "namesToTypes", null);
        setField(term11722, term11722.getClass(), "namespaces", null);
        setField(term11722, term11722.getClass(), "nonNullableTypeNames", null);
        setField(term11722, term11722.getClass(), "forwardDeclaredTypes", null);
        setField(term11722, term11722.getClass(), "typesIndexedByProperty", null);
        setField(term11722, term11722.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term11722, term11722.getClass(), "greatestSubtypeByProperty", null);
        setField(term11722, term11722.getClass(), "interfaceToImplementors", null);
        setField(term11722, term11722.getClass(), "unresolvedNamedTypes", null);
        setField(term11722, term11722.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term11722, term11722.getClass(), "lastGeneration", false);
        setField(term11722, term11722.getClass(), "templateTypeName", null);
        setField(term11722, term11722.getClass(), "templateType", null);
        setBooleanField(term11722, term11722.getClass(), "tolerateUndefinedValues", false);
        setField(term11722, term11722.getClass(), "resolveMode", null);
        term11723 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term11723, term11723.getClass(), "call", null);
        setField(term11723, term11723.getClass(), "prototypeSlot", null);
        setField(term11723, term11723.getClass(), "kind", null);
        setField(term11723, term11723.getClass(), "typeOfThis", null);
        setField(term11723, term11723.getClass(), "source", null);
        setField(term11723, term11723.getClass(), "implementedInterfaces", null);
        setField(term11723, term11723.getClass(), "extendedInterfaces", null);
        setField(term11723, term11723.getClass(), "subTypes", null);
        setField(term11723, term11723.getClass(), "templateTypeName", null);
        setField(term11723, term11723.getClass(), "className", null);
        setField(term11723, term11723.getClass(), "properties", null);
        setBooleanField(term11723, term11723.getClass(), "nativeType", false);
        setField(term11723, term11723.getClass(), "implicitPrototypeFallback", null);
        setField(term11723, term11723.getClass(), "ownerFunction", null);
        setBooleanField(term11723, term11723.getClass(), "prettyPrint", false);
        setBooleanField(term11723, term11723.getClass(), "visited", false);
        setField(term11723, term11723.getClass(), "docInfo", null);
        setBooleanField(term11723, term11723.getClass(), "unknown", false);
        setBooleanField(term11723, term11723.getClass(), "resolved", false);
        setField(term11723, term11723.getClass(), "resolveResult", null);
        setField(term11723, term11723.getClass(), "registry", null);
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
        args[0] = term11552;
        args[1] = null;
        args[2] = term11652;
        args[3] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11718));
        assertTrue(recursiveEquals(term11552, term11722));
        assertTrue(recursiveEquals(term11652, null));
    }

};


