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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class NodeUtil_evaluatesToLocalValue_744664708531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571534;
     Object term571589;

    public NodeUtil_evaluatesToLocalValue_744664708531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term571534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term571534, term571534.getClass(), "type", 64);
        term571589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term571589, term571589.getClass(), "type", 64);
        setField(term571589, term571589.getClass(), "next", null);
        setField(term571589, term571589.getClass(), "first", null);
        setField(term571589, term571589.getClass(), "last", null);
        setField(term571589, term571589.getClass(), "propListHead", null);
        setIntField(term571589, term571589.getClass(), "sourcePosition", 0);
        setField(term571589, term571589.getClass(), "jsType", null);
        setField(term571589, term571589.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term571534;
        callMethod(klass, "evaluatesToLocalValue", argTypes, null, args);
        assertTrue(recursiveEquals(term571534, term571589));
    }

};


