package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Node_srcref_1529783239778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84926;
     Object term85200;

    public Node_srcref_1529783239778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85028 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term85130 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term85028, term85028.getClass(), "propType", -41);
        setField(term85028, term85028.getClass(), "next", term85130);
        setField(term84926, term84926.getClass(), "propListHead", term85028);
        term85200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term85200, term85200.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term85200;
        callMethod(klass, "srcref", argTypes, term84926, args);
    }

};


