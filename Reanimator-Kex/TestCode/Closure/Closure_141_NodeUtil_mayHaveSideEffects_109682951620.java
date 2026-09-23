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

public class NodeUtil_mayHaveSideEffects_109682951620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55251;
     Object term57682;

    public NodeUtil_mayHaveSideEffects_109682951620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term55251, term55251.getClass(), "type", 53);
        term57682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57682, term57682.getClass(), "type", 53);
        setField(term57682, term57682.getClass(), "next", null);
        setField(term57682, term57682.getClass(), "first", null);
        setField(term57682, term57682.getClass(), "last", null);
        setField(term57682, term57682.getClass(), "propListHead", null);
        setIntField(term57682, term57682.getClass(), "sourcePosition", 0);
        setField(term57682, term57682.getClass(), "jsType", null);
        setField(term57682, term57682.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term55251;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term55251, term57682));
    }

};


