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

public class TypeCheck_visit_8595247841518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term496114;
     Object term496310;
     Object term496402;

    public TypeCheck_visit_8595247841518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term496114 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term496218 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term496114, term496114.getClass(), "typeRegistry", term496218);
        term496310 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term496310, term496310.getClass(), "type", 111);
        term496402 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term496472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term496472, term496472.getClass(), "jsType", null);
        setField(term496402, term496402.getClass(), "first", term496472);
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
        args[1] = term496310;
        args[2] = term496402;
        try {
            callMethod(klass, "visit", argTypes, term496114, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


