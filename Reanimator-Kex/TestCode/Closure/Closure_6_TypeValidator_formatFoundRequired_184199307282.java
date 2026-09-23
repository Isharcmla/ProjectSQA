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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TypeValidator_formatFoundRequired_184199307282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8305;
     Object term18138;

    public TypeValidator_formatFoundRequired_184199307282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8308 = new HashMap();
        HashMap term8317 = new HashMap();
        Set<Object> term18304 =  ((Map) term8317).keySet();
        HashSet term8316 = new HashSet((Collection<? extends Object>) term18304);
        HashMap term8324 = new HashMap();
        Set<Object> term18305 =  ((Map) term8324).keySet();
        HashSet term8323 = new HashSet((Collection<? extends Object>) term18305);
        HashMap term8331 = new HashMap();
        Set<Object> term18306 =  ((Map) term8331).keySet();
        HashSet term8330 = new HashSet((Collection<? extends Object>) term18306);
        HashMap term8337 = new HashMap();
        HashMap term8345 = new HashMap();
        HashMap term8350 = new HashMap();
        term8305 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term8306 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term8307 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term8305, term8305.getClass(), "compiler", null);
        setField(term8306, term8306.getClass(), "reporter", null);
        setField(term8306, term8306.getClass(), "nativeTypes", term8307);
        setField(term8306, term8306.getClass(), "namesToTypes", term8308);
        setField(term8306, term8306.getClass(), "namespaces", term8316);
        setField(term8306, term8306.getClass(), "nonNullableTypeNames", term8323);
        setField(term8306, term8306.getClass(), "forwardDeclaredTypes", term8330);
        setField(term8306, term8306.getClass(), "typesIndexedByProperty", term8337);
        setField(term8306, term8306.getClass(), "eachRefTypeIndexedByProperty", term8345);
        setField(term8306, term8306.getClass(), "greatestSubtypeByProperty", term8350);
        setField(term8306, term8306.getClass(), "interfaceToImplementors", null);
        setField(term8306, term8306.getClass(), "unresolvedNamedTypes", null);
        setField(term8306, term8306.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term8306, term8306.getClass(), "lastGeneration", false);
        setField(term8306, term8306.getClass(), "templateTypes", null);
        setBooleanField(term8306, term8306.getClass(), "tolerateUndefinedValues", false);
        setField(term8306, term8306.getClass(), "resolveMode", null);
        setField(term8305, term8305.getClass(), "typeRegistry", term8306);
        setField(term8305, term8305.getClass(), "allValueTypes", null);
        setBooleanField(term8305, term8305.getClass(), "shouldReport", false);
        setField(term8305, term8305.getClass(), "nullOrUndefined", null);
        setField(term8305, term8305.getClass(), "mismatches", null);
        HashMap term18142 = new HashMap();
        HashMap term18159 = new HashMap();
        Set<Object> term18405 =  ((Map) term18159).keySet();
        HashSet term18157 = new HashSet((Collection<? extends Object>) term18405);
        HashMap term18174 = new HashMap();
        Set<Object> term18416 =  ((Map) term18174).keySet();
        HashSet term18170 = new HashSet((Collection<? extends Object>) term18416);
        HashMap term18186 = new HashMap();
        Set<Object> term18417 =  ((Map) term18186).keySet();
        HashSet term18185 = new HashSet((Collection<? extends Object>) term18417);
        HashMap term18188 = new HashMap();
        HashMap term18198 = new HashMap();
        HashMap term18207 = new HashMap();
        term18138 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term18139 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term18140 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term18138, term18138.getClass(), "compiler", null);
        setField(term18139, term18139.getClass(), "reporter", null);
        setField(term18139, term18139.getClass(), "nativeTypes", term18140);
        setField(term18139, term18139.getClass(), "namesToTypes", term18142);
        setField(term18139, term18139.getClass(), "namespaces", term18157);
        setField(term18139, term18139.getClass(), "nonNullableTypeNames", term18170);
        setField(term18139, term18139.getClass(), "forwardDeclaredTypes", term18185);
        setField(term18139, term18139.getClass(), "typesIndexedByProperty", term18188);
        setField(term18139, term18139.getClass(), "eachRefTypeIndexedByProperty", term18198);
        setField(term18139, term18139.getClass(), "greatestSubtypeByProperty", term18207);
        setField(term18139, term18139.getClass(), "interfaceToImplementors", null);
        setField(term18139, term18139.getClass(), "unresolvedNamedTypes", null);
        setField(term18139, term18139.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term18139, term18139.getClass(), "lastGeneration", false);
        setField(term18139, term18139.getClass(), "templateTypes", null);
        setBooleanField(term18139, term18139.getClass(), "tolerateUndefinedValues", false);
        setField(term18139, term18139.getClass(), "resolveMode", null);
        setField(term18138, term18138.getClass(), "typeRegistry", term18139);
        setField(term18138, term18138.getClass(), "allValueTypes", null);
        setBooleanField(term18138, term18138.getClass(), "shouldReport", false);
        setField(term18138, term18138.getClass(), "nullOrUndefined", null);
        setField(term18138, term18138.getClass(), "mismatches", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[3];
        args[0] = "gqhqalMaKC";
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "formatFoundRequired", argTypes, term8305, args);
        assertTrue(recursiveEquals(term8305, term18138));
        assertTrue(recursiveEquals(retValue, "gqhqalMaKC\nfound   : null\nrequired: null"));
    }

};


