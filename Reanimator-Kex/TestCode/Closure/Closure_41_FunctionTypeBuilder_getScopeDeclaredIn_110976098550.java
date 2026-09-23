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

public class FunctionTypeBuilder_getScopeDeclaredIn_110976098550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9948;
     Object term18192;
     Object term18116;

    public FunctionTypeBuilder_getScopeDeclaredIn_110976098550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9963 = new HashMap();
        HashMap term9972 = new HashMap();
        Set<Object> term18221 =  ((Map) term9972).keySet();
        HashSet term9971 = new HashSet((Collection<? extends Object>) term18221);
        HashMap term9979 = new HashMap();
        Set<Object> term18222 =  ((Map) term9979).keySet();
        HashSet term9978 = new HashSet((Collection<? extends Object>) term18222);
        HashMap term9986 = new HashMap();
        Set<Object> term18223 =  ((Map) term9986).keySet();
        HashSet term9985 = new HashSet((Collection<? extends Object>) term18223);
        HashMap term9992 = new HashMap();
        HashMap term10000 = new HashMap();
        HashMap term10005 = new HashMap();
        term9948 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term9961 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term9962 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        Object term10015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10030 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term9948, term9948.getClass(), "fnName", "paPzDETzIq");
        setField(term9948, term9948.getClass(), "compiler", null);
        setField(term9948, term9948.getClass(), "codingConvention", null);
        setField(term9961, term9961.getClass(), "reporter", null);
        setField(term9961, term9961.getClass(), "nativeTypes", term9962);
        setField(term9961, term9961.getClass(), "namesToTypes", term9963);
        setField(term9961, term9961.getClass(), "namespaces", term9971);
        setField(term9961, term9961.getClass(), "nonNullableTypeNames", term9978);
        setField(term9961, term9961.getClass(), "forwardDeclaredTypes", term9985);
        setField(term9961, term9961.getClass(), "typesIndexedByProperty", term9992);
        setField(term9961, term9961.getClass(), "eachRefTypeIndexedByProperty", term10000);
        setField(term9961, term9961.getClass(), "greatestSubtypeByProperty", term10005);
        setField(term9961, term9961.getClass(), "interfaceToImplementors", null);
        setField(term9961, term9961.getClass(), "unresolvedNamedTypes", null);
        setField(term9961, term9961.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term9961, term9961.getClass(), "lastGeneration", false);
        setField(term9961, term9961.getClass(), "templateTypeName", null);
        setField(term9961, term9961.getClass(), "templateType", null);
        setBooleanField(term9961, term9961.getClass(), "tolerateUndefinedValues", false);
        setField(term9961, term9961.getClass(), "resolveMode", null);
        setField(term9948, term9948.getClass(), "typeRegistry", term9961);
        setIntField(term10015, term10015.getClass(), "type", 0);
        setField(term10015, term10015.getClass(), "next", null);
        setField(term10015, term10015.getClass(), "first", null);
        setField(term10015, term10015.getClass(), "last", null);
        setField(term10015, term10015.getClass(), "propListHead", null);
        setIntField(term10015, term10015.getClass(), "sourcePosition", 0);
        setField(term10015, term10015.getClass(), "jsType", null);
        setField(term10015, term10015.getClass(), "parent", null);
        setField(term9948, term9948.getClass(), "errorRoot", term10015);
        setField(term9948, term9948.getClass(), "sourceName", "drcmjfQUDq");
        setField(term10030, term10030.getClass(), "vars", null);
        setField(term10030, term10030.getClass(), "parent", null);
        setIntField(term10030, term10030.getClass(), "depth", 0);
        setField(term10030, term10030.getClass(), "rootNode", null);
        setField(term10030, term10030.getClass(), "thisType", null);
        setBooleanField(term10030, term10030.getClass(), "isBottom", false);
        setField(term10030, term10030.getClass(), "arguments", null);
        setField(term9948, term9948.getClass(), "scope", term10030);
        setField(term9948, term9948.getClass(), "contents", null);
        setField(term9948, term9948.getClass(), "returnType", null);
        setBooleanField(term9948, term9948.getClass(), "returnTypeInferred", false);
        setField(term9948, term9948.getClass(), "implementedInterfaces", null);
        setField(term9948, term9948.getClass(), "extendedInterfaces", null);
        setField(term9948, term9948.getClass(), "baseType", null);
        setField(term9948, term9948.getClass(), "thisType", null);
        setBooleanField(term9948, term9948.getClass(), "isConstructor", false);
        setBooleanField(term9948, term9948.getClass(), "isInterface", false);
        setField(term9948, term9948.getClass(), "parametersNode", null);
        setField(term9948, term9948.getClass(), "templateTypeName", null);
        HashMap term18197 = new HashMap();
        HashMap term18199 = new HashMap();
        Set<Object> term18244 =  ((Map) term18199).keySet();
        HashSet term18198 = new HashSet((Collection<? extends Object>) term18244);
        HashMap term18201 = new HashMap();
        Set<Object> term18245 =  ((Map) term18201).keySet();
        HashSet term18200 = new HashSet((Collection<? extends Object>) term18245);
        HashMap term18203 = new HashMap();
        Set<Object> term18246 =  ((Map) term18203).keySet();
        HashSet term18202 = new HashSet((Collection<? extends Object>) term18246);
        HashMap term18204 = new HashMap();
        HashMap term18205 = new HashMap();
        HashMap term18206 = new HashMap();
        term18192 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term18195 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term18196 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        Object term18207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18210 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term18192, term18192.getClass(), "fnName", "paPzDETzIq");
        setField(term18192, term18192.getClass(), "compiler", null);
        setField(term18192, term18192.getClass(), "codingConvention", null);
        setField(term18195, term18195.getClass(), "reporter", null);
        setField(term18195, term18195.getClass(), "nativeTypes", term18196);
        setField(term18195, term18195.getClass(), "namesToTypes", term18197);
        setField(term18195, term18195.getClass(), "namespaces", term18198);
        setField(term18195, term18195.getClass(), "nonNullableTypeNames", term18200);
        setField(term18195, term18195.getClass(), "forwardDeclaredTypes", term18202);
        setField(term18195, term18195.getClass(), "typesIndexedByProperty", term18204);
        setField(term18195, term18195.getClass(), "eachRefTypeIndexedByProperty", term18205);
        setField(term18195, term18195.getClass(), "greatestSubtypeByProperty", term18206);
        setField(term18195, term18195.getClass(), "interfaceToImplementors", null);
        setField(term18195, term18195.getClass(), "unresolvedNamedTypes", null);
        setField(term18195, term18195.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term18195, term18195.getClass(), "lastGeneration", false);
        setField(term18195, term18195.getClass(), "templateTypeName", null);
        setField(term18195, term18195.getClass(), "templateType", null);
        setBooleanField(term18195, term18195.getClass(), "tolerateUndefinedValues", false);
        setField(term18195, term18195.getClass(), "resolveMode", null);
        setField(term18192, term18192.getClass(), "typeRegistry", term18195);
        setIntField(term18207, term18207.getClass(), "type", 0);
        setField(term18207, term18207.getClass(), "next", null);
        setField(term18207, term18207.getClass(), "first", null);
        setField(term18207, term18207.getClass(), "last", null);
        setField(term18207, term18207.getClass(), "propListHead", null);
        setIntField(term18207, term18207.getClass(), "sourcePosition", 0);
        setField(term18207, term18207.getClass(), "jsType", null);
        setField(term18207, term18207.getClass(), "parent", null);
        setField(term18192, term18192.getClass(), "errorRoot", term18207);
        setField(term18192, term18192.getClass(), "sourceName", "drcmjfQUDq");
        setField(term18210, term18210.getClass(), "vars", null);
        setField(term18210, term18210.getClass(), "parent", null);
        setIntField(term18210, term18210.getClass(), "depth", 0);
        setField(term18210, term18210.getClass(), "rootNode", null);
        setField(term18210, term18210.getClass(), "thisType", null);
        setBooleanField(term18210, term18210.getClass(), "isBottom", false);
        setField(term18210, term18210.getClass(), "arguments", null);
        setField(term18192, term18192.getClass(), "scope", term18210);
        setField(term18192, term18192.getClass(), "contents", null);
        setField(term18192, term18192.getClass(), "returnType", null);
        setBooleanField(term18192, term18192.getClass(), "returnTypeInferred", false);
        setField(term18192, term18192.getClass(), "implementedInterfaces", null);
        setField(term18192, term18192.getClass(), "extendedInterfaces", null);
        setField(term18192, term18192.getClass(), "baseType", null);
        setField(term18192, term18192.getClass(), "thisType", null);
        setBooleanField(term18192, term18192.getClass(), "isConstructor", false);
        setBooleanField(term18192, term18192.getClass(), "isInterface", false);
        setField(term18192, term18192.getClass(), "parametersNode", null);
        setField(term18192, term18192.getClass(), "templateTypeName", null);
        term18116 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term18116, term18116.getClass(), "vars", null);
        setField(term18116, term18116.getClass(), "parent", null);
        setIntField(term18116, term18116.getClass(), "depth", 0);
        setField(term18116, term18116.getClass(), "rootNode", null);
        setField(term18116, term18116.getClass(), "thisType", null);
        setBooleanField(term18116, term18116.getClass(), "isBottom", false);
        setField(term18116, term18116.getClass(), "arguments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getScopeDeclaredIn", argTypes, term9948, args);
        assertTrue(recursiveEquals(term9948, term18192));
        assertTrue(recursiveEquals(retValue, term18116));
    }

};


