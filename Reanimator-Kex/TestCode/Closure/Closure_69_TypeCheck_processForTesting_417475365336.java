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

public class TypeCheck_processForTesting_417475365336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96376;
     Object term96446;

    public TypeCheck_processForTesting_417475365336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96376 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term96376, term96376.getClass(), "scopeCreator", null);
        setField(term96376, term96376.getClass(), "topScope", null);
        term96446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term96446, term96446.getClass(), "parent", term96446);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term96446;
        try {
            callMethod(klass, "processForTesting", argTypes, term96376, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


