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

public class TypeCheck_visitBinaryOperator_2067533860379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112002;
     Object term112072;

    public TypeCheck_visitBinaryOperator_2067533860379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112002 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term112072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112236 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term112306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112402 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term112142, term112142.getClass(), "jsType", term112236);
        setField(term112072, term112072.getClass(), "first", term112142);
        setField(term112306, term112306.getClass(), "jsType", term112402);
        setField(term112072, term112072.getClass(), "last", term112306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 52;
        args[1] = null;
        args[2] = term112072;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term112002, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


