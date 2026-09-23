package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class JSTypeRegistry_createUnionType_837569472126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7228;
     Object term7299;

    public JSTypeRegistry_createUnionType_837569472126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7230 = new HashMap();
        HashMap term7240 = new HashMap();
        Set<Object> term489329 =  ((Map) term7240).keySet();
        HashSet term7239 = new HashSet((Collection<? extends Object>) term489329);
        HashMap term7249 = new HashMap();
        Set<Object> term489330 =  ((Map) term7249).keySet();
        HashSet term7248 = new HashSet((Collection<? extends Object>) term489330);
        HashMap term7260 = new HashMap();
        Set<Object> term489331 =  ((Map) term7260).keySet();
        HashSet term7259 = new HashSet((Collection<? extends Object>) term489331);
        HashMap term7268 = new HashMap();
        HashMap term7283 = new HashMap();
        HashMap term7288 = new HashMap();
        term7228 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term7229 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term7228, term7228.getClass(), "reporter", null);
        setField(term7228, term7228.getClass(), "nativeTypes", term7229);
        setField(term7228, term7228.getClass(), "namesToTypes", term7230);
        setField(term7228, term7228.getClass(), "namespaces", term7239);
        setField(term7228, term7228.getClass(), "nonNullableTypeNames", term7248);
        setField(term7228, term7228.getClass(), "forwardDeclaredTypes", term7259);
        setField(term7228, term7228.getClass(), "typesIndexedByProperty", term7268);
        setField(term7228, term7228.getClass(), "eachRefTypeIndexedByProperty", term7283);
        setField(term7228, term7228.getClass(), "greatestSubtypeByProperty", term7288);
        setField(term7228, term7228.getClass(), "interfaceToImplementors", null);
        setField(term7228, term7228.getClass(), "unresolvedNamedTypes", null);
        setField(term7228, term7228.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term7228, term7228.getClass(), "lastGeneration", false);
        setField(term7228, term7228.getClass(), "templateTypeName", null);
        setField(term7228, term7228.getClass(), "templateType", null);
        setBooleanField(term7228, term7228.getClass(), "tolerateUndefinedValues", false);
        setField(term7228, term7228.getClass(), "resolveMode", null);
        Class<? extends Object> term489333 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term489332 = ((Class) term489333).getDeclaredField((String) "NO_TYPE");
        ((Field) term489332).setAccessible(true);
        Object enum27 = ((Field) term489332).get((Object) null);
        Class<? extends Object> term489596 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term489595 = ((Class) term489596).getDeclaredField((String) "OBJECT_NUMBER_STRING");
        ((Field) term489595).setAccessible(true);
        Object enum28 = ((Field) term489595).get((Object) null);
        Class<? extends Object> term489898 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term489897 = ((Class) term489898).getDeclaredField((String) "EVAL_ERROR_TYPE");
        ((Field) term489897).setAccessible(true);
        Object enum29 = ((Field) term489897).get((Object) null);
        Class<? extends Object> term490185 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term490184 = ((Class) term490185).getDeclaredField((String) "NUMBER_STRING");
        ((Field) term490184).setAccessible(true);
        Object enum30 = ((Field) term490184).get((Object) null);
        Class<? extends Object> term490466 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term490465 = ((Class) term490466).getDeclaredField((String) "REGEXP_FUNCTION_TYPE");
        ((Field) term490465).setAccessible(true);
        Object enum31 = ((Field) term490465).get((Object) null);
        term7299 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSTypeNative", 5);
        setElement(term7299, 0, enum27);
        setElement(term7299, 1, enum28);
        setElement(term7299, 2, enum29);
        setElement(term7299, 3, enum30);
        setElement(term7299, 4, enum31);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeNative"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term7299;
        try {
            callMethod(klass, "createUnionType", argTypes, term7228, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


