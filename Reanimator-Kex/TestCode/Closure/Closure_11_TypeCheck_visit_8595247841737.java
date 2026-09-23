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

public class TypeCheck_visit_8595247841737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term562870;
     Object term562962;

    public TypeCheck_visit_8595247841737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term562870 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term562870, term562870.getClass(), "noTypeCheckSection", -1);
        term562962 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term563054 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term563154 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term563246 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term563346 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setIntField(term562962, term562962.getClass(), "type", 12);
        setIntField(term563054, term563054.getClass(), "type", 0);
        setBooleanField(term563154, term563154.getClass(), "unknown", false);
        setField(term563054, term563054.getClass(), "jsType", term563154);
        setField(term562962, term562962.getClass(), "first", term563054);
        setIntField(term563246, term563246.getClass(), "type", 0);
        setBooleanField(term563346, term563346.getClass(), "unknown", false);
        setField(term563246, term563246.getClass(), "jsType", term563346);
        setField(term562962, term562962.getClass(), "last", term563246);
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
        args[1] = term562962;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term562870, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


