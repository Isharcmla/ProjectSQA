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

public class TypeCheck_propertyIsImplicitCast_77098195682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4392;
     Object term18397;

    public TypeCheck_propertyIsImplicitCast_77098195682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4396 = new HashMap();
        HashMap term4403 = new HashMap();
        Set<Object> term18414 =  ((Map) term4403).keySet();
        HashSet term4402 = new HashSet((Collection<? extends Object>) term18414);
        HashMap term4409 = new HashMap();
        Set<Object> term18415 =  ((Map) term4409).keySet();
        HashSet term4408 = new HashSet((Collection<? extends Object>) term18415);
        HashMap term4415 = new HashMap();
        Set<Object> term18416 =  ((Map) term4415).keySet();
        HashSet term4414 = new HashSet((Collection<? extends Object>) term18416);
        HashMap term4420 = new HashMap();
        HashMap term4426 = new HashMap();
        HashMap term4431 = new HashMap();
        term4392 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term4393 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term4394 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term4395 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term4392, term4392.getClass(), "compiler", null);
        setField(term4393, term4393.getClass(), "compiler", null);
        setField(term4394, term4394.getClass(), "reporter", null);
        setField(term4394, term4394.getClass(), "nativeTypes", term4395);
        setField(term4394, term4394.getClass(), "namesToTypes", term4396);
        setField(term4394, term4394.getClass(), "namespaces", term4402);
        setField(term4394, term4394.getClass(), "nonNullableTypeNames", term4408);
        setField(term4394, term4394.getClass(), "forwardDeclaredTypes", term4414);
        setField(term4394, term4394.getClass(), "typesIndexedByProperty", term4420);
        setField(term4394, term4394.getClass(), "eachRefTypeIndexedByProperty", term4426);
        setField(term4394, term4394.getClass(), "greatestSubtypeByProperty", term4431);
        setField(term4394, term4394.getClass(), "interfaceToImplementors", null);
        setField(term4394, term4394.getClass(), "unresolvedNamedTypes", null);
        setField(term4394, term4394.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4394, term4394.getClass(), "lastGeneration", false);
        setField(term4394, term4394.getClass(), "templateTypes", null);
        setBooleanField(term4394, term4394.getClass(), "tolerateUndefinedValues", false);
        setField(term4394, term4394.getClass(), "resolveMode", null);
        setField(term4393, term4393.getClass(), "typeRegistry", term4394);
        setField(term4393, term4393.getClass(), "allValueTypes", null);
        setBooleanField(term4393, term4393.getClass(), "shouldReport", false);
        setField(term4393, term4393.getClass(), "nullOrUndefined", null);
        setField(term4393, term4393.getClass(), "mismatches", null);
        setField(term4392, term4392.getClass(), "validator", term4393);
        setField(term4392, term4392.getClass(), "reverseInterpreter", null);
        setField(term4392, term4392.getClass(), "typeRegistry", null);
        setField(term4392, term4392.getClass(), "topScope", null);
        setField(term4392, term4392.getClass(), "scopeCreator", null);
        setField(term4392, term4392.getClass(), "reportMissingOverride", null);
        setField(term4392, term4392.getClass(), "reportUnknownTypes", null);
        setBooleanField(term4392, term4392.getClass(), "reportMissingProperties", false);
        setField(term4392, term4392.getClass(), "inferJSDocInfo", null);
        setIntField(term4392, term4392.getClass(), "typedCount", 0);
        setIntField(term4392, term4392.getClass(), "nullCount", 0);
        setIntField(term4392, term4392.getClass(), "unknownCount", 0);
        setBooleanField(term4392, term4392.getClass(), "inExterns", false);
        setIntField(term4392, term4392.getClass(), "noTypeCheckSection", 0);
        HashMap term18401 = new HashMap();
        HashMap term18403 = new HashMap();
        Set<Object> term18427 =  ((Map) term18403).keySet();
        HashSet term18402 = new HashSet((Collection<? extends Object>) term18427);
        HashMap term18405 = new HashMap();
        Set<Object> term18428 =  ((Map) term18405).keySet();
        HashSet term18404 = new HashSet((Collection<? extends Object>) term18428);
        HashMap term18407 = new HashMap();
        Set<Object> term18429 =  ((Map) term18407).keySet();
        HashSet term18406 = new HashSet((Collection<? extends Object>) term18429);
        HashMap term18408 = new HashMap();
        HashMap term18409 = new HashMap();
        HashMap term18410 = new HashMap();
        term18397 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term18398 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term18399 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term18400 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term18397, term18397.getClass(), "compiler", null);
        setField(term18398, term18398.getClass(), "compiler", null);
        setField(term18399, term18399.getClass(), "reporter", null);
        setField(term18399, term18399.getClass(), "nativeTypes", term18400);
        setField(term18399, term18399.getClass(), "namesToTypes", term18401);
        setField(term18399, term18399.getClass(), "namespaces", term18402);
        setField(term18399, term18399.getClass(), "nonNullableTypeNames", term18404);
        setField(term18399, term18399.getClass(), "forwardDeclaredTypes", term18406);
        setField(term18399, term18399.getClass(), "typesIndexedByProperty", term18408);
        setField(term18399, term18399.getClass(), "eachRefTypeIndexedByProperty", term18409);
        setField(term18399, term18399.getClass(), "greatestSubtypeByProperty", term18410);
        setField(term18399, term18399.getClass(), "interfaceToImplementors", null);
        setField(term18399, term18399.getClass(), "unresolvedNamedTypes", null);
        setField(term18399, term18399.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term18399, term18399.getClass(), "lastGeneration", false);
        setField(term18399, term18399.getClass(), "templateTypes", null);
        setBooleanField(term18399, term18399.getClass(), "tolerateUndefinedValues", false);
        setField(term18399, term18399.getClass(), "resolveMode", null);
        setField(term18398, term18398.getClass(), "typeRegistry", term18399);
        setField(term18398, term18398.getClass(), "allValueTypes", null);
        setBooleanField(term18398, term18398.getClass(), "shouldReport", false);
        setField(term18398, term18398.getClass(), "nullOrUndefined", null);
        setField(term18398, term18398.getClass(), "mismatches", null);
        setField(term18397, term18397.getClass(), "validator", term18398);
        setField(term18397, term18397.getClass(), "reverseInterpreter", null);
        setField(term18397, term18397.getClass(), "typeRegistry", null);
        setField(term18397, term18397.getClass(), "topScope", null);
        setField(term18397, term18397.getClass(), "scopeCreator", null);
        setField(term18397, term18397.getClass(), "reportMissingOverride", null);
        setField(term18397, term18397.getClass(), "reportUnknownTypes", null);
        setBooleanField(term18397, term18397.getClass(), "reportMissingProperties", false);
        setField(term18397, term18397.getClass(), "inferJSDocInfo", null);
        setIntField(term18397, term18397.getClass(), "typedCount", 0);
        setIntField(term18397, term18397.getClass(), "nullCount", 0);
        setIntField(term18397, term18397.getClass(), "unknownCount", 0);
        setBooleanField(term18397, term18397.getClass(), "inExterns", false);
        setIntField(term18397, term18397.getClass(), "noTypeCheckSection", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "epPTwvcoyb";
        Object retValue = callMethod(klass, "propertyIsImplicitCast", argTypes, term4392, args);
        assertTrue(recursiveEquals(term4392, term18397));
        assertTrue(recursiveEquals(retValue, false));
    }

};


