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

public class _Gson_Types_resolve_129852121996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13002;
     Object term13301;
     Object term13300;

    public _Gson_Types_resolve_129852121996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13002 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$WildcardTypeImpl"));
        term13301 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$WildcardTypeImpl"));
        setField(term13301, term13301.getClass(), "upperBound", null);
        setField(term13301, term13301.getClass(), "lowerBound", null);
        term13300 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$WildcardTypeImpl"));
        setField(term13300, term13300.getClass(), "upperBound", null);
        setField(term13300, term13300.getClass(), "lowerBound", null);
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
        args[2] = term13002;
        Object retValue = callMethod(klass, "resolve", argTypes, null, args);
        assertTrue(recursiveEquals(term13002, term13301));
        assertTrue(recursiveEquals(retValue, term13300));
    }

};


