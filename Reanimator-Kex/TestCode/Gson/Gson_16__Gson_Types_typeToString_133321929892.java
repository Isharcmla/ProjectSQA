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
import java.lang.String;

public class _Gson_Types_typeToString_133321929892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12067;
     Object term13075;

    public _Gson_Types_typeToString_133321929892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12067 = Class.forName((String) "com.google.gson.internal.bind.TypeAdapters$5");
        term13075 = Class.forName((String) "kex.java.util.LinkedList");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.$Gson$Types");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.reflect.Type");
        Object[] args = new Object[1];
        args[0] = term12067;
        Object retValue = callMethod(klass, "typeToString", argTypes, null, args);
        assertTrue(recursiveEquals(term12067, term13075));
        assertTrue(recursiveEquals(retValue, "kex.java.util.LinkedList"));
    }

};


