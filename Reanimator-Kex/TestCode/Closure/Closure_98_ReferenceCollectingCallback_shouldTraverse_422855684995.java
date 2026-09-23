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

public class ReferenceCollectingCallback_shouldTraverse_422855684995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270828;
     Object term270920;
     Object term271012;

    public ReferenceCollectingCallback_shouldTraverse_422855684995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270828 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term270920 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term271012 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term271104 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term271012, term271012.getClass(), "type", 98);
        setField(term271012, term271012.getClass(), "first", term271104);
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
        args[1] = term270920;
        args[2] = term271012;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term270828, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


