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

public class CheckAccessControls_checkPropertyDeprecation_1489443176289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88591;
     Object term88677;
     Object term89049;

    public CheckAccessControls_checkPropertyDeprecation_1489443176289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88591 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term88677 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term88763 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term88877 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term88963 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term88763, term88763.getClass(), "jsType", term88877);
        setField(term88677, term88677.getClass(), "first", term88763);
        setField(term88677, term88677.getClass(), "last", term88963);
        term89049 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term89049, term89049.getClass(), "type", -31);
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
        args[1] = term88677;
        args[2] = term89049;
        try {
            callMethod(klass, "checkPropertyDeprecation", argTypes, term88591, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


