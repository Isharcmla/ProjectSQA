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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161223;
     Object term161315;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161223 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term161315 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term161401 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term161401, term161401.getClass(), "type", 38);
        setField(term161315, term161315.getClass(), "first", term161401);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term161315;
        try {
            callMethod(klass, "identifyTypeDeclarationCall", argTypes, term161223, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


