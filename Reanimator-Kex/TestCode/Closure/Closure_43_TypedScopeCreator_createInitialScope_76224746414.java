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

public class TypedScopeCreator_createInitialScope_76224746414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257;
     Object term305;

    public TypedScopeCreator_createInitialScope_76224746414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term261 = new HashMap();
        HashMap term268 = new HashMap();
        Set<Object> term6532 =  ((Map) term268).keySet();
        HashSet term267 = new HashSet((Collection<? extends Object>) term6532);
        HashMap term274 = new HashMap();
        Set<Object> term6533 =  ((Map) term274).keySet();
        HashSet term273 = new HashSet((Collection<? extends Object>) term6533);
        HashMap term280 = new HashMap();
        Set<Object> term6534 =  ((Map) term280).keySet();
        HashSet term279 = new HashSet((Collection<? extends Object>) term6534);
        HashMap term285 = new HashMap();
        HashMap term291 = new HashMap();
        HashMap term296 = new HashMap();
        term257 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term258 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term259 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term260 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        setField(term257, term257.getClass(), "compiler", null);
        setField(term257, term257.getClass(), "typeParsingErrorReporter", null);
        setField(term258, term258.getClass(), "compiler", null);
        setField(term259, term259.getClass(), "reporter", null);
        setField(term259, term259.getClass(), "nativeTypes", term260);
        setField(term259, term259.getClass(), "namesToTypes", term261);
        setField(term259, term259.getClass(), "namespaces", term267);
        setField(term259, term259.getClass(), "nonNullableTypeNames", term273);
        setField(term259, term259.getClass(), "forwardDeclaredTypes", term279);
        setField(term259, term259.getClass(), "typesIndexedByProperty", term285);
        setField(term259, term259.getClass(), "eachRefTypeIndexedByProperty", term291);
        setField(term259, term259.getClass(), "greatestSubtypeByProperty", term296);
        setField(term259, term259.getClass(), "interfaceToImplementors", null);
        setField(term259, term259.getClass(), "unresolvedNamedTypes", null);
        setField(term259, term259.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term259, term259.getClass(), "lastGeneration", false);
        setField(term259, term259.getClass(), "templateTypeName", null);
        setField(term259, term259.getClass(), "templateType", null);
        setBooleanField(term259, term259.getClass(), "tolerateUndefinedValues", false);
        setField(term259, term259.getClass(), "resolveMode", null);
        setField(term258, term258.getClass(), "typeRegistry", term259);
        setField(term258, term258.getClass(), "allValueTypes", null);
        setBooleanField(term258, term258.getClass(), "shouldReport", false);
        setField(term258, term258.getClass(), "nullOrUndefined", null);
        setField(term258, term258.getClass(), "mismatches", null);
        setField(term257, term257.getClass(), "validator", term258);
        setField(term257, term257.getClass(), "codingConvention", null);
        setField(term257, term257.getClass(), "typeRegistry", null);
        setField(term257, term257.getClass(), "delegateProxyPrototypes", null);
        setField(term257, term257.getClass(), "delegateCallingConventions", null);
        setField(term257, term257.getClass(), "functionAnalysisResults", null);
        term305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term305, term305.getClass(), "type", 1876565163);
        setIntField(term307, term307.getClass(), "type", -817164822);
        setIntField(term309, term309.getClass(), "type", -1016503459);
        setIntField(term311, term311.getClass(), "type", -1968847291);
        setIntField(term313, term313.getClass(), "type", 579005622);
        setField(term313, term313.getClass(), "next", null);
        setField(term313, term313.getClass(), "first", null);
        setField(term313, term313.getClass(), "last", null);
        setField(term313, term313.getClass(), "propListHead", null);
        setIntField(term313, term313.getClass(), "sourcePosition", 0);
        setField(term313, term313.getClass(), "jsType", null);
        setField(term313, term313.getClass(), "parent", null);
        setField(term311, term311.getClass(), "next", term313);
        setIntField(term316, term316.getClass(), "type", -14890619);
        setField(term316, term316.getClass(), "next", null);
        setField(term316, term316.getClass(), "first", null);
        setField(term316, term316.getClass(), "last", term313);
        setField(term316, term316.getClass(), "propListHead", null);
        setIntField(term316, term316.getClass(), "sourcePosition", 0);
        setField(term316, term316.getClass(), "jsType", null);
        setField(term316, term316.getClass(), "parent", null);
        setField(term311, term311.getClass(), "first", term316);
        setField(term311, term311.getClass(), "last", term309);
        setField(term311, term311.getClass(), "propListHead", null);
        setIntField(term311, term311.getClass(), "sourcePosition", 0);
        setField(term311, term311.getClass(), "jsType", null);
        setField(term311, term311.getClass(), "parent", null);
        setField(term309, term309.getClass(), "next", term311);
        setField(term309, term309.getClass(), "first", term313);
        setIntField(term320, term320.getClass(), "type", 454281060);
        setIntField(term322, term322.getClass(), "type", -1786399638);
        setField(term322, term322.getClass(), "next", null);
        setField(term322, term322.getClass(), "first", term316);
        setField(term322, term322.getClass(), "last", term311);
        setField(term322, term322.getClass(), "propListHead", null);
        setIntField(term322, term322.getClass(), "sourcePosition", 0);
        setField(term322, term322.getClass(), "jsType", null);
        setField(term322, term322.getClass(), "parent", null);
        setField(term320, term320.getClass(), "next", term322);
        setField(term320, term320.getClass(), "first", term307);
        setField(term320, term320.getClass(), "last", term307);
        setField(term320, term320.getClass(), "propListHead", null);
        setIntField(term320, term320.getClass(), "sourcePosition", 0);
        setField(term320, term320.getClass(), "jsType", null);
        setField(term320, term320.getClass(), "parent", null);
        setField(term309, term309.getClass(), "last", term320);
        setField(term309, term309.getClass(), "propListHead", null);
        setIntField(term309, term309.getClass(), "sourcePosition", 0);
        setField(term309, term309.getClass(), "jsType", null);
        setField(term309, term309.getClass(), "parent", null);
        setField(term307, term307.getClass(), "next", term309);
        setIntField(term327, term327.getClass(), "type", 2055867847);
        setField(term327, term327.getClass(), "next", term320);
        setField(term327, term327.getClass(), "first", term322);
        setField(term327, term327.getClass(), "last", term305);
        setField(term327, term327.getClass(), "propListHead", null);
        setIntField(term327, term327.getClass(), "sourcePosition", 0);
        setField(term327, term327.getClass(), "jsType", null);
        setField(term327, term327.getClass(), "parent", null);
        setField(term307, term307.getClass(), "first", term327);
        setField(term307, term307.getClass(), "last", term327);
        setField(term307, term307.getClass(), "propListHead", null);
        setIntField(term307, term307.getClass(), "sourcePosition", 0);
        setField(term307, term307.getClass(), "jsType", null);
        setField(term307, term307.getClass(), "parent", null);
        setField(term305, term305.getClass(), "next", term307);
        setField(term305, term305.getClass(), "first", term311);
        setField(term305, term305.getClass(), "last", term313);
        setField(term305, term305.getClass(), "propListHead", null);
        setIntField(term305, term305.getClass(), "sourcePosition", 0);
        setField(term305, term305.getClass(), "jsType", null);
        setField(term305, term305.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term305;
        try {
            callMethod(klass, "createInitialScope", argTypes, term257, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


