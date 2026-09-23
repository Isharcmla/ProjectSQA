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

public class NodeUtil_isName_1555326690499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38617;
     Object term76365;

    public NodeUtil_isName_1555326690499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38617, term38617.getClass(), "type", 38);
        term76365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76365, term76365.getClass(), "type", 38);
        setField(term76365, term76365.getClass(), "next", null);
        setField(term76365, term76365.getClass(), "first", null);
        setField(term76365, term76365.getClass(), "last", null);
        setField(term76365, term76365.getClass(), "propListHead", null);
        setIntField(term76365, term76365.getClass(), "sourcePosition", 0);
        setField(term76365, term76365.getClass(), "jsType", null);
        setField(term76365, term76365.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term38617;
        Object retValue = callMethod(klass, "isName", argTypes, null, args);
        assertTrue(recursiveEquals(term38617, term76365));
        assertTrue(recursiveEquals(retValue, true));
    }

};


