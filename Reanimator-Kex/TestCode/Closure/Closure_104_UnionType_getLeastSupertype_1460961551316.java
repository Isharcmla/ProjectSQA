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
import java.lang.Object;

public class UnionType_getLeastSupertype_1460961551316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114509;
     Object term114909;
     Object term115067;
     Object term115068;
     Object term114911;

    public UnionType_getLeastSupertype_1460961551316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term114557 = new HashSet();
        term114509 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term114813 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term114509, term114509.getClass(), "alternates", term114557);
        setField(term114509, term114509.getClass(), "registry", term114813);
        term114909 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        term115067 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term115067, term115067.getClass(), "resolved", false);
        setField(term115067, term115067.getClass(), "resolveResult", null);
        setField(term115067, term115067.getClass(), "registry", null);
        term115068 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term115068, term115068.getClass(), "resolved", false);
        setField(term115068, term115068.getClass(), "resolveResult", null);
        setField(term115068, term115068.getClass(), "registry", null);
        term114911 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term114911, term114911.getClass(), "resolved", false);
        setField(term114911, term114911.getClass(), "resolveResult", null);
        setField(term114911, term114911.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term114909;
        Object retValue = callMethod(klass, "getLeastSupertype", argTypes, term114509, args);
        assertTrue(recursiveEquals(term114509, term115067));
        assertTrue(recursiveEquals(term114909, term115068));
        assertTrue(recursiveEquals(retValue, term114911));
    }

};


