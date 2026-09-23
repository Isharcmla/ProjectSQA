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

public class TypeCheck_checkNoTypeCheckSection_1637574393376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111566;
     Object term111636;

    public TypeCheck_checkNoTypeCheckSection_1637574393376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111566 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term111566, term111566.getClass(), "validator", null);
        setIntField(term111566, term111566.getClass(), "noTypeCheckSection", -1);
        term111636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term111636, term111636.getClass(), "type", 86);
        setField(term111636, term111636.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term111636;
        args[1] = false;
        try {
            callMethod(klass, "checkNoTypeCheckSection", argTypes, term111566, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


