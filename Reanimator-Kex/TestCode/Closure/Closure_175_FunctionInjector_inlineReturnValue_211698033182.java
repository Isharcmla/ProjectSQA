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

public class FunctionInjector_inlineReturnValue_211698033182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18382;
     Object term18474;
     Object term18784;

    public FunctionInjector_inlineReturnValue_211698033182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18382 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term18382, term18382.getClass(), "safeNameIdSupplier", null);
        term18474 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term18784 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term18819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18738 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term18474, term18474.getClass(), "parent", null);
        setField(term18784, term18784.getClass(), "last", null);
        setField(term18784, term18784.getClass(), "next", term18819);
        setField(term18474, term18474.getClass(), "first", term18784);
        setIntField(term18474, term18474.getClass(), "type", 0);
        setField(term18474, term18474.getClass(), "propListHead", term18738);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term18474;
        args[1] = term18784;
        callMethod(klass, "inlineReturnValue", argTypes, term18382, args);
    }

};


