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

public class NodeUtil_mayEffectMutableState_1245479864473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61640;
     Object term61673;

    public NodeUtil_mayEffectMutableState_1245479864473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61640 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term61640, term61640.getClass(), "type", 146);
        term61673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term61673, term61673.getClass(), "type", 146);
        setField(term61673, term61673.getClass(), "next", null);
        setField(term61673, term61673.getClass(), "first", null);
        setField(term61673, term61673.getClass(), "last", null);
        setField(term61673, term61673.getClass(), "propListHead", null);
        setIntField(term61673, term61673.getClass(), "sourcePosition", 0);
        setField(term61673, term61673.getClass(), "jsType", null);
        setField(term61673, term61673.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term61640;
        args[1] = null;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term61640, term61673));
    }

};


