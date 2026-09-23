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

public class TypeCheck_visit_859524784928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244559;
     Object term244651;

    public TypeCheck_visit_859524784928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term244559 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term244651 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term244743 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term244651, term244651.getClass(), "type", 17);
        setField(term244651, term244651.getClass(), "first", term244743);
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
        args[1] = term244651;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term244559, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


