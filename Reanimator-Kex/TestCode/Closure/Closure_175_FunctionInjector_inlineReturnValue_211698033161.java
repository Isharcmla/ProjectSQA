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

public class FunctionInjector_inlineReturnValue_211698033161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13306;
     Object term13376;
     Object term13608;

    public FunctionInjector_inlineReturnValue_211698033161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13306 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term13306, term13306.getClass(), "safeNameIdSupplier", null);
        term13376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term13376, term13376.getClass(), "parent", null);
        setField(term13446, term13446.getClass(), "next", term13516);
        setField(term13376, term13376.getClass(), "first", term13446);
        setIntField(term13376, term13376.getClass(), "type", 0);
        setField(term13376, term13376.getClass(), "propListHead", null);
        setIntField(term13376, term13376.getClass(), "sourcePosition", 536870912);
        term13608 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term13608, term13608.getClass(), "last", null);
        setIntField(term13608, term13608.getClass(), "type", 105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term13376;
        args[1] = term13608;
        callMethod(klass, "inlineReturnValue", argTypes, term13306, args);
    }

};


