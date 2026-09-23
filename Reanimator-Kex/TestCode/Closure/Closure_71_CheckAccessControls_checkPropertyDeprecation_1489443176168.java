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

public class CheckAccessControls_checkPropertyDeprecation_1489443176168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45678;
     Object term45764;
     Object term46028;

    public CheckAccessControls_checkPropertyDeprecation_1489443176168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45678 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term45764 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term45850 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term45942 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term45850, term45850.getClass(), "jsType", null);
        setField(term45764, term45764.getClass(), "first", term45850);
        setField(term45764, term45764.getClass(), "last", term45942);
        term46028 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term46028, term46028.getClass(), "type", -31);
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
        args[1] = term45764;
        args[2] = term46028;
        try {
            callMethod(klass, "checkPropertyDeprecation", argTypes, term45678, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


