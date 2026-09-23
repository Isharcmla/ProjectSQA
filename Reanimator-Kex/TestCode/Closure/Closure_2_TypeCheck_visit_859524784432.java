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

public class TypeCheck_visit_859524784432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106751;
     Object term106821;

    public TypeCheck_visit_859524784432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106751 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term106821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106913 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setIntField(term106821, term106821.getClass(), "type", 98);
        setField(term106821, term106821.getClass(), "jsType", term106913);
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
        args[1] = term106821;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term106751, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


