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

public class FunctionToBlockMutator_replaceReturns_124525402569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21853;

    public FunctionToBlockMutator_replaceReturns_124525402569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21853, term21853.getClass(), "type", 0);
        setField(term21853, term21853.getClass(), "parent", null);
        setIntField(term21923, term21923.getClass(), "type", 0);
        setField(term21923, term21923.getClass(), "parent", null);
        setField(term21923, term21923.getClass(), "first", null);
        setIntField(term21993, term21993.getClass(), "type", 0);
        setField(term21993, term21993.getClass(), "parent", null);
        setField(term21993, term21993.getClass(), "first", null);
        setField(term21993, term21993.getClass(), "next", term21923);
        setField(term21923, term21923.getClass(), "next", term21993);
        setField(term21853, term21853.getClass(), "first", term21923);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term21853;
        args[1] = null;
        args[2] = "";
        args[3] = false;
        callMethod(klass, "replaceReturns", argTypes, null, args);
    }

};


