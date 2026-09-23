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

public class TypeCheck_getNativeType_125266630483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10217;
     Object enum21;

    public TypeCheck_getNativeType_125266630483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10221 = new HashMap();
        HashMap term10228 = new HashMap();
        Set<Object> term23667 =  ((Map) term10228).keySet();
        HashSet term10227 = new HashSet((Collection<? extends Object>) term23667);
        HashMap term10234 = new HashMap();
        Set<Object> term23668 =  ((Map) term10234).keySet();
        HashSet term10233 = new HashSet((Collection<? extends Object>) term23668);
        HashMap term10240 = new HashMap();
        Set<Object> term23669 =  ((Map) term10240).keySet();
        HashSet term10239 = new HashSet((Collection<? extends Object>) term23669);
        HashMap term10245 = new HashMap();
        HashMap term10251 = new HashMap();
        HashMap term10256 = new HashMap();
        term10217 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term10218 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term10219 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term10220 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term10217, term10217.getClass(), "compiler", null);
        setField(term10218, term10218.getClass(), "compiler", null);
        setField(term10219, term10219.getClass(), "reporter", null);
        setField(term10219, term10219.getClass(), "nativeTypes", term10220);
        setField(term10219, term10219.getClass(), "namesToTypes", term10221);
        setField(term10219, term10219.getClass(), "namespaces", term10227);
        setField(term10219, term10219.getClass(), "nonNullableTypeNames", term10233);
        setField(term10219, term10219.getClass(), "forwardDeclaredTypes", term10239);
        setField(term10219, term10219.getClass(), "typesIndexedByProperty", term10245);
        setField(term10219, term10219.getClass(), "eachRefTypeIndexedByProperty", term10251);
        setField(term10219, term10219.getClass(), "greatestSubtypeByProperty", term10256);
        setField(term10219, term10219.getClass(), "interfaceToImplementors", null);
        setField(term10219, term10219.getClass(), "unresolvedNamedTypes", null);
        setField(term10219, term10219.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term10219, term10219.getClass(), "lastGeneration", false);
        setField(term10219, term10219.getClass(), "templateTypeName", null);
        setField(term10219, term10219.getClass(), "templateType", null);
        setBooleanField(term10219, term10219.getClass(), "tolerateUndefinedValues", false);
        setField(term10219, term10219.getClass(), "resolveMode", null);
        setField(term10218, term10218.getClass(), "typeRegistry", term10219);
        setField(term10218, term10218.getClass(), "allValueTypes", null);
        setBooleanField(term10218, term10218.getClass(), "shouldReport", false);
        setField(term10218, term10218.getClass(), "nullOrUndefined", null);
        setField(term10218, term10218.getClass(), "mismatches", null);
        setField(term10217, term10217.getClass(), "validator", term10218);
        setField(term10217, term10217.getClass(), "reverseInterpreter", null);
        setField(term10217, term10217.getClass(), "typeRegistry", null);
        setField(term10217, term10217.getClass(), "topScope", null);
        setField(term10217, term10217.getClass(), "scopeCreator", null);
        setField(term10217, term10217.getClass(), "reportMissingOverride", null);
        setField(term10217, term10217.getClass(), "reportUnknownTypes", null);
        setBooleanField(term10217, term10217.getClass(), "reportMissingProperties", false);
        setField(term10217, term10217.getClass(), "inferJSDocInfo", null);
        setIntField(term10217, term10217.getClass(), "typedCount", 0);
        setIntField(term10217, term10217.getClass(), "nullCount", 0);
        setIntField(term10217, term10217.getClass(), "unknownCount", 0);
        setBooleanField(term10217, term10217.getClass(), "inExterns", false);
        setIntField(term10217, term10217.getClass(), "noTypeCheckSection", 0);
        Class<? extends Object> term23671 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term23670 = ((Class) term23671).getDeclaredField((String) "TYPE_ERROR_FUNCTION_TYPE");
        ((Field) term23670).setAccessible(true);
        enum21 = ((Field) term23670).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum21;
        try {
            callMethod(klass, "getNativeType", argTypes, term10217, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


