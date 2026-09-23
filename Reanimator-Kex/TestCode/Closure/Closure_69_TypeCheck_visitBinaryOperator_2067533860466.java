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

public class TypeCheck_visitBinaryOperator_2067533860466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142042;
     Object term142112;

    public TypeCheck_visitBinaryOperator_2067533860466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142042 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term142112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term142182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term142270 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term142340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term142438 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setField(term142182, term142182.getClass(), "jsType", term142270);
        setField(term142112, term142112.getClass(), "first", term142182);
        setField(term142340, term142340.getClass(), "jsType", term142438);
        setField(term142112, term142112.getClass(), "last", term142340);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 18;
        args[1] = null;
        args[2] = term142112;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term142042, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


