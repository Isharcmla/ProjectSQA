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

public class TypeInference_traverseAdd_838817955381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term910267;
     Object term910337;

    public TypeInference_traverseAdd_838817955381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term910267 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term910337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term910407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term910477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term910547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term910617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term910687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term910757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term910827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term910897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term910967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term911037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term911107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term911177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term911247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term911317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term911387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term911457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term911527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term911597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term911667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term911737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term911807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term911877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term911947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term910407, term910407.getClass(), "next", term910477);
        setIntField(term910407, term910407.getClass(), "type", 14);
        setIntField(term910547, term910547.getClass(), "type", 14);
        setIntField(term910617, term910617.getClass(), "type", 14);
        setIntField(term910687, term910687.getClass(), "type", 14);
        setIntField(term910757, term910757.getClass(), "type", 14);
        setIntField(term910827, term910827.getClass(), "type", 14);
        setIntField(term910897, term910897.getClass(), "type", 14);
        setIntField(term910967, term910967.getClass(), "type", 14);
        setIntField(term911037, term911037.getClass(), "type", 14);
        setIntField(term911107, term911107.getClass(), "type", 14);
        setIntField(term911177, term911177.getClass(), "type", 14);
        setIntField(term911247, term911247.getClass(), "type", 14);
        setIntField(term911317, term911317.getClass(), "type", 14);
        setIntField(term911387, term911387.getClass(), "type", 14);
        setIntField(term911457, term911457.getClass(), "type", 14);
        setIntField(term911527, term911527.getClass(), "type", 14);
        setIntField(term911597, term911597.getClass(), "type", 14);
        setIntField(term911667, term911667.getClass(), "type", 14);
        setIntField(term911737, term911737.getClass(), "type", 14);
        setIntField(term911807, term911807.getClass(), "type", 14);
        setIntField(term911877, term911877.getClass(), "type", 14);
        setIntField(term911947, term911947.getClass(), "type", 40);
        setField(term911877, term911877.getClass(), "first", term911947);
        setField(term911807, term911807.getClass(), "first", term911877);
        setField(term911737, term911737.getClass(), "first", term911807);
        setField(term911667, term911667.getClass(), "first", term911737);
        setField(term911597, term911597.getClass(), "first", term911667);
        setField(term911527, term911527.getClass(), "first", term911597);
        setField(term911457, term911457.getClass(), "first", term911527);
        setField(term911387, term911387.getClass(), "first", term911457);
        setField(term911317, term911317.getClass(), "first", term911387);
        setField(term911247, term911247.getClass(), "first", term911317);
        setField(term911177, term911177.getClass(), "first", term911247);
        setField(term911107, term911107.getClass(), "first", term911177);
        setField(term911037, term911037.getClass(), "first", term911107);
        setField(term910967, term910967.getClass(), "first", term911037);
        setField(term910897, term910897.getClass(), "first", term910967);
        setField(term910827, term910827.getClass(), "first", term910897);
        setField(term910757, term910757.getClass(), "first", term910827);
        setField(term910687, term910687.getClass(), "first", term910757);
        setField(term910617, term910617.getClass(), "first", term910687);
        setField(term910547, term910547.getClass(), "first", term910617);
        setField(term910407, term910407.getClass(), "first", term910547);
        setField(term910337, term910337.getClass(), "first", term910407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term910337;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term910267, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


