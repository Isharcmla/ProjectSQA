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

public class ClosureReverseAbstractInterpreter_restrictParameter_206870570510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2089;
     Object term2223;

    public ClosureReverseAbstractInterpreter_restrictParameter_206870570510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2089 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        term2223 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$9"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.FlowScope");
        argTypes[3] = Class.forName("com.google.common.base.Function");
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term2223;
        args[4] = true;
        try {
            callMethod(klass, "restrictParameter", argTypes, term2089, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


