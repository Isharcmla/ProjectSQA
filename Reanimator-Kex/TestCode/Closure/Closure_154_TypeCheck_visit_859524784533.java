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

public class TypeCheck_visit_859524784533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147788;
     Object term147878;
     Object term147970;

    public TypeCheck_visit_859524784533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147788 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term147788, term147788.getClass(), "noTypeCheckSection", 0);
        term147878 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term147970 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term147970, term147970.getClass(), "type", 149);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term147878;
        args[1] = term147970;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term147788, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


