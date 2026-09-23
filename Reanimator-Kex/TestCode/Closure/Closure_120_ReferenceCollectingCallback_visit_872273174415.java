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
import java.util.ArrayDeque;

public class ReferenceCollectingCallback_visit_872273174415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98910;
     Object term99000;
     Object term99146;

    public ReferenceCollectingCallback_visit_872273174415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98910 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayDeque term99054 = new ArrayDeque();
        term99000 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term99000, term99000.getClass(), "scopes", term99054);
        term99146 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term99146, term99146.getClass(), "type", 38);
        setField(term99146, term99146.getClass(), "str", "arguments");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term99000;
        args[1] = term99146;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term98910, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


