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

public class CheckAccessControls_checkPropertyDeprecation_1489443176151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41126;
     Object term41455;

    public CheckAccessControls_checkPropertyDeprecation_1489443176151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41126 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term41455 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term41498 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term41555 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setIntField(term41455, term41455.getClass(), "type", -31);
        setField(term41498, term41498.getClass(), "jsType", term41555);
        setField(term41455, term41455.getClass(), "first", term41498);
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
        args[1] = term41455;
        args[2] = term41455;
        try {
            callMethod(klass, "checkPropertyDeprecation", argTypes, term41126, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


