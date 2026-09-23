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

public class JSType_getLeastSupertype_2082831967249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43982;
     Object term44178;
     Object term44455;
     Object term44456;
     Object term44457;
     Object term44459;
     Object term44460;
     Object term44448;

    public JSType_getLeastSupertype_2082831967249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43982 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        Object term44086 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term43982, term43982.getClass(), "registry", term44086);
        term44178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        term44455 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setBooleanField(term44455, term44455.getClass(), "resolved", false);
        setField(term44455, term44455.getClass(), "resolveResult", null);
        setField(term44455, term44455.getClass(), "registry", null);
        term44456 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setBooleanField(term44456, term44456.getClass(), "resolved", false);
        setField(term44456, term44456.getClass(), "resolveResult", null);
        setField(term44456, term44456.getClass(), "registry", null);
        term44457 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        Object term44458 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term44457, term44457.getClass(), "resolved", false);
        setField(term44457, term44457.getClass(), "resolveResult", null);
        setField(term44458, term44458.getClass(), "reporter", null);
        setField(term44458, term44458.getClass(), "nativeTypes", null);
        setField(term44458, term44458.getClass(), "namesToTypes", null);
        setField(term44458, term44458.getClass(), "namespaces", null);
        setField(term44458, term44458.getClass(), "enumTypeNames", null);
        setField(term44458, term44458.getClass(), "forwardDeclaredTypes", null);
        setField(term44458, term44458.getClass(), "typesIndexedByProperty", null);
        setField(term44458, term44458.getClass(), "greatestSubtypeByProperty", null);
        setField(term44458, term44458.getClass(), "interfaceToImplementors", null);
        setField(term44458, term44458.getClass(), "unresolvedNamedTypes", null);
        setField(term44458, term44458.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term44458, term44458.getClass(), "lastGeneration", false);
        setField(term44458, term44458.getClass(), "templateTypeName", null);
        setField(term44458, term44458.getClass(), "templateType", null);
        setBooleanField(term44458, term44458.getClass(), "tolerateUndefinedValues", false);
        setField(term44458, term44458.getClass(), "resolveMode", null);
        setField(term44457, term44457.getClass(), "registry", term44458);
        term44459 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setBooleanField(term44459, term44459.getClass(), "resolved", false);
        setField(term44459, term44459.getClass(), "resolveResult", null);
        setField(term44459, term44459.getClass(), "registry", null);
        term44460 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        Object term44461 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term44460, term44460.getClass(), "resolved", false);
        setField(term44460, term44460.getClass(), "resolveResult", null);
        setField(term44461, term44461.getClass(), "reporter", null);
        setField(term44461, term44461.getClass(), "nativeTypes", null);
        setField(term44461, term44461.getClass(), "namesToTypes", null);
        setField(term44461, term44461.getClass(), "namespaces", null);
        setField(term44461, term44461.getClass(), "enumTypeNames", null);
        setField(term44461, term44461.getClass(), "forwardDeclaredTypes", null);
        setField(term44461, term44461.getClass(), "typesIndexedByProperty", null);
        setField(term44461, term44461.getClass(), "greatestSubtypeByProperty", null);
        setField(term44461, term44461.getClass(), "interfaceToImplementors", null);
        setField(term44461, term44461.getClass(), "unresolvedNamedTypes", null);
        setField(term44461, term44461.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term44461, term44461.getClass(), "lastGeneration", false);
        setField(term44461, term44461.getClass(), "templateTypeName", null);
        setField(term44461, term44461.getClass(), "templateType", null);
        setBooleanField(term44461, term44461.getClass(), "tolerateUndefinedValues", false);
        setField(term44461, term44461.getClass(), "resolveMode", null);
        setField(term44460, term44460.getClass(), "registry", term44461);
        term44448 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term44449 = newInstance(Class.forName("com.google.common.collect.RegularImmutableList"));
        Object[] term44452 = (Object[]) newArray("java.lang.Object", 2);
        Object term44180 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        Object term44312 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        Object term44314 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setIntField(term44449, term44449.getClass(), "offset", 0);
        setIntField(term44449, term44449.getClass(), "size", 2);
        setBooleanField(term44180, term44180.getClass(), "resolved", false);
        setField(term44180, term44180.getClass(), "resolveResult", null);
        setField(term44180, term44180.getClass(), "registry", null);
        setElement(term44452, 0, term44180);
        setBooleanField(term44312, term44312.getClass(), "resolved", false);
        setField(term44312, term44312.getClass(), "resolveResult", null);
        setField(term44314, term44314.getClass(), "reporter", null);
        setField(term44314, term44314.getClass(), "nativeTypes", null);
        setField(term44314, term44314.getClass(), "namesToTypes", null);
        setField(term44314, term44314.getClass(), "namespaces", null);
        setField(term44314, term44314.getClass(), "enumTypeNames", null);
        setField(term44314, term44314.getClass(), "forwardDeclaredTypes", null);
        setField(term44314, term44314.getClass(), "typesIndexedByProperty", null);
        setField(term44314, term44314.getClass(), "greatestSubtypeByProperty", null);
        setField(term44314, term44314.getClass(), "interfaceToImplementors", null);
        setField(term44314, term44314.getClass(), "unresolvedNamedTypes", null);
        setField(term44314, term44314.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term44314, term44314.getClass(), "lastGeneration", false);
        setField(term44314, term44314.getClass(), "templateTypeName", null);
        setField(term44314, term44314.getClass(), "templateType", null);
        setBooleanField(term44314, term44314.getClass(), "tolerateUndefinedValues", false);
        setField(term44314, term44314.getClass(), "resolveMode", null);
        setField(term44312, term44312.getClass(), "registry", term44314);
        setElement(term44452, 1, term44312);
        setField(term44449, term44449.getClass(), "array", term44452);
        setField(term44449, term44449.getClass(), "asList", null);
        setField(term44448, term44448.getClass(), "alternates", term44449);
        setIntField(term44448, term44448.getClass(), "hashcode", 941661653);
        setBooleanField(term44448, term44448.getClass(), "resolved", false);
        setField(term44448, term44448.getClass(), "resolveResult", null);
        setField(term44448, term44448.getClass(), "registry", term44314);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term43982;
        args[1] = term44178;
        Object retValue = callMethod(klass, "getLeastSupertype", argTypes, null, args);
        assertTrue(recursiveEquals(term43982, term44456));
        assertTrue(recursiveEquals(term44178, term44457));
        assertTrue(recursiveEquals(retValue, term44448));
    }

};


