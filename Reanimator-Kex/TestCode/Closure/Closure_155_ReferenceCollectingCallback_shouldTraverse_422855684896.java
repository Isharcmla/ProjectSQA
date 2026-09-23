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

public class ReferenceCollectingCallback_shouldTraverse_422855684896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230546;
     Object term230638;
     Object term230730;

    public ReferenceCollectingCallback_shouldTraverse_422855684896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230546 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term230638 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term230730 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term230822 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term230730, term230730.getClass(), "type", 108);
        setField(term230730, term230730.getClass(), "first", term230822);
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
        args[1] = term230638;
        args[2] = term230730;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term230546, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


