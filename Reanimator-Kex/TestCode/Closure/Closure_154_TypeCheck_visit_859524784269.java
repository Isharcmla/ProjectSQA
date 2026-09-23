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

public class TypeCheck_visit_859524784269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76062;
     Object term76152;
     Object term76222;

    public TypeCheck_visit_859524784269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76062 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term76062, term76062.getClass(), "noTypeCheckSection", 0);
        term76152 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term76222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76222, term76222.getClass(), "type", 66);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term76152;
        args[1] = term76222;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term76062, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


