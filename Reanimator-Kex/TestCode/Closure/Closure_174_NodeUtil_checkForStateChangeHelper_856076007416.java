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

public class NodeUtil_checkForStateChangeHelper_856076007416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35802;
     Object term57223;

    public NodeUtil_checkForStateChangeHelper_856076007416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35802, term35802.getClass(), "type", 38);
        term57223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57223, term57223.getClass(), "type", 38);
        setField(term57223, term57223.getClass(), "next", null);
        setField(term57223, term57223.getClass(), "first", null);
        setField(term57223, term57223.getClass(), "last", null);
        setField(term57223, term57223.getClass(), "propListHead", null);
        setIntField(term57223, term57223.getClass(), "sourcePosition", 0);
        setField(term57223, term57223.getClass(), "jsType", null);
        setField(term57223, term57223.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[3];
        args[0] = term35802;
        args[1] = false;
        args[2] = null;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term35802, term57223));
        assertTrue(recursiveEquals(retValue, false));
    }

};


