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

public class TypeCheck_visitBinaryOperator_2067533860570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176943;
     Object term177013;

    public TypeCheck_visitBinaryOperator_2067533860570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176943 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term176943, term176943.getClass(), "noTypeCheckSection", -1);
        term177013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term177083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term177175 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        Object term177245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term177343 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term177083, term177083.getClass(), "jsType", term177175);
        setField(term177013, term177013.getClass(), "first", term177083);
        setField(term177245, term177245.getClass(), "jsType", term177343);
        setField(term177013, term177013.getClass(), "last", term177245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = null;
        args[2] = term177013;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term176943, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


