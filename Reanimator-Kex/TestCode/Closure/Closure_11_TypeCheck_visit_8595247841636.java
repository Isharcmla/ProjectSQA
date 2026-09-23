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

public class TypeCheck_visit_8595247841636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term523534;
     Object term523626;

    public TypeCheck_visit_8595247841636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term523534 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term523534, term523534.getClass(), "validator", null);
        term523626 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term523718 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term523812 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term523904 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term523998 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setIntField(term523626, term523626.getClass(), "type", 52);
        setField(term523718, term523718.getClass(), "jsType", term523812);
        setField(term523626, term523626.getClass(), "first", term523718);
        setField(term523904, term523904.getClass(), "jsType", term523998);
        setField(term523626, term523626.getClass(), "last", term523904);
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
        args[1] = term523626;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term523534, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


