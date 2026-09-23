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

public class TypeInference_traverseArrayLiteral_67090236424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1650368;
     Object term1650438;

    public TypeInference_traverseArrayLiteral_67090236424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1650368 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1650438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1650508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1650578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1650648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1650718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1650788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1650858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1650928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1650998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1651068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1651138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1651208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1650508, term1650508.getClass(), "type", 83);
        setIntField(term1650578, term1650578.getClass(), "type", 83);
        setIntField(term1650648, term1650648.getClass(), "type", 83);
        setIntField(term1650718, term1650718.getClass(), "type", 83);
        setIntField(term1650788, term1650788.getClass(), "type", 83);
        setIntField(term1650858, term1650858.getClass(), "type", 83);
        setIntField(term1650928, term1650928.getClass(), "type", 83);
        setIntField(term1650998, term1650998.getClass(), "type", 83);
        setIntField(term1651068, term1651068.getClass(), "type", 83);
        setIntField(term1651138, term1651138.getClass(), "type", 83);
        setIntField(term1651208, term1651208.getClass(), "type", 121);
        setField(term1651138, term1651138.getClass(), "first", term1651208);
        setField(term1651068, term1651068.getClass(), "first", term1651138);
        setField(term1650998, term1650998.getClass(), "first", term1651068);
        setField(term1650928, term1650928.getClass(), "first", term1650998);
        setField(term1650858, term1650858.getClass(), "first", term1650928);
        setField(term1650788, term1650788.getClass(), "first", term1650858);
        setField(term1650718, term1650718.getClass(), "first", term1650788);
        setField(term1650648, term1650648.getClass(), "first", term1650718);
        setField(term1650578, term1650578.getClass(), "first", term1650648);
        setField(term1650508, term1650508.getClass(), "first", term1650578);
        setField(term1650438, term1650438.getClass(), "first", term1650508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1650438;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term1650368, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


