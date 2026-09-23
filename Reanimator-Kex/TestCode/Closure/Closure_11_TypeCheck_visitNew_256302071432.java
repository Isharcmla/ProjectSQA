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

public class TypeCheck_visitNew_256302071432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term438673;
     Object term438743;

    public TypeCheck_visitNew_256302071432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term438673 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term438743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term438839 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setField(term438743, term438743.getClass(), "first", term438743);
        setField(term438743, term438743.getClass(), "jsType", term438839);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term438743;
        try {
            callMethod(klass, "visitNew", argTypes, term438673, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


