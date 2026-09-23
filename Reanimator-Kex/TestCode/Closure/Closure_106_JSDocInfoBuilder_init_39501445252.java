package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Boolean;
import java.lang.Object;

public class JSDocInfoBuilder_init_39501445252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term31946;

    public JSDocInfoBuilder_init_39501445252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Boolean(false);
        term31946 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term31947 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term31947, term31947.getClass(), "info", null);
        setField(term31947, term31947.getClass(), "documentation", null);
        setField(term31947, term31947.getClass(), "sourceName", null);
        setField(term31947, term31947.getClass(), "visibility", null);
        setIntField(term31947, term31947.getClass(), "bitset", 0);
        setField(term31947, term31947.getClass(), "type", null);
        setField(term31947, term31947.getClass(), "thisType", null);
        setBooleanField(term31947, term31947.getClass(), "includeDocumentation", false);
        setField(term31946, term31946.getClass(), "currentInfo", term31947);
        setBooleanField(term31946, term31946.getClass(), "populated", false);
        setBooleanField(term31946, term31946.getClass(), "parseDocumentation", false);
        setField(term31946, term31946.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term31946));
        assertTrue(recursiveEquals(term1, false));
    }

};


