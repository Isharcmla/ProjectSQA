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

public class TypeCheck_visitBinaryOperator_2067533860645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209945;
     Object term210015;

    public TypeCheck_visitBinaryOperator_2067533860645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209945 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term210015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term210085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term210185 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term210255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term210343 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term210085, term210085.getClass(), "jsType", term210185);
        setField(term210015, term210015.getClass(), "first", term210085);
        setField(term210255, term210255.getClass(), "jsType", term210343);
        setField(term210015, term210015.getClass(), "last", term210255);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 38;
        args[1] = null;
        args[2] = term210015;
        callMethod(klass, "visitBinaryOperator", argTypes, term209945, args);
    }

};


