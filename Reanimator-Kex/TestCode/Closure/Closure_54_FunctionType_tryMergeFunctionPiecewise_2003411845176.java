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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionType_tryMergeFunctionPiecewise_2003411845176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87024;
     Object term87358;

    public FunctionType_tryMergeFunctionPiecewise_2003411845176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87024 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term87118 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term87188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term87188, term87188.getClass(), "first", term87258);
        setField(term87118, term87118.getClass(), "parameters", term87188);
        setField(term87024, term87024.getClass(), "call", term87118);
        term87358 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term87452 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term87522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term87522, term87522.getClass(), "first", null);
        setField(term87452, term87452.getClass(), "parameters", term87522);
        setField(term87358, term87358.getClass(), "call", term87452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term87358;
        args[1] = false;
        callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term87024, args);
    }

};


