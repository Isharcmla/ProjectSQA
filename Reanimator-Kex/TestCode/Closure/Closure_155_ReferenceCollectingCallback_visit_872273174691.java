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
import java.util.ArrayList;
import java.lang.Object;
import java.util.Collection;
import java.util.ArrayDeque;

public class ReferenceCollectingCallback_visit_872273174691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181143;
     Object term181233;
     Object term181485;

    public ReferenceCollectingCallback_visit_872273174691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181143 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayList term181339 = new ArrayList();
        ArrayDeque term181287 = new ArrayDeque((Collection<? extends Object>) term181339);
        ArrayDeque term181393 = new ArrayDeque();
        term181233 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term181233, term181233.getClass(), "scopes", term181287);
        setField(term181233, term181233.getClass(), "scopeRoots", term181393);
        term181485 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term181485, term181485.getClass(), "type", 38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term181233;
        args[1] = term181485;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term181143, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


