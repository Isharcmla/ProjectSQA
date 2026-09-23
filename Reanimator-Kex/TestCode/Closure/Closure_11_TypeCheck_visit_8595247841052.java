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

public class TypeCheck_visit_8595247841052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298295;
     Object term298387;

    public TypeCheck_visit_8595247841052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term298295 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term298387 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term298479 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term298387, term298387.getClass(), "type", 27);
        setField(term298387, term298387.getClass(), "first", term298479);
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
        args[1] = term298387;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term298295, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


