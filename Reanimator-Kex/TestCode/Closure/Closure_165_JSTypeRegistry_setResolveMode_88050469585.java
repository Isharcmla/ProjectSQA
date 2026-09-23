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
import java.lang.String;

public class JSTypeRegistry_setResolveMode_88050469585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object enum19;
     Object term478025;
     Object enum21;

    public JSTypeRegistry_setResolveMode_88050469585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5 = new HashMap();
        HashMap term15 = new HashMap();
        Set<Object> term478043 =  ((Map) term15).keySet();
        HashSet term14 = new HashSet((Collection<? extends Object>) term478043);
        HashMap term28 = new HashMap();
        Set<Object> term478044 =  ((Map) term28).keySet();
        HashSet term27 = new HashSet((Collection<? extends Object>) term478044);
        HashMap term41 = new HashMap();
        Set<Object> term478045 =  ((Map) term41).keySet();
        HashSet term40 = new HashSet((Collection<? extends Object>) term478045);
        HashMap term55 = new HashMap();
        HashMap term70 = new HashMap();
        HashMap term75 = new HashMap();
        term3 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term4 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term3, term3.getClass(), "reporter", null);
        setField(term3, term3.getClass(), "nativeTypes", term4);
        setField(term3, term3.getClass(), "namesToTypes", term5);
        setField(term3, term3.getClass(), "namespaces", term14);
        setField(term3, term3.getClass(), "nonNullableTypeNames", term27);
        setField(term3, term3.getClass(), "forwardDeclaredTypes", term40);
        setField(term3, term3.getClass(), "typesIndexedByProperty", term55);
        setField(term3, term3.getClass(), "eachRefTypeIndexedByProperty", term70);
        setField(term3, term3.getClass(), "greatestSubtypeByProperty", term75);
        setField(term3, term3.getClass(), "interfaceToImplementors", null);
        setField(term3, term3.getClass(), "unresolvedNamedTypes", null);
        setField(term3, term3.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term3, term3.getClass(), "lastGeneration", false);
        setField(term3, term3.getClass(), "templateTypeName", null);
        setField(term3, term3.getClass(), "templateType", null);
        setBooleanField(term3, term3.getClass(), "tolerateUndefinedValues", false);
        setField(term3, term3.getClass(), "resolveMode", null);
        Class<? extends Object> term478047 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term478046 = ((Class) term478047).getDeclaredField((String) "LAZY_NAMES");
        ((Field) term478046).setAccessible(true);
        enum19 = ((Field) term478046).get((Object) null);
        HashMap term478027 = new HashMap();
        HashMap term478029 = new HashMap();
        Set<Object> term478390 =  ((Map) term478029).keySet();
        HashSet term478028 = new HashSet((Collection<? extends Object>) term478390);
        HashMap term478031 = new HashMap();
        Set<Object> term478399 =  ((Map) term478031).keySet();
        HashSet term478030 = new HashSet((Collection<? extends Object>) term478399);
        HashMap term478033 = new HashMap();
        Set<Object> term478407 =  ((Map) term478033).keySet();
        HashSet term478032 = new HashSet((Collection<? extends Object>) term478407);
        HashMap term478034 = new HashMap();
        HashMap term478035 = new HashMap();
        HashMap term478036 = new HashMap();
        Class<? extends Object> term478434 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term478433 = ((Class) term478434).getDeclaredField((String) "LAZY_NAMES");
        ((Field) term478433).setAccessible(true);
        Object enum20 = ((Field) term478433).get((Object) null);
        term478025 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term478026 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term478025, term478025.getClass(), "reporter", null);
        setField(term478025, term478025.getClass(), "nativeTypes", term478026);
        setField(term478025, term478025.getClass(), "namesToTypes", term478027);
        setField(term478025, term478025.getClass(), "namespaces", term478028);
        setField(term478025, term478025.getClass(), "nonNullableTypeNames", term478030);
        setField(term478025, term478025.getClass(), "forwardDeclaredTypes", term478032);
        setField(term478025, term478025.getClass(), "typesIndexedByProperty", term478034);
        setField(term478025, term478025.getClass(), "eachRefTypeIndexedByProperty", term478035);
        setField(term478025, term478025.getClass(), "greatestSubtypeByProperty", term478036);
        setField(term478025, term478025.getClass(), "interfaceToImplementors", null);
        setField(term478025, term478025.getClass(), "unresolvedNamedTypes", null);
        setField(term478025, term478025.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term478025, term478025.getClass(), "lastGeneration", false);
        setField(term478025, term478025.getClass(), "templateTypeName", null);
        setField(term478025, term478025.getClass(), "templateType", null);
        setBooleanField(term478025, term478025.getClass(), "tolerateUndefinedValues", false);
        setField(term478025, term478025.getClass(), "resolveMode", enum20);
        Class<? extends Object> term478776 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term478775 = ((Class) term478776).getDeclaredField((String) "LAZY_NAMES");
        ((Field) term478775).setAccessible(true);
        enum21 = ((Field) term478775).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Object[] args = new Object[1];
        args[0] = enum19;
        callMethod(klass, "setResolveMode", argTypes, term3, args);
        assertTrue(recursiveEquals(term3, term478025));
        assertTrue(recursiveEquals(enum19, enum21));
    }

};


