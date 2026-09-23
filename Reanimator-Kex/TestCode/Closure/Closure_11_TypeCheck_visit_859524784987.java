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

public class TypeCheck_visit_859524784987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265921;
     Object term265991;

    public TypeCheck_visit_859524784987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265921 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term265991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term266061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term265991, term265991.getClass(), "type", 86);
        setField(term265991, term265991.getClass(), "propListHead", null);
        setField(term265991, term265991.getClass(), "first", term266061);
        setField(term265991, term265991.getClass(), "last", null);
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
        args[1] = term265991;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term265921, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


