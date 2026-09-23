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

public class TypeCheck_visit_859524784640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163922;
     Object term164186;

    public TypeCheck_visit_859524784640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163922 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term164012 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term164116 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term163922, term163922.getClass(), "validator", term164012);
        setField(term163922, term163922.getClass(), "typeRegistry", term164116);
        term164186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term164256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term164186, term164186.getClass(), "type", 103);
        setField(term164256, term164256.getClass(), "jsType", null);
        setField(term164186, term164186.getClass(), "first", term164256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term164186;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term163922, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


