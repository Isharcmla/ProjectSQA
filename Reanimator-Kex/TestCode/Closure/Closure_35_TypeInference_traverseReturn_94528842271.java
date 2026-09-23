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

public class TypeInference_traverseReturn_94528842271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term578673;
     Object term578743;

    public TypeInference_traverseReturn_94528842271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term578673 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term578743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term578813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term578883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term578953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term579023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term579093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term579163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term579233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term579303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term579373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term578813, term578813.getClass(), "type", 9);
        setIntField(term578883, term578883.getClass(), "type", 9);
        setIntField(term578953, term578953.getClass(), "type", 9);
        setIntField(term579023, term579023.getClass(), "type", 9);
        setIntField(term579093, term579093.getClass(), "type", 9);
        setIntField(term579163, term579163.getClass(), "type", 9);
        setIntField(term579233, term579233.getClass(), "type", 9);
        setIntField(term579303, term579303.getClass(), "type", 9);
        setIntField(term579373, term579373.getClass(), "type", 65);
        setField(term579303, term579303.getClass(), "first", term579373);
        setField(term579233, term579233.getClass(), "first", term579303);
        setField(term579163, term579163.getClass(), "first", term579233);
        setField(term579093, term579093.getClass(), "first", term579163);
        setField(term579023, term579023.getClass(), "first", term579093);
        setField(term578953, term578953.getClass(), "first", term579023);
        setField(term578883, term578883.getClass(), "first", term578953);
        setField(term578813, term578813.getClass(), "first", term578883);
        setField(term578743, term578743.getClass(), "first", term578813);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term578743;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term578673, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


