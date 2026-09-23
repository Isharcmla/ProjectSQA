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

public class TypeCheck_visit_8595247841272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381929;
     Object term382021;

    public TypeCheck_visit_8595247841272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term381929 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term382021 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term382113 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term382205 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term382021, term382021.getClass(), "type", 12);
        setIntField(term382113, term382113.getClass(), "type", 12);
        setField(term382021, term382021.getClass(), "first", term382113);
        setField(term382021, term382021.getClass(), "last", term382205);
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
        args[1] = term382021;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term381929, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


