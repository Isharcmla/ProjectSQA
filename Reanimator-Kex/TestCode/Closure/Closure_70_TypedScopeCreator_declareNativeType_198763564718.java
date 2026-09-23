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

public class TypedScopeCreator_declareNativeType_198763564718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2206;
     Object term2254;
     Object term6561;
     Object term6577;

    public TypedScopeCreator_declareNativeType_198763564718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2210 = new HashMap();
        HashMap term2217 = new HashMap();
        Set<Object> term6585 =  ((Map) term2217).keySet();
        HashSet term2216 = new HashSet((Collection<? extends Object>) term6585);
        HashMap term2223 = new HashMap();
        Set<Object> term6586 =  ((Map) term2223).keySet();
        HashSet term2222 = new HashSet((Collection<? extends Object>) term6586);
        HashMap term2229 = new HashMap();
        Set<Object> term6587 =  ((Map) term2229).keySet();
        HashSet term2228 = new HashSet((Collection<? extends Object>) term6587);
        HashMap term2234 = new HashMap();
        HashMap term2240 = new HashMap();
        HashMap term2245 = new HashMap();
        term2206 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term2207 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term2208 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2209 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term2206, term2206.getClass(), "compiler", null);
        setField(term2206, term2206.getClass(), "typeParsingErrorReporter", null);
        setField(term2207, term2207.getClass(), "compiler", null);
        setField(term2208, term2208.getClass(), "reporter", null);
        setField(term2208, term2208.getClass(), "nativeTypes", term2209);
        setField(term2208, term2208.getClass(), "namesToTypes", term2210);
        setField(term2208, term2208.getClass(), "namespaces", term2216);
        setField(term2208, term2208.getClass(), "nonNullableTypeNames", term2222);
        setField(term2208, term2208.getClass(), "forwardDeclaredTypes", term2228);
        setField(term2208, term2208.getClass(), "typesIndexedByProperty", term2234);
        setField(term2208, term2208.getClass(), "eachRefTypeIndexedByProperty", term2240);
        setField(term2208, term2208.getClass(), "greatestSubtypeByProperty", term2245);
        setField(term2208, term2208.getClass(), "interfaceToImplementors", null);
        setField(term2208, term2208.getClass(), "unresolvedNamedTypes", null);
        setField(term2208, term2208.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2208, term2208.getClass(), "lastGeneration", false);
        setField(term2208, term2208.getClass(), "templateTypeName", null);
        setField(term2208, term2208.getClass(), "templateType", null);
        setBooleanField(term2208, term2208.getClass(), "tolerateUndefinedValues", false);
        setField(term2208, term2208.getClass(), "resolveMode", null);
        setField(term2207, term2207.getClass(), "typeRegistry", term2208);
        setField(term2207, term2207.getClass(), "allValueTypes", null);
        setBooleanField(term2207, term2207.getClass(), "shouldReport", false);
        setField(term2207, term2207.getClass(), "nullOrUndefined", null);
        setField(term2207, term2207.getClass(), "mismatches", null);
        setField(term2206, term2206.getClass(), "validator", term2207);
        setField(term2206, term2206.getClass(), "codingConvention", null);
        setField(term2206, term2206.getClass(), "typeRegistry", null);
        setField(term2206, term2206.getClass(), "delegateProxyPrototypes", null);
        HashMap term2255 = new HashMap();
        term2254 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term2268 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term2272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2254, term2254.getClass(), "vars", term2255);
        setField(term2268, term2268.getClass(), "vars", null);
        setField(term2268, term2268.getClass(), "parent", null);
        setIntField(term2268, term2268.getClass(), "depth", 0);
        setField(term2268, term2268.getClass(), "rootNode", null);
        setField(term2268, term2268.getClass(), "thisType", null);
        setBooleanField(term2268, term2268.getClass(), "isBottom", false);
        setField(term2268, term2268.getClass(), "arguments", null);
        setField(term2254, term2254.getClass(), "parent", term2268);
        setIntField(term2254, term2254.getClass(), "depth", -93135961);
        setIntField(term2272, term2272.getClass(), "type", 0);
        setField(term2272, term2272.getClass(), "next", null);
        setField(term2272, term2272.getClass(), "first", null);
        setField(term2272, term2272.getClass(), "last", null);
        setField(term2272, term2272.getClass(), "propListHead", null);
        setIntField(term2272, term2272.getClass(), "sourcePosition", 0);
        setField(term2272, term2272.getClass(), "jsType", null);
        setField(term2272, term2272.getClass(), "parent", null);
        setField(term2254, term2254.getClass(), "rootNode", term2272);
        setField(term2254, term2254.getClass(), "thisType", null);
        setBooleanField(term2254, term2254.getClass(), "isBottom", false);
        setField(term2254, term2254.getClass(), "arguments", null);
        HashMap term6565 = new HashMap();
        HashMap term6567 = new HashMap();
        Set<Object> term6598 =  ((Map) term6567).keySet();
        HashSet term6566 = new HashSet((Collection<? extends Object>) term6598);
        HashMap term6569 = new HashMap();
        Set<Object> term6599 =  ((Map) term6569).keySet();
        HashSet term6568 = new HashSet((Collection<? extends Object>) term6599);
        HashMap term6571 = new HashMap();
        Set<Object> term6600 =  ((Map) term6571).keySet();
        HashSet term6570 = new HashSet((Collection<? extends Object>) term6600);
        HashMap term6572 = new HashMap();
        HashMap term6573 = new HashMap();
        HashMap term6574 = new HashMap();
        term6561 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term6562 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term6563 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6564 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term6561, term6561.getClass(), "compiler", null);
        setField(term6561, term6561.getClass(), "typeParsingErrorReporter", null);
        setField(term6562, term6562.getClass(), "compiler", null);
        setField(term6563, term6563.getClass(), "reporter", null);
        setField(term6563, term6563.getClass(), "nativeTypes", term6564);
        setField(term6563, term6563.getClass(), "namesToTypes", term6565);
        setField(term6563, term6563.getClass(), "namespaces", term6566);
        setField(term6563, term6563.getClass(), "nonNullableTypeNames", term6568);
        setField(term6563, term6563.getClass(), "forwardDeclaredTypes", term6570);
        setField(term6563, term6563.getClass(), "typesIndexedByProperty", term6572);
        setField(term6563, term6563.getClass(), "eachRefTypeIndexedByProperty", term6573);
        setField(term6563, term6563.getClass(), "greatestSubtypeByProperty", term6574);
        setField(term6563, term6563.getClass(), "interfaceToImplementors", null);
        setField(term6563, term6563.getClass(), "unresolvedNamedTypes", null);
        setField(term6563, term6563.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6563, term6563.getClass(), "lastGeneration", false);
        setField(term6563, term6563.getClass(), "templateTypeName", null);
        setField(term6563, term6563.getClass(), "templateType", null);
        setBooleanField(term6563, term6563.getClass(), "tolerateUndefinedValues", false);
        setField(term6563, term6563.getClass(), "resolveMode", null);
        setField(term6562, term6562.getClass(), "typeRegistry", term6563);
        setField(term6562, term6562.getClass(), "allValueTypes", null);
        setBooleanField(term6562, term6562.getClass(), "shouldReport", false);
        setField(term6562, term6562.getClass(), "nullOrUndefined", null);
        setField(term6562, term6562.getClass(), "mismatches", null);
        setField(term6561, term6561.getClass(), "validator", term6562);
        setField(term6561, term6561.getClass(), "codingConvention", null);
        setField(term6561, term6561.getClass(), "typeRegistry", null);
        setField(term6561, term6561.getClass(), "delegateProxyPrototypes", null);
        HashMap term6578 = new HashMap();
        term6577 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term6583 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term6584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term6577, term6577.getClass(), "vars", term6578);
        setField(term6583, term6583.getClass(), "vars", null);
        setField(term6583, term6583.getClass(), "parent", null);
        setIntField(term6583, term6583.getClass(), "depth", 0);
        setField(term6583, term6583.getClass(), "rootNode", null);
        setField(term6583, term6583.getClass(), "thisType", null);
        setBooleanField(term6583, term6583.getClass(), "isBottom", false);
        setField(term6583, term6583.getClass(), "arguments", null);
        setField(term6577, term6577.getClass(), "parent", term6583);
        setIntField(term6577, term6577.getClass(), "depth", -93135961);
        setIntField(term6584, term6584.getClass(), "type", 0);
        setField(term6584, term6584.getClass(), "next", null);
        setField(term6584, term6584.getClass(), "first", null);
        setField(term6584, term6584.getClass(), "last", null);
        setField(term6584, term6584.getClass(), "propListHead", null);
        setIntField(term6584, term6584.getClass(), "sourcePosition", 0);
        setField(term6584, term6584.getClass(), "jsType", null);
        setField(term6584, term6584.getClass(), "parent", null);
        setField(term6577, term6577.getClass(), "rootNode", term6584);
        setField(term6577, term6577.getClass(), "thisType", null);
        setBooleanField(term6577, term6577.getClass(), "isBottom", false);
        setField(term6577, term6577.getClass(), "arguments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[3];
        args[0] = term2254;
        args[1] = "HWkpTmtlrc";
        args[2] = null;
        callMethod(klass, "declareNativeType", argTypes, term2206, args);
        assertTrue(recursiveEquals(term2206, term6561));
        assertTrue(recursiveEquals(term2254, "HWkpTmtlrc"));
    }

};


