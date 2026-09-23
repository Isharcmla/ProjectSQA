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

public class TypeInference_traverseReturn_1142297770326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term533346;
     Object term533416;

    public TypeInference_traverseReturn_1142297770326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term533346 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term533416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term533486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term533556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term533486, term533486.getClass(), "type", 110);
        setIntField(term533556, term533556.getClass(), "type", 45);
        setField(term533486, term533486.getClass(), "first", term533556);
        setField(term533416, term533416.getClass(), "first", term533486);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term533416;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term533346, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


