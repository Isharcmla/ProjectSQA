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
import static com.google.javascript.jscomp.EqualityUtils.*;

public class ReferenceCollectingCallback_visit_872273174229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54753;
     Object term54845;
     Object term54937;
     Object term55604;
     Object term55605;
     Object term55606;

    public ReferenceCollectingCallback_visit_872273174229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54753 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term54845 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term54845, term54845.getClass(), "type", -39);
        term54937 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term55604 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term55604, term55604.getClass(), "referenceMap", null);
        setField(term55604, term55604.getClass(), "blockStack", null);
        setField(term55604, term55604.getClass(), "behavior", null);
        setField(term55604, term55604.getClass(), "compiler", null);
        setField(term55604, term55604.getClass(), "varFilter", null);
        term55605 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term55605, term55605.getClass(), "number", 0.0);
        setIntField(term55605, term55605.getClass(), "type", -39);
        setField(term55605, term55605.getClass(), "next", null);
        setField(term55605, term55605.getClass(), "first", null);
        setField(term55605, term55605.getClass(), "last", null);
        setField(term55605, term55605.getClass(), "propListHead", null);
        setIntField(term55605, term55605.getClass(), "sourcePosition", 0);
        setField(term55605, term55605.getClass(), "jsType", null);
        setField(term55605, term55605.getClass(), "parent", null);
        term55606 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term55606, term55606.getClass(), "str", null);
        setIntField(term55606, term55606.getClass(), "type", 0);
        setField(term55606, term55606.getClass(), "next", null);
        setField(term55606, term55606.getClass(), "first", null);
        setField(term55606, term55606.getClass(), "last", null);
        setField(term55606, term55606.getClass(), "propListHead", null);
        setIntField(term55606, term55606.getClass(), "sourcePosition", 0);
        setField(term55606, term55606.getClass(), "jsType", null);
        setField(term55606, term55606.getClass(), "parent", null);
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
        args[1] = term54845;
        args[2] = term54937;
        callMethod(klass, "visit", argTypes, term54753, args);
        assertTrue(recursiveEquals(term54753, term55604));
        assertTrue(recursiveEquals(term54845, term55606));
        assertTrue(recursiveEquals(term54937, null));
    }

};


