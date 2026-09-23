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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ClosureCodingConvention_endsWithPrototype_1576622357183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82735;
     Object term82827;

    public ClosureCodingConvention_endsWithPrototype_1576622357183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82735 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term82827 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term82913 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term82827, term82827.getClass(), "type", 33);
        setField(term82827, term82827.getClass(), "last", term82913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term82827;
        try {
            callMethod(klass, "endsWithPrototype", argTypes, term82735, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


