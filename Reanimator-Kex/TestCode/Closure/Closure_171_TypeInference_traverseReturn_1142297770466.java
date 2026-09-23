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

public class TypeInference_traverseReturn_1142297770466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1321074;
     Object term1321144;

    public TypeInference_traverseReturn_1142297770466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1321074 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1321144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1321214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1321284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1321354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1321424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1321494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1321564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1321634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1321214, term1321214.getClass(), "type", 92);
        setIntField(term1321284, term1321284.getClass(), "type", 92);
        setIntField(term1321354, term1321354.getClass(), "type", 92);
        setIntField(term1321424, term1321424.getClass(), "type", 92);
        setIntField(term1321494, term1321494.getClass(), "type", 92);
        setIntField(term1321564, term1321564.getClass(), "type", 92);
        setIntField(term1321634, term1321634.getClass(), "type", 154);
        setField(term1321564, term1321564.getClass(), "first", term1321634);
        setField(term1321494, term1321494.getClass(), "first", term1321564);
        setField(term1321424, term1321424.getClass(), "first", term1321494);
        setField(term1321354, term1321354.getClass(), "first", term1321424);
        setField(term1321284, term1321284.getClass(), "first", term1321354);
        setField(term1321214, term1321214.getClass(), "first", term1321284);
        setField(term1321144, term1321144.getClass(), "first", term1321214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1321144;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1321074, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


