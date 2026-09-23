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

public class CheckAccessControls_checkPropertyDeprecation_1489443176172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46974;
     Object term47060;
     Object term47340;

    public CheckAccessControls_checkPropertyDeprecation_1489443176172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46974 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term47060 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term47146 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term47254 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term47146, term47146.getClass(), "jsType", term47254);
        setField(term47060, term47060.getClass(), "first", term47146);
        term47340 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term47340, term47340.getClass(), "type", -31);
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
        args[1] = term47060;
        args[2] = term47340;
        try {
            callMethod(klass, "checkPropertyDeprecation", argTypes, term46974, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


