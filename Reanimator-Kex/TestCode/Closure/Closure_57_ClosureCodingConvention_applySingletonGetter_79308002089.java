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
import java.util.HashMap;

public class ClosureCodingConvention_applySingletonGetter_79308002089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48974;
     Object term49074;

    public ClosureCodingConvention_applySingletonGetter_79308002089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48974 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        HashMap term49122 = new HashMap();
        term49074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term49074, term49074.getClass(), "source", null);
        setField(term49074, term49074.getClass(), "properties", term49122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[3];
        args[0] = term49074;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "applySingletonGetter", argTypes, term48974, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


