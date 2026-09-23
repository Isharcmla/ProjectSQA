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

public class TypeCheck_getNativeType_125266630480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24321;
     Object enum104;

    public TypeCheck_getNativeType_125266630480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term24325 = new HashMap();
        HashMap term24332 = new HashMap();
        Set<Object> term53948 =  ((Map) term24332).keySet();
        HashSet term24331 = new HashSet((Collection<? extends Object>) term53948);
        HashMap term24338 = new HashMap();
        Set<Object> term53949 =  ((Map) term24338).keySet();
        HashSet term24337 = new HashSet((Collection<? extends Object>) term53949);
        HashMap term24344 = new HashMap();
        Set<Object> term53950 =  ((Map) term24344).keySet();
        HashSet term24343 = new HashSet((Collection<? extends Object>) term53950);
        HashMap term24349 = new HashMap();
        HashMap term24354 = new HashMap();
        Class<? extends Object> term53962 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term53961 = ((Class) term53962).getDeclaredField((String) "LAZY_EXPRESSIONS");
        ((Field) term53961).setAccessible(true);
        Object enum103 = ((Field) term53961).get((Object) null);
        Object term24385 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term24385, term24385.getClass(), "typeA", null);
        setField(term24385, term24385.getClass(), "typeB", null);
        ArrayList term24383 = new ArrayList();
        ((ArrayList) term24383).add(term24385);
        term24321 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term24322 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term24323 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term24324 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        Object term24373 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term24388 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term24391 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term24321, term24321.getClass(), "compiler", null);
        setField(term24322, term24322.getClass(), "compiler", null);
        setField(term24323, term24323.getClass(), "reporter", null);
        setField(term24323, term24323.getClass(), "nativeTypes", term24324);
        setField(term24323, term24323.getClass(), "namesToTypes", term24325);
        setField(term24323, term24323.getClass(), "namespaces", term24331);
        setField(term24323, term24323.getClass(), "enumTypeNames", term24337);
        setField(term24323, term24323.getClass(), "forwardDeclaredTypes", term24343);
        setField(term24323, term24323.getClass(), "typesIndexedByProperty", term24349);
        setField(term24323, term24323.getClass(), "greatestSubtypeByProperty", term24354);
        setField(term24323, term24323.getClass(), "interfaceToImplementors", null);
        setField(term24323, term24323.getClass(), "unresolvedNamedTypes", null);
        setField(term24323, term24323.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term24323, term24323.getClass(), "lastGeneration", false);
        setField(term24323, term24323.getClass(), "templateTypeName", "jlcBpLoWfd");
        setField(term24373, term24373.getClass(), "name", "");
        setField(term24373, term24373.getClass(), "referencedType", null);
        setBooleanField(term24373, term24373.getClass(), "visited", false);
        setField(term24373, term24373.getClass(), "docInfo", null);
        setBooleanField(term24373, term24373.getClass(), "unknown", false);
        setBooleanField(term24373, term24373.getClass(), "resolved", false);
        setField(term24373, term24373.getClass(), "resolveResult", null);
        setField(term24373, term24373.getClass(), "registry", null);
        setField(term24323, term24323.getClass(), "templateType", term24373);
        setBooleanField(term24323, term24323.getClass(), "tolerateUndefinedValues", false);
        setField(term24323, term24323.getClass(), "resolveMode", enum103);
        setField(term24322, term24322.getClass(), "typeRegistry", term24323);
        setField(term24322, term24322.getClass(), "allValueTypes", null);
        setBooleanField(term24322, term24322.getClass(), "shouldReport", false);
        setField(term24322, term24322.getClass(), "mismatches", term24383);
        setField(term24321, term24321.getClass(), "validator", term24322);
        setField(term24321, term24321.getClass(), "reverseInterpreter", null);
        setField(term24388, term24388.getClass(), "reporter", null);
        setField(term24388, term24388.getClass(), "nativeTypes", null);
        setField(term24388, term24388.getClass(), "namesToTypes", null);
        setField(term24388, term24388.getClass(), "namespaces", null);
        setField(term24388, term24388.getClass(), "enumTypeNames", null);
        setField(term24388, term24388.getClass(), "forwardDeclaredTypes", null);
        setField(term24388, term24388.getClass(), "typesIndexedByProperty", null);
        setField(term24388, term24388.getClass(), "greatestSubtypeByProperty", null);
        setField(term24388, term24388.getClass(), "interfaceToImplementors", null);
        setField(term24388, term24388.getClass(), "unresolvedNamedTypes", null);
        setField(term24388, term24388.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term24388, term24388.getClass(), "lastGeneration", false);
        setField(term24388, term24388.getClass(), "templateTypeName", null);
        setField(term24388, term24388.getClass(), "templateType", null);
        setBooleanField(term24388, term24388.getClass(), "tolerateUndefinedValues", false);
        setField(term24388, term24388.getClass(), "resolveMode", null);
        setField(term24321, term24321.getClass(), "typeRegistry", term24388);
        setField(term24391, term24391.getClass(), "vars", null);
        setField(term24391, term24391.getClass(), "parent", null);
        setField(term24391, term24391.getClass(), "rootNode", null);
        setField(term24391, term24391.getClass(), "thisType", null);
        setBooleanField(term24391, term24391.getClass(), "isBottom", false);
        setField(term24321, term24321.getClass(), "topScope", term24391);
        setField(term24321, term24321.getClass(), "scopeCreator", null);
        setField(term24321, term24321.getClass(), "reportMissingOverride", null);
        setField(term24321, term24321.getClass(), "reportUnknownTypes", null);
        setBooleanField(term24321, term24321.getClass(), "reportMissingProperties", false);
        setField(term24321, term24321.getClass(), "inferJSDocInfo", null);
        setIntField(term24321, term24321.getClass(), "typedCount", 0);
        setIntField(term24321, term24321.getClass(), "nullCount", 0);
        setIntField(term24321, term24321.getClass(), "unknownCount", 0);
        setBooleanField(term24321, term24321.getClass(), "inExterns", false);
        setIntField(term24321, term24321.getClass(), "noTypeCheckSection", 0);
        Class<? extends Object> term54322 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term54321 = ((Class) term54322).getDeclaredField((String) "ERROR_FUNCTION_TYPE");
        ((Field) term54321).setAccessible(true);
        enum104 = ((Field) term54321).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum104;
        try {
            callMethod(klass, "getNativeType", argTypes, term24321, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


