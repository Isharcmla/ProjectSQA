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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.lang.String;

public class TypedScopeCreator_declareNativeFunctionType_12319620554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237;
     Object term307;
     Object enum0;

    public TypedScopeCreator_declareNativeFunctionType_12319620554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term241 = new HashMap();
        HashMap term248 = new HashMap();
        Set<Object> term351 =  ((Map) term248).keySet();
        HashSet term247 = new HashSet((Collection<? extends Object>) term351);
        HashMap term254 = new HashMap();
        Set<Object> term352 =  ((Map) term254).keySet();
        HashSet term253 = new HashSet((Collection<? extends Object>) term352);
        HashMap term260 = new HashMap();
        Set<Object> term353 =  ((Map) term260).keySet();
        HashSet term259 = new HashSet((Collection<? extends Object>) term353);
        HashMap term265 = new HashMap();
        HashMap term270 = new HashMap();
        Object term295 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term295, term295.getClass(), "first", null);
        setField(term295, term295.getClass(), "second", null);
        Object term296 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term296, term296.getClass(), "first", null);
        setField(term296, term296.getClass(), "second", null);
        Object term297 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term297, term297.getClass(), "first", null);
        setField(term297, term297.getClass(), "second", null);
        ArrayList term293 = new ArrayList();
        ((ArrayList) term293).add(term295);
        ((ArrayList) term293).add(term296);
        ((ArrayList) term293).add(term297);
        HashMap term302 = new HashMap();
        term237 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term238 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term239 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term240 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        Object term289 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term300 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term237, term237.getClass(), "compiler", null);
        setField(term238, term238.getClass(), "compiler", null);
        setField(term239, term239.getClass(), "reporter", null);
        setField(term239, term239.getClass(), "nativeTypes", term240);
        setField(term239, term239.getClass(), "namesToTypes", term241);
        setField(term239, term239.getClass(), "namespaces", term247);
        setField(term239, term239.getClass(), "enumTypeNames", term253);
        setField(term239, term239.getClass(), "forwardDeclaredTypes", term259);
        setField(term239, term239.getClass(), "typesIndexedByProperty", term265);
        setField(term239, term239.getClass(), "greatestSubtypeByProperty", term270);
        setField(term239, term239.getClass(), "interfaceToImplementors", null);
        setField(term239, term239.getClass(), "unresolvedNamedTypes", null);
        setField(term239, term239.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term239, term239.getClass(), "lastGeneration", false);
        setField(term239, term239.getClass(), "templateTypeName", "nGKItKLYNC");
        setField(term289, term289.getClass(), "name", "");
        setField(term289, term289.getClass(), "referencedType", null);
        setBooleanField(term289, term289.getClass(), "visited", false);
        setField(term289, term289.getClass(), "docInfo", null);
        setBooleanField(term289, term289.getClass(), "unknown", false);
        setField(term289, term289.getClass(), "registry", null);
        setField(term239, term239.getClass(), "templateType", term289);
        setField(term238, term238.getClass(), "typeRegistry", term239);
        setField(term238, term238.getClass(), "allValueTypes", null);
        setField(term238, term238.getClass(), "mismatches", term293);
        setField(term237, term237.getClass(), "validator", term238);
        setField(term237, term237.getClass(), "codingConvention", null);
        setField(term300, term300.getClass(), "reporter", null);
        setField(term300, term300.getClass(), "nativeTypes", null);
        setField(term300, term300.getClass(), "namesToTypes", null);
        setField(term300, term300.getClass(), "namespaces", null);
        setField(term300, term300.getClass(), "enumTypeNames", null);
        setField(term300, term300.getClass(), "forwardDeclaredTypes", null);
        setField(term300, term300.getClass(), "typesIndexedByProperty", null);
        setField(term300, term300.getClass(), "greatestSubtypeByProperty", null);
        setField(term300, term300.getClass(), "interfaceToImplementors", null);
        setField(term300, term300.getClass(), "unresolvedNamedTypes", null);
        setField(term300, term300.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term300, term300.getClass(), "lastGeneration", false);
        setField(term300, term300.getClass(), "templateTypeName", null);
        setField(term300, term300.getClass(), "templateType", null);
        setField(term237, term237.getClass(), "typeRegistry", term300);
        setField(term237, term237.getClass(), "delegateProxyMap", term302);
        HashMap term308 = new HashMap();
        term307 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term321 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term307, term307.getClass(), "vars", term308);
        setField(term321, term321.getClass(), "vars", null);
        setField(term321, term321.getClass(), "parent", null);
        setField(term321, term321.getClass(), "rootNode", null);
        setField(term321, term321.getClass(), "thisType", null);
        setBooleanField(term321, term321.getClass(), "isBottom", false);
        setField(term307, term307.getClass(), "parent", term321);
        setIntField(term323, term323.getClass(), "type", 0);
        setField(term323, term323.getClass(), "next", null);
        setField(term323, term323.getClass(), "first", null);
        setField(term323, term323.getClass(), "last", null);
        setField(term323, term323.getClass(), "propListHead", null);
        setIntField(term323, term323.getClass(), "sourcePosition", 0);
        setField(term323, term323.getClass(), "jsType", null);
        setField(term323, term323.getClass(), "parent", null);
        setField(term307, term307.getClass(), "rootNode", term323);
        setField(term307, term307.getClass(), "thisType", null);
        setBooleanField(term307, term307.getClass(), "isBottom", false);
        Class<? extends Object> term1548 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term1547 = ((Class) term1548).getDeclaredField((String) "REFERENCE_ERROR_TYPE");
        ((Field) term1547).setAccessible(true);
        enum0 = ((Field) term1547).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[2];
        args[0] = term307;
        args[1] = enum0;
        callMethod(klass, "declareNativeFunctionType", argTypes, term237, args);
    }

};


