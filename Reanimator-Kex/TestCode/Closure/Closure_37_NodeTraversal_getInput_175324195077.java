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

public class NodeTraversal_getInput_175324195077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4964;

    public NodeTraversal_getInput_175324195077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4964 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term4964, term4964.getClass(), "compiler", null);
        setField(term4964, term4964.getClass(), "callback", null);
        setField(term4964, term4964.getClass(), "curNode", null);
        setField(term4964, term4964.getClass(), "scopes", null);
        setField(term4964, term4964.getClass(), "scopeRoots", null);
        setField(term4964, term4964.getClass(), "cfgs", null);
        setField(term4964, term4964.getClass(), "sourceName", null);
        setField(term4964, term4964.getClass(), "inputId", null);
        setField(term4964, term4964.getClass(), "scopeCreator", null);
        setField(term4964, term4964.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getInput", argTypes, term4964, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


