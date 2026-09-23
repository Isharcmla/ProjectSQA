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

public class ClosureCodingConvention_endsWithPrototype_1576622357371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138026;
     Object term138112;

    public ClosureCodingConvention_endsWithPrototype_1576622357371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138026 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term138112 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term138198 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term138112, term138112.getClass(), "type", 33);
        setIntField(term138198, term138198.getClass(), "type", 40);
        setField(term138112, term138112.getClass(), "last", term138198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term138112;
        try {
            callMethod(klass, "endsWithPrototype", argTypes, term138026, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


