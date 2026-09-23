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

public class TypeCheck_init_122880885444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term82;
     Object enum12;
     Object enum13;

    public TypeCheck_init_122880885444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3 = new HashMap();
        HashMap term13 = new HashMap();
        Set<Object> term10972 =  ((Map) term13).keySet();
        HashSet term12 = new HashSet((Collection<? extends Object>) term10972);
        HashMap term26 = new HashMap();
        Set<Object> term10973 =  ((Map) term26).keySet();
        HashSet term25 = new HashSet((Collection<? extends Object>) term10973);
        HashMap term39 = new HashMap();
        Set<Object> term10974 =  ((Map) term39).keySet();
        HashSet term38 = new HashSet((Collection<? extends Object>) term10974);
        HashMap term53 = new HashMap();
        HashMap term66 = new HashMap();
        HashMap term71 = new HashMap();
        term1 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term1, term1.getClass(), "reporter", null);
        setField(term1, term1.getClass(), "nativeTypes", term2);
        setField(term1, term1.getClass(), "namesToTypes", term3);
        setField(term1, term1.getClass(), "namespaces", term12);
        setField(term1, term1.getClass(), "nonNullableTypeNames", term25);
        setField(term1, term1.getClass(), "forwardDeclaredTypes", term38);
        setField(term1, term1.getClass(), "typesIndexedByProperty", term53);
        setField(term1, term1.getClass(), "eachRefTypeIndexedByProperty", term66);
        setField(term1, term1.getClass(), "greatestSubtypeByProperty", term71);
        setField(term1, term1.getClass(), "interfaceToImplementors", null);
        setField(term1, term1.getClass(), "unresolvedNamedTypes", null);
        setField(term1, term1.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1, term1.getClass(), "lastGeneration", false);
        setField(term1, term1.getClass(), "templateTypeName", null);
        setField(term1, term1.getClass(), "templateType", null);
        setBooleanField(term1, term1.getClass(), "tolerateUndefinedValues", false);
        setField(term1, term1.getClass(), "resolveMode", null);
        HashMap term83 = new HashMap();
        term82 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term96 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term82, term82.getClass(), "vars", term83);
        setField(term96, term96.getClass(), "vars", null);
        setField(term96, term96.getClass(), "parent", null);
        setIntField(term96, term96.getClass(), "depth", 0);
        setField(term96, term96.getClass(), "rootNode", null);
        setField(term96, term96.getClass(), "thisType", null);
        setBooleanField(term96, term96.getClass(), "isBottom", false);
        setField(term82, term82.getClass(), "parent", term96);
        setIntField(term82, term82.getClass(), "depth", 1725571209);
        setIntField(term100, term100.getClass(), "type", 0);
        setField(term100, term100.getClass(), "next", null);
        setField(term100, term100.getClass(), "first", null);
        setField(term100, term100.getClass(), "last", null);
        setField(term100, term100.getClass(), "propListHead", null);
        setIntField(term100, term100.getClass(), "sourcePosition", 0);
        setField(term100, term100.getClass(), "jsType", null);
        setField(term100, term100.getClass(), "parent", null);
        setField(term82, term82.getClass(), "rootNode", term100);
        setField(term82, term82.getClass(), "thisType", null);
        setBooleanField(term82, term82.getClass(), "isBottom", false);
        Class<? extends Object> term10976 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term10975 = ((Class) term10976).getDeclaredField((String) "WARNING");
        ((Field) term10975).setAccessible(true);
        enum12 = ((Field) term10975).get((Object) null);
        Class<? extends Object> term11199 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term11198 = ((Class) term11199).getDeclaredField((String) "OFF");
        ((Field) term11198).setAccessible(true);
        enum13 = ((Field) term11198).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.ReverseAbstractInterpreter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[4] = Class.forName("com.google.javascript.jscomp.ScopeCreator");
        argTypes[5] = Class.forName("com.google.javascript.jscomp.CheckLevel");
        argTypes[6] = Class.forName("com.google.javascript.jscomp.CheckLevel");
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = null;
        args[2] = term1;
        args[3] = term82;
        args[4] = null;
        args[5] = enum12;
        args[6] = enum13;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


