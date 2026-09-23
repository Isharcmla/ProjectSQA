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
import java.lang.Object;

public class NodeUtil_referencesThis_2041162929568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84286;

    public NodeUtil_referencesThis_2041162929568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term84286, term84286.getClass(), "type", 0);
        setIntField(term84356, term84356.getClass(), "type", 0);
        setField(term84356, term84356.getClass(), "first", null);
        setField(term84356, term84356.getClass(), "next", term84426);
        setField(term84286, term84286.getClass(), "first", term84356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term84286;
        callMethod(klass, "referencesThis", argTypes, null, args);
    }

};


