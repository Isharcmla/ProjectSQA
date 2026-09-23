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
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;

public class UnionType_equals_2074846565125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36063;
     Object term36205;
     Object term36242;
     Object term36245;

    public UnionType_equals_2074846565125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term36229 = new HashSet();
        term36063 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term36063, term36063.getClass(), "alternates", term36229);
        term36205 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term36205, term36205.getClass(), "alternates", term36229);
        HashMap term36244 = new HashMap();
        Set<Object> term36248 =  ((Map) term36244).keySet();
        HashSet term36243 = new HashSet((Collection<? extends Object>) term36248);
        term36242 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term36242, term36242.getClass(), "alternates", term36243);
        setBooleanField(term36242, term36242.getClass(), "resolved", false);
        setField(term36242, term36242.getClass(), "resolveResult", null);
        setField(term36242, term36242.getClass(), "registry", null);
        HashMap term36247 = new HashMap();
        Set<Object> term36249 =  ((Map) term36247).keySet();
        HashSet term36246 = new HashSet((Collection<? extends Object>) term36249);
        term36245 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term36245, term36245.getClass(), "alternates", term36246);
        setBooleanField(term36245, term36245.getClass(), "resolved", false);
        setField(term36245, term36245.getClass(), "resolveResult", null);
        setField(term36245, term36245.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term36205;
        callMethod(klass, "equals", argTypes, term36063, args);
        assertTrue(recursiveEquals(term36063, term36242));
        assertTrue(recursiveEquals(term36205, term36245));
    }

};


