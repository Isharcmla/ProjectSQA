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

public class TypeCheck_visit_8595247841532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term503430;
     Object term503522;

    public TypeCheck_visit_8595247841532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term503430 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term503522 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term503614 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term503712 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setIntField(term503522, term503522.getClass(), "type", 15);
        setField(term503614, term503614.getClass(), "jsType", term503712);
        setField(term503522, term503522.getClass(), "first", term503614);
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
        args[1] = term503522;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term503430, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


