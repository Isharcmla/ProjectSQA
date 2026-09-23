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

public class CheckAccessControls_checkPropertyDeprecation_1489443176368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112482;
     Object term112568;
     Object term112816;

    public CheckAccessControls_checkPropertyDeprecation_1489443176368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112482 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term112568 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term112638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112730 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term112638, term112638.getClass(), "jsType", null);
        setField(term112568, term112568.getClass(), "first", term112638);
        setField(term112568, term112568.getClass(), "last", term112730);
        term112816 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term112816, term112816.getClass(), "type", -31);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term112568;
        args[2] = term112816;
        try {
            callMethod(klass, "checkPropertyDeprecation", argTypes, term112482, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


