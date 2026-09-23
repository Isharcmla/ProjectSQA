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

public class TypeCheck_init_98715237243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term586;
     Object enum14;
     Object enum15;

    public TypeCheck_init_98715237243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term588 = new HashMap();
        HashMap term598 = new HashMap();
        Set<Object> term12114 =  ((Map) term598).keySet();
        HashSet term597 = new HashSet((Collection<? extends Object>) term12114);
        HashMap term604 = new HashMap();
        Set<Object> term12115 =  ((Map) term604).keySet();
        HashSet term603 = new HashSet((Collection<? extends Object>) term12115);
        HashMap term615 = new HashMap();
        Set<Object> term12116 =  ((Map) term615).keySet();
        HashSet term614 = new HashSet((Collection<? extends Object>) term12116);
        HashMap term637 = new HashMap();
        HashMap term650 = new HashMap();
        HashMap term655 = new HashMap();
        term586 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term587 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term586, term586.getClass(), "reporter", null);
        setField(term586, term586.getClass(), "nativeTypes", term587);
        setField(term586, term586.getClass(), "namesToTypes", term588);
        setField(term586, term586.getClass(), "namespaces", term597);
        setField(term586, term586.getClass(), "nonNullableTypeNames", term603);
        setField(term586, term586.getClass(), "forwardDeclaredTypes", term614);
        setField(term586, term586.getClass(), "typesIndexedByProperty", term637);
        setField(term586, term586.getClass(), "eachRefTypeIndexedByProperty", term650);
        setField(term586, term586.getClass(), "greatestSubtypeByProperty", term655);
        setField(term586, term586.getClass(), "interfaceToImplementors", null);
        setField(term586, term586.getClass(), "unresolvedNamedTypes", null);
        setField(term586, term586.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term586, term586.getClass(), "lastGeneration", false);
        setField(term586, term586.getClass(), "templateTypeName", null);
        setField(term586, term586.getClass(), "templateType", null);
        setBooleanField(term586, term586.getClass(), "tolerateUndefinedValues", false);
        setField(term586, term586.getClass(), "resolveMode", null);
        Class<? extends Object> term12118 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term12117 = ((Class) term12118).getDeclaredField((String) "WARNING");
        ((Field) term12117).setAccessible(true);
        enum14 = ((Field) term12117).get((Object) null);
        Class<? extends Object> term12341 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term12340 = ((Class) term12341).getDeclaredField((String) "OFF");
        ((Field) term12340).setAccessible(true);
        enum15 = ((Field) term12340).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.ReverseAbstractInterpreter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.CheckLevel");
        argTypes[4] = Class.forName("com.google.javascript.jscomp.CheckLevel");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term586;
        args[3] = enum14;
        args[4] = enum15;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


