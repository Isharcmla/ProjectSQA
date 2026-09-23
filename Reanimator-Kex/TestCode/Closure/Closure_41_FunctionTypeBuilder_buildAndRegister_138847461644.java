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

public class FunctionTypeBuilder_buildAndRegister_138847461644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7083;

    public FunctionTypeBuilder_buildAndRegister_138847461644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7098 = new HashMap();
        HashMap term7107 = new HashMap();
        Set<Object> term13582 =  ((Map) term7107).keySet();
        HashSet term7106 = new HashSet((Collection<? extends Object>) term13582);
        HashMap term7114 = new HashMap();
        Set<Object> term13583 =  ((Map) term7114).keySet();
        HashSet term7113 = new HashSet((Collection<? extends Object>) term13583);
        HashMap term7121 = new HashMap();
        Set<Object> term13584 =  ((Map) term7121).keySet();
        HashSet term7120 = new HashSet((Collection<? extends Object>) term13584);
        HashMap term7127 = new HashMap();
        HashMap term7135 = new HashMap();
        HashMap term7140 = new HashMap();
        term7083 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term7096 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term7097 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        Object term7150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7165 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term7083, term7083.getClass(), "fnName", "VfmNFpEuax");
        setField(term7083, term7083.getClass(), "compiler", null);
        setField(term7083, term7083.getClass(), "codingConvention", null);
        setField(term7096, term7096.getClass(), "reporter", null);
        setField(term7096, term7096.getClass(), "nativeTypes", term7097);
        setField(term7096, term7096.getClass(), "namesToTypes", term7098);
        setField(term7096, term7096.getClass(), "namespaces", term7106);
        setField(term7096, term7096.getClass(), "nonNullableTypeNames", term7113);
        setField(term7096, term7096.getClass(), "forwardDeclaredTypes", term7120);
        setField(term7096, term7096.getClass(), "typesIndexedByProperty", term7127);
        setField(term7096, term7096.getClass(), "eachRefTypeIndexedByProperty", term7135);
        setField(term7096, term7096.getClass(), "greatestSubtypeByProperty", term7140);
        setField(term7096, term7096.getClass(), "interfaceToImplementors", null);
        setField(term7096, term7096.getClass(), "unresolvedNamedTypes", null);
        setField(term7096, term7096.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term7096, term7096.getClass(), "lastGeneration", false);
        setField(term7096, term7096.getClass(), "templateTypeName", null);
        setField(term7096, term7096.getClass(), "templateType", null);
        setBooleanField(term7096, term7096.getClass(), "tolerateUndefinedValues", false);
        setField(term7096, term7096.getClass(), "resolveMode", null);
        setField(term7083, term7083.getClass(), "typeRegistry", term7096);
        setIntField(term7150, term7150.getClass(), "type", 0);
        setField(term7150, term7150.getClass(), "next", null);
        setField(term7150, term7150.getClass(), "first", null);
        setField(term7150, term7150.getClass(), "last", null);
        setField(term7150, term7150.getClass(), "propListHead", null);
        setIntField(term7150, term7150.getClass(), "sourcePosition", 0);
        setField(term7150, term7150.getClass(), "jsType", null);
        setField(term7150, term7150.getClass(), "parent", null);
        setField(term7083, term7083.getClass(), "errorRoot", term7150);
        setField(term7083, term7083.getClass(), "sourceName", "JptuwlirlS");
        setField(term7165, term7165.getClass(), "vars", null);
        setField(term7165, term7165.getClass(), "parent", null);
        setIntField(term7165, term7165.getClass(), "depth", 0);
        setField(term7165, term7165.getClass(), "rootNode", null);
        setField(term7165, term7165.getClass(), "thisType", null);
        setBooleanField(term7165, term7165.getClass(), "isBottom", false);
        setField(term7165, term7165.getClass(), "arguments", null);
        setField(term7083, term7083.getClass(), "scope", term7165);
        setField(term7083, term7083.getClass(), "contents", null);
        setField(term7083, term7083.getClass(), "returnType", null);
        setBooleanField(term7083, term7083.getClass(), "returnTypeInferred", false);
        setField(term7083, term7083.getClass(), "implementedInterfaces", null);
        setField(term7083, term7083.getClass(), "extendedInterfaces", null);
        setField(term7083, term7083.getClass(), "baseType", null);
        setField(term7083, term7083.getClass(), "thisType", null);
        setBooleanField(term7083, term7083.getClass(), "isConstructor", false);
        setBooleanField(term7083, term7083.getClass(), "isInterface", false);
        setField(term7083, term7083.getClass(), "parametersNode", null);
        setField(term7083, term7083.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "buildAndRegister", argTypes, term7083, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


