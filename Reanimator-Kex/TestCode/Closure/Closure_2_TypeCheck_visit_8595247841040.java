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

public class TypeCheck_visit_8595247841040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294308;
     Object term294400;

    public TypeCheck_visit_8595247841040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294308 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term294400 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term294492 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term294400, term294400.getClass(), "type", 10);
        setField(term294400, term294400.getClass(), "first", term294492);
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
        args[1] = term294400;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term294308, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


