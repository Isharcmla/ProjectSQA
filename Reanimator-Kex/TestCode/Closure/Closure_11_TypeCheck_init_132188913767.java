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

public class TypeCheck_init_132188913767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term616;
     Object enum19;
     Object enum20;

    public TypeCheck_init_132188913767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term618 = new HashMap();
        HashMap term628 = new HashMap();
        Set<Object> term14464 =  ((Map) term628).keySet();
        HashSet term627 = new HashSet((Collection<? extends Object>) term14464);
        HashMap term634 = new HashMap();
        Set<Object> term14465 =  ((Map) term634).keySet();
        HashSet term633 = new HashSet((Collection<? extends Object>) term14465);
        HashMap term645 = new HashMap();
        Set<Object> term14466 =  ((Map) term645).keySet();
        HashSet term644 = new HashSet((Collection<? extends Object>) term14466);
        HashMap term667 = new HashMap();
        HashMap term682 = new HashMap();
        HashMap term687 = new HashMap();
        term616 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term617 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term616, term616.getClass(), "reporter", null);
        setField(term616, term616.getClass(), "nativeTypes", term617);
        setField(term616, term616.getClass(), "namesToTypes", term618);
        setField(term616, term616.getClass(), "namespaces", term627);
        setField(term616, term616.getClass(), "nonNullableTypeNames", term633);
        setField(term616, term616.getClass(), "forwardDeclaredTypes", term644);
        setField(term616, term616.getClass(), "typesIndexedByProperty", term667);
        setField(term616, term616.getClass(), "eachRefTypeIndexedByProperty", term682);
        setField(term616, term616.getClass(), "greatestSubtypeByProperty", term687);
        setField(term616, term616.getClass(), "interfaceToImplementors", null);
        setField(term616, term616.getClass(), "unresolvedNamedTypes", null);
        setField(term616, term616.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term616, term616.getClass(), "lastGeneration", false);
        setField(term616, term616.getClass(), "templateTypes", null);
        setBooleanField(term616, term616.getClass(), "tolerateUndefinedValues", false);
        setField(term616, term616.getClass(), "resolveMode", null);
        Class<? extends Object> term14468 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term14467 = ((Class) term14468).getDeclaredField((String) "WARNING");
        ((Field) term14467).setAccessible(true);
        enum19 = ((Field) term14467).get((Object) null);
        Class<? extends Object> term14691 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term14690 = ((Class) term14691).getDeclaredField((String) "OFF");
        ((Field) term14690).setAccessible(true);
        enum20 = ((Field) term14690).get((Object) null);
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
        args[2] = term616;
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


