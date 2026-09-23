package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;
import java.util.ArrayList;

public class TypedScopeCreator_declareNativeFunctionType_123196205514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1002;
     Object term1076;
     Object enum14;

    public TypedScopeCreator_declareNativeFunctionType_123196205514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1006 = new HashMap();
        HashMap term1013 = new HashMap();
        Set<Object> term9533 =  ((Map) term1013).keySet();
        HashSet term1012 = new HashSet((Collection<? extends Object>) term9533);
        HashMap term1019 = new HashMap();
        Set<Object> term9534 =  ((Map) term1019).keySet();
        HashSet term1018 = new HashSet((Collection<? extends Object>) term9534);
        HashMap term1025 = new HashMap();
        Set<Object> term9535 =  ((Map) term1025).keySet();
        HashSet term1024 = new HashSet((Collection<? extends Object>) term9535);
        HashMap term1030 = new HashMap();
        HashMap term1035 = new HashMap();
        Class<? extends Object> term9547 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term9546 = ((Class) term9547).getDeclaredField((String) "LAZY_EXPRESSIONS");
        ((Field) term9546).setAccessible(true);
        Object enum13 = ((Field) term9546).get((Object) null);
        Object term1065 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term1065, term1065.getClass(), "typeA", null);
        setField(term1065, term1065.getClass(), "typeB", null);
        Object term1066 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term1066, term1066.getClass(), "typeA", null);
        setField(term1066, term1066.getClass(), "typeB", null);
        ArrayList term1063 = new ArrayList();
        ((ArrayList) term1063).add(term1065);
        ((ArrayList) term1063).add(term1066);
        ArrayList term1072 = new ArrayList();
        ((ArrayList) term1072).add((Object)null);
        ((ArrayList) term1072).add((Object)null);
        ((ArrayList) term1072).add((Object)null);
        ((ArrayList) term1072).add((Object)null);
        ((ArrayList) term1072).add((Object)null);
        ((ArrayList) term1072).add((Object)null);
        ((ArrayList) term1072).add((Object)null);
        ((ArrayList) term1072).add((Object)null);
        term1002 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term1003 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term1004 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1005 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        Object term1054 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term1069 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1002, term1002.getClass(), "compiler", null);
        setField(term1002, term1002.getClass(), "typeParsingErrorReporter", null);
        setField(term1003, term1003.getClass(), "compiler", null);
        setField(term1004, term1004.getClass(), "reporter", null);
        setField(term1004, term1004.getClass(), "nativeTypes", term1005);
        setField(term1004, term1004.getClass(), "namesToTypes", term1006);
        setField(term1004, term1004.getClass(), "namespaces", term1012);
        setField(term1004, term1004.getClass(), "enumTypeNames", term1018);
        setField(term1004, term1004.getClass(), "forwardDeclaredTypes", term1024);
        setField(term1004, term1004.getClass(), "typesIndexedByProperty", term1030);
        setField(term1004, term1004.getClass(), "greatestSubtypeByProperty", term1035);
        setField(term1004, term1004.getClass(), "interfaceToImplementors", null);
        setField(term1004, term1004.getClass(), "unresolvedNamedTypes", null);
        setField(term1004, term1004.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1004, term1004.getClass(), "lastGeneration", true);
        setField(term1004, term1004.getClass(), "templateTypeName", "tShwQLRGNe");
        setField(term1054, term1054.getClass(), "name", null);
        setField(term1054, term1054.getClass(), "referencedType", null);
        setBooleanField(term1054, term1054.getClass(), "visited", false);
        setField(term1054, term1054.getClass(), "docInfo", null);
        setBooleanField(term1054, term1054.getClass(), "unknown", false);
        setBooleanField(term1054, term1054.getClass(), "resolved", false);
        setField(term1054, term1054.getClass(), "resolveResult", null);
        setField(term1054, term1054.getClass(), "registry", null);
        setField(term1004, term1004.getClass(), "templateType", term1054);
        setBooleanField(term1004, term1004.getClass(), "tolerateUndefinedValues", true);
        setField(term1004, term1004.getClass(), "resolveMode", enum13);
        setField(term1003, term1003.getClass(), "typeRegistry", term1004);
        setField(term1003, term1003.getClass(), "allValueTypes", null);
        setBooleanField(term1003, term1003.getClass(), "shouldReport", false);
        setField(term1003, term1003.getClass(), "mismatches", term1063);
        setField(term1002, term1002.getClass(), "validator", term1003);
        setField(term1002, term1002.getClass(), "codingConvention", null);
        setField(term1069, term1069.getClass(), "reporter", null);
        setField(term1069, term1069.getClass(), "nativeTypes", null);
        setField(term1069, term1069.getClass(), "namesToTypes", null);
        setField(term1069, term1069.getClass(), "namespaces", null);
        setField(term1069, term1069.getClass(), "enumTypeNames", null);
        setField(term1069, term1069.getClass(), "forwardDeclaredTypes", null);
        setField(term1069, term1069.getClass(), "typesIndexedByProperty", null);
        setField(term1069, term1069.getClass(), "greatestSubtypeByProperty", null);
        setField(term1069, term1069.getClass(), "interfaceToImplementors", null);
        setField(term1069, term1069.getClass(), "unresolvedNamedTypes", null);
        setField(term1069, term1069.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1069, term1069.getClass(), "lastGeneration", false);
        setField(term1069, term1069.getClass(), "templateTypeName", null);
        setField(term1069, term1069.getClass(), "templateType", null);
        setBooleanField(term1069, term1069.getClass(), "tolerateUndefinedValues", false);
        setField(term1069, term1069.getClass(), "resolveMode", null);
        setField(term1002, term1002.getClass(), "typeRegistry", term1069);
        setField(term1002, term1002.getClass(), "delegateProxyPrototypes", term1072);
        HashMap term1077 = new HashMap();
        term1076 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1090 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1076, term1076.getClass(), "vars", term1077);
        setField(term1090, term1090.getClass(), "vars", null);
        setField(term1090, term1090.getClass(), "parent", null);
        setField(term1090, term1090.getClass(), "rootNode", null);
        setField(term1090, term1090.getClass(), "thisType", null);
        setBooleanField(term1090, term1090.getClass(), "isBottom", false);
        setField(term1076, term1076.getClass(), "parent", term1090);
        setIntField(term1092, term1092.getClass(), "type", 0);
        setField(term1092, term1092.getClass(), "next", null);
        setField(term1092, term1092.getClass(), "first", null);
        setField(term1092, term1092.getClass(), "last", null);
        setField(term1092, term1092.getClass(), "propListHead", null);
        setIntField(term1092, term1092.getClass(), "sourcePosition", 0);
        setField(term1092, term1092.getClass(), "jsType", null);
        setField(term1092, term1092.getClass(), "parent", null);
        setField(term1076, term1076.getClass(), "rootNode", term1092);
        setField(term1076, term1076.getClass(), "thisType", null);
        setBooleanField(term1076, term1076.getClass(), "isBottom", false);
        Class<? extends Object> term9907 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term9906 = ((Class) term9907).getDeclaredField((String) "REFERENCE_ERROR_TYPE");
        ((Field) term9906).setAccessible(true);
        enum14 = ((Field) term9906).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[2];
        args[0] = term1076;
        args[1] = enum14;
        try {
            callMethod(klass, "declareNativeFunctionType", argTypes, term1002, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


