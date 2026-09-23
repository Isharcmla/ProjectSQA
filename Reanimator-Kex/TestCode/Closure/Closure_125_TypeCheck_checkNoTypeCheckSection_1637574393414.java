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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TypeCheck_checkNoTypeCheckSection_1637574393414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101279;
     Object term101349;

    public TypeCheck_checkNoTypeCheckSection_1637574393414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101279 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term101279, term101279.getClass(), "validator", null);
        setIntField(term101279, term101279.getClass(), "noTypeCheckSection", -1);
        term101349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term101349, term101349.getClass(), "type", 132);
        setField(term101349, term101349.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term101349;
        args[1] = false;
        try {
            callMethod(klass, "checkNoTypeCheckSection", argTypes, term101279, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


