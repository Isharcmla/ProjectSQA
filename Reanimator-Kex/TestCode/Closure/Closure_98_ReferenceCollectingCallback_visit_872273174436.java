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

public class ReferenceCollectingCallback_visit_872273174436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115976;
     Object term116122;
     Object term116214;

    public ReferenceCollectingCallback_visit_872273174436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term116030 = new ArrayDeque();
        term115976 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term115976, term115976.getClass(), "blockStack", term116030);
        term116122 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term116122, term116122.getClass(), "type", 108);
        term116214 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term116214, term116214.getClass(), "type", 108);
        setField(term116214, term116214.getClass(), "first", null);
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
        args[1] = term116122;
        args[2] = term116214;
        try {
            callMethod(klass, "visit", argTypes, term115976, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


