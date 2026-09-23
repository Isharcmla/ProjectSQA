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

public class NodeUtil_mayEffectMutableState_1245479864339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30382;
     Object term30400;

    public NodeUtil_mayEffectMutableState_1245479864339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30382, term30382.getClass(), "type", 44);
        term30400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30400, term30400.getClass(), "type", 44);
        setField(term30400, term30400.getClass(), "next", null);
        setField(term30400, term30400.getClass(), "first", null);
        setField(term30400, term30400.getClass(), "last", null);
        setField(term30400, term30400.getClass(), "propListHead", null);
        setIntField(term30400, term30400.getClass(), "sourcePosition", 0);
        setField(term30400, term30400.getClass(), "jsType", null);
        setField(term30400, term30400.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term30382;
        args[1] = null;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term30382, term30400));
    }

};


