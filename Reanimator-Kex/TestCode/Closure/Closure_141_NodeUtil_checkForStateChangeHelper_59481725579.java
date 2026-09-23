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

public class NodeUtil_checkForStateChangeHelper_59481725579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49707;
     Object term49721;

    public NodeUtil_checkForStateChangeHelper_59481725579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49707, term49707.getClass(), "type", 84);
        term49721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49721, term49721.getClass(), "type", 84);
        setField(term49721, term49721.getClass(), "next", null);
        setField(term49721, term49721.getClass(), "first", null);
        setField(term49721, term49721.getClass(), "last", null);
        setField(term49721, term49721.getClass(), "propListHead", null);
        setIntField(term49721, term49721.getClass(), "sourcePosition", 0);
        setField(term49721, term49721.getClass(), "jsType", null);
        setField(term49721, term49721.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term49707;
        args[1] = false;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term49707, term49721));
        assertTrue(recursiveEquals(retValue, true));
    }

};


