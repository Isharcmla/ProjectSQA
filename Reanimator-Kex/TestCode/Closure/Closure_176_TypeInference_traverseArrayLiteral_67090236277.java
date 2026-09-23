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

public class TypeInference_traverseArrayLiteral_67090236277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term581171;
     Object term581241;

    public TypeInference_traverseArrayLiteral_67090236277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term581171 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term581241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term581311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term581381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term581451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term581521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term581591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term581661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term581731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term581801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term581871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term581941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term581311, term581311.getClass(), "type", 83);
        setIntField(term581381, term581381.getClass(), "type", 83);
        setIntField(term581451, term581451.getClass(), "type", 83);
        setIntField(term581521, term581521.getClass(), "type", 83);
        setIntField(term581591, term581591.getClass(), "type", 83);
        setIntField(term581661, term581661.getClass(), "type", 83);
        setIntField(term581731, term581731.getClass(), "type", 83);
        setIntField(term581801, term581801.getClass(), "type", 83);
        setIntField(term581871, term581871.getClass(), "type", 83);
        setIntField(term581941, term581941.getClass(), "type", 117);
        setField(term581871, term581871.getClass(), "first", term581941);
        setField(term581801, term581801.getClass(), "first", term581871);
        setField(term581731, term581731.getClass(), "first", term581801);
        setField(term581661, term581661.getClass(), "first", term581731);
        setField(term581591, term581591.getClass(), "first", term581661);
        setField(term581521, term581521.getClass(), "first", term581591);
        setField(term581451, term581451.getClass(), "first", term581521);
        setField(term581381, term581381.getClass(), "first", term581451);
        setField(term581311, term581311.getClass(), "first", term581381);
        setField(term581241, term581241.getClass(), "first", term581311);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term581241;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term581171, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


