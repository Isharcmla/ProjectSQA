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

public class TypeCheck_visit_859524784523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138075;
     Object term138249;

    public TypeCheck_visit_859524784523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138075 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term138179 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term138075, term138075.getClass(), "typeRegistry", term138179);
        term138249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term138319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term138249, term138249.getClass(), "type", 9);
        setField(term138319, term138319.getClass(), "jsType", null);
        setField(term138249, term138249.getClass(), "first", term138319);
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
        args[1] = term138249;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term138075, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


