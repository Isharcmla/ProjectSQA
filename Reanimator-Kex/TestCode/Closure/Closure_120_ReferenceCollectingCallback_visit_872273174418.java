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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Collection;
import java.util.ArrayDeque;

public class ReferenceCollectingCallback_visit_872273174418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101194;
     Object term101284;
     Object term101482;

    public ReferenceCollectingCallback_visit_872273174418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101194 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayList term101390 = new ArrayList();
        ((ArrayList) term101390).add((Object)null);
        ((ArrayList) term101390).add((Object)null);
        ArrayDeque term101338 = new ArrayDeque((Collection<? extends Object>) term101390);
        term101284 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term101284, term101284.getClass(), "scopes", term101338);
        term101482 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term101482, term101482.getClass(), "type", 38);
        setField(term101482, term101482.getClass(), "str", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term101284;
        args[1] = term101482;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term101194, args);
    }

};


