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

public class NodeUtil_mayEffectMutableState_1910072630255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20941;
     Object term20958;

    public NodeUtil_mayEffectMutableState_1910072630255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20941, term20941.getClass(), "type", 98);
        term20958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20958, term20958.getClass(), "type", 98);
        setField(term20958, term20958.getClass(), "next", null);
        setField(term20958, term20958.getClass(), "first", null);
        setField(term20958, term20958.getClass(), "last", null);
        setField(term20958, term20958.getClass(), "propListHead", null);
        setIntField(term20958, term20958.getClass(), "sourcePosition", 0);
        setField(term20958, term20958.getClass(), "jsType", null);
        setField(term20958, term20958.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20941;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term20941, term20958));
    }

};


