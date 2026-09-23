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

public class NodeUtil_mayEffectMutableState_1910072630216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17757;
     Object term17775;

    public NodeUtil_mayEffectMutableState_1910072630216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17757, term17757.getClass(), "type", 65);
        term17775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17775, term17775.getClass(), "type", 65);
        setField(term17775, term17775.getClass(), "next", null);
        setField(term17775, term17775.getClass(), "first", null);
        setField(term17775, term17775.getClass(), "last", null);
        setField(term17775, term17775.getClass(), "propListHead", null);
        setIntField(term17775, term17775.getClass(), "sourcePosition", 0);
        setField(term17775, term17775.getClass(), "jsType", null);
        setField(term17775, term17775.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term17757;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term17757, term17775));
    }

};


