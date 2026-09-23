package com.google.gson.internal;

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
import static com.google.gson.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.internal.EqualityUtils.*;
import java.lang.Object;

public class _Gson_Types_resolve_1298521219185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40855;
     Object term40994;
     Object term40992;

    public _Gson_Types_resolve_1298521219185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40855 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term40967 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$WildcardTypeImpl"));
        setField(term40967, term40967.getClass(), "lowerBound", null);
        setField(term40967, term40967.getClass(), "upperBound", null);
        setField(term40855, term40855.getClass(), "componentType", term40967);
        term40994 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term40995 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$WildcardTypeImpl"));
        setField(term40995, term40995.getClass(), "upperBound", null);
        setField(term40995, term40995.getClass(), "lowerBound", null);
        setField(term40994, term40994.getClass(), "componentType", term40995);
        term40992 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term40993 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$WildcardTypeImpl"));
        setField(term40993, term40993.getClass(), "upperBound", null);
        setField(term40993, term40993.getClass(), "lowerBound", null);
        setField(term40992, term40992.getClass(), "componentType", term40993);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.$Gson$Types");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.reflect.Type");
        argTypes[1] = Class.forName("java.lang.Class");
        argTypes[2] = Class.forName("java.lang.reflect.Type");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term40855;
        Object retValue = callMethod(klass, "resolve", argTypes, null, args);
        assertTrue(recursiveEquals(term40855, term40994));
        assertTrue(recursiveEquals(retValue, term40992));
    }

};


