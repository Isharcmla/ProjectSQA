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
import java.lang.String;

public class TypeValidator_getNativeType_1778066358343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126817;
     Object enum35;
     Object term128107;
     Object enum36;
     Object term128093;

    public TypeValidator_getNativeType_1778066358343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126817 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term126921 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term126540 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        Object term127013 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        Object term127105 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setElement(term126540, 0, term127013);
        setElement(term126540, 1, term127105);
        setField(term126921, term126921.getClass(), "nativeTypes", term126540);
        setField(term126817, term126817.getClass(), "typeRegistry", term126921);
        Class<? extends Object> term128116 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term128115 = ((Class) term128116).getDeclaredField((String) "ARRAY_FUNCTION_TYPE");
        ((Field) term128115).setAccessible(true);
        enum35 = ((Field) term128115).get((Object) null);
        term128107 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term128108 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term128109 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        Object term128110 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        Object term128111 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term128107, term128107.getClass(), "compiler", null);
        setField(term128108, term128108.getClass(), "reporter", null);
        setBooleanField(term128110, term128110.getClass(), "resolved", false);
        setField(term128110, term128110.getClass(), "resolveResult", null);
        setField(term128110, term128110.getClass(), "registry", null);
        setElement(term128109, 0, term128110);
        setField(term128111, term128111.getClass(), "elementsType", null);
        setField(term128111, term128111.getClass(), "elements", null);
        setField(term128111, term128111.getClass(), "className", null);
        setField(term128111, term128111.getClass(), "properties", null);
        setBooleanField(term128111, term128111.getClass(), "nativeType", false);
        setField(term128111, term128111.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term128111, term128111.getClass(), "prettyPrint", false);
        setBooleanField(term128111, term128111.getClass(), "visited", false);
        setField(term128111, term128111.getClass(), "docInfo", null);
        setBooleanField(term128111, term128111.getClass(), "unknown", false);
        setBooleanField(term128111, term128111.getClass(), "resolved", false);
        setField(term128111, term128111.getClass(), "resolveResult", null);
        setField(term128111, term128111.getClass(), "registry", null);
        setElement(term128109, 1, term128111);
        setField(term128108, term128108.getClass(), "nativeTypes", term128109);
        setField(term128108, term128108.getClass(), "namesToTypes", null);
        setField(term128108, term128108.getClass(), "namespaces", null);
        setField(term128108, term128108.getClass(), "nonNullableTypeNames", null);
        setField(term128108, term128108.getClass(), "forwardDeclaredTypes", null);
        setField(term128108, term128108.getClass(), "typesIndexedByProperty", null);
        setField(term128108, term128108.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term128108, term128108.getClass(), "greatestSubtypeByProperty", null);
        setField(term128108, term128108.getClass(), "interfaceToImplementors", null);
        setField(term128108, term128108.getClass(), "unresolvedNamedTypes", null);
        setField(term128108, term128108.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term128108, term128108.getClass(), "lastGeneration", false);
        setField(term128108, term128108.getClass(), "templateTypeName", null);
        setField(term128108, term128108.getClass(), "templateType", null);
        setBooleanField(term128108, term128108.getClass(), "tolerateUndefinedValues", false);
        setField(term128108, term128108.getClass(), "resolveMode", null);
        setField(term128107, term128107.getClass(), "typeRegistry", term128108);
        setField(term128107, term128107.getClass(), "allValueTypes", null);
        setBooleanField(term128107, term128107.getClass(), "shouldReport", false);
        setField(term128107, term128107.getClass(), "nullOrUndefined", null);
        setField(term128107, term128107.getClass(), "mismatches", null);
        Class<? extends Object> term128415 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term128414 = ((Class) term128415).getDeclaredField((String) "ARRAY_FUNCTION_TYPE");
        ((Field) term128414).setAccessible(true);
        enum36 = ((Field) term128414).get((Object) null);
        term128093 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term128093, term128093.getClass(), "elementsType", null);
        setField(term128093, term128093.getClass(), "elements", null);
        setField(term128093, term128093.getClass(), "className", null);
        setField(term128093, term128093.getClass(), "properties", null);
        setBooleanField(term128093, term128093.getClass(), "nativeType", false);
        setField(term128093, term128093.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term128093, term128093.getClass(), "prettyPrint", false);
        setBooleanField(term128093, term128093.getClass(), "visited", false);
        setField(term128093, term128093.getClass(), "docInfo", null);
        setBooleanField(term128093, term128093.getClass(), "unknown", false);
        setBooleanField(term128093, term128093.getClass(), "resolved", false);
        setField(term128093, term128093.getClass(), "resolveResult", null);
        setField(term128093, term128093.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum35;
        Object retValue = callMethod(klass, "getNativeType", argTypes, term126817, args);
        assertTrue(recursiveEquals(term126817, term128107));
        assertTrue(recursiveEquals(enum35, enum36));
        assertTrue(recursiveEquals(retValue, term128093));
    }

};


