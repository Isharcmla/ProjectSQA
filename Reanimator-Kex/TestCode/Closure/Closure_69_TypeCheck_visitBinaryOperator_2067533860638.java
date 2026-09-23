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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_visitBinaryOperator_2067533860638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206179;
     Object term206249;

    public TypeCheck_visitBinaryOperator_2067533860638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206179 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term206249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term206319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term206417 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        Object term206487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term206577 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setField(term206319, term206319.getClass(), "jsType", term206417);
        setField(term206249, term206249.getClass(), "first", term206319);
        setField(term206487, term206487.getClass(), "jsType", term206577);
        setField(term206249, term206249.getClass(), "last", term206487);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 60;
        args[1] = null;
        args[2] = term206249;
        callMethod(klass, "visitBinaryOperator", argTypes, term206179, args);
    }

};


