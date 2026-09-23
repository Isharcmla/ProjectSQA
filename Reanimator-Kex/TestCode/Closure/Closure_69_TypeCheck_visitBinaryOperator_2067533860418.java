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

public class TypeCheck_visitBinaryOperator_2067533860418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123597;
     Object term123667;

    public TypeCheck_visitBinaryOperator_2067533860418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123597 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term123667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123849 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        Object term123919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term124009 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setField(term123737, term123737.getClass(), "jsType", term123849);
        setField(term123667, term123667.getClass(), "first", term123737);
        setField(term123919, term123919.getClass(), "jsType", term124009);
        setField(term123667, term123667.getClass(), "last", term123919);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 12;
        args[1] = null;
        args[2] = term123667;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term123597, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


