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

public class TypeCheck_isPropertyTest_657275882402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98588;
     Object term98658;

    public TypeCheck_isPropertyTest_657275882402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98588 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term98658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term98658, term98658.getClass(), "parent", term98658);
        setIntField(term98658, term98658.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term98658;
        try {
            callMethod(klass, "isPropertyTest", argTypes, term98588, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


