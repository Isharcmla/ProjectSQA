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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class FunctionTypeBuilder_getOrCreateConstructor_99203251138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14488;

    public FunctionTypeBuilder_getOrCreateConstructor_99203251138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14503 = new HashMap();
        HashMap term14512 = new HashMap();
        Set<Object> term35578 =  ((Map) term14512).keySet();
        HashSet term14511 = new HashSet((Collection<? extends Object>) term35578);
        HashMap term14519 = new HashMap();
        Set<Object> term35579 =  ((Map) term14519).keySet();
        HashSet term14518 = new HashSet((Collection<? extends Object>) term35579);
        HashMap term14526 = new HashMap();
        Set<Object> term35580 =  ((Map) term14526).keySet();
        HashSet term14525 = new HashSet((Collection<? extends Object>) term35580);
        HashMap term14532 = new HashMap();
        HashMap term14537 = new HashMap();
        Class<? extends Object> term35602 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term35601 = ((Class) term35602).getDeclaredField((String) "LAZY_NAMES");
        ((Field) term35601).setAccessible(true);
        Object enum69 = ((Field) term35601).get((Object) null);
        term14488 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term14501 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term14502 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        Object term14558 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term14572 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term14592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14607 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term14488, term14488.getClass(), "fnName", "epPTwvcoyb");
        setField(term14488, term14488.getClass(), "compiler", null);
        setField(term14488, term14488.getClass(), "codingConvention", null);
        setField(term14501, term14501.getClass(), "reporter", null);
        setField(term14501, term14501.getClass(), "nativeTypes", term14502);
        setField(term14501, term14501.getClass(), "namesToTypes", term14503);
        setField(term14501, term14501.getClass(), "namespaces", term14511);
        setField(term14501, term14501.getClass(), "enumTypeNames", term14518);
        setField(term14501, term14501.getClass(), "forwardDeclaredTypes", term14525);
        setField(term14501, term14501.getClass(), "typesIndexedByProperty", term14532);
        setField(term14501, term14501.getClass(), "greatestSubtypeByProperty", term14537);
        setField(term14501, term14501.getClass(), "interfaceToImplementors", null);
        setField(term14501, term14501.getClass(), "unresolvedNamedTypes", null);
        setField(term14501, term14501.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term14501, term14501.getClass(), "lastGeneration", false);
        setField(term14501, term14501.getClass(), "templateTypeName", "ZLQamJFBmu");
        setField(term14558, term14558.getClass(), "name", "ZWcOCwKNvd");
        setField(term14558, term14558.getClass(), "referencedType", null);
        setBooleanField(term14558, term14558.getClass(), "visited", true);
        setField(term14572, term14572.getClass(), "info", null);
        setField(term14572, term14572.getClass(), "documentation", null);
        setField(term14572, term14572.getClass(), "sourceName", null);
        setField(term14572, term14572.getClass(), "visibility", null);
        setIntField(term14572, term14572.getClass(), "bitset", 0);
        setField(term14572, term14572.getClass(), "type", null);
        setField(term14572, term14572.getClass(), "thisType", null);
        setBooleanField(term14572, term14572.getClass(), "includeDocumentation", false);
        setField(term14558, term14558.getClass(), "docInfo", term14572);
        setBooleanField(term14558, term14558.getClass(), "unknown", true);
        setBooleanField(term14558, term14558.getClass(), "resolved", true);
        setField(term14558, term14558.getClass(), "resolveResult", null);
        setField(term14558, term14558.getClass(), "registry", null);
        setField(term14501, term14501.getClass(), "templateType", term14558);
        setBooleanField(term14501, term14501.getClass(), "tolerateUndefinedValues", true);
        setField(term14501, term14501.getClass(), "resolveMode", enum69);
        setField(term14488, term14488.getClass(), "typeRegistry", term14501);
        setIntField(term14592, term14592.getClass(), "type", 0);
        setField(term14592, term14592.getClass(), "next", null);
        setField(term14592, term14592.getClass(), "first", null);
        setField(term14592, term14592.getClass(), "last", null);
        setField(term14592, term14592.getClass(), "propListHead", null);
        setIntField(term14592, term14592.getClass(), "sourcePosition", 0);
        setField(term14592, term14592.getClass(), "jsType", null);
        setField(term14592, term14592.getClass(), "parent", null);
        setField(term14488, term14488.getClass(), "errorRoot", term14592);
        setField(term14488, term14488.getClass(), "sourceName", "GTmoNrziyc");
        setField(term14607, term14607.getClass(), "vars", null);
        setField(term14607, term14607.getClass(), "parent", null);
        setField(term14607, term14607.getClass(), "rootNode", null);
        setField(term14607, term14607.getClass(), "thisType", null);
        setBooleanField(term14607, term14607.getClass(), "isBottom", false);
        setField(term14488, term14488.getClass(), "scope", term14607);
        setField(term14488, term14488.getClass(), "returnType", null);
        setField(term14488, term14488.getClass(), "implementedInterfaces", null);
        setField(term14488, term14488.getClass(), "baseType", null);
        setField(term14488, term14488.getClass(), "thisType", null);
        setBooleanField(term14488, term14488.getClass(), "isConstructor", false);
        setBooleanField(term14488, term14488.getClass(), "isInterface", false);
        setField(term14488, term14488.getClass(), "parametersNode", null);
        setField(term14488, term14488.getClass(), "sourceNode", null);
        setField(term14488, term14488.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getOrCreateConstructor", argTypes, term14488, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


