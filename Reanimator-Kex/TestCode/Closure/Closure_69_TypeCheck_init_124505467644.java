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

public class TypeCheck_init_124505467644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1121;

    public TypeCheck_init_124505467644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1123 = new HashMap();
        HashMap term1133 = new HashMap();
        Set<Object> term12907 =  ((Map) term1133).keySet();
        HashSet term1132 = new HashSet((Collection<? extends Object>) term12907);
        HashMap term1152 = new HashMap();
        Set<Object> term12908 =  ((Map) term1152).keySet();
        HashSet term1151 = new HashSet((Collection<? extends Object>) term12908);
        HashMap term1161 = new HashMap();
        Set<Object> term12909 =  ((Map) term1161).keySet();
        HashSet term1160 = new HashSet((Collection<? extends Object>) term12909);
        HashMap term1177 = new HashMap();
        HashMap term1190 = new HashMap();
        HashMap term1195 = new HashMap();
        term1121 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1122 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term1121, term1121.getClass(), "reporter", null);
        setField(term1121, term1121.getClass(), "nativeTypes", term1122);
        setField(term1121, term1121.getClass(), "namesToTypes", term1123);
        setField(term1121, term1121.getClass(), "namespaces", term1132);
        setField(term1121, term1121.getClass(), "nonNullableTypeNames", term1151);
        setField(term1121, term1121.getClass(), "forwardDeclaredTypes", term1160);
        setField(term1121, term1121.getClass(), "typesIndexedByProperty", term1177);
        setField(term1121, term1121.getClass(), "eachRefTypeIndexedByProperty", term1190);
        setField(term1121, term1121.getClass(), "greatestSubtypeByProperty", term1195);
        setField(term1121, term1121.getClass(), "interfaceToImplementors", null);
        setField(term1121, term1121.getClass(), "unresolvedNamedTypes", null);
        setField(term1121, term1121.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1121, term1121.getClass(), "lastGeneration", false);
        setField(term1121, term1121.getClass(), "templateTypeName", null);
        setField(term1121, term1121.getClass(), "templateType", null);
        setBooleanField(term1121, term1121.getClass(), "tolerateUndefinedValues", false);
        setField(term1121, term1121.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.ReverseAbstractInterpreter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term1121;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


