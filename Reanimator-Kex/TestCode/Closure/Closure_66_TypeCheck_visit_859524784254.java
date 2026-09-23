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

public class TypeCheck_visit_859524784254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67157;
     Object term67247;
     Object term67317;

    public TypeCheck_visit_859524784254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67157 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term67157, term67157.getClass(), "noTypeCheckSection", 0);
        term67247 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term67317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67317, term67317.getClass(), "type", 61);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term67247;
        args[1] = term67317;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term67157, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


