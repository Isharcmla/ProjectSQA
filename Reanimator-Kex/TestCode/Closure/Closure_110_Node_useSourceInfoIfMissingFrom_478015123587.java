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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Node_useSourceInfoIfMissingFrom_478015123587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50571;

    public Node_useSourceInfoIfMissingFrom_478015123587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50673 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term50571, term50571.getClass(), "propListHead", term50673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "useSourceInfoIfMissingFrom", argTypes, term50571, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


