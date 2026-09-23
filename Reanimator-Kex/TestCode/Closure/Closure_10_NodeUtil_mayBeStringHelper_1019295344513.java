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

public class NodeUtil_mayBeStringHelper_1019295344513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77672;
     Object term77717;

    public NodeUtil_mayBeStringHelper_1019295344513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term77672, term77672.getClass(), "type", 36);
        term77717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term77717, term77717.getClass(), "type", 36);
        setField(term77717, term77717.getClass(), "next", null);
        setField(term77717, term77717.getClass(), "first", null);
        setField(term77717, term77717.getClass(), "last", null);
        setField(term77717, term77717.getClass(), "propListHead", null);
        setIntField(term77717, term77717.getClass(), "sourcePosition", 0);
        setField(term77717, term77717.getClass(), "jsType", null);
        setField(term77717, term77717.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term77672;
        Object retValue = callMethod(klass, "mayBeStringHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term77672, term77717));
        assertTrue(recursiveEquals(retValue, true));
    }

};


