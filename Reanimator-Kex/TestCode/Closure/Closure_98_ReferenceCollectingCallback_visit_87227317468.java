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

public class ReferenceCollectingCallback_visit_87227317468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13271;
     Object term13341;
     Object term13411;

    public ReferenceCollectingCallback_visit_87227317468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13271 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term13341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13341, term13341.getClass(), "type", 98);
        term13411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13411, term13411.getClass(), "type", 98);
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
        args[1] = term13341;
        args[2] = term13411;
        try {
            callMethod(klass, "visit", argTypes, term13271, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


