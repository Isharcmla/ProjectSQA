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

public class TypeValidator_getMismatches_119318255635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term7281;

    public TypeValidator_getMismatches_119318255635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4 = new HashMap();
        HashMap term13 = new HashMap();
        Set<Object> term7294 =  ((Map) term13).keySet();
        HashSet term12 = new HashSet((Collection<? extends Object>) term7294);
        HashMap term20 = new HashMap();
        Set<Object> term7295 =  ((Map) term20).keySet();
        HashSet term19 = new HashSet((Collection<? extends Object>) term7295);
        HashMap term27 = new HashMap();
        Set<Object> term7296 =  ((Map) term27).keySet();
        HashSet term26 = new HashSet((Collection<? extends Object>) term7296);
        HashMap term33 = new HashMap();
        HashMap term41 = new HashMap();
        HashMap term46 = new HashMap();
        term1 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term2 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term3 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term1, term1.getClass(), "compiler", null);
        setField(term2, term2.getClass(), "reporter", null);
        setField(term2, term2.getClass(), "nativeTypes", term3);
        setField(term2, term2.getClass(), "namesToTypes", term4);
        setField(term2, term2.getClass(), "namespaces", term12);
        setField(term2, term2.getClass(), "nonNullableTypeNames", term19);
        setField(term2, term2.getClass(), "forwardDeclaredTypes", term26);
        setField(term2, term2.getClass(), "typesIndexedByProperty", term33);
        setField(term2, term2.getClass(), "eachRefTypeIndexedByProperty", term41);
        setField(term2, term2.getClass(), "greatestSubtypeByProperty", term46);
        setField(term2, term2.getClass(), "interfaceToImplementors", null);
        setField(term2, term2.getClass(), "unresolvedNamedTypes", null);
        setField(term2, term2.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2, term2.getClass(), "lastGeneration", false);
        setField(term2, term2.getClass(), "templateTypeName", null);
        setField(term2, term2.getClass(), "templateType", null);
        setBooleanField(term2, term2.getClass(), "tolerateUndefinedValues", false);
        setField(term2, term2.getClass(), "resolveMode", null);
        setField(term1, term1.getClass(), "typeRegistry", term2);
        setField(term1, term1.getClass(), "allValueTypes", null);
        setBooleanField(term1, term1.getClass(), "shouldReport", false);
        setField(term1, term1.getClass(), "nullOrUndefined", null);
        setField(term1, term1.getClass(), "mismatches", null);
        HashMap term7284 = new HashMap();
        HashMap term7286 = new HashMap();
        Set<Object> term7297 =  ((Map) term7286).keySet();
        HashSet term7285 = new HashSet((Collection<? extends Object>) term7297);
        HashMap term7288 = new HashMap();
        Set<Object> term7298 =  ((Map) term7288).keySet();
        HashSet term7287 = new HashSet((Collection<? extends Object>) term7298);
        HashMap term7290 = new HashMap();
        Set<Object> term7299 =  ((Map) term7290).keySet();
        HashSet term7289 = new HashSet((Collection<? extends Object>) term7299);
        HashMap term7291 = new HashMap();
        HashMap term7292 = new HashMap();
        HashMap term7293 = new HashMap();
        term7281 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term7282 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term7283 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term7281, term7281.getClass(), "compiler", null);
        setField(term7282, term7282.getClass(), "reporter", null);
        setField(term7282, term7282.getClass(), "nativeTypes", term7283);
        setField(term7282, term7282.getClass(), "namesToTypes", term7284);
        setField(term7282, term7282.getClass(), "namespaces", term7285);
        setField(term7282, term7282.getClass(), "nonNullableTypeNames", term7287);
        setField(term7282, term7282.getClass(), "forwardDeclaredTypes", term7289);
        setField(term7282, term7282.getClass(), "typesIndexedByProperty", term7291);
        setField(term7282, term7282.getClass(), "eachRefTypeIndexedByProperty", term7292);
        setField(term7282, term7282.getClass(), "greatestSubtypeByProperty", term7293);
        setField(term7282, term7282.getClass(), "interfaceToImplementors", null);
        setField(term7282, term7282.getClass(), "unresolvedNamedTypes", null);
        setField(term7282, term7282.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term7282, term7282.getClass(), "lastGeneration", false);
        setField(term7282, term7282.getClass(), "templateTypeName", null);
        setField(term7282, term7282.getClass(), "templateType", null);
        setBooleanField(term7282, term7282.getClass(), "tolerateUndefinedValues", false);
        setField(term7282, term7282.getClass(), "resolveMode", null);
        setField(term7281, term7281.getClass(), "typeRegistry", term7282);
        setField(term7281, term7281.getClass(), "allValueTypes", null);
        setBooleanField(term7281, term7281.getClass(), "shouldReport", false);
        setField(term7281, term7281.getClass(), "nullOrUndefined", null);
        setField(term7281, term7281.getClass(), "mismatches", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMismatches", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term7281));
        assertTrue(recursiveEquals(retValue, null));
    }

};


