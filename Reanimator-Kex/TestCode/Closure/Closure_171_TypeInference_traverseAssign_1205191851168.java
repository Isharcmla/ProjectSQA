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

public class TypeInference_traverseAssign_1205191851168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86147;
     Object term86217;

    public TypeInference_traverseAssign_1205191851168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86147 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term86217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term86217, term86217.getClass(), "first", term86217);
        setField(term86217, term86217.getClass(), "last", term86287);
        setIntField(term86217, term86217.getClass(), "type", 1072005683);
        setIntField(term86357, term86357.getClass(), "type", 72);
        setField(term86217, term86217.getClass(), "next", term86357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term86217;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term86147, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


