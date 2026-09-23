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

public class RecordTypeBuilder_init_11237597853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term327;
     Object term341;

    public RecordTypeBuilder_init_11237597853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3 = new HashMap();
        HashMap term13 = new HashMap();
        Set<Object> term353 =  ((Map) term13).keySet();
        HashSet term12 = new HashSet((Collection<? extends Object>) term353);
        HashMap term26 = new HashMap();
        Set<Object> term354 =  ((Map) term26).keySet();
        HashSet term25 = new HashSet((Collection<? extends Object>) term354);
        HashMap term39 = new HashMap();
        Set<Object> term355 =  ((Map) term39).keySet();
        HashSet term38 = new HashSet((Collection<? extends Object>) term355);
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
        setField(term1, term1.getClass(), "templateTypeName", null);
        setField(term1, term1.getClass(), "templateType", null);
        setBooleanField(term1, term1.getClass(), "tolerateUndefinedValues", false);
        setField(term1, term1.getClass(), "resolveMode", null);
        HashMap term330 = new HashMap();
        HashMap term332 = new HashMap();
        Set<Object> term356 =  ((Map) term332).keySet();
        HashSet term331 = new HashSet((Collection<? extends Object>) term356);
        HashMap term334 = new HashMap();
        Set<Object> term357 =  ((Map) term334).keySet();
        HashSet term333 = new HashSet((Collection<? extends Object>) term357);
        HashMap term336 = new HashMap();
        Set<Object> term358 =  ((Map) term336).keySet();
        HashSet term335 = new HashSet((Collection<? extends Object>) term358);
        HashMap term337 = new HashMap();
        HashMap term338 = new HashMap();
        HashMap term339 = new HashMap();
        HashMap term340 = new HashMap();
        term327 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordTypeBuilder"));
        Object term328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term329 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setBooleanField(term327, term327.getClass(), "isEmpty", true);
        setField(term328, term328.getClass(), "reporter", null);
        setField(term328, term328.getClass(), "nativeTypes", term329);
        setField(term328, term328.getClass(), "namesToTypes", term330);
        setField(term328, term328.getClass(), "namespaces", term331);
        setField(term328, term328.getClass(), "nonNullableTypeNames", term333);
        setField(term328, term328.getClass(), "forwardDeclaredTypes", term335);
        setField(term328, term328.getClass(), "typesIndexedByProperty", term337);
        setField(term328, term328.getClass(), "eachRefTypeIndexedByProperty", term338);
        setField(term328, term328.getClass(), "greatestSubtypeByProperty", term339);
        setField(term328, term328.getClass(), "interfaceToImplementors", null);
        setField(term328, term328.getClass(), "unresolvedNamedTypes", null);
        setField(term328, term328.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term328, term328.getClass(), "lastGeneration", false);
        setField(term328, term328.getClass(), "templateTypeName", null);
        setField(term328, term328.getClass(), "templateType", null);
        setBooleanField(term328, term328.getClass(), "tolerateUndefinedValues", false);
        setField(term328, term328.getClass(), "resolveMode", null);
        setField(term327, term327.getClass(), "registry", term328);
        setField(term327, term327.getClass(), "properties", term340);
        HashMap term343 = new HashMap();
        HashMap term345 = new HashMap();
        Set<Object> term359 =  ((Map) term345).keySet();
        HashSet term344 = new HashSet((Collection<? extends Object>) term359);
        HashMap term347 = new HashMap();
        Set<Object> term360 =  ((Map) term347).keySet();
        HashSet term346 = new HashSet((Collection<? extends Object>) term360);
        HashMap term349 = new HashMap();
        Set<Object> term361 =  ((Map) term349).keySet();
        HashSet term348 = new HashSet((Collection<? extends Object>) term361);
        HashMap term350 = new HashMap();
        HashMap term351 = new HashMap();
        HashMap term352 = new HashMap();
        term341 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term342 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term341, term341.getClass(), "reporter", null);
        setField(term341, term341.getClass(), "nativeTypes", term342);
        setField(term341, term341.getClass(), "namesToTypes", term343);
        setField(term341, term341.getClass(), "namespaces", term344);
        setField(term341, term341.getClass(), "nonNullableTypeNames", term346);
        setField(term341, term341.getClass(), "forwardDeclaredTypes", term348);
        setField(term341, term341.getClass(), "typesIndexedByProperty", term350);
        setField(term341, term341.getClass(), "eachRefTypeIndexedByProperty", term351);
        setField(term341, term341.getClass(), "greatestSubtypeByProperty", term352);
        setField(term341, term341.getClass(), "interfaceToImplementors", null);
        setField(term341, term341.getClass(), "unresolvedNamedTypes", null);
        setField(term341, term341.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term341, term341.getClass(), "lastGeneration", false);
        setField(term341, term341.getClass(), "templateTypeName", null);
        setField(term341, term341.getClass(), "templateType", null);
        setBooleanField(term341, term341.getClass(), "tolerateUndefinedValues", false);
        setField(term341, term341.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term327));
        assertTrue(recursiveEquals(term1, term341));
    }

};


