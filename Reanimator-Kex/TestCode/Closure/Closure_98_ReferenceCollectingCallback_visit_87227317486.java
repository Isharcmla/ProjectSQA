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

public class ReferenceCollectingCallback_visit_87227317486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17751;
     Object term17837;
     Object term17923;

    public ReferenceCollectingCallback_visit_87227317486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17751 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term17837 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term17837, term17837.getClass(), "type", 77);
        term17923 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term17923, term17923.getClass(), "type", 77);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term17837;
        args[2] = term17923;
        try {
            callMethod(klass, "visit", argTypes, term17751, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


