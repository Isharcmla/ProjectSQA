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

public class PrototypeObjectType_init_1781841665123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15835;
     Object term15935;
     Object term40711;
     Object term40715;
     Object term40716;

    public PrototypeObjectType_init_1781841665123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term15693 = new HashMap();
        Object term15337 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term15461 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term15565 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term15645 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setBooleanField(term15337, term15337.getClass(), "resolved", false);
        setField(term15337, term15337.getClass(), "resolveResult", term15461);
        setField(term15337, term15337.getClass(), "registry", term15565);
        setField(term15337, term15337.getClass(), "docInfo", term15645);
        setBooleanField(term15337, term15337.getClass(), "unknown", false);
        setField(term15337, term15337.getClass(), "ownerFunction", null);
        setBooleanField(term15337, term15337.getClass(), "prettyPrint", false);
        setField(term15337, term15337.getClass(), "properties", term15693);
        setField(term15337, term15337.getClass(), "className", "");
        setBooleanField(term15337, term15337.getClass(), "nativeType", false);
        term15835 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        term15935 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term40711 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term40712 = newInstance(Class.forName("java.util.TreeMap"));
        Object term40713 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term40714 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term40711, term40711.getClass(), "className", null);
        setField(term40712, term40712.getClass(), "comparator", null);
        setField(term40712, term40712.getClass(), "root", null);
        setIntField(term40712, term40712.getClass(), "size", 0);
        setIntField(term40712, term40712.getClass(), "modCount", 0);
        setField(term40712, term40712.getClass(), "entrySet", null);
        setField(term40712, term40712.getClass(), "navigableKeySet", null);
        setField(term40712, term40712.getClass(), "descendingMap", null);
        setField(term40712, term40712.getClass(), "keySet", null);
        setField(term40712, term40712.getClass(), "values", null);
        setField(term40711, term40711.getClass(), "properties", term40712);
        setBooleanField(term40711, term40711.getClass(), "nativeType", false);
        setField(term40713, term40713.getClass(), "call", null);
        setField(term40713, term40713.getClass(), "prototypeSlot", null);
        setField(term40713, term40713.getClass(), "kind", null);
        setField(term40713, term40713.getClass(), "typeOfThis", null);
        setField(term40713, term40713.getClass(), "source", null);
        setField(term40713, term40713.getClass(), "implementedInterfaces", null);
        setField(term40713, term40713.getClass(), "extendedInterfaces", null);
        setField(term40713, term40713.getClass(), "subTypes", null);
        setField(term40713, term40713.getClass(), "templateTypeName", null);
        setField(term40713, term40713.getClass(), "className", null);
        setField(term40713, term40713.getClass(), "properties", null);
        setBooleanField(term40713, term40713.getClass(), "nativeType", false);
        setField(term40713, term40713.getClass(), "implicitPrototypeFallback", null);
        setField(term40713, term40713.getClass(), "ownerFunction", null);
        setBooleanField(term40713, term40713.getClass(), "prettyPrint", false);
        setBooleanField(term40713, term40713.getClass(), "visited", false);
        setField(term40713, term40713.getClass(), "docInfo", null);
        setBooleanField(term40713, term40713.getClass(), "unknown", false);
        setBooleanField(term40713, term40713.getClass(), "resolved", false);
        setField(term40713, term40713.getClass(), "resolveResult", null);
        setField(term40713, term40713.getClass(), "registry", null);
        setField(term40711, term40711.getClass(), "implicitPrototypeFallback", term40713);
        setField(term40711, term40711.getClass(), "ownerFunction", null);
        setBooleanField(term40711, term40711.getClass(), "prettyPrint", false);
        setBooleanField(term40711, term40711.getClass(), "visited", false);
        setField(term40711, term40711.getClass(), "docInfo", null);
        setBooleanField(term40711, term40711.getClass(), "unknown", true);
        setBooleanField(term40711, term40711.getClass(), "resolved", false);
        setField(term40711, term40711.getClass(), "resolveResult", null);
        setField(term40714, term40714.getClass(), "reporter", null);
        setField(term40714, term40714.getClass(), "nativeTypes", null);
        setField(term40714, term40714.getClass(), "namesToTypes", null);
        setField(term40714, term40714.getClass(), "namespaces", null);
        setField(term40714, term40714.getClass(), "nonNullableTypeNames", null);
        setField(term40714, term40714.getClass(), "forwardDeclaredTypes", null);
        setField(term40714, term40714.getClass(), "typesIndexedByProperty", null);
        setField(term40714, term40714.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term40714, term40714.getClass(), "greatestSubtypeByProperty", null);
        setField(term40714, term40714.getClass(), "interfaceToImplementors", null);
        setField(term40714, term40714.getClass(), "unresolvedNamedTypes", null);
        setField(term40714, term40714.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term40714, term40714.getClass(), "lastGeneration", false);
        setField(term40714, term40714.getClass(), "templateTypeName", null);
        setField(term40714, term40714.getClass(), "templateType", null);
        setBooleanField(term40714, term40714.getClass(), "tolerateUndefinedValues", false);
        setField(term40714, term40714.getClass(), "resolveMode", null);
        setField(term40711, term40711.getClass(), "registry", term40714);
        term40715 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term40715, term40715.getClass(), "reporter", null);
        setField(term40715, term40715.getClass(), "nativeTypes", null);
        setField(term40715, term40715.getClass(), "namesToTypes", null);
        setField(term40715, term40715.getClass(), "namespaces", null);
        setField(term40715, term40715.getClass(), "nonNullableTypeNames", null);
        setField(term40715, term40715.getClass(), "forwardDeclaredTypes", null);
        setField(term40715, term40715.getClass(), "typesIndexedByProperty", null);
        setField(term40715, term40715.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term40715, term40715.getClass(), "greatestSubtypeByProperty", null);
        setField(term40715, term40715.getClass(), "interfaceToImplementors", null);
        setField(term40715, term40715.getClass(), "unresolvedNamedTypes", null);
        setField(term40715, term40715.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term40715, term40715.getClass(), "lastGeneration", false);
        setField(term40715, term40715.getClass(), "templateTypeName", null);
        setField(term40715, term40715.getClass(), "templateType", null);
        setBooleanField(term40715, term40715.getClass(), "tolerateUndefinedValues", false);
        setField(term40715, term40715.getClass(), "resolveMode", null);
        term40716 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term40716, term40716.getClass(), "call", null);
        setField(term40716, term40716.getClass(), "prototypeSlot", null);
        setField(term40716, term40716.getClass(), "kind", null);
        setField(term40716, term40716.getClass(), "typeOfThis", null);
        setField(term40716, term40716.getClass(), "source", null);
        setField(term40716, term40716.getClass(), "implementedInterfaces", null);
        setField(term40716, term40716.getClass(), "extendedInterfaces", null);
        setField(term40716, term40716.getClass(), "subTypes", null);
        setField(term40716, term40716.getClass(), "templateTypeName", null);
        setField(term40716, term40716.getClass(), "className", null);
        setField(term40716, term40716.getClass(), "properties", null);
        setBooleanField(term40716, term40716.getClass(), "nativeType", false);
        setField(term40716, term40716.getClass(), "implicitPrototypeFallback", null);
        setField(term40716, term40716.getClass(), "ownerFunction", null);
        setBooleanField(term40716, term40716.getClass(), "prettyPrint", false);
        setBooleanField(term40716, term40716.getClass(), "visited", false);
        setField(term40716, term40716.getClass(), "docInfo", null);
        setBooleanField(term40716, term40716.getClass(), "unknown", false);
        setBooleanField(term40716, term40716.getClass(), "resolved", false);
        setField(term40716, term40716.getClass(), "resolveResult", null);
        setField(term40716, term40716.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[3];
        args[0] = term15835;
        args[1] = null;
        args[2] = term15935;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term40711));
        assertTrue(recursiveEquals(term15835, term40715));
        assertTrue(recursiveEquals(term15935, null));
    }

};


