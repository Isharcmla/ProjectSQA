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
     Object term259;
     Object term307;

    public TypedScopeCreator_createInitialScope_76224746414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term263 = new HashMap();
        HashMap term270 = new HashMap();
        Set<Object> term6513 =  ((Map) term270).keySet();
        HashSet term269 = new HashSet((Collection<? extends Object>) term6513);
        HashMap term276 = new HashMap();
        Set<Object> term6514 =  ((Map) term276).keySet();
        HashSet term275 = new HashSet((Collection<? extends Object>) term6514);
        HashMap term282 = new HashMap();
        Set<Object> term6515 =  ((Map) term282).keySet();
        HashSet term281 = new HashSet((Collection<? extends Object>) term6515);
        HashMap term287 = new HashMap();
        HashMap term293 = new HashMap();
        HashMap term298 = new HashMap();
        term259 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term260 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term261 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term262 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        setField(term259, term259.getClass(), "compiler", null);
        setField(term259, term259.getClass(), "typeParsingErrorReporter", null);
        setField(term260, term260.getClass(), "compiler", null);
        setField(term261, term261.getClass(), "reporter", null);
        setField(term261, term261.getClass(), "nativeTypes", term262);
        setField(term261, term261.getClass(), "namesToTypes", term263);
        setField(term261, term261.getClass(), "namespaces", term269);
        setField(term261, term261.getClass(), "nonNullableTypeNames", term275);
        setField(term261, term261.getClass(), "forwardDeclaredTypes", term281);
        setField(term261, term261.getClass(), "typesIndexedByProperty", term287);
        setField(term261, term261.getClass(), "eachRefTypeIndexedByProperty", term293);
        setField(term261, term261.getClass(), "greatestSubtypeByProperty", term298);
        setField(term261, term261.getClass(), "interfaceToImplementors", null);
        setField(term261, term261.getClass(), "unresolvedNamedTypes", null);
        setField(term261, term261.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term261, term261.getClass(), "lastGeneration", false);
        setField(term261, term261.getClass(), "templateTypes", null);
        setBooleanField(term261, term261.getClass(), "tolerateUndefinedValues", false);
        setField(term261, term261.getClass(), "resolveMode", null);
        setField(term260, term260.getClass(), "typeRegistry", term261);
        setField(term260, term260.getClass(), "allValueTypes", null);
        setBooleanField(term260, term260.getClass(), "shouldReport", false);
        setField(term260, term260.getClass(), "nullOrUndefined", null);
        setField(term260, term260.getClass(), "mismatches", null);
        setField(term259, term259.getClass(), "validator", term260);
        setField(term259, term259.getClass(), "codingConvention", null);
        setField(term259, term259.getClass(), "typeRegistry", null);
        setField(term259, term259.getClass(), "delegateProxyPrototypes", null);
        setField(term259, term259.getClass(), "delegateCallingConventions", null);
        setField(term259, term259.getClass(), "functionAnalysisResults", null);
        term307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term307, term307.getClass(), "type", 1876565163);
        setIntField(term309, term309.getClass(), "type", -817164822);
        setIntField(term311, term311.getClass(), "type", -1016503459);
        setIntField(term313, term313.getClass(), "type", -1968847291);
        setIntField(term315, term315.getClass(), "type", 579005622);
        setField(term315, term315.getClass(), "next", null);
        setField(term315, term315.getClass(), "first", null);
        setField(term315, term315.getClass(), "last", null);
        setField(term315, term315.getClass(), "propListHead", null);
        setIntField(term315, term315.getClass(), "sourcePosition", 0);
        setField(term315, term315.getClass(), "jsType", null);
        setField(term315, term315.getClass(), "parent", null);
        setField(term313, term313.getClass(), "next", term315);
        setIntField(term318, term318.getClass(), "type", -14890619);
        setField(term318, term318.getClass(), "next", null);
        setField(term318, term318.getClass(), "first", null);
        setField(term318, term318.getClass(), "last", term315);
        setField(term318, term318.getClass(), "propListHead", null);
        setIntField(term318, term318.getClass(), "sourcePosition", 0);
        setField(term318, term318.getClass(), "jsType", null);
        setField(term318, term318.getClass(), "parent", null);
        setField(term313, term313.getClass(), "first", term318);
        setField(term313, term313.getClass(), "last", term311);
        setField(term313, term313.getClass(), "propListHead", null);
        setIntField(term313, term313.getClass(), "sourcePosition", 0);
        setField(term313, term313.getClass(), "jsType", null);
        setField(term313, term313.getClass(), "parent", null);
        setField(term311, term311.getClass(), "next", term313);
        setField(term311, term311.getClass(), "first", term315);
        setIntField(term322, term322.getClass(), "type", 454281060);
        setIntField(term324, term324.getClass(), "type", -1786399638);
        setField(term324, term324.getClass(), "next", null);
        setField(term324, term324.getClass(), "first", term318);
        setField(term324, term324.getClass(), "last", term313);
        setField(term324, term324.getClass(), "propListHead", null);
        setIntField(term324, term324.getClass(), "sourcePosition", 0);
        setField(term324, term324.getClass(), "jsType", null);
        setField(term324, term324.getClass(), "parent", null);
        setField(term322, term322.getClass(), "next", term324);
        setField(term322, term322.getClass(), "first", term309);
        setField(term322, term322.getClass(), "last", term309);
        setField(term322, term322.getClass(), "propListHead", null);
        setIntField(term322, term322.getClass(), "sourcePosition", 0);
        setField(term322, term322.getClass(), "jsType", null);
        setField(term322, term322.getClass(), "parent", null);
        setField(term311, term311.getClass(), "last", term322);
        setField(term311, term311.getClass(), "propListHead", null);
        setIntField(term311, term311.getClass(), "sourcePosition", 0);
        setField(term311, term311.getClass(), "jsType", null);
        setField(term311, term311.getClass(), "parent", null);
        setField(term309, term309.getClass(), "next", term311);
        setIntField(term329, term329.getClass(), "type", 2055867847);
        setField(term329, term329.getClass(), "next", term322);
        setField(term329, term329.getClass(), "first", term324);
        setField(term329, term329.getClass(), "last", term307);
        setField(term329, term329.getClass(), "propListHead", null);
        setIntField(term329, term329.getClass(), "sourcePosition", 0);
        setField(term329, term329.getClass(), "jsType", null);
        setField(term329, term329.getClass(), "parent", null);
        setField(term309, term309.getClass(), "first", term329);
        setField(term309, term309.getClass(), "last", term329);
        setField(term309, term309.getClass(), "propListHead", null);
        setIntField(term309, term309.getClass(), "sourcePosition", 0);
        setField(term309, term309.getClass(), "jsType", null);
        setField(term309, term309.getClass(), "parent", null);
        setField(term307, term307.getClass(), "next", term309);
        setField(term307, term307.getClass(), "first", term313);
        setField(term307, term307.getClass(), "last", term315);
        setField(term307, term307.getClass(), "propListHead", null);
        setIntField(term307, term307.getClass(), "sourcePosition", 0);
        setField(term307, term307.getClass(), "jsType", null);
        setField(term307, term307.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term307;
        try {
            callMethod(klass, "createInitialScope", argTypes, term259, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


