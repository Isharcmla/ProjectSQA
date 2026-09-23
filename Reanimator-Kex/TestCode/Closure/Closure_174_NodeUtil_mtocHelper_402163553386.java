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
import java.lang.Object;

public class NodeUtil_mtocHelper_402163553386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40473;
     Object term40823;

    public NodeUtil_mtocHelper_402163553386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40473, term40473.getClass(), "type", 1342439466);
        setIntField(term40543, term40543.getClass(), "type", -1342439467);
        setIntField(term40613, term40613.getClass(), "type", -106);
        setField(term40613, term40613.getClass(), "first", null);
        setField(term40613, term40613.getClass(), "next", null);
        setField(term40543, term40543.getClass(), "first", term40613);
        setIntField(term40683, term40683.getClass(), "type", 1342439466);
        setField(term40683, term40683.getClass(), "first", term40753);
        setField(term40543, term40543.getClass(), "next", term40683);
        setField(term40473, term40473.getClass(), "first", term40543);
        term40823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term40963, term40963.getClass(), "first", term41033);
        setField(term40963, term40963.getClass(), "next", term41103);
        setField(term40893, term40893.getClass(), "first", term40963);
        setField(term41173, term41173.getClass(), "first", term41243);
        setField(term40893, term40893.getClass(), "next", term41173);
        setField(term40823, term40823.getClass(), "first", term40893);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term40473;
        args[2] = term40823;
        callMethod(klass, "mtocHelper", argTypes, null, args);
    }

};


