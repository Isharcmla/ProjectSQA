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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionType_tryMergeFunctionPiecewise_2003411845385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284008;
     Object term284506;

    public FunctionType_tryMergeFunctionPiecewise_2003411845385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term284008 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term284102 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term284172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term284705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term284740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term284406 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term284705, term284705.getClass(), "jsType", null);
        setField(term284740, term284740.getClass(), "jsType", null);
        setField(term284740, term284740.getClass(), "next", null);
        setField(term284705, term284705.getClass(), "next", term284740);
        setField(term284172, term284172.getClass(), "first", term284705);
        setField(term284102, term284102.getClass(), "parameters", term284172);
        setField(term284102, term284102.getClass(), "returnType", term284406);
        setField(term284008, term284008.getClass(), "call", term284102);
        term284506 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term284600 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term284670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term284838 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term284670, term284670.getClass(), "first", term284705);
        setField(term284600, term284600.getClass(), "parameters", term284670);
        setField(term284600, term284600.getClass(), "returnType", term284838);
        setField(term284506, term284506.getClass(), "call", term284600);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term284506;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term284008, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


