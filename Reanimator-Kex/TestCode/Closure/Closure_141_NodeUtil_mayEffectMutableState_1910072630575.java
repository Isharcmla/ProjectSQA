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

public class NodeUtil_mayEffectMutableState_1910072630575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49508;
     Object term49517;

    public NodeUtil_mayEffectMutableState_1910072630575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49508, term49508.getClass(), "type", 44);
        term49517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49517, term49517.getClass(), "type", 44);
        setField(term49517, term49517.getClass(), "next", null);
        setField(term49517, term49517.getClass(), "first", null);
        setField(term49517, term49517.getClass(), "last", null);
        setField(term49517, term49517.getClass(), "propListHead", null);
        setIntField(term49517, term49517.getClass(), "sourcePosition", 0);
        setField(term49517, term49517.getClass(), "jsType", null);
        setField(term49517, term49517.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term49508;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term49508, term49517));
    }

};


