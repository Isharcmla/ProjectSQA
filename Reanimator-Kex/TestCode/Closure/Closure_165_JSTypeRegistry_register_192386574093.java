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

public class JSTypeRegistry_register_192386574093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1123;
     Object term480644;

    public JSTypeRegistry_register_192386574093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1125 = new HashMap();
        HashMap term1135 = new HashMap();
        Set<Object> term480661 =  ((Map) term1135).keySet();
        HashSet term1134 = new HashSet((Collection<? extends Object>) term480661);
        HashMap term1148 = new HashMap();
        Set<Object> term480662 =  ((Map) term1148).keySet();
        HashSet term1147 = new HashSet((Collection<? extends Object>) term480662);
        HashMap term1163 = new HashMap();
        Set<Object> term480663 =  ((Map) term1163).keySet();
        HashSet term1162 = new HashSet((Collection<? extends Object>) term480663);
        HashMap term1181 = new HashMap();
        HashMap term1196 = new HashMap();
        HashMap term1201 = new HashMap();
        term1123 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1124 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term1123, term1123.getClass(), "reporter", null);
        setField(term1123, term1123.getClass(), "nativeTypes", term1124);
        setField(term1123, term1123.getClass(), "namesToTypes", term1125);
        setField(term1123, term1123.getClass(), "namespaces", term1134);
        setField(term1123, term1123.getClass(), "nonNullableTypeNames", term1147);
        setField(term1123, term1123.getClass(), "forwardDeclaredTypes", term1162);
        setField(term1123, term1123.getClass(), "typesIndexedByProperty", term1181);
        setField(term1123, term1123.getClass(), "eachRefTypeIndexedByProperty", term1196);
        setField(term1123, term1123.getClass(), "greatestSubtypeByProperty", term1201);
        setField(term1123, term1123.getClass(), "interfaceToImplementors", null);
        setField(term1123, term1123.getClass(), "unresolvedNamedTypes", null);
        setField(term1123, term1123.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1123, term1123.getClass(), "lastGeneration", false);
        setField(term1123, term1123.getClass(), "templateTypeName", null);
        setField(term1123, term1123.getClass(), "templateType", null);
        setBooleanField(term1123, term1123.getClass(), "tolerateUndefinedValues", false);
        setField(term1123, term1123.getClass(), "resolveMode", null);
        HashMap term480646 = new HashMap();
        HashMap term480651 = new HashMap();
        Set<Object> term480674 =  ((Map) term480651).keySet();
        HashSet term480650 = new HashSet((Collection<? extends Object>) term480674);
        HashMap term480653 = new HashMap();
        Set<Object> term480675 =  ((Map) term480653).keySet();
        HashSet term480652 = new HashSet((Collection<? extends Object>) term480675);
        HashMap term480655 = new HashMap();
        Set<Object> term480676 =  ((Map) term480655).keySet();
        HashSet term480654 = new HashSet((Collection<? extends Object>) term480676);
        HashMap term480656 = new HashMap();
        HashMap term480657 = new HashMap();
        HashMap term480658 = new HashMap();
        term480644 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term480645 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term480644, term480644.getClass(), "reporter", null);
        setField(term480644, term480644.getClass(), "nativeTypes", term480645);
        setField(term480644, term480644.getClass(), "namesToTypes", term480646);
        setField(term480644, term480644.getClass(), "namespaces", term480650);
        setField(term480644, term480644.getClass(), "nonNullableTypeNames", term480652);
        setField(term480644, term480644.getClass(), "forwardDeclaredTypes", term480654);
        setField(term480644, term480644.getClass(), "typesIndexedByProperty", term480656);
        setField(term480644, term480644.getClass(), "eachRefTypeIndexedByProperty", term480657);
        setField(term480644, term480644.getClass(), "greatestSubtypeByProperty", term480658);
        setField(term480644, term480644.getClass(), "interfaceToImplementors", null);
        setField(term480644, term480644.getClass(), "unresolvedNamedTypes", null);
        setField(term480644, term480644.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term480644, term480644.getClass(), "lastGeneration", false);
        setField(term480644, term480644.getClass(), "templateTypeName", null);
        setField(term480644, term480644.getClass(), "templateType", null);
        setBooleanField(term480644, term480644.getClass(), "tolerateUndefinedValues", false);
        setField(term480644, term480644.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "aSATgQUpoe";
        callMethod(klass, "register", argTypes, term1123, args);
        assertTrue(recursiveEquals(term1123, term480644));
    }

};


