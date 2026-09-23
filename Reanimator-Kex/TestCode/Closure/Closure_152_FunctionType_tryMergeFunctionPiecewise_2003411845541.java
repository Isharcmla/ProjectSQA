package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionType_tryMergeFunctionPiecewise_2003411845541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term501312;
     Object term501576;

    public FunctionType_tryMergeFunctionPiecewise_2003411845541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term501312 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term501406 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term501476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term501476, term501476.getClass(), "first", null);
        setField(term501406, term501406.getClass(), "parameters", term501476);
        setField(term501312, term501312.getClass(), "call", term501406);
        term501576 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term501670 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term501740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term501740, term501740.getClass(), "first", null);
        setField(term501670, term501670.getClass(), "parameters", term501740);
        setField(term501576, term501576.getClass(), "call", term501670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term501576;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term501312, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


