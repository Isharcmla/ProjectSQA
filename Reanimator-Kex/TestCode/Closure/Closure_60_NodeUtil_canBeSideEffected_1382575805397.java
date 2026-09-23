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

public class NodeUtil_canBeSideEffected_1382575805397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46693;

    public NodeUtil_canBeSideEffected_1382575805397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46693, term46693.getClass(), "type", 0);
        setIntField(term46763, term46763.getClass(), "type", 38);
        setField(term46693, term46693.getClass(), "first", term46763);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term46693;
        try {
            callMethod(klass, "canBeSideEffected", argTypes, null, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


