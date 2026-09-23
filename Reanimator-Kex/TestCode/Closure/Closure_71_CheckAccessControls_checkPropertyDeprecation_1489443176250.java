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

public class CheckAccessControls_checkPropertyDeprecation_1489443176250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72937;
     Object term73023;
     Object term73373;

    public CheckAccessControls_checkPropertyDeprecation_1489443176250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72937 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term73023 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term73109 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term73217 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term73287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term73109, term73109.getClass(), "jsType", term73217);
        setField(term73023, term73023.getClass(), "first", term73109);
        setField(term73023, term73023.getClass(), "last", term73287);
        term73373 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term73373, term73373.getClass(), "type", -31);
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
        args[1] = term73023;
        args[2] = term73373;
        try {
            callMethod(klass, "checkPropertyDeprecation", argTypes, term72937, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


