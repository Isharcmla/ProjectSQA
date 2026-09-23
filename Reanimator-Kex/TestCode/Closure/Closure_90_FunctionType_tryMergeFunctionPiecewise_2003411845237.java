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

public class FunctionType_tryMergeFunctionPiecewise_2003411845237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132594;
     Object term132858;

    public FunctionType_tryMergeFunctionPiecewise_2003411845237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132594 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term132688 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term132758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term132758, term132758.getClass(), "first", null);
        setField(term132688, term132688.getClass(), "parameters", term132758);
        setField(term132594, term132594.getClass(), "call", term132688);
        term132858 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term132952 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term133022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term133022, term133022.getClass(), "first", null);
        setField(term132952, term132952.getClass(), "parameters", term133022);
        setField(term132858, term132858.getClass(), "call", term132952);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term132858;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term132594, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


