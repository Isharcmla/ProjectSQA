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

public class TypeCheck_visitBinaryOperator_2067533860505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154964;
     Object term155034;

    public TypeCheck_visitBinaryOperator_2067533860505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154964 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term155034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term155104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term155214 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term155284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term155402 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term155104, term155104.getClass(), "jsType", term155214);
        setField(term155034, term155034.getClass(), "first", term155104);
        setField(term155284, term155284.getClass(), "jsType", term155402);
        setField(term155034, term155034.getClass(), "last", term155284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 47;
        args[1] = null;
        args[2] = term155034;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term154964, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


