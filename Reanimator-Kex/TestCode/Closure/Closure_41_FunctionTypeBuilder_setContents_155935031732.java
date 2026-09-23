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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FunctionTypeBuilder_setContents_155935031732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122;
     Object term10551;

    public FunctionTypeBuilder_setContents_155935031732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term137 = new HashMap();
        HashMap term146 = new HashMap();
        Set<Object> term10580 =  ((Map) term146).keySet();
        HashSet term145 = new HashSet((Collection<? extends Object>) term10580);
        HashMap term153 = new HashMap();
        Set<Object> term10581 =  ((Map) term153).keySet();
        HashSet term152 = new HashSet((Collection<? extends Object>) term10581);
        HashMap term160 = new HashMap();
        Set<Object> term10582 =  ((Map) term160).keySet();
        HashSet term159 = new HashSet((Collection<? extends Object>) term10582);
        HashMap term166 = new HashMap();
        HashMap term174 = new HashMap();
        HashMap term179 = new HashMap();
        term122 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term135 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term136 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        Object term189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term204 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term122, term122.getClass(), "fnName", "jJCZpVmanW");
        setField(term122, term122.getClass(), "compiler", null);
        setField(term122, term122.getClass(), "codingConvention", null);
        setField(term135, term135.getClass(), "reporter", null);
        setField(term135, term135.getClass(), "nativeTypes", term136);
        setField(term135, term135.getClass(), "namesToTypes", term137);
        setField(term135, term135.getClass(), "namespaces", term145);
        setField(term135, term135.getClass(), "nonNullableTypeNames", term152);
        setField(term135, term135.getClass(), "forwardDeclaredTypes", term159);
        setField(term135, term135.getClass(), "typesIndexedByProperty", term166);
        setField(term135, term135.getClass(), "eachRefTypeIndexedByProperty", term174);
        setField(term135, term135.getClass(), "greatestSubtypeByProperty", term179);
        setField(term135, term135.getClass(), "interfaceToImplementors", null);
        setField(term135, term135.getClass(), "unresolvedNamedTypes", null);
        setField(term135, term135.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term135, term135.getClass(), "lastGeneration", false);
        setField(term135, term135.getClass(), "templateTypeName", null);
        setField(term135, term135.getClass(), "templateType", null);
        setBooleanField(term135, term135.getClass(), "tolerateUndefinedValues", false);
        setField(term135, term135.getClass(), "resolveMode", null);
        setField(term122, term122.getClass(), "typeRegistry", term135);
        setIntField(term189, term189.getClass(), "type", 0);
        setField(term189, term189.getClass(), "next", null);
        setField(term189, term189.getClass(), "first", null);
        setField(term189, term189.getClass(), "last", null);
        setField(term189, term189.getClass(), "propListHead", null);
        setIntField(term189, term189.getClass(), "sourcePosition", 0);
        setField(term189, term189.getClass(), "jsType", null);
        setField(term189, term189.getClass(), "parent", null);
        setField(term122, term122.getClass(), "errorRoot", term189);
        setField(term122, term122.getClass(), "sourceName", "xrwlQZdwCp");
        setField(term204, term204.getClass(), "vars", null);
        setField(term204, term204.getClass(), "parent", null);
        setIntField(term204, term204.getClass(), "depth", 0);
        setField(term204, term204.getClass(), "rootNode", null);
        setField(term204, term204.getClass(), "thisType", null);
        setBooleanField(term204, term204.getClass(), "isBottom", false);
        setField(term204, term204.getClass(), "arguments", null);
        setField(term122, term122.getClass(), "scope", term204);
        setField(term122, term122.getClass(), "contents", null);
        setField(term122, term122.getClass(), "returnType", null);
        setBooleanField(term122, term122.getClass(), "returnTypeInferred", false);
        setField(term122, term122.getClass(), "implementedInterfaces", null);
        setField(term122, term122.getClass(), "extendedInterfaces", null);
        setField(term122, term122.getClass(), "baseType", null);
        setField(term122, term122.getClass(), "thisType", null);
        setBooleanField(term122, term122.getClass(), "isConstructor", false);
        setBooleanField(term122, term122.getClass(), "isInterface", false);
        setField(term122, term122.getClass(), "parametersNode", null);
        setField(term122, term122.getClass(), "templateTypeName", null);
        HashMap term10556 = new HashMap();
        HashMap term10558 = new HashMap();
        Set<Object> term10603 =  ((Map) term10558).keySet();
        HashSet term10557 = new HashSet((Collection<? extends Object>) term10603);
        HashMap term10560 = new HashMap();
        Set<Object> term10604 =  ((Map) term10560).keySet();
        HashSet term10559 = new HashSet((Collection<? extends Object>) term10604);
        HashMap term10562 = new HashMap();
        Set<Object> term10605 =  ((Map) term10562).keySet();
        HashSet term10561 = new HashSet((Collection<? extends Object>) term10605);
        HashMap term10563 = new HashMap();
        HashMap term10564 = new HashMap();
        HashMap term10565 = new HashMap();
        term10551 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term10554 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term10555 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        Object term10566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10569 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term10551, term10551.getClass(), "fnName", "jJCZpVmanW");
        setField(term10551, term10551.getClass(), "compiler", null);
        setField(term10551, term10551.getClass(), "codingConvention", null);
        setField(term10554, term10554.getClass(), "reporter", null);
        setField(term10554, term10554.getClass(), "nativeTypes", term10555);
        setField(term10554, term10554.getClass(), "namesToTypes", term10556);
        setField(term10554, term10554.getClass(), "namespaces", term10557);
        setField(term10554, term10554.getClass(), "nonNullableTypeNames", term10559);
        setField(term10554, term10554.getClass(), "forwardDeclaredTypes", term10561);
        setField(term10554, term10554.getClass(), "typesIndexedByProperty", term10563);
        setField(term10554, term10554.getClass(), "eachRefTypeIndexedByProperty", term10564);
        setField(term10554, term10554.getClass(), "greatestSubtypeByProperty", term10565);
        setField(term10554, term10554.getClass(), "interfaceToImplementors", null);
        setField(term10554, term10554.getClass(), "unresolvedNamedTypes", null);
        setField(term10554, term10554.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term10554, term10554.getClass(), "lastGeneration", false);
        setField(term10554, term10554.getClass(), "templateTypeName", null);
        setField(term10554, term10554.getClass(), "templateType", null);
        setBooleanField(term10554, term10554.getClass(), "tolerateUndefinedValues", false);
        setField(term10554, term10554.getClass(), "resolveMode", null);
        setField(term10551, term10551.getClass(), "typeRegistry", term10554);
        setIntField(term10566, term10566.getClass(), "type", 0);
        setField(term10566, term10566.getClass(), "next", null);
        setField(term10566, term10566.getClass(), "first", null);
        setField(term10566, term10566.getClass(), "last", null);
        setField(term10566, term10566.getClass(), "propListHead", null);
        setIntField(term10566, term10566.getClass(), "sourcePosition", 0);
        setField(term10566, term10566.getClass(), "jsType", null);
        setField(term10566, term10566.getClass(), "parent", null);
        setField(term10551, term10551.getClass(), "errorRoot", term10566);
        setField(term10551, term10551.getClass(), "sourceName", "xrwlQZdwCp");
        setField(term10569, term10569.getClass(), "vars", null);
        setField(term10569, term10569.getClass(), "parent", null);
        setIntField(term10569, term10569.getClass(), "depth", 0);
        setField(term10569, term10569.getClass(), "rootNode", null);
        setField(term10569, term10569.getClass(), "thisType", null);
        setBooleanField(term10569, term10569.getClass(), "isBottom", false);
        setField(term10569, term10569.getClass(), "arguments", null);
        setField(term10551, term10551.getClass(), "scope", term10569);
        setField(term10551, term10551.getClass(), "contents", null);
        setField(term10551, term10551.getClass(), "returnType", null);
        setBooleanField(term10551, term10551.getClass(), "returnTypeInferred", false);
        setField(term10551, term10551.getClass(), "implementedInterfaces", null);
        setField(term10551, term10551.getClass(), "extendedInterfaces", null);
        setField(term10551, term10551.getClass(), "baseType", null);
        setField(term10551, term10551.getClass(), "thisType", null);
        setBooleanField(term10551, term10551.getClass(), "isConstructor", false);
        setBooleanField(term10551, term10551.getClass(), "isInterface", false);
        setField(term10551, term10551.getClass(), "parametersNode", null);
        setField(term10551, term10551.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder$FunctionContents");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setContents", argTypes, term122, args);
        assertTrue(recursiveEquals(term122, term10551));
    }

};


