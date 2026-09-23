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

public class ReferenceCollectingCallback_visit_87227317485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17401;
     Object term17493;
     Object term17585;

    public ReferenceCollectingCallback_visit_87227317485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17401 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term17493 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term17493, term17493.getClass(), "type", 77);
        term17585 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term17585, term17585.getClass(), "type", 77);
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
        args[1] = term17493;
        args[2] = term17585;
        try {
            callMethod(klass, "visit", argTypes, term17401, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


