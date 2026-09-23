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

public class TypeCheck_visitBinaryOperator_20675338601566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term519490;
     Object term519560;

    public TypeCheck_visitBinaryOperator_20675338601566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term519490 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term519560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term519630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term519720 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term519790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term519896 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term519630, term519630.getClass(), "jsType", term519720);
        setField(term519560, term519560.getClass(), "first", term519630);
        setField(term519790, term519790.getClass(), "jsType", term519896);
        setField(term519560, term519560.getClass(), "last", term519790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 27;
        args[1] = null;
        args[2] = term519560;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term519490, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


