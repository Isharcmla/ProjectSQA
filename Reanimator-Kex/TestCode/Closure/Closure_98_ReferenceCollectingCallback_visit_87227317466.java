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

public class ReferenceCollectingCallback_visit_87227317466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12746;
     Object term12838;
     Object term12930;

    public ReferenceCollectingCallback_visit_87227317466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12746 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term12838 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term12838, term12838.getClass(), "type", 113);
        term12930 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term12930, term12930.getClass(), "type", 113);
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
        args[1] = term12838;
        args[2] = term12930;
        try {
            callMethod(klass, "visit", argTypes, term12746, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


