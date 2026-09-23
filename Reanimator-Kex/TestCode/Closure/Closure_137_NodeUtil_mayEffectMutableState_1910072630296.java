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

public class NodeUtil_mayEffectMutableState_1910072630296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23268;
     Object term23363;

    public NodeUtil_mayEffectMutableState_1910072630296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23268, term23268.getClass(), "type", 106);
        term23363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23363, term23363.getClass(), "type", 106);
        setField(term23363, term23363.getClass(), "next", null);
        setField(term23363, term23363.getClass(), "first", null);
        setField(term23363, term23363.getClass(), "last", null);
        setField(term23363, term23363.getClass(), "propListHead", null);
        setIntField(term23363, term23363.getClass(), "sourcePosition", 0);
        setField(term23363, term23363.getClass(), "jsType", null);
        setField(term23363, term23363.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term23268;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term23268, term23363));
    }

};


