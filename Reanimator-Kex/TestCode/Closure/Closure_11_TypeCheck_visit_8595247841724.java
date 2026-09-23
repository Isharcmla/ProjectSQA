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

public class TypeCheck_visit_8595247841724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term559195;
     Object term559265;

    public TypeCheck_visit_8595247841724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term559195 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term559265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term559335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term559445 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term559515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term559265, term559265.getClass(), "type", 96);
        setField(term559335, term559335.getClass(), "jsType", term559445);
        setField(term559265, term559265.getClass(), "first", term559335);
        setField(term559265, term559265.getClass(), "last", term559515);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term559265;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term559195, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


