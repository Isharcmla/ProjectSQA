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

public class NodeUtil_isNameReferenced_1680890329497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41624;
     Object term41732;
     Object term41756;
     Object term41757;

    public NodeUtil_isNameReferenced_1680890329497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41624, term41624.getClass(), "type", -39);
        term41732 = newInstance(Class.forName("com.google.javascript.jscomp.NodeUtil$MatchNameNode"));
        term41756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41756, term41756.getClass(), "type", -39);
        setField(term41756, term41756.getClass(), "next", null);
        setField(term41756, term41756.getClass(), "first", null);
        setField(term41756, term41756.getClass(), "last", null);
        setField(term41756, term41756.getClass(), "propListHead", null);
        setIntField(term41756, term41756.getClass(), "sourcePosition", 0);
        setField(term41756, term41756.getClass(), "jsType", null);
        setField(term41756, term41756.getClass(), "parent", null);
        term41757 = newInstance(Class.forName("com.google.javascript.jscomp.NodeUtil$MatchNameNode"));
        setField(term41757, term41757.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term41624;
        args[1] = null;
        args[2] = term41732;
        callMethod(klass, "isNameReferenced", argTypes, null, args);
        assertTrue(recursiveEquals(term41624, null));
        assertTrue(recursiveEquals(term41732, term41757));
    }

};


