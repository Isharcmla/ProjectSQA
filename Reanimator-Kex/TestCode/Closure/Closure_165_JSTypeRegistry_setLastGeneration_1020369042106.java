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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Boolean;

public class JSTypeRegistry_setLastGeneration_1020369042106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3871;
     Object term3949;
     Object term484175;

    public JSTypeRegistry_setLastGeneration_1020369042106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3873 = new HashMap();
        HashMap term3883 = new HashMap();
        Set<Object> term484187 =  ((Map) term3883).keySet();
        HashSet term3882 = new HashSet((Collection<? extends Object>) term484187);
        HashMap term3889 = new HashMap();
        Set<Object> term484188 =  ((Map) term3889).keySet();
        HashSet term3888 = new HashSet((Collection<? extends Object>) term484188);
        HashMap term3906 = new HashMap();
        Set<Object> term484189 =  ((Map) term3906).keySet();
        HashSet term3905 = new HashSet((Collection<? extends Object>) term484189);
        HashMap term3918 = new HashMap();
        HashMap term3933 = new HashMap();
        HashMap term3938 = new HashMap();
        term3871 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term3872 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term3871, term3871.getClass(), "reporter", null);
        setField(term3871, term3871.getClass(), "nativeTypes", term3872);
        setField(term3871, term3871.getClass(), "namesToTypes", term3873);
        setField(term3871, term3871.getClass(), "namespaces", term3882);
        setField(term3871, term3871.getClass(), "nonNullableTypeNames", term3888);
        setField(term3871, term3871.getClass(), "forwardDeclaredTypes", term3905);
        setField(term3871, term3871.getClass(), "typesIndexedByProperty", term3918);
        setField(term3871, term3871.getClass(), "eachRefTypeIndexedByProperty", term3933);
        setField(term3871, term3871.getClass(), "greatestSubtypeByProperty", term3938);
        setField(term3871, term3871.getClass(), "interfaceToImplementors", null);
        setField(term3871, term3871.getClass(), "unresolvedNamedTypes", null);
        setField(term3871, term3871.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term3871, term3871.getClass(), "lastGeneration", false);
        setField(term3871, term3871.getClass(), "templateTypeName", null);
        setField(term3871, term3871.getClass(), "templateType", null);
        setBooleanField(term3871, term3871.getClass(), "tolerateUndefinedValues", false);
        setField(term3871, term3871.getClass(), "resolveMode", null);
        term3949 = new Boolean(false);
        HashMap term484177 = new HashMap();
        HashMap term484179 = new HashMap();
        Set<Object> term484191 =  ((Map) term484179).keySet();
        HashSet term484178 = new HashSet((Collection<? extends Object>) term484191);
        HashMap term484181 = new HashMap();
        Set<Object> term484192 =  ((Map) term484181).keySet();
        HashSet term484180 = new HashSet((Collection<? extends Object>) term484192);
        HashMap term484183 = new HashMap();
        Set<Object> term484193 =  ((Map) term484183).keySet();
        HashSet term484182 = new HashSet((Collection<? extends Object>) term484193);
        HashMap term484184 = new HashMap();
        HashMap term484185 = new HashMap();
        HashMap term484186 = new HashMap();
        term484175 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term484176 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term484175, term484175.getClass(), "reporter", null);
        setField(term484175, term484175.getClass(), "nativeTypes", term484176);
        setField(term484175, term484175.getClass(), "namesToTypes", term484177);
        setField(term484175, term484175.getClass(), "namespaces", term484178);
        setField(term484175, term484175.getClass(), "nonNullableTypeNames", term484180);
        setField(term484175, term484175.getClass(), "forwardDeclaredTypes", term484182);
        setField(term484175, term484175.getClass(), "typesIndexedByProperty", term484184);
        setField(term484175, term484175.getClass(), "eachRefTypeIndexedByProperty", term484185);
        setField(term484175, term484175.getClass(), "greatestSubtypeByProperty", term484186);
        setField(term484175, term484175.getClass(), "interfaceToImplementors", null);
        setField(term484175, term484175.getClass(), "unresolvedNamedTypes", null);
        setField(term484175, term484175.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term484175, term484175.getClass(), "lastGeneration", false);
        setField(term484175, term484175.getClass(), "templateTypeName", null);
        setField(term484175, term484175.getClass(), "templateType", null);
        setBooleanField(term484175, term484175.getClass(), "tolerateUndefinedValues", false);
        setField(term484175, term484175.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3949;
        callMethod(klass, "setLastGeneration", argTypes, term3871, args);
        assertTrue(recursiveEquals(term3871, term484175));
        assertTrue(recursiveEquals(term3949, false));
    }

};


