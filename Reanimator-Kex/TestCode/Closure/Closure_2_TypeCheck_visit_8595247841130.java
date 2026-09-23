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

public class TypeCheck_visit_8595247841130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term324129;
     Object term324221;

    public TypeCheck_visit_8595247841130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term324129 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term324221 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term324313 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term324221, term324221.getClass(), "type", 155);
        setField(term324221, term324221.getClass(), "first", term324313);
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
        args[1] = term324221;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term324129, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


