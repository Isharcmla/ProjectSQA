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

public class NodeUtil_isValidDefineValue_788085673556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43698;
     Object term82605;

    public NodeUtil_isValidDefineValue_788085673556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43698, term43698.getClass(), "type", 43);
        term82605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term82605, term82605.getClass(), "type", 43);
        setField(term82605, term82605.getClass(), "next", null);
        setField(term82605, term82605.getClass(), "first", null);
        setField(term82605, term82605.getClass(), "last", null);
        setField(term82605, term82605.getClass(), "propListHead", null);
        setIntField(term82605, term82605.getClass(), "sourcePosition", 0);
        setField(term82605, term82605.getClass(), "jsType", null);
        setField(term82605, term82605.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term43698;
        args[1] = null;
        Object retValue = callMethod(klass, "isValidDefineValue", argTypes, null, args);
        assertTrue(recursiveEquals(term43698, term82605));
        assertTrue(recursiveEquals(retValue, true));
    }

};


