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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1171282;
     Object term1171368;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1171282 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term1171368 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term1171454 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term1171368, term1171368.getClass(), "type", 37);
        setIntField(term1171454, term1171454.getClass(), "type", 35);
        setField(term1171368, term1171368.getClass(), "first", term1171454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1171368;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term1171282, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


