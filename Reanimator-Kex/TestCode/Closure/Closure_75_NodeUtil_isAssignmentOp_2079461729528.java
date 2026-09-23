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

public class NodeUtil_isAssignmentOp_2079461729528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40894;
     Object term79105;

    public NodeUtil_isAssignmentOp_2079461729528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40894, term40894.getClass(), "type", 91);
        term79105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term79105, term79105.getClass(), "type", 91);
        setField(term79105, term79105.getClass(), "next", null);
        setField(term79105, term79105.getClass(), "first", null);
        setField(term79105, term79105.getClass(), "last", null);
        setField(term79105, term79105.getClass(), "propListHead", null);
        setIntField(term79105, term79105.getClass(), "sourcePosition", 0);
        setField(term79105, term79105.getClass(), "jsType", null);
        setField(term79105, term79105.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term40894;
        Object retValue = callMethod(klass, "isAssignmentOp", argTypes, null, args);
        assertTrue(recursiveEquals(term40894, term79105));
        assertTrue(recursiveEquals(retValue, true));
    }

};


