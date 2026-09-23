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
import java.util.NoSuchElementException;
import static com.google.gson.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class _Gson_Types_indexOf_95764775039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;
     Object term10;

    public _Gson_Types_indexOf_95764775039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = (Object[]) newArray("java.lang.Object", 4);
        Object term6 = newInstance(Class.forName("java.lang.Object"));
        Object term7 = newInstance(Class.forName("java.lang.Object"));
        Object term8 = newInstance(Class.forName("java.lang.Object"));
        Object term9 = newInstance(Class.forName("java.lang.Object"));
        setElement(term5, 0, term6);
        setElement(term5, 1, term7);
        setElement(term5, 2, term8);
        setElement(term5, 3, term9);
        term10 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.$Gson$Types");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term5;
        args[1] = term10;
        try {
            callMethod(klass, "indexOf", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


