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

public class TypeCheck_visit_8595247841046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296468;
     Object term296560;

    public TypeCheck_visit_8595247841046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term296468 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term296560 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term296652 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term296746 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setIntField(term296560, term296560.getClass(), "type", 52);
        setField(term296560, term296560.getClass(), "first", null);
        setField(term296652, term296652.getClass(), "jsType", term296746);
        setField(term296560, term296560.getClass(), "last", term296652);
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
        args[1] = term296560;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term296468, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


