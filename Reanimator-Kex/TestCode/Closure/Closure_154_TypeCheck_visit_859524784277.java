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

public class TypeCheck_visit_859524784277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78461;
     Object term78551;
     Object term78621;

    public TypeCheck_visit_859524784277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78461 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term78461, term78461.getClass(), "noTypeCheckSection", 0);
        term78551 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term78621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term78621, term78621.getClass(), "type", 138);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term78551;
        args[1] = term78621;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term78461, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


