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

public class FunctionType_getMaxArguments_1586561922146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70342;

    public FunctionType_getMaxArguments_1586561922146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70342 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term70436 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term70506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term70506, term70506.getClass(), "last", term70506);
        setField(term70506, term70506.getClass(), "propListHead", null);
        setField(term70506, term70506.getClass(), "first", term70506);
        setField(term70506, term70506.getClass(), "next", term70506);
        setField(term70436, term70436.getClass(), "parameters", term70506);
        setField(term70342, term70342.getClass(), "call", term70436);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxArguments", argTypes, term70342, args);
    }

};


