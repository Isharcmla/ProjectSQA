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

public class TypeCheck_visit_8595247841634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term522970;
     Object term523062;

    public TypeCheck_visit_8595247841634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term522970 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term523062 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term523154 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term523062, term523062.getClass(), "type", 27);
        setField(term523062, term523062.getClass(), "first", term523154);
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
        args[1] = term523062;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term522970, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


