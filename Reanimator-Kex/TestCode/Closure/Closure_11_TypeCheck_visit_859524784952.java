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

public class TypeCheck_visit_859524784952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254468;
     Object term254642;

    public TypeCheck_visit_859524784952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term254468 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term254572 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term254468, term254468.getClass(), "typeRegistry", term254572);
        term254642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term254712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term254782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term254642, term254642.getClass(), "type", 52);
        setField(term254642, term254642.getClass(), "first", term254712);
        setField(term254782, term254782.getClass(), "jsType", null);
        setField(term254642, term254642.getClass(), "last", term254782);
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
        args[1] = term254642;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term254468, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


