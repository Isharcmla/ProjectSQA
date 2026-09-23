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

public class TypeCheck_visitBinaryOperator_2067533860460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139382;
     Object term139472;
     Object term139542;

    public TypeCheck_visitBinaryOperator_2067533860460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139382 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term139382, term139382.getClass(), "noTypeCheckSection", 0);
        term139472 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term139542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term139612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term139706 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term139812 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term139612, term139612.getClass(), "jsType", term139706);
        setField(term139542, term139542.getClass(), "first", term139612);
        setField(term139542, term139542.getClass(), "last", term139542);
        setField(term139542, term139542.getClass(), "jsType", term139812);
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
        args[1] = term139472;
        args[2] = term139542;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term139382, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


