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

public class TypeCheck_visitBinaryOperator_2067533860441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133535;
     Object term133605;

    public TypeCheck_visitBinaryOperator_2067533860441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133535 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term133605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term133675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term133793 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term133863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term133957 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term133675, term133675.getClass(), "jsType", term133793);
        setField(term133605, term133605.getClass(), "first", term133675);
        setField(term133863, term133863.getClass(), "jsType", term133957);
        setField(term133605, term133605.getClass(), "last", term133863);
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
        args[2] = term133605;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term133535, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


