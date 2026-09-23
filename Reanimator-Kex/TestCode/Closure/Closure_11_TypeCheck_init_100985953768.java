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

public class TypeCheck_init_100985953768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1153;

    public TypeCheck_init_100985953768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1155 = new HashMap();
        HashMap term1165 = new HashMap();
        Set<Object> term15257 =  ((Map) term1165).keySet();
        HashSet term1164 = new HashSet((Collection<? extends Object>) term15257);
        HashMap term1184 = new HashMap();
        Set<Object> term15258 =  ((Map) term1184).keySet();
        HashSet term1183 = new HashSet((Collection<? extends Object>) term15258);
        HashMap term1193 = new HashMap();
        Set<Object> term15259 =  ((Map) term1193).keySet();
        HashSet term1192 = new HashSet((Collection<? extends Object>) term15259);
        HashMap term1209 = new HashMap();
        HashMap term1224 = new HashMap();
        HashMap term1229 = new HashMap();
        term1153 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1154 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term1153, term1153.getClass(), "reporter", null);
        setField(term1153, term1153.getClass(), "nativeTypes", term1154);
        setField(term1153, term1153.getClass(), "namesToTypes", term1155);
        setField(term1153, term1153.getClass(), "namespaces", term1164);
        setField(term1153, term1153.getClass(), "nonNullableTypeNames", term1183);
        setField(term1153, term1153.getClass(), "forwardDeclaredTypes", term1192);
        setField(term1153, term1153.getClass(), "typesIndexedByProperty", term1209);
        setField(term1153, term1153.getClass(), "eachRefTypeIndexedByProperty", term1224);
        setField(term1153, term1153.getClass(), "greatestSubtypeByProperty", term1229);
        setField(term1153, term1153.getClass(), "interfaceToImplementors", null);
        setField(term1153, term1153.getClass(), "unresolvedNamedTypes", null);
        setField(term1153, term1153.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1153, term1153.getClass(), "lastGeneration", false);
        setField(term1153, term1153.getClass(), "templateTypes", null);
        setBooleanField(term1153, term1153.getClass(), "tolerateUndefinedValues", false);
        setField(term1153, term1153.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.ReverseAbstractInterpreter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term1153;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


