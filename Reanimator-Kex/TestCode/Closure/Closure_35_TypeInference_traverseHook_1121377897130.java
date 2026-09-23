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

public class TypeInference_traverseHook_1121377897130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42477;
     Object term42547;

    public TypeInference_traverseHook_1121377897130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42477 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term42547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term42617, term42617.getClass(), "next", term42687);
        setIntField(term42617, term42617.getClass(), "type", 127);
        setField(term42547, term42547.getClass(), "first", term42617);
        setField(term42547, term42547.getClass(), "last", term42757);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term42547;
        args[1] = null;
        try {
            callMethod(klass, "traverseHook", argTypes, term42477, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


