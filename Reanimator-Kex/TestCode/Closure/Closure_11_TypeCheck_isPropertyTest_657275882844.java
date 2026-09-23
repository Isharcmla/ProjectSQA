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
import java.lang.Object;

public class TypeCheck_isPropertyTest_657275882844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216802;
     Object term216952;

    public TypeCheck_isPropertyTest_657275882844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216802 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term216882 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term216802, term216802.getClass(), "compiler", term216882);
        term216952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term217022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term216952, term216952.getClass(), "parent", term216952);
        setIntField(term216952, term216952.getClass(), "type", 37);
        setField(term216952, term216952.getClass(), "first", term217022);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term216952;
        try {
            callMethod(klass, "isPropertyTest", argTypes, term216802, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


