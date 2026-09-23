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

public class _Gson_Types_resolve_1298521219152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28236;
     Object term28652;
     Object term28650;

    public _Gson_Types_resolve_1298521219152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28236 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$WildcardTypeImpl"));
        Object term28348 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$WildcardTypeImpl"));
        setField(term28236, term28236.getClass(), "lowerBound", null);
        setField(term28236, term28236.getClass(), "upperBound", term28348);
        term28652 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$WildcardTypeImpl"));
        Object term28653 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$WildcardTypeImpl"));
        setField(term28653, term28653.getClass(), "upperBound", null);
        setField(term28653, term28653.getClass(), "lowerBound", null);
        setField(term28652, term28652.getClass(), "upperBound", term28653);
        setField(term28652, term28652.getClass(), "lowerBound", null);
        term28650 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$WildcardTypeImpl"));
        Object term28651 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$WildcardTypeImpl"));
        setField(term28651, term28651.getClass(), "upperBound", null);
        setField(term28651, term28651.getClass(), "lowerBound", null);
        setField(term28650, term28650.getClass(), "upperBound", term28651);
        setField(term28650, term28650.getClass(), "lowerBound", null);
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
        args[2] = term28236;
        Object retValue = callMethod(klass, "resolve", argTypes, null, args);
        assertTrue(recursiveEquals(term28236, term28652));
        assertTrue(recursiveEquals(retValue, term28650));
    }

};


