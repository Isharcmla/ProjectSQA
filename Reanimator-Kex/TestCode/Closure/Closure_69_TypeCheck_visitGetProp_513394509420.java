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

public class TypeCheck_visitGetProp_513394509420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124687;
     Object term124779;

    public TypeCheck_visitGetProp_513394509420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124687 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term124779 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term124871 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term124963 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term124779, term124779.getClass(), "jsType", null);
        setField(term124779, term124779.getClass(), "last", term124871);
        setField(term124779, term124779.getClass(), "first", term124963);
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
        args[1] = term124779;
        args[2] = null;
        try {
            callMethod(klass, "visitGetProp", argTypes, term124687, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


