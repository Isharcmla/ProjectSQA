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

public class NodeUtil_checkForStateChangeHelper_856076007395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48720;
     Object term48743;

    public NodeUtil_checkForStateChangeHelper_856076007395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48720, term48720.getClass(), "type", 138);
        term48743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48743, term48743.getClass(), "type", 138);
        setField(term48743, term48743.getClass(), "next", null);
        setField(term48743, term48743.getClass(), "first", null);
        setField(term48743, term48743.getClass(), "last", null);
        setField(term48743, term48743.getClass(), "propListHead", null);
        setIntField(term48743, term48743.getClass(), "sourcePosition", 0);
        setField(term48743, term48743.getClass(), "jsType", null);
        setField(term48743, term48743.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[3];
        args[0] = term48720;
        args[1] = false;
        args[2] = null;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term48720, term48743));
        assertTrue(recursiveEquals(retValue, true));
    }

};


