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

public class TypeCheck_visitBinaryOperator_2067533860326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88562;
     Object term88736;

    public TypeCheck_visitBinaryOperator_2067533860326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88562 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term88666 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term88562, term88562.getClass(), "typeRegistry", term88666);
        term88736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term88806, term88806.getClass(), "jsType", null);
        setField(term88736, term88736.getClass(), "first", term88806);
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
        args[2] = term88736;
        callMethod(klass, "visitBinaryOperator", argTypes, term88562, args);
    }

};


