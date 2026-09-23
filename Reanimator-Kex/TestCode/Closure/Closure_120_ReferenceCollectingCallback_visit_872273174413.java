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

public class ReferenceCollectingCallback_visit_872273174413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97749;
     Object term97839;
     Object term98091;

    public ReferenceCollectingCallback_visit_872273174413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97749 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayList term97945 = new ArrayList();
        ArrayDeque term97893 = new ArrayDeque((Collection<? extends Object>) term97945);
        ArrayDeque term97999 = new ArrayDeque();
        term97839 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term97839, term97839.getClass(), "scopes", term97893);
        setField(term97839, term97839.getClass(), "scopeRoots", term97999);
        term98091 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term98091, term98091.getClass(), "type", 38);
        setField(term98091, term98091.getClass(), "str", "                                                  ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term97839;
        args[1] = term98091;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term97749, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


