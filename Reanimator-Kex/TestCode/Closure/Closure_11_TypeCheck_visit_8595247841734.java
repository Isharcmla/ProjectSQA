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

public class TypeCheck_visit_8595247841734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561844;
     Object term562026;

    public TypeCheck_visit_8595247841734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term561844 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term561934 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term561844, term561844.getClass(), "validator", term561934);
        term562026 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term562118 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term562210 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term562304 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setIntField(term562026, term562026.getClass(), "type", 52);
        setField(term562118, term562118.getClass(), "jsType", null);
        setField(term562026, term562026.getClass(), "first", term562118);
        setField(term562210, term562210.getClass(), "jsType", term562304);
        setField(term562026, term562026.getClass(), "last", term562210);
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
        args[1] = term562026;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term561844, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


