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
import java.lang.Object;

public class NodeUtil_mayEffectMutableState_1910072630690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68327;

    public NodeUtil_mayEffectMutableState_1910072630690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term68327, term68327.getClass(), "type", 110);
        setIntField(term68397, term68397.getClass(), "type", 48);
        setField(term68327, term68327.getClass(), "first", term68397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term68327;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
    }

};


