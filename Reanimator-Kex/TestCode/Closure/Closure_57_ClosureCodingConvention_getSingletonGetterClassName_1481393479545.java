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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180610;
     Object term180696;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180610 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term180696 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term180788 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term180788, term180788.getClass(), "type", 33);
        setField(term180696, term180696.getClass(), "first", term180788);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term180696;
        try {
            callMethod(klass, "getSingletonGetterClassName", argTypes, term180610, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


