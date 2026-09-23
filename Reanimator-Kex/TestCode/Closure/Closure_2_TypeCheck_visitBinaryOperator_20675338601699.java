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

public class TypeCheck_visitBinaryOperator_20675338601699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term582173;
     Object term582243;

    public TypeCheck_visitBinaryOperator_20675338601699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term582173 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term582243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term582313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term582409 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term582479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term582577 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term582313, term582313.getClass(), "jsType", term582409);
        setField(term582243, term582243.getClass(), "first", term582313);
        setField(term582479, term582479.getClass(), "jsType", term582577);
        setField(term582243, term582243.getClass(), "last", term582479);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 93;
        args[1] = null;
        args[2] = term582243;
        callMethod(klass, "visitBinaryOperator", argTypes, term582173, args);
    }

};


