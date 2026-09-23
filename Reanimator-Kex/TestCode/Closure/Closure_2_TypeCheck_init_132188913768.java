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

public class TypeCheck_init_132188913768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term636;
     Object enum19;
     Object enum20;

    public TypeCheck_init_132188913768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term638 = new HashMap();
        HashMap term648 = new HashMap();
        Set<Object> term14717 =  ((Map) term648).keySet();
        HashSet term647 = new HashSet((Collection<? extends Object>) term14717);
        HashMap term654 = new HashMap();
        Set<Object> term14718 =  ((Map) term654).keySet();
        HashSet term653 = new HashSet((Collection<? extends Object>) term14718);
        HashMap term665 = new HashMap();
        Set<Object> term14719 =  ((Map) term665).keySet();
        HashSet term664 = new HashSet((Collection<? extends Object>) term14719);
        HashMap term687 = new HashMap();
        HashMap term702 = new HashMap();
        HashMap term707 = new HashMap();
        term636 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term637 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term636, term636.getClass(), "reporter", null);
        setField(term636, term636.getClass(), "nativeTypes", term637);
        setField(term636, term636.getClass(), "namesToTypes", term638);
        setField(term636, term636.getClass(), "namespaces", term647);
        setField(term636, term636.getClass(), "nonNullableTypeNames", term653);
        setField(term636, term636.getClass(), "forwardDeclaredTypes", term664);
        setField(term636, term636.getClass(), "typesIndexedByProperty", term687);
        setField(term636, term636.getClass(), "eachRefTypeIndexedByProperty", term702);
        setField(term636, term636.getClass(), "greatestSubtypeByProperty", term707);
        setField(term636, term636.getClass(), "interfaceToImplementors", null);
        setField(term636, term636.getClass(), "unresolvedNamedTypes", null);
        setField(term636, term636.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term636, term636.getClass(), "lastGeneration", false);
        setField(term636, term636.getClass(), "templateTypes", null);
        setBooleanField(term636, term636.getClass(), "tolerateUndefinedValues", false);
        setField(term636, term636.getClass(), "resolveMode", null);
        Class<? extends Object> term14721 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term14720 = ((Class) term14721).getDeclaredField((String) "WARNING");
        ((Field) term14720).setAccessible(true);
        enum19 = ((Field) term14720).get((Object) null);
        Class<? extends Object> term14944 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term14943 = ((Class) term14944).getDeclaredField((String) "OFF");
        ((Field) term14943).setAccessible(true);
        enum20 = ((Field) term14943).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.ReverseAbstractInterpreter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.CheckLevel");
        argTypes[4] = Class.forName("com.google.javascript.jscomp.CheckLevel");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term636;
        args[3] = enum19;
        args[4] = enum20;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


