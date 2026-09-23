package com.google.javascript.jscomp.type;

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
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class SemanticReverseAbstractInterpreter_init_33296248212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public SemanticReverseAbstractInterpreter_init_33296248212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3 = new HashMap();
        HashMap term13 = new HashMap();
        Set<Object> term1576 =  ((Map) term13).keySet();
        HashSet term12 = new HashSet((Collection<? extends Object>) term1576);
        HashMap term26 = new HashMap();
        Set<Object> term1577 =  ((Map) term26).keySet();
        HashSet term25 = new HashSet((Collection<? extends Object>) term1577);
        HashMap term39 = new HashMap();
        Set<Object> term1578 =  ((Map) term39).keySet();
        HashSet term38 = new HashSet((Collection<? extends Object>) term1578);
        HashMap term53 = new HashMap();
        HashMap term68 = new HashMap();
        HashMap term73 = new HashMap();
        term1 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term1, term1.getClass(), "reporter", null);
        setField(term1, term1.getClass(), "nativeTypes", term2);
        setField(term1, term1.getClass(), "namesToTypes", term3);
        setField(term1, term1.getClass(), "namespaces", term12);
        setField(term1, term1.getClass(), "nonNullableTypeNames", term25);
        setField(term1, term1.getClass(), "forwardDeclaredTypes", term38);
        setField(term1, term1.getClass(), "typesIndexedByProperty", term53);
        setField(term1, term1.getClass(), "eachRefTypeIndexedByProperty", term68);
        setField(term1, term1.getClass(), "greatestSubtypeByProperty", term73);
        setField(term1, term1.getClass(), "interfaceToImplementors", null);
        setField(term1, term1.getClass(), "unresolvedNamedTypes", null);
        setField(term1, term1.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1, term1.getClass(), "lastGeneration", false);
        setField(term1, term1.getClass(), "templateTypes", null);
        setBooleanField(term1, term1.getClass(), "tolerateUndefinedValues", false);
        setField(term1, term1.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodingConvention");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


