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

public class CheckAccessControls_checkPropertyDeprecation_1489443176406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204422;
     Object term204508;
     Object term204770;

    public CheckAccessControls_checkPropertyDeprecation_1489443176406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204422 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term204508 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term204594 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term204684 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term204594, term204594.getClass(), "jsType", null);
        setField(term204508, term204508.getClass(), "first", term204594);
        setField(term204508, term204508.getClass(), "last", term204684);
        term204770 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term204770, term204770.getClass(), "type", -31);
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
        args[1] = term204508;
        args[2] = term204770;
        try {
            callMethod(klass, "checkPropertyDeprecation", argTypes, term204422, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


