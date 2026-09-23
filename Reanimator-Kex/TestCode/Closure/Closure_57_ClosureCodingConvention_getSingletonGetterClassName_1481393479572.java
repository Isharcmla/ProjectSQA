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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184974;
     Object term185066;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184974 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term185066 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term185152 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term185152, term185152.getClass(), "type", 33);
        setField(term185066, term185066.getClass(), "first", term185152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term185066;
        try {
            callMethod(klass, "getSingletonGetterClassName", argTypes, term184974, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


