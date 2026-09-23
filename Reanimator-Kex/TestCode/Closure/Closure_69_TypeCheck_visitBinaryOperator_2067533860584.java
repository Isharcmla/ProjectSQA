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

public class TypeCheck_visitBinaryOperator_2067533860584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180563;
     Object term180633;

    public TypeCheck_visitBinaryOperator_2067533860584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180563 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term180633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term180703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term180791 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term180861 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term180979 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term180703, term180703.getClass(), "jsType", term180791);
        setField(term180633, term180633.getClass(), "first", term180703);
        setField(term180861, term180861.getClass(), "jsType", term180979);
        setField(term180633, term180633.getClass(), "last", term180861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 84;
        args[1] = null;
        args[2] = term180633;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term180563, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


