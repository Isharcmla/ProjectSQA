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

public class TypeCheck_visit_859524784336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82013;
     Object term82173;

    public TypeCheck_visit_859524784336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82013 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term82103 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term82013, term82013.getClass(), "validator", term82103);
        term82173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term82173, term82173.getClass(), "type", 28);
        setField(term82173, term82173.getClass(), "first", term82173);
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
        args[1] = term82173;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term82013, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


