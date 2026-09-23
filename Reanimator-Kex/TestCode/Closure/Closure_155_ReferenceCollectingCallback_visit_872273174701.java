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
import java.util.NoSuchElementException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayDeque;
import java.lang.Object;

public class ReferenceCollectingCallback_visit_872273174701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184838;
     Object term184978;
     Object term185070;

    public ReferenceCollectingCallback_visit_872273174701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term184892 = new ArrayDeque();
        term184838 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term184838, term184838.getClass(), "blockStack", term184892);
        term184978 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term184978, term184978.getClass(), "type", 100);
        term185070 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term185140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term185070, term185070.getClass(), "type", 100);
        setField(term185070, term185070.getClass(), "first", term185140);
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
        args[1] = term184978;
        args[2] = term185070;
        try {
            callMethod(klass, "visit", argTypes, term184838, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


