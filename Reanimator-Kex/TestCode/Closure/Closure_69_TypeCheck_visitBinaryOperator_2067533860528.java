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

public class TypeCheck_visitBinaryOperator_2067533860528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163195;
     Object term163265;

    public TypeCheck_visitBinaryOperator_2067533860528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163195 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term163195, term163195.getClass(), "noTypeCheckSection", -1);
        term163265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term163335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term163431 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        Object term163501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term163591 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setField(term163335, term163335.getClass(), "jsType", term163431);
        setField(term163265, term163265.getClass(), "first", term163335);
        setField(term163501, term163501.getClass(), "jsType", term163591);
        setField(term163265, term163265.getClass(), "last", term163501);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 50;
        args[1] = null;
        args[2] = term163265;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term163195, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


