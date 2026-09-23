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

public class TypeCheck_init_100985953769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1173;

    public TypeCheck_init_100985953769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1175 = new HashMap();
        HashMap term1185 = new HashMap();
        Set<Object> term15510 =  ((Map) term1185).keySet();
        HashSet term1184 = new HashSet((Collection<? extends Object>) term15510);
        HashMap term1204 = new HashMap();
        Set<Object> term15511 =  ((Map) term1204).keySet();
        HashSet term1203 = new HashSet((Collection<? extends Object>) term15511);
        HashMap term1213 = new HashMap();
        Set<Object> term15512 =  ((Map) term1213).keySet();
        HashSet term1212 = new HashSet((Collection<? extends Object>) term15512);
        HashMap term1229 = new HashMap();
        HashMap term1244 = new HashMap();
        HashMap term1249 = new HashMap();
        term1173 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1174 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term1173, term1173.getClass(), "reporter", null);
        setField(term1173, term1173.getClass(), "nativeTypes", term1174);
        setField(term1173, term1173.getClass(), "namesToTypes", term1175);
        setField(term1173, term1173.getClass(), "namespaces", term1184);
        setField(term1173, term1173.getClass(), "nonNullableTypeNames", term1203);
        setField(term1173, term1173.getClass(), "forwardDeclaredTypes", term1212);
        setField(term1173, term1173.getClass(), "typesIndexedByProperty", term1229);
        setField(term1173, term1173.getClass(), "eachRefTypeIndexedByProperty", term1244);
        setField(term1173, term1173.getClass(), "greatestSubtypeByProperty", term1249);
        setField(term1173, term1173.getClass(), "interfaceToImplementors", null);
        setField(term1173, term1173.getClass(), "unresolvedNamedTypes", null);
        setField(term1173, term1173.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1173, term1173.getClass(), "lastGeneration", false);
        setField(term1173, term1173.getClass(), "templateTypes", null);
        setBooleanField(term1173, term1173.getClass(), "tolerateUndefinedValues", false);
        setField(term1173, term1173.getClass(), "resolveMode", null);
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
        args[2] = term1173;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


