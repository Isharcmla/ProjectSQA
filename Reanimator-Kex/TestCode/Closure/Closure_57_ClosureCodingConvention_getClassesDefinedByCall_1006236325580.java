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
import java.lang.Object;

public class ClosureCodingConvention_getClassesDefinedByCall_1006236325580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195716;
     Object term195802;

    public ClosureCodingConvention_getClassesDefinedByCall_1006236325580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195716 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term195802 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term195888 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term195980 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term196104 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term195888, term195888.getClass(), "type", 33);
        setField(term195980, term195980.getClass(), "str", "mixin");
        setField(term195888, term195888.getClass(), "last", term195980);
        setField(term195888, term195888.getClass(), "next", term196104);
        setField(term195802, term195802.getClass(), "first", term195888);
        setField(term195802, term195802.getClass(), "last", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term195802;
        try {
            callMethod(klass, "getClassesDefinedByCall", argTypes, term195716, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


